package com.tencent.wechat;

import com.Buffer;
import com.BufferedSink;
import com.BufferedSource;
import com.ByteString;
import com.Okio;
import com.Protocol;
import com.tencent.NamedRunnable;
import com.tencent.Util;
import com.tencent.wechat.Http2Reader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class Http2Connection implements Closeable {
    static final /* synthetic */ boolean $assertionsDisabled;
    private static final int OKHTTP_CLIENT_WINDOW_SIZE = 16777216;
    static final ExecutorService executor;
    long bytesLeftInWriteWindow;
    final boolean client;
    final String hostname;
    int lastGoodStreamId;
    final Listener listener;
    private int nextPingId;
    int nextStreamId;
    private Map<Integer, Ping> pings;
    private final ExecutorService pushExecutor;
    final PushObserver pushObserver;
    final ReaderRunnable readerRunnable;
    boolean shutdown;
    final Socket socket;
    final Http2Writer writer;
    final Map<Integer, Http2Stream> streams = new LinkedHashMap();
    long unacknowledgedBytesRead = 0;
    Settings okHttpSettings = new Settings();
    final Settings peerSettings = new Settings();
    boolean receivedInitialPeerSettings = $assertionsDisabled;
    final Set<Integer> currentPushRequests = new LinkedHashSet();

    /* loaded from: classes.dex */
    public static class Builder {
        boolean client;
        String hostname;
        Listener listener = Listener.REFUSE_INCOMING_STREAMS;
        PushObserver pushObserver = PushObserver.CANCEL;
        BufferedSink sink;
        Socket socket;
        BufferedSource source;

        public Builder(boolean z2) {
            this.client = z2;
        }

        public Http2Connection build() throws IOException {
            return new Http2Connection(this);
        }

        public Builder listener(Listener listener) {
            this.listener = listener;
            return this;
        }

        public Builder pushObserver(PushObserver pushObserver) {
            this.pushObserver = pushObserver;
            return this;
        }

        public Builder socket(Socket socket) throws IOException {
            return socket(socket, ((InetSocketAddress) socket.getRemoteSocketAddress()).getHostName(), Okio.buffer(Okio.source(socket)), Okio.buffer(Okio.sink(socket)));
        }

        public Builder socket(Socket socket, String str, BufferedSource bufferedSource, BufferedSink bufferedSink) {
            this.socket = socket;
            this.hostname = str;
            this.source = bufferedSource;
            this.sink = bufferedSink;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class Listener {
        public static final Listener REFUSE_INCOMING_STREAMS = new Listener() { // from class: com.tencent.wechat.Http2Connection.Listener.1
            @Override // com.tencent.wechat.Http2Connection.Listener
            public void onStream(Http2Stream http2Stream) throws IOException {
                http2Stream.close(ErrorCode.REFUSED_STREAM);
            }
        };

        public void onSettings(Http2Connection http2Connection) {
        }

        public abstract void onStream(Http2Stream http2Stream) throws IOException;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class ReaderRunnable extends NamedRunnable implements Http2Reader.Handler {
        final Http2Reader reader;

        ReaderRunnable(Http2Reader http2Reader) {
            super("OkHttp %s", Http2Connection.this.hostname);
            this.reader = http2Reader;
        }

        private void applyAndAckSettings(final Settings settings) {
            Http2Connection.executor.execute(new NamedRunnable("OkHttp %s ACK Settings", new Object[]{Http2Connection.this.hostname}) { // from class: com.tencent.wechat.Http2Connection.ReaderRunnable.3
                @Override // com.tencent.NamedRunnable
                public void execute() {
                    try {
                        Http2Connection.this.writer.applyAndAckSettings(settings);
                    } catch (IOException e2) {
                    }
                }
            });
        }

        @Override // com.tencent.wechat.Http2Reader.Handler
        public void ackSettings() {
        }

        @Override // com.tencent.wechat.Http2Reader.Handler
        public void alternateService(int i, String str, ByteString byteString, String str2, int i2, long j2) {
        }

        @Override // com.tencent.wechat.Http2Reader.Handler
        public void data(boolean z2, int i, BufferedSource bufferedSource, int i2) throws IOException {
            if (Http2Connection.this.pushedStream(i)) {
                Http2Connection.this.pushDataLater(i, bufferedSource, i2, z2);
                return;
            }
            Http2Stream stream = Http2Connection.this.getStream(i);
            if (stream == null) {
                Http2Connection.this.writeSynResetLater(i, ErrorCode.PROTOCOL_ERROR);
                bufferedSource.skip(i2);
            } else {
                stream.receiveData(bufferedSource, i2);
                if (z2) {
                    stream.receiveFin();
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v11, types: [java.io.Closeable, com.tencent.wechat.Http2Reader] */
        /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Closeable, com.tencent.wechat.Http2Reader] */
        /* JADX WARN: Type inference failed for: r2v0, types: [com.tencent.wechat.ErrorCode] */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v10 */
        /* JADX WARN: Type inference failed for: r2v11 */
        /* JADX WARN: Type inference failed for: r2v2 */
        /* JADX WARN: Type inference failed for: r2v3, types: [com.tencent.wechat.Http2Connection] */
        /* JADX WARN: Type inference failed for: r2v4, types: [com.tencent.wechat.ErrorCode] */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v6 */
        /* JADX WARN: Type inference failed for: r2v7 */
        /* JADX WARN: Type inference failed for: r2v8 */
        /* JADX WARN: Type inference failed for: r2v9, types: [com.tencent.wechat.Http2Connection] */
        /* JADX WARN: Type inference failed for: r3v0, types: [com.tencent.wechat.Http2Connection] */
        @Override // com.tencent.NamedRunnable
        protected void execute() {
            ErrorCode errorCode;
            ErrorCode errorCode2 = ErrorCode.INTERNAL_ERROR;
            ?? r2 = ErrorCode.INTERNAL_ERROR;
            try {
                try {
                    this.reader.readConnectionPreface(this);
                    do {
                    } while (this.reader.nextFrame(Http2Connection.$assertionsDisabled, this));
                    errorCode2 = ErrorCode.NO_ERROR;
                    ErrorCode errorCode3 = ErrorCode.CANCEL;
                    try {
                        r2 = Http2Connection.this;
                        r2.close(errorCode2, errorCode3);
                    } catch (IOException e2) {
                    }
                    ?? r0 = this.reader;
                    Util.closeQuietly((Closeable) r0);
                    errorCode2 = r0;
                    r2 = r2;
                } catch (Throwable th) {
                    errorCode = errorCode2;
                    th = th;
                    try {
                        Http2Connection.this.close(errorCode, r2);
                    } catch (IOException e3) {
                    }
                    Util.closeQuietly(this.reader);
                    throw th;
                }
            } catch (IOException e4) {
                errorCode = ErrorCode.PROTOCOL_ERROR;
                try {
                    ErrorCode errorCode4 = ErrorCode.PROTOCOL_ERROR;
                    try {
                        r2 = Http2Connection.this;
                        r2.close(errorCode, errorCode4);
                    } catch (IOException e5) {
                    }
                    ?? r02 = this.reader;
                    Util.closeQuietly((Closeable) r02);
                    errorCode2 = r02;
                    r2 = r2;
                } catch (Throwable th2) {
                    th = th2;
                    Http2Connection.this.close(errorCode, r2);
                    Util.closeQuietly(this.reader);
                    throw th;
                }
            }
        }

        @Override // com.tencent.wechat.Http2Reader.Handler
        public void goAway(int i, ErrorCode errorCode, ByteString byteString) {
            Http2Stream[] http2StreamArr;
            if (byteString.size() > 0) {
            }
            synchronized (Http2Connection.this) {
                http2StreamArr = (Http2Stream[]) Http2Connection.this.streams.values().toArray(new Http2Stream[Http2Connection.this.streams.size()]);
                Http2Connection.this.shutdown = true;
            }
            for (Http2Stream http2Stream : http2StreamArr) {
                if (http2Stream.getId() > i && http2Stream.isLocallyInitiated()) {
                    http2Stream.receiveRstStream(ErrorCode.REFUSED_STREAM);
                    Http2Connection.this.removeStream(http2Stream.getId());
                }
            }
        }

        @Override // com.tencent.wechat.Http2Reader.Handler
        public void headers(boolean z2, int i, int i2, List<Header> list) {
            if (Http2Connection.this.pushedStream(i)) {
                Http2Connection.this.pushHeadersLater(i, list, z2);
                return;
            }
            synchronized (Http2Connection.this) {
                if (!Http2Connection.this.shutdown) {
                    Http2Stream stream = Http2Connection.this.getStream(i);
                    if (stream != null) {
                        stream.receiveHeaders(list);
                        if (z2) {
                            stream.receiveFin();
                        }
                    } else if (i > Http2Connection.this.lastGoodStreamId) {
                        if (i % 2 != Http2Connection.this.nextStreamId % 2) {
                            final Http2Stream http2Stream = new Http2Stream(i, Http2Connection.this, Http2Connection.$assertionsDisabled, z2, list);
                            Http2Connection.this.lastGoodStreamId = i;
                            Http2Connection.this.streams.put(Integer.valueOf(i), http2Stream);
                            Http2Connection.executor.execute(new NamedRunnable("OkHttp %s stream %d", new Object[]{Http2Connection.this.hostname, Integer.valueOf(i)}) { // from class: com.tencent.wechat.Http2Connection.ReaderRunnable.1
                                @Override // com.tencent.NamedRunnable
                                public void execute() {
                                    try {
                                        Http2Connection.this.listener.onStream(http2Stream);
                                    } catch (IOException e2) {
                                        Platform.get().log(4, "Http2Connection.Listener failure for " + Http2Connection.this.hostname, e2);
                                        try {
                                            http2Stream.close(ErrorCode.PROTOCOL_ERROR);
                                        } catch (IOException e3) {
                                        }
                                    }
                                }
                            });
                        }
                    }
                }
            }
        }

        @Override // com.tencent.wechat.Http2Reader.Handler
        public void ping(boolean z2, int i, int i2) {
            if (!z2) {
                Http2Connection.this.writePingLater(true, i, i2, null);
                return;
            }
            Ping removePing = Http2Connection.this.removePing(i);
            if (removePing != null) {
                removePing.receive();
            }
        }

        @Override // com.tencent.wechat.Http2Reader.Handler
        public void priority(int i, int i2, int i3, boolean z2) {
        }

        @Override // com.tencent.wechat.Http2Reader.Handler
        public void pushPromise(int i, int i2, List<Header> list) {
            Http2Connection.this.pushRequestLater(i2, list);
        }

        @Override // com.tencent.wechat.Http2Reader.Handler
        public void rstStream(int i, ErrorCode errorCode) {
            if (Http2Connection.this.pushedStream(i)) {
                Http2Connection.this.pushResetLater(i, errorCode);
                return;
            }
            Http2Stream removeStream = Http2Connection.this.removeStream(i);
            if (removeStream != null) {
                removeStream.receiveRstStream(errorCode);
            }
        }

        @Override // com.tencent.wechat.Http2Reader.Handler
        public void settings(boolean z2, Settings settings) {
            long j2;
            Http2Stream[] http2StreamArr;
            long j3 = 0;
            synchronized (Http2Connection.this) {
                int initialWindowSize = Http2Connection.this.peerSettings.getInitialWindowSize();
                if (z2) {
                    Http2Connection.this.peerSettings.clear();
                }
                Http2Connection.this.peerSettings.merge(settings);
                applyAndAckSettings(settings);
                int initialWindowSize2 = Http2Connection.this.peerSettings.getInitialWindowSize();
                if (initialWindowSize2 != -1 && initialWindowSize2 != initialWindowSize) {
                    j3 = initialWindowSize2 - initialWindowSize;
                    if (!Http2Connection.this.receivedInitialPeerSettings) {
                        Http2Connection.this.addBytesToWriteWindow(j3);
                        Http2Connection.this.receivedInitialPeerSettings = true;
                    }
                    if (!Http2Connection.this.streams.isEmpty()) {
                        j2 = j3;
                        http2StreamArr = (Http2Stream[]) Http2Connection.this.streams.values().toArray(new Http2Stream[Http2Connection.this.streams.size()]);
                        Http2Connection.executor.execute(new NamedRunnable("OkHttp %s settings", Http2Connection.this.hostname) { // from class: com.tencent.wechat.Http2Connection.ReaderRunnable.2
                            @Override // com.tencent.NamedRunnable
                            public void execute() {
                                Http2Connection.this.listener.onSettings(Http2Connection.this);
                            }
                        });
                    }
                }
                j2 = j3;
                http2StreamArr = null;
                Http2Connection.executor.execute(new NamedRunnable("OkHttp %s settings", Http2Connection.this.hostname) { // from class: com.tencent.wechat.Http2Connection.ReaderRunnable.2
                    @Override // com.tencent.NamedRunnable
                    public void execute() {
                        Http2Connection.this.listener.onSettings(Http2Connection.this);
                    }
                });
            }
            if (http2StreamArr == null || j2 == 0) {
                return;
            }
            for (Http2Stream http2Stream : http2StreamArr) {
                synchronized (http2Stream) {
                    http2Stream.addBytesToWriteWindow(j2);
                }
            }
        }

        @Override // com.tencent.wechat.Http2Reader.Handler
        public void windowUpdate(int i, long j2) {
            if (i == 0) {
                synchronized (Http2Connection.this) {
                    Http2Connection.this.bytesLeftInWriteWindow += j2;
                    Http2Connection.this.notifyAll();
                }
                return;
            }
            Http2Stream stream = Http2Connection.this.getStream(i);
            if (stream != null) {
                synchronized (stream) {
                    stream.addBytesToWriteWindow(j2);
                }
            }
        }
    }

    static {
        $assertionsDisabled = !Http2Connection.class.desiredAssertionStatus();
        executor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), Util.threadFactory("OkHttp Http2Connection", true));
    }

    Http2Connection(Builder builder) {
        this.pushObserver = builder.pushObserver;
        this.client = builder.client;
        this.listener = builder.listener;
        this.nextStreamId = builder.client ? 1 : 2;
        if (builder.client) {
            this.nextStreamId += 2;
        }
        this.nextPingId = builder.client ? 1 : 2;
        if (builder.client) {
            this.okHttpSettings.set(7, OKHTTP_CLIENT_WINDOW_SIZE);
        }
        this.hostname = builder.hostname;
        this.pushExecutor = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), Util.threadFactory(Util.format("OkHttp %s Push Observer", this.hostname), true));
        this.peerSettings.set(7, 65535);
        this.peerSettings.set(5, 16384);
        this.bytesLeftInWriteWindow = this.peerSettings.getInitialWindowSize();
        this.socket = builder.socket;
        this.writer = new Http2Writer(builder.sink, this.client);
        this.readerRunnable = new ReaderRunnable(new Http2Reader(builder.source, this.client));
    }

    private Http2Stream newStream(int i, List<Header> list, boolean z2) throws IOException {
        int i2;
        Http2Stream http2Stream;
        boolean z3 = $assertionsDisabled;
        boolean z4 = !z2;
        synchronized (this.writer) {
            synchronized (this) {
                if (this.shutdown) {
                    throw new ConnectionShutdownException();
                }
                i2 = this.nextStreamId;
                this.nextStreamId += 2;
                http2Stream = new Http2Stream(i2, this, z4, $assertionsDisabled, list);
                if (!z2 || this.bytesLeftInWriteWindow == 0 || http2Stream.bytesLeftInWriteWindow == 0) {
                    z3 = true;
                }
                if (http2Stream.isOpen()) {
                    this.streams.put(Integer.valueOf(i2), http2Stream);
                }
            }
            if (i == 0) {
                this.writer.synStream(z4, i2, i, list);
            } else {
                if (this.client) {
                    throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                }
                this.writer.pushPromise(i, i2, list);
            }
        }
        if (z3) {
            this.writer.flush();
        }
        return http2Stream;
    }

    void addBytesToWriteWindow(long j2) {
        this.bytesLeftInWriteWindow += j2;
        if (j2 > 0) {
            notifyAll();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        close(ErrorCode.NO_ERROR, ErrorCode.CANCEL);
    }

    void close(ErrorCode errorCode, ErrorCode errorCode2) throws IOException {
        IOException iOException;
        Http2Stream[] http2StreamArr;
        Ping[] pingArr;
        if (!$assertionsDisabled && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        try {
            shutdown(errorCode);
            iOException = null;
        } catch (IOException e2) {
            iOException = e2;
        }
        synchronized (this) {
            if (this.streams.isEmpty()) {
                http2StreamArr = null;
            } else {
                Http2Stream[] http2StreamArr2 = (Http2Stream[]) this.streams.values().toArray(new Http2Stream[this.streams.size()]);
                this.streams.clear();
                http2StreamArr = http2StreamArr2;
            }
            if (this.pings != null) {
                Ping[] pingArr2 = (Ping[]) this.pings.values().toArray(new Ping[this.pings.size()]);
                this.pings = null;
                pingArr = pingArr2;
            } else {
                pingArr = null;
            }
        }
        if (http2StreamArr != null) {
            IOException iOException2 = iOException;
            for (Http2Stream http2Stream : http2StreamArr) {
                try {
                    http2Stream.close(errorCode2);
                } catch (IOException e3) {
                    if (iOException2 != null) {
                        iOException2 = e3;
                    }
                }
            }
            iOException = iOException2;
        }
        if (pingArr != null) {
            for (Ping ping : pingArr) {
                ping.cancel();
            }
        }
        try {
            this.writer.close();
            e = iOException;
        } catch (IOException e4) {
            e = e4;
            if (iOException != null) {
                e = iOException;
            }
        }
        try {
            this.socket.close();
        } catch (IOException e5) {
            e = e5;
        }
        if (e != null) {
            throw e;
        }
    }

    public void flush() throws IOException {
        this.writer.flush();
    }

    public Protocol getProtocol() {
        return Protocol.HTTP_2;
    }

    synchronized Http2Stream getStream(int i) {
        return this.streams.get(Integer.valueOf(i));
    }

    public synchronized boolean isShutdown() {
        return this.shutdown;
    }

    public synchronized int maxConcurrentStreams() {
        return this.peerSettings.getMaxConcurrentStreams(Integer.MAX_VALUE);
    }

    public Http2Stream newStream(List<Header> list, boolean z2) throws IOException {
        return newStream(0, list, z2);
    }

    public synchronized int openStreamCount() {
        return this.streams.size();
    }

    public Ping ping() throws IOException {
        int i;
        Ping ping = new Ping();
        synchronized (this) {
            if (this.shutdown) {
                throw new ConnectionShutdownException();
            }
            i = this.nextPingId;
            this.nextPingId += 2;
            if (this.pings == null) {
                this.pings = new LinkedHashMap();
            }
            this.pings.put(Integer.valueOf(i), ping);
        }
        writePing($assertionsDisabled, i, 1330343787, ping);
        return ping;
    }

    void pushDataLater(final int i, BufferedSource bufferedSource, final int i2, final boolean z2) throws IOException {
        final Buffer buffer = new Buffer();
        bufferedSource.require(i2);
        bufferedSource.read(buffer, i2);
        if (buffer.size() != i2) {
            throw new IOException(buffer.size() + " != " + i2);
        }
        this.pushExecutor.execute(new NamedRunnable("OkHttp %s Push Data[%s]", new Object[]{this.hostname, Integer.valueOf(i)}) { // from class: com.tencent.wechat.Http2Connection.6
            @Override // com.tencent.NamedRunnable
            public void execute() {
                try {
                    boolean onData = Http2Connection.this.pushObserver.onData(i, buffer, i2, z2);
                    if (onData) {
                        Http2Connection.this.writer.rstStream(i, ErrorCode.CANCEL);
                    }
                    if (onData || z2) {
                        synchronized (Http2Connection.this) {
                            Http2Connection.this.currentPushRequests.remove(Integer.valueOf(i));
                        }
                    }
                } catch (IOException e2) {
                }
            }
        });
    }

    void pushHeadersLater(final int i, final List<Header> list, final boolean z2) {
        this.pushExecutor.execute(new NamedRunnable("OkHttp %s Push Headers[%s]", new Object[]{this.hostname, Integer.valueOf(i)}) { // from class: com.tencent.wechat.Http2Connection.5
            @Override // com.tencent.NamedRunnable
            public void execute() {
                boolean onHeaders = Http2Connection.this.pushObserver.onHeaders(i, list, z2);
                if (onHeaders) {
                    try {
                        Http2Connection.this.writer.rstStream(i, ErrorCode.CANCEL);
                    } catch (IOException e2) {
                        return;
                    }
                }
                if (onHeaders || z2) {
                    synchronized (Http2Connection.this) {
                        Http2Connection.this.currentPushRequests.remove(Integer.valueOf(i));
                    }
                }
            }
        });
    }

    void pushRequestLater(final int i, final List<Header> list) {
        synchronized (this) {
            if (this.currentPushRequests.contains(Integer.valueOf(i))) {
                writeSynResetLater(i, ErrorCode.PROTOCOL_ERROR);
            } else {
                this.currentPushRequests.add(Integer.valueOf(i));
                this.pushExecutor.execute(new NamedRunnable("OkHttp %s Push Request[%s]", new Object[]{this.hostname, Integer.valueOf(i)}) { // from class: com.tencent.wechat.Http2Connection.4
                    @Override // com.tencent.NamedRunnable
                    public void execute() {
                        if (Http2Connection.this.pushObserver.onRequest(i, list)) {
                            try {
                                Http2Connection.this.writer.rstStream(i, ErrorCode.CANCEL);
                                synchronized (Http2Connection.this) {
                                    Http2Connection.this.currentPushRequests.remove(Integer.valueOf(i));
                                }
                            } catch (IOException e2) {
                            }
                        }
                    }
                });
            }
        }
    }

    void pushResetLater(final int i, final ErrorCode errorCode) {
        this.pushExecutor.execute(new NamedRunnable("OkHttp %s Push Reset[%s]", new Object[]{this.hostname, Integer.valueOf(i)}) { // from class: com.tencent.wechat.Http2Connection.7
            @Override // com.tencent.NamedRunnable
            public void execute() {
                Http2Connection.this.pushObserver.onReset(i, errorCode);
                synchronized (Http2Connection.this) {
                    Http2Connection.this.currentPushRequests.remove(Integer.valueOf(i));
                }
            }
        });
    }

    public Http2Stream pushStream(int i, List<Header> list, boolean z2) throws IOException {
        if (this.client) {
            throw new IllegalStateException("Client cannot push requests.");
        }
        return newStream(i, list, z2);
    }

    boolean pushedStream(int i) {
        if (i == 0 || (i & 1) != 0) {
            return $assertionsDisabled;
        }
        return true;
    }

    synchronized Ping removePing(int i) {
        return this.pings != null ? this.pings.remove(Integer.valueOf(i)) : null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized Http2Stream removeStream(int i) {
        Http2Stream remove;
        remove = this.streams.remove(Integer.valueOf(i));
        notifyAll();
        return remove;
    }

    public void setSettings(Settings settings) throws IOException {
        synchronized (this.writer) {
            synchronized (this) {
                if (this.shutdown) {
                    throw new ConnectionShutdownException();
                }
                this.okHttpSettings.merge(settings);
                this.writer.settings(settings);
            }
        }
    }

    public void shutdown(ErrorCode errorCode) throws IOException {
        synchronized (this.writer) {
            synchronized (this) {
                if (this.shutdown) {
                    return;
                }
                this.shutdown = true;
                this.writer.goAway(this.lastGoodStreamId, errorCode, Util.EMPTY_BYTE_ARRAY);
            }
        }
    }

    public void start() throws IOException {
        start(true);
    }

    void start(boolean z2) throws IOException {
        if (z2) {
            this.writer.connectionPreface();
            this.writer.settings(this.okHttpSettings);
            if (this.okHttpSettings.getInitialWindowSize() != 65535) {
                this.writer.windowUpdate(0, r0 - 65535);
            }
        }
        new Thread(this.readerRunnable).start();
    }

    public void writeData(int i, boolean z2, Buffer buffer, long j2) throws IOException {
        int min;
        if (j2 == 0) {
            this.writer.data(z2, i, buffer, 0);
            return;
        }
        while (j2 > 0) {
            synchronized (this) {
                while (this.bytesLeftInWriteWindow <= 0) {
                    try {
                        if (!this.streams.containsKey(Integer.valueOf(i))) {
                            throw new IOException("stream closed");
                        }
                        wait();
                    } catch (InterruptedException e2) {
                        throw new InterruptedIOException();
                    }
                }
                min = Math.min((int) Math.min(j2, this.bytesLeftInWriteWindow), this.writer.maxDataLength());
                this.bytesLeftInWriteWindow -= min;
            }
            j2 -= min;
            this.writer.data(z2 && j2 == 0, i, buffer, min);
        }
    }

    void writePing(boolean z2, int i, int i2, Ping ping) throws IOException {
        synchronized (this.writer) {
            if (ping != null) {
                ping.send();
            }
            this.writer.ping(z2, i, i2);
        }
    }

    void writePingLater(final boolean z2, final int i, final int i2, final Ping ping) {
        executor.execute(new NamedRunnable("OkHttp %s ping %08x%08x", new Object[]{this.hostname, Integer.valueOf(i), Integer.valueOf(i2)}) { // from class: com.tencent.wechat.Http2Connection.3
            @Override // com.tencent.NamedRunnable
            public void execute() {
                try {
                    Http2Connection.this.writePing(z2, i, i2, ping);
                } catch (IOException e2) {
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writeSynReply(int i, boolean z2, List<Header> list) throws IOException {
        this.writer.synReply(z2, i, list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writeSynReset(int i, ErrorCode errorCode) throws IOException {
        this.writer.rstStream(i, errorCode);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writeSynResetLater(final int i, final ErrorCode errorCode) {
        executor.execute(new NamedRunnable("OkHttp %s stream %d", new Object[]{this.hostname, Integer.valueOf(i)}) { // from class: com.tencent.wechat.Http2Connection.1
            @Override // com.tencent.NamedRunnable
            public void execute() {
                try {
                    Http2Connection.this.writeSynReset(i, errorCode);
                } catch (IOException e2) {
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writeWindowUpdateLater(final int i, final long j2) {
        executor.execute(new NamedRunnable("OkHttp Window Update %s stream %d", new Object[]{this.hostname, Integer.valueOf(i)}) { // from class: com.tencent.wechat.Http2Connection.2
            @Override // com.tencent.NamedRunnable
            public void execute() {
                try {
                    Http2Connection.this.writer.windowUpdate(i, j2);
                } catch (IOException e2) {
                }
            }
        });
    }
}
