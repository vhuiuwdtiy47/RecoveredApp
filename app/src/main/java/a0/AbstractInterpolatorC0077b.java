package a0;

import android.view.animation.Interpolator;

/* renamed from: a0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractInterpolatorC0077b implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f1315a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1316b;

    public AbstractInterpolatorC0077b(float[] fArr) {
        this.f1315a = fArr;
        this.f1316b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f2) {
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f1315a;
        int min = Math.min((int) ((fArr.length - 1) * f2), fArr.length - 2);
        float f3 = this.f1316b;
        float f4 = (f2 - (min * f3)) / f3;
        float f5 = fArr[min];
        return ((fArr[min + 1] - f5) * f4) + f5;
    }
}
