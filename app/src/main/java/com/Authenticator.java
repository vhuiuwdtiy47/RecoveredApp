package com;

import java.io.IOException;

/* loaded from: classes.dex */
public interface Authenticator {
    public static final Authenticator NONE = new Authenticator() { // from class: com.Authenticator.1
        @Override // com.Authenticator
        public Request authenticate(Route route, Response response) {
            return null;
        }
    };

    Request authenticate(Route route, Response response) throws IOException;
}
