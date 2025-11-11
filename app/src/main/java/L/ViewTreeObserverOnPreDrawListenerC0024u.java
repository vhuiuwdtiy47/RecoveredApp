package L;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: L.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0024u implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final View f385a;

    /* renamed from: b, reason: collision with root package name */
    public ViewTreeObserver f386b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f387c;

    public ViewTreeObserverOnPreDrawListenerC0024u(View view, Runnable runnable) {
        this.f385a = view;
        this.f386b = view.getViewTreeObserver();
        this.f387c = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ViewTreeObserverOnPreDrawListenerC0024u viewTreeObserverOnPreDrawListenerC0024u = new ViewTreeObserverOnPreDrawListenerC0024u(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0024u);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0024u);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.f386b.isAlive();
        View view = this.f385a;
        if (isAlive) {
            this.f386b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f387c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f386b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f386b.isAlive();
        View view2 = this.f385a;
        if (isAlive) {
            this.f386b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
