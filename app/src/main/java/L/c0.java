package L;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes.dex */
public final class c0 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f325a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f326b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f327c;

    public c0(i0 i0Var, View view) {
        this.f326b = i0Var;
        this.f327c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f325a) {
            case 0:
                ((i0) this.f326b).f353a.d(1.0f);
                e0.e((View) this.f327c);
                return;
            default:
                ((o.f) this.f326b).remove(animator);
                ((s0.l) this.f327c).f3628n.remove(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f325a) {
            case 1:
                ((s0.l) this.f327c).f3628n.add(animator);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public c0(s0.l lVar, o.f fVar) {
        this.f327c = lVar;
        this.f326b = fVar;
    }
}
