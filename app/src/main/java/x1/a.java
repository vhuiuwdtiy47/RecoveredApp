package x1;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f4198a;

    /* renamed from: b, reason: collision with root package name */
    public final u1.c f4199b;

    public a(String str, u1.c cVar) {
        this.f4198a = str;
        this.f4199b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return q1.d.a(this.f4198a, aVar.f4198a) && q1.d.a(this.f4199b, aVar.f4199b);
    }

    public final int hashCode() {
        return this.f4199b.hashCode() + (this.f4198a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f4198a + ", range=" + this.f4199b + ')';
    }
}
