package r;

import L.C0016l;
import java.util.Arrays;

/* renamed from: r.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0315a {

    /* renamed from: b, reason: collision with root package name */
    public final C0316b f3545b;

    /* renamed from: c, reason: collision with root package name */
    public final C0016l f3546c;

    /* renamed from: a, reason: collision with root package name */
    public int f3544a = 0;
    public int d = 8;

    /* renamed from: e, reason: collision with root package name */
    public int[] f3547e = new int[8];

    /* renamed from: f, reason: collision with root package name */
    public int[] f3548f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    public float[] f3549g = new float[8];
    public int h = -1;
    public int i = -1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3550j = false;

    public C0315a(C0316b c0316b, C0016l c0016l) {
        this.f3545b = c0316b;
        this.f3546c = c0016l;
    }

    public final void a(C0320f c0320f, float f2, boolean z2) {
        if (f2 <= -0.001f || f2 >= 0.001f) {
            int i = this.h;
            C0316b c0316b = this.f3545b;
            if (i == -1) {
                this.h = 0;
                this.f3549g[0] = f2;
                this.f3547e[0] = c0320f.f3573b;
                this.f3548f[0] = -1;
                c0320f.f3579k++;
                c0320f.a(c0316b);
                this.f3544a++;
                if (this.f3550j) {
                    return;
                }
                int i2 = this.i + 1;
                this.i = i2;
                int[] iArr = this.f3547e;
                if (i2 >= iArr.length) {
                    this.f3550j = true;
                    this.i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f3544a; i4++) {
                int i5 = this.f3547e[i];
                int i6 = c0320f.f3573b;
                if (i5 == i6) {
                    float[] fArr = this.f3549g;
                    float f3 = fArr[i] + f2;
                    if (f3 > -0.001f && f3 < 0.001f) {
                        f3 = 0.0f;
                    }
                    fArr[i] = f3;
                    if (f3 == 0.0f) {
                        if (i == this.h) {
                            this.h = this.f3548f[i];
                        } else {
                            int[] iArr2 = this.f3548f;
                            iArr2[i3] = iArr2[i];
                        }
                        if (z2) {
                            c0320f.b(c0316b);
                        }
                        if (this.f3550j) {
                            this.i = i;
                        }
                        c0320f.f3579k--;
                        this.f3544a--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.f3548f[i];
            }
            int i7 = this.i;
            int i8 = i7 + 1;
            if (this.f3550j) {
                int[] iArr3 = this.f3547e;
                if (iArr3[i7] != -1) {
                    i7 = iArr3.length;
                }
            } else {
                i7 = i8;
            }
            int[] iArr4 = this.f3547e;
            if (i7 >= iArr4.length && this.f3544a < iArr4.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr5 = this.f3547e;
                    if (i9 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i9] == -1) {
                        i7 = i9;
                        break;
                    }
                    i9++;
                }
            }
            int[] iArr6 = this.f3547e;
            if (i7 >= iArr6.length) {
                i7 = iArr6.length;
                int i10 = this.d * 2;
                this.d = i10;
                this.f3550j = false;
                this.i = i7 - 1;
                this.f3549g = Arrays.copyOf(this.f3549g, i10);
                this.f3547e = Arrays.copyOf(this.f3547e, this.d);
                this.f3548f = Arrays.copyOf(this.f3548f, this.d);
            }
            this.f3547e[i7] = c0320f.f3573b;
            this.f3549g[i7] = f2;
            if (i3 != -1) {
                int[] iArr7 = this.f3548f;
                iArr7[i7] = iArr7[i3];
                iArr7[i3] = i7;
            } else {
                this.f3548f[i7] = this.h;
                this.h = i7;
            }
            c0320f.f3579k++;
            c0320f.a(c0316b);
            this.f3544a++;
            if (!this.f3550j) {
                this.i++;
            }
            int i11 = this.i;
            int[] iArr8 = this.f3547e;
            if (i11 >= iArr8.length) {
                this.f3550j = true;
                this.i = iArr8.length - 1;
            }
        }
    }

    public final void b() {
        int i = this.h;
        for (int i2 = 0; i != -1 && i2 < this.f3544a; i2++) {
            C0320f c0320f = ((C0320f[]) this.f3546c.d)[this.f3547e[i]];
            if (c0320f != null) {
                c0320f.b(this.f3545b);
            }
            i = this.f3548f[i];
        }
        this.h = -1;
        this.i = -1;
        this.f3550j = false;
        this.f3544a = 0;
    }

    public final float c(C0320f c0320f) {
        int i = this.h;
        for (int i2 = 0; i != -1 && i2 < this.f3544a; i2++) {
            if (this.f3547e[i] == c0320f.f3573b) {
                return this.f3549g[i];
            }
            i = this.f3548f[i];
        }
        return 0.0f;
    }

    public final int d() {
        return this.f3544a;
    }

    public final C0320f e(int i) {
        int i2 = this.h;
        for (int i3 = 0; i2 != -1 && i3 < this.f3544a; i3++) {
            if (i3 == i) {
                return ((C0320f[]) this.f3546c.d)[this.f3547e[i2]];
            }
            i2 = this.f3548f[i2];
        }
        return null;
    }

    public final float f(int i) {
        int i2 = this.h;
        for (int i3 = 0; i2 != -1 && i3 < this.f3544a; i3++) {
            if (i3 == i) {
                return this.f3549g[i2];
            }
            i2 = this.f3548f[i2];
        }
        return 0.0f;
    }

    public final void g(C0320f c0320f, float f2) {
        if (f2 == 0.0f) {
            h(c0320f, true);
            return;
        }
        int i = this.h;
        C0316b c0316b = this.f3545b;
        if (i == -1) {
            this.h = 0;
            this.f3549g[0] = f2;
            this.f3547e[0] = c0320f.f3573b;
            this.f3548f[0] = -1;
            c0320f.f3579k++;
            c0320f.a(c0316b);
            this.f3544a++;
            if (this.f3550j) {
                return;
            }
            int i2 = this.i + 1;
            this.i = i2;
            int[] iArr = this.f3547e;
            if (i2 >= iArr.length) {
                this.f3550j = true;
                this.i = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f3544a; i4++) {
            int i5 = this.f3547e[i];
            int i6 = c0320f.f3573b;
            if (i5 == i6) {
                this.f3549g[i] = f2;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f3548f[i];
        }
        int i7 = this.i;
        int i8 = i7 + 1;
        if (this.f3550j) {
            int[] iArr2 = this.f3547e;
            if (iArr2[i7] != -1) {
                i7 = iArr2.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr3 = this.f3547e;
        if (i7 >= iArr3.length && this.f3544a < iArr3.length) {
            int i9 = 0;
            while (true) {
                int[] iArr4 = this.f3547e;
                if (i9 >= iArr4.length) {
                    break;
                }
                if (iArr4[i9] == -1) {
                    i7 = i9;
                    break;
                }
                i9++;
            }
        }
        int[] iArr5 = this.f3547e;
        if (i7 >= iArr5.length) {
            i7 = iArr5.length;
            int i10 = this.d * 2;
            this.d = i10;
            this.f3550j = false;
            this.i = i7 - 1;
            this.f3549g = Arrays.copyOf(this.f3549g, i10);
            this.f3547e = Arrays.copyOf(this.f3547e, this.d);
            this.f3548f = Arrays.copyOf(this.f3548f, this.d);
        }
        this.f3547e[i7] = c0320f.f3573b;
        this.f3549g[i7] = f2;
        if (i3 != -1) {
            int[] iArr6 = this.f3548f;
            iArr6[i7] = iArr6[i3];
            iArr6[i3] = i7;
        } else {
            this.f3548f[i7] = this.h;
            this.h = i7;
        }
        c0320f.f3579k++;
        c0320f.a(c0316b);
        int i11 = this.f3544a + 1;
        this.f3544a = i11;
        if (!this.f3550j) {
            this.i++;
        }
        int[] iArr7 = this.f3547e;
        if (i11 >= iArr7.length) {
            this.f3550j = true;
        }
        if (this.i >= iArr7.length) {
            this.f3550j = true;
            this.i = iArr7.length - 1;
        }
    }

    public final float h(C0320f c0320f, boolean z2) {
        int i = this.h;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f3544a) {
            if (this.f3547e[i] == c0320f.f3573b) {
                if (i == this.h) {
                    this.h = this.f3548f[i];
                } else {
                    int[] iArr = this.f3548f;
                    iArr[i3] = iArr[i];
                }
                if (z2) {
                    c0320f.b(this.f3545b);
                }
                c0320f.f3579k--;
                this.f3544a--;
                this.f3547e[i] = -1;
                if (this.f3550j) {
                    this.i = i;
                }
                return this.f3549g[i];
            }
            i2++;
            i3 = i;
            i = this.f3548f[i];
        }
        return 0.0f;
    }

    public final String toString() {
        int i = this.h;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.f3544a; i2++) {
            str = (D.f.c(str, " -> ") + this.f3549g[i] + " : ") + ((C0320f[]) this.f3546c.d)[this.f3547e[i]];
            i = this.f3548f[i];
        }
        return str;
    }
}
