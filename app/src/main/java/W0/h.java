package W0;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class h extends T0.g {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f855w = 0;

    /* renamed from: v, reason: collision with root package name */
    public g f856v;

    @Override // T0.g
    public final void e(Canvas canvas) {
        if (this.f856v.f854q.isEmpty()) {
            super.e(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.f856v.f854q);
        super.e(canvas);
        canvas.restore();
    }

    @Override // T0.g, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f856v = new g(this.f856v);
        return this;
    }

    public final void n(float f2, float f3, float f4, float f5) {
        RectF rectF = this.f856v.f854q;
        if (f2 == rectF.left && f3 == rectF.top && f4 == rectF.right && f5 == rectF.bottom) {
            return;
        }
        rectF.set(f2, f3, f4, f5);
        invalidateSelf();
    }
}
