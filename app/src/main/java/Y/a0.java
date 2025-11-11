package Y;

import a.C0062d;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.C0098v;
import androidx.lifecycle.EnumC0091n;
import androidx.lifecycle.InterfaceC0087j;
import java.util.LinkedHashMap;
import o0.InterfaceC0307d;
import p0.C0309a;

/* loaded from: classes.dex */
public final class a0 implements InterfaceC0087j, InterfaceC0307d, androidx.lifecycle.W {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractComponentCallbacksC0056x f1077a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.V f1078b;

    /* renamed from: c, reason: collision with root package name */
    public final F0.b f1079c;
    public C0098v d = null;

    /* renamed from: e, reason: collision with root package name */
    public C.j f1080e = null;

    public a0(AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x, androidx.lifecycle.V v2, F0.b bVar) {
        this.f1077a = abstractComponentCallbacksC0056x;
        this.f1078b = v2;
        this.f1079c = bVar;
    }

    @Override // androidx.lifecycle.InterfaceC0087j
    public final c0.e a() {
        Application application;
        AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x = this.f1077a;
        Context applicationContext = abstractComponentCallbacksC0056x.H().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        c0.e eVar = new c0.e(0);
        LinkedHashMap linkedHashMap = eVar.f1741a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.S.f1572f, application);
        }
        linkedHashMap.put(androidx.lifecycle.L.f1557a, abstractComponentCallbacksC0056x);
        linkedHashMap.put(androidx.lifecycle.L.f1558b, this);
        Bundle bundle = abstractComponentCallbacksC0056x.f1186f;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.L.f1559c, bundle);
        }
        return eVar;
    }

    @Override // o0.InterfaceC0307d
    public final C.j b() {
        f();
        return (C.j) this.f1080e.f61c;
    }

    @Override // androidx.lifecycle.W
    public final androidx.lifecycle.V c() {
        f();
        return this.f1078b;
    }

    @Override // androidx.lifecycle.InterfaceC0096t
    public final C0098v d() {
        f();
        return this.d;
    }

    public final void e(EnumC0091n enumC0091n) {
        this.d.d(enumC0091n);
    }

    public final void f() {
        if (this.d == null) {
            this.d = new C0098v(this);
            C0309a c0309a = new C0309a(this, new C0062d(4, this));
            this.f1080e = new C.j(c0309a, 15);
            c0309a.a();
            this.f1079c.run();
        }
    }
}
