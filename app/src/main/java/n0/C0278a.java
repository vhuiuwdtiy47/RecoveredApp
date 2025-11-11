package n0;

/* renamed from: n0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0278a {

    /* renamed from: a, reason: collision with root package name */
    public int f3316a;

    /* renamed from: b, reason: collision with root package name */
    public int f3317b;

    /* renamed from: c, reason: collision with root package name */
    public int f3318c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C0278a.class != obj.getClass()) {
                return false;
            }
            C0278a c0278a = (C0278a) obj;
            int i = this.f3316a;
            if (i != c0278a.f3316a) {
                return false;
            }
            if (i != 8 || Math.abs(this.f3318c - this.f3317b) != 1 || this.f3318c != c0278a.f3317b || this.f3317b != c0278a.f3318c) {
                return this.f3318c == c0278a.f3318c && this.f3317b == c0278a.f3317b;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f3316a * 31) + this.f3317b) * 31) + this.f3318c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.f3316a;
        sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.f3317b);
        sb.append("c:");
        sb.append(this.f3318c);
        sb.append(",p:null]");
        return sb.toString();
    }
}
