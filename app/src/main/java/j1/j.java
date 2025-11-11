package j1;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class j extends p {
    public static boolean n0(Iterable iterable, Object obj) {
        int i;
        q1.d.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (!(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                Object next = it.next();
                if (i2 < 0) {
                    k.j0();
                    throw null;
                }
                if (q1.d.a(obj, next)) {
                    i = i2;
                    break;
                }
                i2++;
            }
        } else {
            i = ((List) iterable).indexOf(obj);
        }
        return i >= 0;
    }

    public static Object o0(List list) {
        q1.d.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object p0(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object q0(List list, int i) {
        q1.d.e(list, "<this>");
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static Object r0(List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(k.h0(list));
    }

    public static Object s0(List list) {
        q1.d.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable t0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static ArrayList u0(Collection collection, Iterable iterable) {
        q1.d.e(collection, "<this>");
        q1.d.e(iterable, "elements");
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            p.l0(iterable, arrayList);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static List v0(Iterable iterable) {
        ArrayList arrayList;
        q1.d.e(iterable, "<this>");
        boolean z2 = iterable instanceof Collection;
        if (z2 && ((Collection) iterable).size() <= 1) {
            return y0(iterable);
        }
        if (z2) {
            arrayList = z0((Collection) iterable);
        } else {
            ArrayList arrayList2 = new ArrayList();
            w0(iterable, arrayList2);
            arrayList = arrayList2;
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    public static final void w0(Iterable iterable, AbstractCollection abstractCollection) {
        q1.d.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static int[] x0(List list) {
        q1.d.e(list, "<this>");
        int[] iArr = new int[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static List y0(Iterable iterable) {
        ArrayList arrayList;
        q1.d.e(iterable, "<this>");
        boolean z2 = iterable instanceof Collection;
        if (!z2) {
            if (z2) {
                arrayList = z0((Collection) iterable);
            } else {
                ArrayList arrayList2 = new ArrayList();
                w0(iterable, arrayList2);
                arrayList = arrayList2;
            }
            return k.i0(arrayList);
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return s.f2755a;
        }
        if (size != 1) {
            return z0(collection);
        }
        return U.t.M(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static ArrayList z0(Collection collection) {
        q1.d.e(collection, "<this>");
        return new ArrayList(collection);
    }
}
