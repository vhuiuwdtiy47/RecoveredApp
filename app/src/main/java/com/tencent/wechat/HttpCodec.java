package com.tencent.wechat;

import com.Request;
import com.Response;
import com.ResponseBody;
import com.Sink;
import java.io.IOException;

/* loaded from: classes.dex */
public interface HttpCodec {
    public static final int DISCARD_STREAM_TIMEOUT_MILLIS = 100;

    void cancel();

    Sink createRequestBody(Request request, long j2);

    void finishRequest() throws IOException;

    void flushRequest() throws IOException;

    ResponseBody openResponseBody(Response response) throws IOException;

    Response.Builder readResponseHeaders(boolean z2) throws IOException;

    void writeRequestHeaders(Request request) throws IOException;
}
