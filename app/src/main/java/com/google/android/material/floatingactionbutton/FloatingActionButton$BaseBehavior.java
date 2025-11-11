package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import w0.AbstractC0373a;
import y.AbstractC0376a;
import y.C0379d;

/* loaded from: classes.dex */
public class FloatingActionButton$BaseBehavior<T> extends AbstractC0376a {
    public FloatingActionButton$BaseBehavior() {
    }

    @Override // y.AbstractC0376a
    public final boolean a(View view) {
        throw new ClassCastException();
    }

    @Override // y.AbstractC0376a
    public final void c(C0379d c0379d) {
        if (c0379d.h == 0) {
            c0379d.h = 80;
        }
    }

    @Override // y.AbstractC0376a
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        throw new ClassCastException();
    }

    @Override // y.AbstractC0376a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw new ClassCastException();
    }

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0373a.i);
        obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }
}
