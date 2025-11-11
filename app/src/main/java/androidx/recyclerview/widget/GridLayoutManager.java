package androidx.recyclerview.widget;

import C.j;
import D.f;
import L.S;
import M.k;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;
import n0.C0290m;
import n0.C0293p;
import n0.C0296t;
import n0.H;
import n0.I;
import n0.N;
import n0.T;
import n0.r;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: E, reason: collision with root package name */
    public boolean f1615E;

    /* renamed from: F, reason: collision with root package name */
    public int f1616F;
    public int[] G;

    /* renamed from: H, reason: collision with root package name */
    public View[] f1617H;

    /* renamed from: I, reason: collision with root package name */
    public final SparseIntArray f1618I;

    /* renamed from: J, reason: collision with root package name */
    public final SparseIntArray f1619J;

    /* renamed from: K, reason: collision with root package name */
    public final j f1620K;

    /* renamed from: L, reason: collision with root package name */
    public final Rect f1621L;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f1615E = false;
        this.f1616F = -1;
        this.f1618I = new SparseIntArray();
        this.f1619J = new SparseIntArray();
        this.f1620K = new j(10);
        this.f1621L = new Rect();
        l1(H.I(context, attributeSet, i, i2).f3244b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void B0(T t2, C0296t c0296t, C0290m c0290m) {
        int i;
        int i2 = this.f1616F;
        for (int i3 = 0; i3 < this.f1616F && (i = c0296t.d) >= 0 && i < t2.b() && i2 > 0; i3++) {
            c0290m.a(c0296t.d, Math.max(0, c0296t.f3449g));
            this.f1620K.getClass();
            i2--;
            c0296t.d += c0296t.f3447e;
        }
    }

    @Override // n0.H
    public final int J(N n2, T t2) {
        if (this.f1626p == 0) {
            return this.f1616F;
        }
        if (t2.b() < 1) {
            return 0;
        }
        return h1(t2.b() - 1, n2, t2) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View N0(N n2, T t2, int i, int i2, int i3) {
        G0();
        int k2 = this.f1628r.k();
        int g2 = this.f1628r.g();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View u2 = u(i);
            int H2 = H.H(u2);
            if (H2 >= 0 && H2 < i3 && i1(H2, n2, t2) == 0) {
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

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e2, code lost:
    
        if (r13 == (r2 > r15)) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0107, code lost:
    
        if (r13 == (r2 > r8)) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0021, code lost:
    
        if (((java.util.ArrayList) r22.f3246a.d).contains(r3) != false) goto L10;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, n0.H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View S(android.view.View r23, int r24, n0.N r25, n0.T r26) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.S(android.view.View, int, n0.N, n0.T):android.view.View");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009f, code lost:
    
        r22.f3442b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a1, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v39 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T0(n0.N r19, n0.T r20, n0.C0296t r21, n0.C0295s r22) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.T0(n0.N, n0.T, n0.t, n0.s):void");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void U0(N n2, T t2, r rVar, int i) {
        m1();
        if (t2.b() > 0 && !t2.f3284g) {
            boolean z2 = i == 1;
            int i12 = i1(rVar.f3438b, n2, t2);
            if (z2) {
                while (i12 > 0) {
                    int i2 = rVar.f3438b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    rVar.f3438b = i3;
                    i12 = i1(i3, n2, t2);
                }
            } else {
                int b2 = t2.b() - 1;
                int i4 = rVar.f3438b;
                while (i4 < b2) {
                    int i5 = i4 + 1;
                    int i13 = i1(i5, n2, t2);
                    if (i13 <= i12) {
                        break;
                    }
                    i4 = i5;
                    i12 = i13;
                }
                rVar.f3438b = i4;
            }
        }
        f1();
    }

    @Override // n0.H
    public final void V(N n2, T t2, View view, k kVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0293p)) {
            U(view, kVar);
            return;
        }
        C0293p c0293p = (C0293p) layoutParams;
        int h12 = h1(c0293p.f3258a.b(), n2, t2);
        if (this.f1626p == 0) {
            kVar.h(M.j.a(false, c0293p.f3429e, c0293p.f3430f, h12, 1));
        } else {
            kVar.h(M.j.a(false, h12, 1, c0293p.f3429e, c0293p.f3430f));
        }
    }

    @Override // n0.H
    public final void W(int i, int i2) {
        j jVar = this.f1620K;
        jVar.x();
        ((SparseIntArray) jVar.f61c).clear();
    }

    @Override // n0.H
    public final void X() {
        j jVar = this.f1620K;
        jVar.x();
        ((SparseIntArray) jVar.f61c).clear();
    }

    @Override // n0.H
    public final void Y(int i, int i2) {
        j jVar = this.f1620K;
        jVar.x();
        ((SparseIntArray) jVar.f61c).clear();
    }

    @Override // n0.H
    public final void Z(int i, int i2) {
        j jVar = this.f1620K;
        jVar.x();
        ((SparseIntArray) jVar.f61c).clear();
    }

    @Override // n0.H
    public final void a0(int i, int i2) {
        j jVar = this.f1620K;
        jVar.x();
        ((SparseIntArray) jVar.f61c).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void a1(boolean z2) {
        if (z2) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.a1(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, n0.H
    public final void b0(N n2, T t2) {
        boolean z2 = t2.f3284g;
        SparseIntArray sparseIntArray = this.f1619J;
        SparseIntArray sparseIntArray2 = this.f1618I;
        if (z2) {
            int v2 = v();
            for (int i = 0; i < v2; i++) {
                C0293p c0293p = (C0293p) u(i).getLayoutParams();
                int b2 = c0293p.f3258a.b();
                sparseIntArray2.put(b2, c0293p.f3430f);
                sparseIntArray.put(b2, c0293p.f3429e);
            }
        }
        super.b0(n2, t2);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, n0.H
    public final void c0(T t2) {
        super.c0(t2);
        this.f1615E = false;
    }

    public final void e1(int i) {
        int i2;
        int[] iArr = this.G;
        int i3 = this.f1616F;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.G = iArr;
    }

    @Override // n0.H
    public final boolean f(I i) {
        return i instanceof C0293p;
    }

    public final void f1() {
        View[] viewArr = this.f1617H;
        if (viewArr == null || viewArr.length != this.f1616F) {
            this.f1617H = new View[this.f1616F];
        }
    }

    public final int g1(int i, int i2) {
        if (this.f1626p != 1 || !S0()) {
            int[] iArr = this.G;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.G;
        int i3 = this.f1616F;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    public final int h1(int i, N n2, T t2) {
        boolean z2 = t2.f3284g;
        j jVar = this.f1620K;
        if (!z2) {
            int i2 = this.f1616F;
            jVar.getClass();
            return j.w(i, i2);
        }
        int b2 = n2.b(i);
        if (b2 != -1) {
            int i3 = this.f1616F;
            jVar.getClass();
            return j.w(b2, i3);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    public final int i1(int i, N n2, T t2) {
        boolean z2 = t2.f3284g;
        j jVar = this.f1620K;
        if (!z2) {
            int i2 = this.f1616F;
            jVar.getClass();
            return i % i2;
        }
        int i3 = this.f1619J.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int b2 = n2.b(i);
        if (b2 != -1) {
            int i4 = this.f1616F;
            jVar.getClass();
            return b2 % i4;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    public final int j1(int i, N n2, T t2) {
        boolean z2 = t2.f3284g;
        j jVar = this.f1620K;
        if (!z2) {
            jVar.getClass();
            return 1;
        }
        int i2 = this.f1618I.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (n2.b(i) != -1) {
            jVar.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, n0.H
    public final int k(T t2) {
        return D0(t2);
    }

    public final void k1(View view, int i, boolean z2) {
        int i2;
        int i3;
        C0293p c0293p = (C0293p) view.getLayoutParams();
        Rect rect = c0293p.f3259b;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c0293p).topMargin + ((ViewGroup.MarginLayoutParams) c0293p).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c0293p).leftMargin + ((ViewGroup.MarginLayoutParams) c0293p).rightMargin;
        int g12 = g1(c0293p.f3429e, c0293p.f3430f);
        if (this.f1626p == 1) {
            i3 = H.w(false, g12, i, i5, ((ViewGroup.MarginLayoutParams) c0293p).width);
            i2 = H.w(true, this.f1628r.l(), this.f3255m, i4, ((ViewGroup.MarginLayoutParams) c0293p).height);
        } else {
            int w2 = H.w(false, g12, i, i4, ((ViewGroup.MarginLayoutParams) c0293p).height);
            int w3 = H.w(true, this.f1628r.l(), this.f3254l, i5, ((ViewGroup.MarginLayoutParams) c0293p).width);
            i2 = w2;
            i3 = w3;
        }
        I i6 = (I) view.getLayoutParams();
        if (z2 ? w0(view, i3, i2, i6) : u0(view, i3, i2, i6)) {
            view.measure(i3, i2);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, n0.H
    public final int l(T t2) {
        return E0(t2);
    }

    public final void l1(int i) {
        if (i == this.f1616F) {
            return;
        }
        this.f1615E = true;
        if (i < 1) {
            throw new IllegalArgumentException(f.b("Span count should be at least 1. Provided ", i));
        }
        this.f1616F = i;
        this.f1620K.x();
        l0();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, n0.H
    public final int m0(int i, N n2, T t2) {
        m1();
        f1();
        return super.m0(i, n2, t2);
    }

    public final void m1() {
        int D2;
        int G;
        if (this.f1626p == 1) {
            D2 = this.f3256n - F();
            G = E();
        } else {
            D2 = this.f3257o - D();
            G = G();
        }
        e1(D2 - G);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, n0.H
    public final int n(T t2) {
        return D0(t2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, n0.H
    public final int o(T t2) {
        return E0(t2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, n0.H
    public final int o0(int i, N n2, T t2) {
        m1();
        f1();
        return super.o0(i, n2, t2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, n0.H
    public final I r() {
        return this.f1626p == 0 ? new C0293p(-2, -1) : new C0293p(-1, -2);
    }

    @Override // n0.H
    public final void r0(Rect rect, int i, int i2) {
        int g2;
        int g3;
        if (this.G == null) {
            super.r0(rect, i, i2);
        }
        int F2 = F() + E();
        int D2 = D() + G();
        if (this.f1626p == 1) {
            int height = rect.height() + D2;
            RecyclerView recyclerView = this.f3247b;
            WeakHashMap weakHashMap = S.f311a;
            g3 = H.g(i2, height, recyclerView.getMinimumHeight());
            int[] iArr = this.G;
            g2 = H.g(i, iArr[iArr.length - 1] + F2, this.f3247b.getMinimumWidth());
        } else {
            int width = rect.width() + F2;
            RecyclerView recyclerView2 = this.f3247b;
            WeakHashMap weakHashMap2 = S.f311a;
            g2 = H.g(i, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.G;
            g3 = H.g(i2, iArr2[iArr2.length - 1] + D2, this.f3247b.getMinimumHeight());
        }
        this.f3247b.setMeasuredDimension(g2, g3);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [n0.p, n0.I] */
    @Override // n0.H
    public final I s(Context context, AttributeSet attributeSet) {
        ?? i = new I(context, attributeSet);
        i.f3429e = -1;
        i.f3430f = 0;
        return i;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [n0.p, n0.I] */
    /* JADX WARN: Type inference failed for: r2v3, types: [n0.p, n0.I] */
    @Override // n0.H
    public final I t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ?? i = new I((ViewGroup.MarginLayoutParams) layoutParams);
            i.f3429e = -1;
            i.f3430f = 0;
            return i;
        }
        ?? i2 = new I(layoutParams);
        i2.f3429e = -1;
        i2.f3430f = 0;
        return i2;
    }

    @Override // n0.H
    public final int x(N n2, T t2) {
        if (this.f1626p == 1) {
            return this.f1616F;
        }
        if (t2.b() < 1) {
            return 0;
        }
        return h1(t2.b() - 1, n2, t2) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, n0.H
    public final boolean z0() {
        return this.f1636z == null && !this.f1615E;
    }

    public GridLayoutManager(int i) {
        super(1);
        this.f1615E = false;
        this.f1616F = -1;
        this.f1618I = new SparseIntArray();
        this.f1619J = new SparseIntArray();
        this.f1620K = new j(10);
        this.f1621L = new Rect();
        l1(i);
    }
}
