package Y;

import android.util.Log;
import c.C0102a;
import c.InterfaceC0103b;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class H implements InterfaceC0103b {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f972f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ S f973g;

    public /* synthetic */ H(S s2, int i) {
        this.f972f = i;
        this.f973g = s2;
    }

    @Override // c.InterfaceC0103b
    public final void b(Object obj) {
        switch (this.f972f) {
            case 0:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i = 0; i < arrayList.size(); i++) {
                    iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
                }
                S s2 = this.f973g;
                N n2 = (N) s2.f994D.pollFirst();
                if (n2 == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    return;
                }
                U.v vVar = s2.f1006c;
                String str = n2.f983a;
                if (vVar.d(str) == null) {
                    Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                    return;
                }
                return;
            case 1:
                C0102a c0102a = (C0102a) obj;
                S s3 = this.f973g;
                N n3 = (N) s3.f994D.pollLast();
                if (n3 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    return;
                }
                U.v vVar2 = s3.f1006c;
                String str2 = n3.f983a;
                AbstractComponentCallbacksC0056x d = vVar2.d(str2);
                if (d != null) {
                    d.r(n3.f984b, c0102a.f1725a, c0102a.f1726b);
                    return;
                }
                Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                return;
            default:
                C0102a c0102a2 = (C0102a) obj;
                S s4 = this.f973g;
                N n4 = (N) s4.f994D.pollFirst();
                if (n4 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    return;
                }
                U.v vVar3 = s4.f1006c;
                String str3 = n4.f983a;
                AbstractComponentCallbacksC0056x d2 = vVar3.d(str3);
                if (d2 != null) {
                    d2.r(n4.f984b, c0102a2.f1725a, c0102a2.f1726b);
                    return;
                }
                Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                return;
        }
    }
}
