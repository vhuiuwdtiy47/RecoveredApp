package j;

import l.b1;

/* loaded from: classes.dex */
public final class i extends Z0.i {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2732f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2733g;
    public int h;
    public final /* synthetic */ Object i;

    public i(j jVar) {
        this.f2732f = 0;
        this.i = jVar;
        this.f2733g = false;
        this.h = 0;
    }

    @Override // L.Z
    public final void a() {
        switch (this.f2732f) {
            case 0:
                int i = this.h + 1;
                this.h = i;
                j jVar = (j) this.i;
                if (i == jVar.f2734a.size()) {
                    Z0.i iVar = jVar.d;
                    if (iVar != null) {
                        iVar.a();
                    }
                    this.h = 0;
                    this.f2733g = false;
                    jVar.f2737e = false;
                    return;
                }
                return;
            default:
                if (this.f2733g) {
                    return;
                }
                ((b1) this.i).f3055a.setVisibility(this.h);
                return;
        }
    }

    @Override // Z0.i, L.Z
    public void b() {
        switch (this.f2732f) {
            case 1:
                this.f2733g = true;
                return;
            default:
                return;
        }
    }

    @Override // Z0.i, L.Z
    public final void c() {
        switch (this.f2732f) {
            case 0:
                if (this.f2733g) {
                    return;
                }
                this.f2733g = true;
                Z0.i iVar = ((j) this.i).d;
                if (iVar != null) {
                    iVar.c();
                    return;
                }
                return;
            default:
                ((b1) this.i).f3055a.setVisibility(0);
                return;
        }
    }

    public i(b1 b1Var, int i) {
        this.f2732f = 1;
        this.i = b1Var;
        this.h = i;
        this.f2733g = false;
    }
}
