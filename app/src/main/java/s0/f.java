package s0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.android.music.R;

/* loaded from: classes.dex */
public final class f extends AnimatorListenerAdapter implements j {

    /* renamed from: a, reason: collision with root package name */
    public final View f3601a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3602b = false;

    public f(View view) {
        this.f3601a = view;
    }

    @Override // s0.j
    public final void a() {
        float f2;
        View view = this.f3601a;
        if (view.getVisibility() == 0) {
            c1.a aVar = u.f3649a;
            f2 = view.getTransitionAlpha();
        } else {
            f2 = 0.0f;
        }
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(f2));
    }

    @Override // s0.j
    public final void b(l lVar) {
    }

    @Override // s0.j
    public final void c(l lVar) {
    }

    @Override // s0.j
    public final void d() {
        this.f3601a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // s0.j
    public final void e(l lVar) {
    }

    @Override // s0.j
    public final void f(l lVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        c1.a aVar = u.f3649a;
        this.f3601a.setTransitionAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f3601a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f3602b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z2) {
        boolean z3 = this.f3602b;
        View view = this.f3601a;
        if (z3) {
            view.setLayerType(0, null);
        }
        if (z2) {
            return;
        }
        c1.a aVar = u.f3649a;
        view.setTransitionAlpha(1.0f);
    }
}
