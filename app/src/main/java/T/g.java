package t;

import java.util.ArrayList;
import r.C0317c;
import u.C0345b;
import w.C0368f;

/* loaded from: classes.dex */
public final class g extends i {

    /* renamed from: A0, reason: collision with root package name */
    public int f3786A0;

    /* renamed from: B0, reason: collision with root package name */
    public C0345b f3787B0;

    /* renamed from: C0, reason: collision with root package name */
    public C0368f f3788C0;

    /* renamed from: D0, reason: collision with root package name */
    public int f3789D0;

    /* renamed from: E0, reason: collision with root package name */
    public int f3790E0;

    /* renamed from: F0, reason: collision with root package name */
    public int f3791F0;

    /* renamed from: G0, reason: collision with root package name */
    public int f3792G0;

    /* renamed from: H0, reason: collision with root package name */
    public int f3793H0;
    public int I0;

    /* renamed from: J0, reason: collision with root package name */
    public float f3794J0;

    /* renamed from: K0, reason: collision with root package name */
    public float f3795K0;

    /* renamed from: L0, reason: collision with root package name */
    public float f3796L0;

    /* renamed from: M0, reason: collision with root package name */
    public float f3797M0;
    public float N0;

    /* renamed from: O0, reason: collision with root package name */
    public float f3798O0;

    /* renamed from: P0, reason: collision with root package name */
    public int f3799P0;

    /* renamed from: Q0, reason: collision with root package name */
    public int f3800Q0;

    /* renamed from: R0, reason: collision with root package name */
    public int f3801R0;

    /* renamed from: S0, reason: collision with root package name */
    public int f3802S0;

    /* renamed from: T0, reason: collision with root package name */
    public int f3803T0;

    /* renamed from: U0, reason: collision with root package name */
    public int f3804U0;

    /* renamed from: V0, reason: collision with root package name */
    public int f3805V0;

    /* renamed from: W0, reason: collision with root package name */
    public ArrayList f3806W0;

    /* renamed from: X0, reason: collision with root package name */
    public C0326d[] f3807X0;

    /* renamed from: Y0, reason: collision with root package name */
    public C0326d[] f3808Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public int[] f3809Z0;

    /* renamed from: a1, reason: collision with root package name */
    public C0326d[] f3810a1;
    public int b1;

    /* renamed from: s0, reason: collision with root package name */
    public int f3811s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f3812t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f3813u0;
    public int v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f3814w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f3815x0;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f3816y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f3817z0;

    @Override // t.i
    public final void S() {
        for (int i = 0; i < this.r0; i++) {
            C0326d c0326d = this.f3822q0[i];
            if (c0326d != null) {
                c0326d.f3694F = true;
            }
        }
    }

    public final int T(C0326d c0326d, int i) {
        C0326d c0326d2;
        if (c0326d != null) {
            int[] iArr = c0326d.f3741p0;
            if (iArr[1] == 3) {
                int i2 = c0326d.f3744s;
                if (i2 != 0) {
                    if (i2 == 2) {
                        int i3 = (int) (c0326d.f3751z * i);
                        if (i3 != c0326d.k()) {
                            c0326d.f3724g = true;
                            V(iArr[0], c0326d.q(), 1, i3, c0326d);
                        }
                        return i3;
                    }
                    c0326d2 = c0326d;
                    if (i2 == 1) {
                        return c0326d2.k();
                    }
                    if (i2 == 3) {
                        return (int) ((c0326d2.q() * c0326d2.f3710W) + 0.5f);
                    }
                }
            } else {
                c0326d2 = c0326d;
            }
            return c0326d2.k();
        }
        return 0;
    }

    public final int U(C0326d c0326d, int i) {
        C0326d c0326d2;
        if (c0326d != null) {
            int[] iArr = c0326d.f3741p0;
            if (iArr[0] == 3) {
                int i2 = c0326d.f3743r;
                if (i2 != 0) {
                    if (i2 == 2) {
                        int i3 = (int) (c0326d.f3748w * i);
                        if (i3 != c0326d.q()) {
                            c0326d.f3724g = true;
                            V(1, i3, iArr[1], c0326d.k(), c0326d);
                        }
                        return i3;
                    }
                    c0326d2 = c0326d;
                    if (i2 == 1) {
                        return c0326d2.q();
                    }
                    if (i2 == 3) {
                        return (int) ((c0326d2.k() * c0326d2.f3710W) + 0.5f);
                    }
                }
            } else {
                c0326d2 = c0326d;
            }
            return c0326d2.q();
        }
        return 0;
    }

    public final void V(int i, int i2, int i3, int i4, C0326d c0326d) {
        C0368f c0368f;
        C0326d c0326d2;
        while (true) {
            c0368f = this.f3788C0;
            if (c0368f != null || (c0326d2 = this.f3707T) == null) {
                break;
            } else {
                this.f3788C0 = ((C0327e) c0326d2).f3766u0;
            }
        }
        C0345b c0345b = this.f3787B0;
        c0345b.f3888a = i;
        c0345b.f3889b = i3;
        c0345b.f3890c = i2;
        c0345b.d = i4;
        c0368f.b(c0326d, c0345b);
        c0326d.O(c0345b.f3891e);
        c0326d.L(c0345b.f3892f);
        c0326d.f3693E = c0345b.h;
        c0326d.I(c0345b.f3893g);
    }

