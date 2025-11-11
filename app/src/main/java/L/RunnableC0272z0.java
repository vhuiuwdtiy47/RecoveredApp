package l;

/* renamed from: l.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0272z0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3184a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0180D0 f3185b;

    public /* synthetic */ RunnableC0272z0(C0180D0 c0180d0, int i) {
        this.f3184a = i;
        this.f3185b = c0180d0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3184a) {
            case 0:
                C0254q0 c0254q0 = this.f3185b.f2940c;
                if (c0254q0 != null) {
                    c0254q0.setListSelectionHidden(true);
                    c0254q0.requestLayout();
                    return;
                }
                return;
            default:
                C0180D0 c0180d0 = this.f3185b;
                C0254q0 c0254q02 = c0180d0.f2940c;
                if (c0254q02 == null || !c0254q02.isAttachedToWindow() || c0180d0.f2940c.getCount() <= c0180d0.f2940c.getChildCount() || c0180d0.f2940c.getChildCount() > c0180d0.f2947m) {
                    return;
                }
                c0180d0.f2960z.setInputMethodMode(2);
                c0180d0.show();
                return;
        }
    }
}
