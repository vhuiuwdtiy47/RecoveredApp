package e0;

import Y.U;
import androidx.lifecycle.Q;
import o.k;

/* renamed from: e0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0116a extends Q {

    /* renamed from: c, reason: collision with root package name */
    public static final U f2189c = new U(1);

    /* renamed from: b, reason: collision with root package name */
    public final k f2190b = new k(0);

    @Override // androidx.lifecycle.Q
    public final void b() {
        k kVar = this.f2190b;
        if (kVar.e() > 0) {
            kVar.f(0).getClass();
            throw new ClassCastException();
        }
        int i = kVar.d;
        Object[] objArr = kVar.f3501c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        kVar.d = 0;
        kVar.f3499a = false;
    }
}
