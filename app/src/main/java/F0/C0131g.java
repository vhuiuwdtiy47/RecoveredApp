package f0;

import android.os.Bundle;
import l.AbstractC0271z;

/* renamed from: f0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0131g {

    /* renamed from: a, reason: collision with root package name */
    public final int f2299a;

    /* renamed from: b, reason: collision with root package name */
    public C0118A f2300b = null;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f2301c = null;

    public C0131g(int i) {
        this.f2299a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0131g)) {
            return false;
        }
        C0131g c0131g = (C0131g) obj;
        if (this.f2299a != c0131g.f2299a || !q1.d.a(this.f2300b, c0131g.f2300b)) {
            return false;
        }
        Bundle bundle = this.f2301c;
        Bundle bundle2 = c0131g.f2301c;
        if (q1.d.a(bundle, bundle2)) {
            return true;
        }
        return (bundle == null || bundle2 == null || !AbstractC0271z.g(bundle, bundle2)) ? false : true;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f2299a) * 31;
        C0118A c0118a = this.f2300b;
        int hashCode2 = hashCode + (c0118a != null ? c0118a.hashCode() : 0);
        Bundle bundle = this.f2301c;
        if (bundle != null) {
            return AbstractC0271z.h(bundle) + (hashCode2 * 31);
        }
        return hashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C0131g.class.getSimpleName());
        sb.append("(0x");
        sb.append(Integer.toHexString(this.f2299a));
        sb.append(")");
        if (this.f2300b != null) {
            sb.append(" navOptions=");
            sb.append(this.f2300b);
        }
        String sb2 = sb.toString();
        q1.d.d(sb2, "toString(...)");
        return sb2;
    }
}
