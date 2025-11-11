package com.google.android.material.snackbar;

import A0.c;
import Z0.f;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {
    public final f h;

    /* JADX WARN: Type inference failed for: r0v0, types: [Z0.f, java.lang.Object] */
    public BaseTransientBottomBar$Behavior() {
        ?? obj = new Object();
        this.f1777e = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f1778f = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.d = 0;
        this.h = obj;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, y.AbstractC0376a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.h.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (c.f31c == null) {
                    c.f31c = new c(12);
                }
                synchronized (c.f31c.f33b) {
                }
            }
        } else if (coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (c.f31c == null) {
                c.f31c = new c(12);
            }
            synchronized (c.f31c.f33b) {
            }
        }
        return super.f(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean r(View view) {
        this.h.getClass();
        return view instanceof V0.c;
    }
}
