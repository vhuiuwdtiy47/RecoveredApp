package w1;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class i implements Iterator, r1.a {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f4185a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f4186b;

    public i(h hVar) {
        this.f4186b = hVar;
        this.f4185a = ((e) hVar.f4183b).iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4185a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f4186b.f4184c.c(this.f4185a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
