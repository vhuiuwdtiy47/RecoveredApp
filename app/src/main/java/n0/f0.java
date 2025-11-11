package n0;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public int f3360a;

    /* renamed from: b, reason: collision with root package name */
    public int f3361b;

    /* renamed from: c, reason: collision with root package name */
    public int f3362c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f3363e;

    public final boolean a() {
        int i = this.f3360a;
        int i2 = 2;
        if ((i & 7) != 0) {
            int i3 = this.d;
            int i4 = this.f3361b;
            if (((i3 > i4 ? 1 : i3 == i4 ? 2 : 4) & i) == 0) {
                return false;
            }
        }
        if ((i & 112) != 0) {
            int i5 = this.d;
            int i6 = this.f3362c;
            if ((((i5 > i6 ? 1 : i5 == i6 ? 2 : 4) << 4) & i) == 0) {
                return false;
            }
        }
        if ((i & 1792) != 0) {
            int i7 = this.f3363e;
            int i8 = this.f3361b;
            if ((((i7 > i8 ? 1 : i7 == i8 ? 2 : 4) << 8) & i) == 0) {
                return false;
            }
        }
        if ((i & 28672) != 0) {
            int i9 = this.f3363e;
            int i10 = this.f3362c;
            if (i9 > i10) {
                i2 = 1;
            } else if (i9 != i10) {
                i2 = 4;
            }
            if (((i2 << 12) & i) == 0) {
                return false;
            }
        }
        return true;
    }
}
