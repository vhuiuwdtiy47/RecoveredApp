package com.tencent.wechat;

import com.Request;
import com.Response;
import java.io.IOException;

/* loaded from: classes.dex */
public interface InternalCache {
    Response get(Request request) throws IOException;

    CacheRequest put(Response response) throws IOException;

    void remove(Request request) throws IOException;

    void trackConditionalCacheHit();

    void trackResponse(CacheStrategy cacheStrategy);

    void update(Response response, Response response2);
}
