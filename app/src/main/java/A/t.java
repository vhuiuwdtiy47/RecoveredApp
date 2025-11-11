package a;

import Y.I;

/* loaded from: classes.dex */
public final class t implements InterfaceC0061c {

    /* renamed from: a, reason: collision with root package name */
    public final I f1301a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f1302b;

    public t(v vVar, I i) {
        q1.d.e(i, "onBackPressedCallback");
        this.f1302b = vVar;
        this.f1301a = i;
    }

    @Override // a.InterfaceC0061c
    public final void cancel() {
        v vVar = this.f1302b;
        j1.h hVar = vVar.f1308b;
        I i = this.f1301a;
        hVar.remove(i);
        if (q1.d.a(vVar.f1309c, i)) {
            i.getClass();
            vVar.f1309c = null;
        }
        i.f975b.remove(this);
        u uVar = i.f976c;
        if (uVar != null) {
            uVar.a();
        }
        i.f976c = null;
    }
}
