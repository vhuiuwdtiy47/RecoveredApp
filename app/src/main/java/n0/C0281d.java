package n0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: n0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0281d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3334a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W f3335b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f3336c;
    public final /* synthetic */ ViewPropertyAnimator d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0286i f3337e;

    public C0281d(C0286i c0286i, W w2, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f3337e = c0286i;
        this.f3335b = w2;
        this.d = viewPropertyAnimator;
        this.f3336c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f3334a) {
            case 1:
                this.f3336c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f3334a) {
            case 0:
                this.d.setListener(null);
                this.f3336c.setAlpha(1.0f);
                C0286i c0286i = this.f3337e;
                W w2 = this.f3335b;
                c0286i.c(w2);
                c0286i.f3385q.remove(w2);
                c0286i.i();
                return;
            default:
                this.d.setListener(null);
                C0286i c0286i2 = this.f3337e;
                W w3 = this.f3335b;
                c0286i2.c(w3);
                c0286i2.f3383o.remove(w3);
                c0286i2.i();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f3334a) {
            case 0:
                this.f3337e.getClass();
                return;
            default:
                this.f3337e.getClass();
                return;
        }
    }

    public C0281d(C0286i c0286i, W w2, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f3337e = c0286i;
        this.f3335b = w2;
        this.f3336c = view;
        this.d = viewPropertyAnimator;
    }
}
