package com.tencent.wechat;

import com.BufferedSink;
import com.Interceptor;
import com.Okio;
import com.Request;
import com.Response;
import com.tencent.Util;
import java.io.IOException;
import java.net.ProtocolException;

/* loaded from: classes.dex */
public final class CallServerInterceptor implements Interceptor {
    private final boolean forWebSocket;

    public CallServerInterceptor(boolean z2) {
        this.forWebSocket = z2;
    }

    @Override // com.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Response.Builder builder;
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        HttpCodec httpStream = realInterceptorChain.httpStream();
        StreamAllocation streamAllocation = realInterceptorChain.streamAllocation();
        RealConnection realConnection = (RealConnection) realInterceptorChain.connection();
        Request request = realInterceptorChain.request();
        long currentTimeMillis = System.currentTimeMillis();
        httpStream.writeRequestHeaders(request);
        Response.Builder builder2 = null;
        if (!HttpMethod.permitsRequestBody(request.method()) || request.body() == null) {
            builder = null;
        } else {
            if ("100-continue".equalsIgnoreCase(request.header("Expect"))) {
                httpStream.flushRequest();
                builder2 = httpStream.readResponseHeaders(true);
            }
            if (builder2 == null) {
                BufferedSink buffer = Okio.buffer(httpStream.createRequestBody(request, request.body().contentLength()));
                request.body().writeTo(buffer);
                buffer.close();
                builder = builder2;
            } else {
                if (!realConnection.isMultiplexed()) {
                    streamAllocation.noNewStreams();
                }
                builder = builder2;
            }
        }
        httpStream.finishRequest();
        if (builder == null) {
            builder = httpStream.readResponseHeaders(false);
        }
        Response build = builder.request(request).handshake(streamAllocation.connection().handshake()).sentRequestAtMillis(currentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
        int code = build.code();
        Response build2 = (this.forWebSocket && code == 101) ? build.newBuilder().body(Util.EMPTY_RESPONSE).build() : build.newBuilder().body(httpStream.openResponseBody(build)).build();
        if ("close".equalsIgnoreCase(build2.request().header("Connection")) || "close".equalsIgnoreCase(build2.header("Connection"))) {
            streamAllocation.noNewStreams();
        }
        if ((code == 204 || code == 205) && build2.body().contentLength() > 0) {
            throw new ProtocolException("HTTP " + code + " had non-zero Content-Length: " + build2.body().contentLength());
        }
        return build2;
    }
}
