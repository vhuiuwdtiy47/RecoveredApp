package Y;

import a.C0063e;
import android.os.Bundle;
import androidx.lifecycle.EnumC0091n;
import g.AbstractActivityC0146i;
import java.util.ArrayList;
import java.util.HashMap;
import o0.InterfaceC0306c;

/* renamed from: Y.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0057y implements InterfaceC0306c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1205a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0146i f1206b;

    public /* synthetic */ C0057y(AbstractActivityC0146i abstractActivityC0146i, int i) {
        this.f1205a = i;
        this.f1206b = abstractActivityC0146i;
    }

    @Override // o0.InterfaceC0306c
    public final Bundle a() {
        switch (this.f1205a) {
            case 0:
                AbstractActivityC0146i abstractActivityC0146i = this.f1206b;
                do {
                } while (AbstractActivityC0146i.m(((B) abstractActivityC0146i.f2535r.f33b).h));
                abstractActivityC0146i.f2536s.d(EnumC0091n.ON_STOP);
                return new Bundle();
            default:
                AbstractActivityC0146i abstractActivityC0146i2 = this.f1206b;
                Bundle bundle = new Bundle();
                C0063e c0063e = abstractActivityC0146i2.f1273j;
                c0063e.getClass();
                HashMap hashMap = c0063e.f1256b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(hashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(hashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(c0063e.d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) c0063e.f1260g.clone());
                return bundle;
        }
    }
}
