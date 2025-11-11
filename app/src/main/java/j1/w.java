package j1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class w extends U.t {
    public static int h0(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map i0(ArrayList arrayList) {
        t tVar = t.f2756a;
        int size = arrayList.size();
        if (size == 0) {
            return tVar;
        }
        if (size == 1) {
            i1.d dVar = (i1.d) arrayList.get(0);
            q1.d.e(dVar, "pair");
            Map singletonMap = Collections.singletonMap(dVar.f2670a, dVar.f2671b);
            q1.d.d(singletonMap, "singletonMap(...)");
            return singletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(h0(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            i1.d dVar2 = (i1.d) it.next();
            linkedHashMap.put(dVar2.f2670a, dVar2.f2671b);
        }
        return linkedHashMap;
    }

    public static Map j0(Map map) {
        q1.d.e(map, "<this>");
        int size = map.size();
        if (size == 0) {
            return t.f2756a;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        q1.d.e(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        q1.d.d(singletonMap, "with(...)");
        return singletonMap;
    }
}
