package androidx.lifecycle;

import a.C0062d;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;
import l.AbstractC0271z;
import o0.InterfaceC0306c;

/* loaded from: classes.dex */
public final class M implements InterfaceC0306c {

    /* renamed from: a, reason: collision with root package name */
    public final C.j f1560a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1561b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f1562c;
    public final i1.f d;

    public M(C.j jVar, W w2) {
        q1.d.e(jVar, "savedStateRegistry");
        this.f1560a = jVar;
        this.d = new i1.f(new C0062d(1, w2));
    }

    @Override // o0.InterfaceC0306c
    public final Bundle a() {
        Bundle f2 = Z0.i.f((i1.d[]) Arrays.copyOf(new i1.d[0], 0));
        Bundle bundle = this.f1562c;
        if (bundle != null) {
            f2.putAll(bundle);
        }
        for (Map.Entry entry : b().f1563b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a2 = ((Y.G) ((I) entry.getValue()).f1553a.f261f).a();
            if (!a2.isEmpty()) {
                AbstractC0271z.t(f2, str, a2);
            }
        }
        this.f1561b = false;
        return f2;
    }

    public final N b() {
        return (N) this.d.getValue();
    }

    public final void c() {
        if (this.f1561b) {
            return;
        }
        Bundle b2 = this.f1560a.b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle f2 = Z0.i.f((i1.d[]) Arrays.copyOf(new i1.d[0], 0));
        Bundle bundle = this.f1562c;
        if (bundle != null) {
            f2.putAll(bundle);
        }
        if (b2 != null) {
            f2.putAll(b2);
        }
        this.f1562c = f2;
        this.f1561b = true;
        b();
    }
}
