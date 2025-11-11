package t;

import r.C0316b;
import r.C0317c;
import r.C0320f;

/* renamed from: t.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0323a extends i {

    /* renamed from: s0, reason: collision with root package name */
    public int f3666s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f3667t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f3668u0;
    public boolean v0;

    @Override // t.C0326d
    public final boolean A() {
        return this.v0;
    }

    @Override // t.C0326d
    public final boolean B() {
        return this.v0;
    }

    public final boolean T() {
        int i;
        int i2;
        int i3;
        boolean z2 = true;
        int i4 = 0;
        while (true) {
            i = this.r0;
            if (i4 >= i) {
                break;
            }
            C0326d c0326d = this.f3822q0[i4];
            if ((this.f3667t0 || c0326d.c()) && ((((i2 = this.f3666s0) == 0 || i2 == 1) && !c0326d.A()) || (((i3 = this.f3666s0) == 2 || i3 == 3) && !c0326d.B()))) {
                z2 = false;
            }
            i4++;
        }
        if (!z2 || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z3 = false;
        for (int i6 = 0; i6 < this.r0; i6++) {
            C0326d c0326d2 = this.f3822q0[i6];
            if (this.f3667t0 || c0326d2.c()) {
                if (!z3) {
                    int i7 = this.f3666s0;
                    if (i7 == 0) {
                        i5 = c0326d2.i(2).d();
                    } else if (i7 == 1) {
                        i5 = c0326d2.i(4).d();
                    } else if (i7 == 2) {
                        i5 = c0326d2.i(3).d();
                    } else if (i7 == 3) {
                        i5 = c0326d2.i(5).d();
                    }
                    z3 = true;
                }
                int i8 = this.f3666s0;
                if (i8 == 0) {
                    i5 = Math.min(i5, c0326d2.i(2).d());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, c0326d2.i(4).d());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, c0326d2.i(3).d());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, c0326d2.i(5).d());
                }
            }
        }
        int i9 = i5 + this.f3668u0;
        int i10 = this.f3666s0;
        if (i10 == 0 || i10 == 1) {
            J(i9, i9);
        } else {
            K(i9, i9);
        }
        this.v0 = true;
        return true;
    }

    public final int U() {
        int i = this.f3666s0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // t.C0326d
    public final void b(C0317c c0317c, boolean z2) {
        boolean z3;
        int i;
        int i2;
        C0325c[] c0325cArr = this.f3704Q;
        C0325c c0325c = this.f3696I;
        c0325cArr[0] = c0325c;
        C0325c c0325c2 = this.f3697J;
        int i3 = 2;
        c0325cArr[2] = c0325c2;
        C0325c c0325c3 = this.f3698K;
        c0325cArr[1] = c0325c3;
        C0325c c0325c4 = this.f3699L;
        c0325cArr[3] = c0325c4;
        for (C0325c c0325c5 : c0325cArr) {
            c0325c5.i = c0317c.k(c0325c5);
        }
        int i4 = this.f3666s0;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        C0325c c0325c6 = c0325cArr[i4];
        if (!this.v0) {
            T();
        }
        if (this.v0) {
            this.v0 = false;
            int i5 = this.f3666s0;
            if (i5 == 0 || i5 == 1) {
                c0317c.d(c0325c.i, this.f3712Y);
                c0317c.d(c0325c3.i, this.f3712Y);
                return;
            } else {
                if (i5 == 2 || i5 == 3) {
                    c0317c.d(c0325c2.i, this.f3713Z);
                    c0317c.d(c0325c4.i, this.f3713Z);
                    return;
                }
                return;
            }
        }
        for (int i6 = 0; i6 < this.r0; i6++) {
            C0326d c0326d = this.f3822q0[i6];
            if ((this.f3667t0 || c0326d.c()) && ((((i2 = this.f3666s0) == 0 || i2 == 1) && c0326d.f3741p0[0] == 3 && c0326d.f3696I.f3687f != null && c0326d.f3698K.f3687f != null) || ((i2 == 2 || i2 == 3) && c0326d.f3741p0[1] == 3 && c0326d.f3697J.f3687f != null && c0326d.f3699L.f3687f != null))) {
                z3 = true;
                break;
            }
        }
        z3 = false;
        boolean z4 = c0325c.g() || c0325c3.g();
        boolean z5 = c0325c2.g() || c0325c4.g();
        int i7 = (z3 || !(((i = this.f3666s0) == 0 && z4) || ((i == 2 && z5) || ((i == 1 && z4) || (i == 3 && z5))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.r0) {
            C0326d c0326d2 = this.f3822q0[i8];
            if (this.f3667t0 || c0326d2.c()) {
                C0320f k2 = c0317c.k(c0326d2.f3704Q[this.f3666s0]);
                int i9 = this.f3666s0;
                C0325c c0325c7 = c0326d2.f3704Q[i9];
                c0325c7.i = k2;
                C0325c c0325c8 = c0325c7.f3687f;
                int i10 = (c0325c8 == null || c0325c8.d != this) ? 0 : c0325c7.f3688g;
                if (i9 == 0 || i9 == i3) {
                    C0320f c0320f = c0325c6.i;
                    int i11 = this.f3668u0 - i10;
                    C0316b l2 = c0317c.l();
                    C0320f m2 = c0317c.m();
                    m2.d = 0;
                    l2.c(c0320f, k2, m2, i11);
                    c0317c.c(l2);
                } else {
                    C0320f c0320f2 = c0325c6.i;
                    int i12 = this.f3668u0 + i10;
                    C0316b l3 = c0317c.l();
                    C0320f m3 = c0317c.m();
                    m3.d = 0;
                    l3.b(c0320f2, k2, m3, i12);
                    c0317c.c(l3);
                }
                c0317c.e(c0325c6.i, k2, this.f3668u0 + i10, i7);
            }
            i8++;
            i3 = 2;
        }
        int i13 = this.f3666s0;
        if (i13 == 0) {
            c0317c.e(c0325c3.i, c0325c.i, 0, 8);
            c0317c.e(c0325c.i, this.f3707T.f3698K.i, 0, 4);
            c0317c.e(c0325c.i, this.f3707T.f3696I.i, 0, 0);
            return;
        }
        if (i13 == 1) {
            c0317c.e(c0325c.i, c0325c3.i, 0, 8);
            c0317c.e(c0325c.i, this.f3707T.f3696I.i, 0, 4);
            c0317c.e(c0325c.i, this.f3707T.f3698K.i, 0, 0);
        } else if (i13 == 2) {
            c0317c.e(c0325c4.i, c0325c2.i, 0, 8);
            c0317c.e(c0325c2.i, this.f3707T.f3699L.i, 0, 4);
            c0317c.e(c0325c2.i, this.f3707T.f3697J.i, 0, 0);
        } else if (i13 == 3) {
            c0317c.e(c0325c2.i, c0325c4.i, 0, 8);
            c0317c.e(c0325c2.i, this.f3707T.f3697J.i, 0, 4);
            c0317c.e(c0325c2.i, this.f3707T.f3699L.i, 0, 0);
        }
    }

    @Override // t.C0326d
    public final boolean c() {
        return true;
    }

    @Override // t.C0326d
    public final String toString() {
        String str = "[Barrier] " + this.f3726h0 + " {";
        for (int i = 0; i < this.r0; i++) {
            C0326d c0326d = this.f3822q0[i];
            if (i > 0) {
                str = D.f.c(str, ", ");
            }
            str = str + c0326d.f3726h0;
        }
        return D.f.c(str, "}");
    }
}
