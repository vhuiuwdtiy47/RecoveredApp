package y1;

/* loaded from: classes.dex */
public final class b extends z1.a {

    /* renamed from: c, reason: collision with root package name */
    public Object[] f4221c;
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public long f4222e;

    /* renamed from: f, reason: collision with root package name */
    public int f4223f;

    public final long a() {
        return Math.min(this.f4222e, this.d);
    }

    public final Object[] b(Object[] objArr, int i, int i2) {
        if (i2 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i2];
        this.f4221c = objArr2;
        if (objArr != null) {
            long a2 = a();
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = (int) (i3 + a2);
                objArr2[i4 & (i2 - 1)] = objArr[(objArr.length - 1) & i4];
            }
        }
        return objArr2;
    }
}
