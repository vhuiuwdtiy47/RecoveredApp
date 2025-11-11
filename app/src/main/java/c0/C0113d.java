package c0;

import U.t;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import p1.l;

/* renamed from: c0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0113d {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f1742a;

    public C0113d(int i) {
        switch (i) {
            case 1:
                this.f1742a = new LinkedHashMap(0, 0.75f, true);
                return;
            default:
                this.f1742a = new LinkedHashMap();
                return;
        }
    }

    public void a(q1.b bVar, l lVar) {
        LinkedHashMap linkedHashMap = this.f1742a;
        if (!linkedHashMap.containsKey(bVar)) {
            linkedHashMap.put(bVar, new f(bVar, lVar));
            return;
        }
        throw new IllegalArgumentException(("A `initializer` with the same `clazz` has already been added: " + t.s(bVar) + '.').toString());
    }

    public A0.c b() {
        Collection values = this.f1742a.values();
        q1.d.e(values, "initializers");
        f[] fVarArr = (f[]) values.toArray(new f[0]);
        return new A0.c((f[]) Arrays.copyOf(fVarArr, fVarArr.length));
    }
}
