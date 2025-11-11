package androidx.lifecycle;

/* loaded from: classes.dex */
public final class y extends z implements r {

    /* renamed from: e, reason: collision with root package name */
    public final Object f1606e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ A f1607f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(A a2, InterfaceC0096t interfaceC0096t, B b2) {
        super(a2, b2);
        this.f1607f = a2;
        this.f1606e = interfaceC0096t;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.lifecycle.t, java.lang.Object] */
    @Override // androidx.lifecycle.r
    public final void a(InterfaceC0096t interfaceC0096t, EnumC0091n enumC0091n) {
        ?? r3 = this.f1606e;
        EnumC0092o enumC0092o = r3.d().f1600c;
        if (enumC0092o != EnumC0092o.f1590a) {
            EnumC0092o enumC0092o2 = null;
            while (enumC0092o2 != enumC0092o) {
                b(e());
                enumC0092o2 = enumC0092o;
                enumC0092o = r3.d().f1600c;
            }
            return;
        }
        A a2 = this.f1607f;
        a2.getClass();
        A.a("removeObserver");
        z zVar = (z) a2.f1541b.b(this.f1608a);
        if (zVar == null) {
            return;
        }
        zVar.c();
        zVar.b(false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.lifecycle.t, java.lang.Object] */
    @Override // androidx.lifecycle.z
    public final void c() {
        this.f1606e.d().f(this);
    }

    @Override // androidx.lifecycle.z
    public final boolean d(InterfaceC0096t interfaceC0096t) {
        return this.f1606e == interfaceC0096t;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.lifecycle.t, java.lang.Object] */
    @Override // androidx.lifecycle.z
    public final boolean e() {
        return this.f1606e.d().f1600c.compareTo(EnumC0092o.d) >= 0;
    }
}
