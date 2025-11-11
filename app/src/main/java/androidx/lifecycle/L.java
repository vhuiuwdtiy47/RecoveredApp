package androidx.lifecycle;

import android.os.Bundle;
import c0.AbstractC0112c;
import c0.C0110a;
import d0.C0114a;
import java.util.Arrays;
import java.util.LinkedHashMap;
import o0.InterfaceC0306c;
import o0.InterfaceC0307d;

/* loaded from: classes.dex */
public abstract class L {

    /* renamed from: a, reason: collision with root package name */
    public static final Z0.f f1557a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final T0.e f1558b = new T0.e(9);

    /* renamed from: c, reason: collision with root package name */
    public static final Z0.f f1559c = new Object();

    public static final void a(Q q2, C.j jVar, C0098v c0098v) {
        AutoCloseable autoCloseable;
        q1.d.e(jVar, "registry");
        q1.d.e(c0098v, "lifecycle");
        C0114a c0114a = q2.f1570a;
        if (c0114a != null) {
            synchronized (c0114a.f2168a) {
                autoCloseable = (AutoCloseable) c0114a.f2169b.get("androidx.lifecycle.savedstate.vm.tag");
            }
        } else {
            autoCloseable = null;
        }
        J j2 = (J) autoCloseable;
        if (j2 == null || j2.f1556c) {
            return;
        }
        j2.b(jVar, c0098v);
        EnumC0092o enumC0092o = c0098v.f1600c;
        if (enumC0092o == EnumC0092o.f1591b || enumC0092o.compareTo(EnumC0092o.d) >= 0) {
            jVar.L();
        } else {
            c0098v.a(new C0084g(jVar, c0098v));
        }
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, androidx.lifecycle.I] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, androidx.lifecycle.I] */
    public static I b(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            bundle = bundle2;
        }
        if (bundle == null) {
            ?? obj = new Object();
            new LinkedHashMap();
            obj.f1553a = new I.d(j1.t.f2756a);
            return obj;
        }
        ClassLoader classLoader = I.class.getClassLoader();
        q1.d.b(classLoader);
        bundle.setClassLoader(classLoader);
        k1.c cVar = new k1.c(bundle.size());
        for (String str : bundle.keySet()) {
            q1.d.b(str);
            cVar.put(str, bundle.get(str));
        }
        cVar.b();
        cVar.f2922m = true;
        if (cVar.i <= 0) {
            cVar = k1.c.f2912n;
            q1.d.c(cVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        }
        ?? obj2 = new Object();
        new LinkedHashMap();
        obj2.f1553a = new I.d(cVar);
        return obj2;
    }

    public static final I c(AbstractC0112c abstractC0112c) {
        q1.d.e(abstractC0112c, "<this>");
        InterfaceC0307d interfaceC0307d = (InterfaceC0307d) abstractC0112c.a(f1557a);
        if (interfaceC0307d == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        W w2 = (W) abstractC0112c.a(f1558b);
        if (w2 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) abstractC0112c.a(f1559c);
        String str = (String) abstractC0112c.a(U.f1573b);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        InterfaceC0306c u2 = interfaceC0307d.b().u();
        Bundle bundle2 = null;
        M m2 = u2 instanceof M ? (M) u2 : null;
        if (m2 == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        LinkedHashMap linkedHashMap = e(w2).f1563b;
        I i = (I) linkedHashMap.get(str);
        if (i != null) {
            return i;
        }
        m2.c();
        Bundle bundle3 = m2.f1562c;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                bundle4 = Z0.i.f((i1.d[]) Arrays.copyOf(new i1.d[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                m2.f1562c = null;
            }
            bundle2 = bundle4;
        }
        I b2 = b(bundle2, bundle);
        linkedHashMap.put(str, b2);
        return b2;
    }

    public static final void d(InterfaceC0307d interfaceC0307d) {
        EnumC0092o enumC0092o = interfaceC0307d.d().f1600c;
        if (enumC0092o != EnumC0092o.f1591b && enumC0092o != EnumC0092o.f1592c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (interfaceC0307d.b().u() == null) {
            M m2 = new M(interfaceC0307d.b(), (W) interfaceC0307d);
            interfaceC0307d.b().I("androidx.lifecycle.internal.SavedStateHandlesProvider", m2);
            interfaceC0307d.d().a(new C0082e(1, m2));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.lifecycle.T, java.lang.Object] */
    public static final N e(W w2) {
        ?? obj = new Object();
        AbstractC0112c a2 = w2 instanceof InterfaceC0087j ? ((InterfaceC0087j) w2).a() : C0110a.f1740b;
        q1.d.e(obj, "factory");
        q1.d.e(a2, "extras");
        return (N) new U(w2.c(), obj, a2).f1574a.i(q1.i.a(N.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }
}
