package f0;

import L.C0021q;
import java.util.Iterator;

/* renamed from: f0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0136l implements p1.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2314a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2315b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2316c;

    public /* synthetic */ C0136l(Object obj, int i, Object obj2) {
        this.f2314a = i;
        this.f2315b = obj;
        this.f2316c = obj2;
    }

    @Override // p1.l
    public final Object c(Object obj) {
        Object obj2 = this.f2315b;
        Object obj3 = this.f2316c;
        switch (this.f2314a) {
            case 0:
                C0119B c0119b = (C0119B) obj;
                q1.d.e(c0119b, "$this$navOptions");
                C0021q c0021q = c0119b.f2264a;
                c0021q.f377a = 0;
                c0021q.f378b = 0;
                v vVar = (v) obj2;
                if (vVar instanceof w) {
                    int i = v.f2357f;
                    Iterator it = w1.f.y(vVar, new C0125a(3)).iterator();
                    while (true) {
                        y yVar = (y) obj3;
                        if (it.hasNext()) {
                            v vVar2 = (v) it.next();
                            v f2 = yVar.f2365b.f();
                            if (q1.d.a(vVar2, f2 != null ? f2.f2360c : null)) {
                            }
                        } else {
                            int i2 = w.h;
                            c0119b.d = U.t.r(yVar.f2365b.g()).f2359b.f2660a;
                            c0119b.f2267e = true;
                        }
                    }
                }
                return i1.g.f2679c;
            default:
                C0133i c0133i = (C0133i) obj;
                q1.d.e(c0133i, "backStackEntry");
                v vVar3 = c0133i.f2306b;
                if (vVar3 == null) {
                    vVar3 = null;
                }
                if (vVar3 == null) {
                    return null;
                }
                i0.d dVar = c0133i.h;
                K k2 = (K) obj2;
                v c2 = k2.c(vVar3, dVar.a(), (C0118A) obj3);
                if (c2 == null) {
                    return null;
                }
                return c2.equals(vVar3) ? c0133i : k2.b().b(c2, c2.a(dVar.a()));
        }
    }
}
