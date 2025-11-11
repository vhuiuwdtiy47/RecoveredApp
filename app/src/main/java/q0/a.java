package Q0;

import Z0.i;
import android.graphics.Typeface;

/* loaded from: classes.dex */
public final class a extends i {

    /* renamed from: f, reason: collision with root package name */
    public final Typeface f585f;

    /* renamed from: g, reason: collision with root package name */
    public final A0.c f586g;
    public boolean h;

    public a(A0.c cVar, Typeface typeface) {
        this.f585f = typeface;
        this.f586g = cVar;
    }

    @Override // Z0.i
    public final void R(int i) {
        if (this.h) {
            return;
        }
        M0.b bVar = (M0.b) this.f586g.f33b;
        if (bVar.j(this.f585f)) {
            bVar.h(false);
        }
    }

    @Override // Z0.i
    public final void S(Typeface typeface, boolean z2) {
        if (this.h) {
            return;
        }
        M0.b bVar = (M0.b) this.f586g.f33b;
        if (bVar.j(typeface)) {
            bVar.h(false);
        }
    }
}
