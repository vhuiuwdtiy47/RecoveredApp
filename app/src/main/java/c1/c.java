package c1;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* loaded from: classes.dex */
public final class c extends Drawable implements Animatable {

    /* renamed from: k, reason: collision with root package name */
    public static final LinearInterpolator f1747k = new LinearInterpolator();

    /* renamed from: l, reason: collision with root package name */
    public static final DecelerateInterpolator f1748l = new DecelerateInterpolator();

    /* renamed from: a, reason: collision with root package name */
    public final RectF f1749a = new RectF();

    /* renamed from: b, reason: collision with root package name */
    public final ObjectAnimator f1750b;

    /* renamed from: c, reason: collision with root package name */
    public final ObjectAnimator f1751c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f1752e;

    /* renamed from: f, reason: collision with root package name */
    public float f1753f;

    /* renamed from: g, reason: collision with root package name */
    public float f1754g;
    public float h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1755j;

    public c(int i, float f2) {
        a aVar = new a(Float.class, "angle", 0);
        a aVar2 = new a(Float.class, "arc", 1);
        this.i = f2;
        Paint paint = new Paint();
        this.f1752e = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(f2);
        paint.setColor(i);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, aVar, 360.0f);
        this.f1751c = ofFloat;
        ofFloat.setInterpolator(f1747k);
        this.f1751c.setDuration(1000L);
        this.f1751c.setRepeatMode(1);
        this.f1751c.setRepeatCount(-1);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, aVar2, 300.0f);
        this.f1750b = ofFloat2;
        ofFloat2.setInterpolator(f1748l);
        this.f1750b.setDuration(1000L);
        this.f1750b.setRepeatMode(1);
        this.f1750b.setRepeatCount(-1);
        this.f1750b.addListener(new b(this));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f2;
        float f3 = this.f1754g - this.f1753f;
        float f4 = this.h;
        if (this.d) {
            f2 = f4 + 30.0f;
        } else {
            f3 += f4;
            f2 = (360.0f - f4) - 30.0f;
        }
        canvas.drawArc(this.f1749a, f3, f2, false, this.f1752e);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f1755j;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        RectF rectF = this.f1749a;
        float f2 = rect.left;
        float f3 = this.i;
        rectF.left = (f3 / 2.0f) + f2 + 0.5f;
        rectF.right = (rect.right - (f3 / 2.0f)) - 0.5f;
        rectF.top = (f3 / 2.0f) + rect.top + 0.5f;
        rectF.bottom = (rect.bottom - (f3 / 2.0f)) - 0.5f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f1752e.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f1752e.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        if (this.f1755j) {
            return;
        }
        this.f1755j = true;
        this.f1751c.start();
        this.f1750b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        if (this.f1755j) {
            this.f1755j = false;
            this.f1751c.cancel();
            this.f1750b.cancel();
            invalidateSelf();
        }
    }
}
