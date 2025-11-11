package j1;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class d extends c implements ListIterator {
    public final /* synthetic */ f d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, int i) {
        super(0, fVar);
        this.d = fVar;
        int a2 = fVar.a();
        if (i >= 0 && i <= a2) {
            this.f2742b = i;
            return;
        }
        throw new IndexOutOfBoundsException("index: " + i + ", size: " + a2);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f2742b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f2742b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f2742b - 1;
        this.f2742b = i;
        return this.d.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f2742b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
