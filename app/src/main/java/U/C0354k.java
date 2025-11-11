package u;

import t.C0325c;
import t.C0326d;

/* renamed from: u.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0354k extends AbstractC0358o {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f3914k = new int[2];

    public static void m(int[] iArr, int i, int i2, int i3, int i4, float f2, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f2) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f2) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f2) + 0.5f);
        int i9 = (int) ((i6 / f2) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x0243, code lost:
    
        if (r7 != 1) goto L125;
     */
    @Override // u.InterfaceC0347d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(u.InterfaceC0347d r24) {
        /*
            Method dump skipped, instructions count: 913
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u.C0354k.a(u.d):void");
    }

    @Override // u.AbstractC0358o
    public final void d() {
        C0326d c0326d;
        C0326d c0326d2;
        int i;
        C0326d c0326d3;
        C0326d c0326d4;
        int i2;
        C0326d c0326d5 = this.f3925b;
        boolean z2 = c0326d5.f3714a;
        C0350g c0350g = this.f3927e;
        if (z2) {
            c0350g.d(c0326d5.q());
        }
        boolean z3 = c0350g.f3909j;
        C0349f c0349f = this.i;
        C0349f c0349f2 = this.h;
        if (!z3) {
            C0326d c0326d6 = this.f3925b;
            int i3 = c0326d6.f3741p0[0];
            this.d = i3;
            if (i3 != 3) {
                if (i3 == 4 && (c0326d4 = c0326d6.f3707T) != null && ((i2 = c0326d4.f3741p0[0]) == 1 || i2 == 4)) {
                    int q2 = (c0326d4.q() - this.f3925b.f3696I.e()) - this.f3925b.f3698K.e();
                    AbstractC0358o.b(c0349f2, c0326d4.d.h, this.f3925b.f3696I.e());
                    AbstractC0358o.b(c0349f, c0326d4.d.i, -this.f3925b.f3698K.e());
                    c0350g.d(q2);
                    return;
                }
                if (i3 == 1) {
                    c0350g.d(c0326d6.q());
                }
            }
        } else if (this.d == 4 && (c0326d2 = (c0326d = this.f3925b).f3707T) != null && ((i = c0326d2.f3741p0[0]) == 1 || i == 4)) {
            AbstractC0358o.b(c0349f2, c0326d2.d.h, c0326d.f3696I.e());
            AbstractC0358o.b(c0349f, c0326d2.d.i, -this.f3925b.f3698K.e());
            return;
        }
        if (c0350g.f3909j) {
            C0326d c0326d7 = this.f3925b;
            if (c0326d7.f3714a) {
                C0325c[] c0325cArr = c0326d7.f3704Q;
                C0325c c0325c = c0325cArr[0];
                C0325c c0325c2 = c0325c.f3687f;
                if (c0325c2 != null && c0325cArr[1].f3687f != null) {
                    if (c0326d7.x()) {
                        c0349f2.f3907f = this.f3925b.f3704Q[0].e();
                        c0349f.f3907f = -this.f3925b.f3704Q[1].e();
                        return;
                    }
                    C0349f h = AbstractC0358o.h(this.f3925b.f3704Q[0]);
                    if (h != null) {
                        AbstractC0358o.b(c0349f2, h, this.f3925b.f3704Q[0].e());
                    }
                    C0349f h2 = AbstractC0358o.h(this.f3925b.f3704Q[1]);
                    if (h2 != null) {
                        AbstractC0358o.b(c0349f, h2, -this.f3925b.f3704Q[1].e());
                    }
                    c0349f2.f3904b = true;
                    c0349f.f3904b = true;
                    return;
                }
                if (c0325c2 != null) {
                    C0349f h3 = AbstractC0358o.h(c0325c);
                    if (h3 != null) {
                        AbstractC0358o.b(c0349f2, h3, this.f3925b.f3704Q[0].e());
                        AbstractC0358o.b(c0349f, c0349f2, c0350g.f3908g);
                        return;
                    }
                    return;
                }
                C0325c c0325c3 = c0325cArr[1];
                if (c0325c3.f3687f != null) {
                    C0349f h4 = AbstractC0358o.h(c0325c3);
                    if (h4 != null) {
                        AbstractC0358o.b(c0349f, h4, -this.f3925b.f3704Q[1].e());
                        AbstractC0358o.b(c0349f2, c0349f, -c0350g.f3908g);
                        return;
                    }
                    return;
                }
                if ((c0326d7 instanceof t.i) || c0326d7.f3707T == null || c0326d7.i(7).f3687f != null) {
                    return;
                }
                C0326d c0326d8 = this.f3925b;
                AbstractC0358o.b(c0349f2, c0326d8.f3707T.d.h, c0326d8.r());
                AbstractC0358o.b(c0349f, c0349f2, c0350g.f3908g);
                return;
            }
        }
        if (this.d == 3) {
            C0326d c0326d9 = this.f3925b;
            int i4 = c0326d9.f3743r;
            if (i4 == 2) {
                C0326d c0326d10 = c0326d9.f3707T;
                if (c0326d10 != null) {
                    C0350g c0350g2 = c0326d10.f3720e.f3927e;
                    c0350g.f3911l.add(c0350g2);
                    c0350g2.f3910k.add(c0350g);
                    c0350g.f3904b = true;
                    c0350g.f3910k.add(c0349f2);
                    c0350g.f3910k.add(c0349f);
                }
            } else if (i4 == 3) {
                if (c0326d9.f3744s == 3) {
                    c0349f2.f3903a = this;
                    c0349f.f3903a = this;
                    C0356m c0356m = c0326d9.f3720e;
                    c0356m.h.f3903a = this;
                    c0356m.i.f3903a = this;
                    c0350g.f3903a = this;
                    if (c0326d9.y()) {
                        c0350g.f3911l.add(this.f3925b.f3720e.f3927e);
                        this.f3925b.f3720e.f3927e.f3910k.add(c0350g);
                        C0356m c0356m2 = this.f3925b.f3720e;
                        c0356m2.f3927e.f3903a = this;
                        c0350g.f3911l.add(c0356m2.h);
                        c0350g.f3911l.add(this.f3925b.f3720e.i);
                        this.f3925b.f3720e.h.f3910k.add(c0350g);
                        this.f3925b.f3720e.i.f3910k.add(c0350g);
                    } else if (this.f3925b.x()) {
                        this.f3925b.f3720e.f3927e.f3911l.add(c0350g);
                        c0350g.f3910k.add(this.f3925b.f3720e.f3927e);
                    } else {
                        this.f3925b.f3720e.f3927e.f3911l.add(c0350g);
                    }
                } else {
                    C0350g c0350g3 = c0326d9.f3720e.f3927e;
                    c0350g.f3911l.add(c0350g3);
                    c0350g3.f3910k.add(c0350g);
                    this.f3925b.f3720e.h.f3910k.add(c0350g);
                    this.f3925b.f3720e.i.f3910k.add(c0350g);
                    c0350g.f3904b = true;
                    c0350g.f3910k.add(c0349f2);
                    c0350g.f3910k.add(c0349f);
                    c0349f2.f3911l.add(c0350g);
                    c0349f.f3911l.add(c0350g);
                }
            }
        }
        C0326d c0326d11 = this.f3925b;
        C0325c[] c0325cArr2 = c0326d11.f3704Q;
        C0325c c0325c4 = c0325cArr2[0];
        C0325c c0325c5 = c0325c4.f3687f;
        if (c0325c5 != null && c0325cArr2[1].f3687f != null) {
            if (c0326d11.x()) {
                c0349f2.f3907f = this.f3925b.f3704Q[0].e();
                c0349f.f3907f = -this.f3925b.f3704Q[1].e();
                return;
            }
            C0349f h5 = AbstractC0358o.h(this.f3925b.f3704Q[0]);
            C0349f h6 = AbstractC0358o.h(this.f3925b.f3704Q[1]);
            if (h5 != null) {
                h5.b(this);
            }
            if (h6 != null) {
                h6.b(this);
            }
            this.f3930j = 4;
            return;
        }
        if (c0325c5 != null) {
            C0349f h7 = AbstractC0358o.h(c0325c4);
            if (h7 != null) {
                AbstractC0358o.b(c0349f2, h7, this.f3925b.f3704Q[0].e());
                c(c0349f, c0349f2, 1, c0350g);
                return;
            }
            return;
        }
        C0325c c0325c6 = c0325cArr2[1];
        if (c0325c6.f3687f != null) {
            C0349f h8 = AbstractC0358o.h(c0325c6);
            if (h8 != null) {
                AbstractC0358o.b(c0349f, h8, -this.f3925b.f3704Q[1].e());
                c(c0349f2, c0349f, -1, c0350g);
                return;
            }
            return;
        }
        if ((c0326d11 instanceof t.i) || (c0326d3 = c0326d11.f3707T) == null) {
            return;
        }
        AbstractC0358o.b(c0349f2, c0326d3.d.h, c0326d11.r());
        c(c0349f, c0349f2, 1, c0350g);
    }

    @Override // u.AbstractC0358o
    public final void e() {
        C0349f c0349f = this.h;
        if (c0349f.f3909j) {
            this.f3925b.f3712Y = c0349f.f3908g;
        }
    }

    @Override // u.AbstractC0358o
    public final void f() {
        this.f3926c = null;
        this.h.c();
        this.i.c();
        this.f3927e.c();
        this.f3929g = false;
    }

    @Override // u.AbstractC0358o
    public final boolean k() {
        return this.d != 3 || this.f3925b.f3743r == 0;
    }

    public final void n() {
        this.f3929g = false;
        C0349f c0349f = this.h;
        c0349f.c();
        c0349f.f3909j = false;
        C0349f c0349f2 = this.i;
        c0349f2.c();
        c0349f2.f3909j = false;
        this.f3927e.f3909j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f3925b.f3726h0;
    }
}
