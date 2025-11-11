package a;

import Y.G;
import Y.S;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.C0098v;
import androidx.lifecycle.InterfaceC0096t;
import androidx.lifecycle.L;
import androidx.lifecycle.V;
import androidx.lifecycle.W;
import androidx.navigation.fragment.NavHostFragment;
import com.android.music.R;
import f0.C0134j;
import f0.y;
import f0.z;
import g.AbstractActivityC0146i;
import h0.C0154d;
import h0.C0155e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import l.AbstractC0271z;
import o0.C0304a;
import o0.InterfaceC0307d;

/* renamed from: a.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0062d implements p1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1253a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1254b;

    public /* synthetic */ C0062d(int i, Object obj) {
        this.f1253a = i;
        this.f1254b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v3, types: [java.lang.Throwable] */
    @Override // p1.a
    public final Object a() {
        Bundle bundle;
        int i;
        Bundle bundle2;
        C0098v d;
        switch (this.f1253a) {
            case 0:
                ((AbstractActivityC0146i) this.f1254b).reportFullyDrawn();
                return null;
            case 1:
                return L.e((W) this.f1254b);
            case 2:
                NavHostFragment navHostFragment = (NavHostFragment) this.f1254b;
                Context h = navHostFragment.h();
                if (h == null) {
                    throw new IllegalStateException("NavController cannot be created before the fragment is attached");
                }
                y yVar = new y(h);
                i0.j jVar = yVar.f2365b;
                jVar.getClass();
                if (!navHostFragment.equals(jVar.f2645m)) {
                    InterfaceC0096t interfaceC0096t = jVar.f2645m;
                    C0155e c0155e = jVar.f2649q;
                    if (interfaceC0096t != null && (d = interfaceC0096t.d()) != null) {
                        d.f(c0155e);
                    }
                    jVar.f2645m = navHostFragment;
                    navHostFragment.f1174N.a(c0155e);
                }
                V c2 = navHostFragment.c();
                if (!q1.d.a(jVar.f2646n, U.t.y(c2))) {
                    if (!jVar.f2640f.isEmpty()) {
                        throw new IllegalStateException("ViewModelStore should be set before setGraph call");
                    }
                    jVar.f2646n = U.t.y(c2);
                }
                Context H2 = navHostFragment.H();
                S g2 = navHostFragment.g();
                q1.d.d(g2, "getChildFragmentManager(...)");
                C0154d c0154d = new C0154d(H2, g2);
                f0.L l2 = jVar.f2650r;
                l2.a(c0154d);
                Context H3 = navHostFragment.H();
                S g3 = navHostFragment.g();
                q1.d.d(g3, "getChildFragmentManager(...)");
                int i2 = navHostFragment.f1201w;
                if (i2 == 0 || i2 == -1) {
                    i2 = R.id.nav_host_fragment_container;
                }
                l2.a(new h0.j(H3, g3, i2));
                Bundle b2 = ((C.j) navHostFragment.f1178R.f61c).b("android-support-nav:fragment:navControllerState");
                String str = null;
                if (b2 != null) {
                    b2.setClassLoader(h.getClassLoader());
                    if (b2.containsKey("android-support-nav:controller:navigatorState")) {
                        bundle2 = b2.getBundle("android-support-nav:controller:navigatorState");
                        if (bundle2 == null) {
                            AbstractC0271z.p("android-support-nav:controller:navigatorState");
                            throw null;
                        }
                    } else {
                        bundle2 = null;
                    }
                    jVar.d = bundle2;
                    jVar.f2639e = b2.containsKey("android-support-nav:controller:backStack") ? (Bundle[]) AbstractC0271z.m(b2, "android-support-nav:controller:backStack").toArray(new Bundle[0]) : null;
                    LinkedHashMap linkedHashMap = jVar.f2644l;
                    linkedHashMap.clear();
                    if (b2.containsKey("android-support-nav:controller:backStackDestIds") && b2.containsKey("android-support-nav:controller:backStackIds")) {
                        int[] intArray = b2.getIntArray("android-support-nav:controller:backStackDestIds");
                        if (intArray == null) {
                            AbstractC0271z.p("android-support-nav:controller:backStackDestIds");
                            throw null;
                        }
                        ArrayList<String> stringArrayList = b2.getStringArrayList("android-support-nav:controller:backStackIds");
                        if (stringArrayList == null) {
                            AbstractC0271z.p("android-support-nav:controller:backStackIds");
                            throw null;
                        }
                        int length = intArray.length;
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < length) {
                            int i5 = i4 + 1;
                            String str2 = str;
                            jVar.f2643k.put(Integer.valueOf(intArray[i3]), !q1.d.a(stringArrayList.get(i4), "") ? stringArrayList.get(i4) : str2);
                            i3++;
                            str = str2;
                            i4 = i5;
                        }
                    }
                    ?? r16 = str;
                    if (b2.containsKey("android-support-nav:controller:backStackStates")) {
                        ArrayList<String> stringArrayList2 = b2.getStringArrayList("android-support-nav:controller:backStackStates");
                        if (stringArrayList2 == null) {
                            AbstractC0271z.p("android-support-nav:controller:backStackStates");
                            throw r16;
                        }
                        for (String str3 : stringArrayList2) {
                            String str4 = "android-support-nav:controller:backStackStates:" + str3;
                            q1.d.e(str4, "key");
                            if (b2.containsKey(str4)) {
                                ArrayList m2 = AbstractC0271z.m(b2, "android-support-nav:controller:backStackStates:" + str3);
                                j1.h hVar = new j1.h(m2.size());
                                Iterator it = m2.iterator();
                                while (it.hasNext()) {
                                    hVar.addLast(new C0134j((Bundle) it.next()));
                                }
                                linkedHashMap.put(str3, hVar);
                            }
                        }
                    }
                    i = 0;
                    boolean z2 = b2.getBoolean("android-support-nav:controller:deepLinkHandled", false);
                    Boolean valueOf = (z2 || !b2.getBoolean("android-support-nav:controller:deepLinkHandled", true)) ? Boolean.valueOf(z2) : r16;
                    yVar.f2367e = valueOf != null ? valueOf.booleanValue() : false;
                    bundle = r16;
                } else {
                    bundle = null;
                    i = 0;
                }
                ((C.j) navHostFragment.f1178R.f61c).I("android-support-nav:fragment:navControllerState", new G(2, yVar));
                Bundle b3 = ((C.j) navHostFragment.f1178R.f61c).b("android-support-nav:fragment:graphId");
                if (b3 != null) {
                    navHostFragment.f1613Y = b3.getInt("android-support-nav:fragment:graphId");
                }
                ((C.j) navHostFragment.f1178R.f61c).I("android-support-nav:fragment:graphId", new G(3, navHostFragment));
                int i6 = navHostFragment.f1613Y;
                i1.f fVar = yVar.h;
                if (i6 != 0) {
                    jVar.p(((z) fVar.getValue()).b(i6), bundle);
                } else {
                    Bundle bundle3 = bundle;
                    Bundle bundle4 = navHostFragment.f1186f;
                    int i7 = bundle4 != null ? bundle4.getInt("android-support-nav:fragment:graphId") : i;
                    Bundle bundle5 = bundle4 != null ? bundle4.getBundle("android-support-nav:fragment:startDestinationArgs") : bundle3;
                    if (i7 != 0) {
                        jVar.p(((z) fVar.getValue()).b(i7), bundle5);
                    }
                }
                return yVar;
            case 3:
                String str5 = (String) this.f1254b;
                q1.d.e(str5, "uriPattern");
                return new f0.t(str5, null, null);
            default:
                InterfaceC0307d interfaceC0307d = (InterfaceC0307d) this.f1254b;
                interfaceC0307d.d().a(new C0304a(0, interfaceC0307d));
                return i1.g.f2679c;
        }
    }
}
