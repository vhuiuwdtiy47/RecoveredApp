package W0;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class g extends T0.f {

    /* renamed from: q, reason: collision with root package name */
    public final RectF f854q;

    public g(T0.k kVar, RectF rectF) {
        super(kVar);
        this.f854q = rectF;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T0.g, W0.h, android.graphics.drawable.Drawable] */
    @Override // T0.f, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        ?? gVar = new T0.g(this);
        gVar.f856v = this;
        gVar.invalidateSelf();
        return gVar;
    }

    public g(g gVar) {
        super(gVar);
        this.f854q = gVar.f854q;
    }
}
