package n0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: n0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0282e extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ W f3345a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3346b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f3347c;
    public final /* synthetic */ int d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f3348e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0286i f3349f;

    public C0282e(C0286i c0286i, W w2, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f3349f = c0286i;
        this.f3345a = w2;
        this.f3346b = i;
        this.f3347c = view;
        this.d = i2;
        this.f3348e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f3346b;
        View view = this.f3347c;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f3348e.setListener(null);
        C0286i c0286i = this.f3349f;
        W w2 = this.f3345a;
        c0286i.c(w2);
        c0286i.f3384p.remove(w2);
        c0286i.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f3349f.getClass();
    }
}
