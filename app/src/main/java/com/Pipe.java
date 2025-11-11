package com;

import java.io.IOException;

/* loaded from: classes.dex */
public final class Pipe {
    final long maxBufferSize;
    boolean sinkClosed;
    boolean sourceClosed;
    final Buffer buffer = new Buffer();
    private final Sink sink = new PipeSink();
    private final Source source = new PipeSource();

    /* loaded from: classes.dex */
    final class PipeSink implements Sink {
        final Timeout timeout = new Timeout();

        PipeSink() {
        }

        @Override // com.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            synchronized (Pipe.this.buffer) {
                if (Pipe.this.sinkClosed) {
                    return;
                }
                if (Pipe.this.sourceClosed && Pipe.this.buffer.size() > 0) {
                    throw new IOException("source is closed");
                }
                Pipe.this.sinkClosed = true;
                Pipe.this.buffer.notifyAll();
            }
        }

        @Override // com.Sink, java.io.Flushable
        public void flush() throws IOException {
            synchronized (Pipe.this.buffer) {
                if (Pipe.this.sinkClosed) {
                    throw new IllegalStateException("closed");
                }
                if (Pipe.this.sourceClosed && Pipe.this.buffer.size() > 0) {
                    throw new IOException("source is closed");
                }
            }
        }

        @Override // com.Sink
        public Timeout timeout() {
            return this.timeout;
        }

        @Override // com.Sink
        public void write(Buffer buffer, long j2) throws IOException {
            synchronized (Pipe.this.buffer) {
                if (Pipe.this.sinkClosed) {
                    throw new IllegalStateException("closed");
                }
                while (j2 > 0) {
                    if (Pipe.this.sourceClosed) {
                        throw new IOException("source is closed");
                    }
                    long size = Pipe.this.maxBufferSize - Pipe.this.buffer.size();
                    if (size == 0) {
                        this.timeout.waitUntilNotified(Pipe.this.buffer);
                    } else {
                        long min = Math.min(size, j2);
                        Pipe.this.buffer.write(buffer, min);
                        j2 -= min;
                        Pipe.this.buffer.notifyAll();
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    final class PipeSource implements Source {
        final Timeout timeout = new Timeout();

        PipeSource() {
        }

        @Override // com.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            synchronized (Pipe.this.buffer) {
                Pipe.this.sourceClosed = true;
                Pipe.this.buffer.notifyAll();
            }
        }

        @Override // com.Source
        public long read(Buffer buffer, long j2) throws IOException {
            long read;
            synchronized (Pipe.this.buffer) {
                if (Pipe.this.sourceClosed) {
                    throw new IllegalStateException("closed");
                }
                while (true) {
                    if (Pipe.this.buffer.size() != 0) {
                        read = Pipe.this.buffer.read(buffer, j2);
                        Pipe.this.buffer.notifyAll();
                        break;
                    }
                    if (Pipe.this.sinkClosed) {
                        read = -1;
                        break;
                    }
                    this.timeout.waitUntilNotified(Pipe.this.buffer);
                }
                return read;
            }
        }

        @Override // com.Source
        public Timeout timeout() {
            return this.timeout;
        }
    }

    public Pipe(long j2) {
        if (j2 < 1) {
            throw new IllegalArgumentException("maxBufferSize < 1: " + j2);
        }
        this.maxBufferSize = j2;
    }

    public final Sink sink() {
        return this.sink;
    }

    public final Source source() {
        return this.source;
    }
}
