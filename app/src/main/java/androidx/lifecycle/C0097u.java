package androidx.lifecycle;

/* renamed from: androidx.lifecycle.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0097u {

    /* renamed from: a, reason: collision with root package name */
    public EnumC0092o f1596a;

    /* renamed from: b, reason: collision with root package name */
    public r f1597b;

    public final void a(InterfaceC0096t interfaceC0096t, EnumC0091n enumC0091n) {
        EnumC0092o a2 = enumC0091n.a();
        EnumC0092o enumC0092o = this.f1596a;
        q1.d.e(enumC0092o, "state1");
        if (a2.compareTo(enumC0092o) < 0) {
            enumC0092o = a2;
        }
        this.f1596a = enumC0092o;
        this.f1597b.a(interfaceC0096t, enumC0091n);
        this.f1596a = a2;
    }
}
