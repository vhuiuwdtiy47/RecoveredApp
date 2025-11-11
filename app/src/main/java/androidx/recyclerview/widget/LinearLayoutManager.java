package androidx.recyclerview.widget;

import U.f;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import l.AbstractC0271z;
import n0.C0290m;
import n0.C0295s;
import n0.C0296t;
import n0.C0297u;
import n0.C0298v;
import n0.G;
import n0.H;
import n0.I;
import n0.N;
import n0.S;
import n0.T;
import n0.r;

/* loaded from: classes.dex */
public class LinearLayoutManager extends H implements S {

    /* renamed from: A, reason: collision with root package name */
    public final r f1622A;

    /* renamed from: B, reason: collision with root package name */
    public final C0295s f1623B;

    /* renamed from: C, reason: collision with root package name */
    public final int f1624C;

    /* renamed from: D, reason: collision with root package name */
    public final int[] f1625D;

    /* renamed from: p, reason: collision with root package name */
    public int f1626p;

    /* renamed from: q, reason: collision with root package name */
    public C0296t f1627q;

    /* renamed from: r, reason: collision with root package name */
    public f f1628r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1629s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f1630t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1631u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1632v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f1633w;

    /* renamed from: x, reason: collision with root package name */
    public int f1634x;

    /* renamed from: y, reason: collision with root package name */
    public int f1635y;

    /* renamed from: z, reason: collision with root package name */
    public C0297u f1636z;

    /* JADX WARN: Type inference failed for: r2v1, types: [n0.s, java.lang.Object] */
    public LinearLayoutManager(int i) {
        this.f1626p = 1;
        this.f1630t = false;
        this.f1631u = false;
        this.f1632v = false;
        this.f1633w = true;
        this.f1634x = -1;
        this.f1635y = Integer.MIN_VALUE;
        this.f1636z = null;
        this.f1622A = new r();
        this.f1623B = new Object();
        this.f1624C = 2;
        this.f1625D = new int[2];
        Z0(i);
        c(null);
        if (this.f1630t) {
            this.f1630t = false;
            l0();
        }
    }

    public void A0(T t2, int[] iArr) {
        int i;
        int l2 = t2.f3279a != -1 ? this.f1628r.l() : 0;
        if (this.f1627q.f3448f == -1) {
            i = 0;
        } else {
            i = l2;
            l2 = 0;
        }
        iArr[0] = l2;
        iArr[1] = i;
    }

    public void B0(T t2, C0296t c0296t, C0290m c0290m) {
        int i = c0296t.d;
        if (i < 0 || i >= t2.b()) {
            return;
        }
        c0290m.a(i, Math.max(0, c0296t.f3449g));
    }

    public final int C0(T t2) {
        if (v() == 0) {
            return 0;
        }
        G0();
        f fVar = this.f1628r;
        boolean z2 = !this.f1633w;
        return AbstractC0271z.d(t2, fVar, J0(z2), I0(z2), this, this.f1633w);
    }

    public final int D0(T t2) {
        if (v() == 0) {
            return 0;
        }
        G0();
        f fVar = this.f1628r;
        boolean z2 = !this.f1633w;
        return AbstractC0271z.e(t2, fVar, J0(z2), I0(z2), this, this.f1633w, this.f1631u);
    }

    public final int E0(T t2) {
        if (v() == 0) {
            return 0;
        }
        G0();
        f fVar = this.f1628r;
        boolean z2 = !this.f1633w;
        return AbstractC0271z.f(t2, fVar, J0(z2), I0(z2), this, this.f1633w);
    }

