package f0;

import android.os.Bundle;
import android.os.Parcelable;

/* renamed from: f0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0121D extends H {

    /* renamed from: r, reason: collision with root package name */
    public final Class f2269r;

    public C0121D(Class cls) {
        super(true);
        if (!Parcelable.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException((cls + " does not implement Parcelable.").toString());
        }
        try {
            this.f2269r = Class.forName("[L" + cls.getName() + ';');
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // f0.H
    public final Object a(Bundle bundle, String str) {
        q1.d.e(bundle, "bundle");
        return (Parcelable[]) bundle.get(str);
    }

    @Override // f0.H
    public final String b() {
        return this.f2269r.getName();
    }

    @Override // f0.H
    public final Object d(String str) {
        q1.d.e(str, "value");
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    @Override // f0.H
    public final void e(Bundle bundle, String str, Object obj) {
        Parcelable[] parcelableArr = (Parcelable[]) obj;
        q1.d.e(str, "key");
        this.f2269r.cast(parcelableArr);
        bundle.putParcelableArray(str, parcelableArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C0121D.class.equals(obj.getClass())) {
            return false;
        }
        return q1.d.a(this.f2269r, ((C0121D) obj).f2269r);
    }

    public final int hashCode() {
        return this.f2269r.hashCode();
    }
}
