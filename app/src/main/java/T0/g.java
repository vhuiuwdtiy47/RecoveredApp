package T0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import java.util.BitSet;
import java.util.Objects;

/* loaded from: classes.dex */
public class g extends Drawable implements u {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f682u = 0;

    /* renamed from: a, reason: collision with root package name */
    public f f683a;

    /* renamed from: b, reason: collision with root package name */
    public final s[] f684b;

    /* renamed from: c, reason: collision with root package name */
    public final s[] f685c;
    public final BitSet d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f686e;

    /* renamed from: f, reason: collision with root package name */
    public final Matrix f687f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f688g;
    public final Path h;
    public final RectF i;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f689j;

    /* renamed from: k, reason: collision with root package name */
    public final Region f690k;

    /* renamed from: l, reason: collision with root package name */
    public final Region f691l;

    /* renamed from: m, reason: collision with root package name */
    public k f692m;

    /* renamed from: n, reason: collision with root package name */
    public final Paint f693n;

    /* renamed from: o, reason: collision with root package name */
    public final Paint f694o;

    /* renamed from: p, reason: collision with root package name */
    public final A0.c f695p;

    /* renamed from: q, reason: collision with root package name */
    public final m f696q;

    /* renamed from: r, reason: collision with root package name */
    public PorterDuffColorFilter f697r;

    /* renamed from: s, reason: collision with root package name */
    public PorterDuffColorFilter f698s;

    /* renamed from: t, reason: collision with root package name */
    public final RectF f699t;

