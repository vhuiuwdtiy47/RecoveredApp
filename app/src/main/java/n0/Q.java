package n0;

import android.util.Log;
import android.view.animation.BaseInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    public int f3273a;

    /* renamed from: b, reason: collision with root package name */
    public int f3274b;

    /* renamed from: c, reason: collision with root package name */
    public int f3275c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public BaseInterpolator f3276e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3277f;

    /* renamed from: g, reason: collision with root package name */
    public int f3278g;

    public final void a(RecyclerView recyclerView) {
        int i = this.d;
        if (i >= 0) {
            this.d = -1;
            recyclerView.M(i);
            this.f3277f = false;
            return;
        }
        if (!this.f3277f) {
            this.f3278g = 0;
            return;
        }
        BaseInterpolator baseInterpolator = this.f3276e;
        if (baseInterpolator != null && this.f3275c < 1) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        int i2 = this.f3275c;
        if (i2 < 1) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        recyclerView.f1661W.b(this.f3273a, this.f3274b, i2, baseInterpolator);
        int i3 = this.f3278g + 1;
        this.f3278g = i3;
        if (i3 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f3277f = false;
    }
}
