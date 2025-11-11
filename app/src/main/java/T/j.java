package t;

import r.C0317c;
import r.C0320f;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean[] f3823a = new boolean[3];

    /* JADX WARN: Code restructure failed: missing block: B:162:0x028e, code lost:
    
        if (r8.d == r6) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x010c, code lost:
    
        if (r4.d == r8) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0695 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x06d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:288:0x06ec A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0116 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(t.C0327e r39, r.C0317c r40, java.util.ArrayList r41, int r42) {
        /*
            Method dump skipped, instructions count: 1787
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t.j.a(t.e, r.c, java.util.ArrayList, int):void");
    }

    public static void b(C0327e c0327e, C0317c c0317c, C0326d c0326d) {
        c0326d.f3738o = -1;
        c0326d.f3740p = -1;
        int i = c0327e.f3741p0[0];
        int[] iArr = c0326d.f3741p0;
        if (i != 2 && iArr[0] == 4) {
            C0325c c0325c = c0326d.f3696I;
            int i2 = c0325c.f3688g;
            int q2 = c0327e.q();
            C0325c c0325c2 = c0326d.f3698K;
            int i3 = q2 - c0325c2.f3688g;
            c0325c.i = c0317c.k(c0325c);
            c0325c2.i = c0317c.k(c0325c2);
            c0317c.d(c0325c.i, i2);
            c0317c.d(c0325c2.i, i3);
            c0326d.f3738o = 2;
            c0326d.f3712Y = i2;
            int i4 = i3 - i2;
            c0326d.f3708U = i4;
            int i5 = c0326d.b0;
            if (i4 < i5) {
                c0326d.f3708U = i5;
            }
        }
        if (c0327e.f3741p0[1] == 2 || iArr[1] != 4) {
            return;
        }
        C0325c c0325c3 = c0326d.f3697J;
        int i6 = c0325c3.f3688g;
        int k2 = c0327e.k();
        C0325c c0325c4 = c0326d.f3699L;
        int i7 = k2 - c0325c4.f3688g;
        c0325c3.i = c0317c.k(c0325c3);
        c0325c4.i = c0317c.k(c0325c4);
        c0317c.d(c0325c3.i, i6);
        c0317c.d(c0325c4.i, i7);
        if (c0326d.f3715a0 > 0 || c0326d.f3725g0 == 8) {
            C0325c c0325c5 = c0326d.f3700M;
            C0320f k3 = c0317c.k(c0325c5);
            c0325c5.i = k3;
            c0317c.d(k3, c0326d.f3715a0 + i6);
        }
        c0326d.f3740p = 2;
        c0326d.f3713Z = i6;
        int i8 = i7 - i6;
        c0326d.f3709V = i8;
        int i9 = c0326d.f3718c0;
        if (i8 < i9) {
            c0326d.f3709V = i9;
        }
    }

    public static final boolean c(int i, int i2) {
        return (i & i2) == i2;
    }
}
