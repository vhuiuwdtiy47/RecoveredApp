package n0;

import L.C0016l;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m0.AbstractC0276a;

/* loaded from: classes.dex */
public abstract class H {

    /* renamed from: a, reason: collision with root package name */
    public C0016l f3246a;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f3247b;

    /* renamed from: c, reason: collision with root package name */
    public final C.j f3248c;
    public final C.j d;

    /* renamed from: e, reason: collision with root package name */
    public C0298v f3249e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3250f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3251g;
    public final boolean h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public int f3252j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3253k;

    /* renamed from: l, reason: collision with root package name */
    public int f3254l;

    /* renamed from: m, reason: collision with root package name */
    public int f3255m;

    /* renamed from: n, reason: collision with root package name */
    public int f3256n;

    /* renamed from: o, reason: collision with root package name */
    public int f3257o;

    public H() {
        F f2 = new F(this, 0);
        F f3 = new F(this, 1);
        this.f3248c = new C.j(f2);
        this.d = new C.j(f3);
        this.f3250f = false;
        this.f3251g = false;
        this.h = true;
        this.i = true;
    }

    public static int A(View view) {
        Rect rect = ((I) view.getLayoutParams()).f3259b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int H(View view) {
        return ((I) view.getLayoutParams()).f3258a.b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [n0.G, java.lang.Object] */
    public static G I(Context context, AttributeSet attributeSet, int i, int i2) {
        ?? obj = new Object();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0276a.f3221a, i, i2);
        obj.f3243a = obtainStyledAttributes.getInt(0, 1);
        obj.f3244b = obtainStyledAttributes.getInt(10, 1);
        obj.f3245c = obtainStyledAttributes.getBoolean(9, false);
        obj.d = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return obj;
    }

    public static boolean M(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    public static void N(View view, int i, int i2, int i3, int i4) {
        I i5 = (I) view.getLayoutParams();
        Rect rect = i5.f3259b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) i5).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) i5).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) i5).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) i5).bottomMargin);
    }

    public static int g(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r6 == 1073741824) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int w(boolean r4, int r5, int r6, int r7, int r8) {
        /*
            int r5 = r5 - r7
            r7 = 0
            int r5 = java.lang.Math.max(r7, r5)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto L1d
            if (r8 < 0) goto L12
        L10:
            r6 = r3
            goto L30
        L12:
            if (r8 != r1) goto L1a
            if (r6 == r2) goto L22
            if (r6 == 0) goto L1a
            if (r6 == r3) goto L22
        L1a:
            r6 = r7
            r8 = r6
            goto L30
        L1d:
            if (r8 < 0) goto L20
            goto L10
        L20:
            if (r8 != r1) goto L24
        L22:
            r8 = r5
            goto L30
        L24:
            if (r8 != r0) goto L1a
            if (r6 == r2) goto L2e
            if (r6 != r3) goto L2b
            goto L2e
        L2b:
            r8 = r5
            r6 = r7
            goto L30
        L2e:
            r8 = r5
            r6 = r2
        L30:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.H.w(boolean, int, int, int, int):int");
    }

    public static int z(View view) {
        Rect rect = ((I) view.getLayoutParams()).f3259b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public final int B() {
        RecyclerView recyclerView = this.f3247b;
        AbstractC0302z adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.a();
        }
        return 0;
    }

    public final int C() {
        RecyclerView recyclerView = this.f3247b;
        WeakHashMap weakHashMap = L.S.f311a;
        return recyclerView.getLayoutDirection();
    }

    public final int D() {
        RecyclerView recyclerView = this.f3247b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.f3247b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int F() {
        RecyclerView recyclerView = this.f3247b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int G() {
        RecyclerView recyclerView = this.f3247b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int J(N n2, T t2) {
        RecyclerView recyclerView = this.f3247b;
        if (recyclerView == null || recyclerView.f1678k == null || !e()) {
            return 1;
        }
        return this.f3247b.f1678k.a();
    }

    public final void K(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((I) view.getLayoutParams()).f3259b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f3247b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f3247b.f1676j;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean L();

    public void O(int i) {
        RecyclerView recyclerView = this.f3247b;
        if (recyclerView != null) {
            int f2 = recyclerView.f1668e.f();
            for (int i2 = 0; i2 < f2; i2++) {
                recyclerView.f1668e.e(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void P(int i) {
        RecyclerView recyclerView = this.f3247b;
        if (recyclerView != null) {
            int f2 = recyclerView.f1668e.f();
            for (int i2 = 0; i2 < f2; i2++) {
                recyclerView.f1668e.e(i2).offsetTopAndBottom(i);
            }
        }
    }

    public void Q(RecyclerView recyclerView) {
    }

    public abstract void R(RecyclerView recyclerView);

    public abstract View S(View view, int i, N n2, T t2);

    public void T(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f3247b;
        N n2 = recyclerView.f1664b;
        T t2 = recyclerView.f1666c0;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z2 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f3247b.canScrollVertically(-1) && !this.f3247b.canScrollHorizontally(-1) && !this.f3247b.canScrollHorizontally(1)) {
            z2 = false;
        }
        accessibilityEvent.setScrollable(z2);
        AbstractC0302z abstractC0302z = this.f3247b.f1678k;
        if (abstractC0302z != null) {
            accessibilityEvent.setItemCount(abstractC0302z.a());
        }
    }

    public final void U(View view, M.k kVar) {
        W I2 = RecyclerView.I(view);
        if (I2 == null || I2.h() || ((ArrayList) this.f3246a.d).contains(I2.f3297a)) {
            return;
        }
        RecyclerView recyclerView = this.f3247b;
        V(recyclerView.f1664b, recyclerView.f1666c0, view, kVar);
    }

    public void V(N n2, T t2, View view, M.k kVar) {
        kVar.h(M.j.a(false, e() ? H(view) : 0, 1, d() ? H(view) : 0, 1));
    }

    public void W(int i, int i2) {
    }

    public void X() {
    }

    public void Y(int i, int i2) {
    }

    public void Z(int i, int i2) {
    }

    public void a0(int i, int i2) {
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.view.View r8, int r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.H.b(android.view.View, int, boolean):void");
    }

    public abstract void b0(N n2, T t2);

    public void c(String str) {
        RecyclerView recyclerView = this.f3247b;
        if (recyclerView != null) {
            recyclerView.i(str);
        }
    }

    public abstract void c0(T t2);

    public abstract boolean d();

    public void d0(Parcelable parcelable) {
    }

    public abstract boolean e();

    public Parcelable e0() {
        return null;
    }

    public boolean f(I i) {
        return i != null;
    }

    public void f0(int i) {
    }

    public final void g0(N n2) {
        for (int v2 = v() - 1; v2 >= 0; v2--) {
            if (!RecyclerView.I(u(v2)).o()) {
                View u2 = u(v2);
                j0(v2);
                n2.f(u2);
            }
        }
    }

    public void h(int i, int i2, T t2, C0290m c0290m) {
    }

    public final void h0(N n2) {
        ArrayList arrayList;
        int size = n2.f3266a.size();
        int i = size - 1;
        while (true) {
            arrayList = n2.f3266a;
            if (i < 0) {
                break;
            }
            View view = ((W) arrayList.get(i)).f3297a;
            W I2 = RecyclerView.I(view);
            if (!I2.o()) {
                I2.n(false);
                if (I2.j()) {
                    this.f3247b.removeDetachedView(view, false);
                }
                D d = this.f3247b.f1646H;
                if (d != null) {
                    d.d(I2);
                }
                I2.n(true);
                W I3 = RecyclerView.I(view);
                I3.f3307n = null;
                I3.f3308o = false;
                I3.f3303j &= -33;
                n2.g(I3);
            }
            i--;
        }
        arrayList.clear();
        ArrayList arrayList2 = n2.f3267b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f3247b.invalidate();
        }
    }

    public void i(int i, C0290m c0290m) {
    }

    public final void i0(View view, N n2) {
        C0016l c0016l = this.f3246a;
        C0301y c0301y = (C0301y) c0016l.f361b;
        int indexOfChild = c0301y.f3472a.indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((C0279b) c0016l.f362c).f(indexOfChild)) {
                c0016l.w(view);
            }
            c0301y.h(indexOfChild);
        }
        n2.f(view);
    }

    public abstract int j(T t2);

    public final void j0(int i) {
        if (u(i) != null) {
            C0016l c0016l = this.f3246a;
            int k2 = c0016l.k(i);
            C0301y c0301y = (C0301y) c0016l.f361b;
            View childAt = c0301y.f3472a.getChildAt(k2);
            if (childAt == null) {
                return;
            }
            if (((C0279b) c0016l.f362c).f(k2)) {
                c0016l.w(childAt);
            }
            c0301y.h(k2);
        }
    }

    public abstract int k(T t2);

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ab, code lost:
    
        if ((r5.bottom - r10) > r2) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean k0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.E()
            int r1 = r8.G()
            int r2 = r8.f3256n
            int r3 = r8.F()
            int r2 = r2 - r3
            int r3 = r8.f3257o
            int r4 = r8.D()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            r0 = 0
            int r6 = java.lang.Math.min(r0, r4)
            int r5 = r5 - r1
            int r1 = java.lang.Math.min(r0, r5)
            int r10 = r10 - r2
            int r2 = java.lang.Math.max(r0, r10)
            int r11 = r11 - r3
            int r11 = java.lang.Math.max(r0, r11)
            int r3 = r8.C()
            r7 = 1
            if (r3 != r7) goto L5c
            if (r2 == 0) goto L57
            goto L64
        L57:
            int r2 = java.lang.Math.max(r6, r10)
            goto L64
        L5c:
            if (r6 == 0) goto L5f
            goto L63
        L5f:
            int r6 = java.lang.Math.min(r4, r2)
        L63:
            r2 = r6
        L64:
            if (r1 == 0) goto L67
            goto L6b
        L67:
            int r1 = java.lang.Math.min(r5, r11)
        L6b:
            int[] r10 = new int[]{r2, r1}
            r11 = r10[r0]
            r10 = r10[r7]
            if (r13 == 0) goto Lae
            android.view.View r13 = r9.getFocusedChild()
            if (r13 != 0) goto L7c
            goto Lb3
        L7c:
            int r1 = r8.E()
            int r2 = r8.G()
            int r3 = r8.f3256n
            int r4 = r8.F()
            int r3 = r3 - r4
            int r4 = r8.f3257o
            int r5 = r8.D()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.f3247b
            android.graphics.Rect r5 = r5.h
            r8.y(r13, r5)
            int r8 = r5.left
            int r8 = r8 - r11
            if (r8 >= r3) goto Lb3
            int r8 = r5.right
            int r8 = r8 - r11
            if (r8 <= r1) goto Lb3
            int r8 = r5.top
            int r8 = r8 - r10
            if (r8 >= r4) goto Lb3
            int r8 = r5.bottom
            int r8 = r8 - r10
            if (r8 > r2) goto Lae
            goto Lb3
        Lae:
            if (r11 != 0) goto Lb4
            if (r10 == 0) goto Lb3
            goto Lb4
        Lb3:
            return r0
        Lb4:
            if (r12 == 0) goto Lba
            r9.scrollBy(r11, r10)
            return r7
        Lba:
            r9.Z(r11, r10, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.H.k0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public abstract int l(T t2);

    public final void l0() {
        RecyclerView recyclerView = this.f3247b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract int m(T t2);

    public abstract int m0(int i, N n2, T t2);

    public abstract int n(T t2);

    public abstract void n0(int i);

    public abstract int o(T t2);

    public abstract int o0(int i, N n2, T t2);

    public final void p(N n2) {
        for (int v2 = v() - 1; v2 >= 0; v2--) {
            View u2 = u(v2);
            W I2 = RecyclerView.I(u2);
            if (!I2.o()) {
                if (!I2.f() || I2.h() || this.f3247b.f1678k.f3474b) {
                    u(v2);
                    this.f3246a.d(v2);
                    n2.h(u2);
                    this.f3247b.f1670f.J(I2);
                } else {
                    j0(v2);
                    n2.g(I2);
                }
            }
        }
    }

    public final void p0(RecyclerView recyclerView) {
        q0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public View q(int i) {
        int v2 = v();
        for (int i2 = 0; i2 < v2; i2++) {
            View u2 = u(i2);
            W I2 = RecyclerView.I(u2);
            if (I2 != null && I2.b() == i && !I2.o() && (this.f3247b.f1666c0.f3284g || !I2.h())) {
                return u2;
            }
        }
        return null;
    }

    public final void q0(int i, int i2) {
        this.f3256n = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.f3254l = mode;
        if (mode == 0) {
            int[] iArr = RecyclerView.f1637s0;
        }
        this.f3257o = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.f3255m = mode2;
        if (mode2 == 0) {
            int[] iArr2 = RecyclerView.f1637s0;
        }
    }

    public abstract I r();

    public void r0(Rect rect, int i, int i2) {
        int F2 = F() + E() + rect.width();
        int D2 = D() + G() + rect.height();
        RecyclerView recyclerView = this.f3247b;
        WeakHashMap weakHashMap = L.S.f311a;
        this.f3247b.setMeasuredDimension(g(i, F2, recyclerView.getMinimumWidth()), g(i2, D2, this.f3247b.getMinimumHeight()));
    }

    public I s(Context context, AttributeSet attributeSet) {
        return new I(context, attributeSet);
    }

    public final void s0(int i, int i2) {
        int v2 = v();
        if (v2 == 0) {
            this.f3247b.n(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < v2; i7++) {
            View u2 = u(i7);
            Rect rect = this.f3247b.h;
            y(u2, rect);
            int i8 = rect.left;
            if (i8 < i6) {
                i6 = i8;
            }
            int i9 = rect.right;
            if (i9 > i3) {
                i3 = i9;
            }
            int i10 = rect.top;
            if (i10 < i4) {
                i4 = i10;
            }
            int i11 = rect.bottom;
            if (i11 > i5) {
                i5 = i11;
            }
        }
        this.f3247b.h.set(i6, i4, i3, i5);
        r0(this.f3247b.h, i, i2);
    }

    public I t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof I ? new I((I) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new I((ViewGroup.MarginLayoutParams) layoutParams) : new I(layoutParams);
    }

    public final void t0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f3247b = null;
            this.f3246a = null;
            this.f3256n = 0;
            this.f3257o = 0;
        } else {
            this.f3247b = recyclerView;
            this.f3246a = recyclerView.f1668e;
            this.f3256n = recyclerView.getWidth();
            this.f3257o = recyclerView.getHeight();
        }
        this.f3254l = 1073741824;
        this.f3255m = 1073741824;
    }

    public final View u(int i) {
        C0016l c0016l = this.f3246a;
        if (c0016l != null) {
            return c0016l.e(i);
        }
        return null;
    }

    public final boolean u0(View view, int i, int i2, I i3) {
        return (!view.isLayoutRequested() && this.h && M(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) i3).width) && M(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) i3).height)) ? false : true;
    }

    public final int v() {
        C0016l c0016l = this.f3246a;
        if (c0016l != null) {
            return c0016l.f();
        }
        return 0;
    }

    public boolean v0() {
        return false;
    }

    public final boolean w0(View view, int i, int i2, I i3) {
        return (this.h && M(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) i3).width) && M(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) i3).height)) ? false : true;
    }

    public int x(N n2, T t2) {
        RecyclerView recyclerView = this.f3247b;
        if (recyclerView == null || recyclerView.f1678k == null || !d()) {
            return 1;
        }
        return this.f3247b.f1678k.a();
    }

    public abstract void x0(RecyclerView recyclerView, int i);

    public void y(View view, Rect rect) {
        int[] iArr = RecyclerView.f1637s0;
        I i = (I) view.getLayoutParams();
        Rect rect2 = i.f3259b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) i).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) i).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) i).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) i).bottomMargin);
    }

    public final void y0(C0298v c0298v) {
        C0298v c0298v2 = this.f3249e;
        if (c0298v2 != null && c0298v != c0298v2 && c0298v2.f3459e) {
            c0298v2.i();
        }
        this.f3249e = c0298v;
        RecyclerView recyclerView = this.f3247b;
        V v2 = recyclerView.f1661W;
        v2.f3295g.removeCallbacks(v2);
        v2.f3292c.abortAnimation();
        if (c0298v.h) {
            Log.w("RecyclerView", "An instance of " + c0298v.getClass().getSimpleName() + " was started more than once. Each instance of" + c0298v.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        c0298v.f3457b = recyclerView;
        c0298v.f3458c = this;
        int i = c0298v.f3456a;
        if (i == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.f1666c0.f3279a = i;
        c0298v.f3459e = true;
        c0298v.d = true;
        c0298v.f3460f = recyclerView.f1680l.q(i);
        c0298v.f3457b.f1661W.a();
        c0298v.h = true;
    }

    public boolean z0() {
        return false;
    }
}
