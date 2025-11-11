package u;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import t.C0326d;
import t.C0327e;
import w.C0368f;

/* renamed from: u.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0348e {

    /* renamed from: a, reason: collision with root package name */
    public C0327e f3897a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3898b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3899c;
    public C0327e d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f3900e;

    /* renamed from: f, reason: collision with root package name */
    public C0368f f3901f;

    /* renamed from: g, reason: collision with root package name */
    public C0345b f3902g;
    public ArrayList h;

    /* JADX WARN: Type inference failed for: r10v2, types: [u.l, java.lang.Object] */
    public final void a(C0349f c0349f, int i, ArrayList arrayList, C0355l c0355l) {
        AbstractC0358o abstractC0358o = c0349f.d;
        if (abstractC0358o.f3926c == null) {
            C0327e c0327e = this.f3897a;
            if (abstractC0358o != c0327e.d) {
                C0355l c0355l2 = c0355l;
                if (abstractC0358o == c0327e.f3720e) {
                    return;
                }
                if (c0355l == null) {
                    ?? obj = new Object();
                    obj.f3915a = null;
                    obj.f3916b = new ArrayList();
                    obj.f3915a = abstractC0358o;
                    arrayList.add(obj);
                    c0355l2 = obj;
                }
                abstractC0358o.f3926c = c0355l2;
                c0355l2.f3916b.add(abstractC0358o);
                C0349f c0349f2 = abstractC0358o.h;
                Iterator it = c0349f2.f3910k.iterator();
                while (it.hasNext()) {
                    InterfaceC0347d interfaceC0347d = (InterfaceC0347d) it.next();
                    if (interfaceC0347d instanceof C0349f) {
                        a((C0349f) interfaceC0347d, i, arrayList, c0355l2);
                    }
                }
                C0349f c0349f3 = abstractC0358o.i;
                Iterator it2 = c0349f3.f3910k.iterator();
                while (it2.hasNext()) {
                    InterfaceC0347d interfaceC0347d2 = (InterfaceC0347d) it2.next();
                    if (interfaceC0347d2 instanceof C0349f) {
                        a((C0349f) interfaceC0347d2, i, arrayList, c0355l2);
                    }
                }
                if (i == 1 && (abstractC0358o instanceof C0356m)) {
                    Iterator it3 = ((C0356m) abstractC0358o).f3917k.f3910k.iterator();
                    while (it3.hasNext()) {
                        InterfaceC0347d interfaceC0347d3 = (InterfaceC0347d) it3.next();
                        if (interfaceC0347d3 instanceof C0349f) {
                            a((C0349f) interfaceC0347d3, i, arrayList, c0355l2);
                        }
                    }
                }
                Iterator it4 = c0349f2.f3911l.iterator();
                while (it4.hasNext()) {
                    a((C0349f) it4.next(), i, arrayList, c0355l2);
                }
                Iterator it5 = c0349f3.f3911l.iterator();
                while (it5.hasNext()) {
                    a((C0349f) it5.next(), i, arrayList, c0355l2);
                }
                if (i == 1 && (abstractC0358o instanceof C0356m)) {
                    Iterator it6 = ((C0356m) abstractC0358o).f3917k.f3911l.iterator();
                    while (it6.hasNext()) {
                        a((C0349f) it6.next(), i, arrayList, c0355l2);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x026a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0270 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0008 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(t.C0327e r23) {
        /*
            Method dump skipped, instructions count: 795
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u.C0348e.b(t.e):void");
    }

    public final void c() {
        ArrayList arrayList = this.f3900e;
        arrayList.clear();
        C0327e c0327e = this.d;
        c0327e.d.f();
        c0327e.f3720e.f();
        arrayList.add(c0327e.d);
        arrayList.add(c0327e.f3720e);
        Iterator it = c0327e.f3763q0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            C0326d c0326d = (C0326d) it.next();
            if (c0326d instanceof t.h) {
                AbstractC0358o abstractC0358o = new AbstractC0358o(c0326d);
                c0326d.d.f();
                c0326d.f3720e.f();
                abstractC0358o.f3928f = ((t.h) c0326d).f3821u0;
                arrayList.add(abstractC0358o);
            } else {
                if (c0326d.x()) {
                    if (c0326d.f3716b == null) {
                        c0326d.f3716b = new C0346c(c0326d, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c0326d.f3716b);
                } else {
                    arrayList.add(c0326d.d);
                }
                if (c0326d.y()) {
                    if (c0326d.f3717c == null) {
                        c0326d.f3717c = new C0346c(c0326d, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c0326d.f3717c);
                } else {
                    arrayList.add(c0326d.f3720e);
                }
                if (c0326d instanceof t.i) {
                    arrayList.add(new AbstractC0358o(c0326d));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((AbstractC0358o) it2.next()).f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            AbstractC0358o abstractC0358o2 = (AbstractC0358o) it3.next();
            if (abstractC0358o2.f3925b != c0327e) {
                abstractC0358o2.d();
            }
        }
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        C0327e c0327e2 = this.f3897a;
        e(c0327e2.d, 0, arrayList2);
        e(c0327e2.f3720e, 1, arrayList2);
        this.f3898b = false;
    }

    public final int d(C0327e c0327e, int i) {
        ArrayList arrayList;
        int i2;
        long max;
        float f2;
        C0327e c0327e2 = c0327e;
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        long j2 = 0;
        int i3 = 0;
        long j3 = 0;
        while (i3 < size) {
            AbstractC0358o abstractC0358o = ((C0355l) arrayList2.get(i3)).f3915a;
            if (!(abstractC0358o instanceof C0346c) ? !(i != 0 ? (abstractC0358o instanceof C0356m) : (abstractC0358o instanceof C0354k)) : ((C0346c) abstractC0358o).f3928f != i) {
                C0349f c0349f = (i == 0 ? c0327e2.d : c0327e2.f3720e).h;
                C0349f c0349f2 = (i == 0 ? c0327e2.d : c0327e2.f3720e).i;
                boolean contains = abstractC0358o.h.f3911l.contains(c0349f);
                C0349f c0349f3 = abstractC0358o.i;
                boolean contains2 = c0349f3.f3911l.contains(c0349f2);
                long j4 = abstractC0358o.j();
                C0349f c0349f4 = abstractC0358o.h;
                if (contains && contains2) {
                    long b2 = C0355l.b(c0349f4, j2);
                    arrayList = arrayList2;
                    long a2 = C0355l.a(c0349f3, j2);
                    long j5 = b2 - j4;
                    int i4 = c0349f3.f3907f;
                    i2 = i3;
                    if (j5 >= (-i4)) {
                        j5 += i4;
                    }
                    long j6 = c0349f4.f3907f;
                    long j7 = ((-a2) - j4) - j6;
                    if (j7 >= j6) {
                        j7 -= j6;
                    }
                    C0326d c0326d = abstractC0358o.f3925b;
                    if (i == 0) {
                        f2 = c0326d.f3719d0;
                    } else if (i == 1) {
                        f2 = c0326d.f3721e0;
                    } else {
                        c0326d.getClass();
                        f2 = -1.0f;
                    }
                    float f3 = (float) (f2 > 0.0f ? (((float) j5) / (1.0f - f2)) + (((float) j7) / f2) : 0L);
                    max = (c0349f4.f3907f + ((((f3 * f2) + 0.5f) + j4) + (((1.0f - f2) * f3) + 0.5f))) - c0349f3.f3907f;
                } else {
                    arrayList = arrayList2;
                    i2 = i3;
                    max = contains ? Math.max(C0355l.b(c0349f4, c0349f4.f3907f), c0349f4.f3907f + j4) : contains2 ? Math.max(-C0355l.a(c0349f3, c0349f3.f3907f), (-c0349f3.f3907f) + j4) : (abstractC0358o.j() + c0349f4.f3907f) - c0349f3.f3907f;
                }
            } else {
                arrayList = arrayList2;
                max = j2;
                i2 = i3;
            }
            j3 = Math.max(j3, max);
            i3 = i2 + 1;
            arrayList2 = arrayList;
            c0327e2 = c0327e;
            j2 = 0;
        }
        return (int) j3;
    }

    public final void e(AbstractC0358o abstractC0358o, int i, ArrayList arrayList) {
        C0349f c0349f;
        Iterator it = abstractC0358o.h.f3910k.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            c0349f = abstractC0358o.i;
            if (!hasNext) {
                break;
            }
            InterfaceC0347d interfaceC0347d = (InterfaceC0347d) it.next();
            if (interfaceC0347d instanceof C0349f) {
                a((C0349f) interfaceC0347d, i, arrayList, null);
            } else if (interfaceC0347d instanceof AbstractC0358o) {
                a(((AbstractC0358o) interfaceC0347d).h, i, arrayList, null);
            }
        }
        Iterator it2 = c0349f.f3910k.iterator();
        while (it2.hasNext()) {
            InterfaceC0347d interfaceC0347d2 = (InterfaceC0347d) it2.next();
            if (interfaceC0347d2 instanceof C0349f) {
                a((C0349f) interfaceC0347d2, i, arrayList, null);
            } else if (interfaceC0347d2 instanceof AbstractC0358o) {
                a(((AbstractC0358o) interfaceC0347d2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            Iterator it3 = ((C0356m) abstractC0358o).f3917k.f3910k.iterator();
            while (it3.hasNext()) {
                InterfaceC0347d interfaceC0347d3 = (InterfaceC0347d) it3.next();
                if (interfaceC0347d3 instanceof C0349f) {
                    a((C0349f) interfaceC0347d3, i, arrayList, null);
                }
            }
        }
    }

    public final void f(int i, int i2, int i3, int i4, C0326d c0326d) {
        C0345b c0345b = this.f3902g;
        c0345b.f3888a = i;
        c0345b.f3889b = i3;
        c0345b.f3890c = i2;
        c0345b.d = i4;
        this.f3901f.b(c0326d, c0345b);
        c0326d.O(c0345b.f3891e);
        c0326d.L(c0345b.f3892f);
        c0326d.f3693E = c0345b.h;
        c0326d.I(c0345b.f3893g);
    }

    public final void g() {
        C0348e c0348e;
        C0344a c0344a;
        Iterator it = this.f3897a.f3763q0.iterator();
        while (it.hasNext()) {
            C0326d c0326d = (C0326d) it.next();
            if (!c0326d.f3714a) {
                int[] iArr = c0326d.f3741p0;
                boolean z2 = false;
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = c0326d.f3743r;
                int i4 = c0326d.f3744s;
                boolean z3 = i == 2 || (i == 3 && i3 == 1);
                if (i2 == 2 || (i2 == 3 && i4 == 1)) {
                    z2 = true;
                }
                C0350g c0350g = c0326d.d.f3927e;
                boolean z4 = c0350g.f3909j;
                C0350g c0350g2 = c0326d.f3720e.f3927e;
                boolean z5 = c0350g2.f3909j;
                boolean z6 = z3;
                if (z4 && z5) {
                    c0348e = this;
                    c0348e.f(1, c0350g.f3908g, 1, c0350g2.f3908g, c0326d);
                    c0326d.f3714a = true;
                } else if (z4 && z2) {
                    c0348e = this;
                    c0348e.f(1, c0350g.f3908g, 2, c0350g2.f3908g, c0326d);
                    if (i2 == 3) {
                        c0326d.f3720e.f3927e.f3912m = c0326d.k();
                    } else {
                        c0326d.f3720e.f3927e.d(c0326d.k());
                        c0326d.f3714a = true;
                    }
                } else {
                    c0348e = this;
                    if (z5 && z6) {
                        c0348e.f(2, c0350g.f3908g, 1, c0350g2.f3908g, c0326d);
                        if (i == 3) {
                            c0326d.d.f3927e.f3912m = c0326d.q();
                        } else {
                            c0326d.d.f3927e.d(c0326d.q());
                            c0326d.f3714a = true;
                        }
                    }
                }
                if (c0326d.f3714a && (c0344a = c0326d.f3720e.f3918l) != null) {
                    c0344a.d(c0326d.f3715a0);
                }
                this = c0348e;
            }
        }
    }
}
