package l;

import android.content.Context;

/* renamed from: l.I0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0190I0 extends C0180D0 implements InterfaceC0182E0 {

    /* renamed from: A, reason: collision with root package name */
    public A0.c f2973A;

    @Override // l.InterfaceC0182E0
    public final void f(k.m mVar, k.o oVar) {
        A0.c cVar = this.f2973A;
        if (cVar != null) {
            cVar.f(mVar, oVar);
        }
    }

    @Override // l.C0180D0
    public final C0254q0 o(Context context, boolean z2) {
        C0188H0 c0188h0 = new C0188H0(context, z2);
        c0188h0.setHoverListener(this);
        return c0188h0;
    }

    @Override // l.InterfaceC0182E0
    public final void u(k.m mVar, k.o oVar) {
        A0.c cVar = this.f2973A;
        if (cVar != null) {
            cVar.u(mVar, oVar);
        }
    }
}
