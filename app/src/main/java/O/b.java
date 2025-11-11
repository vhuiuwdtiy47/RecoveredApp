package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b implements Iterator, r1.a {

    /* renamed from: a, reason: collision with root package name */
    public int f3477a;

    /* renamed from: b, reason: collision with root package name */
    public int f3478b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3479c;
    public final /* synthetic */ int d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3480e;

    public b(int i) {
        this.f3477a = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3478b < this.f3477a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object f2;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f3478b;
        switch (this.d) {
            case 0:
                f2 = ((f) this.f3480e).f(i);
                break;
            case 1:
                f2 = ((f) this.f3480e).i(i);
                break;
            default:
                f2 = ((g) this.f3480e).f3489b[i];
                break;
        }
        this.f3478b++;
        this.f3479c = true;
        return f2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f3479c) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i = this.f3478b - 1;
        this.f3478b = i;
        switch (this.d) {
            case 0:
                ((f) this.f3480e).g(i);
                break;
            case 1:
                ((f) this.f3480e).g(i);
                break;
            default:
                ((g) this.f3480e).a(i);
                break;
        }
        this.f3477a--;
        this.f3479c = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(g gVar) {
        this(gVar.f3490c);
        this.d = 2;
        this.f3480e = gVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(f fVar, int i) {
        this(fVar.f3498c);
        this.d = i;
        switch (i) {
            case 1:
                this.f3480e = fVar;
                this(fVar.f3498c);
                return;
            default:
                this.f3480e = fVar;
                return;
        }
    }
}
