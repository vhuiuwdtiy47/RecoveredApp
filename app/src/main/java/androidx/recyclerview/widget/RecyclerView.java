package androidx.recyclerview.widget;

import C.j;
import D0.i;
import L.C0016l;
import L.C0018n;
import L.C0021q;
import L.G;
import L.S;
import S.b;
import T.d;
import T0.e;
import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m0.AbstractC0276a;
import n0.AbstractC0302z;
import n0.B;
import n0.C;
import n0.C0278a;
import n0.C0279b;
import n0.C0289l;
import n0.C0290m;
import n0.C0298v;
import n0.C0301y;
import n0.D;
import n0.E;
import n0.H;
import n0.I;
import n0.J;
import n0.K;
import n0.L;
import n0.M;
import n0.N;
import n0.O;
import n0.P;
import n0.RunnableC0292o;
import n0.T;
import n0.U;
import n0.V;
import n0.W;
import n0.Y;
import n0.g0;
import o.h;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {

    /* renamed from: s0, reason: collision with root package name */
    public static final int[] f1637s0 = {R.attr.nestedScrollingEnabled};

    /* renamed from: t0, reason: collision with root package name */
    public static final Class[] f1638t0;

    /* renamed from: u0, reason: collision with root package name */
    public static final d f1639u0;

    /* renamed from: A, reason: collision with root package name */
    public int f1640A;

    /* renamed from: B, reason: collision with root package name */
    public int f1641B;

    /* renamed from: C, reason: collision with root package name */
    public C f1642C;

    /* renamed from: D, reason: collision with root package name */
    public EdgeEffect f1643D;

    /* renamed from: E, reason: collision with root package name */
    public EdgeEffect f1644E;

    /* renamed from: F, reason: collision with root package name */
    public EdgeEffect f1645F;
    public EdgeEffect G;

    /* renamed from: H, reason: collision with root package name */
    public D f1646H;

    /* renamed from: I, reason: collision with root package name */
    public int f1647I;

    /* renamed from: J, reason: collision with root package name */
    public int f1648J;

    /* renamed from: K, reason: collision with root package name */
    public VelocityTracker f1649K;

    /* renamed from: L, reason: collision with root package name */
    public int f1650L;

    /* renamed from: M, reason: collision with root package name */
    public int f1651M;

    /* renamed from: N, reason: collision with root package name */
    public int f1652N;

    /* renamed from: O, reason: collision with root package name */
    public int f1653O;

    /* renamed from: P, reason: collision with root package name */
    public int f1654P;

    /* renamed from: Q, reason: collision with root package name */
    public J f1655Q;

    /* renamed from: R, reason: collision with root package name */
    public final int f1656R;

    /* renamed from: S, reason: collision with root package name */
    public final int f1657S;

    /* renamed from: T, reason: collision with root package name */
    public final float f1658T;

    /* renamed from: U, reason: collision with root package name */
    public final float f1659U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f1660V;

    /* renamed from: W, reason: collision with root package name */
    public final V f1661W;

    /* renamed from: a, reason: collision with root package name */
    public final e f1662a;

    /* renamed from: a0, reason: collision with root package name */
    public RunnableC0292o f1663a0;

    /* renamed from: b, reason: collision with root package name */
    public final N f1664b;
    public final C0290m b0;

    /* renamed from: c, reason: collision with root package name */
    public P f1665c;

    /* renamed from: c0, reason: collision with root package name */
    public final T f1666c0;
    public final I.d d;

    /* renamed from: d0, reason: collision with root package name */
    public K f1667d0;

    /* renamed from: e, reason: collision with root package name */
    public final C0016l f1668e;

    /* renamed from: e0, reason: collision with root package name */
    public ArrayList f1669e0;

    /* renamed from: f, reason: collision with root package name */
    public final j f1670f;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f1671f0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1672g;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f1673g0;
    public final Rect h;

    /* renamed from: h0, reason: collision with root package name */
    public final C0301y f1674h0;
    public final Rect i;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f1675i0;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f1676j;

    /* renamed from: j0, reason: collision with root package name */
    public Y f1677j0;

    /* renamed from: k, reason: collision with root package name */
    public AbstractC0302z f1678k;

    /* renamed from: k0, reason: collision with root package name */
    public final int[] f1679k0;

    /* renamed from: l, reason: collision with root package name */
    public H f1680l;

    /* renamed from: l0, reason: collision with root package name */
    public C0018n f1681l0;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f1682m;

    /* renamed from: m0, reason: collision with root package name */
    public final int[] f1683m0;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f1684n;

    /* renamed from: n0, reason: collision with root package name */
    public final int[] f1685n0;

    /* renamed from: o, reason: collision with root package name */
    public C0289l f1686o;

    /* renamed from: o0, reason: collision with root package name */
    public final int[] f1687o0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1688p;

    /* renamed from: p0, reason: collision with root package name */
    public final ArrayList f1689p0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1690q;

    /* renamed from: q0, reason: collision with root package name */
    public final i f1691q0;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1692r;
    public final C0301y r0;

    /* renamed from: s, reason: collision with root package name */
    public int f1693s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1694t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1695u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1696v;

    /* renamed from: w, reason: collision with root package name */
    public int f1697w;

    /* renamed from: x, reason: collision with root package name */
    public final AccessibilityManager f1698x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f1699y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1700z;

    static {
        Class cls = Integer.TYPE;
        f1638t0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f1639u0 = new d(1);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.android.music.R.attr.recyclerViewStyle);
    }

    public static RecyclerView D(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView D2 = D(viewGroup.getChildAt(i));
            if (D2 != null) {
                return D2;
            }
        }
        return null;
    }

    public static W I(View view) {
        if (view == null) {
            return null;
        }
        return ((I) view.getLayoutParams()).f3258a;
    }

    private C0018n getScrollingChildHelper() {
        if (this.f1681l0 == null) {
            this.f1681l0 = new C0018n(this);
        }
        return this.f1681l0;
    }

    public static void j(W w2) {
        WeakReference weakReference = w2.f3298b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == w2.f3297a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            w2.f3298b = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View A(android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            return r3
        L17:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A(android.view.View):android.view.View");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean B(android.view.MotionEvent r12) {
        /*
            r11 = this;
            int r0 = r12.getAction()
            java.util.ArrayList r1 = r11.f1684n
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        Lc:
            if (r4 >= r2) goto L64
            java.lang.Object r5 = r1.get(r4)
            n0.l r5 = (n0.C0289l) r5
            int r6 = r5.f3412v
            r7 = 1
            r8 = 2
            if (r6 != r7) goto L59
            float r6 = r12.getX()
            float r9 = r12.getY()
            boolean r6 = r5.d(r6, r9)
            float r9 = r12.getX()
            float r10 = r12.getY()
            boolean r9 = r5.c(r9, r10)
            int r10 = r12.getAction()
            if (r10 != 0) goto L61
            if (r6 != 0) goto L3c
            if (r9 == 0) goto L61
        L3c:
            if (r9 == 0) goto L49
            r5.f3413w = r7
            float r6 = r12.getX()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.f3406p = r6
            goto L55
        L49:
            if (r6 == 0) goto L55
            r5.f3413w = r8
            float r6 = r12.getY()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.f3403m = r6
        L55:
            r5.f(r8)
            goto L5b
        L59:
            if (r6 != r8) goto L61
        L5b:
            r6 = 3
            if (r0 == r6) goto L61
            r11.f1686o = r5
            return r7
        L61:
            int r4 = r4 + 1
            goto Lc
        L64:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.B(android.view.MotionEvent):boolean");
    }

    public final void C(int[] iArr) {
        int f2 = this.f1668e.f();
        if (f2 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < f2; i3++) {
            W I2 = I(this.f1668e.e(i3));
            if (!I2.o()) {
                int b2 = I2.b();
                if (b2 < i) {
                    i = b2;
                }
                if (b2 > i2) {
                    i2 = b2;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public final W E(int i) {
        W w2 = null;
        if (this.f1699y) {
            return null;
        }
        int n2 = this.f1668e.n();
        for (int i2 = 0; i2 < n2; i2++) {
            W I2 = I(this.f1668e.m(i2));
            if (I2 != null && !I2.h() && F(I2) == i) {
                if (!((ArrayList) this.f1668e.d).contains(I2.f3297a)) {
                    return I2;
                }
                w2 = I2;
            }
        }
        return w2;
    }

    public final int F(W w2) {
        if (((w2.f3303j & 524) != 0) || !w2.e()) {
            return -1;
        }
        I.d dVar = this.d;
        int i = w2.f3299c;
        ArrayList arrayList = (ArrayList) dVar.f259c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0278a c0278a = (C0278a) arrayList.get(i2);
            int i3 = c0278a.f3316a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = c0278a.f3317b;
                    if (i4 <= i) {
                        int i5 = c0278a.f3318c;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = c0278a.f3317b;
                    if (i6 == i) {
                        i = c0278a.f3318c;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (c0278a.f3318c <= i) {
                            i++;
                        }
                    }
                }
            } else if (c0278a.f3317b <= i) {
                i += c0278a.f3318c;
            }
        }
        return i;
    }

    public final long G(W w2) {
        return this.f1678k.f3474b ? w2.f3300e : w2.f3299c;
    }

    public final W H(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return I(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect J(View view) {
        I i = (I) view.getLayoutParams();
        boolean z2 = i.f3260c;
        Rect rect = i.f3259b;
        if (!z2 || (this.f1666c0.f3284g && (i.f3258a.k() || i.f3258a.f()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.f1682m;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Rect rect2 = this.h;
            rect2.set(0, 0, 0, 0);
            ((E) arrayList.get(i2)).getClass();
            ((I) view.getLayoutParams()).f3258a.getClass();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        i.f3260c = false;
        return rect;
    }

    public final boolean K() {
        return !this.f1692r || this.f1699y || this.d.f();
    }

    public final boolean L() {
        return this.f1640A > 0;
    }

    public final void M(int i) {
        if (this.f1680l == null) {
            return;
        }
        setScrollState(2);
        this.f1680l.n0(i);
        awakenScrollBars();
    }

    public final void N() {
        int n2 = this.f1668e.n();
        for (int i = 0; i < n2; i++) {
            ((I) this.f1668e.m(i).getLayoutParams()).f3260c = true;
        }
        ArrayList arrayList = this.f1664b.f3268c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            I i3 = (I) ((W) arrayList.get(i2)).f3297a.getLayoutParams();
            if (i3 != null) {
                i3.f3260c = true;
            }
        }
    }

    public final void O(int i, int i2, boolean z2) {
        int i3 = i + i2;
        int n2 = this.f1668e.n();
        for (int i4 = 0; i4 < n2; i4++) {
            W I2 = I(this.f1668e.m(i4));
            if (I2 != null && !I2.o()) {
                int i5 = I2.f3299c;
                T t2 = this.f1666c0;
                if (i5 >= i3) {
                    I2.l(-i2, z2);
                    t2.f3283f = true;
                } else if (i5 >= i) {
                    I2.a(8);
                    I2.l(-i2, z2);
                    I2.f3299c = i - 1;
                    t2.f3283f = true;
                }
            }
        }
        N n3 = this.f1664b;
        ArrayList arrayList = n3.f3268c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            W w2 = (W) arrayList.get(size);
            if (w2 != null) {
                int i6 = w2.f3299c;
                if (i6 >= i3) {
                    w2.l(-i2, z2);
                } else if (i6 >= i) {
                    w2.a(8);
                    n3.e(size);
                }
            }
        }
        requestLayout();
    }

    public final void P() {
        this.f1640A++;
    }

    public final void Q(boolean z2) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.f1640A - 1;
        this.f1640A = i2;
        if (i2 < 1) {
            this.f1640A = 0;
            if (z2) {
                int i3 = this.f1697w;
                this.f1697w = 0;
                if (i3 != 0 && (accessibilityManager = this.f1698x) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(obtain);
                }
                ArrayList arrayList = this.f1689p0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    W w2 = (W) arrayList.get(size);
                    if (w2.f3297a.getParent() == this && !w2.o() && (i = w2.f3310q) != -1) {
                        WeakHashMap weakHashMap = S.f311a;
                        w2.f3297a.setImportantForAccessibility(i);
                        w2.f3310q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void R(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1648J) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f1648J = motionEvent.getPointerId(i);
            int x2 = (int) (motionEvent.getX(i) + 0.5f);
            this.f1652N = x2;
            this.f1650L = x2;
            int y2 = (int) (motionEvent.getY(i) + 0.5f);
            this.f1653O = y2;
            this.f1651M = y2;
        }
    }

    public final void S() {
        if (this.f1675i0 || !this.f1688p) {
            return;
        }
        WeakHashMap weakHashMap = S.f311a;
        postOnAnimation(this.f1691q0);
        this.f1675i0 = true;
    }

    public final void T(W w2, C0021q c0021q) {
        w2.f3303j &= -8193;
        boolean z2 = this.f1666c0.h;
        j jVar = this.f1670f;
        if (z2 && w2.k() && !w2.h() && !w2.o()) {
            ((h) jVar.f61c).d(G(w2), w2);
        }
        o.j jVar2 = (o.j) jVar.f60b;
        g0 g0Var = (g0) jVar2.get(w2);
        if (g0Var == null) {
            g0Var = g0.a();
            jVar2.put(w2, g0Var);
        }
        g0Var.f3370b = c0021q;
        g0Var.f3369a |= 4;
    }

    public final void U(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.h;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof I) {
            I i = (I) layoutParams;
            if (!i.f3260c) {
                int i2 = rect.left;
                Rect rect2 = i.f3259b;
                rect.left = i2 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f1680l.k0(this, view, this.h, !this.f1692r, view2 == null);
    }

    public final void V() {
        VelocityTracker velocityTracker = this.f1649K;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z2 = false;
        c0(0);
        EdgeEffect edgeEffect = this.f1643D;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = this.f1643D.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f1644E;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 |= this.f1644E.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f1645F;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 |= this.f1645F.isFinished();
        }
        EdgeEffect edgeEffect4 = this.G;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z2 |= this.G.isFinished();
        }
        if (z2) {
            WeakHashMap weakHashMap = S.f311a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean W(int r18, int r19, android.view.MotionEvent r20) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.W(int, int, android.view.MotionEvent):boolean");
    }

    public final void X(int i, int i2, int[] iArr) {
        W w2;
        a0();
        P();
        Trace.beginSection("RV Scroll");
        T t2 = this.f1666c0;
        z(t2);
        N n2 = this.f1664b;
        int m02 = i != 0 ? this.f1680l.m0(i, n2, t2) : 0;
        int o02 = i2 != 0 ? this.f1680l.o0(i2, n2, t2) : 0;
        Trace.endSection();
        int f2 = this.f1668e.f();
        for (int i3 = 0; i3 < f2; i3++) {
            View e2 = this.f1668e.e(i3);
            W H2 = H(e2);
            if (H2 != null && (w2 = H2.i) != null) {
                int left = e2.getLeft();
                int top = e2.getTop();
                View view = w2.f3297a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        Q(true);
        b0(false);
        if (iArr != null) {
            iArr[0] = m02;
            iArr[1] = o02;
        }
    }

    public final void Y(int i) {
        C0298v c0298v;
        if (this.f1695u) {
            return;
        }
        setScrollState(0);
        V v2 = this.f1661W;
        v2.f3295g.removeCallbacks(v2);
        v2.f3292c.abortAnimation();
        H h = this.f1680l;
        if (h != null && (c0298v = h.f3249e) != null) {
            c0298v.i();
        }
        H h2 = this.f1680l;
        if (h2 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            h2.n0(i);
            awakenScrollBars();
        }
    }

    public final void Z(int i, int i2, boolean z2) {
        H h = this.f1680l;
        if (h == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f1695u) {
            return;
        }
        if (!h.d()) {
            i = 0;
        }
        if (!this.f1680l.e()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (z2) {
            int i3 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i3 |= 2;
            }
            getScrollingChildHelper().g(i3, 1);
        }
        this.f1661W.b(i, i2, Integer.MIN_VALUE, null);
    }

    public final void a0() {
        int i = this.f1693s + 1;
        this.f1693s = i;
        if (i != 1 || this.f1695u) {
            return;
        }
        this.f1694t = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        H h = this.f1680l;
        if (h != null) {
            h.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    public final void b0(boolean z2) {
        if (this.f1693s < 1) {
            this.f1693s = 1;
        }
        if (!z2 && !this.f1695u) {
            this.f1694t = false;
        }
        if (this.f1693s == 1) {
            if (z2 && this.f1694t && !this.f1695u && this.f1680l != null && this.f1678k != null) {
                o();
            }
            if (!this.f1695u) {
                this.f1694t = false;
            }
        }
        this.f1693s--;
    }

    public final void c0(int i) {
        getScrollingChildHelper().h(i);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof I) && this.f1680l.f((I) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        H h = this.f1680l;
        if (h != null && h.d()) {
            return this.f1680l.j(this.f1666c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        H h = this.f1680l;
        if (h != null && h.d()) {
            return this.f1680l.k(this.f1666c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        H h = this.f1680l;
        if (h != null && h.d()) {
            return this.f1680l.l(this.f1666c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        H h = this.f1680l;
        if (h != null && h.e()) {
            return this.f1680l.m(this.f1666c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        H h = this.f1680l;
        if (h != null && h.e()) {
            return this.f1680l.n(this.f1666c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        H h = this.f1680l;
        if (h != null && h.e()) {
            return this.f1680l.o(this.f1666c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return getScrollingChildHelper().a(f2, f3, z2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f2, float f3) {
        return getScrollingChildHelper().b(f2, f3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().d(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z2;
        super.draw(canvas);
        ArrayList arrayList = this.f1682m;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i = 0; i < size; i++) {
            ((E) arrayList.get(i)).b(canvas, this);
        }
        EdgeEffect edgeEffect = this.f1643D;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f1672g ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f1643D;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f1644E;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f1672g) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f1644E;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f1645F;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f1672g ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f1645F;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.G;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f1672g) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.G;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(save4);
        }
        if ((z2 || this.f1646H == null || arrayList.size() <= 0 || !this.f1646H.f()) ? z2 : true) {
            WeakHashMap weakHashMap = S.f311a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    public final void f(W w2) {
        View view = w2.f3297a;
        boolean z2 = view.getParent() == this;
        this.f1664b.j(H(view));
        if (w2.j()) {
            this.f1668e.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z2) {
            this.f1668e.a(view, -1, true);
            return;
        }
        C0016l c0016l = this.f1668e;
        int indexOfChild = ((C0301y) c0016l.f361b).f3472a.indexOfChild(view);
        if (indexOfChild >= 0) {
            ((C0279b) c0016l.f362c).h(indexOfChild);
            c0016l.p(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x018c, code lost:
    
        if ((r5 * r6) < 0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0194, code lost:
    
        if ((r5 * r6) > 0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x015e, code lost:
    
        if (r7 > 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x017e, code lost:
    
        if (r5 > 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0181, code lost:
    
        if (r7 < 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0184, code lost:
    
        if (r5 < 0) goto L135;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0198 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d9  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View focusSearch(android.view.View r17, int r18) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final void g(E e2) {
        H h = this.f1680l;
        if (h != null) {
            h.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f1682m;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(e2);
        N();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        H h = this.f1680l;
        if (h != null) {
            return h.r();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        H h = this.f1680l;
        if (h != null) {
            return h.s(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC0302z getAdapter() {
        return this.f1678k;
    }

    @Override // android.view.View
    public int getBaseline() {
        H h = this.f1680l;
        if (h == null) {
            return super.getBaseline();
        }
        h.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f1672g;
    }

    public Y getCompatAccessibilityDelegate() {
        return this.f1677j0;
    }

    public C getEdgeEffectFactory() {
        return this.f1642C;
    }

    public D getItemAnimator() {
        return this.f1646H;
    }

    public int getItemDecorationCount() {
        return this.f1682m.size();
    }

    public H getLayoutManager() {
        return this.f1680l;
    }

    public int getMaxFlingVelocity() {
        return this.f1657S;
    }

    public int getMinFlingVelocity() {
        return this.f1656R;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public J getOnFlingListener() {
        return this.f1655Q;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f1660V;
    }

    public M getRecycledViewPool() {
        return this.f1664b.c();
    }

    public int getScrollState() {
        return this.f1647I;
    }

    public final void h(K k2) {
        if (this.f1669e0 == null) {
            this.f1669e0 = new ArrayList();
        }
        this.f1669e0.add(k2);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(String str) {
        if (L()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + y());
        }
        if (this.f1641B > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + y()));
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f1688p;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f1695u;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().d;
    }

    public final void k() {
        int n2 = this.f1668e.n();
        for (int i = 0; i < n2; i++) {
            W I2 = I(this.f1668e.m(i));
            if (!I2.o()) {
                I2.d = -1;
                I2.f3302g = -1;
            }
        }
        N n3 = this.f1664b;
        ArrayList arrayList = n3.f3268c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            W w2 = (W) arrayList.get(i2);
            w2.d = -1;
            w2.f3302g = -1;
        }
        ArrayList arrayList2 = n3.f3266a;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            W w3 = (W) arrayList2.get(i3);
            w3.d = -1;
            w3.f3302g = -1;
        }
        ArrayList arrayList3 = n3.f3267b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                W w4 = (W) n3.f3267b.get(i4);
                w4.d = -1;
                w4.f3302g = -1;
            }
        }
    }

    public final void l(int i, int i2) {
        boolean z2;
        EdgeEffect edgeEffect = this.f1643D;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z2 = false;
        } else {
            this.f1643D.onRelease();
            z2 = this.f1643D.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f1645F;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f1645F.onRelease();
            z2 |= this.f1645F.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f1644E;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f1644E.onRelease();
            z2 |= this.f1644E.isFinished();
        }
        EdgeEffect edgeEffect4 = this.G;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.G.onRelease();
            z2 |= this.G.isFinished();
        }
        if (z2) {
            WeakHashMap weakHashMap = S.f311a;
            postInvalidateOnAnimation();
        }
    }

    public final void m() {
        if (!this.f1692r || this.f1699y) {
            Trace.beginSection("RV FullInvalidate");
            o();
            Trace.endSection();
        } else if (this.d.f()) {
            this.d.getClass();
            if (this.d.f()) {
                Trace.beginSection("RV FullInvalidate");
                o();
                Trace.endSection();
            }
        }
    }

    public final void n(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = S.f311a;
        setMeasuredDimension(H.g(i, paddingRight, getMinimumWidth()), H.g(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x0337, code lost:
    
        if (((java.util.ArrayList) r21.f1668e.d).contains(getFocusedChild()) == false) goto L216;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03e3  */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.lang.Object, L.q] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18, types: [int] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r9v0, types: [C.j] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o() {
        /*
            Method dump skipped, instructions count: 1025
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.o():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        if (r1 >= 30.0f) goto L20;
     */
    /* JADX WARN: Type inference failed for: r1v3, types: [n0.o, java.lang.Object] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.f1640A = r0
            r1 = 1
            r5.f1688p = r1
            boolean r2 = r5.f1692r
            if (r2 == 0) goto L15
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L15
            r2 = r1
            goto L16
        L15:
            r2 = r0
        L16:
            r5.f1692r = r2
            n0.H r2 = r5.f1680l
            if (r2 == 0) goto L21
            r2.f3251g = r1
            r2.Q(r5)
        L21:
            r5.f1675i0 = r0
            java.lang.ThreadLocal r0 = n0.RunnableC0292o.f3424e
            java.lang.Object r1 = r0.get()
            n0.o r1 = (n0.RunnableC0292o) r1
            r5.f1663a0 = r1
            if (r1 != 0) goto L6b
            n0.o r1 = new n0.o
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f3426a = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.d = r2
            r5.f1663a0 = r1
            java.util.WeakHashMap r1 = L.S.f311a
            android.view.Display r1 = r5.getDisplay()
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L5d
            if (r1 == 0) goto L5d
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L5d
            goto L5f
        L5d:
            r1 = 1114636288(0x42700000, float:60.0)
        L5f:
            n0.o r2 = r5.f1663a0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f3428c = r3
            r0.set(r2)
        L6b:
            n0.o r0 = r5.f1663a0
            java.util.ArrayList r0 = r0.f3426a
            r0.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C0298v c0298v;
        super.onDetachedFromWindow();
        D d = this.f1646H;
        if (d != null) {
            d.e();
        }
        setScrollState(0);
        V v2 = this.f1661W;
        v2.f3295g.removeCallbacks(v2);
        v2.f3292c.abortAnimation();
        H h = this.f1680l;
        if (h != null && (c0298v = h.f3249e) != null) {
            c0298v.i();
        }
        this.f1688p = false;
        H h2 = this.f1680l;
        if (h2 != null) {
            h2.f3251g = false;
            h2.R(this);
        }
        this.f1689p0.clear();
        removeCallbacks(this.f1691q0);
        this.f1670f.getClass();
        do {
        } while (g0.d.a() != null);
        RunnableC0292o runnableC0292o = this.f1663a0;
        if (runnableC0292o != null) {
            runnableC0292o.f3426a.remove(this);
            this.f1663a0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f1682m;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((E) arrayList.get(i)).a(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            n0.H r0 = r5.f1680l
            r1 = 0
            if (r0 != 0) goto L7
            goto L79
        L7:
            boolean r0 = r5.f1695u
            if (r0 == 0) goto Ld
            goto L79
        Ld:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L79
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L40
            n0.H r0 = r5.f1680l
            boolean r0 = r0.e()
            if (r0 == 0) goto L2e
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2f
        L2e:
            r0 = r2
        L2f:
            n0.H r3 = r5.f1680l
            boolean r3 = r3.d()
            if (r3 == 0) goto L3e
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L66
        L3e:
            r3 = r2
            goto L66
        L40:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L64
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            n0.H r3 = r5.f1680l
            boolean r3 = r3.e()
            if (r3 == 0) goto L59
            float r0 = -r0
            goto L3e
        L59:
            n0.H r3 = r5.f1680l
            boolean r3 = r3.d()
            if (r3 == 0) goto L64
            r3 = r0
            r0 = r2
            goto L66
        L64:
            r0 = r2
            r3 = r0
        L66:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6e
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L79
        L6e:
            float r2 = r5.f1658T
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.f1659U
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.W(r2, r0, r6)
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (!this.f1695u) {
            this.f1686o = null;
            if (B(motionEvent)) {
                V();
                setScrollState(0);
                return true;
            }
            H h = this.f1680l;
            if (h != null) {
                boolean d = h.d();
                boolean e2 = this.f1680l.e();
                if (this.f1649K == null) {
                    this.f1649K = VelocityTracker.obtain();
                }
                this.f1649K.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.f1696v) {
                        this.f1696v = false;
                    }
                    this.f1648J = motionEvent.getPointerId(0);
                    int x2 = (int) (motionEvent.getX() + 0.5f);
                    this.f1652N = x2;
                    this.f1650L = x2;
                    int y2 = (int) (motionEvent.getY() + 0.5f);
                    this.f1653O = y2;
                    this.f1651M = y2;
                    if (this.f1647I == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        c0(1);
                    }
                    int[] iArr = this.f1685n0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i = d;
                    if (e2) {
                        i = (d ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i, 0);
                } else if (actionMasked == 1) {
                    this.f1649K.clear();
                    c0(0);
                } else if (actionMasked == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f1648J);
                    if (findPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f1648J + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    if (this.f1647I != 1) {
                        int i2 = x3 - this.f1650L;
                        int i3 = y3 - this.f1651M;
                        if (d == 0 || Math.abs(i2) <= this.f1654P) {
                            z2 = false;
                        } else {
                            this.f1652N = x3;
                            z2 = true;
                        }
                        if (e2 && Math.abs(i3) > this.f1654P) {
                            this.f1653O = y3;
                            z2 = true;
                        }
                        if (z2) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    V();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.f1648J = motionEvent.getPointerId(actionIndex);
                    int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.f1652N = x4;
                    this.f1650L = x4;
                    int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.f1653O = y4;
                    this.f1651M = y4;
                } else if (actionMasked == 6) {
                    R(motionEvent);
                }
                if (this.f1647I == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        Trace.beginSection("RV OnLayout");
        o();
        Trace.endSection();
        this.f1692r = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        H h = this.f1680l;
        if (h == null) {
            n(i, i2);
            return;
        }
        boolean L2 = h.L();
        T t2 = this.f1666c0;
        if (!L2) {
            if (this.f1690q) {
                this.f1680l.f3247b.n(i, i2);
                return;
            }
            if (t2.f3286k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            AbstractC0302z abstractC0302z = this.f1678k;
            if (abstractC0302z != null) {
                t2.f3282e = abstractC0302z.a();
            } else {
                t2.f3282e = 0;
            }
            a0();
            this.f1680l.f3247b.n(i, i2);
            b0(false);
            t2.f3284g = false;
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.f1680l.f3247b.n(i, i2);
        if ((mode == 1073741824 && mode2 == 1073741824) || this.f1678k == null) {
            return;
        }
        if (t2.d == 1) {
            p();
        }
        this.f1680l.q0(i, i2);
        t2.i = true;
        q();
        this.f1680l.s0(i, i2);
        if (this.f1680l.v0()) {
            this.f1680l.q0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            t2.i = true;
            q();
            this.f1680l.s0(i, i2);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (L()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof P)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        P p2 = (P) parcelable;
        this.f1665c = p2;
        super.onRestoreInstanceState(p2.f628a);
        H h = this.f1680l;
        if (h == null || (parcelable2 = this.f1665c.f3272c) == null) {
            return;
        }
        h.d0(parcelable2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, S.b, n0.P] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? bVar = new b(super.onSaveInstanceState());
        P p2 = this.f1665c;
        if (p2 != null) {
            bVar.f3272c = p2.f3272c;
            return bVar;
        }
        H h = this.f1680l;
        if (h != null) {
            bVar.f3272c = h.e0();
            return bVar;
        }
        bVar.f3272c = null;
        return bVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.G = null;
        this.f1644E = null;
        this.f1645F = null;
        this.f1643D = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:194:0x0405, code lost:
    
        if (r2 < r5) goto L193;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0211  */
    /* JADX WARN: Type inference failed for: r9v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v45 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r31) {
        /*
            Method dump skipped, instructions count: 1192
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x03ef A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x03d3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0226 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c7  */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object, L.q] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object, L.q] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p() {
        /*
            Method dump skipped, instructions count: 1349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.p():void");
    }

    public final void q() {
        a0();
        P();
        T t2 = this.f1666c0;
        t2.a(6);
        this.d.b();
        t2.f3282e = this.f1678k.a();
        t2.f3281c = 0;
        t2.f3284g = false;
        this.f1680l.b0(this.f1664b, t2);
        t2.f3283f = false;
        this.f1665c = null;
        t2.f3285j = t2.f3285j && this.f1646H != null;
        t2.d = 4;
        Q(true);
        b0(false);
    }

    public final boolean r(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i2, i3, iArr, iArr2);
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z2) {
        W I2 = I(view);
        if (I2 != null) {
            if (I2.j()) {
                I2.f3303j &= -257;
            } else if (!I2.o()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + I2 + y());
            }
        }
        view.clearAnimation();
        I(view);
        super.removeDetachedView(view, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        C0298v c0298v = this.f1680l.f3249e;
        if ((c0298v == null || !c0298v.f3459e) && !L() && view2 != null) {
            U(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.f1680l.k0(this, view, rect, z2, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        ArrayList arrayList = this.f1684n;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C0289l) arrayList.get(i)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f1693s != 0 || this.f1695u) {
            this.f1694t = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().d(i, i2, i3, i4, iArr, i5, iArr2);
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        H h = this.f1680l;
        if (h == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f1695u) {
            return;
        }
        boolean d = h.d();
        boolean e2 = this.f1680l.e();
        if (d || e2) {
            if (!d) {
                i = 0;
            }
            if (!e2) {
                i2 = 0;
            }
            W(i, i2, null);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!L()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.f1697w |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(Y y2) {
        this.f1677j0 = y2;
        S.h(this, y2);
    }

    public void setAdapter(AbstractC0302z abstractC0302z) {
        setLayoutFrozen(false);
        AbstractC0302z abstractC0302z2 = this.f1678k;
        e eVar = this.f1662a;
        if (abstractC0302z2 != null) {
            abstractC0302z2.f3473a.unregisterObserver(eVar);
            this.f1678k.getClass();
        }
        D d = this.f1646H;
        if (d != null) {
            d.e();
        }
        H h = this.f1680l;
        N n2 = this.f1664b;
        if (h != null) {
            h.g0(n2);
            this.f1680l.h0(n2);
        }
        n2.f3266a.clear();
        n2.d();
        I.d dVar = this.d;
        dVar.i((ArrayList) dVar.f259c);
        dVar.i((ArrayList) dVar.d);
        AbstractC0302z abstractC0302z3 = this.f1678k;
        this.f1678k = abstractC0302z;
        if (abstractC0302z != null) {
            abstractC0302z.f3473a.registerObserver(eVar);
        }
        AbstractC0302z abstractC0302z4 = this.f1678k;
        n2.f3266a.clear();
        n2.d();
        M c2 = n2.c();
        if (abstractC0302z3 != null) {
            c2.f3265b--;
        }
        if (c2.f3265b == 0) {
            int i = 0;
            while (true) {
                SparseArray sparseArray = c2.f3264a;
                if (i >= sparseArray.size()) {
                    break;
                }
                ((L) sparseArray.valueAt(i)).f3261a.clear();
                i++;
            }
        }
        if (abstractC0302z4 != null) {
            c2.f3265b++;
        }
        this.f1666c0.f3283f = true;
        this.f1700z |= false;
        this.f1699y = true;
        int n3 = this.f1668e.n();
        for (int i2 = 0; i2 < n3; i2++) {
            W I2 = I(this.f1668e.m(i2));
            if (I2 != null && !I2.o()) {
                I2.a(6);
            }
        }
        N();
        N n4 = this.f1664b;
        ArrayList arrayList = n4.f3268c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            W w2 = (W) arrayList.get(i3);
            if (w2 != null) {
                w2.a(6);
                w2.a(1024);
            }
        }
        AbstractC0302z abstractC0302z5 = n4.h.f1678k;
        if (abstractC0302z5 == null || !abstractC0302z5.f3474b) {
            n4.d();
        }
        requestLayout();
    }

    public void setChildDrawingOrderCallback(B b2) {
        if (b2 == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z2) {
        if (z2 != this.f1672g) {
            this.G = null;
            this.f1644E = null;
            this.f1645F = null;
            this.f1643D = null;
        }
        this.f1672g = z2;
        super.setClipToPadding(z2);
        if (this.f1692r) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C c2) {
        c2.getClass();
        this.f1642C = c2;
        this.G = null;
        this.f1644E = null;
        this.f1645F = null;
        this.f1643D = null;
    }

    public void setHasFixedSize(boolean z2) {
        this.f1690q = z2;
    }

    public void setItemAnimator(D d) {
        D d2 = this.f1646H;
        if (d2 != null) {
            d2.e();
            this.f1646H.f3236a = null;
        }
        this.f1646H = d;
        if (d != null) {
            d.f3236a = this.f1674h0;
        }
    }

    public void setItemViewCacheSize(int i) {
        N n2 = this.f1664b;
        n2.f3269e = i;
        n2.k();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(H h) {
        RecyclerView recyclerView;
        C0298v c0298v;
        if (h == this.f1680l) {
            return;
        }
        setScrollState(0);
        V v2 = this.f1661W;
        v2.f3295g.removeCallbacks(v2);
        v2.f3292c.abortAnimation();
        H h2 = this.f1680l;
        if (h2 != null && (c0298v = h2.f3249e) != null) {
            c0298v.i();
        }
        H h3 = this.f1680l;
        N n2 = this.f1664b;
        if (h3 != null) {
            D d = this.f1646H;
            if (d != null) {
                d.e();
            }
            this.f1680l.g0(n2);
            this.f1680l.h0(n2);
            n2.f3266a.clear();
            n2.d();
            if (this.f1688p) {
                H h4 = this.f1680l;
                h4.f3251g = false;
                h4.R(this);
            }
            this.f1680l.t0(null);
            this.f1680l = null;
        } else {
            n2.f3266a.clear();
            n2.d();
        }
        C0016l c0016l = this.f1668e;
        ((C0279b) c0016l.f362c).g();
        ArrayList arrayList = (ArrayList) c0016l.d;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = ((C0301y) c0016l.f361b).f3472a;
            if (size < 0) {
                break;
            }
            W I2 = I((View) arrayList.get(size));
            if (I2 != null) {
                int i = I2.f3309p;
                if (recyclerView.L()) {
                    I2.f3310q = i;
                    recyclerView.f1689p0.add(I2);
                } else {
                    WeakHashMap weakHashMap = S.f311a;
                    I2.f3297a.setImportantForAccessibility(i);
                }
                I2.f3309p = 0;
            }
            arrayList.remove(size);
            size--;
        }
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            I(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f1680l = h;
        if (h != null) {
            if (h.f3247b != null) {
                throw new IllegalArgumentException("LayoutManager " + h + " is already attached to a RecyclerView:" + h.f3247b.y());
            }
            h.t0(this);
            if (this.f1688p) {
                H h5 = this.f1680l;
                h5.f3251g = true;
                h5.Q(this);
            }
        }
        n2.k();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        C0018n scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.d) {
            WeakHashMap weakHashMap = S.f311a;
            G.z(scrollingChildHelper.f367c);
        }
        scrollingChildHelper.d = z2;
    }

    public void setOnFlingListener(J j2) {
        this.f1655Q = j2;
    }

    @Deprecated
    public void setOnScrollListener(K k2) {
        this.f1667d0 = k2;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.f1660V = z2;
    }

    public void setRecycledViewPool(M m2) {
        N n2 = this.f1664b;
        if (n2.f3271g != null) {
            r0.f3265b--;
        }
        n2.f3271g = m2;
        if (m2 == null || n2.h.getAdapter() == null) {
            return;
        }
        n2.f3271g.f3265b++;
    }

    public void setRecyclerListener(O o2) {
    }

    public void setScrollState(int i) {
        C0298v c0298v;
        if (i == this.f1647I) {
            return;
        }
        this.f1647I = i;
        if (i != 2) {
            V v2 = this.f1661W;
            v2.f3295g.removeCallbacks(v2);
            v2.f3292c.abortAnimation();
            H h = this.f1680l;
            if (h != null && (c0298v = h.f3249e) != null) {
                c0298v.i();
            }
        }
        H h2 = this.f1680l;
        if (h2 != null) {
            h2.f0(i);
        }
        K k2 = this.f1667d0;
        if (k2 != null) {
            k2.a(this, i);
        }
        ArrayList arrayList = this.f1669e0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((K) this.f1669e0.get(size)).a(this, i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.f1654P = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.f1654P = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(U u2) {
        this.f1664b.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z2) {
        C0298v c0298v;
        if (z2 != this.f1695u) {
            i("Do not suppressLayout in layout or scroll");
            if (!z2) {
                this.f1695u = false;
                if (this.f1694t && this.f1680l != null && this.f1678k != null) {
                    requestLayout();
                }
                this.f1694t = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f1695u = true;
            this.f1696v = true;
            setScrollState(0);
            V v2 = this.f1661W;
            v2.f3295g.removeCallbacks(v2);
            v2.f3292c.abortAnimation();
            H h = this.f1680l;
            if (h == null || (c0298v = h.f3249e) == null) {
                return;
            }
            c0298v.i();
        }
    }

    public final void t(int i, int i2) {
        this.f1641B++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        K k2 = this.f1667d0;
        if (k2 != null) {
            k2.b(this, i, i2);
        }
        ArrayList arrayList = this.f1669e0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((K) this.f1669e0.get(size)).b(this, i, i2);
            }
        }
        this.f1641B--;
    }

    public final void u() {
        if (this.G != null) {
            return;
        }
        this.f1642C.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.G = edgeEffect;
        if (this.f1672g) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void v() {
        if (this.f1643D != null) {
            return;
        }
        this.f1642C.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1643D = edgeEffect;
        if (this.f1672g) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void w() {
        if (this.f1645F != null) {
            return;
        }
        this.f1642C.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1645F = edgeEffect;
        if (this.f1672g) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void x() {
        if (this.f1644E != null) {
            return;
        }
        this.f1642C.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1644E = edgeEffect;
        if (this.f1672g) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String y() {
        return " " + super.toString() + ", adapter:" + this.f1678k + ", layout:" + this.f1680l + ", context:" + getContext();
    }

    public final void z(T t2) {
        if (getScrollState() != 2) {
            t2.getClass();
            return;
        }
        OverScroller overScroller = this.f1661W.f3292c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        t2.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [n0.C, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, n0.D, n0.i] */
    /* JADX WARN: Type inference failed for: r3v15, types: [n0.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object, n0.T] */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        char c2;
        TypedArray typedArray;
        char c3;
        int i2;
        ClassLoader classLoader;
        Constructor constructor;
        Object[] objArr;
        this.f1662a = new e(this);
        this.f1664b = new N(this);
        this.f1670f = new j(13);
        this.h = new Rect();
        this.i = new Rect();
        this.f1676j = new RectF();
        this.f1682m = new ArrayList();
        this.f1684n = new ArrayList();
        this.f1693s = 0;
        this.f1699y = false;
        this.f1700z = false;
        this.f1640A = 0;
        this.f1641B = 0;
        this.f1642C = new Object();
        ?? obj = new Object();
        obj.f3236a = null;
        obj.f3237b = new ArrayList();
        obj.f3238c = 120L;
        obj.d = 120L;
        obj.f3239e = 250L;
        obj.f3240f = 250L;
        obj.f3377g = true;
        obj.h = new ArrayList();
        obj.i = new ArrayList();
        obj.f3378j = new ArrayList();
        obj.f3379k = new ArrayList();
        obj.f3380l = new ArrayList();
        obj.f3381m = new ArrayList();
        obj.f3382n = new ArrayList();
        obj.f3383o = new ArrayList();
        obj.f3384p = new ArrayList();
        obj.f3385q = new ArrayList();
        obj.f3386r = new ArrayList();
        this.f1646H = obj;
        this.f1647I = 0;
        this.f1648J = -1;
        this.f1658T = Float.MIN_VALUE;
        this.f1659U = Float.MIN_VALUE;
        this.f1660V = true;
        this.f1661W = new V(this);
        this.b0 = new Object();
        ?? obj2 = new Object();
        obj2.f3279a = -1;
        obj2.f3280b = 0;
        obj2.f3281c = 0;
        obj2.d = 1;
        obj2.f3282e = 0;
        obj2.f3283f = false;
        obj2.f3284g = false;
        obj2.h = false;
        obj2.i = false;
        obj2.f3285j = false;
        obj2.f3286k = false;
        this.f1666c0 = obj2;
        this.f1671f0 = false;
        this.f1673g0 = false;
        C0301y c0301y = new C0301y(this);
        this.f1674h0 = c0301y;
        this.f1675i0 = false;
        this.f1679k0 = new int[2];
        this.f1683m0 = new int[2];
        this.f1685n0 = new int[2];
        this.f1687o0 = new int[2];
        this.f1689p0 = new ArrayList();
        this.f1691q0 = new i(15, this);
        this.r0 = new C0301y(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1654P = viewConfiguration.getScaledTouchSlop();
        this.f1658T = L.T.a(viewConfiguration);
        this.f1659U = L.T.b(viewConfiguration);
        this.f1656R = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1657S = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f1646H.f3236a = c0301y;
        this.d = new I.d(new C0301y(this));
        this.f1668e = new C0016l(new C0301y(this));
        WeakHashMap weakHashMap = S.f311a;
        if (L.J.c(this) == 0) {
            L.J.m(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f1698x = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new Y(this));
        int[] iArr = AbstractC0276a.f3221a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, i, 0);
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f1672g = obtainStyledAttributes.getBoolean(1, true);
        if (obtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
                Resources resources = getContext().getResources();
                c2 = 3;
                c3 = 2;
                typedArray = obtainStyledAttributes;
                i2 = 4;
                new C0289l(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.android.music.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.android.music.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.android.music.R.dimen.fastscroll_margin));
            } else {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + y());
            }
        } else {
            c2 = 3;
            typedArray = obtainStyledAttributes;
            c3 = 2;
            i2 = 4;
        }
        typedArray.recycle();
        if (string != null) {
            String trim = string.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    trim = context.getPackageName() + trim;
                } else if (!trim.contains(".")) {
                    trim = RecyclerView.class.getPackage().getName() + '.' + trim;
                }
                String str = trim;
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> asSubclass = Class.forName(str, false, classLoader).asSubclass(H.class);
                    try {
                        constructor = asSubclass.getConstructor(f1638t0);
                        Object[] objArr2 = new Object[i2];
                        objArr2[0] = context;
                        objArr2[1] = attributeSet;
                        objArr2[c3] = Integer.valueOf(i);
                        objArr2[c2] = 0;
                        objArr = objArr2;
                    } catch (NoSuchMethodException e2) {
                        try {
                            constructor = asSubclass.getConstructor(new Class[0]);
                            objArr = null;
                        } catch (NoSuchMethodException e3) {
                            e3.initCause(e2);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e3);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((H) constructor.newInstance(objArr));
                } catch (ClassCastException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e4);
                } catch (ClassNotFoundException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e5);
                } catch (IllegalAccessException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e6);
                } catch (InstantiationException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e7);
                } catch (InvocationTargetException e8) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e8);
                }
            }
        }
        int[] iArr2 = f1637s0;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        saveAttributeDataForStyleable(context, iArr2, attributeSet, obtainStyledAttributes2, i, 0);
        boolean z2 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        H h = this.f1680l;
        if (h != null) {
            return h.t(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }
}
