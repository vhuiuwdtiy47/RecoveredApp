package D;

import android.graphics.Insets;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final c f91e = new c(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f92a;

    /* renamed from: b, reason: collision with root package name */
    public final int f93b;

    /* renamed from: c, reason: collision with root package name */
    public final int f94c;
    public final int d;

    public c(int i, int i2, int i3, int i4) {
        this.f92a = i;
        this.f93b = i2;
        this.f94c = i3;
        this.d = i4;
    }

    public static c a(c cVar, c cVar2) {
        return b(Math.max(cVar.f92a, cVar2.f92a), Math.max(cVar.f93b, cVar2.f93b), Math.max(cVar.f94c, cVar2.f94c), Math.max(cVar.d, cVar2.d));
    }

    public static c b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f91e : new c(i, i2, i3, i4);
    }

    public static c c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return b.a(this.f92a, this.f93b, this.f94c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.d == cVar.d && this.f92a == cVar.f92a && this.f94c == cVar.f94c && this.f93b == cVar.f93b;
    }

    public final int hashCode() {
        return (((((this.f92a * 31) + this.f93b) * 31) + this.f94c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.f92a + ", top=" + this.f93b + ", right=" + this.f94c + ", bottom=" + this.d + '}';
    }
}
