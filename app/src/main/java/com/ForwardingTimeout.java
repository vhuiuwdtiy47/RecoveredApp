package com;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class ForwardingTimeout extends Timeout {
    private Timeout delegate;

    public ForwardingTimeout(Timeout timeout) {
        if (timeout == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.delegate = timeout;
    }

    @Override // com.Timeout
    public Timeout clearDeadline() {
        return this.delegate.clearDeadline();
    }

    @Override // com.Timeout
    public Timeout clearTimeout() {
        return this.delegate.clearTimeout();
    }

    @Override // com.Timeout
    public long deadlineNanoTime() {
        return this.delegate.deadlineNanoTime();
    }

    @Override // com.Timeout
    public Timeout deadlineNanoTime(long j2) {
        return this.delegate.deadlineNanoTime(j2);
    }

    public final Timeout delegate() {
        return this.delegate;
    }

    @Override // com.Timeout
    public boolean hasDeadline() {
        return this.delegate.hasDeadline();
    }

    public final ForwardingTimeout setDelegate(Timeout timeout) {
        if (timeout == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.delegate = timeout;
        return this;
    }

    @Override // com.Timeout
    public void throwIfReached() throws IOException {
        this.delegate.throwIfReached();
    }

    @Override // com.Timeout
    public Timeout timeout(long j2, TimeUnit timeUnit) {
        return this.delegate.timeout(j2, timeUnit);
    }

    @Override // com.Timeout
    public long timeoutNanos() {
        return this.delegate.timeoutNanos();
    }
}
