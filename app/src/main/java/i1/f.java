package i1;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class f implements b, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public p1.a f2675a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f2676b = g.f2678b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2677c = this;

    public f(p1.a aVar) {
        this.f2675a = aVar;
    }

    @Override // i1.b
    public final Object getValue() {
        Object obj;
        Object obj2 = this.f2676b;
        g gVar = g.f2678b;
        if (obj2 != gVar) {
            return obj2;
        }
        synchronized (this.f2677c) {
            obj = this.f2676b;
            if (obj == gVar) {
                p1.a aVar = this.f2675a;
                q1.d.b(aVar);
                obj = aVar.a();
                this.f2676b = obj;
                this.f2675a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.f2676b != g.f2678b ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
