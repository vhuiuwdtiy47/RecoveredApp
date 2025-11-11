package u;

import r.AbstractC0319e;
import t.C0325c;
import t.C0326d;

/* renamed from: u.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0358o implements InterfaceC0347d {

    /* renamed from: a, reason: collision with root package name */
    public int f3924a;

    /* renamed from: b, reason: collision with root package name */
    public C0326d f3925b;

    /* renamed from: c, reason: collision with root package name */
    public C0355l f3926c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public final C0350g f3927e = new C0350g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f3928f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3929g = false;
    public final C0349f h = new C0349f(this);
    public final C0349f i = new C0349f(this);

    /* renamed from: j, reason: collision with root package name */
    public int f3930j = 1;

    public AbstractC0358o(C0326d c0326d) {
        this.f3925b = c0326d;
    }

    public static void b(C0349f c0349f, C0349f c0349f2, int i) {
        c0349f.f3911l.add(c0349f2);
        c0349f.f3907f = i;
        c0349f2.f3910k.add(c0349f);
    }

    public static C0349f h(C0325c c0325c) {
        C0325c c0325c2 = c0325c.f3687f;
        if (c0325c2 == null) {
            return null;
        }
        int a2 = AbstractC0319e.a(c0325c2.f3686e);
        C0326d c0326d = c0325c2.d;
        if (a2 == 1) {
            return c0326d.d.h;
        }
        if (a2 == 2) {
            return c0326d.f3720e.h;
        }
        if (a2 == 3) {
            return c0326d.d.i;
        }
        if (a2 == 4) {
            return c0326d.f3720e.i;
        }
        if (a2 != 5) {
            return null;
        }
        return c0326d.f3720e.f3917k;
    }

    public static C0349f i(C0325c c0325c, int i) {
        C0325c c0325c2 = c0325c.f3687f;
        if (c0325c2 == null) {
            return null;
        }
        C0326d c0326d = c0325c2.d;
        AbstractC0358o abstractC0358o = i == 0 ? c0326d.d : c0326d.f3720e;
        int a2 = AbstractC0319e.a(c0325c2.f3686e);
        if (a2 == 1 || a2 == 2) {
            return abstractC0358o.h;
        }
        if (a2 == 3 || a2 == 4) {
            return abstractC0358o.i;
        }
        return null;
    }

    public final void c(C0349f c0349f, C0349f c0349f2, int i, C0350g c0350g) {
        c0349f.f3911l.add(c0349f2);
        c0349f.f3911l.add(this.f3927e);
        c0349f.h = i;
        c0349f.i = c0350g;
        c0349f2.f3910k.add(c0349f);
        c0350g.f3910k.add(c0349f);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        if (i2 == 0) {
            C0326d c0326d = this.f3925b;
            int i3 = c0326d.f3747v;
            int max = Math.max(c0326d.f3746u, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max != i) {
                return max;
            }
        } else {
            C0326d c0326d2 = this.f3925b;
            int i4 = c0326d2.f3750y;
            int max2 = Math.max(c0326d2.f3749x, i);
            if (i4 > 0) {
                max2 = Math.min(i4, i);
            }
            if (max2 != i) {
                return max2;
            }
        }
        return i;
    }

    public long j() {
        if (this.f3927e.f3909j) {
            return r2.f3908g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r9.f3924a == 3) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(t.C0325c r12, t.C0325c r13, int r14) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u.AbstractC0358o.l(t.c, t.c, int):void");
    }
}
