package W0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes.dex */
public final class d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f844a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f845b;

    public /* synthetic */ d(e eVar, int i) {
        this.f844a = i;
        this.f845b = eVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f844a) {
            case 1:
                this.f845b.f898b.h(false);
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f844a) {
            case 0:
                this.f845b.f898b.h(true);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
