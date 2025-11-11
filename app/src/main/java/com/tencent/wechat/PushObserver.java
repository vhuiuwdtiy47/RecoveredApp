package com.tencent.wechat;

import com.BufferedSource;
import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public interface PushObserver {
    public static final PushObserver CANCEL = new PushObserver() { // from class: com.tencent.wechat.PushObserver.1
        @Override // com.tencent.wechat.PushObserver
        public boolean onData(int i, BufferedSource bufferedSource, int i2, boolean z2) throws IOException {
            bufferedSource.skip(i2);
            return true;
        }

        @Override // com.tencent.wechat.PushObserver
        public boolean onHeaders(int i, List<Header> list, boolean z2) {
            return true;
        }

        @Override // com.tencent.wechat.PushObserver
        public boolean onRequest(int i, List<Header> list) {
            return true;
        }

        @Override // com.tencent.wechat.PushObserver
        public void onReset(int i, ErrorCode errorCode) {
        }
    };

    boolean onData(int i, BufferedSource bufferedSource, int i2, boolean z2) throws IOException;

    boolean onHeaders(int i, List<Header> list, boolean z2);

    boolean onRequest(int i, List<Header> list);

    void onReset(int i, ErrorCode errorCode);
}
