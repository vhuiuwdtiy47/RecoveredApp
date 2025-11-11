package j1;

import java.util.List;

/* loaded from: classes.dex */
public abstract class k extends U.t {
    public static int h0(List list) {
        q1.d.e(list, "<this>");
        return list.size() - 1;
    }

    public static final List i0(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : U.t.M(list.get(0)) : s.f2755a;
    }

    public static void j0() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
