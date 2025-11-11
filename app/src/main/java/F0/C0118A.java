package f0;

/* renamed from: f0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0118A {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2258a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2259b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2260c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2261e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2262f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2263g;
    public final int h;
    public final int i;

    public C0118A(boolean z2, boolean z3, int i, boolean z4, boolean z5, int i2, int i3, int i4, int i5) {
        this.f2258a = z2;
        this.f2259b = z3;
        this.f2260c = i;
        this.d = z4;
        this.f2261e = z5;
        this.f2262f = i2;
        this.f2263g = i3;
        this.h = i4;
        this.i = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0118A)) {
            return false;
        }
        C0118A c0118a = (C0118A) obj;
        return this.f2258a == c0118a.f2258a && this.f2259b == c0118a.f2259b && this.f2260c == c0118a.f2260c && this.d == c0118a.d && this.f2261e == c0118a.f2261e && this.f2262f == c0118a.f2262f && this.f2263g == c0118a.f2263g && this.h == c0118a.h && this.i == c0118a.i;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f2258a ? 1 : 0) * 31) + (this.f2259b ? 1 : 0)) * 31) + this.f2260c) * 923521) + (this.d ? 1 : 0)) * 31) + (this.f2261e ? 1 : 0)) * 31) + this.f2262f) * 31) + this.f2263g) * 31) + this.h) * 31) + this.i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C0118A.class.getSimpleName());
        sb.append("(");
        if (this.f2258a) {
            sb.append("launchSingleTop ");
        }
        if (this.f2259b) {
            sb.append("restoreState ");
        }
        int i = this.i;
        int i2 = this.h;
        int i3 = this.f2263g;
        int i4 = this.f2262f;
        if (i4 != -1 || i3 != -1 || i2 != -1 || i != -1) {
            sb.append("anim(enterAnim=0x");
            sb.append(Integer.toHexString(i4));
            sb.append(" exitAnim=0x");
            sb.append(Integer.toHexString(i3));
            sb.append(" popEnterAnim=0x");
            sb.append(Integer.toHexString(i2));
            sb.append(" popExitAnim=0x");
            sb.append(Integer.toHexString(i));
            sb.append(")");
        }
        String sb2 = sb.toString();
        q1.d.d(sb2, "toString(...)");
        return sb2;
    }
}