    public final int F0(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.f1626p == 1) ? 1 : Integer.MIN_VALUE : this.f1626p == 0 ? 1 : Integer.MIN_VALUE : this.f1626p == 1 ? -1 : Integer.MIN_VALUE : this.f1626p == 0 ? -1 : Integer.MIN_VALUE : (this.f1626p != 1 && S0()) ? -1 : 1 : (this.f1626p != 1 && S0()) ? 1 : -1;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, n0.t] */
    public final void G0() {
        if (this.f1627q == null) {
            ?? obj = new Object();
            obj.f3444a = true;
            obj.h = 0;
            obj.i = 0;
            obj.f3451k = null;
            this.f1627q = obj;
        }
    }

    public final int H0(N n2, C0296t c0296t, T t2, boolean z2) {
        int i;
        int i2 = c0296t.f3446c;
        int i3 = c0296t.f3449g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                c0296t.f3449g = i3 + i2;
            }
            V0(n2, c0296t);
        }
        int i4 = c0296t.f3446c + c0296t.h;
        while (true) {
            if ((!c0296t.f3452l && i4 <= 0) || (i = c0296t.d) < 0 || i >= t2.b()) {
                break;
            }
            C0295s c0295s = this.f1623B;
            c0295s.f3441a = 0;
            c0295s.f3442b = false;
            c0295s.f3443c = false;
            c0295s.d = false;
            T0(n2, t2, c0296t, c0295s);
            if (!c0295s.f3442b) {
                int i5 = c0296t.f3445b;
                int i6 = c0295s.f3441a;
                c0296t.f3445b = (c0296t.f3448f * i6) + i5;
                if (!c0295s.f3443c || c0296t.f3451k != null || !t2.f3284g) {
                    c0296t.f3446c -= i6;
                    i4 -= i6;
                }
                int i7 = c0296t.f3449g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    c0296t.f3449g = i8;
                    int i9 = c0296t.f3446c;
                    if (i9 < 0) {
                        c0296t.f3449g = i8 + i9;
                    }
                    V0(n2, c0296t);
                }
                if (z2 && c0295s.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - c0296t.f3446c;
    }

    public final View I0(boolean z2) {
        return this.f1631u ? M0(0, v(), z2) : M0(v() - 1, -1, z2);
    }

    public final View J0(boolean z2) {
        return this.f1631u ? M0(v() - 1, -1, z2) : M0(0, v(), z2);
    }

    public final int K0() {
        View M02 = M0(v() - 1, -1, false);
        if (M02 == null) {
            return -1;
        }
        return H.H(M02);
    }

    @Override // n0.H
    public final boolean L() {
        return true;
    }

    public final View L0(int i, int i2) {
        int i3;
        int i4;
        G0();
        if (i2 <= i && i2 >= i) {
            return u(i);
        }
        if (this.f1628r.e(u(i)) < this.f1628r.k()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.f1626p == 0 ? this.f3248c.t(i, i2, i3, i4) : this.d.t(i, i2, i3, i4);
    }

    public final View M0(int i, int i2, boolean z2) {
        G0();
        int i3 = z2 ? 24579 : 320;
        return this.f1626p == 0 ? this.f3248c.t(i, i2, i3, 320) : this.d.t(i, i2, i3, 320);
    }

    public View N0(N n2, T t2, int i, int i2, int i3) {
        G0();
        int k2 = this.f1628r.k();
        int g2 = this.f1628r.g();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View u2 = u(i);
            int H2 = H.H(u2);
            if (H2 >= 0 && H2 < i3) {
                if (((I) u2.getLayoutParams()).f3258a.h()) {
                    if (view2 == null) {
                        view2 = u2;
                    }
                } else {
                    if (this.f1628r.e(u2) < g2 && this.f1628r.b(u2) >= k2) {
                        return u2;
                    }
                    if (view == null) {
                        view = u2;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    public final int O0(int i, N n2, T t2, boolean z2) {
        int g2;
        int g3 = this.f1628r.g() - i;
        if (g3 <= 0) {
            return 0;
        }
        int i2 = -Y0(-g3, n2, t2);
        int i3 = i + i2;
        if (!z2 || (g2 = this.f1628r.g() - i3) <= 0) {
            return i2;
        }
        this.f1628r.o(g2);
        return g2 + i2;
    }

    public final int P0(int i, N n2, T t2, boolean z2) {
        int k2;
        int k3 = i - this.f1628r.k();
        if (k3 <= 0) {
            return 0;
        }
        int i2 = -Y0(k3, n2, t2);
        int i3 = i + i2;
        if (!z2 || (k2 = i3 - this.f1628r.k()) <= 0) {
            return i2;
        }
        this.f1628r.o(-k2);
        return i2 - k2;
    }

    public final View Q0() {
        return u(this.f1631u ? 0 : v() - 1);
    }

    @Override // n0.H
    public final void R(RecyclerView recyclerView) {
    }

    public final View R0() {
        return u(this.f1631u ? v() - 1 : 0);
    }

    @Override // n0.H
    public View S(View view, int i, N n2, T t2) {
        int F02;
        X0();
        if (v() != 0 && (F02 = F0(i)) != Integer.MIN_VALUE) {
            G0();
            b1(F02, (int) (this.f1628r.l() * 0.33333334f), false, t2);
            C0296t c0296t = this.f1627q;
            c0296t.f3449g = Integer.MIN_VALUE;
            c0296t.f3444a = false;
            H0(n2, c0296t, t2, true);
            View L02 = F02 == -1 ? this.f1631u ? L0(v() - 1, -1) : L0(0, v()) : this.f1631u ? L0(0, v()) : L0(v() - 1, -1);
            View R02 = F02 == -1 ? R0() : Q0();
            if (!R02.hasFocusable()) {
                return L02;
            }
            if (L02 != null) {
                return R02;
            }
        }
        return null;
    }

    public final boolean S0() {
        return C() == 1;
    }

    @Override // n0.H
    public final void T(AccessibilityEvent accessibilityEvent) {
        super.T(accessibilityEvent);
        if (v() > 0) {
            View M02 = M0(0, v(), false);
            accessibilityEvent.setFromIndex(M02 == null ? -1 : H.H(M02));
            accessibilityEvent.setToIndex(K0());
        }
    }

    public void T0(N n2, T t2, C0296t c0296t, C0295s c0295s) {
        int G;
        int i;
        int i2;
        int i3;
        int i4;
        View b2 = c0296t.b(n2);
        if (b2 == null) {
            c0295s.f3442b = true;
            return;
        }
        I i5 = (I) b2.getLayoutParams();
        if (c0296t.f3451k == null) {
            if (this.f1631u == (c0296t.f3448f == -1)) {
                b(b2, -1, false);
            } else {
                b(b2, 0, false);
            }
        } else {
            if (this.f1631u == (c0296t.f3448f == -1)) {
                b(b2, -1, true);
            } else {
                b(b2, 0, true);
            }
        }
        I i6 = (I) b2.getLayoutParams();
        Rect J2 = this.f3247b.J(b2);
        int i7 = J2.left + J2.right;
        int i8 = J2.top + J2.bottom;
        int w2 = H.w(d(), this.f3256n, this.f3254l, F() + E() + ((ViewGroup.MarginLayoutParams) i6).leftMargin + ((ViewGroup.MarginLayoutParams) i6).rightMargin + i7, ((ViewGroup.MarginLayoutParams) i6).width);
        int w3 = H.w(e(), this.f3257o, this.f3255m, D() + G() + ((ViewGroup.MarginLayoutParams) i6).topMargin + ((ViewGroup.MarginLayoutParams) i6).bottomMargin + i8, ((ViewGroup.MarginLayoutParams) i6).height);
        if (u0(b2, w2, w3, i6)) {
            b2.measure(w2, w3);
        }
        c0295s.f3441a = this.f1628r.c(b2);
        if (this.f1626p == 1) {
            if (S0()) {
                i2 = this.f3256n - F();
                i4 = i2 - this.f1628r.d(b2);
            } else {
                int E2 = E();
                i2 = this.f1628r.d(b2) + E2;
                i4 = E2;
            }
            if (c0296t.f3448f == -1) {
                i3 = c0296t.f3445b;
                G = i3 - c0295s.f3441a;
            } else {
                G = c0296t.f3445b;
                i3 = c0295s.f3441a + G;
            }
        } else {
            G = G();
            int d = this.f1628r.d(b2) + G;
            if (c0296t.f3448f == -1) {
                i2 = c0296t.f3445b;
                i = i2 - c0295s.f3441a;
            } else {
                i = c0296t.f3445b;
                i2 = c0295s.f3441a + i;
            }
            int i9 = i;
            i3 = d;
            i4 = i9;
        }
        H.N(b2, i4, G, i2, i3);
        if (i5.f3258a.h() || i5.f3258a.k()) {
            c0295s.f3443c = true;
        }
        c0295s.d = b2.hasFocusable();
    }

    public void U0(N n2, T t2, r rVar, int i) {
    }

    public final void V0(N n2, C0296t c0296t) {
        if (!c0296t.f3444a || c0296t.f3452l) {
            return;
        }
        int i = c0296t.f3449g;
        int i2 = c0296t.i;
        if (c0296t.f3448f == -1) {
            int v2 = v();
            if (i < 0) {
                return;
            }
            int f2 = (this.f1628r.f() - i) + i2;
            if (this.f1631u) {
                for (int i3 = 0; i3 < v2; i3++) {
                    View u2 = u(i3);
                    if (this.f1628r.e(u2) < f2 || this.f1628r.n(u2) < f2) {
                        W0(n2, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = v2 - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View u3 = u(i5);
                if (this.f1628r.e(u3) < f2 || this.f1628r.n(u3) < f2) {
                    W0(n2, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i6 = i - i2;
        int v3 = v();
        if (!this.f1631u) {
            for (int i7 = 0; i7 < v3; i7++) {
                View u4 = u(i7);
                if (this.f1628r.b(u4) > i6 || this.f1628r.m(u4) > i6) {
                    W0(n2, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = v3 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View u5 = u(i9);
            if (this.f1628r.b(u5) > i6 || this.f1628r.m(u5) > i6) {
                W0(n2, i8, i9);
                return;
            }
        }
    }

    public final void W0(N n2, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                View u2 = u(i);
                j0(i);
                n2.f(u2);
                i--;
            }
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            View u3 = u(i3);
            j0(i3);
            n2.f(u3);
        }
    }

    public final void X0() {
        if (this.f1626p == 1 || !S0()) {
            this.f1631u = this.f1630t;
        } else {
            this.f1631u = !this.f1630t;
        }
    }

    public final int Y0(int i, N n2, T t2) {
        if (v() != 0 && i != 0) {
            G0();
            this.f1627q.f3444a = true;
            int i2 = i > 0 ? 1 : -1;
            int abs = Math.abs(i);
            b1(i2, abs, true, t2);
            C0296t c0296t = this.f1627q;
            int H02 = H0(n2, c0296t, t2, false) + c0296t.f3449g;
            if (H02 >= 0) {
                if (abs > H02) {
                    i = i2 * H02;
                }
                this.f1628r.o(-i);
                this.f1627q.f3450j = i;
                return i;
            }
        }
        return 0;
    }

    public final void Z0(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(D.f.b("invalid orientation:", i));
        }
        c(null);
        if (i != this.f1626p || this.f1628r == null) {
            f a2 = f.a(this, i);
            this.f1628r = a2;
            this.f1622A.f3437a = a2;
            this.f1626p = i;
            l0();
        }
    }

    @Override // n0.S
    public final PointF a(int i) {
        if (v() == 0) {
            return null;
        }
        int i2 = (i < H.H(u(0))) != this.f1631u ? -1 : 1;
        return this.f1626p == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    public void a1(boolean z2) {
        c(null);
        if (this.f1632v == z2) {
            return;
        }
        this.f1632v = z2;
        l0();
    }

    /* JADX WARN: Removed duplicated region for block: B:183:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0243  */
    @Override // n0.H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b0(n0.N r18, n0.T r19) {
        /*
            Method dump skipped, instructions count: 1173
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.b0(n0.N, n0.T):void");
    }

    public final void b1(int i, int i2, boolean z2, T t2) {
        int k2;
        this.f1627q.f3452l = this.f1628r.i() == 0 && this.f1628r.f() == 0;
        this.f1627q.f3448f = i;
        int[] iArr = this.f1625D;
        iArr[0] = 0;
        iArr[1] = 0;
        A0(t2, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        boolean z3 = i == 1;
        C0296t c0296t = this.f1627q;
        int i3 = z3 ? max2 : max;
        c0296t.h = i3;
        if (!z3) {
            max = max2;
        }
        c0296t.i = max;
        if (z3) {
            c0296t.h = this.f1628r.h() + i3;
            View Q02 = Q0();
            C0296t c0296t2 = this.f1627q;
            c0296t2.f3447e = this.f1631u ? -1 : 1;
            int H2 = H.H(Q02);
            C0296t c0296t3 = this.f1627q;
            c0296t2.d = H2 + c0296t3.f3447e;
            c0296t3.f3445b = this.f1628r.b(Q02);
            k2 = this.f1628r.b(Q02) - this.f1628r.g();
        } else {
            View R02 = R0();
            C0296t c0296t4 = this.f1627q;
            c0296t4.h = this.f1628r.k() + c0296t4.h;
            C0296t c0296t5 = this.f1627q;
            c0296t5.f3447e = this.f1631u ? 1 : -1;
            int H3 = H.H(R02);
            C0296t c0296t6 = this.f1627q;
            c0296t5.d = H3 + c0296t6.f3447e;
            c0296t6.f3445b = this.f1628r.e(R02);
            k2 = (-this.f1628r.e(R02)) + this.f1628r.k();
        }
        C0296t c0296t7 = this.f1627q;
        c0296t7.f3446c = i2;
        if (z2) {
            c0296t7.f3446c = i2 - k2;
        }
        c0296t7.f3449g = k2;
    }

    @Override // n0.H
    public final void c(String str) {
        if (this.f1636z == null) {
            super.c(str);
        }
    }

    @Override // n0.H
    public void c0(T t2) {
        this.f1636z = null;
        this.f1634x = -1;
        this.f1635y = Integer.MIN_VALUE;
        this.f1622A.d();
    }

    public final void c1(int i, int i2) {
        this.f1627q.f3446c = this.f1628r.g() - i2;
        C0296t c0296t = this.f1627q;
        c0296t.f3447e = this.f1631u ? -1 : 1;
        c0296t.d = i;
        c0296t.f3448f = 1;
        c0296t.f3445b = i2;
        c0296t.f3449g = Integer.MIN_VALUE;
    }

    @Override // n0.H
    public final boolean d() {
        return this.f1626p == 0;
    }

    @Override // n0.H
    public final void d0(Parcelable parcelable) {
        if (parcelable instanceof C0297u) {
            this.f1636z = (C0297u) parcelable;
            l0();
        }
    }

    public final void d1(int i, int i2) {
        this.f1627q.f3446c = i2 - this.f1628r.k();
        C0296t c0296t = this.f1627q;
        c0296t.d = i;
        c0296t.f3447e = this.f1631u ? 1 : -1;
        c0296t.f3448f = -1;
        c0296t.f3445b = i2;
        c0296t.f3449g = Integer.MIN_VALUE;
    }

    @Override // n0.H
    public final boolean e() {
        return this.f1626p == 1;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcelable, java.lang.Object, n0.u] */
    /* JADX WARN: Type inference failed for: r3v7, types: [android.os.Parcelable, java.lang.Object, n0.u] */
    @Override // n0.H
    public final Parcelable e0() {
        C0297u c0297u = this.f1636z;
        if (c0297u != null) {
            ?? obj = new Object();
            obj.f3453a = c0297u.f3453a;
            obj.f3454b = c0297u.f3454b;
            obj.f3455c = c0297u.f3455c;
            return obj;
        }
        ?? obj2 = new Object();
        if (v() <= 0) {
            obj2.f3453a = -1;
            return obj2;
        }
        G0();
        boolean z2 = this.f1629s ^ this.f1631u;
        obj2.f3455c = z2;
        if (z2) {
            View Q02 = Q0();
            obj2.f3454b = this.f1628r.g() - this.f1628r.b(Q02);
            obj2.f3453a = H.H(Q02);
            return obj2;
        }
        View R02 = R0();
        obj2.f3453a = H.H(R02);
        obj2.f3454b = this.f1628r.e(R02) - this.f1628r.k();
        return obj2;
    }

    @Override // n0.H
    public final void h(int i, int i2, T t2, C0290m c0290m) {
        if (this.f1626p != 0) {
            i = i2;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        G0();
        b1(i > 0 ? 1 : -1, Math.abs(i), true, t2);
        B0(t2, this.f1627q, c0290m);
    }

    @Override // n0.H
    public final void i(int i, C0290m c0290m) {
        boolean z2;
        int i2;
        C0297u c0297u = this.f1636z;
        if (c0297u == null || (i2 = c0297u.f3453a) < 0) {
            X0();
            z2 = this.f1631u;
            i2 = this.f1634x;
            if (i2 == -1) {
                i2 = z2 ? i - 1 : 0;
            }
        } else {
            z2 = c0297u.f3455c;
        }
        int i3 = z2 ? -1 : 1;
        for (int i4 = 0; i4 < this.f1624C && i2 >= 0 && i2 < i; i4++) {
            c0290m.a(i2, 0);
            i2 += i3;
        }
    }

    @Override // n0.H
    public final int j(T t2) {
        return C0(t2);
    }

    @Override // n0.H
    public int k(T t2) {
        return D0(t2);
    }

    @Override // n0.H
    public int l(T t2) {
        return E0(t2);
    }

    @Override // n0.H
    public final int m(T t2) {
        return C0(t2);
    }

    @Override // n0.H
    public int m0(int i, N n2, T t2) {
        if (this.f1626p == 1) {
            return 0;
        }
        return Y0(i, n2, t2);
    }

    @Override // n0.H
    public int n(T t2) {
        return D0(t2);
    }

    @Override // n0.H
    public final void n0(int i) {
        this.f1634x = i;
        this.f1635y = Integer.MIN_VALUE;
        C0297u c0297u = this.f1636z;
        if (c0297u != null) {
            c0297u.f3453a = -1;
        }
        l0();
    }

    @Override // n0.H
    public int o(T t2) {
        return E0(t2);
    }

    @Override // n0.H
    public int o0(int i, N n2, T t2) {
        if (this.f1626p == 0) {
            return 0;
        }
        return Y0(i, n2, t2);
    }

    @Override // n0.H
    public final View q(int i) {
        int v2 = v();
        if (v2 == 0) {
            return null;
        }
        int H2 = i - H.H(u(0));
        if (H2 >= 0 && H2 < v2) {
            View u2 = u(H2);
            if (H.H(u2) == i) {
                return u2;
            }
        }
        return super.q(i);
    }

    @Override // n0.H
    public I r() {
        return new I(-2, -2);
    }

    @Override // n0.H
    public final boolean v0() {
        if (this.f3255m != 1073741824 && this.f3254l != 1073741824) {
            int v2 = v();
            for (int i = 0; i < v2; i++) {
                ViewGroup.LayoutParams layoutParams = u(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // n0.H
    public void x0(RecyclerView recyclerView, int i) {
        C0298v c0298v = new C0298v(recyclerView.getContext());
        c0298v.f3456a = i;
        y0(c0298v);
    }

    @Override // n0.H
    public boolean z0() {
        return this.f1636z == null && this.f1629s == this.f1632v;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [n0.s, java.lang.Object] */
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f1626p = 1;
        this.f1630t = false;
        this.f1631u = false;
        this.f1632v = false;
        this.f1633w = true;
        this.f1634x = -1;
        this.f1635y = Integer.MIN_VALUE;
        this.f1636z = null;
        this.f1622A = new r();
        this.f1623B = new Object();
        this.f1624C = 2;
        this.f1625D = new int[2];
        G I2 = H.I(context, attributeSet, i, i2);
        Z0(I2.f3243a);
        boolean z2 = I2.f3245c;
        c(null);
        if (z2 != this.f1630t) {
            this.f1630t = z2;
            l0();
        }
        a1(I2.d);
    }
}
