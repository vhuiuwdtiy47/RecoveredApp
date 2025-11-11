package com.google.android.material.behavior;

import A0.b;
import A0.c;
import L.S;
import M.f;
import T.e;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;
import y.AbstractC0376a;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends AbstractC0376a {

    /* renamed from: a, reason: collision with root package name */
    public e f1774a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1775b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1776c;
    public int d = 2;

    /* renamed from: e, reason: collision with root package name */
    public float f1777e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public float f1778f = 0.5f;

    /* renamed from: g, reason: collision with root package name */
    public final b f1779g = new b(this);

    @Override // y.AbstractC0376a
    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z2 = this.f1775b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z2 = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f1775b = z2;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f1775b = false;
        }
        if (z2) {
            if (this.f1774a == null) {
                this.f1774a = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f1779g);
            }
            if (!this.f1776c && this.f1774a.p(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // y.AbstractC0376a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = S.f311a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            S.f(view, 1048576);
            S.d(view, 0);
            if (r(view)) {
                S.g(view, f.f410j, new c(0, this));
            }
        }
        return false;
    }

    @Override // y.AbstractC0376a
    public final boolean q(View view, MotionEvent motionEvent) {
        if (this.f1774a == null) {
            return false;
        }
        if (this.f1776c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f1774a.j(motionEvent);
        return true;
    }

    public boolean r(View view) {
        return true;
    }
}
