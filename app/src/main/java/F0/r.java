package f0;

import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.EnumC0091n;
import androidx.lifecycle.InterfaceC0096t;
import f0.C0133i;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements p1.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2329a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2330b;

    public /* synthetic */ r(int i, Object obj) {
        this.f2329a = i;
        this.f2330b = obj;
    }

    @Override // p1.l
    public final Object c(Object obj) {
        switch (this.f2329a) {
            case 0:
                q1.d.e((String) obj, "argName");
                q1.d.e((Bundle) this.f2330b, "source");
                return Boolean.valueOf(!r1.containsKey(r2));
            case 1:
                q1.d.e((String) obj, "key");
                q1.d.e((Bundle) this.f2330b, "source");
                return Boolean.valueOf(!r1.containsKey(r2));
            default:
                final C0133i c0133i = (C0133i) obj;
                q1.d.e(c0133i, "entry");
                final h0.j jVar = (h0.j) this.f2330b;
                return new androidx.lifecycle.r() { // from class: h0.f
                    @Override // androidx.lifecycle.r
                    public final void a(InterfaceC0096t interfaceC0096t, EnumC0091n enumC0091n) {
                        EnumC0091n enumC0091n2 = EnumC0091n.ON_RESUME;
                        j jVar2 = j.this;
                        C0133i c0133i2 = c0133i;
                        if (enumC0091n == enumC0091n2 && ((List) ((y1.c) ((y1.a) jVar2.b().f2322e.f33b)).a()).contains(c0133i2)) {
                            if (j.n()) {
                                Log.v("FragmentNavigator", "Marking transition complete for entry " + c0133i2 + " due to fragment " + interfaceC0096t + " view lifecycle reaching RESUMED");
                            }
                            jVar2.b().c(c0133i2);
                        }
                        if (enumC0091n == EnumC0091n.ON_DESTROY) {
                            jVar2.getClass();
                            if (j.n()) {
                                Log.v("FragmentNavigator", "Marking transition complete for entry " + c0133i2 + " due to fragment " + interfaceC0096t + " view lifecycle reaching DESTROYED");
                            }
                            jVar2.b().c(c0133i2);
                        }
                    }
                };
        }
    }
}
