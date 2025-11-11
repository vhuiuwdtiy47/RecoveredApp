package L;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* loaded from: classes.dex */
public final class b0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f321a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u0 f322b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u0 f323c;
    public final /* synthetic */ int d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f324e;

    public b0(i0 i0Var, u0 u0Var, u0 u0Var2, int i, View view) {
        this.f321a = i0Var;
        this.f322b = u0Var;
        this.f323c = u0Var2;
        this.d = i;
        this.f324e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f2;
        int i;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        i0 i0Var = this.f321a;
        i0Var.f353a.d(animatedFraction);
        float b2 = i0Var.f353a.b();
        PathInterpolator pathInterpolator = e0.f335e;
        int i2 = Build.VERSION.SDK_INT;
        u0 u0Var = this.f322b;
        m0 l0Var = i2 >= 30 ? new l0(u0Var) : new k0(u0Var);
        int i3 = 1;
        while (i3 <= 256) {
            int i4 = this.d & i3;
            s0 s0Var = u0Var.f389a;
            if (i4 == 0) {
                l0Var.c(i3, s0Var.f(i3));
                f2 = b2;
                i = 1;
            } else {
                D.c f3 = s0Var.f(i3);
                D.c f4 = this.f323c.f389a.f(i3);
                float f5 = 1.0f - b2;
                int i5 = (int) (((f3.f92a - f4.f92a) * f5) + 0.5d);
                int i6 = (int) (((f3.f93b - f4.f93b) * f5) + 0.5d);
                f2 = b2;
                i = 1;
                int i7 = (int) (((f3.f94c - f4.f94c) * f5) + 0.5d);
                int i8 = (int) (((f3.d - f4.d) * f5) + 0.5d);
                int max = Math.max(0, f3.f92a - i5);
                int max2 = Math.max(0, f3.f93b - i6);
                int max3 = Math.max(0, f3.f94c - i7);
                int max4 = Math.max(0, f3.d - i8);
                if (max != i5 || max2 != i6 || max3 != i7 || max4 != i8) {
                    f3 = D.c.b(max, max2, max3, max4);
                }
                l0Var.c(i3, f3);
            }
            i3 <<= i;
            b2 = f2;
        }
        e0.g(this.f324e, l0Var.b(), Collections.singletonList(i0Var));
    }
}
