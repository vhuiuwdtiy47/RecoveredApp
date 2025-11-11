package i0;

import f0.C0133i;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements p1.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q1.g f2626a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q1.g f2627b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f2628c;
    public final /* synthetic */ boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j1.h f2629e;

    public /* synthetic */ g(q1.g gVar, q1.g gVar2, j jVar, boolean z2, j1.h hVar) {
        this.f2626a = gVar;
        this.f2627b = gVar2;
        this.f2628c = jVar;
        this.d = z2;
        this.f2629e = hVar;
    }

    @Override // p1.l
    public final Object c(Object obj) {
        C0133i c0133i = (C0133i) obj;
        q1.d.e(c0133i, "entry");
        this.f2626a.f3541a = true;
        this.f2627b.f3541a = true;
        this.f2628c.l(c0133i, this.d, this.f2629e);
        return i1.g.f2679c;
    }
}
