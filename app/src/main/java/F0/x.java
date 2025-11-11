package f0;

import android.os.Bundle;
import java.util.Iterator;
import java.util.List;

@J("navigation")
/* loaded from: classes.dex */
public class x extends K {

    /* renamed from: c, reason: collision with root package name */
    public final L f2363c;

    public x(L l2) {
        q1.d.e(l2, "navigatorProvider");
        this.f2363c = l2;
    }

    @Override // f0.K
    public final v a() {
        return new w(this);
    }

    @Override // f0.K
    public final void d(List list, C0118A c0118a) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0133i c0133i = (C0133i) it.next();
            v vVar = c0133i.f2306b;
            q1.d.c(vVar, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            w wVar = (w) vVar;
            Bundle a2 = c0133i.h.a();
            i0.e eVar = wVar.f2362g;
            int i = eVar.f2620a;
            if (i == 0) {
                i0.l lVar = wVar.f2359b;
                String str = (String) lVar.f2662c;
                if (str == null) {
                    str = String.valueOf(lVar.f2660a);
                }
                q1.d.e(str, "superName");
                if (((w) eVar.f2622c).f2359b.f2660a == 0) {
                    str = "the root navigation";
                }
                throw new IllegalStateException("no start destination defined via app:startDestination for ".concat(str).toString());
            }
            v vVar2 = (v) ((o.k) eVar.d).b(i);
            if (vVar2 == null) {
                if (eVar.f2621b == null) {
                    eVar.f2621b = String.valueOf(eVar.f2620a);
                }
                String str2 = eVar.f2621b;
                q1.d.b(str2);
                throw new IllegalArgumentException(D.f.d("navigation destination ", str2, " is not a direct child of this NavGraph"));
            }
            this.f2363c.b(vVar2.f2358a).d(U.t.M(b().b(vVar2, vVar2.a(a2))), c0118a);
        }
    }
}
