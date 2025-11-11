package com;

import java.net.InetAddress;
import java.util.List;

/* loaded from: classes.dex */
abstract class EventListener {
    public static final EventListener NONE = new EventListener() { // from class: com.EventListener.1
    };

    /* loaded from: classes.dex */
    public interface Factory {
        EventListener create(Call call);
    }

    EventListener() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Factory factory(EventListener eventListener) {
        return new Factory() { // from class: com.EventListener.2
            @Override // com.EventListener.Factory
            public EventListener create(Call call) {
                return EventListener.this;
            }
        };
    }

    public void connectEnd(Call call, InetAddress inetAddress, int i, String str, Throwable th) {
    }

    public void connectStart(Call call, InetAddress inetAddress, int i) {
    }

    public void dnsEnd(Call call, String str, List<InetAddress> list, Throwable th) {
    }

    public void dnsStart(Call call, String str) {
    }

    public void fetchEnd(Call call, Throwable th) {
    }

    public void fetchStart(Call call) {
    }

    public void requestBodyEnd(Call call, Throwable th) {
    }

    public void requestBodyStart(Call call) {
    }

    public void requestHeadersEnd(Call call, Throwable th) {
    }

    public void requestHeadersStart(Call call) {
    }

    public void responseBodyEnd(Call call, Throwable th) {
    }

    public void responseBodyStart(Call call) {
    }

    public void responseHeadersEnd(Call call, Throwable th) {
    }

    public void responseHeadersStart(Call call) {
    }

    public void secureConnectEnd(Call call, Handshake handshake, Throwable th) {
    }

    public void secureConnectStart(Call call) {
    }
}
