package n0;

/* renamed from: n0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0279b {

    /* renamed from: a, reason: collision with root package name */
    public long f3325a = 0;

    /* renamed from: b, reason: collision with root package name */
    public C0279b f3326b;

    public final void a(int i) {
        if (i < 64) {
            this.f3325a &= ~(1 << i);
            return;
        }
        C0279b c0279b = this.f3326b;
        if (c0279b != null) {
            c0279b.a(i - 64);
        }
    }

    public final int b(int i) {
        C0279b c0279b = this.f3326b;
        if (c0279b == null) {
            if (i >= 64) {
                return Long.bitCount(this.f3325a);
            }
            return Long.bitCount(((1 << i) - 1) & this.f3325a);
        }
        if (i < 64) {
            return Long.bitCount(((1 << i) - 1) & this.f3325a);
        }
        return Long.bitCount(this.f3325a) + c0279b.b(i - 64);
    }

    public final void c() {
        if (this.f3326b == null) {
            this.f3326b = new C0279b();
        }
    }

    public final boolean d(int i) {
        if (i < 64) {
            return ((1 << i) & this.f3325a) != 0;
        }
        c();
        return this.f3326b.d(i - 64);
    }

    public final void e(int i, boolean z2) {
        if (i >= 64) {
            c();
            this.f3326b.e(i - 64, z2);
            return;
        }
        long j2 = this.f3325a;
        boolean z3 = (Long.MIN_VALUE & j2) != 0;
        long j3 = (1 << i) - 1;
        this.f3325a = ((j2 & (~j3)) << 1) | (j2 & j3);
        if (z2) {
            h(i);
        } else {
            a(i);
        }
        if (z3 || this.f3326b != null) {
            c();
            this.f3326b.e(0, z3);
        }
    }

    public final boolean f(int i) {
        if (i >= 64) {
            c();
            return this.f3326b.f(i - 64);
        }
        long j2 = 1 << i;
        long j3 = this.f3325a;
        boolean z2 = (j3 & j2) != 0;
        long j4 = j3 & (~j2);
        this.f3325a = j4;
        long j5 = j2 - 1;
        this.f3325a = (j4 & j5) | Long.rotateRight((~j5) & j4, 1);
        C0279b c0279b = this.f3326b;
        if (c0279b != null) {
            if (c0279b.d(0)) {
                h(63);
            }
            this.f3326b.f(0);
        }
        return z2;
    }

    public final void g() {
        this.f3325a = 0L;
        C0279b c0279b = this.f3326b;
        if (c0279b != null) {
            c0279b.g();
        }
    }

    public final void h(int i) {
        if (i < 64) {
            this.f3325a |= 1 << i;
        } else {
            c();
            this.f3326b.h(i - 64);
        }
    }

    public final String toString() {
        if (this.f3326b == null) {
            return Long.toBinaryString(this.f3325a);
        }
        return this.f3326b.toString() + "xx" + Long.toBinaryString(this.f3325a);
    }
}
