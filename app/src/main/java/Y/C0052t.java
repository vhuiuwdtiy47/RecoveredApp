package Y;

import a.C0063e;
import androidx.lifecycle.C0098v;
import androidx.lifecycle.EnumC0092o;
import c.C0105d;
import c.C0106e;
import c.C0108g;
import c.InterfaceC0103b;
import com.xiaomi.vlive.ui.controller.ControllerFragment;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Y.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0052t extends AbstractC0055w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ A0.c f1149a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f1150b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ U.t f1151c;
    public final /* synthetic */ InterfaceC0103b d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ControllerFragment f1152e;

    public C0052t(ControllerFragment controllerFragment, A0.c cVar, AtomicReference atomicReference, U.t tVar, InterfaceC0103b interfaceC0103b) {
        this.f1152e = controllerFragment;
        this.f1149a = cVar;
        this.f1150b = atomicReference;
        this.f1151c = tVar;
        this.d = interfaceC0103b;
    }

    @Override // Y.AbstractC0055w
    public final void a() {
        StringBuilder sb = new StringBuilder("fragment_");
        ControllerFragment controllerFragment = this.f1152e;
        sb.append(controllerFragment.f1185e);
        sb.append("_rq#");
        sb.append(controllerFragment.f1179S.getAndIncrement());
        String sb2 = sb.toString();
        ControllerFragment controllerFragment2 = (ControllerFragment) this.f1149a.f33b;
        B b2 = controllerFragment2.f1198t;
        C0063e c0063e = (b2 != null ? b2.i : controllerFragment2.G()).f1273j;
        c0063e.getClass();
        C0098v c0098v = controllerFragment.f1174N;
        if (c0098v.f1600c.compareTo(EnumC0092o.d) >= 0) {
            throw new IllegalStateException("LifecycleOwner " + controllerFragment + " is attempting to register while current state is " + c0098v.f1600c + ". LifecycleOwners must call register before they are STARTED.");
        }
        c0063e.d(sb2);
        HashMap hashMap = c0063e.f1257c;
        C0108g c0108g = (C0108g) hashMap.get(sb2);
        if (c0108g == null) {
            c0108g = new C0108g(c0098v);
        }
        InterfaceC0103b interfaceC0103b = this.d;
        U.t tVar = this.f1151c;
        C0105d c0105d = new C0105d(c0063e, sb2, interfaceC0103b, tVar);
        c0108g.f1735a.a(c0105d);
        c0108g.f1736b.add(c0105d);
        hashMap.put(sb2, c0108g);
        this.f1150b.set(new C0106e(c0063e, sb2, tVar, 0));
    }
}
