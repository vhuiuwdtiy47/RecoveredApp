package l;

import androidx.appcompat.widget.Toolbar;

/* renamed from: l.T0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0211T0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3021a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Toolbar f3022b;

    public /* synthetic */ RunnableC0211T0(Toolbar toolbar, int i) {
        this.f3021a = i;
        this.f3022b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3021a) {
            case 0:
                C0217W0 c0217w0 = this.f3022b.f1429L;
                k.o oVar = c0217w0 == null ? null : c0217w0.f3028b;
                if (oVar != null) {
                    oVar.collapseActionView();
                    return;
                }
                return;
            default:
                this.f3022b.n();
                return;
        }
    }
}
