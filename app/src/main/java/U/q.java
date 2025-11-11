package U;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public int f774a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final u f775b;

    /* renamed from: c, reason: collision with root package name */
    public u f776c;
    public u d;

    /* renamed from: e, reason: collision with root package name */
    public int f777e;

    /* renamed from: f, reason: collision with root package name */
    public int f778f;

    public q(u uVar) {
        this.f775b = uVar;
        this.f776c = uVar;
    }

    public final void a() {
        this.f774a = 1;
        this.f776c = this.f775b;
        this.f778f = 0;
    }

    public final boolean b() {
        V.a b2 = this.f776c.f789b.b();
        int a2 = b2.a(6);
        return !(a2 == 0 || ((ByteBuffer) b2.d).get(a2 + b2.f304a) == 0) || this.f777e == 65039;
    }
}
