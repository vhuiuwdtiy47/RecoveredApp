package u;

import java.util.Iterator;
import t.C0323a;
import t.C0326d;

/* renamed from: u.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0353j extends AbstractC0358o {
    @Override // u.InterfaceC0347d
    public final void a(InterfaceC0347d interfaceC0347d) {
        C0323a c0323a = (C0323a) this.f3925b;
        int i = c0323a.f3666s0;
        C0349f c0349f = this.h;
        Iterator it = c0349f.f3911l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((C0349f) it.next()).f3908g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            c0349f.d(i3 + c0323a.f3668u0);
        } else {
            c0349f.d(i2 + c0323a.f3668u0);
        }
    }

    @Override // u.AbstractC0358o
    public final void d() {
        C0326d c0326d = this.f3925b;
        if (c0326d instanceof C0323a) {
            C0349f c0349f = this.h;
            c0349f.f3904b = true;
            C0323a c0323a = (C0323a) c0326d;
            int i = c0323a.f3666s0;
            boolean z2 = c0323a.f3667t0;
            int i2 = 0;
            if (i == 0) {
                c0349f.f3906e = 4;
                while (i2 < c0323a.r0) {
                    C0326d c0326d2 = c0323a.f3822q0[i2];
                    if (z2 || c0326d2.f3725g0 != 8) {
                        C0349f c0349f2 = c0326d2.d.h;
                        c0349f2.f3910k.add(c0349f);
                        c0349f.f3911l.add(c0349f2);
                    }
                    i2++;
                }
                m(this.f3925b.d.h);
                m(this.f3925b.d.i);
                return;
            }
            if (i == 1) {
                c0349f.f3906e = 5;
                while (i2 < c0323a.r0) {
                    C0326d c0326d3 = c0323a.f3822q0[i2];
                    if (z2 || c0326d3.f3725g0 != 8) {
                        C0349f c0349f3 = c0326d3.d.i;
                        c0349f3.f3910k.add(c0349f);
                        c0349f.f3911l.add(c0349f3);
                    }
                    i2++;
                }
                m(this.f3925b.d.h);
                m(this.f3925b.d.i);
                return;
            }
            if (i == 2) {
                c0349f.f3906e = 6;
                while (i2 < c0323a.r0) {
                    C0326d c0326d4 = c0323a.f3822q0[i2];
                    if (z2 || c0326d4.f3725g0 != 8) {
                        C0349f c0349f4 = c0326d4.f3720e.h;
                        c0349f4.f3910k.add(c0349f);
                        c0349f.f3911l.add(c0349f4);
                    }
                    i2++;
                }
                m(this.f3925b.f3720e.h);
                m(this.f3925b.f3720e.i);
                return;
            }
            if (i != 3) {
                return;
            }
            c0349f.f3906e = 7;
            while (i2 < c0323a.r0) {
                C0326d c0326d5 = c0323a.f3822q0[i2];
                if (z2 || c0326d5.f3725g0 != 8) {
                    C0349f c0349f5 = c0326d5.f3720e.i;
                    c0349f5.f3910k.add(c0349f);
                    c0349f.f3911l.add(c0349f5);
                }
                i2++;
            }
            m(this.f3925b.f3720e.h);
            m(this.f3925b.f3720e.i);
        }
    }

    @Override // u.AbstractC0358o
    public final void e() {
        C0326d c0326d = this.f3925b;
        if (c0326d instanceof C0323a) {
            int i = ((C0323a) c0326d).f3666s0;
            C0349f c0349f = this.h;
            if (i == 0 || i == 1) {
                c0326d.f3712Y = c0349f.f3908g;
            } else {
                c0326d.f3713Z = c0349f.f3908g;
            }
        }
    }

    @Override // u.AbstractC0358o
    public final void f() {
        this.f3926c = null;
        this.h.c();
    }

    @Override // u.AbstractC0358o
    public final boolean k() {
        return false;
    }

    public final void m(C0349f c0349f) {
        C0349f c0349f2 = this.h;
        c0349f2.f3910k.add(c0349f);
        c0349f.f3911l.add(c0349f2);
    }
}
