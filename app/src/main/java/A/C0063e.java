package a;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import c.C0102a;
import c.C0106e;
import c.C0107f;
import c.C0108g;
import c.C0109h;
import c.InterfaceC0103b;
import g.AbstractActivityC0146i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: a.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0063e {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1255a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1256b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f1257c = new HashMap();
    public ArrayList d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final transient HashMap f1258e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f1259f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f1260g = new Bundle();
    public final /* synthetic */ AbstractActivityC0146i h;

    public C0063e(AbstractActivityC0146i abstractActivityC0146i) {
        this.h = abstractActivityC0146i;
    }

    public final boolean a(int i, int i2, Intent intent) {
        String str = (String) this.f1255a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C0107f c0107f = (C0107f) this.f1258e.get(str);
        if (c0107f != null) {
            InterfaceC0103b interfaceC0103b = c0107f.f1733a;
            if (this.d.contains(str)) {
                interfaceC0103b.b(c0107f.f1734b.S(i2, intent));
                this.d.remove(str);
                return true;
            }
        }
        this.f1259f.remove(str);
        this.f1260g.putParcelable(str, new C0102a(i2, intent));
        return true;
    }

    public final void b(int i, U.t tVar, Object obj) {
        Bundle bundle;
        int i2;
        AbstractActivityC0146i abstractActivityC0146i = this.h;
        A0.c G = tVar.G(abstractActivityC0146i, obj);
        if (G != null) {
            new Handler(Looper.getMainLooper()).post(new D0.b(this, i, G, 1));
            return;
        }
        Intent o2 = tVar.o(abstractActivityC0146i, obj);
        if (o2.getExtras() != null && o2.getExtras().getClassLoader() == null) {
            o2.setExtrasClassLoader(abstractActivityC0146i.getClassLoader());
        }
        if (o2.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundle = o2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            o2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(o2.getAction())) {
            String[] stringArrayExtra = o2.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            HashSet hashSet = new HashSet();
            for (int i3 = 0; i3 < stringArrayExtra.length; i3++) {
                if (TextUtils.isEmpty(stringArrayExtra[i3])) {
                    throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(stringArrayExtra) + " must not contain null or empty values");
                }
                if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i3], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i3));
                }
            }
            int size = hashSet.size();
            String[] strArr = size > 0 ? new String[stringArrayExtra.length - size] : stringArrayExtra;
            if (size > 0) {
                if (size == stringArrayExtra.length) {
                    return;
                }
                int i4 = 0;
                for (int i5 = 0; i5 < stringArrayExtra.length; i5++) {
                    if (!hashSet.contains(Integer.valueOf(i5))) {
                        strArr[i4] = stringArrayExtra[i5];
                        i4++;
                    }
                }
            }
            A.a.b(abstractActivityC0146i, stringArrayExtra, i);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(o2.getAction())) {
            abstractActivityC0146i.startActivityForResult(o2, i, bundle2);
            return;
        }
        C0109h c0109h = (C0109h) o2.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            i2 = i;
            try {
                abstractActivityC0146i.startIntentSenderForResult(c0109h.f1737a, i2, c0109h.f1738b, c0109h.f1739c, c0109h.d, 0, bundle2);
            } catch (IntentSender.SendIntentException e2) {
                e = e2;
                new Handler(Looper.getMainLooper()).post(new D0.b(this, i2, e, 2));
            }
        } catch (IntentSender.SendIntentException e3) {
            e = e3;
            i2 = i;
        }
    }

    public final C0106e c(String str, U.t tVar, InterfaceC0103b interfaceC0103b) {
        d(str);
        this.f1258e.put(str, new C0107f(tVar, interfaceC0103b));
        HashMap hashMap = this.f1259f;
        if (hashMap.containsKey(str)) {
            Object obj = hashMap.get(str);
            hashMap.remove(str);
            interfaceC0103b.b(obj);
        }
        Bundle bundle = this.f1260g;
        C0102a c0102a = (C0102a) bundle.getParcelable(str);
        if (c0102a != null) {
            bundle.remove(str);
            interfaceC0103b.b(tVar.S(c0102a.f1725a, c0102a.f1726b));
        }
        return new C0106e(this, str, tVar, 1);
    }

    public final void d(String str) {
        HashMap hashMap = this.f1256b;
        if (((Integer) hashMap.get(str)) != null) {
            return;
        }
        s1.a aVar = s1.e.f3665a;
        int nextInt = s1.e.f3665a.a().nextInt(2147418112);
        while (true) {
            int i = nextInt + 65536;
            HashMap hashMap2 = this.f1255a;
            if (!hashMap2.containsKey(Integer.valueOf(i))) {
                hashMap2.put(Integer.valueOf(i), str);
                hashMap.put(str, Integer.valueOf(i));
                return;
            } else {
                s1.a aVar2 = s1.e.f3665a;
                nextInt = s1.e.f3665a.a().nextInt(2147418112);
            }
        }
    }

    public final void e(String str) {
        Integer num;
        if (!this.d.contains(str) && (num = (Integer) this.f1256b.remove(str)) != null) {
            this.f1255a.remove(num);
        }
        this.f1258e.remove(str);
        HashMap hashMap = this.f1259f;
        if (hashMap.containsKey(str)) {
            StringBuilder e2 = D.f.e("Dropping pending result for request ", str, ": ");
            e2.append(hashMap.get(str));
            Log.w("ActivityResultRegistry", e2.toString());
            hashMap.remove(str);
        }
        Bundle bundle = this.f1260g;
        if (bundle.containsKey(str)) {
            StringBuilder e3 = D.f.e("Dropping pending result for request ", str, ": ");
            e3.append(bundle.getParcelable(str));
            Log.w("ActivityResultRegistry", e3.toString());
            bundle.remove(str);
        }
        HashMap hashMap2 = this.f1257c;
        C0108g c0108g = (C0108g) hashMap2.get(str);
        if (c0108g != null) {
            ArrayList arrayList = c0108g.f1736b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c0108g.f1735a.f((androidx.lifecycle.r) it.next());
            }
            arrayList.clear();
            hashMap2.remove(str);
        }
    }
}
