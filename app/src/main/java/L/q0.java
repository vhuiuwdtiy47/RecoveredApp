package L;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class q0 extends p0 {

    /* renamed from: n, reason: collision with root package name */
    public D.c f379n;

    /* renamed from: o, reason: collision with root package name */
    public D.c f380o;

    /* renamed from: p, reason: collision with root package name */
    public D.c f381p;

    public q0(u0 u0Var, WindowInsets windowInsets) {
        super(u0Var, windowInsets);
        this.f379n = null;
        this.f380o = null;
        this.f381p = null;
    }

    @Override // L.s0
    public D.c g() {
        if (this.f380o == null) {
            this.f380o = D.c.c(this.f372c.getMandatorySystemGestureInsets());
        }
        return this.f380o;
    }

    @Override // L.s0
    public D.c i() {
        if (this.f379n == null) {
            this.f379n = D.c.c(this.f372c.getSystemGestureInsets());
        }
        return this.f379n;
    }

    @Override // L.s0
    public D.c k() {
        if (this.f381p == null) {
            this.f381p = D.c.c(this.f372c.getTappableElementInsets());
        }
        return this.f381p;
    }

    @Override // L.s0
    public u0 l(int i, int i2, int i3, int i4) {
        return u0.f(null, this.f372c.inset(i, i2, i3, i4));
    }
}
