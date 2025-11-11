package com.tencent.wechat;

import com.AsyncTimeout;
import com.Buffer;
import com.BufferedSource;
import com.Sink;
import com.Source;
import com.Timeout;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class Http2Stream {
    static final /* synthetic */ boolean $assertionsDisabled;
    long bytesLeftInWriteWindow;
    final Http2Connection connection;
    private boolean hasResponseHeaders;
    final int id;
    private final List<Header> requestHeaders;
    private List<Header> responseHeaders;
    final FramingSink sink;
    private final FramingSource source;
    long unacknowledgedBytesRead = 0;
    final StreamTimeout readTimeout = new StreamTimeout();
    final StreamTimeout writeTimeout = new StreamTimeout();
    ErrorCode errorCode = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class FramingSink implements Sink {
        static final /* synthetic */ boolean $assertionsDisabled;
        private static final long EMIT_BUFFER_SIZE = 16384;
        boolean closed;
        boolean finished;
        private final Buffer sendBuffer = new Buffer();

        static {
            $assertionsDisabled = !Http2Stream.class.desiredAssertionStatus() ? true : $assertionsDisabled;
        }

        FramingSink() {
        }

        private void emitFrame(boolean z2) throws IOException {
            long min;
            synchronized (Http2Stream.this) {
                Http2Stream.this.writeTimeout.enter();
                while (Http2Stream.this.bytesLeftInWriteWindow <= 0 && !this.finished && !this.closed && Http2Stream.this.errorCode == null) {
                    try {
                        Http2Stream.this.waitForIo();
                    } finally {
                    }
                }
                Http2Stream.this.writeTimeout.exitAndThrowIfTimedOut();
                Http2Stream.this.checkOutNotClosed();
                min = Math.min(Http2Stream.this.bytesLeftInWriteWindow, this.sendBuffer.size());
                Http2Stream.this.bytesLeftInWriteWindow -= min;
            }
            Http2Stream.this.writeTimeout.enter();
            try {
                Http2Stream.this.connection.writeData(Http2Stream.this.id, (z2 && min == this.sendBuffer.size()) ? true : $assertionsDisabled, this.sendBuffer, min);
            } finally {
            }
        }

        @Override // com.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (!$assertionsDisabled && Thread.holdsLock(Http2Stream.this)) {
                throw new AssertionError();
            }
            synchronized (Http2Stream.this) {
                if (this.closed) {
                    return;
                }
                if (!Http2Stream.this.sink.finished) {
                    if (this.sendBuffer.size() > 0) {
                        while (this.sendBuffer.size() > 0) {
                            emitFrame(true);
                        }
                    } else {
                        Http2Stream.this.connection.writeData(Http2Stream.this.id, true, null, 0L);
                    }
                }
                synchronized (Http2Stream.this) {
                    this.closed = true;
                }
                Http2Stream.this.connection.flush();
                Http2Stream.this.cancelStreamIfNecessary();
            }
        }

        @Override // com.Sink, java.io.Flushable
        public void flush() throws IOException {
            if (!$assertionsDisabled && Thread.holdsLock(Http2Stream.this)) {
                throw new AssertionError();
            }
            synchronized (Http2Stream.this) {
                Http2Stream.this.checkOutNotClosed();
            }
            while (this.sendBuffer.size() > 0) {
                emitFrame($assertionsDisabled);
                Http2Stream.this.connection.flush();
            }
        }

        @Override // com.Sink
        public Timeout timeout() {
            return Http2Stream.this.writeTimeout;
        }

        @Override // com.Sink
        public void write(Buffer buffer, long j2) throws IOException {
            if (!$assertionsDisabled && Thread.holdsLock(Http2Stream.this)) {
                throw new AssertionError();
            }
            this.sendBuffer.write(buffer, j2);
            while (this.sendBuffer.size() >= EMIT_BUFFER_SIZE) {
                emitFrame($assertionsDisabled);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class FramingSource implements Source {
        static final /* synthetic */ boolean $assertionsDisabled;
        boolean closed;
        boolean finished;
        private final long maxByteCount;
        private final Buffer receiveBuffer = new Buffer();
        private final Buffer readBuffer = new Buffer();

        static {
            $assertionsDisabled = !Http2Stream.class.desiredAssertionStatus();
        }

        FramingSource(long j2) {
            this.maxByteCount = j2;
        }

        private void checkNotClosed() throws IOException {
            if (this.closed) {
                throw new IOException("stream closed");
            }
            if (Http2Stream.this.errorCode != null) {
                throw new StreamResetException(Http2Stream.this.errorCode);
            }
        }

        private void waitUntilReadable() throws IOException {
            Http2Stream.this.readTimeout.enter();
            while (this.readBuffer.size() == 0 && !this.finished && !this.closed && Http2Stream.this.errorCode == null) {
                try {
                    Http2Stream.this.waitForIo();
                } finally {
                    Http2Stream.this.readTimeout.exitAndThrowIfTimedOut();
                }
            }
        }

        @Override // com.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            synchronized (Http2Stream.this) {
                this.closed = true;
                this.readBuffer.clear();
                Http2Stream.this.notifyAll();
            }
            Http2Stream.this.cancelStreamIfNecessary();
        }

        @Override // com.Source
        public long read(Buffer buffer, long j2) throws IOException {
            long read;
            if (j2 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j2);
            }
            synchronized (Http2Stream.this) {
                waitUntilReadable();
                checkNotClosed();
                if (this.readBuffer.size() == 0) {
                    read = -1;
                } else {
                    read = this.readBuffer.read(buffer, Math.min(j2, this.readBuffer.size()));
                    Http2Stream.this.unacknowledgedBytesRead += read;
                    if (Http2Stream.this.unacknowledgedBytesRead >= Http2Stream.this.connection.okHttpSettings.getInitialWindowSize() / 2) {
                        Http2Stream.this.connection.writeWindowUpdateLater(Http2Stream.this.id, Http2Stream.this.unacknowledgedBytesRead);
                        Http2Stream.this.unacknowledgedBytesRead = 0L;
                    }
                    synchronized (Http2Stream.this.connection) {
                        Http2Stream.this.connection.unacknowledgedBytesRead += read;
                        if (Http2Stream.this.connection.unacknowledgedBytesRead >= Http2Stream.this.connection.okHttpSettings.getInitialWindowSize() / 2) {
                            Http2Stream.this.connection.writeWindowUpdateLater(0, Http2Stream.this.connection.unacknowledgedBytesRead);
                            Http2Stream.this.connection.unacknowledgedBytesRead = 0L;
                        }
                    }
                }
            }
            return read;
        }

        void receive(BufferedSource bufferedSource, long j2) throws IOException {
            boolean z2;
            boolean z3;
            if (!$assertionsDisabled && Thread.holdsLock(Http2Stream.this)) {
                throw new AssertionError();
            }
            while (j2 > 0) {
                synchronized (Http2Stream.this) {
                    z2 = this.finished;
                    z3 = this.readBuffer.size() + j2 > this.maxByteCount;
                }
                if (z3) {
                    bufferedSource.skip(j2);
                    Http2Stream.this.closeLater(ErrorCode.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z2) {
                    bufferedSource.skip(j2);
                    return;
                }
                long read = bufferedSource.read(this.receiveBuffer, j2);
                if (read == -1) {
                    throw new EOFException();
                }
                j2 -= read;
                synchronized (Http2Stream.this) {
                    boolean z4 = this.readBuffer.size() == 0;
                    this.readBuffer.writeAll(this.receiveBuffer);
                    if (z4) {
                        Http2Stream.this.notifyAll();
                    }
                }
            }
        }

        @Override // com.Source
        public Timeout timeout() {
            return Http2Stream.this.readTimeout;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class StreamTimeout extends AsyncTimeout {
        StreamTimeout() {
        }

        public void exitAndThrowIfTimedOut() throws IOException {
            if (exit()) {
                throw newTimeoutException(null);
            }
        }

        @Override // com.AsyncTimeout
        protected IOException newTimeoutException(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // com.AsyncTimeout
        protected void timedOut() {
            Http2Stream.this.closeLater(ErrorCode.CANCEL);
        }
    }

    static {
        $assertionsDisabled = !Http2Stream.class.desiredAssertionStatus();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Http2Stream(int i, Http2Connection http2Connection, boolean z2, boolean z3, List<Header> list) {
        if (http2Connection == null) {
            throw new NullPointerException("connection == null");
        }
        if (list == null) {
            throw new NullPointerException("requestHeaders == null");
        }
        this.id = i;
        this.connection = http2Connection;
        this.bytesLeftInWriteWindow = http2Connection.peerSettings.getInitialWindowSize();
        this.source = new FramingSource(http2Connection.okHttpSettings.getInitialWindowSize());
        this.sink = new FramingSink();
        this.source.finished = z3;
        this.sink.finished = z2;
        this.requestHeaders = list;
    }

    private boolean closeInternal(ErrorCode errorCode) {
        if (!$assertionsDisabled && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            if (this.errorCode != null) {
                return false;
            }
            if (this.source.finished && this.sink.finished) {
                return false;
            }
            this.errorCode = errorCode;
            notifyAll();
            this.connection.removeStream(this.id);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addBytesToWriteWindow(long j2) {
        this.bytesLeftInWriteWindow += j2;
        if (j2 > 0) {
            notifyAll();
        }
    }

    void cancelStreamIfNecessary() throws IOException {
        boolean z2;
        boolean isOpen;
        if (!$assertionsDisabled && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            z2 = !this.source.finished && this.source.closed && (this.sink.finished || this.sink.closed);
            isOpen = isOpen();
        }
        if (z2) {
            close(ErrorCode.CANCEL);
        } else {
            if (isOpen) {
                return;
            }
            this.connection.removeStream(this.id);
        }
    }

    void checkOutNotClosed() throws IOException {
        if (this.sink.closed) {
            throw new IOException("stream closed");
        }
        if (this.sink.finished) {
            throw new IOException("stream finished");
        }
        if (this.errorCode != null) {
            throw new StreamResetException(this.errorCode);
        }
    }

    public void close(ErrorCode errorCode) throws IOException {
        if (closeInternal(errorCode)) {
            this.connection.writeSynReset(this.id, errorCode);
        }
    }

    public void closeLater(ErrorCode errorCode) {
        if (closeInternal(errorCode)) {
            this.connection.writeSynResetLater(this.id, errorCode);
        }
    }

    public Http2Connection getConnection() {
        return this.connection;
    }

    public synchronized ErrorCode getErrorCode() {
        return this.errorCode;
    }

    public int getId() {
        return this.id;
    }

    public List<Header> getRequestHeaders() {
        return this.requestHeaders;
    }

    public Sink getSink() {
        synchronized (this) {
            if (!this.hasResponseHeaders && !isLocallyInitiated()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.sink;
    }

    public Source getSource() {
        return this.source;
    }

    public boolean isLocallyInitiated() {
        return this.connection.client == ((this.id & 1) == 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0022, code lost:
    
        if (r2.hasResponseHeaders == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean isOpen() {
        /*
            r2 = this;
            r0 = 0
            monitor-enter(r2)
            com.tencent.wechat.ErrorCode r1 = r2.errorCode     // Catch: java.lang.Throwable -> L26
            if (r1 == 0) goto L8
        L6:
            monitor-exit(r2)
            return r0
        L8:
            com.tencent.wechat.Http2Stream$FramingSource r1 = r2.source     // Catch: java.lang.Throwable -> L26
            boolean r1 = r1.finished     // Catch: java.lang.Throwable -> L26
            if (r1 != 0) goto L14
            com.tencent.wechat.Http2Stream$FramingSource r1 = r2.source     // Catch: java.lang.Throwable -> L26
            boolean r1 = r1.closed     // Catch: java.lang.Throwable -> L26
            if (r1 == 0) goto L24
        L14:
            com.tencent.wechat.Http2Stream$FramingSink r1 = r2.sink     // Catch: java.lang.Throwable -> L26
            boolean r1 = r1.finished     // Catch: java.lang.Throwable -> L26
            if (r1 != 0) goto L20
            com.tencent.wechat.Http2Stream$FramingSink r1 = r2.sink     // Catch: java.lang.Throwable -> L26
            boolean r1 = r1.closed     // Catch: java.lang.Throwable -> L26
            if (r1 == 0) goto L24
        L20:
            boolean r1 = r2.hasResponseHeaders     // Catch: java.lang.Throwable -> L26
            if (r1 != 0) goto L6
        L24:
            r0 = 1
            goto L6
        L26:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wechat.Http2Stream.isOpen():boolean");
    }

    public Timeout readTimeout() {
        return this.readTimeout;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void receiveData(BufferedSource bufferedSource, int i) throws IOException {
        if (!$assertionsDisabled && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        this.source.receive(bufferedSource, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void receiveFin() {
        boolean isOpen;
        if (!$assertionsDisabled && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            this.source.finished = true;
            isOpen = isOpen();
            notifyAll();
        }
        if (isOpen) {
            return;
        }
        this.connection.removeStream(this.id);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void receiveHeaders(List<Header> list) {
        boolean z2 = true;
        if (!$assertionsDisabled && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            this.hasResponseHeaders = true;
            if (this.responseHeaders == null) {
                this.responseHeaders = list;
                z2 = isOpen();
                notifyAll();
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.responseHeaders);
                arrayList.add(null);
                arrayList.addAll(list);
                this.responseHeaders = arrayList;
            }
        }
        if (z2) {
            return;
        }
        this.connection.removeStream(this.id);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void receiveRstStream(ErrorCode errorCode) {
        if (this.errorCode == null) {
            this.errorCode = errorCode;
            notifyAll();
        }
    }

    public void sendResponseHeaders(List<Header> list, boolean z2) throws IOException {
        boolean z3 = true;
        if (!$assertionsDisabled && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        if (list == null) {
            throw new NullPointerException("responseHeaders == null");
        }
        synchronized (this) {
            this.hasResponseHeaders = true;
            if (z2) {
                z3 = false;
            } else {
                this.sink.finished = true;
            }
        }
        this.connection.writeSynReply(this.id, z3, list);
        if (z3) {
            this.connection.flush();
        }
    }

    public synchronized List<Header> takeResponseHeaders() throws IOException {
        List<Header> list;
        if (!isLocallyInitiated()) {
            throw new IllegalStateException("servers cannot read response headers");
        }
        this.readTimeout.enter();
        while (this.responseHeaders == null && this.errorCode == null) {
            try {
                waitForIo();
            } catch (Throwable th) {
                this.readTimeout.exitAndThrowIfTimedOut();
                throw th;
            }
        }
        this.readTimeout.exitAndThrowIfTimedOut();
        list = this.responseHeaders;
        if (list == null) {
            throw new StreamResetException(this.errorCode);
        }
        this.responseHeaders = null;
        return list;
    }

    void waitForIo() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException e2) {
            throw new InterruptedIOException();
        }
    }

    public Timeout writeTimeout() {
        return this.writeTimeout;
    }
}
