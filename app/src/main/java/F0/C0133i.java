package f0;

import android.os.Bundle;
import androidx.lifecycle.C0098v;
import androidx.lifecycle.EnumC0092o;
import androidx.lifecycle.InterfaceC0087j;
import androidx.lifecycle.InterfaceC0096t;
import androidx.lifecycle.V;
import androidx.lifecycle.W;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import o0.InterfaceC0307d;

/* renamed from: f0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0133i implements InterfaceC0096t, W, InterfaceC0087j, InterfaceC0307d {

    /* renamed from: a, reason: collision with root package name */
    public final U.m f2305a;

    /* renamed from: b, reason: collision with root package name */
    public v f2306b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f2307c;
    public final EnumC0092o d;

    /* renamed from: e, reason: collision with root package name */
    public final o f2308e;

    /* renamed from: f, reason: collision with root package name */
    public final String f2309f;

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f2310g;
    public final i0.d h = new i0.d(this);

    public C0133i(U.m mVar, v vVar, Bundle bundle, EnumC0092o enumC0092o, o oVar, String str, Bundle bundle2) {
        this.f2305a = mVar;
        this.f2306b = vVar;
        this.f2307c = bundle;
        this.d = enumC0092o;
        this.f2308e = oVar;
        this.f2309f = str;
        this.f2310g = bundle2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    @Override // androidx.lifecycle.InterfaceC0087j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final c0.e a() {
        /*
            r5 = this;
            i0.d r0 = r5.h
            r0.getClass()
            c0.e r1 = new c0.e
            r2 = 0
            r1.<init>(r2)
            Z0.f r2 = androidx.lifecycle.L.f1557a
            f0.i r3 = r0.f2612a
            java.util.LinkedHashMap r4 = r1.f1741a
            r4.put(r2, r3)
            T0.e r2 = androidx.lifecycle.L.f1558b
            r4.put(r2, r3)
            android.os.Bundle r0 = r0.a()
            if (r0 == 0) goto L24
            Z0.f r2 = androidx.lifecycle.L.f1559c
            r4.put(r2, r0)
        L24:
            r0 = 0
            U.m r5 = r5.f2305a
            if (r5 == 0) goto L36
            android.content.Context r5 = r5.f773a
            android.content.Context r5 = r5.getApplicationContext()
            boolean r2 = r5 instanceof android.app.Application
            if (r2 == 0) goto L36
            android.app.Application r5 = (android.app.Application) r5
            goto L37
        L36:
            r5 = r0
        L37:
            if (r5 == 0) goto L3a
            r0 = r5
        L3a:
            if (r0 == 0) goto L41
            T0.e r5 = androidx.lifecycle.S.f1572f
            r4.put(r5, r0)
        L41:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.C0133i.a():c0.e");
    }

    @Override // o0.InterfaceC0307d
    public final C.j b() {
        return (C.j) this.h.h.f61c;
    }

    @Override // androidx.lifecycle.W
    public final V c() {
        i0.d dVar = this.h;
        if (!dVar.i) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (dVar.f2618j.f1600c == EnumC0092o.f1590a) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
        o oVar = dVar.f2615e;
        if (oVar == null) {
            throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
        }
        String str = dVar.f2616f;
        q1.d.e(str, "backStackEntryId");
        LinkedHashMap linkedHashMap = oVar.f2325b;
        V v2 = (V) linkedHashMap.get(str);
        if (v2 != null) {
            return v2;
        }
        V v3 = new V();
        linkedHashMap.put(str, v3);
        return v3;
    }

    @Override // androidx.lifecycle.InterfaceC0096t
    public final C0098v d() {
        return this.h.f2618j;
    }

    public final void e(EnumC0092o enumC0092o) {
        i0.d dVar = this.h;
        dVar.getClass();
        dVar.f2619k = enumC0092o;
        dVar.b();
    }

    public final boolean equals(Object obj) {
        Set<String> keySet;
        if (obj != null && (obj instanceof C0133i)) {
            C0133i c0133i = (C0133i) obj;
            if (q1.d.a(this.f2309f, c0133i.f2309f) && q1.d.a(this.f2306b, c0133i.f2306b) && q1.d.a(this.h.f2618j, c0133i.h.f2618j) && q1.d.a(b(), c0133i.b())) {
                Bundle bundle = this.f2307c;
                Bundle bundle2 = c0133i.f2307c;
                if (q1.d.a(bundle, bundle2)) {
                    return true;
                }
                if (bundle != null && (keySet = bundle.keySet()) != null) {
                    if (keySet.isEmpty()) {
                        return true;
                    }
                    for (String str : keySet) {
                        if (!q1.d.a(bundle.get(str), bundle2 != null ? bundle2.get(str) : null)) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Set<String> keySet;
        int hashCode = this.f2306b.hashCode() + (this.f2309f.hashCode() * 31);
        Bundle bundle = this.f2307c;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                int i = hashCode * 31;
                Object obj = bundle.get((String) it.next());
                hashCode = i + (obj != null ? obj.hashCode() : 0);
            }
        }
        return b().hashCode() + ((this.h.f2618j.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return this.h.toString();
    }
}
