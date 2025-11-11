package k;

/* renamed from: k.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0171e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f2797a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f2798b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f2799c;
    public final /* synthetic */ A0.c d;

    public RunnableC0171e(A0.c cVar, f fVar, o oVar, m mVar) {
        this.d = cVar;
        this.f2797a = fVar;
        this.f2798b = oVar;
        this.f2799c = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f fVar = this.f2797a;
        if (fVar != null) {
            A0.c cVar = this.d;
            ((g) cVar.f33b).f2824z = true;
            fVar.f2801b.c(false);
            ((g) cVar.f33b).f2824z = false;
        }
        o oVar = this.f2798b;
        if (oVar.isEnabled() && oVar.hasSubMenu()) {
            this.f2799c.q(oVar, null, 4);
        }
    }
}
