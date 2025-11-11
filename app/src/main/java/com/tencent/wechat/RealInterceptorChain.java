package com.tencent.wechat;

import com.Connection;
import com.Interceptor;
import com.Request;
import com.Response;
import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public final class RealInterceptorChain implements Interceptor.Chain {
    private int calls;
    private final RealConnection connection;
    private final HttpCodec httpCodec;
    private final int index;
    private final List<Interceptor> interceptors;
    private final Request request;
    private final StreamAllocation streamAllocation;

    public RealInterceptorChain(List<Interceptor> list, StreamAllocation streamAllocation, HttpCodec httpCodec, RealConnection realConnection, int i, Request request) {
        this.interceptors = list;
        this.connection = realConnection;
        this.streamAllocation = streamAllocation;
        this.httpCodec = httpCodec;
        this.index = i;
        this.request = request;
    }

    @Override // com.Interceptor.Chain
    public Connection connection() {
        return this.connection;
    }

    public HttpCodec httpStream() {
        return this.httpCodec;
    }

    @Override // com.Interceptor.Chain
    public Response proceed(Request request) throws IOException {
        return proceed(request, this.streamAllocation, this.httpCodec, this.connection);
    }

    public Response proceed(Request request, StreamAllocation streamAllocation, HttpCodec httpCodec, RealConnection realConnection) throws IOException {
        if (this.index >= this.interceptors.size()) {
            throw new AssertionError();
        }
        this.calls++;
        if (this.httpCodec != null && !this.connection.supportsUrl(request.url())) {
            throw new IllegalStateException("network interceptor " + this.interceptors.get(this.index - 1) + " must retain the same host and port");
        }
        if (this.httpCodec != null && this.calls > 1) {
            throw new IllegalStateException("network interceptor " + this.interceptors.get(this.index - 1) + " must call proceed() exactly once");
        }
        RealInterceptorChain realInterceptorChain = new RealInterceptorChain(this.interceptors, streamAllocation, httpCodec, realConnection, this.index + 1, request);
        Interceptor interceptor = this.interceptors.get(this.index);
        Response intercept = interceptor.intercept(realInterceptorChain);
        if (httpCodec != null && this.index + 1 < this.interceptors.size() && realInterceptorChain.calls != 1) {
            throw new IllegalStateException("network interceptor " + interceptor + " must call proceed() exactly once");
        }
        if (intercept == null) {
            throw new NullPointerException("interceptor " + interceptor + " returned null");
        }
        return intercept;
    }

    @Override // com.Interceptor.Chain
    public Request request() {
        return this.request;
    }

    public StreamAllocation streamAllocation() {
        return this.streamAllocation;
    }
}
