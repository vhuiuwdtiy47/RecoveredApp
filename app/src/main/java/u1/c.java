package u1;

/* loaded from: classes.dex */
public final class c extends a {
    public static final c d = new a(1, 0, 1);

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (isEmpty() && ((c) obj).isEmpty()) {
            return true;
        }
        c cVar = (c) obj;
        if (this.f3939a == cVar.f3939a) {
            return this.f3940b == cVar.f3940b;
        }
        return false;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f3939a * 31) + this.f3940b;
    }

    public final boolean isEmpty() {
        return this.f3939a > this.f3940b;
    }

    public final String toString() {
        return this.f3939a + ".." + this.f3940b;
    }
}
