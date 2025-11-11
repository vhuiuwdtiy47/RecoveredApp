package o;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class d implements Iterator, Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public int f3482a;

    /* renamed from: b, reason: collision with root package name */
    public int f3483b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3484c;
    public final /* synthetic */ f d;

    public d(f fVar) {
        this.d = fVar;
        this.f3482a = fVar.f3498c - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f3484c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i = this.f3483b;
        f fVar = this.d;
        return q1.d.a(key, fVar.f(i)) && q1.d.a(entry.getValue(), fVar.i(this.f3483b));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f3484c) {
            return this.d.f(this.f3483b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f3484c) {
            return this.d.i(this.f3483b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3483b < this.f3482a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f3484c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i = this.f3483b;
        f fVar = this.d;
        Object f2 = fVar.f(i);
        Object i2 = fVar.i(this.f3483b);
        return (f2 == null ? 0 : f2.hashCode()) ^ (i2 != null ? i2.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f3483b++;
        this.f3484c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f3484c) {
            throw new IllegalStateException();
        }
        this.d.g(this.f3483b);
        this.f3483b--;
        this.f3482a--;
        this.f3484c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f3484c) {
            return this.d.h(this.f3483b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
