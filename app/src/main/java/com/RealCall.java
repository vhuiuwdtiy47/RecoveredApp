package com;

import com.EventListener;
import com.tencent.NamedRunnable;
import com.tencent.wechat.BridgeInterceptor;
import com.tencent.wechat.CacheInterceptor;
import com.tencent.wechat.CallServerInterceptor;
import com.tencent.wechat.ConnectInterceptor;
import com.tencent.wechat.Platform;
import com.tencent.wechat.RealInterceptorChain;
import com.tencent.wechat.RetryAndFollowUpInterceptor;
import com.tencent.wechat.StreamAllocation;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class RealCall implements Call {
    final OkHttpClient client;
    final EventListener eventListener;
    private boolean executed;
    final boolean forWebSocket;
    final Request originalRequest;
    final RetryAndFollowUpInterceptor retryAndFollowUpInterceptor;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class AsyncCall extends NamedRunnable {
        private final Callback responseCallback;

        AsyncCall(Callback callback) {
            super("OkHttp %s", RealCall.this.redactedUrl());
            this.responseCallback = callback;
        }

        @Override // com.tencent.NamedRunnable
        protected void execute() {
            Response responseWithInterceptorChain;
            boolean z2 = true;
            try {
                try {
                    responseWithInterceptorChain = RealCall.this.getResponseWithInterceptorChain();
                } catch (IOException e2) {
                    e = e2;
                    z2 = false;
                }
                try {
                    if (RealCall.this.retryAndFollowUpInterceptor.isCanceled()) {
                        this.responseCallback.onFailure(RealCall.this, new IOException("Canceled"));
                    } else {
                        this.responseCallback.onResponse(RealCall.this, responseWithInterceptorChain);
                    }
                } catch (IOException e3) {
                    e = e3;
                    if (z2) {
                        Platform.get().log(4, "Callback failure for " + RealCall.this.toLoggableString(), e);
                    } else {
                        this.responseCallback.onFailure(RealCall.this, e);
                    }
                }
            } finally {
                RealCall.this.client.dispatcher().finished(this);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public RealCall get() {
            return RealCall.this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public String host() {
            return RealCall.this.originalRequest.url().host();
        }

        Request request() {
            return RealCall.this.originalRequest;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RealCall(OkHttpClient okHttpClient, Request request, boolean z2) {
        EventListener.Factory eventListenerFactory = okHttpClient.eventListenerFactory();
        this.client = okHttpClient;
        this.originalRequest = request;
        this.forWebSocket = z2;
        this.retryAndFollowUpInterceptor = new RetryAndFollowUpInterceptor(okHttpClient, z2);
        this.eventListener = eventListenerFactory.create(this);
    }

    private void captureCallStackTrace() {
        this.retryAndFollowUpInterceptor.setCallStackTrace(Platform.get().getStackTraceForCloseable("response.body().close()"));
    }

    @Override // com.Call
    public void cancel() {
        this.retryAndFollowUpInterceptor.cancel();
    }

    @Override // com.Call
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public RealCall m1clone() {
        return new RealCall(this.client, this.originalRequest, this.forWebSocket);
    }

    @Override // com.Call
    public void enqueue(Callback callback) {
        synchronized (this) {
            if (this.executed) {
                throw new IllegalStateException("Already Executed");
            }
            this.executed = true;
        }
        captureCallStackTrace();
        this.client.dispatcher().enqueue(new AsyncCall(callback));
    }

    @Override // com.Call
    public Response execute() throws IOException {
        synchronized (this) {
            if (this.executed) {
                throw new IllegalStateException("Already Executed");
            }
            this.executed = true;
        }
        captureCallStackTrace();
        try {
            this.client.dispatcher().executed(this);
            Response responseWithInterceptorChain = getResponseWithInterceptorChain();
            if (responseWithInterceptorChain == null) {
                throw new IOException("Canceled");
            }
            return responseWithInterceptorChain;
        } finally {
            this.client.dispatcher().finished(this);
        }
    }

    Response getResponseWithInterceptorChain() throws IOException {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.client.interceptors());
        arrayList.add(this.retryAndFollowUpInterceptor);
        arrayList.add(new BridgeInterceptor(this.client.cookieJar()));
        arrayList.add(new CacheInterceptor(this.client.internalCache()));
        arrayList.add(new ConnectInterceptor(this.client));
        if (!this.forWebSocket) {
            arrayList.addAll(this.client.networkInterceptors());
        }
        arrayList.add(new CallServerInterceptor(this.forWebSocket));
        return new RealInterceptorChain(arrayList, null, null, null, 0, this.originalRequest).proceed(this.originalRequest);
    }

    @Override // com.Call
    public boolean isCanceled() {
        return this.retryAndFollowUpInterceptor.isCanceled();
    }

    @Override // com.Call
    public synchronized boolean isExecuted() {
        return this.executed;
    }

    String redactedUrl() {
        return this.originalRequest.url().redact();
    }

    @Override // com.Call
    public Request request() {
        return this.originalRequest;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public StreamAllocation streamAllocation() {
        return this.retryAndFollowUpInterceptor.streamAllocation();
    }

    String toLoggableString() {
        return (isCanceled() ? "canceled " : "") + (this.forWebSocket ? "web socket" : "call") + " to " + redactedUrl();
    }
}
