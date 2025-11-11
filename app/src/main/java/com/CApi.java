package com;

import com.Request;
import java.io.IOException;

/* loaded from: classes.dex */
public class CApi {

    /* loaded from: classes.dex */
    public interface CallBack {
        void Error(String str);

        void Result(String str);
    }

    public static synchronized void Login(CallBack callBack, String str) {
        synchronized (CApi.class) {
            new OkHttpClient().newCall(new Request.Builder().url(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(Segmenr.Url).append("?a=").toString()).append(str).toString()).append("&b=").toString()).append(Type.Imei).toString()).build()).enqueue(new Callback(callBack) { // from class: com.CApi.100000000
                private final CallBack val$callback;

                {
                    this.val$callback = callBack;
                }

                @Override // com.Callback
                public void onFailure(Call call, IOException iOException) {
                    this.val$callback.Error(iOException.getMessage());
                }

                @Override // com.Callback
                public void onResponse(Call call, Response response) throws IOException {
                    this.val$callback.Result(response.body().string());
                }
            });
        }
    }
}
