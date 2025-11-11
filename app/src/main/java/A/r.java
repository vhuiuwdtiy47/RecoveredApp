package a;

import android.window.OnBackInvokedCallback;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final r f1297a = new Object();

    public final OnBackInvokedCallback a(p1.l lVar, p1.l lVar2, p1.a aVar, p1.a aVar2) {
        q1.d.e(lVar, "onBackStarted");
        q1.d.e(lVar2, "onBackProgressed");
        q1.d.e(aVar, "onBackInvoked");
        q1.d.e(aVar2, "onBackCancelled");
        return new C0075q(lVar, lVar2, aVar, aVar2);
    }
}
