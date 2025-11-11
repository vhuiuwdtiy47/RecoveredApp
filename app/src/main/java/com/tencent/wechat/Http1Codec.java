package com.tencent.wechat;

import com.Buffer;
import com.BufferedSink;
import com.BufferedSource;
import com.ForwardingTimeout;
import com.Headers;
import com.HttpUrl;
import com.OkHttpClient;
import com.Okio;
import com.Request;
import com.Response;
import com.ResponseBody;
import com.Sink;
import com.Source;
import com.Timeout;
import com.tencent.Internal;
import com.tencent.Util;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class Http1Codec implements HttpCodec {
    private static final int STATE_CLOSED = 6;
    private static final int STATE_IDLE = 0;
    private static final int STATE_OPEN_REQUEST_BODY = 1;
    private static final int STATE_OPEN_RESPONSE_BODY = 4;
    private static final int STATE_READING_RESPONSE_BODY = 5;
    private static final int STATE_READ_RESPONSE_HEADERS = 3;
    private static final int STATE_WRITING_REQUEST_BODY = 2;
    final OkHttpClient client;
    final BufferedSink sink;
    final BufferedSource source;
    int state = STATE_IDLE;
    final StreamAllocation streamAllocation;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public abstract class AbstractSource implements Source {
        protected boolean closed;
        protected final ForwardingTimeout timeout;

        private AbstractSource() {
            this.timeout = new ForwardingTimeout(Http1Codec.this.source.timeout());
        }

        protected final void endOfInput(boolean z2) throws IOException {
            if (Http1Codec.this.state == Http1Codec.STATE_CLOSED) {
                return;
            }
            if (Http1Codec.this.state != 5) {
                throw new IllegalStateException("state: " + Http1Codec.this.state);
            }
            Http1Codec.this.detachTimeout(this.timeout);
            Http1Codec.this.state = Http1Codec.STATE_CLOSED;
            if (Http1Codec.this.streamAllocation != null) {
                Http1Codec.this.streamAllocation.streamFinished(!z2, Http1Codec.this);
            }
        }

        @Override // com.Source
        public Timeout timeout() {
            return this.timeout;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class ChunkedSink implements Sink {
        private boolean closed;
        private final ForwardingTimeout timeout;

        ChunkedSink() {
            this.timeout = new ForwardingTimeout(Http1Codec.this.sink.timeout());
        }

        @Override // com.Sink, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() throws IOException {
            if (!this.closed) {
                this.closed = true;
                Http1Codec.this.sink.writeUtf8("0\r\n\r\n");
                Http1Codec.this.detachTimeout(this.timeout);
                Http1Codec.this.state = Http1Codec.STATE_READ_RESPONSE_HEADERS;
            }
        }

        @Override // com.Sink, java.io.Flushable
        public synchronized void flush() throws IOException {
            if (!this.closed) {
                Http1Codec.this.sink.flush();
            }
        }

        @Override // com.Sink
        public Timeout timeout() {
            return this.timeout;
        }

        @Override // com.Sink
        public void write(Buffer buffer, long j2) throws IOException {
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            if (j2 == 0) {
                return;
            }
            Http1Codec.this.sink.writeHexadecimalUnsignedLong(j2);
            Http1Codec.this.sink.writeUtf8("\r\n");
            Http1Codec.this.sink.write(buffer, j2);
            Http1Codec.this.sink.writeUtf8("\r\n");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class ChunkedSource extends AbstractSource {
        private static final long NO_CHUNK_YET = -1;
        private long bytesRemainingInChunk;
        private boolean hasMoreChunks;
        private final HttpUrl url;

        ChunkedSource(HttpUrl httpUrl) {
            super();
            this.bytesRemainingInChunk = NO_CHUNK_YET;
            this.hasMoreChunks = true;
            this.url = httpUrl;
        }

        private void readChunkSize() throws IOException {
            if (this.bytesRemainingInChunk != NO_CHUNK_YET) {
                Http1Codec.this.source.readUtf8LineStrict();
            }
            try {
                this.bytesRemainingInChunk = Http1Codec.this.source.readHexadecimalUnsignedLong();
                String trim = Http1Codec.this.source.readUtf8LineStrict().trim();
                if (this.bytesRemainingInChunk < 0 || !(trim.isEmpty() || trim.startsWith(";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.bytesRemainingInChunk + trim + "\"");
                }
                if (this.bytesRemainingInChunk == 0) {
                    this.hasMoreChunks = false;
                    HttpHeaders.receiveHeaders(Http1Codec.this.client.cookieJar(), this.url, Http1Codec.this.readHeaders());
                    endOfInput(true);
                }
            } catch (NumberFormatException e2) {
                throw new ProtocolException(e2.getMessage());
            }
        }

        @Override // com.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            if (this.hasMoreChunks && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                endOfInput(false);
            }
            this.closed = true;
        }

        @Override // com.Source
        public long read(Buffer buffer, long j2) throws IOException {
            if (j2 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j2);
            }
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            if (!this.hasMoreChunks) {
                return NO_CHUNK_YET;
            }
            if (this.bytesRemainingInChunk == 0 || this.bytesRemainingInChunk == NO_CHUNK_YET) {
                readChunkSize();
                if (!this.hasMoreChunks) {
                    return NO_CHUNK_YET;
                }
            }
            long read = Http1Codec.this.source.read(buffer, Math.min(j2, this.bytesRemainingInChunk));
            if (read == NO_CHUNK_YET) {
                endOfInput(false);
                throw new ProtocolException("unexpected end of stream");
            }
            this.bytesRemainingInChunk -= read;
            return read;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class FixedLengthSink implements Sink {
        private long bytesRemaining;
        private boolean closed;
        private final ForwardingTimeout timeout;

        FixedLengthSink(long j2) {
            this.timeout = new ForwardingTimeout(Http1Codec.this.sink.timeout());
            this.bytesRemaining = j2;
        }

        @Override // com.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            this.closed = true;
            if (this.bytesRemaining > 0) {
                throw new ProtocolException("unexpected end of stream");
            }
            Http1Codec.this.detachTimeout(this.timeout);
            Http1Codec.this.state = Http1Codec.STATE_READ_RESPONSE_HEADERS;
        }

        @Override // com.Sink, java.io.Flushable
        public void flush() throws IOException {
            if (this.closed) {
                return;
            }
            Http1Codec.this.sink.flush();
        }

        @Override // com.Sink
        public Timeout timeout() {
            return this.timeout;
        }

        @Override // com.Sink
        public void write(Buffer buffer, long j2) throws IOException {
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            Util.checkOffsetAndCount(buffer.size(), 0L, j2);
            if (j2 > this.bytesRemaining) {
                throw new ProtocolException("expected " + this.bytesRemaining + " bytes but received " + j2);
            }
            Http1Codec.this.sink.write(buffer, j2);
            this.bytesRemaining -= j2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class FixedLengthSource extends AbstractSource {
        private long bytesRemaining;

        public FixedLengthSource(long j2) throws IOException {
            super();
            this.bytesRemaining = j2;
            if (this.bytesRemaining == 0) {
                endOfInput(true);
            }
        }

        @Override // com.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            if (this.bytesRemaining != 0 && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                endOfInput(false);
            }
            this.closed = true;
        }

        @Override // com.Source
        public long read(Buffer buffer, long j2) throws IOException {
            if (j2 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j2);
            }
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            if (this.bytesRemaining == 0) {
                return -1L;
            }
            long read = Http1Codec.this.source.read(buffer, Math.min(this.bytesRemaining, j2));
            if (read == -1) {
                endOfInput(false);
                throw new ProtocolException("unexpected end of stream");
            }
            this.bytesRemaining -= read;
            if (this.bytesRemaining == 0) {
                endOfInput(true);
            }
            return read;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class UnknownLengthSource extends AbstractSource {
        private boolean inputExhausted;

        UnknownLengthSource() {
            super();
        }

        @Override // com.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            if (!this.inputExhausted) {
                endOfInput(false);
            }
            this.closed = true;
        }

        @Override // com.Source
        public long read(Buffer buffer, long j2) throws IOException {
            if (j2 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j2);
            }
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            if (this.inputExhausted) {
                return -1L;
            }
            long read = Http1Codec.this.source.read(buffer, j2);
            if (read != -1) {
                return read;
            }
            this.inputExhausted = true;
            endOfInput(true);
            return -1L;
        }
    }

    public Http1Codec(OkHttpClient okHttpClient, StreamAllocation streamAllocation, BufferedSource bufferedSource, BufferedSink bufferedSink) {
        this.client = okHttpClient;
        this.streamAllocation = streamAllocation;
        this.source = bufferedSource;
        this.sink = bufferedSink;
    }

    private Source getTransferStream(Response response) throws IOException {
        if (!HttpHeaders.hasBody(response)) {
            return newFixedLengthSource(0L);
        }
        if ("chunked".equalsIgnoreCase(response.header("Transfer-Encoding"))) {
            return newChunkedSource(response.request().url());
        }
        long contentLength = HttpHeaders.contentLength(response);
        return contentLength != -1 ? newFixedLengthSource(contentLength) : newUnknownLengthSource();
    }

    @Override // com.tencent.wechat.HttpCodec
    public void cancel() {
        RealConnection connection = this.streamAllocation.connection();
        if (connection != null) {
            connection.cancel();
        }
    }

    @Override // com.tencent.wechat.HttpCodec
    public Sink createRequestBody(Request request, long j2) {
        if ("chunked".equalsIgnoreCase(request.header("Transfer-Encoding"))) {
            return newChunkedSink();
        }
        if (j2 != -1) {
            return newFixedLengthSink(j2);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    void detachTimeout(ForwardingTimeout forwardingTimeout) {
        Timeout delegate = forwardingTimeout.delegate();
        forwardingTimeout.setDelegate(Timeout.NONE);
        delegate.clearDeadline();
        delegate.clearTimeout();
    }

    @Override // com.tencent.wechat.HttpCodec
    public void finishRequest() throws IOException {
        this.sink.flush();
    }

    @Override // com.tencent.wechat.HttpCodec
    public void flushRequest() throws IOException {
        this.sink.flush();
    }

    public boolean isClosed() {
        return this.state == STATE_CLOSED;
    }

    public Sink newChunkedSink() {
        if (this.state != STATE_OPEN_REQUEST_BODY) {
            throw new IllegalStateException("state: " + this.state);
        }
        this.state = STATE_WRITING_REQUEST_BODY;
        return new ChunkedSink();
    }

    public Source newChunkedSource(HttpUrl httpUrl) throws IOException {
        if (this.state != 4) {
            throw new IllegalStateException("state: " + this.state);
        }
        this.state = 5;
        return new ChunkedSource(httpUrl);
    }

    public Sink newFixedLengthSink(long j2) {
        if (this.state != STATE_OPEN_REQUEST_BODY) {
            throw new IllegalStateException("state: " + this.state);
        }
        this.state = STATE_WRITING_REQUEST_BODY;
        return new FixedLengthSink(j2);
    }

    public Source newFixedLengthSource(long j2) throws IOException {
        if (this.state != 4) {
            throw new IllegalStateException("state: " + this.state);
        }
        this.state = 5;
        return new FixedLengthSource(j2);
    }

    public Source newUnknownLengthSource() throws IOException {
        if (this.state != 4) {
            throw new IllegalStateException("state: " + this.state);
        }
        if (this.streamAllocation == null) {
            throw new IllegalStateException("streamAllocation == null");
        }
        this.state = 5;
        this.streamAllocation.noNewStreams();
        return new UnknownLengthSource();
    }

    @Override // com.tencent.wechat.HttpCodec
    public ResponseBody openResponseBody(Response response) throws IOException {
        return new RealResponseBody(response.headers(), Okio.buffer(getTransferStream(response)));
    }

    public Headers readHeaders() throws IOException {
        Headers.Builder builder = new Headers.Builder();
        while (true) {
            String readUtf8LineStrict = this.source.readUtf8LineStrict();
            if (readUtf8LineStrict.length() == 0) {
                return builder.build();
            }
            Internal.instance.addLenient(builder, readUtf8LineStrict);
        }
    }

    @Override // com.tencent.wechat.HttpCodec
    public Response.Builder readResponseHeaders(boolean z2) throws IOException {
        if (this.state != STATE_OPEN_REQUEST_BODY && this.state != STATE_READ_RESPONSE_HEADERS) {
            throw new IllegalStateException("state: " + this.state);
        }
        try {
            StatusLine parse = StatusLine.parse(this.source.readUtf8LineStrict());
            Response.Builder headers = new Response.Builder().protocol(parse.protocol).code(parse.code).message(parse.message).headers(readHeaders());
            if (z2 && parse.code == 100) {
                return null;
            }
            this.state = 4;
            return headers;
        } catch (EOFException e2) {
            IOException iOException = new IOException("unexpected end of stream on " + this.streamAllocation);
            iOException.initCause(e2);
            throw iOException;
        }
    }

    public void writeRequest(Headers headers, String str) throws IOException {
        if (this.state != 0) {
            throw new IllegalStateException("state: " + this.state);
        }
        this.sink.writeUtf8(str).writeUtf8("\r\n");
        int size = headers.size();
        for (int i = STATE_IDLE; i < size; i += STATE_OPEN_REQUEST_BODY) {
            this.sink.writeUtf8(headers.name(i)).writeUtf8(": ").writeUtf8(headers.value(i)).writeUtf8("\r\n");
        }
        this.sink.writeUtf8("\r\n");
        this.state = STATE_OPEN_REQUEST_BODY;
    }

    @Override // com.tencent.wechat.HttpCodec
    public void writeRequestHeaders(Request request) throws IOException {
        writeRequest(request.headers(), RequestLine.get(request, this.streamAllocation.connection().route().proxy().type()));
    }
}
