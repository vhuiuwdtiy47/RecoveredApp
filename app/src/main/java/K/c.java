package K;

/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: c, reason: collision with root package name */
    public final Object f301c;

    public c(int i) {
        super(i);
        this.f301c = new Object();
    }

    @Override // K.b
    public final Object a() {
        Object a2;
        synchronized (this.f301c) {
            a2 = super.a();
        }
        return a2;
    }

    @Override // K.b
    public final boolean c(Object obj) {
        boolean c2;
        synchronized (this.f301c) {
            c2 = super.c(obj);
        }
        return c2;
    }
}
