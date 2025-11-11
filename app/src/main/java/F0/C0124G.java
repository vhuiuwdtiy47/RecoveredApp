package f0;

import android.os.Bundle;
import java.io.Serializable;

/* renamed from: f0.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0124G extends H {

    /* renamed from: r, reason: collision with root package name */
    public final Class f2272r;

    public C0124G(Class cls) {
        super(true);
        if (Serializable.class.isAssignableFrom(cls)) {
            if (!cls.isEnum()) {
                this.f2272r = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " is an Enum. You should use EnumType instead.").toString());
        }
        throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
    }

    @Override // f0.H
    public final Object a(Bundle bundle, String str) {
        q1.d.e(bundle, "bundle");
        return (Serializable) bundle.get(str);
    }

    @Override // f0.H
    public String b() {
        return this.f2272r.getName();
    }

    @Override // f0.H
    public final void e(Bundle bundle, String str, Object obj) {
        Serializable serializable = (Serializable) obj;
        q1.d.e(str, "key");
        q1.d.e(serializable, "value");
        this.f2272r.cast(serializable);
        bundle.putSerializable(str, serializable);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0124G)) {
            return false;
        }
        return q1.d.a(this.f2272r, ((C0124G) obj).f2272r);
    }

    @Override // f0.H
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Serializable d(String str) {
        q1.d.e(str, "value");
        throw new UnsupportedOperationException("Serializables don't support default values.");
    }

    public final int hashCode() {
        return this.f2272r.hashCode();
    }

    public C0124G(int i, Class cls) {
        super(false);
        if (Serializable.class.isAssignableFrom(cls)) {
            this.f2272r = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
    }
}
