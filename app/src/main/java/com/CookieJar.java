package com;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public interface CookieJar {
    public static final CookieJar NO_COOKIES = new CookieJar() { // from class: com.CookieJar.1
        @Override // com.CookieJar
        public List<Cookie> loadForRequest(HttpUrl httpUrl) {
            return Collections.emptyList();
        }

        @Override // com.CookieJar
        public void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
        }
    };

    List<Cookie> loadForRequest(HttpUrl httpUrl);

    void saveFromResponse(HttpUrl httpUrl, List<Cookie> list);
}
