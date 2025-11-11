package i1;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class h implements b, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public p1.a f2681a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2682b;

    @Override // i1.b
    public final Object getValue() {
        if (this.f2682b == g.f2678b) {
            p1.a aVar = this.f2681a;
            q1.d.b(aVar);
            this.f2682b = aVar.a();
            this.f2681a = null;
        }
        return this.f2682b;
    }

    public final String toString() {
        return this.f2682b != g.f2678b ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
