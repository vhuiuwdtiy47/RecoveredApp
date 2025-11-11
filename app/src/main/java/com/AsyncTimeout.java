package com;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class AsyncTimeout extends Timeout {
    private static final long IDLE_TIMEOUT_MILLIS = TimeUnit.SECONDS.toMillis(60);
    private static final long IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(IDLE_TIMEOUT_MILLIS);
    private static final int TIMEOUT_WRITE_SIZE = 65536;

    @Nullable
    static AsyncTimeout head;
    private boolean inQueue;

    @Nullable
    private AsyncTimeout next;
    private long timeoutAt;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class Watchdog extends Thread {
        Watchdog() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x001a, code lost:
        
            r0.timedOut();
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r3 = this;
            L0:
                java.lang.Class<com.AsyncTimeout> r1 = com.AsyncTimeout.class
                monitor-enter(r1)     // Catch: java.lang.InterruptedException -> Le
                com.AsyncTimeout r0 = com.AsyncTimeout.awaitTimeout()     // Catch: java.lang.Throwable -> Lb
                if (r0 != 0) goto L10
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
                goto L0
            Lb:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
                throw r0     // Catch: java.lang.InterruptedException -> Le
            Le:
                r0 = move-exception
                goto L0
            L10:
                com.AsyncTimeout r2 = com.AsyncTimeout.head     // Catch: java.lang.Throwable -> Lb
                if (r0 != r2) goto L19
                r0 = 0
                com.AsyncTimeout.head = r0     // Catch: java.lang.Throwable -> Lb
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
                return
            L19:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
                r0.timedOut()     // Catch: java.lang.InterruptedException -> Le
                goto L0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.AsyncTimeout.Watchdog.run():void");
        }
    }

    @Nullable
    static AsyncTimeout awaitTimeout() throws InterruptedException {
        AsyncTimeout asyncTimeout = head.next;
        if (asyncTimeout == null) {
            long nanoTime = System.nanoTime();
            AsyncTimeout.class.wait(IDLE_TIMEOUT_MILLIS);
            if (head.next != null || System.nanoTime() - nanoTime < IDLE_TIMEOUT_NANOS) {
                return null;
            }
            return head;
        }
        long remainingNanos = asyncTimeout.remainingNanos(System.nanoTime());
        if (remainingNanos > 0) {
            long j2 = remainingNanos / 1000000;
            AsyncTimeout.class.wait(j2, (int) (remainingNanos - (1000000 * j2)));
            return null;
        }
        head.next = asyncTimeout.next;
        asyncTimeout.next = null;
        return asyncTimeout;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000b, code lost:
    
        r0.next = r3.next;
        r3.next = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0012, code lost:
    
        r0 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static synchronized boolean cancelScheduledTimeout(com.AsyncTimeout r3) {
        /*
            java.lang.Class<com.AsyncTimeout> r1 = com.AsyncTimeout.class
            monitor-enter(r1)
            com.AsyncTimeout r0 = com.AsyncTimeout.head     // Catch: java.lang.Throwable -> L1a
        L5:
            if (r0 == 0) goto L18
            com.AsyncTimeout r2 = r0.next     // Catch: java.lang.Throwable -> L1a
            if (r2 != r3) goto L15
            com.AsyncTimeout r2 = r3.next     // Catch: java.lang.Throwable -> L1a
            r0.next = r2     // Catch: java.lang.Throwable -> L1a
            r0 = 0
            r3.next = r0     // Catch: java.lang.Throwable -> L1a
            r0 = 0
        L13:
            monitor-exit(r1)
            return r0
        L15:
            com.AsyncTimeout r0 = r0.next     // Catch: java.lang.Throwable -> L1a
            goto L5
        L18:
            r0 = 1
            goto L13
        L1a:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.AsyncTimeout.cancelScheduledTimeout(com.AsyncTimeout):boolean");
    }

    private long remainingNanos(long j2) {
        return this.timeoutAt - j2;
    }

    private static synchronized void scheduleTimeout(AsyncTimeout asyncTimeout, long j2, boolean z2) {
        synchronized (AsyncTimeout.class) {
            if (head == null) {
                head = new AsyncTimeout();
                new Watchdog().start();
            }
            long nanoTime = System.nanoTime();
            if (j2 != 0 && z2) {
                asyncTimeout.timeoutAt = Math.min(j2, asyncTimeout.deadlineNanoTime() - nanoTime) + nanoTime;
            } else if (j2 != 0) {
                asyncTimeout.timeoutAt = nanoTime + j2;
            } else {
                if (!z2) {
                    throw new AssertionError();
                }
                asyncTimeout.timeoutAt = asyncTimeout.deadlineNanoTime();
            }
            long remainingNanos = asyncTimeout.remainingNanos(nanoTime);
            AsyncTimeout asyncTimeout2 = head;
            while (asyncTimeout2.next != null && remainingNanos >= asyncTimeout2.next.remainingNanos(nanoTime)) {
                asyncTimeout2 = asyncTimeout2.next;
            }
            asyncTimeout.next = asyncTimeout2.next;
            asyncTimeout2.next = asyncTimeout;
            if (asyncTimeout2 == head) {
                AsyncTimeout.class.notify();
            }
        }
    }

    public final void enter() {
        if (this.inQueue) {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        long timeoutNanos = timeoutNanos();
        boolean hasDeadline = hasDeadline();
        if (timeoutNanos != 0 || hasDeadline) {
            this.inQueue = true;
            scheduleTimeout(this, timeoutNanos, hasDeadline);
        }
    }

    final IOException exit(IOException iOException) throws IOException {
        return !exit() ? iOException : newTimeoutException(iOException);
    }

    final void exit(boolean z2) throws IOException {
        if (exit() && z2) {
            throw newTimeoutException(null);
        }
    }

    public final boolean exit() {
        if (!this.inQueue) {
            return false;
        }
        this.inQueue = false;
        return cancelScheduledTimeout(this);
    }

    protected IOException newTimeoutException(@Nullable IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final Sink sink(final Sink sink) {
        return new Sink() { // from class: com.AsyncTimeout.1
            @Override // com.Sink, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                AsyncTimeout.this.enter();
                try {
                    try {
                        sink.close();
                        AsyncTimeout.this.exit(true);
                    } catch (IOException e2) {
                        throw AsyncTimeout.this.exit(e2);
                    }
                } catch (Throwable th) {
                    AsyncTimeout.this.exit(false);
                    throw th;
                }
            }

            @Override // com.Sink, java.io.Flushable
            public void flush() throws IOException {
                AsyncTimeout.this.enter();
                try {
                    try {
                        sink.flush();
                        AsyncTimeout.this.exit(true);
                    } catch (IOException e2) {
                        throw AsyncTimeout.this.exit(e2);
                    }
                } catch (Throwable th) {
                    AsyncTimeout.this.exit(false);
                    throw th;
                }
            }

            @Override // com.Sink
            public Timeout timeout() {
                return AsyncTimeout.this;
            }

            public String toString() {
                return "AsyncTimeout.sink(" + sink + ")";
            }

            @Override // com.Sink
            public void write(Buffer buffer, long j2) throws IOException {
                Util.checkOffsetAndCount(buffer.size, 0L, j2);
                long j3 = j2;
                while (j3 > 0) {
                    Segment segment = buffer.head;
                    long j4 = 0;
                    while (true) {
                        if (j4 >= 65536) {
                            break;
                        }
                        long j5 = (segment.limit - segment.pos) + j4;
                        if (j5 >= j3) {
                            j4 = j3;
                            break;
                        } else {
                            segment = segment.next;
                            j4 = j5;
                        }
                    }
                    AsyncTimeout.this.enter();
                    try {
                        try {
                            sink.write(buffer, j4);
                            j3 -= j4;
                            AsyncTimeout.this.exit(true);
                        } catch (IOException e2) {
                            throw AsyncTimeout.this.exit(e2);
                        }
                    } catch (Throwable th) {
                        AsyncTimeout.this.exit(false);
                        throw th;
                    }
                }
            }
        };
    }

    public final Source source(final Source source) {
        return new Source() { // from class: com.AsyncTimeout.2
            @Override // com.Source, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                try {
                    try {
                        source.close();
                        AsyncTimeout.this.exit(true);
                    } catch (IOException e2) {
                        throw AsyncTimeout.this.exit(e2);
                    }
                } catch (Throwable th) {
                    AsyncTimeout.this.exit(false);
                    throw th;
                }
            }

            @Override // com.Source
            public long read(Buffer buffer, long j2) throws IOException {
                AsyncTimeout.this.enter();
                try {
                    try {
                        long read = source.read(buffer, j2);
                        AsyncTimeout.this.exit(true);
                        return read;
                    } catch (IOException e2) {
                        throw AsyncTimeout.this.exit(e2);
                    }
                } catch (Throwable th) {
                    AsyncTimeout.this.exit(false);
                    throw th;
                }
            }

            @Override // com.Source
            public Timeout timeout() {
                return AsyncTimeout.this;
            }

            public String toString() {
                return "AsyncTimeout.source(" + source + ")";
            }
        };
    }

    protected void timedOut() {
    }
}
