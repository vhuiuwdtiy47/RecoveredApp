package L;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class X implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f314a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f315b;

    public /* synthetic */ X(A0.c cVar, View view) {
        this.f315b = cVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f314a) {
            case 0:
                ((View) ((g.L) ((A0.c) this.f315b).f33b).h.getParent()).invalidate();
                return;
            default:
                W0.k kVar = (W0.k) this.f315b;
                kVar.getClass();
                kVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }

    public /* synthetic */ X(W0.k kVar) {
        this.f315b = kVar;
    }
}
