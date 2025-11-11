package D0;

import android.animation.ValueAnimator;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import n0.C0289l;

/* loaded from: classes.dex */
public final class c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f103a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f104b;

    public /* synthetic */ c(int i, Object obj) {
        this.f103a = i;
        this.f104b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f103a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                T0.g gVar = ((BottomSheetBehavior) this.f104b).i;
                if (gVar != null) {
                    T0.f fVar = gVar.f683a;
                    if (fVar.i != floatValue) {
                        fVar.i = floatValue;
                        gVar.f686e = true;
                        gVar.invalidateSelf();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView textView = (TextView) this.f104b;
                textView.setScaleX(floatValue2);
                textView.setScaleY(floatValue2);
                return;
            case 2:
                ((TextInputLayout) this.f104b).v0.k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                int floatValue3 = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                C0289l c0289l = (C0289l) this.f104b;
                c0289l.f3396c.setAlpha(floatValue3);
                c0289l.d.setAlpha(floatValue3);
                c0289l.f3409s.invalidate();
                return;
        }
    }
}
