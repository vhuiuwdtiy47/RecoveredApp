package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import d0.C0114a;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;
import l.AbstractC0271z;
import o0.InterfaceC0307d;

/* loaded from: classes.dex */
public final class O implements T {

    /* renamed from: a, reason: collision with root package name */
    public final Application f1564a;

    /* renamed from: b, reason: collision with root package name */
    public final S f1565b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f1566c;
    public final C0098v d;

    /* renamed from: e, reason: collision with root package name */
    public final C.j f1567e;

    public O() {
        this.f1565b = new S(null);
    }

    public final Q a(String str, Class cls) {
        AutoCloseable autoCloseable;
        Application application;
        C0098v c0098v = this.d;
        if (c0098v == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean isAssignableFrom = AbstractC0078a.class.isAssignableFrom(cls);
        Constructor a2 = (!isAssignableFrom || this.f1564a == null) ? P.a(cls, P.f1569b) : P.a(cls, P.f1568a);
        if (a2 == null) {
            if (this.f1564a != null) {
                return this.f1565b.e(cls);
            }
            if (T0.e.f667c == null) {
                T0.e.f667c = new T0.e(11);
            }
            q1.d.b(T0.e.f667c);
            return U.t.p(cls);
        }
        C.j jVar = this.f1567e;
        q1.d.b(jVar);
        I b2 = L.b(jVar.b(str), this.f1566c);
        J j2 = new J(str, b2);
        j2.b(jVar, c0098v);
        EnumC0092o enumC0092o = c0098v.f1600c;
        if (enumC0092o == EnumC0092o.f1591b || enumC0092o.compareTo(EnumC0092o.d) >= 0) {
            jVar.L();
        } else {
            c0098v.a(new C0084g(jVar, c0098v));
        }
        Q b3 = (!isAssignableFrom || (application = this.f1564a) == null) ? P.b(cls, a2, b2) : P.b(cls, a2, application, b2);
        b3.getClass();
        C0114a c0114a = b3.f1570a;
        if (c0114a == null) {
            return b3;
        }
        if (c0114a.d) {
            C0114a.a(j2);
            return b3;
        }
        synchronized (c0114a.f2168a) {
            autoCloseable = (AutoCloseable) c0114a.f2169b.put("androidx.lifecycle.savedstate.vm.tag", j2);
        }
        C0114a.a(autoCloseable);
        return b3;
    }

    @Override // androidx.lifecycle.T
    public final Q e(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return a(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.T
    public final Q m(q1.b bVar, c0.e eVar) {
        return r(AbstractC0271z.k(bVar), eVar);
    }

    @Override // androidx.lifecycle.T
    public final Q r(Class cls, c0.e eVar) {
        Z0.f fVar = U.f1573b;
        LinkedHashMap linkedHashMap = eVar.f1741a;
        String str = (String) linkedHashMap.get(fVar);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (linkedHashMap.get(L.f1557a) == null || linkedHashMap.get(L.f1558b) == null) {
            if (this.d != null) {
                return a(str, cls);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) linkedHashMap.get(S.f1572f);
        boolean isAssignableFrom = AbstractC0078a.class.isAssignableFrom(cls);
        Constructor a2 = (!isAssignableFrom || application == null) ? P.a(cls, P.f1569b) : P.a(cls, P.f1568a);
        return a2 == null ? this.f1565b.r(cls, eVar) : (!isAssignableFrom || application == null) ? P.b(cls, a2, L.c(eVar)) : P.b(cls, a2, application, L.c(eVar));
    }

    public O(Application application, InterfaceC0307d interfaceC0307d, Bundle bundle) {
        S s2;
        this.f1567e = interfaceC0307d.b();
        this.d = interfaceC0307d.d();
        this.f1566c = bundle;
        this.f1564a = application;
        if (application != null) {
            if (S.f1571e == null) {
                S.f1571e = new S(application);
            }
            s2 = S.f1571e;
            q1.d.b(s2);
        } else {
            s2 = new S(null);
        }
        this.f1565b = s2;
    }
}
