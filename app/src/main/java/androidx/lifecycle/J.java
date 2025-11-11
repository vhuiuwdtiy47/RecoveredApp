package androidx.lifecycle;

/* loaded from: classes.dex */
public final class J implements r, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final String f1554a;

    /* renamed from: b, reason: collision with root package name */
    public final I f1555b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1556c;

    public J(String str, I i) {
        this.f1554a = str;
        this.f1555b = i;
    }

    @Override // androidx.lifecycle.r
    public final void a(InterfaceC0096t interfaceC0096t, EnumC0091n enumC0091n) {
        if (enumC0091n == EnumC0091n.ON_DESTROY) {
            this.f1556c = false;
            interfaceC0096t.d().f(this);
        }
    }

    public final void b(C.j jVar, C0098v c0098v) {
        q1.d.e(jVar, "registry");
        q1.d.e(c0098v, "lifecycle");
        if (this.f1556c) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f1556c = true;
        c0098v.a(this);
        jVar.I(this.f1554a, (Y.G) this.f1555b.f1553a.f261f);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
