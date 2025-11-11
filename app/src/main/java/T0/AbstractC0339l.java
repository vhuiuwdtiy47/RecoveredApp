package t0;

/* renamed from: t0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0339l extends AbstractC0338k {

    /* renamed from: a, reason: collision with root package name */
    public D.g[] f3856a;

    /* renamed from: b, reason: collision with root package name */
    public String f3857b;

    /* renamed from: c, reason: collision with root package name */
    public int f3858c;

    public AbstractC0339l() {
        this.f3856a = null;
        this.f3858c = 0;
    }

    public D.g[] getPathData() {
        return this.f3856a;
    }

    public String getPathName() {
        return this.f3857b;
    }

    public void setPathData(D.g[] gVarArr) {
        D.g[] gVarArr2 = this.f3856a;
        boolean z2 = false;
        if (gVarArr2 != null && gVarArr != null && gVarArr2.length == gVarArr.length) {
            int i = 0;
            while (true) {
                if (i >= gVarArr2.length) {
                    z2 = true;
                    break;
                }
                D.g gVar = gVarArr2[i];
                char c2 = gVar.f96a;
                D.g gVar2 = gVarArr[i];
                if (c2 != gVar2.f96a || gVar.f97b.length != gVar2.f97b.length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (!z2) {
            this.f3856a = Z0.i.s(gVarArr);
            return;
        }
        D.g[] gVarArr3 = this.f3856a;
        for (int i2 = 0; i2 < gVarArr.length; i2++) {
            gVarArr3[i2].f96a = gVarArr[i2].f96a;
            int i3 = 0;
            while (true) {
                float[] fArr = gVarArr[i2].f97b;
                if (i3 < fArr.length) {
                    gVarArr3[i2].f97b[i3] = fArr[i3];
                    i3++;
                }
            }
        }
    }

    public AbstractC0339l(AbstractC0339l abstractC0339l) {
        this.f3856a = null;
        this.f3858c = 0;
        this.f3857b = abstractC0339l.f3857b;
        this.f3856a = Z0.i.s(abstractC0339l.f3856a);
    }
}
