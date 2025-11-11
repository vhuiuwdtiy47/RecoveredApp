package x0;

import a0.AbstractInterpolatorC0077b;
import a0.C0076a;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: x0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0375a {

    /* renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f4189a = new LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public static final C0076a f4190b = new AbstractInterpolatorC0077b(C0076a.d);

    /* renamed from: c, reason: collision with root package name */
    public static final C0076a f4191c = new C0076a();
    public static final C0076a d = new AbstractInterpolatorC0077b(C0076a.f1314e);

    /* JADX WARN: Type inference failed for: r0v1, types: [a0.a, a0.b] */
    /* JADX WARN: Type inference failed for: r0v3, types: [a0.a, a0.b] */
    static {
        new DecelerateInterpolator();
    }

    public static float a(float f2, float f3, float f4) {
        return ((f3 - f2) * f4) + f2;
    }

    public static float b(float f2, float f3, float f4, float f5, float f6) {
        return f6 <= f4 ? f2 : f6 >= f5 ? f3 : a(f2, f3, (f6 - f4) / (f5 - f4));
    }

    public static int c(int i, int i2, float f2) {
        return Math.round(f2 * (i2 - i)) + i;
    }
}
