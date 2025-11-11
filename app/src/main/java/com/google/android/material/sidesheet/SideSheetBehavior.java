package com.google.android.material.sidesheet;

import C.p;
import D0.j;
import L.G;
import L.L;
import L.S;
import M.f;
import N.a;
import T.e;
import T0.g;
import T0.k;
import U.t;
import U0.c;
import Z0.i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.android.music.R;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import w0.AbstractC0373a;
import y.AbstractC0376a;
import y.C0379d;

/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends AbstractC0376a {

    /* renamed from: a, reason: collision with root package name */
    public t f1970a;

    /* renamed from: b, reason: collision with root package name */
    public final g f1971b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f1972c;
    public final k d;

    /* renamed from: e, reason: collision with root package name */
    public final j f1973e;

    /* renamed from: f, reason: collision with root package name */
    public final float f1974f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1975g;
    public int h;
    public e i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1976j;

    /* renamed from: k, reason: collision with root package name */
    public final float f1977k;

    /* renamed from: l, reason: collision with root package name */
    public int f1978l;

    /* renamed from: m, reason: collision with root package name */
    public int f1979m;

    /* renamed from: n, reason: collision with root package name */
    public int f1980n;

    /* renamed from: o, reason: collision with root package name */
    public int f1981o;

    /* renamed from: p, reason: collision with root package name */
    public WeakReference f1982p;

    /* renamed from: q, reason: collision with root package name */
    public WeakReference f1983q;

    /* renamed from: r, reason: collision with root package name */
    public final int f1984r;

    /* renamed from: s, reason: collision with root package name */
    public VelocityTracker f1985s;

    /* renamed from: t, reason: collision with root package name */
    public int f1986t;

    /* renamed from: u, reason: collision with root package name */
    public final LinkedHashSet f1987u;

    /* renamed from: v, reason: collision with root package name */
    public final D0.e f1988v;

    public SideSheetBehavior() {
        this.f1973e = new j(this);
        this.f1975g = true;
        this.h = 5;
        this.f1977k = 0.1f;
        this.f1984r = -1;
        this.f1987u = new LinkedHashSet();
        this.f1988v = new D0.e(this, 1);
    }

    @Override // y.AbstractC0376a
    public final void c(C0379d c0379d) {
        this.f1982p = null;
        this.i = null;
    }

    @Override // y.AbstractC0376a
    public final void e() {
        this.f1982p = null;
        this.i = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (L.L.b(r4) != null) goto L6;
     */
    @Override // y.AbstractC0376a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.MotionEvent r5) {
        /*
            r2 = this;
            boolean r3 = r4.isShown()
            r0 = 1
            r1 = 0
            if (r3 != 0) goto L10
            java.util.WeakHashMap r3 = L.S.f311a
            java.lang.CharSequence r3 = L.L.b(r4)
            if (r3 == 0) goto L59
        L10:
            boolean r3 = r2.f1975g
            if (r3 == 0) goto L59
            int r3 = r5.getActionMasked()
            if (r3 != 0) goto L24
            android.view.VelocityTracker r4 = r2.f1985s
            if (r4 == 0) goto L24
            r4.recycle()
            r4 = 0
            r2.f1985s = r4
        L24:
            android.view.VelocityTracker r4 = r2.f1985s
            if (r4 != 0) goto L2e
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r2.f1985s = r4
        L2e:
            android.view.VelocityTracker r4 = r2.f1985s
            r4.addMovement(r5)
            if (r3 == 0) goto L42
            if (r3 == r0) goto L3b
            r4 = 3
            if (r3 == r4) goto L3b
            goto L49
        L3b:
            boolean r3 = r2.f1976j
            if (r3 == 0) goto L49
            r2.f1976j = r1
            return r1
        L42:
            float r3 = r5.getX()
            int r3 = (int) r3
            r2.f1986t = r3
        L49:
            boolean r3 = r2.f1976j
            if (r3 != 0) goto L58
            T.e r2 = r2.i
            if (r2 == 0) goto L58
            boolean r2 = r2.p(r5)
            if (r2 == 0) goto L58
            return r0
        L58:
            return r1
        L59:
            r2.f1976j = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.f(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // y.AbstractC0376a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        View view2;
        View view3;
        int i2;
        View findViewById;
        int i3 = 0;
        int i4 = 1;
        g gVar = this.f1971b;
        WeakHashMap weakHashMap = S.f311a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f1982p == null) {
            this.f1982p = new WeakReference(view);
            Context context = view.getContext();
            i.c0(context, R.attr.motionEasingStandardDecelerateInterpolator, a.b(0.0f, 0.0f, 0.0f, 1.0f));
            i.b0(context, R.attr.motionDurationMedium2, 300);
            i.b0(context, R.attr.motionDurationShort3, 150);
            i.b0(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
            if (gVar != null) {
                view.setBackground(gVar);
                float f2 = this.f1974f;
                if (f2 == -1.0f) {
                    f2 = G.i(view);
                }
                gVar.i(f2);
            } else {
                ColorStateList colorStateList = this.f1972c;
                if (colorStateList != null) {
                    G.q(view, colorStateList);
                }
            }
            int i5 = this.h == 5 ? 4 : 0;
            if (view.getVisibility() != i5) {
                view.setVisibility(i5);
            }
            u();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (L.b(view) == null) {
                S.i(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i6 = Gravity.getAbsoluteGravity(((C0379d) view.getLayoutParams()).f4206c, i) == 3 ? 1 : 0;
        t tVar = this.f1970a;
        if (tVar == null || tVar.F() != i6) {
            k kVar = this.d;
            C0379d c0379d = null;
            if (i6 == 0) {
                this.f1970a = new U0.a(this, i4);
                if (kVar != null) {
                    WeakReference weakReference = this.f1982p;
                    if (weakReference != null && (view3 = (View) weakReference.get()) != null && (view3.getLayoutParams() instanceof C0379d)) {
                        c0379d = (C0379d) view3.getLayoutParams();
                    }
                    if (c0379d == null || ((ViewGroup.MarginLayoutParams) c0379d).rightMargin <= 0) {
                        T0.j e2 = kVar.e();
                        e2.f705f = new T0.a(0.0f);
                        e2.f706g = new T0.a(0.0f);
                        k a2 = e2.a();
                        if (gVar != null) {
                            gVar.setShapeAppearanceModel(a2);
                        }
                    }
                }
            } else {
                if (i6 != 1) {
                    throw new IllegalArgumentException("Invalid sheet edge position value: " + i6 + ". Must be 0 or 1.");
                }
                this.f1970a = new U0.a(this, i3);
                if (kVar != null) {
                    WeakReference weakReference2 = this.f1982p;
                    if (weakReference2 != null && (view2 = (View) weakReference2.get()) != null && (view2.getLayoutParams() instanceof C0379d)) {
                        c0379d = (C0379d) view2.getLayoutParams();
                    }
                    if (c0379d == null || ((ViewGroup.MarginLayoutParams) c0379d).leftMargin <= 0) {
                        T0.j e3 = kVar.e();
                        e3.f704e = new T0.a(0.0f);
                        e3.h = new T0.a(0.0f);
                        k a3 = e3.a();
                        if (gVar != null) {
                            gVar.setShapeAppearanceModel(a3);
                        }
                    }
                }
            }
        }
        if (this.i == null) {
            this.i = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f1988v);
        }
        int C2 = this.f1970a.C(view);
        coordinatorLayout.q(view, i);
        this.f1979m = coordinatorLayout.getWidth();
        this.f1980n = this.f1970a.D(coordinatorLayout);
        this.f1978l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f1981o = marginLayoutParams != null ? this.f1970a.j(marginLayoutParams) : 0;
        int i7 = this.h;
        if (i7 == 1 || i7 == 2) {
            i3 = C2 - this.f1970a.C(view);
        } else if (i7 != 3) {
            if (i7 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.h);
            }
            i3 = this.f1970a.x();
        }
        view.offsetLeftAndRight(i3);
        if (this.f1983q == null && (i2 = this.f1984r) != -1 && (findViewById = coordinatorLayout.findViewById(i2)) != null) {
            this.f1983q = new WeakReference(findViewById);
        }
        Iterator it = this.f1987u.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override // y.AbstractC0376a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // y.AbstractC0376a
    public final void m(View view, Parcelable parcelable) {
        int i = ((c) parcelable).f808c;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.h = i;
    }

    @Override // y.AbstractC0376a
    public final Parcelable n(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new c(this);
    }

    @Override // y.AbstractC0376a
    public final boolean q(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.h == 1 && actionMasked == 0) {
            return true;
        }
        if (s()) {
            this.i.j(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f1985s) != null) {
            velocityTracker.recycle();
            this.f1985s = null;
        }
        if (this.f1985s == null) {
            this.f1985s = VelocityTracker.obtain();
        }
        this.f1985s.addMovement(motionEvent);
        if (s() && actionMasked == 2 && !this.f1976j && s()) {
            float abs = Math.abs(this.f1986t - motionEvent.getX());
            e eVar = this.i;
            if (abs > eVar.f646b) {
                eVar.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f1976j;
    }

    public final void r(int i) {
        View view;
        if (this.h == i) {
            return;
        }
        this.h = i;
        WeakReference weakReference = this.f1982p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = this.h == 5 ? 4 : 0;
        if (view.getVisibility() != i2) {
            view.setVisibility(i2);
        }
        Iterator it = this.f1987u.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        u();
    }

    public final boolean s() {
        if (this.i != null) {
            return this.f1975g || this.h == 1;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (r1.o(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
    
        r(2);
        r2.f1973e.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0056, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (r3 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            r0 = 3
            if (r4 == r0) goto L19
            r0 = 5
            if (r4 != r0) goto Ld
            U.t r0 = r2.f1970a
            int r0 = r0.x()
            goto L1f
        Ld:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Invalid state to get outer edge offset: "
            java.lang.String r3 = D.f.b(r3, r4)
            r2.<init>(r3)
            throw r2
        L19:
            U.t r0 = r2.f1970a
            int r0 = r0.v()
        L1f:
            T.e r1 = r2.i
            if (r1 == 0) goto L57
            if (r5 == 0) goto L30
            int r3 = r3.getTop()
            boolean r3 = r1.o(r0, r3)
            if (r3 == 0) goto L57
            goto L4d
        L30:
            int r5 = r3.getTop()
            r1.f659r = r3
            r3 = -1
            r1.f647c = r3
            r3 = 0
            boolean r3 = r1.h(r0, r5, r3, r3)
            if (r3 != 0) goto L4b
            int r5 = r1.f645a
            if (r5 != 0) goto L4b
            android.view.View r5 = r1.f659r
            if (r5 == 0) goto L4b
            r5 = 0
            r1.f659r = r5
        L4b:
            if (r3 == 0) goto L57
        L4d:
            r3 = 2
            r2.r(r3)
            D0.j r2 = r2.f1973e
            r2.a(r4)
            return
        L57:
            r2.r(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.t(android.view.View, int, boolean):void");
    }

    public final void u() {
        View view;
        WeakReference weakReference = this.f1982p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        S.f(view, 262144);
        S.d(view, 0);
        S.f(view, 1048576);
        S.d(view, 0);
        final int i = 5;
        if (this.h != 5) {
            S.g(view, f.f410j, new M.t() { // from class: U0.b
                @Override // M.t
                public final boolean j(View view2) {
                    int i2 = 1;
                    SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                    sideSheetBehavior.getClass();
                    int i3 = i;
                    if (i3 == 1 || i3 == 2) {
                        StringBuilder sb = new StringBuilder("STATE_");
                        sb.append(i3 == 1 ? "DRAGGING" : "SETTLING");
                        sb.append(" should not be set externally.");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    WeakReference weakReference2 = sideSheetBehavior.f1982p;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.r(i3);
                        return true;
                    }
                    View view3 = (View) sideSheetBehavior.f1982p.get();
                    p pVar = new p(sideSheetBehavior, i3, i2);
                    ViewParent parent = view3.getParent();
                    if (parent != null && parent.isLayoutRequested()) {
                        WeakHashMap weakHashMap = S.f311a;
                        if (view3.isAttachedToWindow()) {
                            view3.post(pVar);
                            return true;
                        }
                    }
                    pVar.run();
                    return true;
                }
            });
        }
        final int i2 = 3;
        if (this.h != 3) {
            S.g(view, f.h, new M.t() { // from class: U0.b
                @Override // M.t
                public final boolean j(View view2) {
                    int i22 = 1;
                    SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                    sideSheetBehavior.getClass();
                    int i3 = i2;
                    if (i3 == 1 || i3 == 2) {
                        StringBuilder sb = new StringBuilder("STATE_");
                        sb.append(i3 == 1 ? "DRAGGING" : "SETTLING");
                        sb.append(" should not be set externally.");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    WeakReference weakReference2 = sideSheetBehavior.f1982p;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.r(i3);
                        return true;
                    }
                    View view3 = (View) sideSheetBehavior.f1982p.get();
                    p pVar = new p(sideSheetBehavior, i3, i22);
                    ViewParent parent = view3.getParent();
                    if (parent != null && parent.isLayoutRequested()) {
                        WeakHashMap weakHashMap = S.f311a;
                        if (view3.isAttachedToWindow()) {
                            view3.post(pVar);
                            return true;
                        }
                    }
                    pVar.run();
                    return true;
                }
            });
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.f1973e = new j(this);
        this.f1975g = true;
        this.h = 5;
        this.f1977k = 0.1f;
        this.f1984r = -1;
        this.f1987u = new LinkedHashSet();
        this.f1988v = new D0.e(this, 1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0373a.f4144A);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f1972c = i.x(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.d = k.b(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.f1984r = resourceId;
            WeakReference weakReference = this.f1983q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f1983q = null;
            WeakReference weakReference2 = this.f1982p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = S.f311a;
                    if (view.isLaidOut()) {
                        view.requestLayout();
                    }
                }
            }
        }
        k kVar = this.d;
        if (kVar != null) {
            g gVar = new g(kVar);
            this.f1971b = gVar;
            gVar.h(context);
            ColorStateList colorStateList = this.f1972c;
            if (colorStateList != null) {
                this.f1971b.j(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f1971b.setTint(typedValue.data);
            }
        }
        this.f1974f = obtainStyledAttributes.getDimension(2, -1.0f);
        this.f1975g = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
