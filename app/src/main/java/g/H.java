package g;

/* loaded from: classes.dex */
public final class H {
    public static H d;

    /* renamed from: a, reason: collision with root package name */
    public long f2465a;

    /* renamed from: b, reason: collision with root package name */
    public long f2466b;

    /* renamed from: c, reason: collision with root package name */
    public int f2467c;

    public final void a(long j2, double d2, double d3) {
        double d4 = (0.01720197f * (((float) (j2 - 946728000000L)) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(r3 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * r3) * 3.4906598739326E-4d) + (Math.sin(d4) * 0.03341960161924362d) + d4 + 1.796593063d + 3.141592653589793d;
        double sin2 = (Math.sin(2.0d * sin) * (-0.0069d)) + (Math.sin(d4) * 0.0053d) + ((float) Math.round((r2 - 9.0E-4f) - r6)) + 9.0E-4f + ((-d3) / 360.0d);
        double asin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(sin));
        double d5 = 0.01745329238474369d * d2;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(asin) * Math.sin(d5))) / (Math.cos(asin) * Math.cos(d5));
        if (sin3 >= 1.0d) {
            this.f2467c = 1;
            this.f2465a = -1L;
            this.f2466b = -1L;
        } else {
            if (sin3 <= -1.0d) {
                this.f2467c = 0;
                this.f2465a = -1L;
                this.f2466b = -1L;
                return;
            }
            double acos = (float) (Math.acos(sin3) / 6.283185307179586d);
            this.f2465a = Math.round((sin2 + acos) * 8.64E7d) + 946728000000L;
            long round = Math.round((sin2 - acos) * 8.64E7d) + 946728000000L;
            this.f2466b = round;
            if (round >= j2 || this.f2465a <= j2) {
                this.f2467c = 1;
            } else {
                this.f2467c = 0;
            }
        }
    }
}
