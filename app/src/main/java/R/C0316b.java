package r;

import L.C0016l;
import java.util.ArrayList;

/* renamed from: r.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0316b {
    public final C0315a d;

    /* renamed from: a, reason: collision with root package name */
    public C0320f f3551a = null;

    /* renamed from: b, reason: collision with root package name */
    public float f3552b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3553c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f3554e = false;

    public C0316b(C0016l c0016l) {
        this.d = new C0315a(this, c0016l);
    }

    public final void a(C0317c c0317c, int i) {
        this.d.g(c0317c.j(i), 1.0f);
        this.d.g(c0317c.j(i), -1.0f);
    }

    public final void b(C0320f c0320f, C0320f c0320f2, C0320f c0320f3, int i) {
        boolean z2 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z2 = true;
            }
            this.f3552b = i;
        }
        if (z2) {
            this.d.g(c0320f, 1.0f);
            this.d.g(c0320f2, -1.0f);
            this.d.g(c0320f3, -1.0f);
        } else {
            this.d.g(c0320f, -1.0f);
            this.d.g(c0320f2, 1.0f);
            this.d.g(c0320f3, 1.0f);
        }
    }

    public final void c(C0320f c0320f, C0320f c0320f2, C0320f c0320f3, int i) {
        boolean z2 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z2 = true;
            }
            this.f3552b = i;
        }
        if (z2) {
            this.d.g(c0320f, 1.0f);
            this.d.g(c0320f2, -1.0f);
            this.d.g(c0320f3, 1.0f);
        } else {
            this.d.g(c0320f, -1.0f);
            this.d.g(c0320f2, 1.0f);
            this.d.g(c0320f3, -1.0f);
        }
    }

    public C0320f d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.f3551a == null && this.f3552b == 0.0f && this.d.d() == 0;
    }

    public final C0320f f(boolean[] zArr, C0320f c0320f) {
        int i;
        int d = this.d.d();
        C0320f c0320f2 = null;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < d; i2++) {
            float f3 = this.d.f(i2);
            if (f3 < 0.0f) {
                C0320f e2 = this.d.e(i2);
                if ((zArr == null || !zArr[e2.f3573b]) && e2 != c0320f && (((i = e2.f3580l) == 3 || i == 4) && f3 < f2)) {
                    f2 = f3;
                    c0320f2 = e2;
                }
            }
        }
        return c0320f2;
    }

    public final void g(C0320f c0320f) {
        C0320f c0320f2 = this.f3551a;
        if (c0320f2 != null) {
            this.d.g(c0320f2, -1.0f);
            this.f3551a.f3574c = -1;
            this.f3551a = null;
        }
        float h = this.d.h(c0320f, true) * (-1.0f);
        this.f3551a = c0320f;
        if (h == 1.0f) {
            return;
        }
        this.f3552b /= h;
        C0315a c0315a = this.d;
        int i = c0315a.h;
        for (int i2 = 0; i != -1 && i2 < c0315a.f3544a; i2++) {
            float[] fArr = c0315a.f3549g;
            fArr[i] = fArr[i] / h;
            i = c0315a.f3548f[i];
        }
    }

    public final void h(C0317c c0317c, C0320f c0320f, boolean z2) {
        if (c0320f == null || !c0320f.f3576f) {
            return;
        }
        float c2 = this.d.c(c0320f);
        this.f3552b = (c0320f.f3575e * c2) + this.f3552b;
        this.d.h(c0320f, z2);
        if (z2) {
            c0320f.b(this);
        }
        if (this.d.d() == 0) {
            this.f3554e = true;
            c0317c.f3557b = true;
        }
    }

    public void i(C0317c c0317c, C0316b c0316b, boolean z2) {
        C0315a c0315a = this.d;
        c0315a.getClass();
        float c2 = c0315a.c(c0316b.f3551a);
        c0315a.h(c0316b.f3551a, z2);
        C0315a c0315a2 = c0316b.d;
        int d = c0315a2.d();
        for (int i = 0; i < d; i++) {
            C0320f e2 = c0315a2.e(i);
            c0315a.a(e2, c0315a2.c(e2) * c2, z2);
        }
        this.f3552b = (c0316b.f3552b * c2) + this.f3552b;
        if (z2) {
            c0316b.f3551a.b(this);
        }
        if (this.f3551a == null || this.d.d() != 0) {
            return;
        }
        this.f3554e = true;
        c0317c.f3557b = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r10 = this;
            r.f r0 = r10.f3551a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            r.f r1 = r10.f3551a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = D.f.c(r0, r1)
            float r1 = r10.f3552b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L39
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r10.f3552b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = r3
            goto L3a
        L39:
            r1 = r4
        L3a:
            r.a r5 = r10.d
            int r5 = r5.d()
        L40:
            if (r4 >= r5) goto La0
            r.a r6 = r10.d
            r.f r6 = r6.e(r4)
            if (r6 != 0) goto L4b
            goto L9d
        L4b:
            r.a r7 = r10.d
            float r7 = r7.f(r4)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L56
            goto L9d
        L56:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L6a
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L7a
            java.lang.String r1 = "- "
            java.lang.String r0 = D.f.c(r0, r1)
        L68:
            float r7 = r7 * r9
            goto L7a
        L6a:
            if (r8 <= 0) goto L73
            java.lang.String r1 = " + "
            java.lang.String r0 = D.f.c(r0, r1)
            goto L7a
        L73:
            java.lang.String r1 = " - "
            java.lang.String r0 = D.f.c(r0, r1)
            goto L68
        L7a:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L85
            java.lang.String r0 = D.f.c(r0, r6)
            goto L9c
        L85:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L9c:
            r1 = r3
        L9d:
            int r4 = r4 + 1
            goto L40
        La0:
            if (r1 != 0) goto La9
            java.lang.String r10 = "0.0"
            java.lang.String r10 = D.f.c(r0, r10)
            return r10
        La9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r.C0316b.toString():java.lang.String");
    }
}
