package Y;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import c.C0102a;
import c.C0109h;
import g.AbstractActivityC0146i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class M extends U.t {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f982e;

    public /* synthetic */ M(int i) {
        this.f982e = i;
    }

    @Override // U.t
    public A0.c G(AbstractActivityC0146i abstractActivityC0146i, Object obj) {
        switch (this.f982e) {
            case 1:
                String[] strArr = (String[]) obj;
                q1.d.e(strArr, "input");
                if (strArr.length == 0) {
                    return new A0.c(19, j1.t.f2756a);
                }
                for (String str : strArr) {
                    if (Z0.i.j(abstractActivityC0146i, str) != 0) {
                        return null;
                    }
                }
                int h02 = j1.w.h0(strArr.length);
                if (h02 < 16) {
                    h02 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(h02);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new A0.c(19, linkedHashMap);
            case 2:
                String str3 = (String) obj;
                q1.d.e(str3, "input");
                if (Z0.i.j(abstractActivityC0146i, str3) != 0) {
                    return null;
                }
                return new A0.c(19, Boolean.TRUE);
            default:
                return super.G(abstractActivityC0146i, obj);
        }
    }

    @Override // U.t
    public final Object S(int i, Intent intent) {
        switch (this.f982e) {
            case 0:
                return new C0102a(i, intent);
            case 1:
                j1.t tVar = j1.t.f2756a;
                if (i != -1 || intent == null) {
                    return tVar;
                }
                String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if (intArrayExtra == null || stringArrayExtra == null) {
                    return tVar;
                }
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i2 : intArrayExtra) {
                    arrayList.add(Boolean.valueOf(i2 == 0));
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str : stringArrayExtra) {
                    if (str != null) {
                        arrayList2.add(str);
                    }
                }
                Iterator it = arrayList2.iterator();
                Iterator it2 = arrayList.iterator();
                ArrayList arrayList3 = new ArrayList(Math.min(j1.l.k0(arrayList2, 10), j1.l.k0(arrayList, 10)));
                while (it.hasNext() && it2.hasNext()) {
                    arrayList3.add(new i1.d(it.next(), it2.next()));
                }
                return j1.w.i0(arrayList3);
            case 2:
                if (intent == null || i != -1) {
                    return Boolean.FALSE;
                }
                int[] intArrayExtra2 = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                boolean z2 = false;
                if (intArrayExtra2 != null) {
                    int length = intArrayExtra2.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length) {
                            if (intArrayExtra2[i3] == 0) {
                                z2 = true;
                            } else {
                                i3++;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z2);
            default:
                return new C0102a(i, intent);
        }
    }

    @Override // U.t
    public final Intent o(AbstractActivityC0146i abstractActivityC0146i, Object obj) {
        Bundle bundleExtra;
        switch (this.f982e) {
            case 0:
                C0109h c0109h = (C0109h) obj;
                Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent2 = c0109h.f1738b;
                if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        c0109h = new C0109h(c0109h.f1737a, null, c0109h.f1739c, c0109h.d);
                    }
                }
                intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", c0109h);
                if (S.H(2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
                }
                return intent;
            case 1:
                String[] strArr = (String[]) obj;
                q1.d.e(strArr, "input");
                Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
                q1.d.d(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return putExtra;
            case 2:
                String str = (String) obj;
                q1.d.e(str, "input");
                Intent putExtra2 = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{str});
                q1.d.d(putExtra2, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return putExtra2;
            default:
                Intent intent3 = (Intent) obj;
                q1.d.e(intent3, "input");
                return intent3;
        }
    }
}
