package j1;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class x implements ListIterator, r1.a {

    /* renamed from: a, reason: collision with root package name */
    public final ListIterator f2758a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f2759b;

    public x(y yVar, int i) {
        this.f2759b = yVar;
        List list = yVar.f2760a;
        if (i >= 0 && i <= yVar.a()) {
            this.f2758a = list.listIterator(yVar.a() - i);
            return;
        }
        throw new IndexOutOfBoundsException("Position index " + i + " must be in range [" + new u1.a(0, yVar.a(), 1) + "].");
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f2758a.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f2758a.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.f2758a.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return k.h0(this.f2759b) - this.f2758a.previousIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.f2758a.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return k.h0(this.f2759b) - this.f2758a.nextIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
