package j1;

import java.util.Collection;

/* loaded from: classes.dex */
public abstract class l extends k {
    public static int k0(Iterable iterable, int i) {
        q1.d.e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }
}
