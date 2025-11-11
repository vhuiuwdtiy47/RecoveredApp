package n0;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    public SparseArray f3264a;

    /* renamed from: b, reason: collision with root package name */
    public int f3265b;

    public final L a(int i) {
        SparseArray sparseArray = this.f3264a;
        L l2 = (L) sparseArray.get(i);
        if (l2 != null) {
            return l2;
        }
        L l3 = new L();
        sparseArray.put(i, l3);
        return l3;
    }
}
