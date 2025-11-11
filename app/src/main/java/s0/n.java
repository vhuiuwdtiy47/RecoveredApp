package s0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class n extends m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o.f f3637a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f3638b;

    public n(o oVar, o.f fVar) {
        this.f3638b = oVar;
        this.f3637a = fVar;
    }

    @Override // s0.j
    public final void c(l lVar) {
        ((ArrayList) this.f3637a.get(this.f3638b.f3640b)).remove(lVar);
        lVar.x(this);
    }
}
