package w1;

import j1.q;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f4173a;

    public a(q qVar) {
        this.f4173a = new AtomicReference(qVar);
    }

    @Override // w1.e
    public final Iterator iterator() {
        e eVar = (e) this.f4173a.getAndSet(null);
        if (eVar != null) {
            return eVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
