package c;

import U.t;
import a.C0063e;
import android.os.Bundle;
import androidx.lifecycle.EnumC0091n;
import androidx.lifecycle.InterfaceC0096t;
import androidx.lifecycle.r;
import java.util.HashMap;

/* renamed from: c.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0105d implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1727a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0103b f1728b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f1729c;
    public final /* synthetic */ C0063e d;

    public C0105d(C0063e c0063e, String str, InterfaceC0103b interfaceC0103b, t tVar) {
        this.d = c0063e;
        this.f1727a = str;
        this.f1728b = interfaceC0103b;
        this.f1729c = tVar;
    }

    @Override // androidx.lifecycle.r
    public final void a(InterfaceC0096t interfaceC0096t, EnumC0091n enumC0091n) {
        boolean equals = EnumC0091n.ON_START.equals(enumC0091n);
        C0063e c0063e = this.d;
        String str = this.f1727a;
        HashMap hashMap = c0063e.f1258e;
        if (!equals) {
            if (EnumC0091n.ON_STOP.equals(enumC0091n)) {
                hashMap.remove(str);
                return;
            } else {
                if (EnumC0091n.ON_DESTROY.equals(enumC0091n)) {
                    c0063e.e(str);
                    return;
                }
                return;
            }
        }
        InterfaceC0103b interfaceC0103b = this.f1728b;
        t tVar = this.f1729c;
        hashMap.put(str, new C0107f(tVar, interfaceC0103b));
        HashMap hashMap2 = c0063e.f1259f;
        if (hashMap2.containsKey(str)) {
            Object obj = hashMap2.get(str);
            hashMap2.remove(str);
            interfaceC0103b.b(obj);
        }
        Bundle bundle = c0063e.f1260g;
        C0102a c0102a = (C0102a) bundle.getParcelable(str);
        if (c0102a != null) {
            bundle.remove(str);
            interfaceC0103b.b(tVar.S(c0102a.f1725a, c0102a.f1726b));
        }
    }
}
