package L;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class k0 extends m0 {

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f358c;

    public k0() {
        this.f358c = new WindowInsets.Builder();
    }

    @Override // L.m0
    public u0 b() {
        a();
        u0 f2 = u0.f(null, this.f358c.build());
        f2.f389a.o(this.f364b);
        return f2;
    }

    @Override // L.m0
    public void d(D.c cVar) {
        this.f358c.setMandatorySystemGestureInsets(cVar.d());
    }

    @Override // L.m0
    public void e(D.c cVar) {
        this.f358c.setSystemGestureInsets(cVar.d());
    }

    @Override // L.m0
    public void f(D.c cVar) {
        this.f358c.setSystemWindowInsets(cVar.d());
    }

    @Override // L.m0
    public void g(D.c cVar) {
        this.f358c.setTappableElementInsets(cVar.d());
    }

    public void h(D.c cVar) {
        this.f358c.setStableInsets(cVar.d());
    }

    public k0(u0 u0Var) {
        super(u0Var);
        WindowInsets.Builder builder;
        WindowInsets e2 = u0Var.e();
        if (e2 != null) {
            builder = new WindowInsets.Builder(e2);
        } else {
            builder = new WindowInsets.Builder();
        }
        this.f358c = builder;
    }
}
