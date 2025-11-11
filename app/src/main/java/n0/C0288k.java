package n0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: n0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0288k extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3388a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0289l f3389b;

    public C0288k(C0289l c0289l) {
        this.f3389b = c0289l;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f3388a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f3388a) {
            this.f3388a = false;
            return;
        }
        C0289l c0289l = this.f3389b;
        if (((Float) c0289l.f3416z.getAnimatedValue()).floatValue() == 0.0f) {
            c0289l.f3392A = 0;
            c0289l.f(0);
        } else {
            c0289l.f3392A = 2;
            c0289l.f3409s.invalidate();
        }
    }
}
