package o;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class e implements Collection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f3485a;

    public e(f fVar) {
        this.f3485a = fVar;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f3485a.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f3485a.a(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f3485a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.f3485a, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        f fVar = this.f3485a;
        int a2 = fVar.a(obj);
        if (a2 < 0) {
            return false;
        }
        fVar.g(a2);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        f fVar = this.f3485a;
        int i = fVar.f3498c;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < i) {
            if (collection.contains(fVar.i(i2))) {
                fVar.g(i2);
                i2--;
                i--;
                z2 = true;
            }
            i2++;
        }
        return z2;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        f fVar = this.f3485a;
        int i = fVar.f3498c;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < i) {
            if (!collection.contains(fVar.i(i2))) {
                fVar.g(i2);
                i2--;
                i--;
                z2 = true;
            }
            i2++;
        }
        return z2;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f3485a.f3498c;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        f fVar = this.f3485a;
        int i = fVar.f3498c;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = fVar.i(i2);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        f fVar = this.f3485a;
        int i = fVar.f3498c;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = fVar.i(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
