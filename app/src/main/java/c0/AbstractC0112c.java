package c0;

import java.util.LinkedHashMap;

/* renamed from: c0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0112c {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f1741a = new LinkedHashMap();

    public abstract Object a(InterfaceC0111b interfaceC0111b);

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC0112c) && q1.d.a(this.f1741a, ((AbstractC0112c) obj).f1741a);
    }

    public final int hashCode() {
        return this.f1741a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.f1741a + ')';
    }
}
