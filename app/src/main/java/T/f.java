package t;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f3771a;
    public C0325c d;

    /* renamed from: e, reason: collision with root package name */
    public C0325c f3774e;

    /* renamed from: f, reason: collision with root package name */
    public C0325c f3775f;

    /* renamed from: g, reason: collision with root package name */
    public C0325c f3776g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f3777j;

    /* renamed from: k, reason: collision with root package name */
    public int f3778k;

    /* renamed from: q, reason: collision with root package name */
    public int f3784q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f3785r;

    /* renamed from: b, reason: collision with root package name */
    public C0326d f3772b = null;

    /* renamed from: c, reason: collision with root package name */
    public int f3773c = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f3779l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f3780m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f3781n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f3782o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f3783p = 0;

    public f(g gVar, int i, C0325c c0325c, C0325c c0325c2, C0325c c0325c3, C0325c c0325c4, int i2) {
        this.f3785r = gVar;
        this.f3771a = i;
        this.d = c0325c;
        this.f3774e = c0325c2;
        this.f3775f = c0325c3;
        this.f3776g = c0325c4;
        this.h = gVar.f3814w0;
        this.i = gVar.f3811s0;
        this.f3777j = gVar.f3815x0;
        this.f3778k = gVar.f3812t0;
        this.f3784q = i2;
    }

    public final void a(C0326d c0326d) {
        int i = this.f3771a;
        g gVar = this.f3785r;
        if (i == 0) {
            int U2 = gVar.U(c0326d, this.f3784q);
            if (c0326d.f3741p0[0] == 3) {
                this.f3783p++;
                U2 = 0;
            }
            this.f3779l = U2 + (c0326d.f3725g0 != 8 ? gVar.f3799P0 : 0) + this.f3779l;
            int T2 = gVar.T(c0326d, this.f3784q);
            if (this.f3772b == null || this.f3773c < T2) {
                this.f3772b = c0326d;
                this.f3773c = T2;
                this.f3780m = T2;
            }
        } else {
            int U3 = gVar.U(c0326d, this.f3784q);
            int T3 = gVar.T(c0326d, this.f3784q);
            if (c0326d.f3741p0[1] == 3) {
                this.f3783p++;
                T3 = 0;
            }
            this.f3780m = T3 + (c0326d.f3725g0 != 8 ? gVar.f3800Q0 : 0) + this.f3780m;
            if (this.f3772b == null || this.f3773c < U3) {
                this.f3772b = c0326d;
                this.f3773c = U3;
                this.f3779l = U3;
            }
        }
        this.f3782o++;
    }

    public final void b(int i, boolean z2, boolean z3) {
        g gVar;
        int i2;
        int i3;
        C0326d c0326d;
        boolean z4;
        char c2;
        float f2;
        float f3;
        int i4;
        float f4;
        float f5;
        int i5;
        int i6 = this.f3782o;
        int i7 = 0;
        while (true) {
            gVar = this.f3785r;
            if (i7 >= i6 || (i5 = this.f3781n + i7) >= gVar.b1) {
                break;
            }
            C0326d c0326d2 = gVar.f3810a1[i5];
            if (c0326d2 != null) {
                c0326d2.D();
            }
            i7++;
        }
        if (i6 == 0 || this.f3772b == null) {
            return;
        }
        boolean z5 = z3 && i == 0;
        int i8 = -1;
        int i9 = -1;
        for (int i10 = 0; i10 < i6; i10++) {
            int i11 = this.f3781n + (z2 ? (i6 - 1) - i10 : i10);
            if (i11 >= gVar.b1) {
                break;
            }
            C0326d c0326d3 = gVar.f3810a1[i11];
            if (c0326d3 != null && c0326d3.f3725g0 == 0) {
                if (i8 == -1) {
                    i8 = i10;
                }
                i9 = i10;
            }
        }
        if (this.f3771a != 0) {
            boolean z6 = z5;
            C0326d c0326d4 = this.f3772b;
            c0326d4.f3727i0 = gVar.f3789D0;
            int i12 = this.h;
            if (i > 0) {
                i12 += gVar.f3799P0;
            }
            C0325c c0325c = c0326d4.f3696I;
            C0325c c0325c2 = c0326d4.f3698K;
            if (z2) {
                c0325c2.a(this.f3775f, i12);
                if (z3) {
                    c0325c.a(this.d, this.f3777j);
                }
                if (i > 0) {
                    this.f3775f.d.f3696I.a(c0325c2, 0);
                }
            } else {
                c0325c.a(this.d, i12);
                if (z3) {
                    c0325c2.a(this.f3775f, this.f3777j);
                }
                if (i > 0) {
                    this.d.d.f3698K.a(c0325c, 0);
                }
            }
            C0326d c0326d5 = null;
            for (int i13 = 0; i13 < i6; i13++) {
                int i14 = this.f3781n + i13;
                if (i14 >= gVar.b1) {
                    return;
                }
                C0326d c0326d6 = gVar.f3810a1[i14];
                if (c0326d6 != null) {
                    C0325c c0325c3 = c0326d6.f3697J;
                    if (i13 == 0) {
                        c0326d6.f(c0325c3, this.f3774e, this.i);
                        int i15 = gVar.f3790E0;
                        float f6 = gVar.f3795K0;
                        if (this.f3781n == 0) {
                            i3 = gVar.f3792G0;
                            i2 = -1;
                            if (i3 != -1) {
                                f6 = gVar.f3797M0;
                                i15 = i3;
                                c0326d6.f3729j0 = i15;
                                c0326d6.f3721e0 = f6;
                            }
                        } else {
                            i2 = -1;
                        }
                        if (z3 && (i3 = gVar.I0) != i2) {
                            f6 = gVar.f3798O0;
                            i15 = i3;
                        }
                        c0326d6.f3729j0 = i15;
                        c0326d6.f3721e0 = f6;
                    }
                    if (i13 == i6 - 1) {
                        c0326d6.f(c0326d6.f3699L, this.f3776g, this.f3778k);
                    }
                    if (c0326d5 != null) {
                        int i16 = gVar.f3800Q0;
                        C0325c c0325c4 = c0326d5.f3699L;
                        c0325c3.a(c0325c4, i16);
                        if (i13 == i8) {
                            int i17 = this.i;
                            if (c0325c3.h()) {
                                c0325c3.h = i17;
                            }
                        }
                        c0325c4.a(c0325c3, 0);
                        if (i13 == i9 + 1) {
                            int i18 = this.f3778k;
                            if (c0325c4.h()) {
                                c0325c4.h = i18;
                            }
                        }
                    }
                    if (c0326d6 != c0326d4) {
                        C0325c c0325c5 = c0326d6.f3698K;
                        C0325c c0325c6 = c0326d6.f3696I;
                        if (z2) {
                            int i19 = gVar.f3801R0;
                            if (i19 == 0) {
                                c0325c5.a(c0325c2, 0);
                            } else if (i19 == 1) {
                                c0325c6.a(c0325c, 0);
                            } else if (i19 == 2) {
                                c0325c6.a(c0325c, 0);
                                c0325c5.a(c0325c2, 0);
                            }
                        } else {
                            int i20 = gVar.f3801R0;
                            if (i20 == 0) {
                                c0325c6.a(c0325c, 0);
                            } else if (i20 == 1) {
                                c0325c5.a(c0325c2, 0);
                            } else if (i20 == 2) {
                                if (z6) {
                                    c0325c6.a(this.d, this.h);
                                    c0325c5.a(this.f3775f, this.f3777j);
                                } else {
                                    c0325c6.a(c0325c, 0);
                                    c0325c5.a(c0325c2, 0);
                                }
                            }
                            c0326d5 = c0326d6;
                        }
                    }
                    c0326d5 = c0326d6;
                }
            }
            return;
        }
        C0326d c0326d7 = this.f3772b;
        c0326d7.f3729j0 = gVar.f3790E0;
        int i21 = this.i;
        if (i > 0) {
            i21 += gVar.f3800Q0;
        }
        C0325c c0325c7 = this.f3774e;
        C0325c c0325c8 = c0326d7.f3697J;
        c0325c8.a(c0325c7, i21);
        C0325c c0325c9 = c0326d7.f3699L;
        if (z3) {
            c0325c9.a(this.f3776g, this.f3778k);
        }
        if (i > 0) {
            this.f3774e.d.f3699L.a(c0325c8, 0);
        }
        if (gVar.f3802S0 == 3 && !c0326d7.f3693E) {
            for (int i22 = 0; i22 < i6; i22++) {
                int i23 = this.f3781n + (z2 ? (i6 - 1) - i22 : i22);
                if (i23 >= gVar.b1) {
                    break;
                }
                c0326d = gVar.f3810a1[i23];
                if (c0326d.f3693E) {
                    break;
                }
            }
        }
        c0326d = c0326d7;
        int i24 = 0;
        C0326d c0326d8 = null;
        while (i24 < i6) {
            int i25 = z2 ? (i6 - 1) - i24 : i24;
            int i26 = this.f3781n + i25;
            if (i26 >= gVar.b1) {
                return;
            }
            C0326d c0326d9 = gVar.f3810a1[i26];
            if (c0326d9 == null) {
                z4 = z5;
                c2 = 3;
            } else {
                C0325c c0325c10 = c0326d9.f3696I;
                if (i24 == 0) {
                    c0326d9.f(c0325c10, this.d, this.h);
                }
                if (i25 == 0) {
                    int i27 = gVar.f3789D0;
                    if (z2) {
                        f2 = 1.0f;
                        f3 = 1.0f - gVar.f3794J0;
                    } else {
                        f2 = 1.0f;
                        f3 = gVar.f3794J0;
                    }
                    if (this.f3781n == 0) {
                        i4 = gVar.f3791F0;
                        z4 = z5;
                        if (i4 != -1) {
                            if (z2) {
                                f5 = gVar.f3796L0;
                                f3 = f2 - f5;
                                c0326d9.f3727i0 = i4;
                                c0326d9.f3719d0 = f3;
                            } else {
                                f4 = gVar.f3796L0;
                                f3 = f4;
                                c0326d9.f3727i0 = i4;
                                c0326d9.f3719d0 = f3;
                            }
                        }
                    } else {
                        z4 = z5;
                    }
                    if (!z3 || (i4 = gVar.f3793H0) == -1) {
                        i4 = i27;
                        c0326d9.f3727i0 = i4;
                        c0326d9.f3719d0 = f3;
                    } else if (z2) {
                        f5 = gVar.N0;
                        f3 = f2 - f5;
                        c0326d9.f3727i0 = i4;
                        c0326d9.f3719d0 = f3;
                    } else {
                        f4 = gVar.N0;
                        f3 = f4;
                        c0326d9.f3727i0 = i4;
                        c0326d9.f3719d0 = f3;
                    }
                } else {
                    z4 = z5;
                }
                if (i24 == i6 - 1) {
                    c0326d9.f(c0326d9.f3698K, this.f3775f, this.f3777j);
                }
                if (c0326d8 != null) {
                    int i28 = gVar.f3799P0;
                    C0325c c0325c11 = c0326d8.f3698K;
                    c0325c10.a(c0325c11, i28);
                    if (i24 == i8) {
                        int i29 = this.h;
                        if (c0325c10.h()) {
                            c0325c10.h = i29;
                        }
                    }
                    c0325c11.a(c0325c10, 0);
                    if (i24 == i9 + 1) {
                        int i30 = this.f3777j;
                        if (c0325c11.h()) {
                            c0325c11.h = i30;
                        }
                    }
                }
                if (c0326d9 != c0326d7) {
                    int i31 = gVar.f3802S0;
                    c2 = 3;
                    if (i31 == 3 && c0326d.f3693E && c0326d9 != c0326d && c0326d9.f3693E) {
                        c0326d9.f3700M.a(c0326d.f3700M, 0);
                    } else {
                        C0325c c0325c12 = c0326d9.f3697J;
                        if (i31 != 0) {
                            C0325c c0325c13 = c0326d9.f3699L;
                            if (i31 == 1) {
                                c0325c13.a(c0325c9, 0);
                            } else if (z4) {
                                c0325c12.a(this.f3774e, this.i);
                                c0325c13.a(this.f3776g, this.f3778k);
                            } else {
                                c0325c12.a(c0325c8, 0);
                                c0325c13.a(c0325c9, 0);
                            }
                        } else {
                            c0325c12.a(c0325c8, 0);
                        }
                    }
                } else {
                    c2 = 3;
                }
                c0326d8 = c0326d9;
            }
            i24++;
            z5 = z4;
        }
    }

    public final int c() {
        return this.f3771a == 1 ? this.f3780m - this.f3785r.f3800Q0 : this.f3780m;
    }

    public final int d() {
        return this.f3771a == 0 ? this.f3779l - this.f3785r.f3799P0 : this.f3779l;
    }

    public final void e(int i) {
        g gVar;
        int i2;
        int i3 = this.f3783p;
        if (i3 == 0) {
            return;
        }
        int i4 = this.f3782o;
        int i5 = i / i3;
        int i6 = 0;
        while (true) {
            gVar = this.f3785r;
            if (i6 >= i4 || (i2 = this.f3781n + i6) >= gVar.b1) {
                break;
            }
            C0326d c0326d = gVar.f3810a1[i2];
            if (this.f3771a == 0) {
                if (c0326d != null) {
                    int[] iArr = c0326d.f3741p0;
                    if (iArr[0] == 3 && c0326d.f3743r == 0) {
                        gVar.V(1, i5, iArr[1], c0326d.k(), c0326d);
                    }
                }
            } else if (c0326d != null) {
                int[] iArr2 = c0326d.f3741p0;
                if (iArr2[1] == 3 && c0326d.f3744s == 0) {
                    int i7 = iArr2[0];
                    int i8 = i5;
                    gVar.V(i7, c0326d.q(), 1, i8, c0326d);
                    i5 = i8;
                }
            }
            i6++;
        }
        this.f3779l = 0;
        this.f3780m = 0;
        this.f3772b = null;
        this.f3773c = 0;
        int i9 = this.f3782o;
        for (int i10 = 0; i10 < i9; i10++) {
            int i11 = this.f3781n + i10;
            if (i11 >= gVar.b1) {
                return;
            }
            C0326d c0326d2 = gVar.f3810a1[i11];
            if (this.f3771a == 0) {
                int q2 = c0326d2.q();
                int i12 = gVar.f3799P0;
                if (c0326d2.f3725g0 == 8) {
                    i12 = 0;
                }
                this.f3779l = q2 + i12 + this.f3779l;
                int T2 = gVar.T(c0326d2, this.f3784q);
                if (this.f3772b == null || this.f3773c < T2) {
                    this.f3772b = c0326d2;
                    this.f3773c = T2;
                    this.f3780m = T2;
                }
            } else {
                int U2 = gVar.U(c0326d2, this.f3784q);
                int T3 = gVar.T(c0326d2, this.f3784q);
                int i13 = gVar.f3800Q0;
                if (c0326d2.f3725g0 == 8) {
                    i13 = 0;
                }
                this.f3780m = T3 + i13 + this.f3780m;
                if (this.f3772b == null || this.f3773c < U2) {
                    this.f3772b = c0326d2;
                    this.f3773c = U2;
                    this.f3779l = U2;
                }
            }
        }
    }

    public final void f(int i, C0325c c0325c, C0325c c0325c2, C0325c c0325c3, C0325c c0325c4, int i2, int i3, int i4, int i5, int i6) {
        this.f3771a = i;
        this.d = c0325c;
        this.f3774e = c0325c2;
        this.f3775f = c0325c3;
        this.f3776g = c0325c4;
        this.h = i2;
        this.i = i3;
        this.f3777j = i4;
        this.f3778k = i5;
        this.f3784q = i6;
    }
}
