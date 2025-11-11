package u;

import java.util.ArrayList;
import java.util.Iterator;
import t.C0325c;
import t.C0326d;
import t.C0327e;

/* renamed from: u.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0346c extends AbstractC0358o {

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f3895k;

    /* renamed from: l, reason: collision with root package name */
    public int f3896l;

    public C0346c(C0326d c0326d, int i) {
        super(c0326d);
        C0326d c0326d2;
        this.f3895k = new ArrayList();
        this.f3928f = i;
        C0326d c0326d3 = this.f3925b;
        C0326d m2 = c0326d3.m(i);
        while (true) {
            C0326d c0326d4 = m2;
            c0326d2 = c0326d3;
            c0326d3 = c0326d4;
            if (c0326d3 == null) {
                break;
            } else {
                m2 = c0326d3.m(this.f3928f);
            }
        }
        this.f3925b = c0326d2;
        int i2 = this.f3928f;
        AbstractC0358o abstractC0358o = i2 == 0 ? c0326d2.d : i2 == 1 ? c0326d2.f3720e : null;
        ArrayList arrayList = this.f3895k;
        arrayList.add(abstractC0358o);
        C0326d l2 = c0326d2.l(this.f3928f);
        while (l2 != null) {
            int i3 = this.f3928f;
            arrayList.add(i3 == 0 ? l2.d : i3 == 1 ? l2.f3720e : null);
            l2 = l2.l(this.f3928f);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC0358o abstractC0358o2 = (AbstractC0358o) it.next();
            int i4 = this.f3928f;
            if (i4 == 0) {
                abstractC0358o2.f3925b.f3716b = this;
            } else if (i4 == 1) {
                abstractC0358o2.f3925b.f3717c = this;
            }
        }
        if (this.f3928f == 0 && ((C0327e) this.f3925b.f3707T).v0 && arrayList.size() > 1) {
            this.f3925b = ((AbstractC0358o) arrayList.get(arrayList.size() - 1)).f3925b;
        }
        this.f3896l = this.f3928f == 0 ? this.f3925b.f3727i0 : this.f3925b.f3729j0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:288:0x0397, code lost:
    
        r0 = r0 - r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dd  */
    @Override // u.InterfaceC0347d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(u.InterfaceC0347d r28) {
        /*
            Method dump skipped, instructions count: 950
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u.C0346c.a(u.d):void");
    }

    @Override // u.AbstractC0358o
    public final void d() {
        ArrayList arrayList = this.f3895k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC0358o) it.next()).d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        C0326d c0326d = ((AbstractC0358o) arrayList.get(0)).f3925b;
        C0326d c0326d2 = ((AbstractC0358o) arrayList.get(size - 1)).f3925b;
        int i = this.f3928f;
        C0349f c0349f = this.i;
        C0349f c0349f2 = this.h;
        if (i == 0) {
            C0325c c0325c = c0326d.f3696I;
            C0325c c0325c2 = c0326d2.f3698K;
            C0349f i2 = AbstractC0358o.i(c0325c, 0);
            int e2 = c0325c.e();
            C0326d m2 = m();
            if (m2 != null) {
                e2 = m2.f3696I.e();
            }
            if (i2 != null) {
                AbstractC0358o.b(c0349f2, i2, e2);
            }
            C0349f i3 = AbstractC0358o.i(c0325c2, 0);
            int e3 = c0325c2.e();
            C0326d n2 = n();
            if (n2 != null) {
                e3 = n2.f3698K.e();
            }
            if (i3 != null) {
                AbstractC0358o.b(c0349f, i3, -e3);
            }
        } else {
            C0325c c0325c3 = c0326d.f3697J;
            C0325c c0325c4 = c0326d2.f3699L;
            C0349f i4 = AbstractC0358o.i(c0325c3, 1);
            int e4 = c0325c3.e();
            C0326d m3 = m();
            if (m3 != null) {
                e4 = m3.f3697J.e();
            }
            if (i4 != null) {
                AbstractC0358o.b(c0349f2, i4, e4);
            }
            C0349f i5 = AbstractC0358o.i(c0325c4, 1);
            int e5 = c0325c4.e();
            C0326d n3 = n();
            if (n3 != null) {
                e5 = n3.f3699L.e();
            }
            if (i5 != null) {
                AbstractC0358o.b(c0349f, i5, -e5);
            }
        }
        c0349f2.f3903a = this;
        c0349f.f3903a = this;
    }

    @Override // u.AbstractC0358o
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3895k;
            if (i >= arrayList.size()) {
                return;
            }
            ((AbstractC0358o) arrayList.get(i)).e();
            i++;
        }
    }

    @Override // u.AbstractC0358o
    public final void f() {
        this.f3926c = null;
        Iterator it = this.f3895k.iterator();
        while (it.hasNext()) {
            ((AbstractC0358o) it.next()).f();
        }
    }

    @Override // u.AbstractC0358o
    public final long j() {
        ArrayList arrayList = this.f3895k;
        int size = arrayList.size();
        long j2 = 0;
        for (int i = 0; i < size; i++) {
            j2 = r4.i.f3907f + ((AbstractC0358o) arrayList.get(i)).j() + j2 + r4.h.f3907f;
        }
        return j2;
    }

    @Override // u.AbstractC0358o
    public final boolean k() {
        ArrayList arrayList = this.f3895k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((AbstractC0358o) arrayList.get(i)).k()) {
                return false;
            }
        }
        return true;
    }

    public final C0326d m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3895k;
            if (i >= arrayList.size()) {
                return null;
            }
            C0326d c0326d = ((AbstractC0358o) arrayList.get(i)).f3925b;
            if (c0326d.f3725g0 != 8) {
                return c0326d;
            }
            i++;
        }
    }

    public final C0326d n() {
        ArrayList arrayList = this.f3895k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0326d c0326d = ((AbstractC0358o) arrayList.get(size)).f3925b;
            if (c0326d.f3725g0 != 8) {
                return c0326d;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f3928f == 0 ? "horizontal : " : "vertical : ");
        Iterator it = this.f3895k.iterator();
        while (it.hasNext()) {
            AbstractC0358o abstractC0358o = (AbstractC0358o) it.next();
            sb.append("<");
            sb.append(abstractC0358o);
            sb.append("> ");
        }
        return sb.toString();
    }
}
