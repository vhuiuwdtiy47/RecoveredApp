package com.google.android.material.transformation;

import L.S;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import y.AbstractC0376a;

@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends AbstractC0376a {
    public ExpandableBehavior() {
    }

    @Override // y.AbstractC0376a
    public abstract void b(View view);

    @Override // y.AbstractC0376a
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        view2.getClass();
        throw new ClassCastException();
    }

    @Override // y.AbstractC0376a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = S.f311a;
        if (!view.isLaidOut()) {
            ArrayList j2 = coordinatorLayout.j(view);
            int size = j2.size();
            for (int i2 = 0; i2 < size; i2++) {
                b(view);
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
