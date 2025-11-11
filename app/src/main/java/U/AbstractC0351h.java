package u;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import t.C0325c;
import t.C0326d;
import t.C0327e;
import w.C0368f;

/* renamed from: u.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0351h {

    /* renamed from: a, reason: collision with root package name */
    public static final C0345b f3913a = new Object();

    public static boolean a(C0326d c0326d) {
        int[] iArr = c0326d.f3741p0;
        int i = iArr[0];
        int i2 = iArr[1];
        C0326d c0326d2 = c0326d.f3707T;
        C0327e c0327e = c0326d2 != null ? (C0327e) c0326d2 : null;
        if (c0327e != null) {
            int i3 = c0327e.f3741p0[0];
        }
        if (c0327e != null) {
            int i4 = c0327e.f3741p0[1];
        }
        boolean z2 = i == 1 || c0326d.A() || i == 2 || (i == 3 && c0326d.f3743r == 0 && c0326d.f3710W == 0.0f && c0326d.t(0)) || (i == 3 && c0326d.f3743r == 1 && c0326d.u(0, c0326d.q()));
        boolean z3 = i2 == 1 || c0326d.B() || i2 == 2 || (i2 == 3 && c0326d.f3744s == 0 && c0326d.f3710W == 0.0f && c0326d.t(1)) || (i2 == 3 && c0326d.f3744s == 1 && c0326d.u(1, c0326d.k()));
        return (c0326d.f3710W > 0.0f && (z2 || z3)) || (z2 && z3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [u.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5, types: [u.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    public static C0357n b(C0326d c0326d, int i, ArrayList arrayList, C0357n c0357n) {
        int i2;
        int i3 = i == 0 ? c0326d.f3737n0 : c0326d.f3739o0;
        if (i3 != -1 && (c0357n == 0 || i3 != c0357n.f3921b)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                C0357n c0357n2 = (C0357n) arrayList.get(i4);
                if (c0357n2.f3921b == i3) {
                    if (c0357n != 0) {
                        c0357n.c(i, c0357n2);
                        arrayList.remove((Object) c0357n);
                    }
                    c0357n = c0357n2;
                } else {
                    i4++;
                }
            }
        } else if (i3 != -1) {
            return c0357n;
        }
        C0357n c0357n3 = c0357n;
        if (c0357n == 0) {
            if (c0326d instanceof t.i) {
                t.i iVar = (t.i) c0326d;
                int i5 = 0;
                while (true) {
                    if (i5 >= iVar.r0) {
                        i2 = -1;
                        break;
                    }
                    C0326d c0326d2 = iVar.f3822q0[i5];
                    if ((i == 0 && (i2 = c0326d2.f3737n0) != -1) || (i == 1 && (i2 = c0326d2.f3739o0) != -1)) {
                        break;
                    }
                    i5++;
                }
                if (i2 != -1) {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= arrayList.size()) {
                            break;
                        }
                        C0357n c0357n4 = (C0357n) arrayList.get(i6);
                        if (c0357n4.f3921b == i2) {
                            c0357n = c0357n4;
                            break;
                        }
                        i6++;
                    }
                }
            }
            if (c0357n == 0) {
                c0357n = new Object();
                c0357n.f3920a = new ArrayList();
                c0357n.d = null;
                c0357n.f3923e = -1;
                int i7 = C0357n.f3919f;
                C0357n.f3919f = i7 + 1;
                c0357n.f3921b = i7;
                c0357n.f3922c = i;
            }
            arrayList.add(c0357n);
            c0357n3 = c0357n;
        }
        ArrayList arrayList2 = c0357n3.f3920a;
        if (arrayList2.contains(c0326d)) {
            return c0357n3;
        }
        arrayList2.add(c0326d);
        if (c0326d instanceof t.h) {
            t.h hVar = (t.h) c0326d;
            hVar.f3820t0.c(hVar.f3821u0 == 0 ? 1 : 0, arrayList, c0357n3);
        }
        int i8 = c0357n3.f3921b;
        if (i == 0) {
            c0326d.f3737n0 = i8;
            c0326d.f3696I.c(i, arrayList, c0357n3);
            c0326d.f3698K.c(i, arrayList, c0357n3);
        } else {
            c0326d.f3739o0 = i8;
            c0326d.f3697J.c(i, arrayList, c0357n3);
            c0326d.f3700M.c(i, arrayList, c0357n3);
            c0326d.f3699L.c(i, arrayList, c0357n3);
        }
        c0326d.f3703P.c(i, arrayList, c0357n3);
        return c0357n3;
    }

    /* JADX WARN: Type inference failed for: r3v11, types: [u.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6, types: [u.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v9, types: [u.b, java.lang.Object] */
    public static void c(int i, C0326d c0326d, C0368f c0368f, boolean z2) {
        C0325c c0325c;
        C0325c c0325c2;
        char c2;
        C0325c c0325c3;
        C0325c c0325c4;
        if (c0326d.f3734m) {
            return;
        }
        if (!(c0326d instanceof C0327e) && c0326d.z() && a(c0326d)) {
            C0327e.V(c0326d, c0368f, new Object());
        }
        C0325c i2 = c0326d.i(2);
        C0325c i3 = c0326d.i(4);
        int d = i2.d();
        int d2 = i3.d();
        HashSet hashSet = i2.f3683a;
        if (hashSet != null && i2.f3685c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C0325c c0325c5 = (C0325c) it.next();
                C0326d c0326d2 = c0325c5.d;
                int i4 = i + 1;
                boolean a2 = a(c0326d2);
                if (c0326d2.z() && a2) {
                    c2 = 0;
                    C0327e.V(c0326d2, c0368f, new Object());
                } else {
                    c2 = 0;
                }
                C0325c c0325c6 = c0326d2.f3696I;
                C0325c c0325c7 = c0326d2.f3698K;
                char c3 = ((c0325c5 == c0325c6 && (c0325c4 = c0325c7.f3687f) != null && c0325c4.f3685c) || (c0325c5 == c0325c7 && (c0325c3 = c0325c6.f3687f) != null && c0325c3.f3685c)) ? (char) 1 : c2;
                int i5 = c0326d2.f3741p0[c2];
                if (i5 != 3 || a2) {
                    if (!c0326d2.z()) {
                        if (c0325c5 == c0325c6 && c0325c7.f3687f == null) {
                            int e2 = c0325c6.e() + d;
                            c0326d2.J(e2, c0326d2.q() + e2);
                            c(i4, c0326d2, c0368f, z2);
                        } else if (c0325c5 == c0325c7 && c0325c6.f3687f == null) {
                            int e3 = d - c0325c7.e();
                            c0326d2.J(e3 - c0326d2.q(), e3);
                            c(i4, c0326d2, c0368f, z2);
                        } else if (c3 != 0 && !c0326d2.x()) {
                            d(i4, c0326d2, c0368f, z2);
                        }
                    }
                } else if (i5 == 3 && c0326d2.f3747v >= 0 && c0326d2.f3746u >= 0 && (c0326d2.f3725g0 == 8 || (c0326d2.f3743r == 0 && c0326d2.f3710W == 0.0f))) {
                    if (!c0326d2.x() && !c0326d2.f3694F && c3 != 0 && !c0326d2.x()) {
                        e(i4, c0326d, c0368f, c0326d2, z2);
                    }
                }
            }
        }
        if (c0326d instanceof t.h) {
            return;
        }
        HashSet hashSet2 = i3.f3683a;
        if (hashSet2 != null && i3.f3685c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C0325c c0325c8 = (C0325c) it2.next();
                C0326d c0326d3 = c0325c8.d;
                int i6 = i + 1;
                boolean a3 = a(c0326d3);
                if (c0326d3.z() && a3) {
                    C0327e.V(c0326d3, c0368f, new Object());
                }
                C0325c c0325c9 = c0326d3.f3696I;
                C0325c c0325c10 = c0326d3.f3698K;
                boolean z3 = (c0325c8 == c0325c9 && (c0325c2 = c0325c10.f3687f) != null && c0325c2.f3685c) || (c0325c8 == c0325c10 && (c0325c = c0325c9.f3687f) != null && c0325c.f3685c);
                int i7 = c0326d3.f3741p0[0];
                if (i7 != 3 || a3) {
                    if (!c0326d3.z()) {
                        if (c0325c8 == c0325c9 && c0325c10.f3687f == null) {
                            int e4 = c0325c9.e() + d2;
                            c0326d3.J(e4, c0326d3.q() + e4);
                            c(i6, c0326d3, c0368f, z2);
                        } else if (c0325c8 == c0325c10 && c0325c9.f3687f == null) {
                            int e5 = d2 - c0325c10.e();
                            c0326d3.J(e5 - c0326d3.q(), e5);
                            c(i6, c0326d3, c0368f, z2);
                        } else if (z3 && !c0326d3.x()) {
                            d(i6, c0326d3, c0368f, z2);
                        }
                    }
                } else if (i7 == 3 && c0326d3.f3747v >= 0 && c0326d3.f3746u >= 0) {
                    if (c0326d3.f3725g0 == 8 || (c0326d3.f3743r == 0 && c0326d3.f3710W == 0.0f)) {
                        if (!c0326d3.x() && !c0326d3.f3694F && z3 && !c0326d3.x()) {
                            e(i6, c0326d, c0368f, c0326d3, z2);
                        }
                    }
                }
            }
        }
        c0326d.f3734m = true;
    }

    public static void d(int i, C0326d c0326d, C0368f c0368f, boolean z2) {
        float f2 = c0326d.f3719d0;
        C0325c c0325c = c0326d.f3696I;
        int d = c0325c.f3687f.d();
        C0325c c0325c2 = c0326d.f3698K;
        int d2 = c0325c2.f3687f.d();
        int e2 = c0325c.e() + d;
        int e3 = d2 - c0325c2.e();
        if (d == d2) {
            f2 = 0.5f;
        } else {
            d = e2;
            d2 = e3;
        }
        int q2 = c0326d.q();
        int i2 = (d2 - d) - q2;
        if (d > d2) {
            i2 = (d - d2) - q2;
        }
        int i3 = ((int) (i2 > 0 ? (f2 * i2) + 0.5f : f2 * i2)) + d;
        int i4 = i3 + q2;
        if (d > d2) {
            i4 = i3 - q2;
        }
        c0326d.J(i3, i4);
        c(i + 1, c0326d, c0368f, z2);
    }

    public static void e(int i, C0326d c0326d, C0368f c0368f, C0326d c0326d2, boolean z2) {
        float f2 = c0326d2.f3719d0;
        C0325c c0325c = c0326d2.f3696I;
        int e2 = c0325c.e() + c0325c.f3687f.d();
        C0325c c0325c2 = c0326d2.f3698K;
        int d = c0325c2.f3687f.d() - c0325c2.e();
        if (d >= e2) {
            int q2 = c0326d2.q();
            if (c0326d2.f3725g0 != 8) {
                int i2 = c0326d2.f3743r;
                if (i2 == 2) {
                    q2 = (int) (c0326d2.f3719d0 * 0.5f * (c0326d instanceof C0327e ? c0326d.q() : c0326d.f3707T.q()));
                } else if (i2 == 0) {
                    q2 = d - e2;
                }
                q2 = Math.max(c0326d2.f3746u, q2);
                int i3 = c0326d2.f3747v;
                if (i3 > 0) {
                    q2 = Math.min(i3, q2);
                }
            }
            int i4 = e2 + ((int) ((f2 * ((d - e2) - q2)) + 0.5f));
            c0326d2.J(i4, q2 + i4);
            c(i + 1, c0326d2, c0368f, z2);
        }
    }

    public static void f(int i, C0326d c0326d, C0368f c0368f) {
        float f2 = c0326d.f3721e0;
        C0325c c0325c = c0326d.f3697J;
        int d = c0325c.f3687f.d();
        C0325c c0325c2 = c0326d.f3699L;
        int d2 = c0325c2.f3687f.d();
        int e2 = c0325c.e() + d;
        int e3 = d2 - c0325c2.e();
        if (d == d2) {
            f2 = 0.5f;
        } else {
            d = e2;
            d2 = e3;
        }
        int k2 = c0326d.k();
        int i2 = (d2 - d) - k2;
        if (d > d2) {
            i2 = (d - d2) - k2;
        }
        int i3 = (int) (i2 > 0 ? (f2 * i2) + 0.5f : f2 * i2);
        int i4 = d + i3;
        int i5 = i4 + k2;
        if (d > d2) {
            i4 = d - i3;
            i5 = i4 - k2;
        }
        c0326d.K(i4, i5);
        i(i + 1, c0326d, c0368f);
    }

    public static void g(int i, C0326d c0326d, C0368f c0368f, C0326d c0326d2) {
        float f2 = c0326d2.f3721e0;
        C0325c c0325c = c0326d2.f3697J;
        int e2 = c0325c.e() + c0325c.f3687f.d();
        C0325c c0325c2 = c0326d2.f3699L;
        int d = c0325c2.f3687f.d() - c0325c2.e();
        if (d >= e2) {
            int k2 = c0326d2.k();
            if (c0326d2.f3725g0 != 8) {
                int i2 = c0326d2.f3744s;
                if (i2 == 2) {
                    k2 = (int) (f2 * 0.5f * (c0326d instanceof C0327e ? c0326d.k() : c0326d.f3707T.k()));
                } else if (i2 == 0) {
                    k2 = d - e2;
                }
                k2 = Math.max(c0326d2.f3749x, k2);
                int i3 = c0326d2.f3750y;
                if (i3 > 0) {
                    k2 = Math.min(i3, k2);
                }
            }
            int i4 = e2 + ((int) ((f2 * ((d - e2) - k2)) + 0.5f));
            c0326d2.K(i4, k2 + i4);
            i(i + 1, c0326d2, c0368f);
        }
    }

    public static boolean h(int i, int i2, int i3, int i4) {
        return (i3 == 1 || i3 == 2 || (i3 == 4 && i != 2)) || (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2));
    }

    /* JADX WARN: Type inference failed for: r15v2, types: [u.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [u.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v10, types: [u.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7, types: [u.b, java.lang.Object] */
    public static void i(int i, C0326d c0326d, C0368f c0368f) {
        boolean z2;
        C0325c c0325c;
        C0325c c0325c2;
        C0325c c0325c3;
        C0325c c0325c4;
        if (c0326d.f3736n) {
            return;
        }
        if (!(c0326d instanceof C0327e) && c0326d.z() && a(c0326d)) {
            C0327e.V(c0326d, c0368f, new Object());
        }
        C0325c i2 = c0326d.i(3);
        C0325c i3 = c0326d.i(5);
        int d = i2.d();
        int d2 = i3.d();
        HashSet hashSet = i2.f3683a;
        if (hashSet != null && i2.f3685c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C0325c c0325c5 = (C0325c) it.next();
                C0326d c0326d2 = c0325c5.d;
                int i4 = i + 1;
                boolean a2 = a(c0326d2);
                if (c0326d2.z() && a2) {
                    C0327e.V(c0326d2, c0368f, new Object());
                }
                C0325c c0325c6 = c0326d2.f3697J;
                C0325c c0325c7 = c0326d2.f3699L;
                boolean z3 = (c0325c5 == c0325c6 && (c0325c4 = c0325c7.f3687f) != null && c0325c4.f3685c) || (c0325c5 == c0325c7 && (c0325c3 = c0325c6.f3687f) != null && c0325c3.f3685c);
                int i5 = c0326d2.f3741p0[1];
                if (i5 != 3 || a2) {
                    if (!c0326d2.z()) {
                        if (c0325c5 == c0325c6 && c0325c7.f3687f == null) {
                            int e2 = c0325c6.e() + d;
                            c0326d2.K(e2, c0326d2.k() + e2);
                            i(i4, c0326d2, c0368f);
                        } else if (c0325c5 == c0325c7 && c0325c6.f3687f == null) {
                            int e3 = d - c0325c7.e();
                            c0326d2.K(e3 - c0326d2.k(), e3);
                            i(i4, c0326d2, c0368f);
                        } else if (z3 && !c0326d2.y()) {
                            f(i4, c0326d2, c0368f);
                        }
                    }
                } else if (i5 == 3 && c0326d2.f3750y >= 0 && c0326d2.f3749x >= 0 && (c0326d2.f3725g0 == 8 || (c0326d2.f3744s == 0 && c0326d2.f3710W == 0.0f))) {
                    if (!c0326d2.y() && !c0326d2.f3694F && z3 && !c0326d2.y()) {
                        g(i4, c0326d, c0368f, c0326d2);
                    }
                }
            }
        }
        boolean z4 = true;
        z4 = true;
        z4 = true;
        if (c0326d instanceof t.h) {
            return;
        }
        HashSet hashSet2 = i3.f3683a;
        if (hashSet2 != null && i3.f3685c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C0325c c0325c8 = (C0325c) it2.next();
                C0326d c0326d3 = c0325c8.d;
                int i6 = i + 1;
                boolean a3 = a(c0326d3);
                if (c0326d3.z() && a3) {
                    C0327e.V(c0326d3, c0368f, new Object());
                }
                C0325c c0325c9 = c0326d3.f3697J;
                C0325c c0325c10 = c0326d3.f3699L;
                boolean z5 = (c0325c8 == c0325c9 && (c0325c2 = c0325c10.f3687f) != null && c0325c2.f3685c) || (c0325c8 == c0325c10 && (c0325c = c0325c9.f3687f) != null && c0325c.f3685c);
                int i7 = c0326d3.f3741p0[1];
                if (i7 != 3 || a3) {
                    if (!c0326d3.z()) {
                        if (c0325c8 == c0325c9 && c0325c10.f3687f == null) {
                            int e4 = c0325c9.e() + d2;
                            c0326d3.K(e4, c0326d3.k() + e4);
                            i(i6, c0326d3, c0368f);
                        } else if (c0325c8 == c0325c10 && c0325c9.f3687f == null) {
                            int e5 = d2 - c0325c10.e();
                            c0326d3.K(e5 - c0326d3.k(), e5);
                            i(i6, c0326d3, c0368f);
                        } else if (z5 && !c0326d3.y()) {
                            f(i6, c0326d3, c0368f);
                        }
                    }
                } else if (i7 == 3 && c0326d3.f3750y >= 0 && c0326d3.f3749x >= 0 && (c0326d3.f3725g0 == 8 || (c0326d3.f3744s == 0 && c0326d3.f3710W == 0.0f))) {
                    if (!c0326d3.y() && !c0326d3.f3694F && z5 && !c0326d3.y()) {
                        g(i6, c0326d, c0368f, c0326d3);
                    }
                }
            }
        }
        C0325c i8 = c0326d.i(6);
        if (i8.f3683a != null && i8.f3685c) {
            int d3 = i8.d();
            Iterator it3 = i8.f3683a.iterator();
            while (it3.hasNext()) {
                C0325c c0325c11 = (C0325c) it3.next();
                C0326d c0326d4 = c0325c11.d;
                int i9 = i + 1;
                boolean a4 = a(c0326d4);
                if (c0326d4.z() && a4) {
                    C0327e.V(c0326d4, c0368f, new Object());
                }
                if (c0326d4.f3741p0[z4 ? 1 : 0] != 3 || a4) {
                    if (!c0326d4.z()) {
                        C0325c c0325c12 = c0326d4.f3700M;
                        if (c0325c11 == c0325c12) {
                            int e6 = c0325c11.e() + d3;
                            if (c0326d4.f3693E) {
                                int i10 = e6 - c0326d4.f3715a0;
                                int i11 = c0326d4.f3709V + i10;
                                c0326d4.f3713Z = i10;
                                c0326d4.f3697J.l(i10);
                                c0326d4.f3699L.l(i11);
                                c0325c12.l(e6);
                                z2 = z4 ? 1 : 0;
                                c0326d4.f3732l = z2;
                            } else {
                                z2 = z4 ? 1 : 0;
                            }
                            i(i9, c0326d4, c0368f);
                            z4 = z2;
                        }
                    }
                }
                z2 = z4 ? 1 : 0;
                z4 = z2;
            }
        }
        c0326d.f3736n = z4;
    }
}
