package com.tencent.wechat;

import com.BufferedSource;
import com.Headers;
import com.MediaType;
import com.ResponseBody;

/* loaded from: classes.dex */
public final class RealResponseBody extends ResponseBody {
    private final Headers headers;
    private final BufferedSource source;

    public RealResponseBody(Headers headers, BufferedSource bufferedSource) {
        this.headers = headers;
        this.source = bufferedSource;
    }

    @Override // com.ResponseBody
    public long contentLength() {
        return HttpHeaders.contentLength(this.headers);
    }

    @Override // com.ResponseBody
    public MediaType contentType() {
        String str = this.headers.get("Content-Type");
        if (str != null) {
            return MediaType.parse(str);
        }
        return null;
    }

    @Override // com.ResponseBody
    public BufferedSource source() {
        return this.source;
    }
}
