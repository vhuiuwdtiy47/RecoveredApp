package c0;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class e extends AbstractC0112c {
    public e(AbstractC0112c abstractC0112c) {
        q1.d.e(abstractC0112c, "initialExtras");
        LinkedHashMap linkedHashMap = abstractC0112c.f1741a;
        q1.d.e(linkedHashMap, "initialExtras");
        this.f1741a.putAll(linkedHashMap);
    }

    @Override // c0.AbstractC0112c
    public final Object a(InterfaceC0111b interfaceC0111b) {
        return this.f1741a.get(interfaceC0111b);
    }

    public /* synthetic */ e(int i) {
        this(C0110a.f1740b);
    }
}
