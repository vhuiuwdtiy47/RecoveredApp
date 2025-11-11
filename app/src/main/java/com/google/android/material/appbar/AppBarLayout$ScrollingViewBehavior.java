package com.google.android.material.appbar;

import L.S;
import Z0.i;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import w0.AbstractC0373a;
import y.AbstractC0376a;
import y.C0379d;
import y0.AbstractC0383a;

/* loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends AbstractC0383a {

    /* renamed from: b, reason: collision with root package name */
    public final int f1761b;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    public static void s(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
        }
    }

    @Override // y.AbstractC0376a
    public final void b(View view) {
    }

    @Override // y.AbstractC0376a
    public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        AbstractC0376a abstractC0376a = ((C0379d) view2.getLayoutParams()).f4204a;
        if (abstractC0376a instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            ((AppBarLayout$BaseBehavior) abstractC0376a).getClass();
            int i = this.f1761b;
            int l2 = bottom - (i == 0 ? 0 : i.l((int) (0.0f * i), 0, i));
            WeakHashMap weakHashMap = S.f311a;
            view.offsetTopAndBottom(l2);
        }
        return false;
    }

    @Override // y.AbstractC0376a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        int i4 = view.getLayoutParams().height;
        if (i4 != -1 && i4 != -2) {
            return false;
        }
        s(coordinatorLayout.j(view));
        return false;
    }

    @Override // y.AbstractC0376a
    public final void l(CoordinatorLayout coordinatorLayout, View view) {
        s(coordinatorLayout.j(view));
    }

    @Override // y0.AbstractC0383a
    public final void r(CoordinatorLayout coordinatorLayout, View view, int i) {
        s(coordinatorLayout.j(view));
        coordinatorLayout.q(view, i);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        new Rect();
        new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0373a.f4171y);
        this.f1761b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }
}
