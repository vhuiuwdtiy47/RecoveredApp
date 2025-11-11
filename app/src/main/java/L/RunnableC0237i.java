package l;

import android.view.View;

/* renamed from: l.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0237i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final C0233g f3082a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0243l f3083b;

    public RunnableC0237i(C0243l c0243l, C0233g c0233g) {
        this.f3083b = c0243l;
        this.f3082a = c0233g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k.k kVar;
        C0243l c0243l = this.f3083b;
        k.m mVar = c0243l.f3089c;
        if (mVar != null && (kVar = mVar.f2841e) != null) {
            kVar.p(mVar);
        }
        View view = (View) c0243l.h;
        if (view != null && view.getWindowToken() != null) {
            C0233g c0233g = this.f3082a;
            if (!c0233g.b()) {
                if (c0233g.f2902e != null) {
                    c0233g.d(0, 0, false, false);
                }
            }
            c0243l.f3103t = c0233g;
        }
        c0243l.f3105v = null;
    }
}
