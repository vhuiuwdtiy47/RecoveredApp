package com.tencent.wechat;

import com.Buffer;
import com.BufferedSink;
import com.ByteString;
import com.Sink;
import com.Timeout;
import java.io.IOException;
import java.util.Random;

/* loaded from: classes.dex */
final class WebSocketWriter {
    static final /* synthetic */ boolean $assertionsDisabled;
    boolean activeWriter;
    final Buffer buffer = new Buffer();
    final FrameSink frameSink = new FrameSink();
    final boolean isClient;
    final byte[] maskBuffer;
    final byte[] maskKey;
    final Random random;
    final BufferedSink sink;
    boolean writerClosed;

    /* loaded from: classes.dex */
    final class FrameSink implements Sink {
        boolean closed;
        long contentLength;
        int formatOpcode;
        boolean isFirstFrame;

        FrameSink() {
        }

        @Override // com.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.closed) {
                throw new IOException("closed");
            }
            synchronized (WebSocketWriter.this) {
                WebSocketWriter.this.writeMessageFrameSynchronized(this.formatOpcode, WebSocketWriter.this.buffer.size(), this.isFirstFrame, true);
            }
            this.closed = true;
            WebSocketWriter.this.activeWriter = false;
        }

        @Override // com.Sink, java.io.Flushable
        public void flush() throws IOException {
            if (this.closed) {
                throw new IOException("closed");
            }
            synchronized (WebSocketWriter.this) {
                WebSocketWriter.this.writeMessageFrameSynchronized(this.formatOpcode, WebSocketWriter.this.buffer.size(), this.isFirstFrame, false);
            }
            this.isFirstFrame = false;
        }

        @Override // com.Sink
        public Timeout timeout() {
            return WebSocketWriter.this.sink.timeout();
        }

        @Override // com.Sink
        public void write(Buffer buffer, long j2) throws IOException {
            if (this.closed) {
                throw new IOException("closed");
            }
            WebSocketWriter.this.buffer.write(buffer, j2);
            boolean z2 = this.isFirstFrame && this.contentLength != -1 && WebSocketWriter.this.buffer.size() > this.contentLength - 8192;
            long completeSegmentByteCount = WebSocketWriter.this.buffer.completeSegmentByteCount();
            if (completeSegmentByteCount <= 0 || z2) {
                return;
            }
            synchronized (WebSocketWriter.this) {
                WebSocketWriter.this.writeMessageFrameSynchronized(this.formatOpcode, completeSegmentByteCount, this.isFirstFrame, false);
            }
            this.isFirstFrame = false;
        }
    }

    static {
        $assertionsDisabled = !WebSocketWriter.class.desiredAssertionStatus();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public WebSocketWriter(boolean z2, BufferedSink bufferedSink, Random random) {
        if (bufferedSink == null) {
            throw new NullPointerException("sink == null");
        }
        if (random == null) {
            throw new NullPointerException("random == null");
        }
        this.isClient = z2;
        this.sink = bufferedSink;
        this.random = random;
        this.maskKey = z2 ? new byte[4] : null;
        this.maskBuffer = z2 ? new byte[8192] : null;
    }

    private void writeControlFrameSynchronized(int i, ByteString byteString) throws IOException {
        if (!$assertionsDisabled && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        if (this.writerClosed) {
            throw new IOException("closed");
        }
        int size = byteString.size();
        if (size > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        this.sink.writeByte(i | 128);
        if (this.isClient) {
            this.sink.writeByte(size | 128);
            this.random.nextBytes(this.maskKey);
            this.sink.write(this.maskKey);
            byte[] byteArray = byteString.toByteArray();
            WebSocketProtocol.toggleMask(byteArray, byteArray.length, this.maskKey, 0L);
            this.sink.write(byteArray);
        } else {
            this.sink.writeByte(size);
            this.sink.write(byteString);
        }
        this.sink.flush();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Sink newMessageSink(int i, long j2) {
        if (this.activeWriter) {
            throw new IllegalStateException("Another message writer is active. Did you call close()?");
        }
        this.activeWriter = true;
        this.frameSink.formatOpcode = i;
        this.frameSink.contentLength = j2;
        this.frameSink.isFirstFrame = true;
        this.frameSink.closed = false;
        return this.frameSink;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writeClose(int i, ByteString byteString) throws IOException {
        ByteString byteString2 = ByteString.EMPTY;
        if (i != 0 || byteString != null) {
            if (i != 0) {
                WebSocketProtocol.validateCloseCode(i);
            }
            Buffer buffer = new Buffer();
            buffer.writeShort(i);
            if (byteString != null) {
                buffer.write(byteString);
            }
            byteString2 = buffer.readByteString();
        }
        synchronized (this) {
            try {
                writeControlFrameSynchronized(8, byteString2);
                this.writerClosed = true;
            } catch (Throwable th) {
                this.writerClosed = true;
                throw th;
            }
        }
    }

    void writeMessageFrameSynchronized(int i, long j2, boolean z2, boolean z3) throws IOException {
        if (!$assertionsDisabled && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        if (this.writerClosed) {
            throw new IOException("closed");
        }
        int i2 = z2 ? i : 0;
        if (z3) {
            i2 |= 128;
        }
        this.sink.writeByte(i2);
        int i3 = this.isClient ? 128 : 0;
        if (j2 <= 125) {
            this.sink.writeByte(i3 | ((int) j2));
        } else if (j2 <= 65535) {
            this.sink.writeByte(i3 | 126);
            this.sink.writeShort((int) j2);
        } else {
            this.sink.writeByte(i3 | 127);
            this.sink.writeLong(j2);
        }
        if (this.isClient) {
            this.random.nextBytes(this.maskKey);
            this.sink.write(this.maskKey);
            long j3 = 0;
            while (j3 < j2) {
                int read = this.buffer.read(this.maskBuffer, 0, (int) Math.min(j2, this.maskBuffer.length));
                if (read == -1) {
                    throw new AssertionError();
                }
                WebSocketProtocol.toggleMask(this.maskBuffer, read, this.maskKey, j3);
                this.sink.write(this.maskBuffer, 0, read);
                j3 += read;
            }
        } else {
            this.sink.write(this.buffer, j2);
        }
        this.sink.emit();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writePing(ByteString byteString) throws IOException {
        synchronized (this) {
            writeControlFrameSynchronized(9, byteString);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writePong(ByteString byteString) throws IOException {
        synchronized (this) {
            writeControlFrameSynchronized(10, byteString);
        }
    }
}
