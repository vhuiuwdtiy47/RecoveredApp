package n;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class d extends e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public c f3230a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3231b = true;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f3232c;

    public d(f fVar) {
        this.f3232c = fVar;
    }

    @Override // n.e
    public final void a(c cVar) {
        c cVar2 = this.f3230a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f3230a = cVar3;
            this.f3231b = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3231b) {
            return this.f3232c.f3233a != null;
        }
        c cVar = this.f3230a;
        return (cVar == null || cVar.f3229c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f3231b) {
            this.f3231b = false;
            this.f3230a = this.f3232c.f3233a;
        } else {
            c cVar = this.f3230a;
            this.f3230a = cVar != null ? cVar.f3229c : null;
        }
        return this.f3230a;
    }
}
