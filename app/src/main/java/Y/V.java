package Y;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class V extends androidx.lifecycle.Q {
    public static final U h = new U(0);

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1036e;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1034b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f1035c = new HashMap();
    public final HashMap d = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public boolean f1037f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1038g = false;

    public V(boolean z2) {
        this.f1036e = z2;
    }

    @Override // androidx.lifecycle.Q
    public final void b() {
        if (S.H(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f1037f = true;
    }

    public final void c(AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x, boolean z2) {
        if (S.H(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + abstractComponentCallbacksC0056x);
        }
        e(abstractComponentCallbacksC0056x.f1185e, z2);
    }

    public final void d(String str, boolean z2) {
        if (S.H(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        e(str, z2);
    }

    public final void e(String str, boolean z2) {
        HashMap hashMap = this.f1035c;
        V v2 = (V) hashMap.get(str);
        if (v2 != null) {
            if (z2) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(v2.f1035c.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    v2.d((String) it.next(), true);
                }
            }
            v2.b();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.d;
        androidx.lifecycle.V v3 = (androidx.lifecycle.V) hashMap2.get(str);
        if (v3 != null) {
            v3.a();
            hashMap2.remove(str);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && V.class == obj.getClass()) {
            V v2 = (V) obj;
            if (this.f1034b.equals(v2.f1034b) && this.f1035c.equals(v2.f1035c) && this.d.equals(v2.d)) {
                return true;
            }
        }
        return false;
    }

    public final void f(AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x) {
        if (this.f1038g) {
            if (S.H(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f1034b.remove(abstractComponentCallbacksC0056x.f1185e) == null || !S.H(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + abstractComponentCallbacksC0056x);
        }
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f1035c.hashCode() + (this.f1034b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f1034b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f1035c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
