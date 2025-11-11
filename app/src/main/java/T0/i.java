package T0;

/* loaded from: classes.dex */
public final class i extends Z0.i {
    @Override // Z0.i
    public final void z(t tVar, float f2, float f3) {
        tVar.d(f3 * f2, 180.0f, 90.0f);
        float f4 = f3 * 2.0f * f2;
        p pVar = new p(0.0f, 0.0f, f4, f4);
        pVar.f735f = 180.0f;
        pVar.f736g = 90.0f;
        tVar.f744f.add(pVar);
        n nVar = new n(pVar);
        tVar.a(180.0f);
        tVar.f745g.add(nVar);
        tVar.d = 270.0f;
        float f5 = (0.0f + f4) * 0.5f;
        float f6 = (f4 - 0.0f) / 2.0f;
        double d = 270.0f;
        tVar.f741b = (((float) Math.cos(Math.toRadians(d))) * f6) + f5;
        tVar.f742c = (f6 * ((float) Math.sin(Math.toRadians(d)))) + f5;
    }
}
