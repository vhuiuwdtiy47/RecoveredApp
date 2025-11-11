package com.tencent.wechat;

import com.BufferedSink;
import com.BufferedSource;
import com.ByteString;
import com.Call;
import com.Callback;
import com.OkHttpClient;
import com.Okio;
import com.Protocol;
import com.Request;
import com.Response;
import com.WebSocket;
import com.WebSocketListener;
import com.tencent.Internal;
import com.tencent.Util;
import com.tencent.wechat.WebSocketReader;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class RealWebSocket implements WebSocket, WebSocketReader.FrameCallback {
    static final /* synthetic */ boolean $assertionsDisabled;
    private static final long CANCEL_AFTER_CLOSE_MILLIS = 60000;
    private static final long MAX_QUEUE_SIZE = 16777216;
    private static final List<Protocol> ONLY_HTTP1;
    private Call call;
    private ScheduledFuture<?> cancelFuture;
    private boolean enqueuedClose;
    private ScheduledExecutorService executor;
    private boolean failed;
    private final String key;
    final WebSocketListener listener;
    private final Request originalRequest;
    int pingCount;
    int pongCount;
    private long queueSize;
    private final Random random;
    private WebSocketReader reader;
    private String receivedCloseReason;
    private Streams streams;
    private WebSocketWriter writer;
    private final Runnable writerRunnable;
    private final ArrayDeque<ByteString> pongQueue = new ArrayDeque<>();
    private final ArrayDeque<Object> messageAndCloseQueue = new ArrayDeque<>();
    private int receivedCloseCode = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class CancelRunnable implements Runnable {
        CancelRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RealWebSocket.this.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class Close {
        final long cancelAfterCloseMillis;
        final int code;
        final ByteString reason;

        Close(int i, ByteString byteString, long j2) {
            this.code = i;
            this.reason = byteString;
            this.cancelAfterCloseMillis = j2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class Message {
        final ByteString data;
        final int formatOpcode;

        Message(int i, ByteString byteString) {
            this.formatOpcode = i;
            this.data = byteString;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class PingRunnable implements Runnable {
        PingRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RealWebSocket.this.writePingFrame();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class Streams implements Closeable {
        public final boolean client;
        public final BufferedSink sink;
        public final BufferedSource source;

        public Streams(boolean z2, BufferedSource bufferedSource, BufferedSink bufferedSink) {
            this.client = z2;
            this.source = bufferedSource;
            this.sink = bufferedSink;
        }
    }

    static {
        $assertionsDisabled = !RealWebSocket.class.desiredAssertionStatus() ? true : $assertionsDisabled;
        ONLY_HTTP1 = Collections.singletonList(Protocol.HTTP_1_1);
    }

    public RealWebSocket(Request request, WebSocketListener webSocketListener, Random random) {
        if (!"GET".equals(request.method())) {
            throw new IllegalArgumentException("Request must be GET: " + request.method());
        }
        this.originalRequest = request;
        this.listener = webSocketListener;
        this.random = random;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        this.key = ByteString.of(bArr).base64();
        this.writerRunnable = new Runnable() { // from class: com.tencent.wechat.RealWebSocket.1
            @Override // java.lang.Runnable
            public void run() {
                do {
                    try {
                    } catch (IOException e2) {
                        RealWebSocket.this.failWebSocket(e2, null);
                        return;
                    }
                } while (RealWebSocket.this.writeOneFrame());
            }
        };
    }

    private void runWriter() {
        if (!$assertionsDisabled && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        if (this.executor != null) {
            this.executor.execute(this.writerRunnable);
        }
    }

    private synchronized boolean send(ByteString byteString, int i) {
        boolean z2 = $assertionsDisabled;
        synchronized (this) {
            if (!this.failed && !this.enqueuedClose) {
                if (this.queueSize + byteString.size() > MAX_QUEUE_SIZE) {
                    close(1001, null);
                } else {
                    this.queueSize += byteString.size();
                    this.messageAndCloseQueue.add(new Message(i, byteString));
                    runWriter();
                    z2 = true;
                }
            }
        }
        return z2;
    }

    void awaitTermination(int i, TimeUnit timeUnit) throws InterruptedException {
        this.executor.awaitTermination(i, timeUnit);
    }

    @Override // com.WebSocket
    public void cancel() {
        this.call.cancel();
    }

    void checkResponse(Response response) throws ProtocolException {
        if (response.code() != 101) {
            throw new ProtocolException("Expected HTTP 101 response but was '" + response.code() + " " + response.message() + "'");
        }
        String header = response.header("Connection");
        if (!"Upgrade".equalsIgnoreCase(header)) {
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + header + "'");
        }
        String header2 = response.header("Upgrade");
        if (!"websocket".equalsIgnoreCase(header2)) {
            throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + header2 + "'");
        }
        String header3 = response.header("Sec-WebSocket-Accept");
        String base64 = ByteString.encodeUtf8(this.key + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").sha1().base64();
        if (!base64.equals(header3)) {
            throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + base64 + "' but was '" + header3 + "'");
        }
    }

    @Override // com.WebSocket
    public boolean close(int i, String str) {
        return close(i, str, CANCEL_AFTER_CLOSE_MILLIS);
    }

    synchronized boolean close(int i, String str, long j2) {
        boolean z2 = true;
        synchronized (this) {
            WebSocketProtocol.validateCloseCode(i);
            ByteString byteString = null;
            if (str != null) {
                byteString = ByteString.encodeUtf8(str);
                if (byteString.size() > 123) {
                    throw new IllegalArgumentException("reason.size() > 123: " + str);
                }
            }
            if (this.failed || this.enqueuedClose) {
                z2 = $assertionsDisabled;
            } else {
                this.enqueuedClose = true;
                this.messageAndCloseQueue.add(new Close(i, byteString, j2));
                runWriter();
            }
        }
        return z2;
    }

    public void connect(OkHttpClient okHttpClient) {
        OkHttpClient build = okHttpClient.newBuilder().protocols(ONLY_HTTP1).build();
        final int pingIntervalMillis = build.pingIntervalMillis();
        final Request build2 = this.originalRequest.newBuilder().header("Upgrade", "websocket").header("Connection", "Upgrade").header("Sec-WebSocket-Key", this.key).header("Sec-WebSocket-Version", "13").build();
        this.call = Internal.instance.newWebSocketCall(build, build2);
        this.call.enqueue(new Callback() { // from class: com.tencent.wechat.RealWebSocket.2
            @Override // com.Callback
            public void onFailure(Call call, IOException iOException) {
                RealWebSocket.this.failWebSocket(iOException, null);
            }

            @Override // com.Callback
            public void onResponse(Call call, Response response) {
                try {
                    RealWebSocket.this.checkResponse(response);
                    StreamAllocation streamAllocation = Internal.instance.streamAllocation(call);
                    streamAllocation.noNewStreams();
                    Streams newWebSocketStreams = streamAllocation.connection().newWebSocketStreams(streamAllocation);
                    try {
                        RealWebSocket.this.listener.onOpen(RealWebSocket.this, response);
                        RealWebSocket.this.initReaderAndWriter("OkHttp WebSocket " + build2.url().redact(), pingIntervalMillis, newWebSocketStreams);
                        streamAllocation.connection().socket().setSoTimeout(0);
                        RealWebSocket.this.loopReader();
                    } catch (Exception e2) {
                        RealWebSocket.this.failWebSocket(e2, null);
                    }
                } catch (ProtocolException e3) {
                    RealWebSocket.this.failWebSocket(e3, response);
                    Util.closeQuietly(response);
                }
            }
        });
    }

    public void failWebSocket(Exception exc, Response response) {
        synchronized (this) {
            if (this.failed) {
                return;
            }
            this.failed = true;
            Streams streams = this.streams;
            this.streams = null;
            if (this.cancelFuture != null) {
                this.cancelFuture.cancel($assertionsDisabled);
            }
            if (this.executor != null) {
                this.executor.shutdown();
            }
            try {
                this.listener.onFailure(this, exc, response);
            } finally {
                Util.closeQuietly(streams);
            }
        }
    }

    public void initReaderAndWriter(String str, long j2, Streams streams) throws IOException {
        synchronized (this) {
            this.streams = streams;
            this.writer = new WebSocketWriter(streams.client, streams.sink, this.random);
            this.executor = new ScheduledThreadPoolExecutor(1, Util.threadFactory(str, $assertionsDisabled));
            if (j2 != 0) {
                this.executor.scheduleAtFixedRate(new PingRunnable(), j2, j2, TimeUnit.MILLISECONDS);
            }
            if (!this.messageAndCloseQueue.isEmpty()) {
                runWriter();
            }
        }
        this.reader = new WebSocketReader(streams.client, streams.source, this);
    }

    public void loopReader() throws IOException {
        while (this.receivedCloseCode == -1) {
            this.reader.processNextFrame();
        }
    }

    @Override // com.tencent.wechat.WebSocketReader.FrameCallback
    public void onReadClose(int i, String str) {
        Streams streams;
        if (i == -1) {
            throw new IllegalArgumentException();
        }
        synchronized (this) {
            if (this.receivedCloseCode != -1) {
                throw new IllegalStateException("already closed");
            }
            this.receivedCloseCode = i;
            this.receivedCloseReason = str;
            if (this.enqueuedClose && this.messageAndCloseQueue.isEmpty()) {
                Streams streams2 = this.streams;
                this.streams = null;
                if (this.cancelFuture != null) {
                    this.cancelFuture.cancel($assertionsDisabled);
                }
                this.executor.shutdown();
                streams = streams2;
            } else {
                streams = null;
            }
        }
        try {
            this.listener.onClosing(this, i, str);
            if (streams != null) {
                this.listener.onClosed(this, i, str);
            }
        } finally {
            Util.closeQuietly(streams);
        }
    }

    @Override // com.tencent.wechat.WebSocketReader.FrameCallback
    public void onReadMessage(ByteString byteString) throws IOException {
        this.listener.onMessage(this, byteString);
    }

    @Override // com.tencent.wechat.WebSocketReader.FrameCallback
    public void onReadMessage(String str) throws IOException {
        this.listener.onMessage(this, str);
    }

    @Override // com.tencent.wechat.WebSocketReader.FrameCallback
    public synchronized void onReadPing(ByteString byteString) {
        if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
            this.pongQueue.add(byteString);
            runWriter();
            this.pingCount++;
        }
    }

    @Override // com.tencent.wechat.WebSocketReader.FrameCallback
    public synchronized void onReadPong(ByteString byteString) {
        this.pongCount++;
    }

    synchronized int pingCount() {
        return this.pingCount;
    }

    synchronized boolean pong(ByteString byteString) {
        boolean z2;
        if (this.failed || (this.enqueuedClose && this.messageAndCloseQueue.isEmpty())) {
            z2 = $assertionsDisabled;
        } else {
            this.pongQueue.add(byteString);
            runWriter();
            z2 = true;
        }
        return z2;
    }

    synchronized int pongCount() {
        return this.pongCount;
    }

    boolean processNextFrame() throws IOException {
        try {
            this.reader.processNextFrame();
            if (this.receivedCloseCode == -1) {
                return true;
            }
            return $assertionsDisabled;
        } catch (Exception e2) {
            failWebSocket(e2, null);
            return $assertionsDisabled;
        }
    }

    @Override // com.WebSocket
    public synchronized long queueSize() {
        return this.queueSize;
    }

    @Override // com.WebSocket
    public Request request() {
        return this.originalRequest;
    }

    @Override // com.WebSocket
    public boolean send(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException("bytes == null");
        }
        return send(byteString, 2);
    }

    @Override // com.WebSocket
    public boolean send(String str) {
        if (str == null) {
            throw new NullPointerException("text == null");
        }
        return send(ByteString.encodeUtf8(str), 1);
    }

    void tearDown() throws InterruptedException {
        if (this.cancelFuture != null) {
            this.cancelFuture.cancel($assertionsDisabled);
        }
        this.executor.shutdown();
        this.executor.awaitTermination(10L, TimeUnit.SECONDS);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v9 */
    boolean writeOneFrame() throws IOException {
        Streams streams;
        int i;
        Message message;
        String str = null;
        synchronized (this) {
            if (this.failed) {
                return $assertionsDisabled;
            }
            WebSocketWriter webSocketWriter = this.writer;
            ByteString poll = this.pongQueue.poll();
            if (poll == null) {
                Object poll2 = this.messageAndCloseQueue.poll();
                if (poll2 instanceof Close) {
                    int i2 = this.receivedCloseCode;
                    String str2 = this.receivedCloseReason;
                    if (i2 != -1) {
                        Streams streams2 = this.streams;
                        this.streams = null;
                        this.executor.shutdown();
                        str = str2;
                        i = i2;
                        message = poll2;
                        streams = streams2;
                    } else {
                        this.cancelFuture = this.executor.schedule(new CancelRunnable(), ((Close) poll2).cancelAfterCloseMillis, TimeUnit.MILLISECONDS);
                        message = poll2;
                        streams = null;
                        str = str2;
                        i = i2;
                    }
                } else {
                    if (poll2 == null) {
                        return $assertionsDisabled;
                    }
                    i = -1;
                    message = poll2;
                    streams = null;
                }
            } else {
                streams = null;
                i = -1;
                message = 0;
            }
            try {
                if (poll != null) {
                    webSocketWriter.writePong(poll);
                } else if (message instanceof Message) {
                    ByteString byteString = message.data;
                    BufferedSink buffer = Okio.buffer(webSocketWriter.newMessageSink(message.formatOpcode, byteString.size()));
                    buffer.write(byteString);
                    buffer.close();
                    synchronized (this) {
                        this.queueSize -= byteString.size();
                    }
                } else {
                    if (!(message instanceof Close)) {
                        throw new AssertionError();
                    }
                    Close close = (Close) message;
                    webSocketWriter.writeClose(close.code, close.reason);
                    if (streams != null) {
                        this.listener.onClosed(this, i, str);
                    }
                }
                return true;
            } finally {
                Util.closeQuietly(streams);
            }
        }
    }

    void writePingFrame() {
        synchronized (this) {
            if (this.failed) {
                return;
            }
            WebSocketWriter webSocketWriter = this.writer;
            try {
                webSocketWriter.writePing(ByteString.EMPTY);
            } catch (IOException e2) {
                failWebSocket(e2, null);
            }
        }
    }
}
