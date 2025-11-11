package q1;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class k {
    public static Map a(LinkedHashMap linkedHashMap) {
        if (!(linkedHashMap instanceof r1.a) || (linkedHashMap instanceof r1.c)) {
            return linkedHashMap;
        }
        b(linkedHashMap, "kotlin.collections.MutableMap");
        throw null;
    }

    public static void b(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
        d.f(classCastException, k.class.getName());
        throw classCastException;
    }
}
