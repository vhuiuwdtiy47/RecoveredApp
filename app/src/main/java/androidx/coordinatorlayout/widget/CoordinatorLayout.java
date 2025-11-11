package androidx.coordinatorlayout.widget;

import B.a;
import K.c;
import L.C0021q;
import L.E;
import L.G;
import L.InterfaceC0019o;
import L.InterfaceC0020p;
import L.S;
import L.u0;
import M0.n;
import S.b;
import U.v;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.android.music.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import o.j;
import x.AbstractC0374a;
import y.AbstractC0376a;
import y.AbstractC0382g;
import y.C0379d;
import y.C0381f;
import y.InterfaceC0377b;
import y.ViewGroupOnHierarchyChangeListenerC0378c;
import y.ViewTreeObserverOnPreDrawListenerC0380e;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC0019o, InterfaceC0020p {

    /* renamed from: t, reason: collision with root package name */
    public static final String f1475t;

    /* renamed from: u, reason: collision with root package name */
    public static final Class[] f1476u;

    /* renamed from: v, reason: collision with root package name */
    public static final ThreadLocal f1477v;

    /* renamed from: w, reason: collision with root package name */
    public static final n f1478w;

    /* renamed from: x, reason: collision with root package name */
    public static final c f1479x;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1480a;

    /* renamed from: b, reason: collision with root package name */
    public final v f1481b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1482c;
    public final ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f1483e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f1484f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1485g;
    public boolean h;
    public final int[] i;

    /* renamed from: j, reason: collision with root package name */
    public View f1486j;

    /* renamed from: k, reason: collision with root package name */
    public View f1487k;

    /* renamed from: l, reason: collision with root package name */
    public ViewTreeObserverOnPreDrawListenerC0380e f1488l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1489m;

    /* renamed from: n, reason: collision with root package name */
    public u0 f1490n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1491o;

    /* renamed from: p, reason: collision with root package name */
    public Drawable f1492p;

    /* renamed from: q, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f1493q;

    /* renamed from: r, reason: collision with root package name */
    public A0.c f1494r;

    /* renamed from: s, reason: collision with root package name */
    public final C0021q f1495s;

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        f1475t = r0 != null ? r0.getName() : null;
        f1478w = new n(3);
        f1476u = new Class[]{Context.class, AttributeSet.class};
        f1477v = new ThreadLocal();
        f1479x = new c(12);
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, L.q] */
    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f1480a = new ArrayList();
        this.f1481b = new v(5);
        this.f1482c = new ArrayList();
        this.d = new ArrayList();
        this.f1483e = new int[2];
        this.f1484f = new int[2];
        this.f1495s = new Object();
        int[] iArr = AbstractC0374a.f4187a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.i = intArray;
            float f2 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i = 0; i < length; i++) {
                this.i[i] = (int) (r11[i] * f2);
            }
        }
        this.f1492p = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        w();
        super.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC0378c(this));
        WeakHashMap weakHashMap = S.f311a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static Rect g() {
        Rect rect = (Rect) f1479x.a();
        return rect == null ? new Rect() : rect;
    }

    public static void l(int i, Rect rect, Rect rect2, C0379d c0379d, int i2, int i3) {
        int i4 = c0379d.f4206c;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = c0379d.d;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        int width = i8 != 1 ? i8 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i9 != 16 ? i9 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i6 == 1) {
            width -= i2 / 2;
        } else if (i6 != 5) {
            width -= i2;
        }
        if (i7 == 16) {
            height -= i3 / 2;
        } else if (i7 != 80) {
            height -= i3;
        }
        rect2.set(width, height, i2 + width, i3 + height);
    }

    public static C0379d n(View view) {
        C0379d c0379d = (C0379d) view.getLayoutParams();
        if (!c0379d.f4205b) {
            InterfaceC0377b interfaceC0377b = null;
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                interfaceC0377b = (InterfaceC0377b) cls.getAnnotation(InterfaceC0377b.class);
                if (interfaceC0377b != null) {
                    break;
                }
            }
            if (interfaceC0377b != null) {
                try {
                    AbstractC0376a abstractC0376a = (AbstractC0376a) interfaceC0377b.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    AbstractC0376a abstractC0376a2 = c0379d.f4204a;
                    if (abstractC0376a2 != abstractC0376a) {
                        if (abstractC0376a2 != null) {
                            abstractC0376a2.e();
                        }
                        c0379d.f4204a = abstractC0376a;
                        c0379d.f4205b = true;
                        if (abstractC0376a != null) {
                            abstractC0376a.c(c0379d);
                        }
                    }
                } catch (Exception e2) {
                    Log.e("CoordinatorLayout", "Default behavior class " + interfaceC0377b.value().getName() + " could not be instantiated. Did you forget a default constructor?", e2);
                }
            }
            c0379d.f4205b = true;
        }
        return c0379d;
    }

    public static void u(View view, int i) {
        C0379d c0379d = (C0379d) view.getLayoutParams();
        int i2 = c0379d.i;
        if (i2 != i) {
            WeakHashMap weakHashMap = S.f311a;
            view.offsetLeftAndRight(i - i2);
            c0379d.i = i;
        }
    }

    public static void v(View view, int i) {
        C0379d c0379d = (C0379d) view.getLayoutParams();
        int i2 = c0379d.f4210j;
        if (i2 != i) {
            WeakHashMap weakHashMap = S.f311a;
            view.offsetTopAndBottom(i - i2);
            c0379d.f4210j = i;
        }
    }

    @Override // L.InterfaceC0019o
    public final void a(View view, View view2, int i, int i2) {
        C0021q c0021q = this.f1495s;
        if (i2 == 1) {
            c0021q.f378b = i;
        } else {
            c0021q.f377a = i;
        }
        this.f1487k = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ((C0379d) getChildAt(i3).getLayoutParams()).getClass();
        }
    }

    @Override // L.InterfaceC0020p
    public final void b(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        AbstractC0376a abstractC0376a;
        int childCount = getChildCount();
        int i6 = 0;
        int i7 = 0;
        boolean z2 = false;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C0379d c0379d = (C0379d) childAt.getLayoutParams();
                if (c0379d.a(i5) && (abstractC0376a = c0379d.f4204a) != null) {
                    int[] iArr2 = this.f1483e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC0376a.k(this, childAt, i2, i3, i4, iArr2);
                    i6 = i3 > 0 ? Math.max(i6, iArr2[0]) : Math.min(i6, iArr2[0]);
                    i7 = i4 > 0 ? Math.max(i7, iArr2[1]) : Math.min(i7, iArr2[1]);
                    z2 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + i7;
        if (z2) {
            p(1);
        }
    }

    @Override // L.InterfaceC0019o
    public final void c(View view, int i, int i2, int i3, int i4, int i5) {
        b(view, i, i2, i3, i4, 0, this.f1484f);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0379d) && super.checkLayoutParams(layoutParams);
    }

    @Override // L.InterfaceC0019o
    public final void d(View view, int i) {
        C0021q c0021q = this.f1495s;
        if (i == 1) {
            c0021q.f378b = 0;
        } else {
            c0021q.f377a = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0379d c0379d = (C0379d) childAt.getLayoutParams();
            if (c0379d.a(i)) {
                AbstractC0376a abstractC0376a = c0379d.f4204a;
                if (abstractC0376a != null) {
                    abstractC0376a.p(childAt, view, i);
                }
                if (i == 0) {
                    c0379d.f4213m = false;
                } else if (i == 1) {
                    c0379d.f4214n = false;
                }
            }
        }
        this.f1487k = null;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        AbstractC0376a abstractC0376a = ((C0379d) view.getLayoutParams()).f4204a;
        if (abstractC0376a != null) {
            abstractC0376a.getClass();
        }
        return super.drawChild(canvas, view, j2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1492p;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // L.InterfaceC0019o
    public final void e(View view, int i, int i2, int[] iArr, int i3) {
        AbstractC0376a abstractC0376a;
        int childCount = getChildCount();
        boolean z2 = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C0379d c0379d = (C0379d) childAt.getLayoutParams();
                if (c0379d.a(i3) && (abstractC0376a = c0379d.f4204a) != null) {
                    int[] iArr2 = this.f1483e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC0376a.j(this, childAt, view, i, i2, iArr2, i3);
                    i4 = i > 0 ? Math.max(i4, iArr2[0]) : Math.min(i4, iArr2[0]);
                    i5 = i2 > 0 ? Math.max(i5, iArr2[1]) : Math.min(i5, iArr2[1]);
                    z2 = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z2) {
            p(1);
        }
    }

    @Override // L.InterfaceC0019o
    public final boolean f(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C0379d c0379d = (C0379d) childAt.getLayoutParams();
                AbstractC0376a abstractC0376a = c0379d.f4204a;
                if (abstractC0376a != null) {
                    boolean o2 = abstractC0376a.o(childAt, i, i2);
                    z2 |= o2;
                    if (i2 == 0) {
                        c0379d.f4213m = o2;
                    } else if (i2 == 1) {
                        c0379d.f4214n = o2;
                    }
                } else if (i2 == 0) {
                    c0379d.f4213m = false;
                } else if (i2 == 1) {
                    c0379d.f4214n = false;
                }
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0379d();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0379d(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        s();
        return Collections.unmodifiableList(this.f1480a);
    }

    public final u0 getLastWindowInsets() {
        return this.f1490n;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0021q c0021q = this.f1495s;
        return c0021q.f378b | c0021q.f377a;
    }

    public Drawable getStatusBarBackground() {
        return this.f1492p;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(C0379d c0379d, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0379d).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) c0379d).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0379d).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) c0379d).bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    public final void i(View view, Rect rect, boolean z2) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z2) {
            k(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final ArrayList j(View view) {
        j jVar = (j) this.f1481b.f791b;
        int i = jVar.f3498c;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) jVar.i(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(jVar.f(i2));
            }
        }
        ArrayList arrayList3 = this.d;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void k(View view, Rect rect) {
        ThreadLocal threadLocal = AbstractC0382g.f4218a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = AbstractC0382g.f4218a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        AbstractC0382g.a(this, view, matrix);
        ThreadLocal threadLocal3 = AbstractC0382g.f4219b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int m(int i) {
        int[] iArr = this.i;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        }
        if (i >= 0 && i < iArr.length) {
            return iArr[i];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
        return 0;
    }

    public final boolean o(View view, int i, int i2) {
        c cVar = f1479x;
        Rect g2 = g();
        k(view, g2);
        try {
            return g2.contains(i, i2);
        } finally {
            g2.setEmpty();
            cVar.c(g2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t(false);
        if (this.f1489m) {
            if (this.f1488l == null) {
                this.f1488l = new ViewTreeObserverOnPreDrawListenerC0380e(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f1488l);
        }
        if (this.f1490n == null) {
            WeakHashMap weakHashMap = S.f311a;
            if (getFitsSystemWindows()) {
                E.c(this);
            }
        }
        this.h = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t(false);
        if (this.f1489m && this.f1488l != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f1488l);
        }
        View view = this.f1487k;
        if (view != null) {
            d(view, 0);
        }
        this.h = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f1491o || this.f1492p == null) {
            return;
        }
        u0 u0Var = this.f1490n;
        int d = u0Var != null ? u0Var.d() : 0;
        if (d > 0) {
            this.f1492p.setBounds(0, 0, getWidth(), d);
            this.f1492p.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            t(true);
        }
        boolean r2 = r(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return r2;
        }
        t(true);
        return r2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        AbstractC0376a abstractC0376a;
        WeakHashMap weakHashMap = S.f311a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f1480a;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            if (view.getVisibility() != 8 && ((abstractC0376a = ((C0379d) view.getLayoutParams()).f4204a) == null || !abstractC0376a.g(this, view, layoutDirection))) {
                q(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r28, int r29) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0379d c0379d = (C0379d) childAt.getLayoutParams();
                if (c0379d.a(0)) {
                    AbstractC0376a abstractC0376a = c0379d.f4204a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        AbstractC0376a abstractC0376a;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0379d c0379d = (C0379d) childAt.getLayoutParams();
                if (c0379d.a(0) && (abstractC0376a = c0379d.f4204a) != null) {
                    z2 |= abstractC0376a.i(view);
                }
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        e(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        c(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        a(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C0381f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0381f c0381f = (C0381f) parcelable;
        super.onRestoreInstanceState(c0381f.f628a);
        SparseArray sparseArray = c0381f.f4217c;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC0376a abstractC0376a = n(childAt).f4204a;
            if (id != -1 && abstractC0376a != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                abstractC0376a.m(childAt, parcelable2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [y.f, android.os.Parcelable, S.b] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable n2;
        ?? bVar = new b(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC0376a abstractC0376a = ((C0379d) childAt.getLayoutParams()).f4204a;
            if (id != -1 && abstractC0376a != null && (n2 = abstractC0376a.n(childAt)) != null) {
                sparseArray.append(id, n2);
            }
        }
        bVar.f4217c = sparseArray;
        return bVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return f(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        d(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r3 != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r1.getActionMasked()
            android.view.View r3 = r0.f1486j
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L17
            boolean r3 = r0.r(r1, r4)
            if (r3 == 0) goto L15
            goto L18
        L15:
            r6 = r5
            goto L2a
        L17:
            r3 = r5
        L18:
            android.view.View r6 = r0.f1486j
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            y.d r6 = (y.C0379d) r6
            y.a r6 = r6.f4204a
            if (r6 == 0) goto L15
            android.view.View r7 = r0.f1486j
            boolean r6 = r6.q(r7, r1)
        L2a:
            android.view.View r7 = r0.f1486j
            r8 = 0
            if (r7 != 0) goto L35
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L48
        L35:
            if (r3 == 0) goto L48
            long r9 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r11 = r9
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L48:
            if (r8 == 0) goto L4d
            r8.recycle()
        L4d:
            if (r2 == r4) goto L54
            r1 = 3
            if (r2 != r1) goto L53
            goto L54
        L53:
            return r6
        L54:
            r0.t(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0047 A[EDGE_INSN: B:117:0x0047->B:9:0x0047 BREAK  A[LOOP:2: B:109:0x02ad->B:115:0x02c4], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(int r25) {
        /*
            Method dump skipped, instructions count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.p(int):void");
    }

    public final void q(View view, int i) {
        Rect g2;
        Rect g3;
        C0379d c0379d = (C0379d) view.getLayoutParams();
        View view2 = c0379d.f4211k;
        if (view2 == null && c0379d.f4208f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        c cVar = f1479x;
        if (view2 != null) {
            g2 = g();
            g3 = g();
            try {
                k(view2, g2);
                C0379d c0379d2 = (C0379d) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                l(i, g2, g3, c0379d2, measuredWidth, measuredHeight);
                h(c0379d2, g3, measuredWidth, measuredHeight);
                view.layout(g3.left, g3.top, g3.right, g3.bottom);
                return;
            } finally {
                g2.setEmpty();
                cVar.c(g2);
                g3.setEmpty();
                cVar.c(g3);
            }
        }
        int i2 = c0379d.f4207e;
        if (i2 < 0) {
            C0379d c0379d3 = (C0379d) view.getLayoutParams();
            g2 = g();
            g2.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0379d3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0379d3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0379d3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c0379d3).bottomMargin);
            if (this.f1490n != null) {
                WeakHashMap weakHashMap = S.f311a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    g2.left = this.f1490n.b() + g2.left;
                    g2.top = this.f1490n.d() + g2.top;
                    g2.right -= this.f1490n.c();
                    g2.bottom -= this.f1490n.a();
                }
            }
            g3 = g();
            int i3 = c0379d3.f4206c;
            if ((i3 & 7) == 0) {
                i3 |= 8388611;
            }
            if ((i3 & 112) == 0) {
                i3 |= 48;
            }
            Gravity.apply(i3, view.getMeasuredWidth(), view.getMeasuredHeight(), g2, g3, i);
            view.layout(g3.left, g3.top, g3.right, g3.bottom);
            return;
        }
        C0379d c0379d4 = (C0379d) view.getLayoutParams();
        int i4 = c0379d4.f4206c;
        if (i4 == 0) {
            i4 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = absoluteGravity & 7;
        int i6 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i == 1) {
            i2 = width - i2;
        }
        int m2 = m(i2) - measuredWidth2;
        if (i5 == 1) {
            m2 += measuredWidth2 / 2;
        } else if (i5 == 5) {
            m2 += measuredWidth2;
        }
        int i7 = i6 != 16 ? i6 != 80 ? 0 : measuredHeight2 : measuredHeight2 / 2;
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0379d4).leftMargin, Math.min(m2, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) c0379d4).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0379d4).topMargin, Math.min(i7, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) c0379d4).bottomMargin));
        view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
    }

    public final boolean r(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f1482c;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            arrayList.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        n nVar = f1478w;
        if (nVar != null) {
            Collections.sort(arrayList, nVar);
        }
        int size = arrayList.size();
        MotionEvent motionEvent2 = null;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) arrayList.get(i3);
            AbstractC0376a abstractC0376a = ((C0379d) view.getLayoutParams()).f4204a;
            if (z2 && actionMasked != 0) {
                if (abstractC0376a != null) {
                    if (motionEvent2 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i == 0) {
                        abstractC0376a.f(this, view, motionEvent2);
                    } else if (i == 1) {
                        abstractC0376a.q(view, motionEvent2);
                    }
                }
            } else if (!z2 && abstractC0376a != null) {
                if (i == 0) {
                    z2 = abstractC0376a.f(this, view, motionEvent);
                } else if (i == 1) {
                    z2 = abstractC0376a.q(view, motionEvent);
                }
                if (z2) {
                    this.f1486j = view;
                }
            }
        }
        arrayList.clear();
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        AbstractC0376a abstractC0376a = ((C0379d) view.getLayoutParams()).f4204a;
        if (abstractC0376a != null) {
            abstractC0376a.l(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        if (!z2 || this.f1485g) {
            return;
        }
        t(false);
        this.f1485g = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0144, code lost:
    
        throw new java.lang.IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s() {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.s():void");
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z2) {
        super.setFitsSystemWindows(z2);
        w();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f1493q = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f1492p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f1492p = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f1492p.setState(getDrawableState());
                }
                Drawable drawable3 = this.f1492p;
                WeakHashMap weakHashMap = S.f311a;
                E.b.b(drawable3, getLayoutDirection());
                this.f1492p.setVisible(getVisibility() == 0, false);
                this.f1492p.setCallback(this);
            }
            WeakHashMap weakHashMap2 = S.f311a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? a.b(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z2 = i == 0;
        Drawable drawable = this.f1492p;
        if (drawable == null || drawable.isVisible() == z2) {
            return;
        }
        this.f1492p.setVisible(z2, false);
    }

    public final void t(boolean z2) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            AbstractC0376a abstractC0376a = ((C0379d) childAt.getLayoutParams()).f4204a;
            if (abstractC0376a != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z2) {
                    abstractC0376a.f(this, childAt, obtain);
                } else {
                    abstractC0376a.q(childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C0379d) getChildAt(i2).getLayoutParams()).getClass();
        }
        this.f1486j = null;
        this.f1485g = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1492p;
    }

    public final void w() {
        WeakHashMap weakHashMap = S.f311a;
        if (!getFitsSystemWindows()) {
            G.u(this, null);
            return;
        }
        if (this.f1494r == null) {
            this.f1494r = new A0.c(27, this);
        }
        G.u(this, this.f1494r);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0379d) {
            return new C0379d((C0379d) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C0379d((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C0379d(layoutParams);
    }
}
