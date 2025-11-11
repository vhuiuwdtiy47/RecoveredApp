package u;

import r.AbstractC0319e;
import t.C0325c;
import t.C0326d;

/* renamed from: u.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0356m extends AbstractC0358o {

    /* renamed from: k, reason: collision with root package name */
    public C0349f f3917k;

    /* renamed from: l, reason: collision with root package name */
    public C0344a f3918l;

    @Override // u.InterfaceC0347d
    public final void a(InterfaceC0347d interfaceC0347d) {
        float f2;
        float f3;
        float f4;
        int i;
        if (AbstractC0319e.a(this.f3930j) == 3) {
            C0326d c0326d = this.f3925b;
            l(c0326d.f3697J, c0326d.f3699L, 1);
            return;
        }
        C0350g c0350g = this.f3927e;
        if (c0350g.f3905c && !c0350g.f3909j && this.d == 3) {
            C0326d c0326d2 = this.f3925b;
            int i2 = c0326d2.f3744s;
            if (i2 == 2) {
                C0326d c0326d3 = c0326d2.f3707T;
                if (c0326d3 != null) {
                    if (c0326d3.f3720e.f3927e.f3909j) {
                        c0350g.d((int) ((r5.f3908g * c0326d2.f3751z) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                C0350g c0350g2 = c0326d2.d.f3927e;
                if (c0350g2.f3909j) {
                    int i3 = c0326d2.f3711X;
                    if (i3 == -1) {
                        f2 = c0350g2.f3908g;
                        f3 = c0326d2.f3710W;
                    } else if (i3 == 0) {
                        f4 = c0350g2.f3908g * c0326d2.f3710W;
                        i = (int) (f4 + 0.5f);
                        c0350g.d(i);
                    } else if (i3 != 1) {
                        i = 0;
                        c0350g.d(i);
                    } else {
                        f2 = c0350g2.f3908g;
                        f3 = c0326d2.f3710W;
                    }
                    f4 = f2 / f3;
                    i = (int) (f4 + 0.5f);
                    c0350g.d(i);
                }
            }
        }
        C0349f c0349f = this.h;
        if (c0349f.f3905c) {
            C0349f c0349f2 = this.i;
            if (c0349f2.f3905c) {
                if (c0349f.f3909j && c0349f2.f3909j && c0350g.f3909j) {
                    return;
                }
                if (!c0350g.f3909j && this.d == 3) {
                    C0326d c0326d4 = this.f3925b;
                    if (c0326d4.f3743r == 0 && !c0326d4.y()) {
                        C0349f c0349f3 = (C0349f) c0349f.f3911l.get(0);
                        C0349f c0349f4 = (C0349f) c0349f2.f3911l.get(0);
                        int i4 = c0349f3.f3908g + c0349f.f3907f;
                        int i5 = c0349f4.f3908g + c0349f2.f3907f;
                        c0349f.d(i4);
                        c0349f2.d(i5);
                        c0350g.d(i5 - i4);
                        return;
                    }
                }
                if (!c0350g.f3909j && this.d == 3 && this.f3924a == 1 && c0349f.f3911l.size() > 0 && c0349f2.f3911l.size() > 0) {
                    C0349f c0349f5 = (C0349f) c0349f.f3911l.get(0);
                    int i6 = (((C0349f) c0349f2.f3911l.get(0)).f3908g + c0349f2.f3907f) - (c0349f5.f3908g + c0349f.f3907f);
                    int i7 = c0350g.f3912m;
                    if (i6 < i7) {
                        c0350g.d(i6);
                    } else {
                        c0350g.d(i7);
                    }
                }
                if (c0350g.f3909j && c0349f.f3911l.size() > 0 && c0349f2.f3911l.size() > 0) {
                    C0349f c0349f6 = (C0349f) c0349f.f3911l.get(0);
                    C0349f c0349f7 = (C0349f) c0349f2.f3911l.get(0);
                    int i8 = c0349f6.f3908g;
                    int i9 = c0349f.f3907f + i8;
                    int i10 = c0349f7.f3908g;
                    int i11 = c0349f2.f3907f + i10;
                    float f5 = this.f3925b.f3721e0;
                    if (c0349f6 == c0349f7) {
                        f5 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    c0349f.d((int) ((((i10 - i8) - c0350g.f3908g) * f5) + i8 + 0.5f));
                    c0349f2.d(c0349f.f3908g + c0350g.f3908g);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v114, types: [u.a, u.g] */
    @Override // u.AbstractC0358o
    public final void d() {
        C0326d c0326d;
        C0326d c0326d2;
        C0326d c0326d3;
        C0326d c0326d4;
        C0326d c0326d5 = this.f3925b;
        boolean z2 = c0326d5.f3714a;
        C0350g c0350g = this.f3927e;
        if (z2) {
            c0350g.d(c0326d5.k());
        }
        boolean z3 = c0350g.f3909j;
        C0349f c0349f = this.i;
        C0349f c0349f2 = this.h;
        if (!z3) {
            C0326d c0326d6 = this.f3925b;
            this.d = c0326d6.f3741p0[1];
            if (c0326d6.f3693E) {
                this.f3918l = new C0350g(this);
            }
            int i = this.d;
            if (i != 3) {
                if (i == 4 && (c0326d4 = this.f3925b.f3707T) != null && c0326d4.f3741p0[1] == 1) {
                    int k2 = (c0326d4.k() - this.f3925b.f3697J.e()) - this.f3925b.f3699L.e();
                    AbstractC0358o.b(c0349f2, c0326d4.f3720e.h, this.f3925b.f3697J.e());
                    AbstractC0358o.b(c0349f, c0326d4.f3720e.i, -this.f3925b.f3699L.e());
                    c0350g.d(k2);
                    return;
                }
                if (i == 1) {
                    c0350g.d(this.f3925b.k());
                }
            }
        } else if (this.d == 4 && (c0326d2 = (c0326d = this.f3925b).f3707T) != null && c0326d2.f3741p0[1] == 1) {
            AbstractC0358o.b(c0349f2, c0326d2.f3720e.h, c0326d.f3697J.e());
            AbstractC0358o.b(c0349f, c0326d2.f3720e.i, -this.f3925b.f3699L.e());
            return;
        }
        boolean z4 = c0350g.f3909j;
        C0349f c0349f3 = this.f3917k;
        if (z4) {
            C0326d c0326d7 = this.f3925b;
            if (c0326d7.f3714a) {
                C0325c[] c0325cArr = c0326d7.f3704Q;
                C0325c c0325c = c0325cArr[2];
                C0325c c0325c2 = c0325c.f3687f;
                if (c0325c2 != null && c0325cArr[3].f3687f != null) {
                    if (c0326d7.y()) {
                        c0349f2.f3907f = this.f3925b.f3704Q[2].e();
                        c0349f.f3907f = -this.f3925b.f3704Q[3].e();
                    } else {
                        C0349f h = AbstractC0358o.h(this.f3925b.f3704Q[2]);
                        if (h != null) {
                            AbstractC0358o.b(c0349f2, h, this.f3925b.f3704Q[2].e());
                        }
                        C0349f h2 = AbstractC0358o.h(this.f3925b.f3704Q[3]);
                        if (h2 != null) {
                            AbstractC0358o.b(c0349f, h2, -this.f3925b.f3704Q[3].e());
                        }
                        c0349f2.f3904b = true;
                        c0349f.f3904b = true;
                    }
                    C0326d c0326d8 = this.f3925b;
                    if (c0326d8.f3693E) {
                        AbstractC0358o.b(c0349f3, c0349f2, c0326d8.f3715a0);
                        return;
                    }
                    return;
                }
                if (c0325c2 != null) {
                    C0349f h3 = AbstractC0358o.h(c0325c);
                    if (h3 != null) {
                        AbstractC0358o.b(c0349f2, h3, this.f3925b.f3704Q[2].e());
                        AbstractC0358o.b(c0349f, c0349f2, c0350g.f3908g);
                        C0326d c0326d9 = this.f3925b;
                        if (c0326d9.f3693E) {
                            AbstractC0358o.b(c0349f3, c0349f2, c0326d9.f3715a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C0325c c0325c3 = c0325cArr[3];
                if (c0325c3.f3687f != null) {
                    C0349f h4 = AbstractC0358o.h(c0325c3);
                    if (h4 != null) {
                        AbstractC0358o.b(c0349f, h4, -this.f3925b.f3704Q[3].e());
                        AbstractC0358o.b(c0349f2, c0349f, -c0350g.f3908g);
                    }
                    C0326d c0326d10 = this.f3925b;
                    if (c0326d10.f3693E) {
                        AbstractC0358o.b(c0349f3, c0349f2, c0326d10.f3715a0);
                        return;
                    }
                    return;
                }
                C0325c c0325c4 = c0325cArr[4];
                if (c0325c4.f3687f != null) {
                    C0349f h5 = AbstractC0358o.h(c0325c4);
                    if (h5 != null) {
                        AbstractC0358o.b(c0349f3, h5, 0);
                        AbstractC0358o.b(c0349f2, c0349f3, -this.f3925b.f3715a0);
                        AbstractC0358o.b(c0349f, c0349f2, c0350g.f3908g);
                        return;
                    }
                    return;
                }
                if ((c0326d7 instanceof t.i) || c0326d7.f3707T == null || c0326d7.i(7).f3687f != null) {
                    return;
                }
                C0326d c0326d11 = this.f3925b;
                AbstractC0358o.b(c0349f2, c0326d11.f3707T.f3720e.h, c0326d11.s());
                AbstractC0358o.b(c0349f, c0349f2, c0350g.f3908g);
                C0326d c0326d12 = this.f3925b;
                if (c0326d12.f3693E) {
                    AbstractC0358o.b(c0349f3, c0349f2, c0326d12.f3715a0);
                    return;
                }
                return;
            }
        }
        if (z4 || this.d != 3) {
            c0350g.b(this);
        } else {
            C0326d c0326d13 = this.f3925b;
            int i2 = c0326d13.f3744s;
            if (i2 == 2) {
                C0326d c0326d14 = c0326d13.f3707T;
                if (c0326d14 != null) {
                    C0350g c0350g2 = c0326d14.f3720e.f3927e;
                    c0350g.f3911l.add(c0350g2);
                    c0350g2.f3910k.add(c0350g);
                    c0350g.f3904b = true;
                    c0350g.f3910k.add(c0349f2);
                    c0350g.f3910k.add(c0349f);
                }
            } else if (i2 == 3 && !c0326d13.y()) {
                C0326d c0326d15 = this.f3925b;
                if (c0326d15.f3743r != 3) {
                    C0350g c0350g3 = c0326d15.d.f3927e;
                    c0350g.f3911l.add(c0350g3);
                    c0350g3.f3910k.add(c0350g);
                    c0350g.f3904b = true;
                    c0350g.f3910k.add(c0349f2);
                    c0350g.f3910k.add(c0349f);
                }
            }
        }
        C0326d c0326d16 = this.f3925b;
        C0325c[] c0325cArr2 = c0326d16.f3704Q;
        C0325c c0325c5 = c0325cArr2[2];
        C0325c c0325c6 = c0325c5.f3687f;
        if (c0325c6 != null && c0325cArr2[3].f3687f != null) {
            if (c0326d16.y()) {
                c0349f2.f3907f = this.f3925b.f3704Q[2].e();
                c0349f.f3907f = -this.f3925b.f3704Q[3].e();
            } else {
                C0349f h6 = AbstractC0358o.h(this.f3925b.f3704Q[2]);
                C0349f h7 = AbstractC0358o.h(this.f3925b.f3704Q[3]);
                if (h6 != null) {
                    h6.b(this);
                }
                if (h7 != null) {
                    h7.b(this);
                }
                this.f3930j = 4;
            }
            if (this.f3925b.f3693E) {
                c(c0349f3, c0349f2, 1, this.f3918l);
            }
        } else if (c0325c6 != null) {
            C0349f h8 = AbstractC0358o.h(c0325c5);
            if (h8 != null) {
                AbstractC0358o.b(c0349f2, h8, this.f3925b.f3704Q[2].e());
                c(c0349f, c0349f2, 1, c0350g);
                if (this.f3925b.f3693E) {
                    c(c0349f3, c0349f2, 1, this.f3918l);
                }
                if (this.d == 3) {
                    C0326d c0326d17 = this.f3925b;
                    if (c0326d17.f3710W > 0.0f) {
                        C0354k c0354k = c0326d17.d;
                        if (c0354k.d == 3) {
                            c0354k.f3927e.f3910k.add(c0350g);
                            c0350g.f3911l.add(this.f3925b.d.f3927e);
                            c0350g.f3903a = this;
                        }
                    }
                }
            }
        } else {
            C0325c c0325c7 = c0325cArr2[3];
            if (c0325c7.f3687f != null) {
                C0349f h9 = AbstractC0358o.h(c0325c7);
                if (h9 != null) {
                    AbstractC0358o.b(c0349f, h9, -this.f3925b.f3704Q[3].e());
                    c(c0349f2, c0349f, -1, c0350g);
                    if (this.f3925b.f3693E) {
                        c(c0349f3, c0349f2, 1, this.f3918l);
                    }
                }
            } else {
                C0325c c0325c8 = c0325cArr2[4];
                if (c0325c8.f3687f != null) {
                    C0349f h10 = AbstractC0358o.h(c0325c8);
                    if (h10 != null) {
                        AbstractC0358o.b(c0349f3, h10, 0);
                        c(c0349f2, c0349f3, -1, this.f3918l);
                        c(c0349f, c0349f2, 1, c0350g);
                    }
                } else if (!(c0326d16 instanceof t.i) && (c0326d3 = c0326d16.f3707T) != null) {
                    AbstractC0358o.b(c0349f2, c0326d3.f3720e.h, c0326d16.s());
                    c(c0349f, c0349f2, 1, c0350g);
                    if (this.f3925b.f3693E) {
                        c(c0349f3, c0349f2, 1, this.f3918l);
                    }
                    if (this.d == 3) {
                        C0326d c0326d18 = this.f3925b;
                        if (c0326d18.f3710W > 0.0f) {
                            C0354k c0354k2 = c0326d18.d;
                            if (c0354k2.d == 3) {
                                c0354k2.f3927e.f3910k.add(c0350g);
                                c0350g.f3911l.add(this.f3925b.d.f3927e);
                                c0350g.f3903a = this;
                            }
                        }
                    }
                }
            }
        }
        if (c0350g.f3911l.size() == 0) {
            c0350g.f3905c = true;
        }
    }

    @Override // u.AbstractC0358o
    public final void e() {
        C0349f c0349f = this.h;
        if (c0349f.f3909j) {
            this.f3925b.f3713Z = c0349f.f3908g;
        }
    }

    @Override // u.AbstractC0358o
    public final void f() {
        this.f3926c = null;
        this.h.c();
        this.i.c();
        this.f3917k.c();
        this.f3927e.c();
        this.f3929g = false;
    }

    @Override // u.AbstractC0358o
    public final boolean k() {
        return this.d != 3 || this.f3925b.f3744s == 0;
    }

    public final void m() {
        this.f3929g = false;
        C0349f c0349f = this.h;
        c0349f.c();
        c0349f.f3909j = false;
        C0349f c0349f2 = this.i;
        c0349f2.c();
        c0349f2.f3909j = false;
        C0349f c0349f3 = this.f3917k;
        c0349f3.c();
        c0349f3.f3909j = false;
        this.f3927e.f3909j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f3925b.f3726h0;
    }
}
