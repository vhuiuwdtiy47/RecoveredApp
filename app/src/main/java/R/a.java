package R;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f602a;

    /* renamed from: b, reason: collision with root package name */
    public int f603b;

    /* renamed from: c, reason: collision with root package name */
    public float f604c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public long f605e;

    /* renamed from: f, reason: collision with root package name */
    public long f606f;

    /* renamed from: g, reason: collision with root package name */
    public long f607g;
    public float h;
    public int i;

    public final float a(long j2) {
        long j3 = this.f605e;
        if (j2 < j3) {
            return 0.0f;
        }
        long j4 = this.f607g;
        if (j4 < 0 || j2 < j4) {
            return g.b(((float) (j2 - j3)) / this.f602a, 0.0f, 1.0f) * 0.5f;
        }
        float f2 = this.h;
        return (g.b(((float) (j2 - j4)) / this.i, 0.0f, 1.0f) * f2) + (1.0f - f2);
    }
}
