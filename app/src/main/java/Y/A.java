package Y;

import a.C0063e;
import android.os.Bundle;
import b.InterfaceC0101b;
import g.AbstractActivityC0146i;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class A implements InterfaceC0101b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f956a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0146i f957b;

    public /* synthetic */ A(AbstractActivityC0146i abstractActivityC0146i, int i) {
        this.f956a = i;
        this.f957b = abstractActivityC0146i;
    }

    @Override // b.InterfaceC0101b
    public final void a() {
        switch (this.f956a) {
            case 0:
                B b2 = (B) this.f957b.f2535r.f33b;
                b2.h.b(b2, b2, null);
                return;
            default:
                AbstractActivityC0146i abstractActivityC0146i = this.f957b;
                Bundle b3 = ((C.j) abstractActivityC0146i.f1270e.f61c).b("android:support:activity-result");
                if (b3 != null) {
                    C0063e c0063e = abstractActivityC0146i.f1273j;
                    c0063e.getClass();
                    ArrayList<Integer> integerArrayList = b3.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = b3.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList == null || integerArrayList == null) {
                        return;
                    }
                    c0063e.d = b3.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                    Bundle bundle = b3.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                    Bundle bundle2 = c0063e.f1260g;
                    bundle2.putAll(bundle);
                    for (int i = 0; i < stringArrayList.size(); i++) {
                        String str = stringArrayList.get(i);
                        HashMap hashMap = c0063e.f1256b;
                        boolean containsKey = hashMap.containsKey(str);
                        HashMap hashMap2 = c0063e.f1255a;
                        if (containsKey) {
                            Integer num = (Integer) hashMap.remove(str);
                            if (!bundle2.containsKey(str)) {
                                hashMap2.remove(num);
                            }
                        }
                        Integer num2 = integerArrayList.get(i);
                        num2.intValue();
                        String str2 = stringArrayList.get(i);
                        hashMap2.put(num2, str2);
                        hashMap.put(str2, num2);
                    }
                    return;
                }
                return;
        }
    }
}
