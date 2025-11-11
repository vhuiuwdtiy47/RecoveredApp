package com.google.android.material.behavior;

import A0.a;
import Z0.i;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.android.music.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import x0.AbstractC0375a;
import y.AbstractC0376a;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends AbstractC0376a {

    /* renamed from: b, reason: collision with root package name */
    public int f1769b;

    /* renamed from: c, reason: collision with root package name */
    public int f1770c;
    public TimeInterpolator d;

    /* renamed from: e, reason: collision with root package name */
    public TimeInterpolator f1771e;
    public ViewPropertyAnimator h;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f1768a = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public int f1772f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f1773g = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // y.AbstractC0376a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f1772f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f1769b = i.b0(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f1770c = i.b0(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.d = i.c0(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0375a.d);
        this.f1771e = i.c0(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0375a.f4191c);
        return false;
    }

    @Override // y.AbstractC0376a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        LinkedHashSet linkedHashSet = this.f1768a;
        if (i > 0) {
            if (this.f1773g == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.h;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f1773g = 1;
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            this.h = view.animate().translationY(this.f1772f).setInterpolator(this.f1771e).setDuration(this.f1770c).setListener(new a(0, this));
            return;
        }
        if (i >= 0 || this.f1773g == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.h;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.f1773g = 2;
        Iterator it2 = linkedHashSet.iterator();
        if (it2.hasNext()) {
            it2.next().getClass();
            throw new ClassCastException();
        }
        this.h = view.animate().translationY(0).setInterpolator(this.d).setDuration(this.f1769b).setListener(new a(0, this));
    }

    @Override // y.AbstractC0376a
    public boolean o(View view, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
