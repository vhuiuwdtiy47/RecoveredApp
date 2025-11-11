package w1;

import U.t;
import a.C0072n;
import j1.q;
import j1.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p1.l;

/* loaded from: classes.dex */
public abstract class f extends g {
    public static e x(Iterator it) {
        return new a(new q(2, it));
    }

    public static e y(Object obj, l lVar) {
        return obj == null ? b.f4174a : new h(new C0072n(3, obj), lVar, 2);
    }

    public static List z(e eVar) {
        Iterator it = eVar.iterator();
        if (!it.hasNext()) {
            return s.f2755a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return t.M(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
