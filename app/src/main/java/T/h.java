package t;

import java.util.ArrayList;
import r.AbstractC0319e;
import r.C0316b;
import r.C0317c;
import r.C0320f;

/* loaded from: classes.dex */
public final class h extends C0326d {

    /* renamed from: q0, reason: collision with root package name */
    public float f3818q0 = -1.0f;
    public int r0 = -1;

    /* renamed from: s0, reason: collision with root package name */
    public int f3819s0 = -1;

    /* renamed from: t0, reason: collision with root package name */
    public C0325c f3820t0 = this.f3697J;

    /* renamed from: u0, reason: collision with root package name */
    public int f3821u0 = 0;
    public boolean v0;

    public h() {
        this.f3705R.clear();
        this.f3705R.add(this.f3820t0);
        int length = this.f3704Q.length;
        for (int i = 0; i < length; i++) {
            this.f3704Q[i] = this.f3820t0;
        }
    }

    @Override // t.C0326d
    public final boolean A() {
        return this.v0;
    }

    @Override // t.C0326d
    public final boolean B() {
        return this.v0;
    }

    @Override // t.C0326d
    public final void Q(C0317c c0317c, boolean z2) {
        if (this.f3707T == null) {
            return;
        }
        C0325c c0325c = this.f3820t0;
        c0317c.getClass();
        int n2 = C0317c.n(c0325c);
        if (this.f3821u0 == 1) {
            this.f3712Y = n2;
            this.f3713Z = 0;
            L(this.f3707T.k());
            O(0);
            return;
        }
        this.f3712Y = 0;
        this.f3713Z = n2;
        O(this.f3707T.q());
        L(0);
    }

    public final void R(int i) {
        this.f3820t0.l(i);
        this.v0 = true;
    }

    public final void S(int i) {
        if (this.f3821u0 == i) {
            return;
        }
        this.f3821u0 = i;
        ArrayList arrayList = this.f3705R;
        arrayList.clear();
        if (this.f3821u0 == 1) {
            this.f3820t0 = this.f3696I;
        } else {
            this.f3820t0 = this.f3697J;
        }
        arrayList.add(this.f3820t0);
        C0325c[] c0325cArr = this.f3704Q;
        int length = c0325cArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            c0325cArr[i2] = this.f3820t0;
        }
    }

    @Override // t.C0326d
    public final void b(C0317c c0317c, boolean z2) {
        C0327e c0327e = (C0327e) this.f3707T;
        if (c0327e == null) {
            return;
        }
        Object i = c0327e.i(2);
        Object i2 = c0327e.i(4);
        C0326d c0326d = this.f3707T;
        boolean z3 = c0326d != null && c0326d.f3741p0[0] == 2;
        if (this.f3821u0 == 0) {
            i = c0327e.i(3);
            i2 = c0327e.i(5);
            C0326d c0326d2 = this.f3707T;
            z3 = c0326d2 != null && c0326d2.f3741p0[1] == 2;
        }
        if (this.v0) {
            C0325c c0325c = this.f3820t0;
            if (c0325c.f3685c) {
                C0320f k2 = c0317c.k(c0325c);
                c0317c.d(k2, this.f3820t0.d());
                if (this.r0 != -1) {
                    if (z3) {
                        c0317c.f(c0317c.k(i2), k2, 0, 5);
                    }
                } else if (this.f3819s0 != -1 && z3) {
                    C0320f k3 = c0317c.k(i2);
                    c0317c.f(k2, c0317c.k(i), 0, 5);
                    c0317c.f(k3, k2, 0, 5);
                }
                this.v0 = false;
                return;
            }
        }
        if (this.r0 != -1) {
            C0320f k4 = c0317c.k(this.f3820t0);
            c0317c.e(k4, c0317c.k(i), this.r0, 8);
            if (z3) {
                c0317c.f(c0317c.k(i2), k4, 0, 5);
                return;
            }
            return;
        }
        if (this.f3819s0 != -1) {
            C0320f k5 = c0317c.k(this.f3820t0);
            C0320f k6 = c0317c.k(i2);
            c0317c.e(k5, k6, -this.f3819s0, 8);
            if (z3) {
                c0317c.f(k5, c0317c.k(i), 0, 5);
                c0317c.f(k6, k5, 0, 5);
                return;
            }
            return;
        }
        if (this.f3818q0 != -1.0f) {
            C0320f k7 = c0317c.k(this.f3820t0);
            C0320f k8 = c0317c.k(i2);
            float f2 = this.f3818q0;
            C0316b l2 = c0317c.l();
            l2.d.g(k7, -1.0f);
            l2.d.g(k8, f2);
            c0317c.c(l2);
        }
    }

    @Override // t.C0326d
    public final boolean c() {
        return true;
    }

    @Override // t.C0326d
    public final C0325c i(int i) {
        int a2 = AbstractC0319e.a(i);
        if (a2 != 1) {
            if (a2 != 2) {
                if (a2 != 3) {
                    if (a2 != 4) {
                        return null;
                    }
                }
            }
            if (this.f3821u0 == 0) {
                return this.f3820t0;
            }
            return null;
        }
        if (this.f3821u0 == 1) {
            return this.f3820t0;
        }
        return null;
    }
}
