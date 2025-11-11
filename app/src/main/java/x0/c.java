package x0;

import android.animation.TimeInterpolator;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public long f4194a;

    /* renamed from: b, reason: collision with root package name */
    public long f4195b;

    /* renamed from: c, reason: collision with root package name */
    public TimeInterpolator f4196c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f4197e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.f4196c;
        return timeInterpolator != null ? timeInterpolator : AbstractC0375a.f4190b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f4194a == cVar.f4194a && this.f4195b == cVar.f4195b && this.d == cVar.d && this.f4197e == cVar.f4197e) {
            return a().getClass().equals(cVar.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f4194a;
        long j3 = this.f4195b;
        return ((((a().getClass().hashCode() + (((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31)) * 31) + this.d) * 31) + this.f4197e;
    }

    public final String toString() {
        return "\n" + c.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f4194a + " duration: " + this.f4195b + " interpolator: " + a().getClass() + " repeatCount: " + this.d + " repeatMode: " + this.f4197e + "}\n";
    }
}
