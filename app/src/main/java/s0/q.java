package s0;

/* loaded from: classes.dex */
public final class q extends m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3644a = 1;

    /* renamed from: b, reason: collision with root package name */
    public l f3645b;

    public /* synthetic */ q() {
    }

    @Override // s0.j
    public final void c(l lVar) {
        switch (this.f3644a) {
            case 0:
                this.f3645b.z();
                lVar.x(this);
                return;
            default:
                C0322a c0322a = (C0322a) this.f3645b;
                int i = c0322a.f3584C - 1;
                c0322a.f3584C = i;
                if (i == 0) {
                    c0322a.f3585D = false;
                    c0322a.m();
                }
                lVar.x(this);
                return;
        }
    }

    @Override // s0.m, s0.j
    public void f(l lVar) {
        switch (this.f3644a) {
            case 1:
                C0322a c0322a = (C0322a) this.f3645b;
                if (c0322a.f3585D) {
                    return;
                }
                c0322a.G();
                c0322a.f3585D = true;
                return;
            default:
                return;
        }
    }

    public q(l lVar) {
        this.f3645b = lVar;
    }
}
