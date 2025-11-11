package T0;

/* loaded from: classes.dex */
public final class d extends Z0.i {
    @Override // Z0.i
    public final void z(t tVar, float f2, float f3) {
        tVar.d(f3 * f2, 180.0f, 90.0f);
        double d = f3;
        double d2 = f2;
        tVar.c((float) (Math.sin(Math.toRadians(90.0f)) * d * d2), (float) (Math.sin(Math.toRadians(0.0f)) * d * d2));
    }
}
