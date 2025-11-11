package u;

import java.util.Iterator;

/* renamed from: u.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0350g extends C0349f {

    /* renamed from: m, reason: collision with root package name */
    public int f3912m;

    public C0350g(AbstractC0358o abstractC0358o) {
        super(abstractC0358o);
        if (abstractC0358o instanceof C0354k) {
            this.f3906e = 2;
        } else {
            this.f3906e = 3;
        }
    }

    @Override // u.C0349f
    public final void d(int i) {
        if (this.f3909j) {
            return;
        }
        this.f3909j = true;
        this.f3908g = i;
        Iterator it = this.f3910k.iterator();
        while (it.hasNext()) {
            InterfaceC0347d interfaceC0347d = (InterfaceC0347d) it.next();
            interfaceC0347d.a(interfaceC0347d);
        }
    }
}
