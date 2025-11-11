package f0;

import androidx.lifecycle.Q;
import androidx.lifecycle.V;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class o extends Q {

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f2325b = new LinkedHashMap();

    @Override // androidx.lifecycle.Q
    public final void b() {
        LinkedHashMap linkedHashMap = this.f2325b;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((V) it.next()).a();
        }
        linkedHashMap.clear();
    }

    public final String toString() {
        String concat;
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        long identityHashCode = System.identityHashCode(this) & 4294967295L;
        if (identityHashCode >= 0) {
            concat = Long.toString(identityHashCode, 16);
            q1.d.d(concat, "toString(...)");
        } else {
            long j2 = 16;
            long j3 = ((identityHashCode >>> 1) / j2) << 1;
            long j4 = identityHashCode - (j3 * j2);
            if (j4 >= j2) {
                j4 -= j2;
                j3++;
            }
            String l2 = Long.toString(j3, 16);
            q1.d.d(l2, "toString(...)");
            String l3 = Long.toString(j4, 16);
            q1.d.d(l3, "toString(...)");
            concat = l2.concat(l3);
        }
        sb.append(concat);
        sb.append("} ViewModelStores (");
        Iterator it = this.f2325b.keySet().iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        String sb2 = sb.toString();
        q1.d.d(sb2, "toString(...)");
        return sb2;
    }
}
