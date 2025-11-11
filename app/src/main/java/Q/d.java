package q;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import l.AbstractC0271z;

/* loaded from: classes.dex */
public final class d extends AbstractC0271z {

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3519c;
    public final AtomicReferenceFieldUpdater d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3520e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3521f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3522g;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f3519c = atomicReferenceFieldUpdater;
        this.d = atomicReferenceFieldUpdater2;
        this.f3520e = atomicReferenceFieldUpdater3;
        this.f3521f = atomicReferenceFieldUpdater4;
        this.f3522g = atomicReferenceFieldUpdater5;
    }

    @Override // l.AbstractC0271z
    public final boolean a(g gVar, C0312c c0312c) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C0312c c0312c2 = C0312c.f3517b;
        do {
            atomicReferenceFieldUpdater = this.f3521f;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, c0312c, c0312c2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == c0312c);
        return false;
    }

    @Override // l.AbstractC0271z
    public final boolean b(g gVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3522g;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == obj);
        return false;
    }

    @Override // l.AbstractC0271z
    public final boolean c(g gVar, f fVar, f fVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3520e;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, fVar, fVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == fVar);
        return false;
    }

    @Override // l.AbstractC0271z
    public final void r(f fVar, f fVar2) {
        this.d.lazySet(fVar, fVar2);
    }

    @Override // l.AbstractC0271z
    public final void v(f fVar, Thread thread) {
        this.f3519c.lazySet(fVar, thread);
    }
}
