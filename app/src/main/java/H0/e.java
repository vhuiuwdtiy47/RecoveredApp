package H0;

import M0.i;
import M0.j;
import T0.f;
import T0.g;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class e extends g implements Drawable.Callback, i {

    /* renamed from: D0, reason: collision with root package name */
    public static final int[] f195D0 = {R.attr.state_enabled};

    /* renamed from: E0, reason: collision with root package name */
    public static final ShapeDrawable f196E0 = new ShapeDrawable(new OvalShape());

    /* renamed from: A, reason: collision with root package name */
    public float f197A;

    /* renamed from: A0, reason: collision with root package name */
    public boolean f198A0;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f199B;

    /* renamed from: B0, reason: collision with root package name */
    public int f200B0;

    /* renamed from: C, reason: collision with root package name */
    public CharSequence f201C;

    /* renamed from: C0, reason: collision with root package name */
    public boolean f202C0;

    /* renamed from: D, reason: collision with root package name */
    public boolean f203D;

    /* renamed from: E, reason: collision with root package name */
    public Drawable f204E;

    /* renamed from: F, reason: collision with root package name */
    public ColorStateList f205F;
    public float G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f206H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f207I;

    /* renamed from: J, reason: collision with root package name */
    public Drawable f208J;

    /* renamed from: K, reason: collision with root package name */
    public RippleDrawable f209K;

    /* renamed from: L, reason: collision with root package name */
    public ColorStateList f210L;

    /* renamed from: M, reason: collision with root package name */
    public float f211M;

    /* renamed from: N, reason: collision with root package name */
    public SpannableStringBuilder f212N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f213O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f214P;

    /* renamed from: Q, reason: collision with root package name */
    public Drawable f215Q;

    /* renamed from: R, reason: collision with root package name */
    public ColorStateList f216R;

    /* renamed from: S, reason: collision with root package name */
    public x0.b f217S;

    /* renamed from: T, reason: collision with root package name */
    public x0.b f218T;

    /* renamed from: U, reason: collision with root package name */
    public float f219U;

    /* renamed from: V, reason: collision with root package name */
    public float f220V;

    /* renamed from: W, reason: collision with root package name */
    public float f221W;

    /* renamed from: X, reason: collision with root package name */
    public float f222X;

    /* renamed from: Y, reason: collision with root package name */
    public float f223Y;

    /* renamed from: Z, reason: collision with root package name */
    public float f224Z;

    /* renamed from: a0, reason: collision with root package name */
    public float f225a0;
    public float b0;

    /* renamed from: c0, reason: collision with root package name */
    public final Context f226c0;

    /* renamed from: d0, reason: collision with root package name */
    public final Paint f227d0;

    /* renamed from: e0, reason: collision with root package name */
    public final Paint.FontMetrics f228e0;

    /* renamed from: f0, reason: collision with root package name */
    public final RectF f229f0;

    /* renamed from: g0, reason: collision with root package name */
    public final PointF f230g0;

    /* renamed from: h0, reason: collision with root package name */
    public final Path f231h0;

    /* renamed from: i0, reason: collision with root package name */
    public final j f232i0;

    /* renamed from: j0, reason: collision with root package name */
    public int f233j0;

    /* renamed from: k0, reason: collision with root package name */
    public int f234k0;

    /* renamed from: l0, reason: collision with root package name */
    public int f235l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f236m0;

    /* renamed from: n0, reason: collision with root package name */
    public int f237n0;

    /* renamed from: o0, reason: collision with root package name */
    public int f238o0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f239p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f240q0;
    public int r0;

    /* renamed from: s0, reason: collision with root package name */
    public ColorFilter f241s0;

    /* renamed from: t0, reason: collision with root package name */
    public PorterDuffColorFilter f242t0;

    /* renamed from: u0, reason: collision with root package name */
    public ColorStateList f243u0;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f244v;
    public PorterDuff.Mode v0;

    /* renamed from: w, reason: collision with root package name */
    public ColorStateList f245w;

    /* renamed from: w0, reason: collision with root package name */
    public int[] f246w0;

    /* renamed from: x, reason: collision with root package name */
    public float f247x;

    /* renamed from: x0, reason: collision with root package name */
    public ColorStateList f248x0;

    /* renamed from: y, reason: collision with root package name */
    public float f249y;

    /* renamed from: y0, reason: collision with root package name */
    public WeakReference f250y0;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f251z;

    /* renamed from: z0, reason: collision with root package name */
    public TextUtils.TruncateAt f252z0;

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.android.music.R.attr.chipStyle, com.android.music.R.style.Widget_MaterialComponents_Chip_Action);
        this.f249y = -1.0f;
        this.f227d0 = new Paint(1);
        this.f228e0 = new Paint.FontMetrics();
        this.f229f0 = new RectF();
        this.f230g0 = new PointF();
        this.f231h0 = new Path();
        this.r0 = 255;
        this.v0 = PorterDuff.Mode.SRC_IN;
        this.f250y0 = new WeakReference(null);
        h(context);
        this.f226c0 = context;
        j jVar = new j(this);
        this.f232i0 = jVar;
        this.f201C = "";
        jVar.f490a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f195D0;
        setState(iArr);
        if (!Arrays.equals(this.f246w0, iArr)) {
            this.f246w0 = iArr;
            if (S()) {
                v(getState(), iArr);
            }
        }
        this.f198A0 = true;
        f196E0.setTint(-1);
    }

    public static void T(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean s(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean t(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final void A(float f2) {
        if (this.f249y != f2) {
            this.f249y = f2;
            T0.j e2 = this.f683a.f669a.e();
            e2.f704e = new T0.a(f2);
            e2.f705f = new T0.a(f2);
            e2.f706g = new T0.a(f2);
            e2.h = new T0.a(f2);
            setShapeAppearanceModel(e2.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void B(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f204E;
        if (drawable3 != 0) {
            boolean z2 = drawable3 instanceof E.d;
            drawable2 = drawable3;
            if (z2) {
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float p2 = p();
            this.f204E = drawable != null ? drawable.mutate() : null;
            float p3 = p();
            T(drawable2);
            if (R()) {
                n(this.f204E);
            }
            invalidateSelf();
            if (p2 != p3) {
                u();
            }
        }
    }

    public final void C(float f2) {
        if (this.G != f2) {
            float p2 = p();
            this.G = f2;
            float p3 = p();
            invalidateSelf();
            if (p2 != p3) {
                u();
            }
        }
    }

    public final void D(ColorStateList colorStateList) {
        this.f206H = true;
        if (this.f205F != colorStateList) {
            this.f205F = colorStateList;
            if (R()) {
                E.a.h(this.f204E, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void E(boolean z2) {
        if (this.f203D != z2) {
            boolean R2 = R();
            this.f203D = z2;
            boolean R3 = R();
            if (R2 != R3) {
                if (R3) {
                    n(this.f204E);
                } else {
                    T(this.f204E);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public final void F(ColorStateList colorStateList) {
        if (this.f251z != colorStateList) {
            this.f251z = colorStateList;
            if (this.f202C0) {
                f fVar = this.f683a;
                if (fVar.d != colorStateList) {
                    fVar.d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void G(float f2) {
        if (this.f197A != f2) {
            this.f197A = f2;
            this.f227d0.setStrokeWidth(f2);
            if (this.f202C0) {
                this.f683a.f675j = f2;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void H(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f208J;
        if (drawable3 != 0) {
            boolean z2 = drawable3 instanceof E.d;
            drawable2 = drawable3;
            if (z2) {
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float q2 = q();
            this.f208J = drawable != null ? drawable.mutate() : null;
            this.f209K = new RippleDrawable(R0.a.b(this.f199B), this.f208J, f196E0);
            float q3 = q();
            T(drawable2);
            if (S()) {
                n(this.f208J);
            }
            invalidateSelf();
            if (q2 != q3) {
                u();
            }
        }
    }

    public final void I(float f2) {
        if (this.f225a0 != f2) {
            this.f225a0 = f2;
            invalidateSelf();
            if (S()) {
                u();
            }
        }
    }

    public final void J(float f2) {
        if (this.f211M != f2) {
            this.f211M = f2;
            invalidateSelf();
            if (S()) {
                u();
            }
        }
    }

    public final void K(float f2) {
        if (this.f224Z != f2) {
            this.f224Z = f2;
            invalidateSelf();
            if (S()) {
                u();
            }
        }
    }

    public final void L(ColorStateList colorStateList) {
        if (this.f210L != colorStateList) {
            this.f210L = colorStateList;
            if (S()) {
                E.a.h(this.f208J, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void M(boolean z2) {
        if (this.f207I != z2) {
            boolean S2 = S();
            this.f207I = z2;
            boolean S3 = S();
            if (S2 != S3) {
                if (S3) {
                    n(this.f208J);
                } else {
                    T(this.f208J);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public final void N(float f2) {
        if (this.f221W != f2) {
            float p2 = p();
            this.f221W = f2;
            float p3 = p();
            invalidateSelf();
            if (p2 != p3) {
                u();
            }
        }
    }

    public final void O(float f2) {
        if (this.f220V != f2) {
            float p2 = p();
            this.f220V = f2;
            float p3 = p();
            invalidateSelf();
            if (p2 != p3) {
                u();
            }
        }
    }

    public final void P(ColorStateList colorStateList) {
        if (this.f199B != colorStateList) {
            this.f199B = colorStateList;
            this.f248x0 = null;
            onStateChange(getState());
        }
    }

    public final boolean Q() {
        return this.f214P && this.f215Q != null && this.f239p0;
    }

    public final boolean R() {
        return this.f203D && this.f204E != null;
    }

    public final boolean S() {
        return this.f207I && this.f208J != null;
    }

    @Override // M0.i
    public final void a() {
        u();
        invalidateSelf();
    }

    @Override // T0.g, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2;
        int i2;
        float f2;
        int i3;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.r0) == 0) {
            return;
        }
        if (i < 255) {
            canvas2 = canvas;
            i2 = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i);
        } else {
            canvas2 = canvas;
            i2 = 0;
        }
        boolean z2 = this.f202C0;
        Paint paint = this.f227d0;
        RectF rectF = this.f229f0;
        if (!z2) {
            paint.setColor(this.f233j0);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, r(), r(), paint);
        }
        if (!this.f202C0) {
            paint.setColor(this.f234k0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f241s0;
            if (colorFilter == null) {
                colorFilter = this.f242t0;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, r(), r(), paint);
        }
        if (this.f202C0) {
            super.draw(canvas);
        }
        if (this.f197A > 0.0f && !this.f202C0) {
            paint.setColor(this.f236m0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.f202C0) {
                ColorFilter colorFilter2 = this.f241s0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f242t0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f3 = bounds.left;
            float f4 = this.f197A / 2.0f;
            rectF.set(f3 + f4, bounds.top + f4, bounds.right - f4, bounds.bottom - f4);
            float f5 = this.f249y - (this.f197A / 2.0f);
            canvas2.drawRoundRect(rectF, f5, f5, paint);
        }
        paint.setColor(this.f237n0);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.f202C0) {
            RectF rectF2 = new RectF(bounds);
            Path path = this.f231h0;
            f fVar = this.f683a;
            this.f696q.a(fVar.f669a, fVar.i, rectF2, this.f695p, path);
            d(canvas2, paint, path, this.f683a.f669a, f());
        } else {
            canvas2.drawRoundRect(rectF, r(), r(), paint);
        }
        if (R()) {
            o(bounds, rectF);
            float f6 = rectF.left;
            float f7 = rectF.top;
            canvas2.translate(f6, f7);
            this.f204E.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f204E.draw(canvas2);
            canvas2.translate(-f6, -f7);
        }
        if (Q()) {
            o(bounds, rectF);
            float f8 = rectF.left;
            float f9 = rectF.top;
            canvas2.translate(f8, f9);
            this.f215Q.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f215Q.draw(canvas2);
            canvas2.translate(-f8, -f9);
        }
        if (this.f198A0 && this.f201C != null) {
            PointF pointF = this.f230g0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f201C;
            j jVar = this.f232i0;
            if (charSequence != null) {
                float p2 = p() + this.f219U + this.f222X;
                if (E.b.a(this) == 0) {
                    pointF.x = bounds.left + p2;
                } else {
                    pointF.x = bounds.right - p2;
                    align = Paint.Align.RIGHT;
                }
                float centerY = bounds.centerY();
                TextPaint textPaint = jVar.f490a;
                Paint.FontMetrics fontMetrics = this.f228e0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF.setEmpty();
            if (this.f201C != null) {
                float p3 = p() + this.f219U + this.f222X;
                float q2 = q() + this.b0 + this.f223Y;
                if (E.b.a(this) == 0) {
                    rectF.left = bounds.left + p3;
                    rectF.right = bounds.right - q2;
                } else {
                    rectF.left = bounds.left + q2;
                    rectF.right = bounds.right - p3;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            Q0.d dVar = jVar.f495g;
            TextPaint textPaint2 = jVar.f490a;
            if (dVar != null) {
                textPaint2.drawableState = getState();
                jVar.f495g.e(this.f226c0, textPaint2, jVar.f491b);
            }
            textPaint2.setTextAlign(align);
            String charSequence2 = this.f201C.toString();
            if (jVar.f493e) {
                jVar.a(charSequence2);
                f2 = jVar.f492c;
            } else {
                f2 = jVar.f492c;
            }
            boolean z3 = Math.round(f2) > Math.round(rectF.width());
            if (z3) {
                int save = canvas2.save();
                canvas2.clipRect(rectF);
                i3 = save;
            } else {
                i3 = 0;
            }
            CharSequence charSequence3 = this.f201C;
            if (z3 && this.f252z0 != null) {
                charSequence3 = TextUtils.ellipsize(charSequence3, textPaint2, rectF.width(), this.f252z0);
            }
            canvas.drawText(charSequence3, 0, charSequence3.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z3) {
                canvas2.restoreToCount(i3);
            }
        }
        if (S()) {
            rectF.setEmpty();
            if (S()) {
                float f10 = this.b0 + this.f225a0;
                if (E.b.a(this) == 0) {
                    float f11 = bounds.right - f10;
                    rectF.right = f11;
                    rectF.left = f11 - this.f211M;
                } else {
                    float f12 = bounds.left + f10;
                    rectF.left = f12;
                    rectF.right = f12 + this.f211M;
                }
                float exactCenterY = bounds.exactCenterY();
                float f13 = this.f211M;
                float f14 = exactCenterY - (f13 / 2.0f);
                rectF.top = f14;
                rectF.bottom = f14 + f13;
            }
            float f15 = rectF.left;
            float f16 = rectF.top;
            canvas2.translate(f15, f16);
            this.f208J.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f209K.setBounds(this.f208J.getBounds());
            this.f209K.jumpToCurrentState();
            this.f209K.draw(canvas2);
            canvas2.translate(-f15, -f16);
        }
        if (this.r0 < 255) {
            canvas2.restoreToCount(i2);
        }
    }

    @Override // T0.g, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.r0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f241s0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f247x;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f2;
        float p2 = p() + this.f219U + this.f222X;
        String charSequence = this.f201C.toString();
        j jVar = this.f232i0;
        if (jVar.f493e) {
            jVar.a(charSequence);
            f2 = jVar.f492c;
        } else {
            f2 = jVar.f492c;
        }
        return Math.min(Math.round(q() + f2 + p2 + this.f223Y + this.b0), this.f200B0);
    }

    @Override // T0.g, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // T0.g, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.f202C0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f247x, this.f249y);
        } else {
            outline.setRoundRect(bounds, this.f249y);
            outline2 = outline;
        }
        outline2.setAlpha(this.r0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // T0.g, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (s(this.f244v) || s(this.f245w) || s(this.f251z)) {
            return true;
        }
        Q0.d dVar = this.f232i0.f495g;
        if (dVar == null || (colorStateList = dVar.f597j) == null || !colorStateList.isStateful()) {
            return (this.f214P && this.f215Q != null && this.f213O) || t(this.f204E) || t(this.f215Q) || s(this.f243u0);
        }
        return true;
    }

    public final void n(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        E.b.b(drawable, E.b.a(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f208J) {
            if (drawable.isStateful()) {
                drawable.setState(this.f246w0);
            }
            E.a.h(drawable, this.f210L);
            return;
        }
        Drawable drawable2 = this.f204E;
        if (drawable == drawable2 && this.f206H) {
            E.a.h(drawable2, this.f205F);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void o(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (R() || Q()) {
            float f2 = this.f219U + this.f220V;
            Drawable drawable = this.f239p0 ? this.f215Q : this.f204E;
            float f3 = this.G;
            if (f3 <= 0.0f && drawable != null) {
                f3 = drawable.getIntrinsicWidth();
            }
            if (E.b.a(this) == 0) {
                float f4 = rect.left + f2;
                rectF.left = f4;
                rectF.right = f4 + f3;
            } else {
                float f5 = rect.right - f2;
                rectF.right = f5;
                rectF.left = f5 - f3;
            }
            Drawable drawable2 = this.f239p0 ? this.f215Q : this.f204E;
            float f6 = this.G;
            if (f6 <= 0.0f && drawable2 != null) {
                f6 = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.f226c0.getResources().getDisplayMetrics()));
                if (drawable2.getIntrinsicHeight() <= f6) {
                    f6 = drawable2.getIntrinsicHeight();
                }
            }
            float exactCenterY = rect.exactCenterY() - (f6 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + f6;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (R()) {
            onLayoutDirectionChanged |= E.b.b(this.f204E, i);
        }
        if (Q()) {
            onLayoutDirectionChanged |= E.b.b(this.f215Q, i);
        }
        if (S()) {
            onLayoutDirectionChanged |= E.b.b(this.f208J, i);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (R()) {
            onLevelChange |= this.f204E.setLevel(i);
        }
        if (Q()) {
            onLevelChange |= this.f215Q.setLevel(i);
        }
        if (S()) {
            onLevelChange |= this.f208J.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // T0.g, android.graphics.drawable.Drawable, M0.i
    public final boolean onStateChange(int[] iArr) {
        if (this.f202C0) {
            super.onStateChange(iArr);
        }
        return v(iArr, this.f246w0);
    }

    public final float p() {
        if (!R() && !Q()) {
            return 0.0f;
        }
        float f2 = this.f220V;
        Drawable drawable = this.f239p0 ? this.f215Q : this.f204E;
        float f3 = this.G;
        if (f3 <= 0.0f && drawable != null) {
            f3 = drawable.getIntrinsicWidth();
        }
        return f3 + f2 + this.f221W;
    }

    public final float q() {
        if (S()) {
            return this.f224Z + this.f211M + this.f225a0;
        }
        return 0.0f;
    }

    public final float r() {
        return this.f202C0 ? this.f683a.f669a.f713e.a(f()) : this.f249y;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j2);
        }
    }

    @Override // T0.g, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.r0 != i) {
            this.r0 = i;
            invalidateSelf();
        }
    }

    @Override // T0.g, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f241s0 != colorFilter) {
            this.f241s0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // T0.g, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f243u0 != colorStateList) {
            this.f243u0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // T0.g, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.v0 != mode) {
            this.v0 = mode;
            ColorStateList colorStateList = this.f243u0;
            this.f242t0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        if (R()) {
            visible |= this.f204E.setVisible(z2, z3);
        }
        if (Q()) {
            visible |= this.f215Q.setVisible(z2, z3);
        }
        if (S()) {
            visible |= this.f208J.setVisible(z2, z3);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void u() {
        d dVar = (d) this.f250y0.get();
        if (dVar != null) {
            Chip chip = (Chip) dVar;
            chip.b(chip.f1867p);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean v(int[] r12, int[] r13) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H0.e.v(int[], int[]):boolean");
    }

    public final void w(boolean z2) {
        if (this.f213O != z2) {
            this.f213O = z2;
            float p2 = p();
            if (!z2 && this.f239p0) {
                this.f239p0 = false;
            }
            float p3 = p();
            invalidateSelf();
            if (p2 != p3) {
                u();
            }
        }
    }

    public final void x(Drawable drawable) {
        if (this.f215Q != drawable) {
            float p2 = p();
            this.f215Q = drawable;
            float p3 = p();
            T(this.f215Q);
            n(this.f215Q);
            invalidateSelf();
            if (p2 != p3) {
                u();
            }
        }
    }

    public final void y(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f216R != colorStateList) {
            this.f216R = colorStateList;
            if (this.f214P && (drawable = this.f215Q) != null && this.f213O) {
                E.a.h(drawable, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void z(boolean z2) {
        if (this.f214P != z2) {
            boolean Q2 = Q();
            this.f214P = z2;
            boolean Q3 = Q();
            if (Q2 != Q3) {
                if (Q3) {
                    n(this.f215Q);
                } else {
                    T(this.f215Q);
                }
                invalidateSelf();
                u();
            }
        }
    }
}
