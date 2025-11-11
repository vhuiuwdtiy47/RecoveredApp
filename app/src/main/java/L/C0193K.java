package l;

import k.InterfaceC0166C;

/* renamed from: l.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0193K extends AbstractViewOnTouchListenerC0260t0 {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0203P f2978j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0210T f2979k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0193K(C0210T c0210t, C0210T c0210t2, C0203P c0203p) {
        super(c0210t2);
        this.f2979k = c0210t;
        this.f2978j = c0203p;
    }

    @Override // l.AbstractViewOnTouchListenerC0260t0
    public final InterfaceC0166C b() {
        return this.f2978j;
    }

    @Override // l.AbstractViewOnTouchListenerC0260t0
    public final boolean c() {
        C0210T c0210t = this.f2979k;
        if (c0210t.getInternalPopup().a()) {
            return true;
        }
        c0210t.f3019f.g(c0210t.getTextDirection(), c0210t.getTextAlignment());
        return true;
    }
}
