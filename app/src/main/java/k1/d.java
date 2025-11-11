package k1;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class d extends AbstractSet implements Set, r1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2923a;

    /* renamed from: b, reason: collision with root package name */
    public final c f2924b;

    public /* synthetic */ d(c cVar, int i) {
        this.f2923a = i;
        this.f2924b = cVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f2923a) {
            case 0:
                q1.d.e((Map.Entry) obj, "element");
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.f2923a) {
            case 0:
                q1.d.e(collection, "elements");
                throw new UnsupportedOperationException();
            default:
                q1.d.e(collection, "elements");
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f2923a) {
            case 0:
                this.f2924b.clear();
                return;
            default:
                this.f2924b.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f2923a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                q1.d.e(entry, "element");
                return this.f2924b.e(entry);
            default:
                return this.f2924b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.f2923a) {
            case 0:
                q1.d.e(collection, "elements");
                return this.f2924b.d(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f2923a) {
            case 0:
                return this.f2924b.isEmpty();
            default:
                return this.f2924b.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f2923a) {
            case 0:
                c cVar = this.f2924b;
                cVar.getClass();
                return new a(cVar, 0);
            default:
                c cVar2 = this.f2924b;
                cVar2.getClass();
                return new a(cVar2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f2923a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                q1.d.e(entry, "element");
                c cVar = this.f2924b;
                cVar.getClass();
                cVar.b();
                int g2 = cVar.g(entry.getKey());
                if (g2 < 0) {
                    return false;
                }
                Object[] objArr = cVar.f2914b;
                q1.d.b(objArr);
                if (!q1.d.a(objArr[g2], entry.getValue())) {
                    return false;
                }
                cVar.k(g2);
                return true;
            default:
                c cVar2 = this.f2924b;
                cVar2.b();
                int g3 = cVar2.g(obj);
                if (g3 < 0) {
                    return false;
                }
                cVar2.k(g3);
                return true;
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        switch (this.f2923a) {
            case 0:
                q1.d.e(collection, "elements");
                this.f2924b.b();
                return super.removeAll(collection);
            default:
                q1.d.e(collection, "elements");
                this.f2924b.b();
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        switch (this.f2923a) {
            case 0:
                q1.d.e(collection, "elements");
                this.f2924b.b();
                return super.retainAll(collection);
            default:
                q1.d.e(collection, "elements");
                this.f2924b.b();
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f2923a) {
            case 0:
                return this.f2924b.i;
            default:
                return this.f2924b.i;
        }
    }
}
