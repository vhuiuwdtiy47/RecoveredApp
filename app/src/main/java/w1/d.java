package w1;

import a.C0072n;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p1.l;

/* loaded from: classes.dex */
public final class d implements Iterator, r1.a {

    /* renamed from: a, reason: collision with root package name */
    public Object f4179a;

    /* renamed from: b, reason: collision with root package name */
    public int f4180b = -2;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f4181c;

    public d(h hVar) {
        this.f4181c = hVar;
    }

    public final void a() {
        Object c2;
        int i = this.f4180b;
        h hVar = this.f4181c;
        if (i == -2) {
            c2 = ((C0072n) hVar.f4183b).f1290c;
        } else {
            l lVar = hVar.f4184c;
            Object obj = this.f4179a;
            q1.d.b(obj);
            c2 = lVar.c(obj);
        }
        this.f4179a = c2;
        this.f4180b = c2 == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f4180b < 0) {
            a();
        }
        return this.f4180b == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f4180b < 0) {
            a();
        }
        if (this.f4180b == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f4179a;
        q1.d.c(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
        this.f4180b = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
