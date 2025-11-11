package com;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class Timeout {
    public static final Timeout NONE = new Timeout() { // from class: com.Timeout.1
        @Override // com.Timeout
        public Timeout deadlineNanoTime(long j2) {
            return this;
        }

        @Override // com.Timeout
        public void throwIfReached() throws IOException {
        }

        @Override // com.Timeout
        public Timeout timeout(long j2, TimeUnit timeUnit) {
            return this;
        }
    };
    private long deadlineNanoTime;
    private boolean hasDeadline;
    private long timeoutNanos;

    public Timeout clearDeadline() {
        this.hasDeadline = false;
        return this;
    }

    public Timeout clearTimeout() {
        this.timeoutNanos = 0L;
        return this;
    }

    public final Timeout deadline(long j2, TimeUnit timeUnit) {
        if (j2 <= 0) {
            throw new IllegalArgumentException("duration <= 0: " + j2);
        }
        if (timeUnit == null) {
            throw new IllegalArgumentException("unit == null");
        }
        return deadlineNanoTime(System.nanoTime() + timeUnit.toNanos(j2));
    }

    public long deadlineNanoTime() {
        if (this.hasDeadline) {
            return this.deadlineNanoTime;
        }
        throw new IllegalStateException("No deadline");
    }

    public Timeout deadlineNanoTime(long j2) {
        this.hasDeadline = true;
        this.deadlineNanoTime = j2;
        return this;
    }

    public boolean hasDeadline() {
        return this.hasDeadline;
    }

    public void throwIfReached() throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("thread interrupted");
        }
        if (this.hasDeadline && this.deadlineNanoTime - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public Timeout timeout(long j2, TimeUnit timeUnit) {
        if (j2 < 0) {
            throw new IllegalArgumentException("timeout < 0: " + j2);
        }
        if (timeUnit == null) {
            throw new IllegalArgumentException("unit == null");
        }
        this.timeoutNanos = timeUnit.toNanos(j2);
        return this;
    }

    public long timeoutNanos() {
        return this.timeoutNanos;
    }

    public final void waitUntilNotified(Object obj) throws InterruptedIOException {
        long j2 = 0;
        try {
            boolean hasDeadline = hasDeadline();
            long timeoutNanos = timeoutNanos();
            if (!hasDeadline && timeoutNanos == 0) {
                obj.wait();
                return;
            }
            long nanoTime = System.nanoTime();
            if (hasDeadline && timeoutNanos != 0) {
                timeoutNanos = Math.min(timeoutNanos, deadlineNanoTime() - nanoTime);
            } else if (hasDeadline) {
                timeoutNanos = deadlineNanoTime() - nanoTime;
            }
            if (timeoutNanos > 0) {
                long j3 = timeoutNanos / 1000000;
                obj.wait(j3, (int) (timeoutNanos - (j3 * 1000000)));
                j2 = System.nanoTime() - nanoTime;
            }
            if (j2 >= timeoutNanos) {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException e2) {
            throw new InterruptedIOException("interrupted");
        }
    }
}
