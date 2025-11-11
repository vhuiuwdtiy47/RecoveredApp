package t0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: t0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0343p extends AbstractC0334g {

    /* renamed from: j, reason: collision with root package name */
    public static final PorterDuff.Mode f3882j = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public C0341n f3883b;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuffColorFilter f3884c;
    public ColorFilter d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3885e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3886f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f3887g;
    public final Matrix h;
    public final Rect i;

    /* JADX WARN: Type inference failed for: r0v5, types: [android.graphics.drawable.Drawable$ConstantState, t0.n] */
    public C0343p() {
        this.f3886f = true;
        this.f3887g = new float[9];
        this.h = new Matrix();
        this.i = new Rect();
        ?? constantState = new Drawable.ConstantState();
        constantState.f3874c = null;
        constantState.d = f3882j;
        constantState.f3873b = new C0340m();
        this.f3883b = constantState;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f3839a;
        if (drawable == null) {
            return false;
        }
        E.a.b(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f3839a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.i;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.d;
        if (colorFilter == null) {
            colorFilter = this.f3884c;
        }
        Matrix matrix = this.h;
        canvas.getMatrix(matrix);
        float[] fArr = this.f3887g;
        matrix.getValues(fArr);
        float abs = Math.abs(fArr[0]);
        float abs2 = Math.abs(fArr[4]);
        float abs3 = Math.abs(fArr[1]);
        float abs4 = Math.abs(fArr[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int width = (int) (rect.width() * abs);
        int min = Math.min(2048, width);
        int min2 = Math.min(2048, (int) (rect.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && E.b.a(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        C0341n c0341n = this.f3883b;
        Bitmap bitmap = c0341n.f3876f;
        if (bitmap == null || min != bitmap.getWidth() || min2 != c0341n.f3876f.getHeight()) {
            c0341n.f3876f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
            c0341n.f3879k = true;
        }
        if (this.f3886f) {
            C0341n c0341n2 = this.f3883b;
            if (c0341n2.f3879k || c0341n2.f3877g != c0341n2.f3874c || c0341n2.h != c0341n2.d || c0341n2.f3878j != c0341n2.f3875e || c0341n2.i != c0341n2.f3873b.getRootAlpha()) {
                C0341n c0341n3 = this.f3883b;
                c0341n3.f3876f.eraseColor(0);
                Canvas canvas2 = new Canvas(c0341n3.f3876f);
                C0340m c0340m = c0341n3.f3873b;
                c0340m.a(c0340m.f3865g, C0340m.f3859p, canvas2, min, min2);
                C0341n c0341n4 = this.f3883b;
                c0341n4.f3877g = c0341n4.f3874c;
                c0341n4.h = c0341n4.d;
                c0341n4.i = c0341n4.f3873b.getRootAlpha();
                c0341n4.f3878j = c0341n4.f3875e;
                c0341n4.f3879k = false;
            }
        } else {
            C0341n c0341n5 = this.f3883b;
            c0341n5.f3876f.eraseColor(0);
            Canvas canvas3 = new Canvas(c0341n5.f3876f);
            C0340m c0340m2 = c0341n5.f3873b;
            c0340m2.a(c0340m2.f3865g, C0340m.f3859p, canvas3, min, min2);
        }
        C0341n c0341n6 = this.f3883b;
        if (c0341n6.f3873b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (c0341n6.f3880l == null) {
                Paint paint2 = new Paint();
                c0341n6.f3880l = paint2;
                paint2.setFilterBitmap(true);
            }
            c0341n6.f3880l.setAlpha(c0341n6.f3873b.getRootAlpha());
            c0341n6.f3880l.setColorFilter(colorFilter);
            paint = c0341n6.f3880l;
        }
        canvas.drawBitmap(c0341n6.f3876f, (Rect) null, rect, paint);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f3839a;
        return drawable != null ? drawable.getAlpha() : this.f3883b.f3873b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f3839a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return this.f3883b.getChangingConfigurations() | super.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f3839a;
        return drawable != null ? E.a.c(drawable) : this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f3839a != null) {
            return new C0342o(this.f3839a.getConstantState());
        }
        this.f3883b.f3872a = getChangingConfigurations();
        return this.f3883b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f3839a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f3883b.f3873b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f3839a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f3883b.f3873b.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f3839a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f3839a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f3839a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f3839a;
        return drawable != null ? drawable.isAutoMirrored() : this.f3883b.f3875e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f3839a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        C0341n c0341n = this.f3883b;
        if (c0341n == null) {
            return false;
        }
        C0340m c0340m = c0341n.f3873b;
        if (c0340m.f3870n == null) {
            c0340m.f3870n = Boolean.valueOf(c0340m.f3865g.a());
        }
        if (c0340m.f3870n.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.f3883b.f3874c;
        return colorStateList != null && colorStateList.isStateful();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.graphics.drawable.Drawable$ConstantState, t0.n] */
    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f3839a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f3885e && super.mutate() == this) {
            C0341n c0341n = this.f3883b;
            ?? constantState = new Drawable.ConstantState();
            constantState.f3874c = null;
            constantState.d = f3882j;
            if (c0341n != null) {
                constantState.f3872a = c0341n.f3872a;
                C0340m c0340m = new C0340m(c0341n.f3873b);
                constantState.f3873b = c0340m;
                if (c0341n.f3873b.f3863e != null) {
                    c0340m.f3863e = new Paint(c0341n.f3873b.f3863e);
                }
                if (c0341n.f3873b.d != null) {
                    constantState.f3873b.d = new Paint(c0341n.f3873b.d);
                }
                constantState.f3874c = c0341n.f3874c;
                constantState.d = c0341n.d;
                constantState.f3875e = c0341n.f3875e;
            }
            this.f3883b = constantState;
            this.f3885e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3839a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z2;
        PorterDuff.Mode mode;
        Drawable drawable = this.f3839a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C0341n c0341n = this.f3883b;
        ColorStateList colorStateList = c0341n.f3874c;
        if (colorStateList == null || (mode = c0341n.d) == null) {
            z2 = false;
        } else {
            this.f3884c = a(colorStateList, mode);
            invalidateSelf();
            z2 = true;
        }
        C0340m c0340m = c0341n.f3873b;
        if (c0340m.f3870n == null) {
            c0340m.f3870n = Boolean.valueOf(c0340m.f3865g.a());
        }
        if (c0340m.f3870n.booleanValue()) {
            boolean b2 = c0341n.f3873b.f3865g.b(iArr);
            c0341n.f3879k |= b2;
            if (b2) {
                invalidateSelf();
                return true;
            }
        }
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.f3839a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f3839a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f3883b.f3873b.getRootAlpha() != i) {
            this.f3883b.f3873b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f3839a;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.f3883b.f3875e = z2;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3839a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f3839a;
        if (drawable != null) {
            Z0.i.j0(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f3839a;
        if (drawable != null) {
            E.a.h(drawable, colorStateList);
            return;
        }
        C0341n c0341n = this.f3883b;
        if (c0341n.f3874c != colorStateList) {
            c0341n.f3874c = colorStateList;
            this.f3884c = a(colorStateList, c0341n.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3839a;
        if (drawable != null) {
            E.a.i(drawable, mode);
            return;
        }
        C0341n c0341n = this.f3883b;
        if (c0341n.d != mode) {
            c0341n.d = mode;
            this.f3884c = a(c0341n.f3874c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f3839a;
        return drawable != null ? drawable.setVisible(z2, z3) : super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f3839a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v19, types: [t0.i, java.lang.Object, t0.l] */
    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C0340m c0340m;
        int i;
        boolean z2;
        char c2;
        int i2;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = this.f3839a;
        if (drawable != null) {
            E.a.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0341n c0341n = this.f3883b;
        c0341n.f3873b = new C0340m();
        TypedArray f2 = C.b.f(resources, theme, attributeSet, AbstractC0328a.f3824a);
        C0341n c0341n2 = this.f3883b;
        C0340m c0340m2 = c0341n2.f3873b;
        int i3 = !C.b.c(xmlPullParser, "tintMode") ? -1 : f2.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i3 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i3 != 5) {
            if (i3 != 9) {
                switch (i3) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        c0341n2.d = mode;
        int i4 = 1;
        ColorStateList colorStateList = null;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            f2.getValue(1, typedValue);
            int i5 = typedValue.type;
            if (i5 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i5 >= 28 && i5 <= 31) {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = f2.getResources();
                int resourceId = f2.getResourceId(1, 0);
                ThreadLocal threadLocal = C.c.f47a;
                try {
                    colorStateList = C.c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e2) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e2);
                }
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            c0341n2.f3874c = colorStateList2;
        }
        boolean z3 = c0341n2.f3875e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z3 = f2.getBoolean(5, z3);
        }
        c0341n2.f3875e = z3;
        float f3 = c0340m2.f3866j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f3 = f2.getFloat(7, f3);
        }
        c0340m2.f3866j = f3;
        float f4 = c0340m2.f3867k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f4 = f2.getFloat(8, f4);
        }
        c0340m2.f3867k = f4;
        boolean z4 = false;
        if (c0340m2.f3866j <= 0.0f) {
            throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f4 > 0.0f) {
            c0340m2.h = f2.getDimension(3, c0340m2.h);
            float dimension = f2.getDimension(2, c0340m2.i);
            c0340m2.i = dimension;
            if (c0340m2.h <= 0.0f) {
                throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = c0340m2.getAlpha();
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                    alpha = f2.getFloat(4, alpha);
                }
                c0340m2.setAlpha(alpha);
                String string = f2.getString(0);
                if (string != null) {
                    c0340m2.f3869m = string;
                    c0340m2.f3871o.put(string, c0340m2);
                }
                f2.recycle();
                c0341n.f3872a = getChangingConfigurations();
                c0341n.f3879k = true;
                C0341n c0341n3 = this.f3883b;
                C0340m c0340m3 = c0341n3.f3873b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(c0340m3.f3865g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z5 = true;
                while (eventType != i4 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        C0337j c0337j = (C0337j) arrayDeque.peek();
                        boolean equals = "path".equals(name);
                        i = depth;
                        o.f fVar = c0340m3.f3871o;
                        if (equals) {
                            ?? abstractC0339l = new AbstractC0339l();
                            abstractC0339l.f3840e = 0.0f;
                            abstractC0339l.f3842g = 1.0f;
                            abstractC0339l.h = 1.0f;
                            c0340m = c0340m3;
                            abstractC0339l.i = 0.0f;
                            abstractC0339l.f3843j = 1.0f;
                            abstractC0339l.f3844k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            abstractC0339l.f3845l = cap2;
                            Paint.Join join2 = Paint.Join.MITER;
                            abstractC0339l.f3846m = join2;
                            abstractC0339l.f3847n = 4.0f;
                            TypedArray f5 = C.b.f(resources, theme, attributeSet, AbstractC0328a.f3826c);
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                String string2 = f5.getString(0);
                                if (string2 != null) {
                                    abstractC0339l.f3857b = string2;
                                }
                                String string3 = f5.getString(2);
                                if (string3 != null) {
                                    abstractC0339l.f3856a = Z0.i.r(string3);
                                }
                                abstractC0339l.f3841f = C.b.b(f5, xmlPullParser, theme, "fillColor", 1);
                                float f6 = abstractC0339l.h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                    f6 = f5.getFloat(12, f6);
                                }
                                abstractC0339l.h = f6;
                                int i6 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? f5.getInt(8, -1) : -1;
                                Paint.Cap cap3 = abstractC0339l.f3845l;
                                if (i6 == 0) {
                                    cap = cap2;
                                } else if (i6 != 1) {
                                    cap = i6 != 2 ? cap3 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                abstractC0339l.f3845l = cap;
                                int i7 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? f5.getInt(9, -1) : -1;
                                Paint.Join join3 = abstractC0339l.f3846m;
                                if (i7 == 0) {
                                    join = join2;
                                } else if (i7 != 1) {
                                    join = i7 != 2 ? join3 : Paint.Join.BEVEL;
                                } else {
                                    join = Paint.Join.ROUND;
                                }
                                abstractC0339l.f3846m = join;
                                float f7 = abstractC0339l.f3847n;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                    f7 = f5.getFloat(10, f7);
                                }
                                abstractC0339l.f3847n = f7;
                                abstractC0339l.d = C.b.b(f5, xmlPullParser, theme, "strokeColor", 3);
                                float f8 = abstractC0339l.f3842g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                    f8 = f5.getFloat(11, f8);
                                }
                                abstractC0339l.f3842g = f8;
                                float f9 = abstractC0339l.f3840e;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                    f9 = f5.getFloat(4, f9);
                                }
                                abstractC0339l.f3840e = f9;
                                float f10 = abstractC0339l.f3843j;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                    f10 = f5.getFloat(6, f10);
                                }
                                abstractC0339l.f3843j = f10;
                                float f11 = abstractC0339l.f3844k;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                    f11 = f5.getFloat(7, f11);
                                }
                                abstractC0339l.f3844k = f11;
                                float f12 = abstractC0339l.i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                    f12 = f5.getFloat(5, f12);
                                }
                                abstractC0339l.i = f12;
                                int i8 = abstractC0339l.f3858c;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                    i8 = f5.getInt(13, i8);
                                }
                                abstractC0339l.f3858c = i8;
                            }
                            f5.recycle();
                            c0337j.f3849b.add(abstractC0339l);
                            if (abstractC0339l.getPathName() != null) {
                                fVar.put(abstractC0339l.getPathName(), abstractC0339l);
                            }
                            c0341n3.f3872a = c0341n3.f3872a;
                            z5 = false;
                            c2 = '\b';
                            z2 = false;
                        } else {
                            c0340m = c0340m3;
                            c2 = '\b';
                            z2 = false;
                            if ("clip-path".equals(name)) {
                                AbstractC0339l abstractC0339l2 = new AbstractC0339l();
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                    TypedArray f13 = C.b.f(resources, theme, attributeSet, AbstractC0328a.d);
                                    String string4 = f13.getString(0);
                                    if (string4 != null) {
                                        abstractC0339l2.f3857b = string4;
                                    }
                                    String string5 = f13.getString(1);
                                    if (string5 != null) {
                                        abstractC0339l2.f3856a = Z0.i.r(string5);
                                    }
                                    abstractC0339l2.f3858c = !C.b.c(xmlPullParser, "fillType") ? 0 : f13.getInt(2, 0);
                                    f13.recycle();
                                }
                                c0337j.f3849b.add(abstractC0339l2);
                                if (abstractC0339l2.getPathName() != null) {
                                    fVar.put(abstractC0339l2.getPathName(), abstractC0339l2);
                                }
                                c0341n3.f3872a = c0341n3.f3872a;
                            } else if ("group".equals(name)) {
                                C0337j c0337j2 = new C0337j();
                                TypedArray f14 = C.b.f(resources, theme, attributeSet, AbstractC0328a.f3825b);
                                float f15 = c0337j2.f3850c;
                                if (C.b.c(xmlPullParser, "rotation")) {
                                    f15 = f14.getFloat(5, f15);
                                }
                                c0337j2.f3850c = f15;
                                c0337j2.d = f14.getFloat(1, c0337j2.d);
                                c0337j2.f3851e = f14.getFloat(2, c0337j2.f3851e);
                                float f16 = c0337j2.f3852f;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                    f16 = f14.getFloat(3, f16);
                                }
                                c0337j2.f3852f = f16;
                                float f17 = c0337j2.f3853g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                    f17 = f14.getFloat(4, f17);
                                }
                                c0337j2.f3853g = f17;
                                float f18 = c0337j2.h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                    f18 = f14.getFloat(6, f18);
                                }
                                c0337j2.h = f18;
                                float f19 = c0337j2.i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                    f19 = f14.getFloat(7, f19);
                                }
                                c0337j2.i = f19;
                                String string6 = f14.getString(0);
                                if (string6 != null) {
                                    c0337j2.f3855k = string6;
                                }
                                c0337j2.c();
                                f14.recycle();
                                c0337j.f3849b.add(c0337j2);
                                arrayDeque.push(c0337j2);
                                if (c0337j2.getGroupName() != null) {
                                    fVar.put(c0337j2.getGroupName(), c0337j2);
                                }
                                c0341n3.f3872a = c0341n3.f3872a;
                            }
                        }
                        i2 = 1;
                    } else {
                        c0340m = c0340m3;
                        i = depth;
                        z2 = z4;
                        c2 = '\b';
                        i2 = 1;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i4 = i2;
                    z4 = z2;
                    c0340m3 = c0340m;
                    depth = i;
                }
                if (!z5) {
                    this.f3884c = a(c0341n.f3874c, c0341n.d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public C0343p(C0341n c0341n) {
        this.f3886f = true;
        this.f3887g = new float[9];
        this.h = new Matrix();
        this.i = new Rect();
        this.f3883b = c0341n;
        this.f3884c = a(c0341n.f3874c, c0341n.d);
    }
}
