package c;

import U.t;
import a.C0063e;
import java.util.HashMap;

/* renamed from: c.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0106e extends AbstractC0104c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1730a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1731b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f1732c;
    public final /* synthetic */ C0063e d;

    public /* synthetic */ C0106e(C0063e c0063e, String str, t tVar, int i) {
        this.f1730a = i;
        this.d = c0063e;
        this.f1731b = str;
        this.f1732c = tVar;
    }

    @Override // c.AbstractC0104c
    public final void a(Object obj) {
        switch (this.f1730a) {
            case 0:
                C0063e c0063e = this.d;
                HashMap hashMap = c0063e.f1256b;
                String str = this.f1731b;
                Integer num = (Integer) hashMap.get(str);
                t tVar = this.f1732c;
                if (num != null) {
                    c0063e.d.add(str);
                    try {
                        c0063e.b(num.intValue(), tVar, obj);
                        return;
                    } catch (Exception e2) {
                        c0063e.d.remove(str);
                        throw e2;
                    }
                }
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + tVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            default:
                C0063e c0063e2 = this.d;
                HashMap hashMap2 = c0063e2.f1256b;
                String str2 = this.f1731b;
                Integer num2 = (Integer) hashMap2.get(str2);
                t tVar2 = this.f1732c;
                if (num2 != null) {
                    c0063e2.d.add(str2);
                    try {
                        c0063e2.b(num2.intValue(), tVar2, obj);
                        return;
                    } catch (Exception e3) {
                        c0063e2.d.remove(str2);
                        throw e3;
                    }
                }
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + tVar2 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }
    }

    public void b() {
        this.d.e(this.f1731b);
    }
}
