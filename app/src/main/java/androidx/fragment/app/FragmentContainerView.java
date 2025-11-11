package androidx.fragment.app;

import D.f;
import L.E;
import L.S;
import L.u0;
import X.a;
import Y.AbstractComponentCallbacksC0056x;
import Y.B;
import Y.C0034a;
import Y.K;
import Y.Y;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.android.music.R;
import g.AbstractActivityC0146i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import q1.d;

/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1536a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1537b;

    /* renamed from: c, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f1538c;
    public boolean d;

    public FragmentContainerView(Context context) {
        super(context);
        this.f1536a = new ArrayList();
        this.f1537b = new ArrayList();
        this.d = true;
    }

    public final void a(View view) {
        if (this.f1537b.contains(view)) {
            this.f1536a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        d.e(view, "child");
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof AbstractComponentCallbacksC0056x ? (AbstractComponentCallbacksC0056x) tag : null) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        u0 u0Var;
        d.e(windowInsets, "insets");
        u0 f2 = u0.f(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f1538c;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            d.d(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            u0Var = u0.f(null, onApplyWindowInsets);
        } else {
            WeakHashMap weakHashMap = S.f311a;
            WindowInsets e2 = f2.e();
            if (e2 != null) {
                WindowInsets b2 = E.b(this, e2);
                if (!b2.equals(e2)) {
                    f2 = u0.f(this, b2);
                }
            }
            u0Var = f2;
        }
        if (!u0Var.f389a.m()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                WeakHashMap weakHashMap2 = S.f311a;
                WindowInsets e3 = u0Var.e();
                if (e3 != null) {
                    WindowInsets a2 = E.a(childAt, e3);
                    if (!a2.equals(e3)) {
                        u0.f(childAt, a2);
                    }
                }
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        d.e(canvas, "canvas");
        if (this.d) {
            Iterator it = this.f1536a.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        d.e(canvas, "canvas");
        d.e(view, "child");
        if (this.d) {
            ArrayList arrayList = this.f1536a;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j2);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        d.e(view, "view");
        this.f1537b.remove(view);
        if (this.f1536a.remove(view)) {
            this.d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends AbstractComponentCallbacksC0056x> F getFragment() {
        AbstractActivityC0146i abstractActivityC0146i;
        AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x;
        Y.S s2;
        View view = this;
        while (true) {
            abstractActivityC0146i = null;
            if (view == null) {
                abstractComponentCallbacksC0056x = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            abstractComponentCallbacksC0056x = tag instanceof AbstractComponentCallbacksC0056x ? (AbstractComponentCallbacksC0056x) tag : null;
            if (abstractComponentCallbacksC0056x != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (abstractComponentCallbacksC0056x == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof AbstractActivityC0146i) {
                    abstractActivityC0146i = (AbstractActivityC0146i) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (abstractActivityC0146i == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            s2 = ((B) abstractActivityC0146i.f2535r.f33b).h;
        } else {
            if (abstractComponentCallbacksC0056x.f1198t == null || !abstractComponentCallbacksC0056x.f1189k) {
                throw new IllegalStateException("The Fragment " + abstractComponentCallbacksC0056x + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            s2 = abstractComponentCallbacksC0056x.g();
        }
        return (F) s2.B(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        d.e(windowInsets, "insets");
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                d.d(childAt, "view");
                a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        d.e(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        d.d(childAt, "view");
        a(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        d.e(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            d.d(childAt, "view");
            a(childAt);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            d.d(childAt, "view");
            a(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean z2) {
        this.d = z2;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        d.e(onApplyWindowInsetsListener, "listener");
        this.f1538c = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        d.e(view, "view");
        if (view.getParent() == this) {
            this.f1537b.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        d.e(context, "context");
        this.f1536a = new ArrayList();
        this.f1537b = new ArrayList();
        this.d = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f955b, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, Y.S s2) {
        super(context, attributeSet);
        View view;
        d.e(context, "context");
        d.e(attributeSet, "attrs");
        d.e(s2, "fm");
        this.f1536a = new ArrayList();
        this.f1537b = new ArrayList();
        this.d = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f955b, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        AbstractComponentCallbacksC0056x B2 = s2.B(id);
        if (classAttribute != null && B2 == null) {
            if (id == -1) {
                throw new IllegalStateException(f.d("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            K E2 = s2.E();
            context.getClassLoader();
            AbstractComponentCallbacksC0056x a2 = E2.a(classAttribute);
            d.d(a2, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a2.f1201w = id;
            a2.f1202x = id;
            a2.f1203y = string;
            a2.f1197s = s2;
            a2.f1198t = s2.f1021u;
            a2.y(context, attributeSet, null);
            C0034a c0034a = new C0034a(s2);
            c0034a.f1072p = true;
            a2.f1166E = this;
            c0034a.e(getId(), a2, string, 1);
            if (!c0034a.f1065g) {
                c0034a.h = false;
                Y.S s3 = c0034a.f1073q;
                if (s3.f1021u != null && !s3.f997H) {
                    s3.x(true);
                    c0034a.a(s3.f999J, s3.f1000K);
                    s3.f1005b = true;
                    try {
                        s3.T(s3.f999J, s3.f1000K);
                        s3.d();
                        s3.e0();
                        if (s3.f998I) {
                            s3.f998I = false;
                            s3.c0();
                        }
                        ((HashMap) s3.f1006c.f791b).values().removeAll(Collections.singleton(null));
                    } catch (Throwable th) {
                        s3.d();
                        throw th;
                    }
                }
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        Iterator it = s2.f1006c.f().iterator();
        while (it.hasNext()) {
            Y y2 = (Y) it.next();
            AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x = y2.f1052c;
            if (abstractComponentCallbacksC0056x.f1202x == getId() && (view = abstractComponentCallbacksC0056x.f1167F) != null && view.getParent() == null) {
                abstractComponentCallbacksC0056x.f1166E = this;
                y2.b();
            }
        }
    }
}
