package androidx.recyclerview.widget;

import C.j;
import D0.i;
import M.k;
import U.f;
import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;
import l.AbstractC0271z;
import n0.C0290m;
import n0.C0294q;
import n0.C0298v;
import n0.G;
import n0.H;
import n0.I;
import n0.N;
import n0.S;
import n0.T;
import n0.a0;
import n0.b0;
import n0.d0;
import n0.e0;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends H implements S {

    /* renamed from: B, reason: collision with root package name */
    public final j f1702B;

    /* renamed from: C, reason: collision with root package name */
    public final int f1703C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f1704D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f1705E;

    /* renamed from: F, reason: collision with root package name */
    public d0 f1706F;
    public final Rect G;

    /* renamed from: H, reason: collision with root package name */
    public final a0 f1707H;

    /* renamed from: I, reason: collision with root package name */
    public final boolean f1708I;

    /* renamed from: J, reason: collision with root package name */
    public int[] f1709J;

    /* renamed from: K, reason: collision with root package name */
    public final i f1710K;

    /* renamed from: p, reason: collision with root package name */
    public final int f1711p;

    /* renamed from: q, reason: collision with root package name */
    public final e0[] f1712q;

    /* renamed from: r, reason: collision with root package name */
    public final f f1713r;

    /* renamed from: s, reason: collision with root package name */
    public final f f1714s;

    /* renamed from: t, reason: collision with root package name */
    public final int f1715t;

    /* renamed from: u, reason: collision with root package name */
    public int f1716u;

    /* renamed from: v, reason: collision with root package name */
    public final C0294q f1717v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1718w;

    /* renamed from: y, reason: collision with root package name */
    public final BitSet f1720y;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1719x = false;

    /* renamed from: z, reason: collision with root package name */
    public int f1721z = -1;

    /* renamed from: A, reason: collision with root package name */
    public int f1701A = Integer.MIN_VALUE;

    /* JADX WARN: Type inference failed for: r7v3, types: [n0.q, java.lang.Object] */
    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f1711p = -1;
        this.f1718w = false;
        j jVar = new j(11, false);
        this.f1702B = jVar;
        this.f1703C = 2;
        this.G = new Rect();
        this.f1707H = new a0(this);
        this.f1708I = true;
        this.f1710K = new i(16, this);
        G I2 = H.I(context, attributeSet, i, i2);
        int i3 = I2.f3243a;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        c(null);
        if (i3 != this.f1715t) {
            this.f1715t = i3;
            f fVar = this.f1713r;
            this.f1713r = this.f1714s;
            this.f1714s = fVar;
            l0();
        }
        int i4 = I2.f3244b;
        c(null);
        if (i4 != this.f1711p) {
            int[] iArr = (int[]) jVar.f60b;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            jVar.f61c = null;
            l0();
            this.f1711p = i4;
            this.f1720y = new BitSet(this.f1711p);
            this.f1712q = new e0[this.f1711p];
            for (int i5 = 0; i5 < this.f1711p; i5++) {
                this.f1712q[i5] = new e0(this, i5);
            }
            l0();
        }
        boolean z2 = I2.f3245c;
        c(null);
        d0 d0Var = this.f1706F;
        if (d0Var != null && d0Var.h != z2) {
            d0Var.h = z2;
        }
        this.f1718w = z2;
        l0();
        ?? obj = new Object();
        obj.f3431a = true;
        obj.f3435f = 0;
        obj.f3436g = 0;
        this.f1717v = obj;
        this.f1713r = f.a(this, this.f1715t);
        this.f1714s = f.a(this, 1 - this.f1715t);
    }

    public static int c1(int i, int i2, int i3) {
        int mode;
        return (!(i2 == 0 && i3 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    public final boolean A0() {
        int J02;
        if (v() != 0 && this.f1703C != 0 && this.f3251g) {
            if (this.f1719x) {
                J02 = K0();
                J0();
            } else {
                J02 = J0();
                K0();
            }
            j jVar = this.f1702B;
            if (J02 == 0 && O0() != null) {
                int[] iArr = (int[]) jVar.f60b;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                jVar.f61c = null;
                this.f3250f = true;
                l0();
                return true;
            }
        }
        return false;
    }

    public final int B0(T t2) {
        if (v() == 0) {
            return 0;
        }
        f fVar = this.f1713r;
        boolean z2 = !this.f1708I;
        return AbstractC0271z.d(t2, fVar, G0(z2), F0(z2), this, this.f1708I);
    }

    public final int C0(T t2) {
        if (v() == 0) {
            return 0;
        }
        f fVar = this.f1713r;
        boolean z2 = !this.f1708I;
        return AbstractC0271z.e(t2, fVar, G0(z2), F0(z2), this, this.f1708I, this.f1719x);
    }

    public final int D0(T t2) {
        if (v() == 0) {
            return 0;
        }
        f fVar = this.f1713r;
        boolean z2 = !this.f1708I;
        return AbstractC0271z.f(t2, fVar, G0(z2), F0(z2), this, this.f1708I);
    }

    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [int, boolean] */
    public final int E0(N n2, C0294q c0294q, T t2) {
        e0 e0Var;
        ?? r6;
        int i;
        int i2;
        int c2;
        int k2;
        int c3;
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        int i7 = 1;
        this.f1720y.set(0, this.f1711p, true);
        C0294q c0294q2 = this.f1717v;
        int i8 = c0294q2.i ? c0294q.f3434e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : c0294q.f3434e == 1 ? c0294q.f3436g + c0294q.f3432b : c0294q.f3435f - c0294q.f3432b;
        int i9 = c0294q.f3434e;
        for (int i10 = 0; i10 < this.f1711p; i10++) {
            if (!((ArrayList) this.f1712q[i10].f3354f).isEmpty()) {
                b1(this.f1712q[i10], i9, i8);
            }
        }
        int g2 = this.f1719x ? this.f1713r.g() : this.f1713r.k();
        boolean z2 = false;
        while (true) {
            int i11 = c0294q.f3433c;
            if (((i11 < 0 || i11 >= t2.b()) ? i6 : i7) == 0 || (!c0294q2.i && this.f1720y.isEmpty())) {
                break;
            }
            View view = n2.i(c0294q.f3433c, Long.MAX_VALUE).f3297a;
            c0294q.f3433c += c0294q.d;
            b0 b0Var = (b0) view.getLayoutParams();
            int b2 = b0Var.f3258a.b();
            j jVar = this.f1702B;
            int[] iArr = (int[]) jVar.f60b;
            int i12 = (iArr == null || b2 >= iArr.length) ? -1 : iArr[b2];
            if (i12 == -1) {
                if (S0(c0294q.f3434e)) {
                    i5 = this.f1711p - i7;
                    i4 = -1;
                    i3 = -1;
                } else {
                    i3 = i7;
                    i4 = this.f1711p;
                    i5 = i6;
                }
                e0 e0Var2 = null;
                if (c0294q.f3434e == i7) {
                    int k3 = this.f1713r.k();
                    int i13 = Integer.MAX_VALUE;
                    while (i5 != i4) {
                        e0 e0Var3 = this.f1712q[i5];
                        int g3 = e0Var3.g(k3);
                        if (g3 < i13) {
                            i13 = g3;
                            e0Var2 = e0Var3;
                        }
                        i5 += i3;
                    }
                } else {
                    int g4 = this.f1713r.g();
                    int i14 = Integer.MIN_VALUE;
                    while (i5 != i4) {
                        e0 e0Var4 = this.f1712q[i5];
                        int i15 = e0Var4.i(g4);
                        if (i15 > i14) {
                            e0Var2 = e0Var4;
                            i14 = i15;
                        }
                        i5 += i3;
                    }
                }
                e0Var = e0Var2;
                jVar.r(b2);
                ((int[]) jVar.f60b)[b2] = e0Var.f3353e;
            } else {
                e0Var = this.f1712q[i12];
            }
            b0Var.f3327e = e0Var;
            if (c0294q.f3434e == 1) {
                r6 = 0;
                b(view, -1, false);
            } else {
                r6 = 0;
                b(view, 0, false);
            }
            if (this.f1715t == 1) {
                i = 1;
                Q0(view, H.w(r6, this.f1716u, this.f3254l, r6, ((ViewGroup.MarginLayoutParams) b0Var).width), H.w(true, this.f3257o, this.f3255m, D() + G(), ((ViewGroup.MarginLayoutParams) b0Var).height));
            } else {
                i = 1;
                Q0(view, H.w(true, this.f3256n, this.f3254l, F() + E(), ((ViewGroup.MarginLayoutParams) b0Var).width), H.w(false, this.f1716u, this.f3255m, 0, ((ViewGroup.MarginLayoutParams) b0Var).height));
            }
            if (c0294q.f3434e == i) {
                c2 = e0Var.g(g2);
                i2 = this.f1713r.c(view) + c2;
            } else {
                i2 = e0Var.i(g2);
                c2 = i2 - this.f1713r.c(view);
            }
            if (c0294q.f3434e == 1) {
                e0 e0Var5 = b0Var.f3327e;
                e0Var5.getClass();
                b0 b0Var2 = (b0) view.getLayoutParams();
                b0Var2.f3327e = e0Var5;
                ArrayList arrayList = (ArrayList) e0Var5.f3354f;
                arrayList.add(view);
                e0Var5.f3352c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    e0Var5.f3351b = Integer.MIN_VALUE;
                }
                if (b0Var2.f3258a.h() || b0Var2.f3258a.k()) {
                    e0Var5.d = ((StaggeredGridLayoutManager) e0Var5.f3355g).f1713r.c(view) + e0Var5.d;
                }
            } else {
                e0 e0Var6 = b0Var.f3327e;
                e0Var6.getClass();
                b0 b0Var3 = (b0) view.getLayoutParams();
                b0Var3.f3327e = e0Var6;
                ArrayList arrayList2 = (ArrayList) e0Var6.f3354f;
                arrayList2.add(0, view);
                e0Var6.f3351b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    e0Var6.f3352c = Integer.MIN_VALUE;
                }
                if (b0Var3.f3258a.h() || b0Var3.f3258a.k()) {
                    e0Var6.d = ((StaggeredGridLayoutManager) e0Var6.f3355g).f1713r.c(view) + e0Var6.d;
                }
            }
            if (P0() && this.f1715t == 1) {
                c3 = this.f1714s.g() - (((this.f1711p - 1) - e0Var.f3353e) * this.f1716u);
                k2 = c3 - this.f1714s.c(view);
            } else {
                k2 = this.f1714s.k() + (e0Var.f3353e * this.f1716u);
                c3 = this.f1714s.c(view) + k2;
            }
            if (this.f1715t == 1) {
                H.N(view, k2, c2, c3, i2);
            } else {
                H.N(view, c2, k2, i2, c3);
            }
            b1(e0Var, c0294q2.f3434e, i8);
            U0(n2, c0294q2);
            if (c0294q2.h && view.hasFocusable()) {
                this.f1720y.set(e0Var.f3353e, false);
            }
            i7 = 1;
            z2 = true;
            i6 = 0;
        }
        if (!z2) {
            U0(n2, c0294q2);
        }
        int k4 = c0294q2.f3434e == -1 ? this.f1713r.k() - M0(this.f1713r.k()) : L0(this.f1713r.g()) - this.f1713r.g();
        if (k4 > 0) {
            return Math.min(c0294q.f3432b, k4);
        }
        return 0;
    }

    public final View F0(boolean z2) {
        int k2 = this.f1713r.k();
        int g2 = this.f1713r.g();
        View view = null;
        for (int v2 = v() - 1; v2 >= 0; v2--) {
            View u2 = u(v2);
            int e2 = this.f1713r.e(u2);
            int b2 = this.f1713r.b(u2);
            if (b2 > k2 && e2 < g2) {
                if (b2 <= g2 || !z2) {
                    return u2;
                }
                if (view == null) {
                    view = u2;
                }
            }
        }
        return view;
    }

    public final View G0(boolean z2) {
        int k2 = this.f1713r.k();
        int g2 = this.f1713r.g();
        int v2 = v();
        View view = null;
        for (int i = 0; i < v2; i++) {
            View u2 = u(i);
            int e2 = this.f1713r.e(u2);
            if (this.f1713r.b(u2) > k2 && e2 < g2) {
                if (e2 >= k2 || !z2) {
                    return u2;
                }
                if (view == null) {
                    view = u2;
                }
            }
        }
        return view;
    }

    public final void H0(N n2, T t2, boolean z2) {
        int g2;
        int L02 = L0(Integer.MIN_VALUE);
        if (L02 != Integer.MIN_VALUE && (g2 = this.f1713r.g() - L02) > 0) {
            int i = g2 - (-Y0(-g2, n2, t2));
            if (!z2 || i <= 0) {
                return;
            }
            this.f1713r.o(i);
        }
    }

    public final void I0(N n2, T t2, boolean z2) {
        int k2;
        int M02 = M0(Integer.MAX_VALUE);
        if (M02 != Integer.MAX_VALUE && (k2 = M02 - this.f1713r.k()) > 0) {
            int Y02 = k2 - Y0(k2, n2, t2);
            if (!z2 || Y02 <= 0) {
                return;
            }
            this.f1713r.o(-Y02);
        }
    }

    @Override // n0.H
    public final int J(N n2, T t2) {
        return this.f1715t == 0 ? this.f1711p : super.J(n2, t2);
    }

    public final int J0() {
        if (v() == 0) {
            return 0;
        }
        return H.H(u(0));
    }

    public final int K0() {
        int v2 = v();
        if (v2 == 0) {
            return 0;
        }
        return H.H(u(v2 - 1));
    }

    @Override // n0.H
    public final boolean L() {
        return this.f1703C != 0;
    }

    public final int L0(int i) {
        int g2 = this.f1712q[0].g(i);
        for (int i2 = 1; i2 < this.f1711p; i2++) {
            int g3 = this.f1712q[i2].g(i);
            if (g3 > g2) {
                g2 = g3;
            }
        }
        return g2;
    }

    public final int M0(int i) {
        int i2 = this.f1712q[0].i(i);
        for (int i3 = 1; i3 < this.f1711p; i3++) {
            int i4 = this.f1712q[i3].i(i);
            if (i4 < i2) {
                i2 = i4;
            }
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N0(int r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.N0(int, int, int):void");
    }

    @Override // n0.H
    public final void O(int i) {
        super.O(i);
        for (int i2 = 0; i2 < this.f1711p; i2++) {
            e0 e0Var = this.f1712q[i2];
            int i3 = e0Var.f3351b;
            if (i3 != Integer.MIN_VALUE) {
                e0Var.f3351b = i3 + i;
            }
            int i4 = e0Var.f3352c;
            if (i4 != Integer.MIN_VALUE) {
                e0Var.f3352c = i4 + i;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x002c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View O0() {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.O0():android.view.View");
    }

    @Override // n0.H
    public final void P(int i) {
        super.P(i);
        for (int i2 = 0; i2 < this.f1711p; i2++) {
            e0 e0Var = this.f1712q[i2];
            int i3 = e0Var.f3351b;
            if (i3 != Integer.MIN_VALUE) {
                e0Var.f3351b = i3 + i;
            }
            int i4 = e0Var.f3352c;
            if (i4 != Integer.MIN_VALUE) {
                e0Var.f3352c = i4 + i;
            }
        }
    }

    public final boolean P0() {
        return C() == 1;
    }

    public final void Q0(View view, int i, int i2) {
        RecyclerView recyclerView = this.f3247b;
        Rect rect = this.G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.J(view));
        }
        b0 b0Var = (b0) view.getLayoutParams();
        int c12 = c1(i, ((ViewGroup.MarginLayoutParams) b0Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) b0Var).rightMargin + rect.right);
        int c13 = c1(i2, ((ViewGroup.MarginLayoutParams) b0Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) b0Var).bottomMargin + rect.bottom);
        if (u0(view, c12, c13, b0Var)) {
            view.measure(c12, c13);
        }
    }

    @Override // n0.H
    public final void R(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f3247b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f1710K);
        }
        for (int i = 0; i < this.f1711p; i++) {
            this.f1712q[i].b();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01aa, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01a6, code lost:
    
        if ((r12 < J0()) != r16.f1719x) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x041e, code lost:
    
        if (A0() != false) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0198, code lost:
    
        if (r16.f1719x != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a8, code lost:
    
        r12 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R0(n0.N r17, n0.T r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 1084
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.R0(n0.N, n0.T, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0051, code lost:
    
        if (r8.f1715t == 1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0057, code lost:
    
        if (r8.f1715t == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0063, code lost:
    
        if (P0() == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x006f, code lost:
    
        if (P0() == false) goto L37;
     */
    @Override // n0.H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View S(android.view.View r9, int r10, n0.N r11, n0.T r12) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.S(android.view.View, int, n0.N, n0.T):android.view.View");
    }

    public final boolean S0(int i) {
        if (this.f1715t == 0) {
            return (i == -1) != this.f1719x;
        }
        return ((i == -1) == this.f1719x) == P0();
    }

    @Override // n0.H
    public final void T(AccessibilityEvent accessibilityEvent) {
        super.T(accessibilityEvent);
        if (v() > 0) {
            View G02 = G0(false);
            View F02 = F0(false);
            if (G02 == null || F02 == null) {
                return;
            }
            int H2 = H.H(G02);
            int H3 = H.H(F02);
            if (H2 < H3) {
                accessibilityEvent.setFromIndex(H2);
                accessibilityEvent.setToIndex(H3);
            } else {
                accessibilityEvent.setFromIndex(H3);
                accessibilityEvent.setToIndex(H2);
            }
        }
    }

    public final void T0(int i, T t2) {
        int J02;
        int i2;
        if (i > 0) {
            J02 = K0();
            i2 = 1;
        } else {
            J02 = J0();
            i2 = -1;
        }
        C0294q c0294q = this.f1717v;
        c0294q.f3431a = true;
        a1(J02, t2);
        Z0(i2);
        c0294q.f3433c = J02 + c0294q.d;
        c0294q.f3432b = Math.abs(i);
    }

    public final void U0(N n2, C0294q c0294q) {
        if (!c0294q.f3431a || c0294q.i) {
            return;
        }
        if (c0294q.f3432b == 0) {
            if (c0294q.f3434e == -1) {
                V0(n2, c0294q.f3436g);
                return;
            } else {
                W0(n2, c0294q.f3435f);
                return;
            }
        }
        int i = 1;
        if (c0294q.f3434e == -1) {
            int i2 = c0294q.f3435f;
            int i3 = this.f1712q[0].i(i2);
            while (i < this.f1711p) {
                int i4 = this.f1712q[i].i(i2);
                if (i4 > i3) {
                    i3 = i4;
                }
                i++;
            }
            int i5 = i2 - i3;
            V0(n2, i5 < 0 ? c0294q.f3436g : c0294q.f3436g - Math.min(i5, c0294q.f3432b));
            return;
        }
        int i6 = c0294q.f3436g;
        int g2 = this.f1712q[0].g(i6);
        while (i < this.f1711p) {
            int g3 = this.f1712q[i].g(i6);
            if (g3 < g2) {
                g2 = g3;
            }
            i++;
        }
        int i7 = g2 - c0294q.f3436g;
        W0(n2, i7 < 0 ? c0294q.f3435f : Math.min(i7, c0294q.f3432b) + c0294q.f3435f);
    }

    @Override // n0.H
    public final void V(N n2, T t2, View view, k kVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b0)) {
            U(view, kVar);
            return;
        }
        b0 b0Var = (b0) layoutParams;
        if (this.f1715t == 0) {
            e0 e0Var = b0Var.f3327e;
            kVar.h(M.j.a(false, e0Var == null ? -1 : e0Var.f3353e, 1, -1, -1));
        } else {
            e0 e0Var2 = b0Var.f3327e;
            kVar.h(M.j.a(false, -1, -1, e0Var2 == null ? -1 : e0Var2.f3353e, 1));
        }
    }

    public final void V0(N n2, int i) {
        for (int v2 = v() - 1; v2 >= 0; v2--) {
            View u2 = u(v2);
            if (this.f1713r.e(u2) < i || this.f1713r.n(u2) < i) {
                return;
            }
            b0 b0Var = (b0) u2.getLayoutParams();
            b0Var.getClass();
            if (((ArrayList) b0Var.f3327e.f3354f).size() == 1) {
                return;
            }
            e0 e0Var = b0Var.f3327e;
            ArrayList arrayList = (ArrayList) e0Var.f3354f;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            b0 b0Var2 = (b0) view.getLayoutParams();
            b0Var2.f3327e = null;
            if (b0Var2.f3258a.h() || b0Var2.f3258a.k()) {
                e0Var.d -= ((StaggeredGridLayoutManager) e0Var.f3355g).f1713r.c(view);
            }
            if (size == 1) {
                e0Var.f3351b = Integer.MIN_VALUE;
            }
            e0Var.f3352c = Integer.MIN_VALUE;
            i0(u2, n2);
        }
    }

    @Override // n0.H
    public final void W(int i, int i2) {
        N0(i, i2, 1);
    }

    public final void W0(N n2, int i) {
        while (v() > 0) {
            View u2 = u(0);
            if (this.f1713r.b(u2) > i || this.f1713r.m(u2) > i) {
                return;
            }
            b0 b0Var = (b0) u2.getLayoutParams();
            b0Var.getClass();
            if (((ArrayList) b0Var.f3327e.f3354f).size() == 1) {
                return;
            }
            e0 e0Var = b0Var.f3327e;
            ArrayList arrayList = (ArrayList) e0Var.f3354f;
            View view = (View) arrayList.remove(0);
            b0 b0Var2 = (b0) view.getLayoutParams();
            b0Var2.f3327e = null;
            if (arrayList.size() == 0) {
                e0Var.f3352c = Integer.MIN_VALUE;
            }
            if (b0Var2.f3258a.h() || b0Var2.f3258a.k()) {
                e0Var.d -= ((StaggeredGridLayoutManager) e0Var.f3355g).f1713r.c(view);
            }
            e0Var.f3351b = Integer.MIN_VALUE;
            i0(u2, n2);
        }
    }

    @Override // n0.H
    public final void X() {
        j jVar = this.f1702B;
        int[] iArr = (int[]) jVar.f60b;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        jVar.f61c = null;
        l0();
    }

    public final void X0() {
        if (this.f1715t == 1 || !P0()) {
            this.f1719x = this.f1718w;
        } else {
            this.f1719x = !this.f1718w;
        }
    }

    @Override // n0.H
    public final void Y(int i, int i2) {
        N0(i, i2, 8);
    }

    public final int Y0(int i, N n2, T t2) {
        if (v() == 0 || i == 0) {
            return 0;
        }
        T0(i, t2);
        C0294q c0294q = this.f1717v;
        int E02 = E0(n2, c0294q, t2);
        if (c0294q.f3432b >= E02) {
            i = i < 0 ? -E02 : E02;
        }
        this.f1713r.o(-i);
        this.f1704D = this.f1719x;
        c0294q.f3432b = 0;
        U0(n2, c0294q);
        return i;
    }

    @Override // n0.H
    public final void Z(int i, int i2) {
        N0(i, i2, 2);
    }

    public final void Z0(int i) {
        C0294q c0294q = this.f1717v;
        c0294q.f3434e = i;
        c0294q.d = this.f1719x != (i == -1) ? -1 : 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0019, code lost:
    
        if ((r4 < J0()) != r3.f1719x) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r3.f1719x != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
    
        r1 = 1;
     */
    @Override // n0.S
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.PointF a(int r4) {
        /*
            r3 = this;
            int r0 = r3.v()
            r1 = -1
            r2 = 1
            if (r0 != 0) goto Le
            boolean r4 = r3.f1719x
            if (r4 == 0) goto L1b
        Lc:
            r1 = r2
            goto L1b
        Le:
            int r0 = r3.J0()
            if (r4 >= r0) goto L16
            r4 = r2
            goto L17
        L16:
            r4 = 0
        L17:
            boolean r0 = r3.f1719x
            if (r4 == r0) goto Lc
        L1b:
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>()
            if (r1 != 0) goto L24
            r3 = 0
            return r3
        L24:
            int r3 = r3.f1715t
            r0 = 0
            if (r3 != 0) goto L2f
            float r3 = (float) r1
            r4.x = r3
            r4.y = r0
            return r4
        L2f:
            r4.x = r0
            float r3 = (float) r1
            r4.y = r3
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.a(int):android.graphics.PointF");
    }

    @Override // n0.H
    public final void a0(int i, int i2) {
        N0(i, i2, 4);
    }

    public final void a1(int i, T t2) {
        int i2;
        int i3;
        int i4;
        C0294q c0294q = this.f1717v;
        boolean z2 = false;
        c0294q.f3432b = 0;
        c0294q.f3433c = i;
        C0298v c0298v = this.f3249e;
        if (!(c0298v != null && c0298v.f3459e) || (i4 = t2.f3279a) == -1) {
            i2 = 0;
            i3 = 0;
        } else {
            if (this.f1719x == (i4 < i)) {
                i2 = this.f1713r.l();
                i3 = 0;
            } else {
                i3 = this.f1713r.l();
                i2 = 0;
            }
        }
        RecyclerView recyclerView = this.f3247b;
        if (recyclerView == null || !recyclerView.f1672g) {
            c0294q.f3436g = this.f1713r.f() + i2;
            c0294q.f3435f = -i3;
        } else {
            c0294q.f3435f = this.f1713r.k() - i3;
            c0294q.f3436g = this.f1713r.g() + i2;
        }
        c0294q.h = false;
        c0294q.f3431a = true;
        if (this.f1713r.i() == 0 && this.f1713r.f() == 0) {
            z2 = true;
        }
        c0294q.i = z2;
    }

    @Override // n0.H
    public final void b0(N n2, T t2) {
        R0(n2, t2, true);
    }

    public final void b1(e0 e0Var, int i, int i2) {
        int i3 = e0Var.d;
        int i4 = e0Var.f3353e;
        if (i != -1) {
            int i5 = e0Var.f3352c;
            if (i5 == Integer.MIN_VALUE) {
                e0Var.a();
                i5 = e0Var.f3352c;
            }
            if (i5 - i3 >= i2) {
                this.f1720y.set(i4, false);
                return;
            }
            return;
        }
        int i6 = e0Var.f3351b;
        if (i6 == Integer.MIN_VALUE) {
            View view = (View) ((ArrayList) e0Var.f3354f).get(0);
            b0 b0Var = (b0) view.getLayoutParams();
            e0Var.f3351b = ((StaggeredGridLayoutManager) e0Var.f3355g).f1713r.e(view);
            b0Var.getClass();
            i6 = e0Var.f3351b;
        }
        if (i6 + i3 <= i2) {
            this.f1720y.set(i4, false);
        }
    }

    @Override // n0.H
    public final void c(String str) {
        if (this.f1706F == null) {
            super.c(str);
        }
    }

    @Override // n0.H
    public final void c0(T t2) {
        this.f1721z = -1;
        this.f1701A = Integer.MIN_VALUE;
        this.f1706F = null;
        this.f1707H.a();
    }

    @Override // n0.H
    public final boolean d() {
        return this.f1715t == 0;
    }

    @Override // n0.H
    public final void d0(Parcelable parcelable) {
        if (parcelable instanceof d0) {
            this.f1706F = (d0) parcelable;
            l0();
        }
    }

    @Override // n0.H
    public final boolean e() {
        return this.f1715t == 1;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcelable, java.lang.Object, n0.d0] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.os.Parcelable, java.lang.Object, n0.d0] */
    @Override // n0.H
    public final Parcelable e0() {
        int i;
        int k2;
        int[] iArr;
        d0 d0Var = this.f1706F;
        if (d0Var != null) {
            ?? obj = new Object();
            obj.f3340c = d0Var.f3340c;
            obj.f3338a = d0Var.f3338a;
            obj.f3339b = d0Var.f3339b;
            obj.d = d0Var.d;
            obj.f3341e = d0Var.f3341e;
            obj.f3342f = d0Var.f3342f;
            obj.h = d0Var.h;
            obj.i = d0Var.i;
            obj.f3344j = d0Var.f3344j;
            obj.f3343g = d0Var.f3343g;
            return obj;
        }
        ?? obj2 = new Object();
        obj2.h = this.f1718w;
        obj2.i = this.f1704D;
        obj2.f3344j = this.f1705E;
        j jVar = this.f1702B;
        if (jVar == null || (iArr = (int[]) jVar.f60b) == null) {
            obj2.f3341e = 0;
        } else {
            obj2.f3342f = iArr;
            obj2.f3341e = iArr.length;
            obj2.f3343g = (ArrayList) jVar.f61c;
        }
        if (v() <= 0) {
            obj2.f3338a = -1;
            obj2.f3339b = -1;
            obj2.f3340c = 0;
            return obj2;
        }
        obj2.f3338a = this.f1704D ? K0() : J0();
        View F02 = this.f1719x ? F0(true) : G0(true);
        obj2.f3339b = F02 != null ? H.H(F02) : -1;
        int i2 = this.f1711p;
        obj2.f3340c = i2;
        obj2.d = new int[i2];
        for (int i3 = 0; i3 < this.f1711p; i3++) {
            if (this.f1704D) {
                i = this.f1712q[i3].g(Integer.MIN_VALUE);
                if (i != Integer.MIN_VALUE) {
                    k2 = this.f1713r.g();
                    i -= k2;
                    obj2.d[i3] = i;
                } else {
                    obj2.d[i3] = i;
                }
            } else {
                i = this.f1712q[i3].i(Integer.MIN_VALUE);
                if (i != Integer.MIN_VALUE) {
                    k2 = this.f1713r.k();
                    i -= k2;
                    obj2.d[i3] = i;
                } else {
                    obj2.d[i3] = i;
                }
            }
        }
        return obj2;
    }

    @Override // n0.H
    public final boolean f(I i) {
        return i instanceof b0;
    }

    @Override // n0.H
    public final void f0(int i) {
        if (i == 0) {
            A0();
        }
    }

    @Override // n0.H
    public final void h(int i, int i2, T t2, C0290m c0290m) {
        C0294q c0294q;
        int g2;
        int i3;
        if (this.f1715t != 0) {
            i = i2;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        T0(i, t2);
        int[] iArr = this.f1709J;
        if (iArr == null || iArr.length < this.f1711p) {
            this.f1709J = new int[this.f1711p];
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = this.f1711p;
            c0294q = this.f1717v;
            if (i4 >= i6) {
                break;
            }
            if (c0294q.d == -1) {
                g2 = c0294q.f3435f;
                i3 = this.f1712q[i4].i(g2);
            } else {
                g2 = this.f1712q[i4].g(c0294q.f3436g);
                i3 = c0294q.f3436g;
            }
            int i7 = g2 - i3;
            if (i7 >= 0) {
                this.f1709J[i5] = i7;
                i5++;
            }
            i4++;
        }
        Arrays.sort(this.f1709J, 0, i5);
        for (int i8 = 0; i8 < i5; i8++) {
            int i9 = c0294q.f3433c;
            if (i9 < 0 || i9 >= t2.b()) {
                return;
            }
            c0290m.a(c0294q.f3433c, this.f1709J[i8]);
            c0294q.f3433c += c0294q.d;
        }
    }

    @Override // n0.H
    public final int j(T t2) {
        return B0(t2);
    }

    @Override // n0.H
    public final int k(T t2) {
        return C0(t2);
    }

    @Override // n0.H
    public final int l(T t2) {
        return D0(t2);
    }

    @Override // n0.H
    public final int m(T t2) {
        return B0(t2);
    }

    @Override // n0.H
    public final int m0(int i, N n2, T t2) {
        return Y0(i, n2, t2);
    }

    @Override // n0.H
    public final int n(T t2) {
        return C0(t2);
    }

    @Override // n0.H
    public final void n0(int i) {
        d0 d0Var = this.f1706F;
        if (d0Var != null && d0Var.f3338a != i) {
            d0Var.d = null;
            d0Var.f3340c = 0;
            d0Var.f3338a = -1;
            d0Var.f3339b = -1;
        }
        this.f1721z = i;
        this.f1701A = Integer.MIN_VALUE;
        l0();
    }

    @Override // n0.H
    public final int o(T t2) {
        return D0(t2);
    }

    @Override // n0.H
    public final int o0(int i, N n2, T t2) {
        return Y0(i, n2, t2);
    }

    @Override // n0.H
    public final I r() {
        return this.f1715t == 0 ? new I(-2, -1) : new I(-1, -2);
    }

    @Override // n0.H
    public final void r0(Rect rect, int i, int i2) {
        int g2;
        int g3;
        int i3 = this.f1711p;
        int F2 = F() + E();
        int D2 = D() + G();
        if (this.f1715t == 1) {
            int height = rect.height() + D2;
            RecyclerView recyclerView = this.f3247b;
            WeakHashMap weakHashMap = L.S.f311a;
            g3 = H.g(i2, height, recyclerView.getMinimumHeight());
            g2 = H.g(i, (this.f1716u * i3) + F2, this.f3247b.getMinimumWidth());
        } else {
            int width = rect.width() + F2;
            RecyclerView recyclerView2 = this.f3247b;
            WeakHashMap weakHashMap2 = L.S.f311a;
            g2 = H.g(i, width, recyclerView2.getMinimumWidth());
            g3 = H.g(i2, (this.f1716u * i3) + D2, this.f3247b.getMinimumHeight());
        }
        this.f3247b.setMeasuredDimension(g2, g3);
    }

    @Override // n0.H
    public final I s(Context context, AttributeSet attributeSet) {
        return new I(context, attributeSet);
    }

    @Override // n0.H
    public final I t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new I((ViewGroup.MarginLayoutParams) layoutParams) : new I(layoutParams);
    }

    @Override // n0.H
    public final int x(N n2, T t2) {
        return this.f1715t == 1 ? this.f1711p : super.x(n2, t2);
    }

    @Override // n0.H
    public final void x0(RecyclerView recyclerView, int i) {
        C0298v c0298v = new C0298v(recyclerView.getContext());
        c0298v.f3456a = i;
        y0(c0298v);
    }

    @Override // n0.H
    public final boolean z0() {
        return this.f1706F == null;
    }
}