    static {
        Paint paint = new Paint(1);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new k());
    }

    public final void b(RectF rectF, Path path) {
        f fVar = this.f683a;
        this.f696q.a(fVar.f669a, fVar.i, rectF, this.f695p, path);
        if (this.f683a.h != 1.0f) {
            Matrix matrix = this.f687f;
            matrix.reset();
            float f2 = this.f683a.h;
            matrix.setScale(f2, f2, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f699t, true);
    }

    public final int c(int i) {
        int i2;
        f fVar = this.f683a;
        float f2 = fVar.f678m + 0.0f + fVar.f677l;
        L0.a aVar = fVar.f670b;
        if (aVar == null || !aVar.f399a || D.a.d(i, 255) != aVar.d) {
            return i;
        }
        float min = (aVar.f402e <= 0.0f || f2 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f2 / r3)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i);
        int L2 = Z0.i.L(D.a.d(i, 255), aVar.f400b, min);
        if (min > 0.0f && (i2 = aVar.f401c) != 0) {
            L2 = D.a.b(D.a.d(i2, L0.a.f398f), L2);
        }
        return D.a.d(L2, alpha);
    }

    public final void d(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (!kVar.d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float a2 = kVar.f714f.a(rectF) * this.f683a.i;
            canvas.drawRoundRect(rectF, a2, a2, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint = this.f693n;
        paint.setColorFilter(this.f697r);
        int alpha = paint.getAlpha();
        int i = this.f683a.f676k;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.f694o;
        paint2.setColorFilter(this.f698s);
        paint2.setStrokeWidth(this.f683a.f675j);
        int alpha2 = paint2.getAlpha();
        int i2 = this.f683a.f676k;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z2 = this.f686e;
        Path path = this.f688g;
        if (z2) {
            float f2 = -(g() ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            k kVar = this.f683a.f669a;
            j e2 = kVar.e();
            c cVar = kVar.f713e;
            if (!(cVar instanceof h)) {
                cVar = new b(f2, cVar);
            }
            e2.f704e = cVar;
            c cVar2 = kVar.f714f;
            if (!(cVar2 instanceof h)) {
                cVar2 = new b(f2, cVar2);
            }
            e2.f705f = cVar2;
            c cVar3 = kVar.h;
            if (!(cVar3 instanceof h)) {
                cVar3 = new b(f2, cVar3);
            }
            e2.h = cVar3;
            c cVar4 = kVar.f715g;
            if (!(cVar4 instanceof h)) {
                cVar4 = new b(f2, cVar4);
            }
            e2.f706g = cVar4;
            k a2 = e2.a();
            this.f692m = a2;
            float f3 = this.f683a.i;
            RectF rectF = this.f689j;
            rectF.set(f());
            float strokeWidth = g() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth, strokeWidth);
            this.f696q.a(a2, f3, rectF, null, this.h);
            b(f(), path);
            this.f686e = false;
        }
        f fVar = this.f683a;
        fVar.getClass();
        if (fVar.f679n > 0 && !this.f683a.f669a.d(f())) {
            path.isConvex();
        }
        f fVar2 = this.f683a;
        Paint.Style style = fVar2.f681p;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            d(canvas, paint, path, fVar2.f669a, f());
        }
        if (g()) {
            e(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public void e(Canvas canvas) {
        Paint paint = this.f694o;
        Path path = this.h;
        k kVar = this.f692m;
        RectF rectF = this.f689j;
        rectF.set(f());
        float strokeWidth = g() ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        d(canvas, paint, path, kVar, rectF);
    }

    public final RectF f() {
        RectF rectF = this.i;
        rectF.set(getBounds());
        return rectF;
    }

    public final boolean g() {
        Paint.Style style = this.f683a.f681p;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f694o.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f683a.f676k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f683a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f683a.getClass();
        if (this.f683a.f669a.d(f())) {
            outline.setRoundRect(getBounds(), this.f683a.f669a.f713e.a(f()) * this.f683a.i);
            return;
        }
        RectF f2 = f();
        Path path = this.f688g;
        b(f2, path);
        if (Build.VERSION.SDK_INT >= 30) {
            K0.c.a(outline, path);
        } else {
            try {
                K0.a.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f683a.f674g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f690k;
        region.set(bounds);
        RectF f2 = f();
        Path path = this.f688g;
        b(f2, path);
        Region region2 = this.f691l;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final void h(Context context) {
        this.f683a.f670b = new L0.a(context);
        m();
    }

    public final void i(float f2) {
        f fVar = this.f683a;
        if (fVar.f678m != f2) {
            fVar.f678m = f2;
            m();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f686e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f683a.f672e;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.f683a.getClass();
        ColorStateList colorStateList2 = this.f683a.d;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f683a.f671c;
        return colorStateList3 != null && colorStateList3.isStateful();
    }

    public final void j(ColorStateList colorStateList) {
        f fVar = this.f683a;
        if (fVar.f671c != colorStateList) {
            fVar.f671c = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean k(int[] iArr) {
        boolean z2;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f683a.f671c == null || color2 == (colorForState2 = this.f683a.f671c.getColorForState(iArr, (color2 = (paint2 = this.f693n).getColor())))) {
            z2 = false;
        } else {
            paint2.setColor(colorForState2);
            z2 = true;
        }
        if (this.f683a.d == null || color == (colorForState = this.f683a.d.getColorForState(iArr, (color = (paint = this.f694o).getColor())))) {
            return z2;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final boolean l() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f697r;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f698s;
        f fVar = this.f683a;
        ColorStateList colorStateList = fVar.f672e;
        PorterDuff.Mode mode = fVar.f673f;
        Paint paint = this.f693n;
        if (colorStateList == null || mode == null) {
            int color = paint.getColor();
            int c2 = c(color);
            porterDuffColorFilter = c2 != color ? new PorterDuffColorFilter(c2, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(c(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.f697r = porterDuffColorFilter;
        this.f683a.getClass();
        this.f698s = null;
        this.f683a.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f697r) && Objects.equals(porterDuffColorFilter3, this.f698s)) ? false : true;
    }

    public final void m() {
        f fVar = this.f683a;
        float f2 = fVar.f678m + 0.0f;
        fVar.f679n = (int) Math.ceil(0.75f * f2);
        this.f683a.f680o = (int) Math.ceil(f2 * 0.25f);
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f683a = new f(this.f683a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f686e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, M0.i
    public boolean onStateChange(int[] iArr) {
        boolean z2 = k(iArr) || l();
        if (z2) {
            invalidateSelf();
        }
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        f fVar = this.f683a;
        if (fVar.f676k != i) {
            fVar.f676k = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f683a.getClass();
        super.invalidateSelf();
    }

    @Override // T0.u
    public final void setShapeAppearanceModel(k kVar) {
        this.f683a.f669a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f683a.f672e = colorStateList;
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        f fVar = this.f683a;
        if (fVar.f673f != mode) {
            fVar.f673f = mode;
            l();
            super.invalidateSelf();
        }
    }

    public g(Context context, AttributeSet attributeSet, int i, int i2) {
        this(k.b(context, attributeSet, i, i2).a());
    }

    public g(k kVar) {
        this(new f(kVar));
    }

    public g(f fVar) {
        m mVar;
        this.f684b = new s[4];
        this.f685c = new s[4];
        this.d = new BitSet(8);
        this.f687f = new Matrix();
        this.f688g = new Path();
        this.h = new Path();
        this.i = new RectF();
        this.f689j = new RectF();
        this.f690k = new Region();
        this.f691l = new Region();
        Paint paint = new Paint(1);
        this.f693n = paint;
        Paint paint2 = new Paint(1);
        this.f694o = paint2;
        new S0.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            mVar = l.f719a;
        } else {
            mVar = new m();
        }
        this.f696q = mVar;
        this.f699t = new RectF();
        this.f683a = fVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        l();
        k(getState());
        this.f695p = new A0.c(10, this);
    }
}
