package f0;

import java.util.Iterator;

/* renamed from: f0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0135k implements p1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2312a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f2313b;

    public /* synthetic */ C0135k(y yVar, int i) {
        this.f2312a = i;
        this.f2313b = yVar;
    }

    @Override // p1.a
    public final Object a() {
        int i;
        switch (this.f2312a) {
            case 0:
                y yVar = this.f2313b;
                Y.I i2 = yVar.f2368f;
                boolean z2 = false;
                if (yVar.f2369g) {
                    j1.h hVar = yVar.f2365b.f2640f;
                    if (hVar == null || !hVar.isEmpty()) {
                        Iterator it = hVar.iterator();
                        i = 0;
                        while (it.hasNext()) {
                            if (!(((C0133i) it.next()).f2306b instanceof w) && (i = i + 1) < 0) {
                                throw new ArithmeticException("Count overflow has happened.");
                            }
                        }
                    } else {
                        i = 0;
                    }
                    if (i > 1) {
                        z2 = true;
                    }
                }
                i2.a(z2);
                return i1.g.f2679c;
            default:
                y yVar2 = this.f2313b;
                yVar2.getClass();
                return new z(yVar2.f2364a, yVar2.f2365b.f2650r);
        }
    }
}
