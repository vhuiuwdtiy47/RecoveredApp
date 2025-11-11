package i1;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class d implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2670a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2671b;

    public d(Object obj, Object obj2) {
        this.f2670a = obj;
        this.f2671b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return q1.d.a(this.f2670a, dVar.f2670a) && q1.d.a(this.f2671b, dVar.f2671b);
    }

    public final int hashCode() {
        Object obj = this.f2670a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f2671b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f2670a + ", " + this.f2671b + ')';
    }
}
