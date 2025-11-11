package t;

import java.util.ArrayList;
import u.AbstractC0351h;
import u.C0357n;

/* loaded from: classes.dex */
public abstract class i extends C0326d {

    /* renamed from: q0, reason: collision with root package name */
    public C0326d[] f3822q0 = new C0326d[4];
    public int r0 = 0;

    public final void R(int i, ArrayList arrayList, C0357n c0357n) {
        for (int i2 = 0; i2 < this.r0; i2++) {
            C0326d c0326d = this.f3822q0[i2];
            ArrayList arrayList2 = c0357n.f3920a;
            if (!arrayList2.contains(c0326d)) {
                arrayList2.add(c0326d);
            }
        }
        for (int i3 = 0; i3 < this.r0; i3++) {
            AbstractC0351h.b(this.f3822q0[i3], i, arrayList, c0357n);
        }
    }

    public void S() {
    }
}
