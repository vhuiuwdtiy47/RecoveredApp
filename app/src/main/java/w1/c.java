package w1;

import j1.q;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class c implements Iterator, r1.a {

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f4176b;
    public Object d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f4178e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4175a = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f4177c = -1;

    public c(q qVar) {
        this.f4178e = qVar;
        this.f4176b = new i((h) qVar.f2753b);
    }

    public void a() {
        boolean z2;
        Object next;
        do {
            Iterator it = this.f4176b;
            z2 = false;
            if (!it.hasNext()) {
                this.f4177c = 0;
                return;
            }
            next = it.next();
            ((q) this.f4178e).getClass();
            if (next == null) {
                z2 = true;
            }
        } while (z2);
        this.d = next;
        this.f4177c = 1;
    }

    public void b() {
        Iterator it = this.f4176b;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((h) this.f4178e).f4184c.c(next)).booleanValue()) {
                this.f4177c = 1;
                this.d = next;
                return;
            }
        }
        this.f4177c = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f4175a) {
            case 0:
                if (this.f4177c == -1) {
                    a();
                }
                return this.f4177c == 1;
            default:
                if (this.f4177c == -1) {
                    b();
                }
                return this.f4177c == 1;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f4175a) {
            case 0:
                if (this.f4177c == -1) {
                    a();
                }
                if (this.f4177c == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.d;
                this.d = null;
                this.f4177c = -1;
                return obj;
            default:
                if (this.f4177c == -1) {
                    b();
                }
                if (this.f4177c == 0) {
                    throw new NoSuchElementException();
                }
                Object obj2 = this.d;
                this.d = null;
                this.f4177c = -1;
                return obj2;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f4175a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public c(h hVar) {
        this.f4178e = hVar;
        this.f4176b = ((e) hVar.f4183b).iterator();
    }
}
