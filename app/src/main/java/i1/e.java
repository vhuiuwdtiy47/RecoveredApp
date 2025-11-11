package i1;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class e implements b, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2672c = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "b");

    /* renamed from: a, reason: collision with root package name */
    public volatile p1.a f2673a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f2674b;

    @Override // i1.b
    public final Object getValue() {
        Object obj = this.f2674b;
        g gVar = g.f2678b;
        if (obj != gVar) {
            return obj;
        }
        p1.a aVar = this.f2673a;
        if (aVar != null) {
            Object a2 = aVar.a();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2672c;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, gVar, a2)) {
                if (atomicReferenceFieldUpdater.get(this) != gVar) {
                }
            }
            this.f2673a = null;
            return a2;
        }
        return this.f2674b;
    }

    public final String toString() {
        return this.f2674b != g.f2678b ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
