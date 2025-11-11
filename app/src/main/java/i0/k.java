package i0;

import f0.t;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements p1.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2658a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f2659b;

    public /* synthetic */ k(t tVar, int i) {
        this.f2658a = i;
        this.f2659b = tVar;
    }

    @Override // p1.l
    public final Object c(Object obj) {
        String str = (String) obj;
        switch (this.f2658a) {
            case 0:
                q1.d.e(str, "key");
                return Boolean.valueOf(!this.f2659b.b().contains(str));
            default:
                q1.d.e(str, "key");
                return Boolean.valueOf(!this.f2659b.b().contains(str));
        }
    }
}
