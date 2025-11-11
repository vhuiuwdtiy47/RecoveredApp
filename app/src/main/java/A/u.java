package a;

import java.io.Serializable;

/* loaded from: classes.dex */
public final /* synthetic */ class u implements p1.a, q1.c, Serializable, i1.a {

    /* renamed from: a, reason: collision with root package name */
    public transient u f1303a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1304b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1305c = false;
    public final int d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1306e;

    public u(int i, Object obj) {
        this.f1306e = i;
        this.f1304b = obj;
    }

    @Override // p1.a
    public final Object a() {
        switch (this.f1306e) {
            case 0:
                ((v) this.f1304b).c();
                return i1.g.f2679c;
            default:
                ((v) this.f1304b).c();
                return i1.g.f2679c;
        }
    }

    @Override // q1.c
    public final int b() {
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [q1.a, java.lang.Object] */
    public final q1.a d() {
        if (!this.f1305c) {
            return q1.i.a(v.class);
        }
        q1.i.f3543a.getClass();
        return new Object();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            uVar.getClass();
            return this.d == uVar.d && this.f1304b.equals(uVar.f1304b) && d().equals(uVar.d());
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar2 = this.f1303a;
        if (uVar2 == null) {
            q1.i.f3543a.getClass();
            this.f1303a = this;
        } else {
            this = uVar2;
        }
        return obj.equals(this);
    }

    public final int hashCode() {
        d();
        return (((d().hashCode() * 31) + 986734966) * 31) + 1065238079;
    }

    public final String toString() {
        u uVar = this.f1303a;
        if (uVar == null) {
            q1.i.f3543a.getClass();
            this.f1303a = this;
            uVar = this;
        }
        return uVar != this ? uVar.toString() : "function updateEnabledCallbacks (Kotlin reflection is not available)";
    }
}
