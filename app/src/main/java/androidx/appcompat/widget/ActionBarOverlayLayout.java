package androidx.appcompat.widget;

import A0.a;
import D.c;
import L.C0021q;
import L.E;
import L.G;
import L.InterfaceC0019o;
import L.InterfaceC0020p;
import L.S;
import L.k0;
import L.l0;
import L.m0;
import L.s0;
import L.u0;
import U.t;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import com.android.music.R;
import g.L;
import j.j;
import java.util.WeakHashMap;
import k.m;
import k.x;
import l.C0217W0;
import l.C0229e;
import l.C0231f;
import l.C0243l;
import l.InterfaceC0227d;
import l.InterfaceC0238i0;
import l.InterfaceC0240j0;
import l.RunnableC0225c;
import l.b1;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0238i0, InterfaceC0019o, InterfaceC0020p {

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f1367C = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* renamed from: D, reason: collision with root package name */
    public static final u0 f1368D;

    /* renamed from: E, reason: collision with root package name */
    public static final Rect f1369E;

    /* renamed from: A, reason: collision with root package name */
    public final C0021q f1370A;

    /* renamed from: B, reason: collision with root package name */
    public final C0231f f1371B;

    /* renamed from: a, reason: collision with root package name */
    public int f1372a;

    /* renamed from: b, reason: collision with root package name */
    public int f1373b;

    /* renamed from: c, reason: collision with root package name */
    public ContentFrameLayout f1374c;
    public ActionBarContainer d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0240j0 f1375e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f1376f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1377g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1378j;

    /* renamed from: k, reason: collision with root package name */
    public int f1379k;

    /* renamed from: l, reason: collision with root package name */
    public int f1380l;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f1381m;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f1382n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f1383o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f1384p;

    /* renamed from: q, reason: collision with root package name */
    public u0 f1385q;

    /* renamed from: r, reason: collision with root package name */
    public u0 f1386r;

    /* renamed from: s, reason: collision with root package name */
    public u0 f1387s;

    /* renamed from: t, reason: collision with root package name */
    public u0 f1388t;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC0227d f1389u;

    /* renamed from: v, reason: collision with root package name */
    public OverScroller f1390v;

    /* renamed from: w, reason: collision with root package name */
    public ViewPropertyAnimator f1391w;

    /* renamed from: x, reason: collision with root package name */
    public final a f1392x;

    /* renamed from: y, reason: collision with root package name */
    public final RunnableC0225c f1393y;

    /* renamed from: z, reason: collision with root package name */
    public final RunnableC0225c f1394z;

    static {
        m0 l0Var = Build.VERSION.SDK_INT >= 30 ? new l0() : new k0();
        l0Var.f(c.b(0, 1, 0, 1));
        f1368D = l0Var.b();
        f1369E = new Rect();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object, L.q] */
    /* JADX WARN: Type inference failed for: r3v15, types: [l.f, android.view.View] */
    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1373b = 0;
        this.f1381m = new Rect();
        this.f1382n = new Rect();
        this.f1383o = new Rect();
        this.f1384p = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        u0 u0Var = u0.f388b;
        this.f1385q = u0Var;
        this.f1386r = u0Var;
        this.f1387s = u0Var;
        this.f1388t = u0Var;
        this.f1392x = new a(3, this);
        this.f1393y = new RunnableC0225c(this, 0);
        this.f1394z = new RunnableC0225c(this, 1);
        i(context);
        this.f1370A = new Object();
        ?? view = new View(context);
        view.setWillNotDraw(true);
        this.f1371B = view;
        addView(view);
    }

    public static boolean g(View view, Rect rect, boolean z2) {
        boolean z3;
        C0229e c0229e = (C0229e) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) c0229e).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) c0229e).leftMargin = i2;
            z3 = true;
        } else {
            z3 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) c0229e).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) c0229e).topMargin = i4;
            z3 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) c0229e).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) c0229e).rightMargin = i6;
            z3 = true;
        }
        if (z2) {
            int i7 = ((ViewGroup.MarginLayoutParams) c0229e).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) c0229e).bottomMargin = i8;
                return true;
            }
        }
        return z3;
    }

    @Override // L.InterfaceC0019o
    public final void a(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // L.InterfaceC0020p
    public final void b(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        c(view, i, i2, i3, i4, i5);
    }

    @Override // L.InterfaceC0019o
    public final void c(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0229e;
    }

    @Override // L.InterfaceC0019o
    public final void d(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f1376f != null) {
            if (this.d.getVisibility() == 0) {
                i = (int) (this.d.getTranslationY() + this.d.getBottom() + 0.5f);
            } else {
                i = 0;
            }
            this.f1376f.setBounds(0, i, getWidth(), this.f1376f.getIntrinsicHeight() + i);
            this.f1376f.draw(canvas);
        }
    }

    @Override // L.InterfaceC0019o
    public final void e(View view, int i, int i2, int[] iArr, int i3) {
    }

    @Override // L.InterfaceC0019o
    public final boolean f(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0021q c0021q = this.f1370A;
        return c0021q.f378b | c0021q.f377a;
    }

    public CharSequence getTitle() {
        k();
        return ((b1) this.f1375e).f3055a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f1393y);
        removeCallbacks(this.f1394z);
        ViewPropertyAnimator viewPropertyAnimator = this.f1391w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1367C);
        this.f1372a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1376f = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f1390v = new OverScroller(context);
    }

    public final void j(int i) {
        k();
        if (i == 2) {
            ((b1) this.f1375e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((b1) this.f1375e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        InterfaceC0240j0 wrapper;
        if (this.f1374c == null) {
            this.f1374c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof InterfaceC0240j0) {
                wrapper = (InterfaceC0240j0) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f1375e = wrapper;
        }
    }

    public final void l(m mVar, x xVar) {
        k();
        b1 b1Var = (b1) this.f1375e;
        C0243l c0243l = b1Var.f3064m;
        Toolbar toolbar = b1Var.f3055a;
        if (c0243l == null) {
            C0243l c0243l2 = new C0243l(toolbar.getContext());
            b1Var.f3064m = c0243l2;
            c0243l2.i = R.id.action_menu_presenter;
        }
        C0243l c0243l3 = b1Var.f3064m;
        c0243l3.f3090e = xVar;
        if (mVar == null && toolbar.f1435a == null) {
            return;
        }
        toolbar.f();
        m mVar2 = toolbar.f1435a.f1395p;
        if (mVar2 == mVar) {
            return;
        }
        if (mVar2 != null) {
            mVar2.r(toolbar.f1428K);
            mVar2.r(toolbar.f1429L);
        }
        if (toolbar.f1429L == null) {
            toolbar.f1429L = new C0217W0(toolbar);
        }
        c0243l3.f3101r = true;
        if (mVar != null) {
            mVar.b(c0243l3, toolbar.f1441j);
            mVar.b(toolbar.f1429L, toolbar.f1441j);
        } else {
            c0243l3.i(toolbar.f1441j, null);
            toolbar.f1429L.i(toolbar.f1441j, null);
            c0243l3.l(true);
            toolbar.f1429L.l(true);
        }
        toolbar.f1435a.setPopupTheme(toolbar.f1442k);
        toolbar.f1435a.setPresenter(c0243l3);
        toolbar.f1428K = c0243l3;
        toolbar.u();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        u0 f2 = u0.f(this, windowInsets);
        boolean g2 = g(this.d, new Rect(f2.b(), f2.d(), f2.c(), f2.a()), false);
        WeakHashMap weakHashMap = S.f311a;
        Rect rect = this.f1381m;
        G.b(this, f2, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        s0 s0Var = f2.f389a;
        u0 l2 = s0Var.l(i, i2, i3, i4);
        this.f1385q = l2;
        boolean z2 = true;
        if (!this.f1386r.equals(l2)) {
            this.f1386r = this.f1385q;
            g2 = true;
        }
        Rect rect2 = this.f1382n;
        if (rect2.equals(rect)) {
            z2 = g2;
        } else {
            rect2.set(rect);
        }
        if (z2) {
            requestLayout();
        }
        return s0Var.a().f389a.c().f389a.b().e();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = S.f311a;
        E.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0229e c0229e = (C0229e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) c0229e).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) c0229e).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00f2  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r13, int r14) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (!this.i || !z2) {
            return false;
        }
        this.f1390v.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f1390v.getFinalY() > this.d.getHeight()) {
            h();
            this.f1394z.run();
        } else {
            h();
            this.f1393y.run();
        }
        this.f1378j = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f1379k + i2;
        this.f1379k = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        L l2;
        j jVar;
        this.f1370A.f377a = i;
        this.f1379k = getActionBarHideOffset();
        h();
        InterfaceC0227d interfaceC0227d = this.f1389u;
        if (interfaceC0227d == null || (jVar = (l2 = (L) interfaceC0227d).f2496w) == null) {
            return;
        }
        jVar.a();
        l2.f2496w = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.d.getVisibility() != 0) {
            return false;
        }
        return this.i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.i || this.f1378j) {
            return;
        }
        if (this.f1379k <= this.d.getHeight()) {
            h();
            postDelayed(this.f1393y, 600L);
        } else {
            h();
            postDelayed(this.f1394z, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        k();
        int i2 = this.f1380l ^ i;
        this.f1380l = i;
        boolean z2 = (i & 4) == 0;
        boolean z3 = (i & 256) != 0;
        InterfaceC0227d interfaceC0227d = this.f1389u;
        if (interfaceC0227d != null) {
            L l2 = (L) interfaceC0227d;
            l2.f2492s = !z3;
            if (z2 || !z3) {
                if (l2.f2493t) {
                    l2.f2493t = false;
                    l2.m0(true);
                }
            } else if (!l2.f2493t) {
                l2.f2493t = true;
                l2.m0(true);
            }
        }
        if ((i2 & 256) == 0 || this.f1389u == null) {
            return;
        }
        WeakHashMap weakHashMap = S.f311a;
        E.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f1373b = i;
        InterfaceC0227d interfaceC0227d = this.f1389u;
        if (interfaceC0227d != null) {
            ((L) interfaceC0227d).f2491r = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        h();
        this.d.setTranslationY(-Math.max(0, Math.min(i, this.d.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0227d interfaceC0227d) {
        this.f1389u = interfaceC0227d;
        if (getWindowToken() != null) {
            ((L) this.f1389u).f2491r = this.f1373b;
            int i = this.f1380l;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = S.f311a;
                E.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z2) {
        this.h = z2;
    }

    public void setHideOnContentScrollEnabled(boolean z2) {
        if (z2 != this.i) {
            this.i = z2;
            if (z2) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        k();
        b1 b1Var = (b1) this.f1375e;
        b1Var.d = i != 0 ? t.u(b1Var.f3055a.getContext(), i) : null;
        b1Var.c();
    }

    public void setLogo(int i) {
        k();
        b1 b1Var = (b1) this.f1375e;
        b1Var.f3058e = i != 0 ? t.u(b1Var.f3055a.getContext(), i) : null;
        b1Var.c();
    }

    public void setOverlayMode(boolean z2) {
        this.f1377g = z2;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i) {
    }

    @Override // l.InterfaceC0238i0
    public void setWindowCallback(Window.Callback callback) {
        k();
        ((b1) this.f1375e).f3062k = callback;
    }

    @Override // l.InterfaceC0238i0
    public void setWindowTitle(CharSequence charSequence) {
        k();
        b1 b1Var = (b1) this.f1375e;
        if (b1Var.f3060g) {
            return;
        }
        b1Var.h = charSequence;
        if ((b1Var.f3056b & 8) != 0) {
            Toolbar toolbar = b1Var.f3055a;
            toolbar.setTitle(charSequence);
            if (b1Var.f3060g) {
                S.i(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        b1 b1Var = (b1) this.f1375e;
        b1Var.d = drawable;
        b1Var.c();
    }
}
