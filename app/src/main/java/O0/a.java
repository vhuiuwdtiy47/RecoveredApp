package O0;

import android.animation.ValueAnimator;

/* loaded from: classes.dex */
public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f503a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f504b;

    public a(c cVar, float f2) {
        this.f504b = cVar;
        this.f503a = f2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f504b.e(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f503a);
    }
}
