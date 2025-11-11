package com.google.android.material.carousel;

import D.f;
import F0.c;
import F0.d;
import F0.e;
import F0.g;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.android.music.R;
import com.google.android.material.carousel.CarouselLayoutManager;
import n0.H;
import n0.I;
import n0.N;
import n0.S;
import n0.T;
import w0.AbstractC0373a;

/* loaded from: classes.dex */
public class CarouselLayoutManager extends H implements S {

    /* renamed from: p, reason: collision with root package name */
    public final g f1852p;

    /* renamed from: q, reason: collision with root package name */
    public e f1853q;

    /* renamed from: r, reason: collision with root package name */
    public final View.OnLayoutChangeListener f1854r;

    public CarouselLayoutManager() {
        g gVar = new g();
        new d();
        this.f1854r = new View.OnLayoutChangeListener() { // from class: F0.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
                    return;
                }
                view.post(new b(0, carouselLayoutManager));
            }
        };
        this.f1852p = gVar;
        l0();
        C0(0);
    }

    public final boolean A0() {
        return this.f1853q.f153a == 0;
    }

    public final boolean B0() {
        return A0() && C() == 1;
    }

    public final void C0(int i) {
        e eVar;
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(f.b("invalid orientation:", i));
        }
        c(null);
        e eVar2 = this.f1853q;
        if (eVar2 == null || i != eVar2.f153a) {
            if (i == 0) {
                eVar = new e(this, 1);
            } else {
                if (i != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                eVar = new e(this, 0);
            }
            this.f1853q = eVar;
            l0();
        }
    }

    @Override // n0.H
    public final boolean L() {
        return true;
    }

    @Override // n0.H
    public final void Q(RecyclerView recyclerView) {
        g gVar = this.f1852p;
        Context context = recyclerView.getContext();
        float f2 = gVar.f156a;
        if (f2 <= 0.0f) {
            f2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        gVar.f156a = f2;
        float f3 = gVar.f157b;
        if (f3 <= 0.0f) {
            f3 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        gVar.f157b = f3;
        l0();
        recyclerView.addOnLayoutChangeListener(this.f1854r);
    }

    @Override // n0.H
    public final void R(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.f1854r);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x003a, code lost:
    
        if (r6 == 1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0044, code lost:
    
        if (B0() != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0048, code lost:
    
        if (r6 == 1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0051, code lost:
    
        if (B0() != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    @Override // n0.H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View S(android.view.View r4, int r5, n0.N r6, n0.T r7) {
        /*
            r3 = this;
            int r6 = r3.v()
            if (r6 != 0) goto L8
            goto L96
        L8:
            F0.e r6 = r3.f1853q
            int r6 = r6.f153a
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = -1
            r1 = 1
            if (r5 == r1) goto L46
            r2 = 2
            if (r5 == r2) goto L3c
            r2 = 17
            if (r5 == r2) goto L4b
            r2 = 33
            if (r5 == r2) goto L48
            r2 = 66
            if (r5 == r2) goto L3e
            r2 = 130(0x82, float:1.82E-43)
            if (r5 == r2) goto L3a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown focus request:"
            r6.<init>(r2)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "CarouselLayoutManager"
            android.util.Log.d(r6, r5)
        L38:
            r5 = r7
            goto L54
        L3a:
            if (r6 != r1) goto L38
        L3c:
            r5 = r1
            goto L54
        L3e:
            if (r6 != 0) goto L38
            boolean r5 = r3.B0()
            if (r5 == 0) goto L3c
        L46:
            r5 = r0
            goto L54
        L48:
            if (r6 != r1) goto L38
            goto L46
        L4b:
            if (r6 != 0) goto L38
            boolean r5 = r3.B0()
            if (r5 == 0) goto L46
            goto L3c
        L54:
            if (r5 != r7) goto L57
            goto L96
        L57:
            r6 = 0
            if (r5 != r0) goto L8b
            int r4 = n0.H.H(r4)
            if (r4 != 0) goto L61
            goto L96
        L61:
            android.view.View r4 = r3.u(r6)
            int r4 = n0.H.H(r4)
            int r4 = r4 - r1
            if (r4 < 0) goto L7a
            int r5 = r3.B()
            if (r4 < r5) goto L73
            goto L7a
        L73:
            F0.e r3 = r3.f1853q
            r3.a()
            r3 = 0
            throw r3
        L7a:
            boolean r4 = r3.B0()
            if (r4 == 0) goto L86
            int r4 = r3.v()
            int r6 = r4 + (-1)
        L86:
            android.view.View r3 = r3.u(r6)
            return r3
        L8b:
            int r4 = n0.H.H(r4)
            int r5 = r3.B()
            int r5 = r5 - r1
            if (r4 != r5) goto L98
        L96:
            r3 = 0
            return r3
        L98:
            int r4 = r3.v()
            int r4 = r4 - r1
            android.view.View r4 = r3.u(r4)
            int r4 = n0.H.H(r4)
            int r4 = r4 + r1
            if (r4 < 0) goto Lb6
            int r5 = r3.B()
            if (r4 < r5) goto Laf
            goto Lb6
        Laf:
            F0.e r3 = r3.f1853q
            r3.a()
            r3 = 0
            throw r3
        Lb6:
            boolean r4 = r3.B0()
            if (r4 == 0) goto Lbd
            goto Lc3
        Lbd:
            int r4 = r3.v()
            int r6 = r4 + (-1)
        Lc3:
            android.view.View r3 = r3.u(r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.S(android.view.View, int, n0.N, n0.T):android.view.View");
    }

    @Override // n0.H
    public final void T(AccessibilityEvent accessibilityEvent) {
        super.T(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(H.H(u(0)));
            accessibilityEvent.setToIndex(H.H(u(v() - 1)));
        }
    }

    @Override // n0.H
    public final void W(int i, int i2) {
        B();
    }

    @Override // n0.H
    public final void Z(int i, int i2) {
        B();
    }

    @Override // n0.S
    public final PointF a(int i) {
        return null;
    }

    @Override // n0.H
    public final void b0(N n2, T t2) {
        if (t2.b() > 0) {
            if ((A0() ? this.f3256n : this.f3257o) > 0.0f) {
                B0();
                View view = n2.i(0, Long.MAX_VALUE).f3297a;
                throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
            }
        }
        g0(n2);
    }

    @Override // n0.H
    public final void c0(T t2) {
        if (v() == 0) {
            return;
        }
        H.H(u(0));
    }

    @Override // n0.H
    public final boolean d() {
        return A0();
    }

    @Override // n0.H
    public final boolean e() {
        return !A0();
    }

    @Override // n0.H
    public final int j(T t2) {
        v();
        return 0;
    }

    @Override // n0.H
    public final int k(T t2) {
        return 0;
    }

    @Override // n0.H
    public final boolean k0(RecyclerView recyclerView, View view, Rect rect, boolean z2, boolean z3) {
        return false;
    }

    @Override // n0.H
    public final int l(T t2) {
        return 0;
    }

    @Override // n0.H
    public final int m(T t2) {
        v();
        return 0;
    }

    @Override // n0.H
    public final int m0(int i, N n2, T t2) {
        if (!A0() || v() == 0 || i == 0) {
            return 0;
        }
        View view = n2.i(0, Long.MAX_VALUE).f3297a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // n0.H
    public final int n(T t2) {
        return 0;
    }

    @Override // n0.H
    public final void n0(int i) {
    }

    @Override // n0.H
    public final int o(T t2) {
        return 0;
    }

    @Override // n0.H
    public final int o0(int i, N n2, T t2) {
        if (!e() || v() == 0 || i == 0) {
            return 0;
        }
        View view = n2.i(0, Long.MAX_VALUE).f3297a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // n0.H
    public final I r() {
        return new I(-2, -2);
    }

    @Override // n0.H
    public final void x0(RecyclerView recyclerView, int i) {
        c cVar = new c(this, recyclerView.getContext(), 0);
        cVar.f3456a = i;
        y0(cVar);
    }

    @Override // n0.H
    public final void y(View view, Rect rect) {
        super.y(view, rect);
        rect.centerY();
        if (A0()) {
            rect.centerX();
        }
        throw null;
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        new d();
        this.f1854r = new View.OnLayoutChangeListener() { // from class: F0.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i22, int i32, int i4, int i5, int i6, int i7, int i8) {
                CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                if (i3 == i5 && i22 == i6 && i32 == i7 && i4 == i8) {
                    return;
                }
                view.post(new b(0, carouselLayoutManager));
            }
        };
        this.f1852p = new g();
        l0();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0373a.d);
            obtainStyledAttributes.getInt(0, 0);
            l0();
            C0(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
        }
    }
}
