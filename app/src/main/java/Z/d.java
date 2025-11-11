package Z;

import Y.AbstractComponentCallbacksC0056x;
import Y.S;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final c f1217a = c.f1216a;

    public static c a(AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x) {
        while (abstractComponentCallbacksC0056x != null) {
            if (abstractComponentCallbacksC0056x.f1198t != null && abstractComponentCallbacksC0056x.f1189k) {
                abstractComponentCallbacksC0056x.k();
            }
            abstractComponentCallbacksC0056x = abstractComponentCallbacksC0056x.f1200v;
        }
        return f1217a;
    }

    public static void b(a aVar) {
        if (S.H(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(aVar.f1211a.getClass().getName()), aVar);
        }
    }

    public static final void c(AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x, String str) {
        q1.d.e(str, "previousFragmentId");
        b(new a(abstractComponentCallbacksC0056x, "Attempting to reuse fragment " + abstractComponentCallbacksC0056x + " with previous ID " + str));
        a(abstractComponentCallbacksC0056x).getClass();
    }
}
