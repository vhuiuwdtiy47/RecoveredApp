package f0;

/* renamed from: f0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0132h {

    /* renamed from: a, reason: collision with root package name */
    public final H f2302a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2303b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2304c;
    public final Object d;

    public C0132h(H h, boolean z2, Object obj, boolean z3) {
        if (!h.f2286a && z2) {
            throw new IllegalArgumentException(h.b().concat(" does not allow nullable values").toString());
        }
        if (!z2 && z3 && obj == null) {
            throw new IllegalArgumentException(("Argument with type " + h.b() + " has null value but is not nullable.").toString());
        }
        this.f2302a = h;
        this.f2303b = z2;
        this.d = obj;
        this.f2304c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0132h.class == obj.getClass()) {
            C0132h c0132h = (C0132h) obj;
            if (this.f2303b != c0132h.f2303b || this.f2304c != c0132h.f2304c || !q1.d.a(this.f2302a, c0132h.f2302a)) {
                return false;
            }
            Object obj2 = c0132h.d;
            Object obj3 = this.d;
            if (obj3 != null) {
                return q1.d.a(obj3, obj2);
            }
            if (obj2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.f2302a.hashCode() * 31) + (this.f2303b ? 1 : 0)) * 31) + (this.f2304c ? 1 : 0)) * 31;
        Object obj = this.d;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(q1.i.a(C0132h.class).b());
        sb.append(" Type: " + this.f2302a);
        sb.append(" Nullable: " + this.f2303b);
        if (this.f2304c) {
            sb.append(" DefaultValue: " + this.d);
        }
        String sb2 = sb.toString();
        q1.d.d(sb2, "toString(...)");
        return sb2;
    }
}
