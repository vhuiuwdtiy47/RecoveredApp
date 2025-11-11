package androidx.lifecycle;

import java.util.HashMap;

/* renamed from: androidx.lifecycle.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0082e implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1583a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1584b;

    public /* synthetic */ C0082e(int i, Object obj) {
        this.f1583a = i;
        this.f1584b = obj;
    }

    @Override // androidx.lifecycle.r
    public final void a(InterfaceC0096t interfaceC0096t, EnumC0091n enumC0091n) {
        switch (this.f1583a) {
            case 0:
                new HashMap();
                InterfaceC0086i[] interfaceC0086iArr = (InterfaceC0086i[]) this.f1584b;
                if (interfaceC0086iArr.length > 0) {
                    InterfaceC0086i interfaceC0086i = interfaceC0086iArr[0];
                    throw null;
                }
                if (interfaceC0086iArr.length <= 0) {
                    return;
                }
                InterfaceC0086i interfaceC0086i2 = interfaceC0086iArr[0];
                throw null;
            default:
                if (enumC0091n == EnumC0091n.ON_CREATE) {
                    interfaceC0096t.d().f(this);
                    ((M) this.f1584b).c();
                    return;
                } else {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC0091n).toString());
                }
        }
    }
}
