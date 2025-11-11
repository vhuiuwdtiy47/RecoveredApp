package L;

import android.os.Build;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public h0 f353a;

    public i0(int i, Interpolator interpolator, long j2) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f353a = new g0(K0.b.i(i, interpolator, j2));
        } else {
            this.f353a = new h0(i, interpolator, j2);
        }
    }
}
