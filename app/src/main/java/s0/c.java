package s0;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class c extends m {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3587a = false;

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f3588b;

    public c(ViewGroup viewGroup) {
        this.f3588b = viewGroup;
    }

    @Override // s0.m, s0.j
    public final void a() {
        t.b(this.f3588b, false);
    }

    @Override // s0.m, s0.j
    public final void b(l lVar) {
        t.b(this.f3588b, false);
        this.f3587a = true;
    }

    @Override // s0.j
    public final void c(l lVar) {
        if (!this.f3587a) {
            t.b(this.f3588b, false);
        }
        lVar.x(this);
    }

    @Override // s0.m, s0.j
    public final void d() {
        t.b(this.f3588b, true);
    }
}