    @Override // t.C0326d
    public final void b(C0317c c0317c, boolean z2) {
        C0326d c0326d;
        float f2;
        int i;
        super.b(c0317c, z2);
        C0326d c0326d2 = this.f3707T;
        boolean z3 = c0326d2 != null && ((C0327e) c0326d2).v0;
        int i2 = this.f3803T0;
        ArrayList arrayList = this.f3806W0;
        if (i2 != 0) {
            if (i2 == 1) {
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    ((f) arrayList.get(i3)).b(i3, z3, i3 == size + (-1));
                    i3++;
                }
            } else if (i2 != 2) {
                if (i2 == 3) {
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        ((f) arrayList.get(i4)).b(i4, z3, i4 == size2 + (-1));
                        i4++;
                    }
                }
            } else if (this.f3809Z0 != null && this.f3808Y0 != null && this.f3807X0 != null) {
                for (int i5 = 0; i5 < this.b1; i5++) {
                    this.f3810a1[i5].D();
                }
                int[] iArr = this.f3809Z0;
                int i6 = iArr[0];
                int i7 = iArr[1];
                float f3 = this.f3794J0;
                C0326d c0326d3 = null;
                int i8 = 0;
                while (i8 < i6) {
                    if (z3) {
                        i = (i6 - i8) - 1;
                        f2 = 1.0f - this.f3794J0;
                    } else {
                        f2 = f3;
                        i = i8;
                    }
                    C0326d c0326d4 = this.f3808Y0[i];
                    if (c0326d4 != null && c0326d4.f3725g0 != 8) {
                        C0325c c0325c = c0326d4.f3696I;
                        if (i8 == 0) {
                            c0326d4.f(c0325c, this.f3696I, this.f3814w0);
                            c0326d4.f3727i0 = this.f3789D0;
                            c0326d4.f3719d0 = f2;
                        }
                        if (i8 == i6 - 1) {
                            c0326d4.f(c0326d4.f3698K, this.f3698K, this.f3815x0);
                        }
                        if (i8 > 0 && c0326d3 != null) {
                            int i9 = this.f3799P0;
                            C0325c c0325c2 = c0326d3.f3698K;
                            c0326d4.f(c0325c, c0325c2, i9);
                            c0326d3.f(c0325c2, c0325c, 0);
                        }
                        c0326d3 = c0326d4;
                    }
                    i8++;
                    f3 = f2;
                }
                for (int i10 = 0; i10 < i7; i10++) {
                    C0326d c0326d5 = this.f3807X0[i10];
                    if (c0326d5 != null && c0326d5.f3725g0 != 8) {
                        C0325c c0325c3 = c0326d5.f3697J;
                        if (i10 == 0) {
                            c0326d5.f(c0325c3, this.f3697J, this.f3811s0);
                            c0326d5.f3729j0 = this.f3790E0;
                            c0326d5.f3721e0 = this.f3795K0;
                        }
                        if (i10 == i7 - 1) {
                            c0326d5.f(c0326d5.f3699L, this.f3699L, this.f3812t0);
                        }
                        if (i10 > 0 && c0326d3 != null) {
                            int i11 = this.f3800Q0;
                            C0325c c0325c4 = c0326d3.f3699L;
                            c0326d5.f(c0325c3, c0325c4, i11);
                            c0326d3.f(c0325c4, c0325c3, 0);
                        }
                        c0326d3 = c0326d5;
                    }
                }
                for (int i12 = 0; i12 < i6; i12++) {
                    for (int i13 = 0; i13 < i7; i13++) {
                        int i14 = (i13 * i6) + i12;
                        if (this.f3805V0 == 1) {
                            i14 = (i12 * i7) + i13;
                        }
                        C0326d[] c0326dArr = this.f3810a1;
                        if (i14 < c0326dArr.length && (c0326d = c0326dArr[i14]) != null && c0326d.f3725g0 != 8) {
                            C0326d c0326d6 = this.f3808Y0[i12];
                            C0326d c0326d7 = this.f3807X0[i13];
                            if (c0326d != c0326d6) {
                                c0326d.f(c0326d.f3696I, c0326d6.f3696I, 0);
                                c0326d.f(c0326d.f3698K, c0326d6.f3698K, 0);
                            }
                            if (c0326d != c0326d7) {
                                c0326d.f(c0326d.f3697J, c0326d7.f3697J, 0);
                                c0326d.f(c0326d.f3699L, c0326d7.f3699L, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((f) arrayList.get(0)).b(0, z3, true);
        }
        this.f3816y0 = false;
    }
}
