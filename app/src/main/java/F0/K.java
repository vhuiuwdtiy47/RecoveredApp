package f0;

import L.C0021q;
import android.os.Bundle;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public abstract class K {

    /* renamed from: a, reason: collision with root package name */
    public n f2287a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2288b;

    public abstract v a();

    public final n b() {
        n nVar = this.f2287a;
        if (nVar != null) {
            return nVar;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    public v c(v vVar, Bundle bundle, C0118A c0118a) {
        return vVar;
    }

    public void d(List list, C0118A c0118a) {
        w1.c cVar = new w1.c(new j1.q(1, new w1.h(new j1.q(0, list), new C0136l(this, 1, c0118a), 1)));
        while (cVar.hasNext()) {
            b().g((C0133i) cVar.next());
        }
    }

    public void e(n nVar) {
        this.f2287a = nVar;
        this.f2288b = true;
    }

    public void f(C0133i c0133i) {
        v vVar = c0133i.f2306b;
        if (vVar == null) {
            vVar = null;
        }
        if (vVar == null) {
            return;
        }
        C0119B c0119b = new C0119B();
        c0119b.f2265b = true;
        boolean z2 = c0119b.f2265b;
        C0021q c0021q = c0119b.f2264a;
        c(vVar, null, new C0118A(z2, c0119b.f2266c, c0119b.d, false, c0119b.f2267e, c0021q.f377a, c0021q.f378b, -1, -1));
        b().d(c0133i);
    }

    public void g(Bundle bundle) {
    }

    public Bundle h() {
        return null;
    }

    public void i(C0133i c0133i, boolean z2) {
        List list = (List) ((y1.c) ((y1.a) b().f2322e.f33b)).a();
        if (!list.contains(c0133i)) {
            throw new IllegalStateException(("popBackStack was called with " + c0133i + " which does not exist in back stack " + list).toString());
        }
        ListIterator listIterator = list.listIterator(list.size());
        C0133i c0133i2 = null;
        while (j()) {
            c0133i2 = (C0133i) listIterator.previous();
            if (q1.d.a(c0133i2, c0133i)) {
                break;
            }
        }
        if (c0133i2 != null) {
            b().e(c0133i2, z2);
        }
    }

    public boolean j() {
        return true;
    }
}
