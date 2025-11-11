package r;

import C.j;
import M0.n;
import java.util.Arrays;

/* renamed from: r.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0318d extends C0316b {

    /* renamed from: f, reason: collision with root package name */
    public C0320f[] f3569f;

    /* renamed from: g, reason: collision with root package name */
    public C0320f[] f3570g;
    public int h;
    public j i;

    @Override // r.C0316b
    public final C0320f d(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.h; i2++) {
            C0320f[] c0320fArr = this.f3569f;
            C0320f c0320f = c0320fArr[i2];
            if (!zArr[c0320f.f3573b]) {
                j jVar = this.i;
                jVar.f60b = c0320f;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f2 = ((C0320f) jVar.f60b).h[i3];
                        if (f2 <= 0.0f) {
                            if (f2 < 0.0f) {
                                i = i2;
                                break;
                            }
                            i3--;
                        }
                    }
                } else {
                    C0320f c0320f2 = c0320fArr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f3 = c0320f2.h[i3];
                            float f4 = ((C0320f) jVar.f60b).h[i3];
                            if (f4 == f3) {
                                i3--;
                            } else if (f4 >= f3) {
                            }
                        }
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f3569f[i];
    }

    @Override // r.C0316b
    public final boolean e() {
        return this.h == 0;
    }

    @Override // r.C0316b
    public final void i(C0317c c0317c, C0316b c0316b, boolean z2) {
        C0320f c0320f = c0316b.f3551a;
        if (c0320f == null) {
            return;
        }
        C0315a c0315a = c0316b.d;
        int d = c0315a.d();
        for (int i = 0; i < d; i++) {
            C0320f e2 = c0315a.e(i);
            float f2 = c0315a.f(i);
            j jVar = this.i;
            jVar.f60b = e2;
            boolean z3 = e2.f3572a;
            float[] fArr = c0320f.h;
            if (z3) {
                boolean z4 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((C0320f) jVar.f60b).h;
                    float f3 = (fArr[i2] * f2) + fArr2[i2];
                    fArr2[i2] = f3;
                    if (Math.abs(f3) < 1.0E-4f) {
                        ((C0320f) jVar.f60b).h[i2] = 0.0f;
                    } else {
                        z4 = false;
                    }
                }
                if (z4) {
                    ((C0318d) jVar.f61c).k((C0320f) jVar.f60b);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f4 = fArr[i3];
                    if (f4 != 0.0f) {
                        float f5 = f4 * f2;
                        if (Math.abs(f5) < 1.0E-4f) {
                            f5 = 0.0f;
                        }
                        ((C0320f) jVar.f60b).h[i3] = f5;
                    } else {
                        ((C0320f) jVar.f60b).h[i3] = 0.0f;
                    }
                }
                j(e2);
            }
            this.f3552b = (c0316b.f3552b * f2) + this.f3552b;
        }
        k(c0320f);
    }

    public final void j(C0320f c0320f) {
        int i;
        int i2 = this.h + 1;
        C0320f[] c0320fArr = this.f3569f;
        if (i2 > c0320fArr.length) {
            C0320f[] c0320fArr2 = (C0320f[]) Arrays.copyOf(c0320fArr, c0320fArr.length * 2);
            this.f3569f = c0320fArr2;
            this.f3570g = (C0320f[]) Arrays.copyOf(c0320fArr2, c0320fArr2.length * 2);
        }
        C0320f[] c0320fArr3 = this.f3569f;
        int i3 = this.h;
        c0320fArr3[i3] = c0320f;
        int i4 = i3 + 1;
        this.h = i4;
        if (i4 > 1 && c0320fArr3[i3].f3573b > c0320f.f3573b) {
            int i5 = 0;
            while (true) {
                i = this.h;
                if (i5 >= i) {
                    break;
                }
                this.f3570g[i5] = this.f3569f[i5];
                i5++;
            }
            Arrays.sort(this.f3570g, 0, i, new n(2));
            for (int i6 = 0; i6 < this.h; i6++) {
                this.f3569f[i6] = this.f3570g[i6];
            }
        }
        c0320f.f3572a = true;
        c0320f.a(this);
    }

    public final void k(C0320f c0320f) {
        int i = 0;
        while (i < this.h) {
            if (this.f3569f[i] == c0320f) {
                while (true) {
                    int i2 = this.h;
                    if (i >= i2 - 1) {
                        this.h = i2 - 1;
                        c0320f.f3572a = false;
                        return;
                    } else {
                        C0320f[] c0320fArr = this.f3569f;
                        int i3 = i + 1;
                        c0320fArr[i] = c0320fArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // r.C0316b
    public final String toString() {
        String str = " goal -> (" + this.f3552b + ") : ";
        for (int i = 0; i < this.h; i++) {
            C0320f c0320f = this.f3569f[i];
            j jVar = this.i;
            jVar.f60b = c0320f;
            str = str + jVar + " ";
        }
        return str;
    }
}
