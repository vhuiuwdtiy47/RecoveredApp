package f0;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class L {

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f2289b = new LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f2290a = new LinkedHashMap();

    public final void a(K k2) {
        String B2 = U.t.B(k2.getClass());
        if (B2.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        LinkedHashMap linkedHashMap = this.f2290a;
        K k3 = (K) linkedHashMap.get(B2);
        if (q1.d.a(k3, k2)) {
            return;
        }
        boolean z2 = false;
        if (k3 != null && k3.f2288b) {
            z2 = true;
        }
        if (z2) {
            throw new IllegalStateException(("Navigator " + k2 + " is replacing an already attached " + k3).toString());
        }
        if (!k2.f2288b) {
            return;
        }
        throw new IllegalStateException(("Navigator " + k2 + " is already attached to another NavController").toString());
    }

    public final K b(String str) {
        q1.d.e(str, "name");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        K k2 = (K) this.f2290a.get(str);
        if (k2 != null) {
            return k2;
        }
        throw new IllegalStateException(D.f.d("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
    }
}
