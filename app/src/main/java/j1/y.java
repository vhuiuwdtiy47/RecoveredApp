package j1;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class y extends f {

    /* renamed from: a, reason: collision with root package name */
    public final List f2760a;

    public y(List list) {
        this.f2760a = list;
    }

    @Override // j1.b
    public final int a() {
        return this.f2760a.size();
    }

    @Override // java.util.List
    public final Object get(int i) {
        if (i >= 0 && i <= k.h0(this)) {
            return this.f2760a.get(k.h0(this) - i);
        }
        throw new IndexOutOfBoundsException("Element index " + i + " must be in range [" + new u1.a(0, k.h0(this), 1) + "].");
    }

    @Override // j1.f, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new x(this, 0);
    }

    @Override // j1.f, java.util.List
    public final ListIterator listIterator() {
        return new x(this, 0);
    }

    @Override // j1.f, java.util.List
    public final ListIterator listIterator(int i) {
        return new x(this, i);
    }
}
