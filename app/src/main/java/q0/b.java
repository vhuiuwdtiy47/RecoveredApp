package Q0;

import Z0.i;
import android.graphics.Typeface;

/* loaded from: classes.dex */
public final class b extends C.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f587e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f588f;

    public b(d dVar, i iVar) {
        this.f588f = dVar;
        this.f587e = iVar;
    }

    @Override // C.b
    public final void g(int i) {
        this.f588f.f600m = true;
        this.f587e.R(i);
    }

    @Override // C.b
    public final void h(Typeface typeface) {
        d dVar = this.f588f;
        dVar.f601n = Typeface.create(typeface, dVar.f593c);
        dVar.f600m = true;
        this.f587e.S(dVar.f601n, false);
    }
}
