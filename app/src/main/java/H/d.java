package H;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f184a;

    /* renamed from: b, reason: collision with root package name */
    public c f185b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f186c;

    public final void a(c cVar) {
        synchronized (this) {
            while (this.f186c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } finally {
                }
            }
            if (this.f185b == cVar) {
                return;
            }
            this.f185b = cVar;
            if (this.f184a) {
                cVar.a();
            }
        }
    }
}
