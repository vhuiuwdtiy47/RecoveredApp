package n0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: n0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0283f extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3356a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0284g f3357b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f3358c;
    public final /* synthetic */ View d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0286i f3359e;

    public /* synthetic */ C0283f(C0286i c0286i, C0284g c0284g, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.f3356a = i;
        this.f3359e = c0286i;
        this.f3357b = c0284g;
        this.f3358c = viewPropertyAnimator;
        this.d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f3356a) {
            case 0:
                this.f3358c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                C0284g c0284g = this.f3357b;
                W w2 = c0284g.f3364a;
                C0286i c0286i = this.f3359e;
                c0286i.c(w2);
                c0286i.f3386r.remove(c0284g.f3364a);
                c0286i.i();
                return;
            default:
                this.f3358c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                C0284g c0284g2 = this.f3357b;
                W w3 = c0284g2.f3365b;
                C0286i c0286i2 = this.f3359e;
                c0286i2.c(w3);
                c0286i2.f3386r.remove(c0284g2.f3365b);
                c0286i2.i();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f3356a) {
            case 0:
                W w2 = this.f3357b.f3364a;
                this.f3359e.getClass();
                return;
            default:
                W w3 = this.f3357b.f3365b;
                this.f3359e.getClass();
                return;
        }
    }
}
