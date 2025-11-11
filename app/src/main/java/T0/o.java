package T0;

/* loaded from: classes.dex */
public final class o extends s {

    /* renamed from: a, reason: collision with root package name */
    public final q f729a;

    /* renamed from: b, reason: collision with root package name */
    public final float f730b;

    /* renamed from: c, reason: collision with root package name */
    public final float f731c;

    public o(q qVar, float f2, float f3) {
        this.f729a = qVar;
        this.f730b = f2;
        this.f731c = f3;
    }

    public final float a() {
        q qVar = this.f729a;
        return (float) Math.toDegrees(Math.atan((qVar.f738c - this.f731c) / (qVar.f737b - this.f730b)));
    }
}
