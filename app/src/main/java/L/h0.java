package L;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f350a;

    /* renamed from: b, reason: collision with root package name */
    public float f351b;

    /* renamed from: c, reason: collision with root package name */
    public final Interpolator f352c;
    public final long d;

    public h0(int i, Interpolator interpolator, long j2) {
        this.f350a = i;
        this.f352c = interpolator;
        this.d = j2;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f352c;
        return interpolator != null ? interpolator.getInterpolation(this.f351b) : this.f351b;
    }

    public int c() {
        return this.f350a;
    }

    public void d(float f2) {
        this.f351b = f2;
    }
}
