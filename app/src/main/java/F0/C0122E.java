package f0;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;

/* renamed from: f0.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0122E extends H {

    /* renamed from: r, reason: collision with root package name */
    public final Class f2270r;

    public C0122E(Class cls) {
        super(true);
        if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
            this.f2270r = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " does not implement Parcelable or Serializable.").toString());
    }

    @Override // f0.H
    public final Object a(Bundle bundle, String str) {
        q1.d.e(bundle, "bundle");
        return bundle.get(str);
    }

    @Override // f0.H
    public final String b() {
        return this.f2270r.getName();
    }

    @Override // f0.H
    public final Object d(String str) {
        q1.d.e(str, "value");
        throw new UnsupportedOperationException("Parcelables don't support default values.");
    }

    @Override // f0.H
    public final void e(Bundle bundle, String str, Object obj) {
        q1.d.e(str, "key");
        this.f2270r.cast(obj);
        if (obj == null || (obj instanceof Parcelable)) {
            bundle.putParcelable(str, (Parcelable) obj);
        } else if (obj instanceof Serializable) {
            bundle.putSerializable(str, (Serializable) obj);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C0122E.class.equals(obj.getClass())) {
            return false;
        }
        return q1.d.a(this.f2270r, ((C0122E) obj).f2270r);
    }

    public final int hashCode() {
        return this.f2270r.hashCode();
    }
}
