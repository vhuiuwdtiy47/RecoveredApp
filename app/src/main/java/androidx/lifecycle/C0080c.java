package androidx.lifecycle;

import java.lang.reflect.Method;

/* renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0080c {

    /* renamed from: a, reason: collision with root package name */
    public final int f1578a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f1579b;

    public C0080c(int i, Method method) {
        this.f1578a = i;
        this.f1579b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0080c)) {
            return false;
        }
        C0080c c0080c = (C0080c) obj;
        return this.f1578a == c0080c.f1578a && this.f1579b.getName().equals(c0080c.f1579b.getName());
    }

    public final int hashCode() {
        return this.f1579b.getName().hashCode() + (this.f1578a * 31);
    }
}
