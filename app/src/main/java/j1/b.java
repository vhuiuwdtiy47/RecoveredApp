package j1;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class b implements Collection, r1.a {
    public abstract int a();

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        if (isEmpty()) {
            return false;
        }
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (q1.d.a(it.next(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        q1.d.e(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return a() == 0;
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return a();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return q1.d.g(this);
    }

    public final String toString() {
        a aVar = new a(this, 0);
        if ((24 & 32) != 0) {
            aVar = null;
        }
        q1.d.e(this, "<this>");
        q1.d.e("[", "prefix");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        Iterator<E> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i++;
            if (i > 1) {
                sb.append((CharSequence) ", ");
            }
            if (aVar != null) {
                sb.append((CharSequence) aVar.c(next));
            } else {
                if (next != null ? next instanceof CharSequence : true) {
                    sb.append((CharSequence) next);
                } else if (next instanceof Character) {
                    sb.append(((Character) next).charValue());
                } else {
                    sb.append((CharSequence) String.valueOf(next));
                }
            }
        }
        sb.append((CharSequence) "]");
        String sb2 = sb.toString();
        q1.d.d(sb2, "toString(...)");
        return sb2;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        q1.d.e(objArr, "array");
        return q1.d.h(this, objArr);
    }
}
