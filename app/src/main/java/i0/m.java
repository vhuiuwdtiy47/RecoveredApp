package i0;

import f0.v;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class m implements Iterator, r1.a {

    /* renamed from: a, reason: collision with root package name */
    public int f2665a = -1;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2666b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f2667c;

    public m(e eVar) {
        this.f2667c = eVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2665a + 1 < ((o.k) this.f2667c.d).e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f2666b = true;
        o.k kVar = (o.k) this.f2667c.d;
        int i = this.f2665a + 1;
        this.f2665a = i;
        return (v) kVar.f(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f2666b) {
            throw new IllegalStateException("You must call next() before you can remove an element");
        }
        o.k kVar = (o.k) this.f2667c.d;
        ((v) kVar.f(this.f2665a)).f2360c = null;
        int i = this.f2665a;
        Object[] objArr = kVar.f3501c;
        Object obj = objArr[i];
        Object obj2 = o.i.f3495b;
        if (obj != obj2) {
            objArr[i] = obj2;
            kVar.f3499a = true;
        }
        this.f2665a = i - 1;
        this.f2666b = false;
    }
}
