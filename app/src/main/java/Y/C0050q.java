package Y;

import c.AbstractC0104c;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Y.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0050q extends AbstractC0104c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f1146a;

    public C0050q(AtomicReference atomicReference) {
        this.f1146a = atomicReference;
    }

    @Override // c.AbstractC0104c
    public final void a(Object obj) {
        AbstractC0104c abstractC0104c = (AbstractC0104c) this.f1146a.get();
        if (abstractC0104c == null) {
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }
        abstractC0104c.a(obj);
    }
}
