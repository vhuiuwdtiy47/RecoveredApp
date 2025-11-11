package M0;

import L.S;
import a0.C0076a;
import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.animation.LinearInterpolator;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import x0.AbstractC0375a;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f421A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f422B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f423C;

    /* renamed from: E, reason: collision with root package name */
    public Bitmap f425E;

    /* renamed from: F, reason: collision with root package name */
    public float f426F;
    public float G;

    /* renamed from: H, reason: collision with root package name */
    public float f427H;

    /* renamed from: I, reason: collision with root package name */
    public float f428I;

    /* renamed from: J, reason: collision with root package name */
    public float f429J;

    /* renamed from: K, reason: collision with root package name */
    public int f430K;

    /* renamed from: L, reason: collision with root package name */
    public int[] f431L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f432M;

    /* renamed from: N, reason: collision with root package name */
    public final TextPaint f433N;

    /* renamed from: O, reason: collision with root package name */
    public final TextPaint f434O;

    /* renamed from: P, reason: collision with root package name */
    public LinearInterpolator f435P;

    /* renamed from: Q, reason: collision with root package name */
    public LinearInterpolator f436Q;

    /* renamed from: R, reason: collision with root package name */
    public float f437R;

    /* renamed from: S, reason: collision with root package name */
    public float f438S;

    /* renamed from: T, reason: collision with root package name */
    public float f439T;

    /* renamed from: U, reason: collision with root package name */
    public ColorStateList f440U;

    /* renamed from: V, reason: collision with root package name */
    public float f441V;

    /* renamed from: W, reason: collision with root package name */
    public float f442W;

    /* renamed from: X, reason: collision with root package name */
    public float f443X;

    /* renamed from: Y, reason: collision with root package name */
    public StaticLayout f444Y;

    /* renamed from: Z, reason: collision with root package name */
    public float f445Z;

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f446a;

    /* renamed from: a0, reason: collision with root package name */
    public float f447a0;

    /* renamed from: b, reason: collision with root package name */
    public float f448b;
    public float b0;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f449c;

    /* renamed from: c0, reason: collision with root package name */
    public CharSequence f450c0;
    public final Rect d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f452e;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f457j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f458k;

    /* renamed from: l, reason: collision with root package name */
    public float f459l;

    /* renamed from: m, reason: collision with root package name */
    public float f460m;

    /* renamed from: n, reason: collision with root package name */
    public float f461n;

    /* renamed from: o, reason: collision with root package name */
    public float f462o;

    /* renamed from: p, reason: collision with root package name */
    public float f463p;

    /* renamed from: q, reason: collision with root package name */
    public float f464q;

    /* renamed from: r, reason: collision with root package name */
    public Typeface f465r;

    /* renamed from: s, reason: collision with root package name */
    public Typeface f466s;

    /* renamed from: t, reason: collision with root package name */
    public Typeface f467t;

    /* renamed from: u, reason: collision with root package name */
    public Typeface f468u;

    /* renamed from: v, reason: collision with root package name */
    public Typeface f469v;

    /* renamed from: w, reason: collision with root package name */
    public Typeface f470w;

    /* renamed from: x, reason: collision with root package name */
    public Typeface f471x;

    /* renamed from: y, reason: collision with root package name */
    public Q0.a f472y;

    /* renamed from: f, reason: collision with root package name */
    public int f454f = 16;

    /* renamed from: g, reason: collision with root package name */
    public int f456g = 16;
    public float h = 15.0f;
    public float i = 15.0f;

    /* renamed from: z, reason: collision with root package name */
    public final TextUtils.TruncateAt f473z = TextUtils.TruncateAt.END;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f424D = true;

    /* renamed from: d0, reason: collision with root package name */
    public final int f451d0 = 1;

    /* renamed from: e0, reason: collision with root package name */
    public final float f453e0 = 1.0f;

    /* renamed from: f0, reason: collision with root package name */
    public final int f455f0 = 1;

    public b(TextInputLayout textInputLayout) {
        this.f446a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.f433N = textPaint;
        this.f434O = new TextPaint(textPaint);
        this.d = new Rect();
        this.f449c = new Rect();
        this.f452e = new RectF();
        g(textInputLayout.getContext().getResources().getConfiguration());
    }

    public static int a(int i, int i2, float f2) {
        float f3 = 1.0f - f2;
        return Color.argb(Math.round((Color.alpha(i2) * f2) + (Color.alpha(i) * f3)), Math.round((Color.red(i2) * f2) + (Color.red(i) * f3)), Math.round((Color.green(i2) * f2) + (Color.green(i) * f3)), Math.round((Color.blue(i2) * f2) + (Color.blue(i) * f3)));
    }

    public static float f(float f2, float f3, float f4, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f4 = timeInterpolator.getInterpolation(f4);
        }
        return AbstractC0375a.a(f2, f3, f4);
    }

    public final boolean b(CharSequence charSequence) {
        WeakHashMap weakHashMap = S.f311a;
        boolean z2 = this.f446a.getLayoutDirection() == 1;
        if (this.f424D) {
            return (z2 ? J.g.d : J.g.f295c).c(charSequence, charSequence.length());
        }
        return z2;
    }

    public final void c(float f2, boolean z2) {
        float f3;
        float f4;
        Typeface typeface;
        boolean z3;
        Layout.Alignment alignment;
        if (this.f421A == null) {
            return;
        }
        float width = this.d.width();
        float width2 = this.f449c.width();
        if (Math.abs(f2 - 1.0f) < 1.0E-5f) {
            f3 = this.i;
            f4 = this.f441V;
            this.f426F = 1.0f;
            typeface = this.f465r;
        } else {
            float f5 = this.h;
            float f6 = this.f442W;
            Typeface typeface2 = this.f468u;
            if (Math.abs(f2 - 0.0f) < 1.0E-5f) {
                this.f426F = 1.0f;
            } else {
                this.f426F = f(this.h, this.i, f2, this.f436Q) / this.h;
            }
            float f7 = this.i / this.h;
            width = (z2 || width2 * f7 <= width) ? width2 : Math.min(width / f7, width2);
            f3 = f5;
            f4 = f6;
            typeface = typeface2;
        }
        TextPaint textPaint = this.f433N;
        if (width > 0.0f) {
            boolean z4 = this.G != f3;
            boolean z5 = this.f443X != f4;
            boolean z6 = this.f471x != typeface;
            StaticLayout staticLayout = this.f444Y;
            boolean z7 = z4 || z5 || (staticLayout != null && (width > ((float) staticLayout.getWidth()) ? 1 : (width == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z6 || this.f432M;
            this.G = f3;
            this.f443X = f4;
            this.f471x = typeface;
            this.f432M = false;
            textPaint.setLinearText(this.f426F != 1.0f);
            z3 = z7;
        } else {
            z3 = false;
        }
        if (this.f422B == null || z3) {
            textPaint.setTextSize(this.G);
            textPaint.setTypeface(this.f471x);
            textPaint.setLetterSpacing(this.f443X);
            boolean b2 = b(this.f421A);
            this.f423C = b2;
            int i = this.f451d0;
            if (i <= 1 || b2) {
                i = 1;
            }
            if (i == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f454f, b2 ? 1 : 0) & 7;
                alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.f423C ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f423C ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
            }
            h hVar = new h(this.f421A, textPaint, (int) width);
            hVar.f489k = this.f473z;
            hVar.f488j = b2;
            hVar.f485e = alignment;
            hVar.i = false;
            hVar.f486f = i;
            hVar.f487g = this.f453e0;
            hVar.h = this.f455f0;
            StaticLayout a2 = hVar.a();
            a2.getClass();
            this.f444Y = a2;
            this.f422B = a2.getText();
        }
    }

    public final float d() {
        TextPaint textPaint = this.f434O;
        textPaint.setTextSize(this.i);
        textPaint.setTypeface(this.f465r);
        textPaint.setLetterSpacing(this.f441V);
        return -textPaint.ascent();
    }

    public final int e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f431L;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f467t;
            if (typeface != null) {
                this.f466s = Z0.i.N(configuration, typeface);
            }
            Typeface typeface2 = this.f470w;
            if (typeface2 != null) {
                this.f469v = Z0.i.N(configuration, typeface2);
            }
            Typeface typeface3 = this.f466s;
            if (typeface3 == null) {
                typeface3 = this.f467t;
            }
            this.f465r = typeface3;
            Typeface typeface4 = this.f469v;
            if (typeface4 == null) {
                typeface4 = this.f470w;
            }
            this.f468u = typeface4;
            h(true);
        }
    }

    public final void h(boolean z2) {
        float measureText;
        StaticLayout staticLayout;
        TextInputLayout textInputLayout = this.f446a;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z2) {
            return;
        }
        c(1.0f, z2);
        CharSequence charSequence = this.f422B;
        TextPaint textPaint = this.f433N;
        if (charSequence != null && (staticLayout = this.f444Y) != null) {
            this.f450c0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f473z);
        }
        CharSequence charSequence2 = this.f450c0;
        if (charSequence2 != null) {
            this.f445Z = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f445Z = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f456g, this.f423C ? 1 : 0);
        int i = absoluteGravity & 112;
        Rect rect = this.d;
        if (i == 48) {
            this.f460m = rect.top;
        } else if (i != 80) {
            this.f460m = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f460m = textPaint.ascent() + rect.bottom;
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.f462o = rect.centerX() - (this.f445Z / 2.0f);
        } else if (i2 != 5) {
            this.f462o = rect.left;
        } else {
            this.f462o = rect.right - this.f445Z;
        }
        c(0.0f, z2);
        float height = this.f444Y != null ? r1.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.f444Y;
        if (staticLayout2 == null || this.f451d0 <= 1) {
            CharSequence charSequence3 = this.f422B;
            measureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            measureText = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f444Y;
        if (staticLayout3 != null) {
            staticLayout3.getLineCount();
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f454f, this.f423C ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        Rect rect2 = this.f449c;
        if (i3 == 48) {
            this.f459l = rect2.top;
        } else if (i3 != 80) {
            this.f459l = rect2.centerY() - (height / 2.0f);
        } else {
            this.f459l = textPaint.descent() + (rect2.bottom - height);
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 == 1) {
            this.f461n = rect2.centerX() - (measureText / 2.0f);
        } else if (i4 != 5) {
            this.f461n = rect2.left;
        } else {
            this.f461n = rect2.right - measureText;
        }
        Bitmap bitmap = this.f425E;
        if (bitmap != null) {
            bitmap.recycle();
            this.f425E = null;
        }
        l(this.f448b);
        float f2 = this.f448b;
        float f3 = f(rect2.left, rect.left, f2, this.f435P);
        RectF rectF = this.f452e;
        rectF.left = f3;
        rectF.top = f(this.f459l, this.f460m, f2, this.f435P);
        rectF.right = f(rect2.right, rect.right, f2, this.f435P);
        rectF.bottom = f(rect2.bottom, rect.bottom, f2, this.f435P);
        this.f463p = f(this.f461n, this.f462o, f2, this.f435P);
        this.f464q = f(this.f459l, this.f460m, f2, this.f435P);
        l(f2);
        C0076a c0076a = AbstractC0375a.f4190b;
        this.f447a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f2, c0076a);
        WeakHashMap weakHashMap = S.f311a;
        textInputLayout.postInvalidateOnAnimation();
        this.b0 = f(1.0f, 0.0f, f2, c0076a);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f458k;
        ColorStateList colorStateList2 = this.f457j;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(e(colorStateList2), e(this.f458k), f2));
        } else {
            textPaint.setColor(e(colorStateList));
        }
        float f4 = this.f441V;
        float f5 = this.f442W;
        if (f4 != f5) {
            textPaint.setLetterSpacing(f(f5, f4, f2, c0076a));
        } else {
            textPaint.setLetterSpacing(f4);
        }
        this.f427H = AbstractC0375a.a(0.0f, this.f437R, f2);
        this.f428I = AbstractC0375a.a(0.0f, this.f438S, f2);
        this.f429J = AbstractC0375a.a(0.0f, this.f439T, f2);
        int a2 = a(0, e(this.f440U), f2);
        this.f430K = a2;
        textPaint.setShadowLayer(this.f427H, this.f428I, this.f429J, a2);
        textInputLayout.postInvalidateOnAnimation();
    }

    public final void i(ColorStateList colorStateList) {
        if (this.f458k == colorStateList && this.f457j == colorStateList) {
            return;
        }
        this.f458k = colorStateList;
        this.f457j = colorStateList;
        h(false);
    }

    public final boolean j(Typeface typeface) {
        Q0.a aVar = this.f472y;
        if (aVar != null) {
            aVar.h = true;
        }
        if (this.f467t == typeface) {
            return false;
        }
        this.f467t = typeface;
        Typeface N2 = Z0.i.N(this.f446a.getContext().getResources().getConfiguration(), typeface);
        this.f466s = N2;
        if (N2 == null) {
            N2 = this.f467t;
        }
        this.f465r = N2;
        return true;
    }

    public final void k(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f2 != this.f448b) {
            this.f448b = f2;
            float f3 = this.f449c.left;
            Rect rect = this.d;
            float f4 = f(f3, rect.left, f2, this.f435P);
            RectF rectF = this.f452e;
            rectF.left = f4;
            rectF.top = f(this.f459l, this.f460m, f2, this.f435P);
            rectF.right = f(r1.right, rect.right, f2, this.f435P);
            rectF.bottom = f(r1.bottom, rect.bottom, f2, this.f435P);
            this.f463p = f(this.f461n, this.f462o, f2, this.f435P);
            this.f464q = f(this.f459l, this.f460m, f2, this.f435P);
            l(f2);
            C0076a c0076a = AbstractC0375a.f4190b;
            this.f447a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f2, c0076a);
            WeakHashMap weakHashMap = S.f311a;
            TextInputLayout textInputLayout = this.f446a;
            textInputLayout.postInvalidateOnAnimation();
            this.b0 = f(1.0f, 0.0f, f2, c0076a);
            textInputLayout.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.f458k;
            ColorStateList colorStateList2 = this.f457j;
            TextPaint textPaint = this.f433N;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(e(colorStateList2), e(this.f458k), f2));
            } else {
                textPaint.setColor(e(colorStateList));
            }
            float f5 = this.f441V;
            float f6 = this.f442W;
            if (f5 != f6) {
                textPaint.setLetterSpacing(f(f6, f5, f2, c0076a));
            } else {
                textPaint.setLetterSpacing(f5);
            }
            this.f427H = AbstractC0375a.a(0.0f, this.f437R, f2);
            this.f428I = AbstractC0375a.a(0.0f, this.f438S, f2);
            this.f429J = AbstractC0375a.a(0.0f, this.f439T, f2);
            int a2 = a(0, e(this.f440U), f2);
            this.f430K = a2;
            textPaint.setShadowLayer(this.f427H, this.f428I, this.f429J, a2);
            textInputLayout.postInvalidateOnAnimation();
        }
    }

    public final void l(float f2) {
        c(f2, false);
        WeakHashMap weakHashMap = S.f311a;
        this.f446a.postInvalidateOnAnimation();
    }

    public final void m(Typeface typeface) {
        boolean z2;
        boolean j2 = j(typeface);
        if (this.f470w != typeface) {
            this.f470w = typeface;
            Typeface N2 = Z0.i.N(this.f446a.getContext().getResources().getConfiguration(), typeface);
            this.f469v = N2;
            if (N2 == null) {
                N2 = this.f470w;
            }
            this.f468u = N2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (j2 || z2) {
            h(false);
        }
    }
}
