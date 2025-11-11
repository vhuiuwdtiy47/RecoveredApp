package com.tencent.wechat;

import com.Buffer;
import com.BufferedSink;
import com.BufferedSource;
import com.Headers;
import com.Interceptor;
import com.Okio;
import com.Protocol;
import com.Request;
import com.Response;
import com.Sink;
import com.Source;
import com.Timeout;
import com.tencent.Internal;
import com.tencent.Util;
import com.tencent.wechat.CacheStrategy;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class CacheInterceptor implements Interceptor {
    final InternalCache cache;

    public CacheInterceptor(InternalCache internalCache) {
        this.cache = internalCache;
    }

    private Response cacheWritingResponse(final CacheRequest cacheRequest, Response response) throws IOException {
        Sink body;
        if (cacheRequest == null || (body = cacheRequest.body()) == null) {
            return response;
        }
        final BufferedSource source = response.body().source();
        final BufferedSink buffer = Okio.buffer(body);
        return response.newBuilder().body(new RealResponseBody(response.headers(), Okio.buffer(new Source() { // from class: com.tencent.wechat.CacheInterceptor.1
            boolean cacheRequestClosed;

            @Override // com.Source, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                if (!this.cacheRequestClosed && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                    this.cacheRequestClosed = true;
                    cacheRequest.abort();
                }
                source.close();
            }

            @Override // com.Source
            public long read(Buffer buffer2, long j2) throws IOException {
                try {
                    long read = source.read(buffer2, j2);
                    if (read != -1) {
                        buffer2.copyTo(buffer.buffer(), buffer2.size() - read, read);
                        buffer.emitCompleteSegments();
                        return read;
                    }
                    if (!this.cacheRequestClosed) {
                        this.cacheRequestClosed = true;
                        buffer.close();
                    }
                    return -1L;
                } catch (IOException e2) {
                    if (!this.cacheRequestClosed) {
                        this.cacheRequestClosed = true;
                        cacheRequest.abort();
                    }
                    throw e2;
                }
            }

            @Override // com.Source
            public Timeout timeout() {
                return source.timeout();
            }
        }))).build();
    }

    private static Headers combine(Headers headers, Headers headers2) {
        Headers.Builder builder = new Headers.Builder();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            String name = headers.name(i);
            String value = headers.value(i);
            if ((!"Warning".equalsIgnoreCase(name) || !value.startsWith("1")) && (!isEndToEnd(name) || headers2.get(name) == null)) {
                Internal.instance.addLenient(builder, name, value);
            }
        }
        int size2 = headers2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            String name2 = headers2.name(i2);
            if (!"Content-Length".equalsIgnoreCase(name2) && isEndToEnd(name2)) {
                Internal.instance.addLenient(builder, name2, headers2.value(i2));
            }
        }
        return builder.build();
    }

    static boolean isEndToEnd(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    private static Response stripBody(Response response) {
        return (response == null || response.body() == null) ? response : response.newBuilder().body(null).build();
    }

    @Override // com.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Response response = this.cache != null ? this.cache.get(chain.request()) : null;
        CacheStrategy cacheStrategy = new CacheStrategy.Factory(System.currentTimeMillis(), chain.request(), response).get();
        Request request = cacheStrategy.networkRequest;
        Response response2 = cacheStrategy.cacheResponse;
        if (this.cache != null) {
            this.cache.trackResponse(cacheStrategy);
        }
        if (response != null && response2 == null) {
            Util.closeQuietly(response.body());
        }
        if (request == null && response2 == null) {
            return new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_1_1).code(504).message("Unsatisfiable Request (only-if-cached)").body(Util.EMPTY_RESPONSE).sentRequestAtMillis(-1L).receivedResponseAtMillis(System.currentTimeMillis()).build();
        }
        if (request == null) {
            return response2.newBuilder().cacheResponse(stripBody(response2)).build();
        }
        try {
            Response proceed = chain.proceed(request);
            if (proceed == null && response != null) {
                Util.closeQuietly(response.body());
            }
            if (response2 != null) {
                if (proceed.code() == 304) {
                    Response build = response2.newBuilder().headers(combine(response2.headers(), proceed.headers())).sentRequestAtMillis(proceed.sentRequestAtMillis()).receivedResponseAtMillis(proceed.receivedResponseAtMillis()).cacheResponse(stripBody(response2)).networkResponse(stripBody(proceed)).build();
                    proceed.body().close();
                    this.cache.trackConditionalCacheHit();
                    this.cache.update(response2, build);
                    return build;
                }
                Util.closeQuietly(response2.body());
            }
            Response build2 = proceed.newBuilder().cacheResponse(stripBody(response2)).networkResponse(stripBody(proceed)).build();
            if (this.cache == null) {
                return build2;
            }
            if (HttpHeaders.hasBody(build2) && CacheStrategy.isCacheable(build2, request)) {
                return cacheWritingResponse(this.cache.put(build2), build2);
            }
            if (!HttpMethod.invalidatesCache(request.method())) {
                return build2;
            }
            try {
                this.cache.remove(request);
                return build2;
            } catch (IOException e2) {
                return build2;
            }
        } catch (Throwable th) {
            if (0 == 0 && response != null) {
                Util.closeQuietly(response.body());
            }
            throw th;
        }
    }
}
