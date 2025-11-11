package r;

import C.j;
import L.C0016l;
import java.util.Arrays;
import t.C0325c;

/* renamed from: r.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0317c {

    /* renamed from: q, reason: collision with root package name */
    public static boolean f3555q;
    public final C0318d d;

    /* renamed from: m, reason: collision with root package name */
    public final C0016l f3565m;

    /* renamed from: p, reason: collision with root package name */
    public C0316b f3568p;

    /* renamed from: a, reason: collision with root package name */
    public int f3556a = 1000;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3557b = false;

    /* renamed from: c, reason: collision with root package name */
    public int f3558c = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f3559e = 32;

    /* renamed from: f, reason: collision with root package name */
    public int f3560f = 32;
    public boolean h = false;
    public boolean[] i = new boolean[32];

    /* renamed from: j, reason: collision with root package name */
    public int f3562j = 1;

    /* renamed from: k, reason: collision with root package name */
    public int f3563k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f3564l = 32;

    /* renamed from: n, reason: collision with root package name */
    public C0320f[] f3566n = new C0320f[1000];

    /* renamed from: o, reason: collision with root package name */
    public int f3567o = 0;

    /* renamed from: g, reason: collision with root package name */
    public C0316b[] f3561g = new C0316b[32];

    /* JADX WARN: Type inference failed for: r2v2, types: [r.b, r.d] */
    public C0317c() {
        s();
        C0016l c0016l = new C0016l();
        c0016l.f361b = new K.b();
        c0016l.f362c = new K.b();
        c0016l.d = new C0320f[32];
        this.f3565m = c0016l;
        ?? c0316b = new C0316b(c0016l);
        c0316b.f3569f = new C0320f[128];
        c0316b.f3570g = new C0320f[128];
        c0316b.h = 0;
        c0316b.i = new j((C0318d) c0316b);
        this.d = c0316b;
        this.f3568p = new C0316b(c0016l);
    }

    public static int n(Object obj) {
        C0320f c0320f = ((C0325c) obj).i;
        if (c0320f != null) {
            return (int) (c0320f.f3575e + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final C0320f a(int i) {
        K.b bVar = (K.b) this.f3565m.f362c;
        int i2 = bVar.f300b;
        C0320f c0320f = null;
        if (i2 > 0) {
            int i3 = i2 - 1;
            ?? r3 = bVar.f299a;
            ?? r4 = r3[i3];
            r3[i3] = 0;
            bVar.f300b = i3;
            c0320f = r4;
        }
        C0320f c0320f2 = c0320f;
        if (c0320f2 == null) {
            c0320f2 = new C0320f(i);
            c0320f2.f3580l = i;
        } else {
            c0320f2.c();
            c0320f2.f3580l = i;
        }
        int i4 = this.f3567o;
        int i5 = this.f3556a;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            this.f3556a = i6;
            this.f3566n = (C0320f[]) Arrays.copyOf(this.f3566n, i6);
        }
        C0320f[] c0320fArr = this.f3566n;
        int i7 = this.f3567o;
        this.f3567o = i7 + 1;
        c0320fArr[i7] = c0320f2;
        return c0320f2;
    }

    public final void b(C0320f c0320f, C0320f c0320f2, int i, float f2, C0320f c0320f3, C0320f c0320f4, int i2, int i3) {
        C0316b l2 = l();
        if (c0320f2 == c0320f3) {
            l2.d.g(c0320f, 1.0f);
            l2.d.g(c0320f4, 1.0f);
            l2.d.g(c0320f2, -2.0f);
        } else if (f2 == 0.5f) {
            l2.d.g(c0320f, 1.0f);
            l2.d.g(c0320f2, -1.0f);
            l2.d.g(c0320f3, -1.0f);
            l2.d.g(c0320f4, 1.0f);
            if (i > 0 || i2 > 0) {
                l2.f3552b = (-i) + i2;
            }
        } else if (f2 <= 0.0f) {
            l2.d.g(c0320f, -1.0f);
            l2.d.g(c0320f2, 1.0f);
            l2.f3552b = i;
        } else if (f2 >= 1.0f) {
            l2.d.g(c0320f4, -1.0f);
            l2.d.g(c0320f3, 1.0f);
            l2.f3552b = -i2;
        } else {
            float f3 = 1.0f - f2;
            l2.d.g(c0320f, f3 * 1.0f);
            l2.d.g(c0320f2, f3 * (-1.0f));
            l2.d.g(c0320f3, (-1.0f) * f2);
            l2.d.g(c0320f4, 1.0f * f2);
            if (i > 0 || i2 > 0) {
                l2.f3552b = (i2 * f2) + ((-i) * f3);
            }
        }
        if (i3 != 8) {
            l2.a(this, i3);
        }
        c(l2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d3, code lost:
    
        if (r4.f3579k <= 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d6, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00e0, code lost:
    
        if (r4.f3579k <= 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00f5, code lost:
    
        if (r4.f3579k <= 1) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00f8, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0102, code lost:
    
        if (r4.f3579k <= 1) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(r.C0316b r18) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r.C0317c.c(r.b):void");
    }

    public final void d(C0320f c0320f, int i) {
        int i2 = c0320f.f3574c;
        if (i2 == -1) {
            c0320f.d(this, i);
            for (int i3 = 0; i3 < this.f3558c + 1; i3++) {
                C0320f c0320f2 = ((C0320f[]) this.f3565m.d)[i3];
            }
            return;
        }
        if (i2 == -1) {
            C0316b l2 = l();
            l2.f3551a = c0320f;
            float f2 = i;
            c0320f.f3575e = f2;
            l2.f3552b = f2;
            l2.f3554e = true;
            c(l2);
            return;
        }
        C0316b c0316b = this.f3561g[i2];
        if (c0316b.f3554e) {
            c0316b.f3552b = i;
            return;
        }
        if (c0316b.d.d() == 0) {
            c0316b.f3554e = true;
            c0316b.f3552b = i;
            return;
        }
        C0316b l3 = l();
        if (i < 0) {
            l3.f3552b = i * (-1);
            l3.d.g(c0320f, 1.0f);
        } else {
            l3.f3552b = i;
            l3.d.g(c0320f, -1.0f);
        }
        c(l3);
    }

    public final void e(C0320f c0320f, C0320f c0320f2, int i, int i2) {
        if (i2 == 8 && c0320f2.f3576f && c0320f.f3574c == -1) {
            c0320f.d(this, c0320f2.f3575e + i);
            return;
        }
        C0316b l2 = l();
        boolean z2 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z2 = true;
            }
            l2.f3552b = i;
        }
        if (z2) {
            l2.d.g(c0320f, 1.0f);
            l2.d.g(c0320f2, -1.0f);
        } else {
            l2.d.g(c0320f, -1.0f);
            l2.d.g(c0320f2, 1.0f);
        }
        if (i2 != 8) {
            l2.a(this, i2);
        }
        c(l2);
    }

    public final void f(C0320f c0320f, C0320f c0320f2, int i, int i2) {
        C0316b l2 = l();
        C0320f m2 = m();
        m2.d = 0;
        l2.b(c0320f, c0320f2, m2, i);
        if (i2 != 8) {
            l2.d.g(j(i2), (int) (l2.d.c(m2) * (-1.0f)));
        }
        c(l2);
    }

    public final void g(C0320f c0320f, C0320f c0320f2, int i, int i2) {
        C0316b l2 = l();
        C0320f m2 = m();
        m2.d = 0;
        l2.c(c0320f, c0320f2, m2, i);
        if (i2 != 8) {
            l2.d.g(j(i2), (int) (l2.d.c(m2) * (-1.0f)));
        }
        c(l2);
    }

    public final void h(C0316b c0316b) {
        int i;
        if (c0316b.f3554e) {
            c0316b.f3551a.d(this, c0316b.f3552b);
        } else {
            C0316b[] c0316bArr = this.f3561g;
            int i2 = this.f3563k;
            c0316bArr[i2] = c0316b;
            C0320f c0320f = c0316b.f3551a;
            c0320f.f3574c = i2;
            this.f3563k = i2 + 1;
            c0320f.e(this, c0316b);
        }
        if (this.f3557b) {
            int i3 = 0;
            while (i3 < this.f3563k) {
                if (this.f3561g[i3] == null) {
                    System.out.println("WTF");
                }
                C0316b c0316b2 = this.f3561g[i3];
                if (c0316b2 != null && c0316b2.f3554e) {
                    c0316b2.f3551a.d(this, c0316b2.f3552b);
                    ((K.b) this.f3565m.f361b).b(c0316b2);
                    this.f3561g[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.f3563k;
                        if (i4 >= i) {
                            break;
                        }
                        C0316b[] c0316bArr2 = this.f3561g;
                        int i6 = i4 - 1;
                        C0316b c0316b3 = c0316bArr2[i4];
                        c0316bArr2[i6] = c0316b3;
                        C0320f c0320f2 = c0316b3.f3551a;
                        if (c0320f2.f3574c == i4) {
                            c0320f2.f3574c = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f3561g[i5] = null;
                    }
                    this.f3563k = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f3557b = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.f3563k; i++) {
            C0316b c0316b = this.f3561g[i];
            c0316b.f3551a.f3575e = c0316b.f3552b;
        }
    }

    public final C0320f j(int i) {
        if (this.f3562j + 1 >= this.f3560f) {
            o();
        }
        C0320f a2 = a(4);
        int i2 = this.f3558c + 1;
        this.f3558c = i2;
        this.f3562j++;
        a2.f3573b = i2;
        a2.d = i;
        ((C0320f[]) this.f3565m.d)[i2] = a2;
        C0318d c0318d = this.d;
        c0318d.i.f60b = a2;
        float[] fArr = a2.h;
        Arrays.fill(fArr, 0.0f);
        fArr[a2.d] = 1.0f;
        c0318d.j(a2);
        return a2;
    }

    public final C0320f k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.f3562j + 1 >= this.f3560f) {
            o();
        }
        if (!(obj instanceof C0325c)) {
            return null;
        }
        C0325c c0325c = (C0325c) obj;
        C0320f c0320f = c0325c.i;
        if (c0320f == null) {
            c0325c.k();
            c0320f = c0325c.i;
        }
        int i = c0320f.f3573b;
        C0016l c0016l = this.f3565m;
        if (i != -1 && i <= this.f3558c && ((C0320f[]) c0016l.d)[i] != null) {
            return c0320f;
        }
        if (i != -1) {
            c0320f.c();
        }
        int i2 = this.f3558c + 1;
        this.f3558c = i2;
        this.f3562j++;
        c0320f.f3573b = i2;
        c0320f.f3580l = 1;
        ((C0320f[]) c0016l.d)[i2] = c0320f;
        return c0320f;
    }

    public final C0316b l() {
        Object obj;
        C0016l c0016l = this.f3565m;
        K.b bVar = (K.b) c0016l.f361b;
        int i = bVar.f300b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = bVar.f299a;
            obj = objArr[i2];
            objArr[i2] = null;
            bVar.f300b = i2;
        } else {
            obj = null;
        }
        C0316b c0316b = (C0316b) obj;
        if (c0316b == null) {
            return new C0316b(c0016l);
        }
        c0316b.f3551a = null;
        c0316b.d.b();
        c0316b.f3552b = 0.0f;
        c0316b.f3554e = false;
        return c0316b;
    }

    public final C0320f m() {
        if (this.f3562j + 1 >= this.f3560f) {
            o();
        }
        C0320f a2 = a(3);
        int i = this.f3558c + 1;
        this.f3558c = i;
        this.f3562j++;
        a2.f3573b = i;
        ((C0320f[]) this.f3565m.d)[i] = a2;
        return a2;
    }

    public final void o() {
        int i = this.f3559e * 2;
        this.f3559e = i;
        this.f3561g = (C0316b[]) Arrays.copyOf(this.f3561g, i);
        C0016l c0016l = this.f3565m;
        c0016l.d = (C0320f[]) Arrays.copyOf((C0320f[]) c0016l.d, this.f3559e);
        int i2 = this.f3559e;
        this.i = new boolean[i2];
        this.f3560f = i2;
        this.f3564l = i2;
    }

    public final void p() {
        C0318d c0318d = this.d;
        if (c0318d.e()) {
            i();
            return;
        }
        if (!this.h) {
            q(c0318d);
            return;
        }
        for (int i = 0; i < this.f3563k; i++) {
            if (!this.f3561g[i].f3554e) {
                q(c0318d);
                return;
            }
        }
        i();
    }

    public final void q(C0318d c0318d) {
        int i = 0;
        while (true) {
            if (i >= this.f3563k) {
                break;
            }
            C0316b c0316b = this.f3561g[i];
            int i2 = 1;
            if (c0316b.f3551a.f3580l != 1) {
                float f2 = 0.0f;
                if (c0316b.f3552b < 0.0f) {
                    boolean z2 = false;
                    int i3 = 0;
                    while (!z2) {
                        i3 += i2;
                        float f3 = Float.MAX_VALUE;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < this.f3563k) {
                            C0316b c0316b2 = this.f3561g[i6];
                            if (c0316b2.f3551a.f3580l != i2 && !c0316b2.f3554e && c0316b2.f3552b < f2) {
                                int d = c0316b2.d.d();
                                int i8 = 0;
                                while (i8 < d) {
                                    C0320f e2 = c0316b2.d.e(i8);
                                    float c2 = c0316b2.d.c(e2);
                                    if (c2 > f2) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f4 = e2.f3577g[i9] / c2;
                                            if ((f4 < f3 && i9 == i7) || i9 > i7) {
                                                i7 = i9;
                                                i5 = e2.f3573b;
                                                i4 = i6;
                                                f3 = f4;
                                            }
                                        }
                                    }
                                    i8++;
                                    f2 = 0.0f;
                                }
                            }
                            i6++;
                            f2 = 0.0f;
                            i2 = 1;
                        }
                        if (i4 != -1) {
                            C0316b c0316b3 = this.f3561g[i4];
                            c0316b3.f3551a.f3574c = -1;
                            c0316b3.g(((C0320f[]) this.f3565m.d)[i5]);
                            C0320f c0320f = c0316b3.f3551a;
                            c0320f.f3574c = i4;
                            c0320f.e(this, c0316b3);
                        } else {
                            z2 = true;
                        }
                        if (i3 > this.f3562j / 2) {
                            z2 = true;
                        }
                        f2 = 0.0f;
                        i2 = 1;
                    }
                }
            }
            i++;
        }
        r(c0318d);
        i();
    }

    public final void r(C0316b c0316b) {
        boolean z2;
        int i = 0;
        for (int i2 = 0; i2 < this.f3562j; i2++) {
            this.i[i2] = false;
        }
        boolean z3 = false;
        int i3 = 0;
        while (!z3) {
            int i4 = 1;
            i3++;
            if (i3 >= this.f3562j * 2) {
                return;
            }
            C0320f c0320f = c0316b.f3551a;
            if (c0320f != null) {
                this.i[c0320f.f3573b] = true;
            }
            C0320f d = c0316b.d(this.i);
            if (d != null) {
                boolean[] zArr = this.i;
                int i5 = d.f3573b;
                if (zArr[i5]) {
                    return;
                } else {
                    zArr[i5] = true;
                }
            }
            if (d != null) {
                float f2 = Float.MAX_VALUE;
                int i6 = i;
                int i7 = -1;
                while (i6 < this.f3563k) {
                    C0316b c0316b2 = this.f3561g[i6];
                    if (c0316b2.f3551a.f3580l != i4 && !c0316b2.f3554e) {
                        C0315a c0315a = c0316b2.d;
                        int i8 = c0315a.h;
                        if (i8 != -1) {
                            for (int i9 = 0; i8 != -1 && i9 < c0315a.f3544a; i9++) {
                                if (c0315a.f3547e[i8] == d.f3573b) {
                                    z2 = true;
                                    break;
                                }
                                i8 = c0315a.f3548f[i8];
                            }
                        }
                        z2 = false;
                        if (z2) {
                            float c2 = c0316b2.d.c(d);
                            if (c2 < 0.0f) {
                                float f3 = (-c0316b2.f3552b) / c2;
                                if (f3 < f2) {
                                    f2 = f3;
                                    i7 = i6;
                                }
                            }
                        }
                    }
                    i6++;
                    i4 = 1;
                }
                if (i7 > -1) {
                    C0316b c0316b3 = this.f3561g[i7];
                    c0316b3.f3551a.f3574c = -1;
                    c0316b3.g(d);
                    C0320f c0320f2 = c0316b3.f3551a;
                    c0320f2.f3574c = i7;
                    c0320f2.e(this, c0316b3);
                }
            } else {
                z3 = true;
            }
            i = 0;
        }
    }

    public final void s() {
        for (int i = 0; i < this.f3563k; i++) {
            C0316b c0316b = this.f3561g[i];
            if (c0316b != null) {
                ((K.b) this.f3565m.f361b).b(c0316b);
            }
            this.f3561g[i] = null;
        }
    }

    public final void t() {
        C0016l c0016l;
        int i = 0;
        while (true) {
            c0016l = this.f3565m;
            C0320f[] c0320fArr = (C0320f[]) c0016l.d;
            if (i >= c0320fArr.length) {
                break;
            }
            C0320f c0320f = c0320fArr[i];
            if (c0320f != null) {
                c0320f.c();
            }
            i++;
        }
        K.b bVar = (K.b) c0016l.f362c;
        C0320f[] c0320fArr2 = this.f3566n;
        int i2 = this.f3567o;
        bVar.getClass();
        if (i2 > c0320fArr2.length) {
            i2 = c0320fArr2.length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            C0320f c0320f2 = c0320fArr2[i3];
            int i4 = bVar.f300b;
            Object[] objArr = bVar.f299a;
            if (i4 < objArr.length) {
                objArr[i4] = c0320f2;
                bVar.f300b = i4 + 1;
            }
        }
        this.f3567o = 0;
        Arrays.fill((C0320f[]) c0016l.d, (Object) null);
        this.f3558c = 0;
        C0318d c0318d = this.d;
        c0318d.h = 0;
        c0318d.f3552b = 0.0f;
        this.f3562j = 1;
        for (int i5 = 0; i5 < this.f3563k; i5++) {
            C0316b c0316b = this.f3561g[i5];
        }
        s();
        this.f3563k = 0;
        this.f3568p = new C0316b(c0016l);
    }
}
