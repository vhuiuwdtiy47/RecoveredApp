package j1;

import f0.C0133i;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class z extends U.t {
    public static LinkedHashSet h0(Set set, C0133i c0133i) {
        q1.d.e(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(w.h0(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(c0133i);
        return linkedHashSet;
    }
}
