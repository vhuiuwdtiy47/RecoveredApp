package l;

/* renamed from: l.M0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0198M0 {

    /* renamed from: a, reason: collision with root package name */
    public int f2989a;

    /* renamed from: b, reason: collision with root package name */
    public int f2990b;

    /* renamed from: c, reason: collision with root package name */
    public int f2991c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f2992e;

    /* renamed from: f, reason: collision with root package name */
    public int f2993f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2994g;
    public boolean h;

    public final void a(int i, int i2) {
        this.f2991c = i;
        this.d = i2;
        this.h = true;
        if (this.f2994g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f2989a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f2990b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f2989a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f2990b = i2;
        }
    }
}
