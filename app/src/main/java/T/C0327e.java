package t;

import L.C0016l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import r.C0317c;
import u.AbstractC0358o;
import u.C0345b;
import u.C0346c;
import u.C0348e;
import w.C0368f;

/* renamed from: t.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0327e extends C0326d {

    /* renamed from: A0, reason: collision with root package name */
    public int f3752A0;

    /* renamed from: B0, reason: collision with root package name */
    public C0324b[] f3753B0;

    /* renamed from: C0, reason: collision with root package name */
    public C0324b[] f3754C0;

    /* renamed from: D0, reason: collision with root package name */
    public int f3755D0;

    /* renamed from: E0, reason: collision with root package name */
    public boolean f3756E0;

    /* renamed from: F0, reason: collision with root package name */
    public boolean f3757F0;

    /* renamed from: G0, reason: collision with root package name */
    public WeakReference f3758G0;

    /* renamed from: H0, reason: collision with root package name */
    public WeakReference f3759H0;
    public WeakReference I0;

    /* renamed from: J0, reason: collision with root package name */
    public WeakReference f3760J0;

    /* renamed from: K0, reason: collision with root package name */
    public final HashSet f3761K0;

    /* renamed from: L0, reason: collision with root package name */
    public final C0345b f3762L0;

    /* renamed from: q0, reason: collision with root package name */
    public ArrayList f3763q0 = new ArrayList();
    public final C0016l r0 = new C0016l(this);

    /* renamed from: s0, reason: collision with root package name */
    public final C0348e f3764s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f3765t0;

    /* renamed from: u0, reason: collision with root package name */
    public C0368f f3766u0;
    public boolean v0;

    /* renamed from: w0, reason: collision with root package name */
    public final C0317c f3767w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f3768x0;

    /* renamed from: y0, reason: collision with root package name */
    public int f3769y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f3770z0;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, u.e] */
    /* JADX WARN: Type inference failed for: r0v5, types: [u.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [u.b, java.lang.Object] */
    public C0327e() {
        ?? obj = new Object();
        obj.f3898b = true;
        obj.f3899c = true;
        obj.f3900e = new ArrayList();
        new ArrayList();
        obj.f3901f = null;
        obj.f3902g = new Object();
        obj.h = new ArrayList();
        obj.f3897a = this;
        obj.d = this;
        this.f3764s0 = obj;
        this.f3766u0 = null;
        this.v0 = false;
        this.f3767w0 = new C0317c();
        this.f3770z0 = 0;
        this.f3752A0 = 0;
        this.f3753B0 = new C0324b[4];
        this.f3754C0 = new C0324b[4];
        this.f3755D0 = 257;
        this.f3756E0 = false;
        this.f3757F0 = false;
        this.f3758G0 = null;
        this.f3759H0 = null;
        this.I0 = null;
        this.f3760J0 = null;
        this.f3761K0 = new HashSet();
        this.f3762L0 = new Object();
    }

    public static void V(C0326d c0326d, C0368f c0368f, C0345b c0345b) {
        int i;
        int i2;
        if (c0368f == null) {
            return;
        }
        if (c0326d.f3725g0 == 8 || (c0326d instanceof h) || (c0326d instanceof C0323a)) {
            c0345b.f3891e = 0;
            c0345b.f3892f = 0;
            return;
        }
        int[] iArr = c0326d.f3741p0;
        c0345b.f3888a = iArr[0];
        c0345b.f3889b = iArr[1];
        c0345b.f3890c = c0326d.q();
        c0345b.d = c0326d.k();
        c0345b.i = false;
        c0345b.f3894j = 0;
        boolean z2 = c0345b.f3888a == 3;
        boolean z3 = c0345b.f3889b == 3;
        boolean z4 = z2 && c0326d.f3710W > 0.0f;
        boolean z5 = z3 && c0326d.f3710W > 0.0f;
        if (z2 && c0326d.t(0) && c0326d.f3743r == 0 && !z4) {
            c0345b.f3888a = 2;
            if (z3 && c0326d.f3744s == 0) {
                c0345b.f3888a = 1;
            }
            z2 = false;
        }
        if (z3 && c0326d.t(1) && c0326d.f3744s == 0 && !z5) {
            c0345b.f3889b = 2;
            if (z2 && c0326d.f3743r == 0) {
                c0345b.f3889b = 1;
            }
            z3 = false;
        }
        if (c0326d.A()) {
            c0345b.f3888a = 1;
            z2 = false;
        }
        if (c0326d.B()) {
            c0345b.f3889b = 1;
            z3 = false;
        }
        int[] iArr2 = c0326d.f3745t;
        if (z4) {
            if (iArr2[0] == 4) {
                c0345b.f3888a = 1;
            } else if (!z3) {
                if (c0345b.f3889b == 1) {
                    i2 = c0345b.d;
                } else {
                    c0345b.f3888a = 2;
                    c0368f.b(c0326d, c0345b);
                    i2 = c0345b.f3892f;
                }
                c0345b.f3888a = 1;
                c0345b.f3890c = (int) (c0326d.f3710W * i2);
            }
        }
        if (z5) {
            if (iArr2[1] == 4) {
                c0345b.f3889b = 1;
            } else if (!z2) {
                if (c0345b.f3888a == 1) {
                    i = c0345b.f3890c;
                } else {
                    c0345b.f3889b = 2;
                    c0368f.b(c0326d, c0345b);
                    i = c0345b.f3891e;
                }
                c0345b.f3889b = 1;
                if (c0326d.f3711X == -1) {
                    c0345b.d = (int) (i / c0326d.f3710W);
                } else {
                    c0345b.d = (int) (c0326d.f3710W * i);
                }
            }
        }
        c0368f.b(c0326d, c0345b);
        c0326d.O(c0345b.f3891e);
        c0326d.L(c0345b.f3892f);
        c0326d.f3693E = c0345b.h;
        c0326d.I(c0345b.f3893g);
        c0345b.f3894j = 0;
    }

    @Override // t.C0326d
    public final void C() {
        this.f3767w0.t();
        this.f3768x0 = 0;
        this.f3769y0 = 0;
        this.f3763q0.clear();
        super.C();
    }

    @Override // t.C0326d
    public final void F(C0016l c0016l) {
        super.F(c0016l);
        int size = this.f3763q0.size();
        for (int i = 0; i < size; i++) {
            ((C0326d) this.f3763q0.get(i)).F(c0016l);
        }
    }

    @Override // t.C0326d
    public final void P(boolean z2, boolean z3) {
        super.P(z2, z3);
        int size = this.f3763q0.size();
        for (int i = 0; i < size; i++) {
            ((C0326d) this.f3763q0.get(i)).P(z2, z3);
        }
    }

    public final void R(C0326d c0326d, int i) {
        if (i == 0) {
            int i2 = this.f3770z0 + 1;
            C0324b[] c0324bArr = this.f3754C0;
            if (i2 >= c0324bArr.length) {
                this.f3754C0 = (C0324b[]) Arrays.copyOf(c0324bArr, c0324bArr.length * 2);
            }
            C0324b[] c0324bArr2 = this.f3754C0;
            int i3 = this.f3770z0;
            c0324bArr2[i3] = new C0324b(c0326d, 0, this.v0);
            this.f3770z0 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.f3752A0 + 1;
            C0324b[] c0324bArr3 = this.f3753B0;
            if (i4 >= c0324bArr3.length) {
                this.f3753B0 = (C0324b[]) Arrays.copyOf(c0324bArr3, c0324bArr3.length * 2);
            }
            C0324b[] c0324bArr4 = this.f3753B0;
            int i5 = this.f3752A0;
            c0324bArr4[i5] = new C0324b(c0326d, 1, this.v0);
            this.f3752A0 = i5 + 1;
        }
    }

    public final void S(C0317c c0317c) {
        C0327e c0327e;
        C0317c c0317c2;
        boolean W2 = W(64);
        b(c0317c, W2);
        int size = this.f3763q0.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            C0326d c0326d = (C0326d) this.f3763q0.get(i);
            boolean[] zArr = c0326d.f3706S;
            zArr[0] = false;
            zArr[1] = false;
            if (c0326d instanceof C0323a) {
                z2 = true;
            }
        }
        if (z2) {
            for (int i2 = 0; i2 < size; i2++) {
                C0326d c0326d2 = (C0326d) this.f3763q0.get(i2);
                if (c0326d2 instanceof C0323a) {
                    C0323a c0323a = (C0323a) c0326d2;
                    for (int i3 = 0; i3 < c0323a.r0; i3++) {
                        C0326d c0326d3 = c0323a.f3822q0[i3];
                        if (c0323a.f3667t0 || c0326d3.c()) {
                            int i4 = c0323a.f3666s0;
                            if (i4 == 0 || i4 == 1) {
                                c0326d3.f3706S[0] = true;
                            } else if (i4 == 2 || i4 == 3) {
                                c0326d3.f3706S[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.f3761K0;
        hashSet.clear();
        for (int i5 = 0; i5 < size; i5++) {
            C0326d c0326d4 = (C0326d) this.f3763q0.get(i5);
            c0326d4.getClass();
            boolean z3 = c0326d4 instanceof g;
            if (z3 || (c0326d4 instanceof h)) {
                if (z3) {
                    hashSet.add(c0326d4);
                } else {
                    c0326d4.b(c0317c, W2);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                g gVar = (g) ((C0326d) it.next());
                for (int i6 = 0; i6 < gVar.r0; i6++) {
                    if (hashSet.contains(gVar.f3822q0[i6])) {
                        gVar.b(c0317c, W2);
                        hashSet.remove(gVar);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((C0326d) it2.next()).b(c0317c, W2);
                }
                hashSet.clear();
            }
        }
        if (C0317c.f3555q) {
            HashSet hashSet2 = new HashSet();
            for (int i7 = 0; i7 < size; i7++) {
                C0326d c0326d5 = (C0326d) this.f3763q0.get(i7);
                c0326d5.getClass();
                if (!(c0326d5 instanceof g) && !(c0326d5 instanceof h)) {
                    hashSet2.add(c0326d5);
                }
            }
            c0327e = this;
            c0317c2 = c0317c;
            c0327e.a(this, c0317c2, hashSet2, this.f3741p0[0] == 2 ? 0 : 1, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                C0326d c0326d6 = (C0326d) it3.next();
                j.b(c0327e, c0317c2, c0326d6);
                c0326d6.b(c0317c2, W2);
            }
        } else {
            c0327e = this;
            c0317c2 = c0317c;
            for (int i8 = 0; i8 < size; i8++) {
                C0326d c0326d7 = (C0326d) c0327e.f3763q0.get(i8);
                if (c0326d7 instanceof C0327e) {
                    int[] iArr = c0326d7.f3741p0;
                    int i9 = iArr[0];
                    int i10 = iArr[1];
                    if (i9 == 2) {
                        c0326d7.M(1);
                    }
                    if (i10 == 2) {
                        c0326d7.N(1);
                    }
                    c0326d7.b(c0317c2, W2);
                    if (i9 == 2) {
                        c0326d7.M(i9);
                    }
                    if (i10 == 2) {
                        c0326d7.N(i10);
                    }
                } else {
                    j.b(c0327e, c0317c2, c0326d7);
                    if (!(c0326d7 instanceof g) && !(c0326d7 instanceof h)) {
                        c0326d7.b(c0317c2, W2);
                    }
                }
            }
        }
        if (c0327e.f3770z0 > 0) {
            j.a(c0327e, c0317c2, null, 0);
        }
        if (c0327e.f3752A0 > 0) {
            j.a(c0327e, c0317c2, null, 1);
        }
    }

    public final boolean T(int i, boolean z2) {
        boolean z3;
        C0348e c0348e = this.f3764s0;
        C0327e c0327e = c0348e.f3897a;
        boolean z4 = false;
        int j2 = c0327e.j(0);
        int j3 = c0327e.j(1);
        int r2 = c0327e.r();
        int s2 = c0327e.s();
        ArrayList arrayList = c0348e.f3900e;
        if (z2 && (j2 == 2 || j3 == 2)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC0358o abstractC0358o = (AbstractC0358o) it.next();
                if (abstractC0358o.f3928f == i && !abstractC0358o.k()) {
                    z2 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z2 && j2 == 2) {
                    c0327e.M(1);
                    c0327e.O(c0348e.d(c0327e, 0));
                    c0327e.d.f3927e.d(c0327e.q());
                }
            } else if (z2 && j3 == 2) {
                c0327e.N(1);
                c0327e.L(c0348e.d(c0327e, 1));
                c0327e.f3720e.f3927e.d(c0327e.k());
            }
        }
        int[] iArr = c0327e.f3741p0;
        if (i == 0) {
            int i2 = iArr[0];
            if (i2 == 1 || i2 == 4) {
                int q2 = c0327e.q() + r2;
                c0327e.d.i.d(q2);
                c0327e.d.f3927e.d(q2 - r2);
                z3 = true;
            }
            z3 = false;
        } else {
            int i3 = iArr[1];
            if (i3 == 1 || i3 == 4) {
                int k2 = c0327e.k() + s2;
                c0327e.f3720e.i.d(k2);
                c0327e.f3720e.f3927e.d(k2 - s2);
                z3 = true;
            }
            z3 = false;
        }
        c0348e.g();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AbstractC0358o abstractC0358o2 = (AbstractC0358o) it2.next();
            if (abstractC0358o2.f3928f == i && (abstractC0358o2.f3925b != c0327e || abstractC0358o2.f3929g)) {
                abstractC0358o2.e();
            }
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                z4 = true;
                break;
            }
            AbstractC0358o abstractC0358o3 = (AbstractC0358o) it3.next();
            if (abstractC0358o3.f3928f == i && (z3 || abstractC0358o3.f3925b != c0327e)) {
                if (!abstractC0358o3.h.f3909j) {
                    break;
                }
                if (!abstractC0358o3.i.f3909j) {
                    break;
                }
                if (!(abstractC0358o3 instanceof C0346c) && !abstractC0358o3.f3927e.f3909j) {
                    break;
                }
            }
        }
        c0327e.M(j2);
        c0327e.N(j3);
        return z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:215:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x06da  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x07e4  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0842 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x084f A[LOOP:14: B:281:0x084d->B:282:0x084f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x08b5  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x08d5  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x08e2  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x091e  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0920  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x091a  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x08de  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x08c2  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0825  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x092e  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:601:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:620:0x064d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:623:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:630:0x0668  */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r6v140, types: [u.b, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U() {
        /*
            Method dump skipped, instructions count: 2364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t.C0327e.U():void");
    }

    public final boolean W(int i) {
        return (this.f3755D0 & i) == i;
    }

    @Override // t.C0326d
    public final void n(StringBuilder sb) {
        sb.append(this.f3728j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.f3708U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.f3709V);
        sb.append("\n");
        Iterator it = this.f3763q0.iterator();
        while (it.hasNext()) {
            ((C0326d) it.next()).n(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
