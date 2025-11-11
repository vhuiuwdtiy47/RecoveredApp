package a;

import Y.I;
import androidx.lifecycle.C0098v;
import androidx.lifecycle.EnumC0091n;
import androidx.lifecycle.InterfaceC0096t;

/* loaded from: classes.dex */
public final class s implements androidx.lifecycle.r, InterfaceC0061c {

    /* renamed from: a, reason: collision with root package name */
    public final C0098v f1298a;

    /* renamed from: b, reason: collision with root package name */
    public final I f1299b;

    /* renamed from: c, reason: collision with root package name */
    public t f1300c;
    public final /* synthetic */ v d;

    public s(v vVar, C0098v c0098v, I i) {
        q1.d.e(c0098v, "lifecycle");
        q1.d.e(i, "onBackPressedCallback");
        this.d = vVar;
        this.f1298a = c0098v;
        this.f1299b = i;
        c0098v.a(this);
    }

    @Override // androidx.lifecycle.r
    public final void a(InterfaceC0096t interfaceC0096t, EnumC0091n enumC0091n) {
        if (enumC0091n == EnumC0091n.ON_START) {
            v vVar = this.d;
            I i = this.f1299b;
            q1.d.e(i, "onBackPressedCallback");
            vVar.f1308b.addLast(i);
            t tVar = new t(vVar, i);
            i.f975b.add(tVar);
            vVar.c();
            i.f976c = new u(1, vVar);
            this.f1300c = tVar;
            return;
        }
        if (enumC0091n != EnumC0091n.ON_STOP) {
            if (enumC0091n == EnumC0091n.ON_DESTROY) {
                cancel();
            }
        } else {
            t tVar2 = this.f1300c;
            if (tVar2 != null) {
                tVar2.cancel();
            }
        }
    }

    @Override // a.InterfaceC0061c
    public final void cancel() {
        this.f1298a.f(this);
        this.f1299b.f975b.remove(this);
        t tVar = this.f1300c;
        if (tVar != null) {
            tVar.cancel();
        }
        this.f1300c = null;
    }
}
