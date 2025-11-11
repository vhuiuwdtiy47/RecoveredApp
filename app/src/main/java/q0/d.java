package Q0;

import C.r;
import Z0.i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import w0.AbstractC0373a;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f591a;

    /* renamed from: b, reason: collision with root package name */
    public final String f592b;

    /* renamed from: c, reason: collision with root package name */
    public final int f593c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final float f594e;

    /* renamed from: f, reason: collision with root package name */
    public final float f595f;

    /* renamed from: g, reason: collision with root package name */
    public final float f596g;
    public final boolean h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public final ColorStateList f597j;

    /* renamed from: k, reason: collision with root package name */
    public float f598k;

    /* renamed from: l, reason: collision with root package name */
    public final int f599l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f600m = false;

    /* renamed from: n, reason: collision with root package name */
    public Typeface f601n;

    public d(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC0373a.f4146C);
        this.f598k = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f597j = i.x(context, obtainStyledAttributes, 3);
        i.x(context, obtainStyledAttributes, 4);
        i.x(context, obtainStyledAttributes, 5);
        this.f593c = obtainStyledAttributes.getInt(2, 0);
        this.d = obtainStyledAttributes.getInt(1, 1);
        int i2 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f599l = obtainStyledAttributes.getResourceId(i2, 0);
        this.f592b = obtainStyledAttributes.getString(i2);
        obtainStyledAttributes.getBoolean(14, false);
        this.f591a = i.x(context, obtainStyledAttributes, 6);
        this.f594e = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f595f = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f596g = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, AbstractC0373a.f4165s);
        this.h = obtainStyledAttributes2.hasValue(0);
        this.i = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f601n;
        int i = this.f593c;
        if (typeface == null && (str = this.f592b) != null) {
            this.f601n = Typeface.create(str, i);
        }
        if (this.f601n == null) {
            int i2 = this.d;
            if (i2 == 1) {
                this.f601n = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.f601n = Typeface.SERIF;
            } else if (i2 != 3) {
                this.f601n = Typeface.DEFAULT;
            } else {
                this.f601n = Typeface.MONOSPACE;
            }
            this.f601n = Typeface.create(this.f601n, i);
        }
    }

    public final Typeface b(Context context) {
        if (this.f600m) {
            return this.f601n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface a2 = r.a(context, this.f599l);
                this.f601n = a2;
                if (a2 != null) {
                    this.f601n = Typeface.create(a2, this.f593c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e2) {
                Log.d("TextAppearance", "Error loading font " + this.f592b, e2);
            }
        }
        a();
        this.f600m = true;
        return this.f601n;
    }

    public final void c(Context context, i iVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i = this.f599l;
        if (i == 0) {
            this.f600m = true;
        }
        if (this.f600m) {
            iVar.S(this.f601n, true);
            return;
        }
        try {
            b bVar = new b(this, iVar);
            ThreadLocal threadLocal = r.f73a;
            if (context.isRestricted()) {
                bVar.a(-4);
            } else {
                r.b(context, i, new TypedValue(), 0, bVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f600m = true;
            iVar.R(1);
        } catch (Exception e2) {
            Log.d("TextAppearance", "Error loading font " + this.f592b, e2);
            this.f600m = true;
            iVar.R(-3);
        }
    }

    public final boolean d(Context context) {
        Typeface typeface = null;
        int i = this.f599l;
        if (i != 0) {
            ThreadLocal threadLocal = r.f73a;
            if (!context.isRestricted()) {
                typeface = r.b(context, i, new TypedValue(), 0, null, false, true);
            }
        }
        return typeface != null;
    }

    public final void e(Context context, TextPaint textPaint, i iVar) {
        f(context, textPaint, iVar);
        ColorStateList colorStateList = this.f597j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f591a;
        textPaint.setShadowLayer(this.f596g, this.f594e, this.f595f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void f(Context context, TextPaint textPaint, i iVar) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.f601n);
        c(context, new c(this, context, textPaint, iVar));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface N2 = i.N(context.getResources().getConfiguration(), typeface);
        if (N2 != null) {
            typeface = N2;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f593c;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f598k);
        if (this.h) {
            textPaint.setLetterSpacing(this.i);
        }
    }
}
