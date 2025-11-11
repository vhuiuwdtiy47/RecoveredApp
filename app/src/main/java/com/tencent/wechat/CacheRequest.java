package com.tencent.wechat;

import com.Sink;
import java.io.IOException;

/* loaded from: classes.dex */
public interface CacheRequest {
    void abort();

    Sink body() throws IOException;
}
