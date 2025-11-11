package u;

import t.C0326d;

/* renamed from: u.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0352i extends AbstractC0358o {
    @Override // u.InterfaceC0347d
    public final void a(InterfaceC0347d interfaceC0347d) {
        C0349f c0349f = this.h;
        if (c0349f.f3905c && !c0349f.f3909j) {
            c0349f.d((int) ((((C0349f) c0349f.f3911l.get(0)).f3908g * ((t.h) this.f3925b).f3818q0) + 0.5f));
        }
    }

    @Override // u.AbstractC0358o
    public final void d() {
        C0326d c0326d = this.f3925b;
        t.h hVar = (t.h) c0326d;
        int i = hVar.r0;
        int i2 = hVar.f3819s0;
        int i3 = hVar.f3821u0;
        C0349f c0349f = this.h;
        if (i3 == 1) {
            if (i != -1) {
                c0349f.f3911l.add(c0326d.f3707T.d.h);
                this.f3925b.f3707T.d.h.f3910k.add(c0349f);
                c0349f.f3907f = i;
            } else if (i2 != -1) {
                c0349f.f3911l.add(c0326d.f3707T.d.i);
                this.f3925b.f3707T.d.i.f3910k.add(c0349f);
                c0349f.f3907f = -i2;
            } else {
                c0349f.f3904b = true;
                c0349f.f3911l.add(c0326d.f3707T.d.i);
                this.f3925b.f3707T.d.i.f3910k.add(c0349f);
            }
            m(this.f3925b.d.h);
            m(this.f3925b.d.i);
            return;
        }
        if (i != -1) {
            c0349f.f3911l.add(c0326d.f3707T.f3720e.h);
            this.f3925b.f3707T.f3720e.h.f3910k.add(c0349f);
            c0349f.f3907f = i;
        } else if (i2 != -1) {
            c0349f.f3911l.add(c0326d.f3707T.f3720e.i);
            this.f3925b.f3707T.f3720e.i.f3910k.add(c0349f);
            c0349f.f3907f = -i2;
        } else {
            c0349f.f3904b = true;
            c0349f.f3911l.add(c0326d.f3707T.f3720e.i);
            this.f3925b.f3707T.f3720e.i.f3910k.add(c0349f);
        }
        m(this.f3925b.f3720e.h);
        m(this.f3925b.f3720e.i);
    }

    @Override // u.AbstractC0358o
    public final void e() {
        C0326d c0326d = this.f3925b;
        int i = ((t.h) c0326d).f3821u0;
        C0349f c0349f = this.h;
        if (i == 1) {
            c0326d.f3712Y = c0349f.f3908g;
        } else {
            c0326d.f3713Z = c0349f.f3908g;
        }
    }

    @Override // u.AbstractC0358o
    public final void f() {
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
