package a;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* renamed from: a.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0074p {

    /* renamed from: a, reason: collision with root package name */
    public static final C0074p f1293a = new Object();

    public final OnBackInvokedCallback a(p1.a aVar) {
        q1.d.e(aVar, "onBackInvoked");
        return new C0073o(0, aVar);
    }

    public final void b(Object obj, int i, Object obj2) {
        q1.d.e(obj, "dispatcher");
        q1.d.e(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
    }

    public final void c(Object obj, Object obj2) {
        q1.d.e(obj, "dispatcher");
        q1.d.e(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
