package l;

import L.C0016l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import f.AbstractC0117a;
import java.lang.ref.WeakReference;

/* renamed from: l.Y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0219Y {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f3032a;

    /* renamed from: b, reason: collision with root package name */
    public C0207R0 f3033b;

    /* renamed from: c, reason: collision with root package name */
    public C0207R0 f3034c;
    public C0207R0 d;

    /* renamed from: e, reason: collision with root package name */
    public C0207R0 f3035e;

    /* renamed from: f, reason: collision with root package name */
    public C0207R0 f3036f;

    /* renamed from: g, reason: collision with root package name */
    public C0207R0 f3037g;
    public C0207R0 h;
    public final C0232f0 i;

    /* renamed from: j, reason: collision with root package name */
    public int f3038j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f3039k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f3040l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3041m;

    public C0219Y(TextView textView) {
        this.f3032a = textView;
        this.i = new C0232f0(textView);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.R0, java.lang.Object] */
    public static C0207R0 c(Context context, C0263v c0263v, int i) {
        ColorStateList f2;
        synchronized (c0263v) {
            f2 = c0263v.f3161a.f(context, i);
        }
        if (f2 == null) {
            return null;
        }
        ?? obj = new Object();
        obj.d = true;
        obj.f3012a = f2;
        return obj;
    }

    public static void h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i >= 30) {
            Q.a.a(editorInfo, text);
            return;
        }
        text.getClass();
        if (i >= 30) {
            Q.a.a(editorInfo, text);
            return;
        }
        int i2 = editorInfo.initialSelStart;
        int i3 = editorInfo.initialSelEnd;
        int i4 = i2 > i3 ? i3 : i2;
        if (i2 <= i3) {
            i2 = i3;
        }
        int length = text.length();
        if (i4 < 0 || i2 > length) {
            Z0.i.i0(editorInfo, null, 0, 0);
            return;
        }
        int i5 = editorInfo.inputType & 4095;
        if (i5 == 129 || i5 == 225 || i5 == 18) {
            Z0.i.i0(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            Z0.i.i0(editorInfo, text, i4, i2);
            return;
        }
        int i6 = i2 - i4;
        int i7 = i6 > 1024 ? 0 : i6;
        int i8 = 2048 - i7;
        int min = Math.min(text.length() - i2, i8 - Math.min(i4, (int) (i8 * 0.8d)));
        int min2 = Math.min(i4, i8 - min);
        int i9 = i4 - min2;
        if (Character.isLowSurrogate(text.charAt(i9))) {
            i9++;
            min2--;
        }
        if (Character.isHighSurrogate(text.charAt((i2 + min) - 1))) {
            min--;
        }
        int i10 = min2 + i7;
        Z0.i.i0(editorInfo, i7 != i6 ? TextUtils.concat(text.subSequence(i9, i9 + min2), text.subSequence(i2, min + i2)) : text.subSequence(i9, i10 + min + i9), min2, i10);
    }

    public final void a(Drawable drawable, C0207R0 c0207r0) {
        if (drawable == null || c0207r0 == null) {
            return;
        }
        C0263v.e(drawable, c0207r0, this.f3032a.getDrawableState());
    }

    public final void b() {
        C0207R0 c0207r0 = this.f3033b;
        TextView textView = this.f3032a;
        if (c0207r0 != null || this.f3034c != null || this.d != null || this.f3035e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f3033b);
            a(compoundDrawables[1], this.f3034c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.f3035e);
        }
        if (this.f3036f == null && this.f3037g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f3036f);
        a(compoundDrawablesRelative[2], this.f3037g);
    }

    public final ColorStateList d() {
        C0207R0 c0207r0 = this.h;
        if (c0207r0 != null) {
            return c0207r0.f3012a;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        C0207R0 c0207r0 = this.h;
        if (c0207r0 != null) {
            return c0207r0.f3013b;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:216:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(android.util.AttributeSet r28, int r29) {
        /*
            Method dump skipped, instructions count: 1218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0219Y.f(android.util.AttributeSet, int):void");
    }

    public final void g(Context context, int i) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC0117a.f2253v);
        C0016l c0016l = new C0016l(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.f3032a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        k(context, c0016l);
        if (obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            AbstractC0216W.d(textView, string);
        }
        c0016l.u();
        Typeface typeface = this.f3040l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f3038j);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.R0, java.lang.Object] */
    public final void i(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new Object();
        }
        C0207R0 c0207r0 = this.h;
        c0207r0.f3012a = colorStateList;
        c0207r0.d = colorStateList != null;
        this.f3033b = c0207r0;
        this.f3034c = c0207r0;
        this.d = c0207r0;
        this.f3035e = c0207r0;
        this.f3036f = c0207r0;
        this.f3037g = c0207r0;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.R0, java.lang.Object] */
    public final void j(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new Object();
        }
        C0207R0 c0207r0 = this.h;
        c0207r0.f3013b = mode;
        c0207r0.f3014c = mode != null;
        this.f3033b = c0207r0;
        this.f3034c = c0207r0;
        this.d = c0207r0;
        this.f3035e = c0207r0;
        this.f3036f = c0207r0;
        this.f3037g = c0207r0;
    }

    public final void k(Context context, C0016l c0016l) {
        String string;
        int i = this.f3038j;
        TypedArray typedArray = (TypedArray) c0016l.f362c;
        this.f3038j = typedArray.getInt(2, i);
        int i2 = typedArray.getInt(11, -1);
        this.f3039k = i2;
        if (i2 != -1) {
            this.f3038j &= 2;
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f3041m = false;
                int i3 = typedArray.getInt(1, 1);
                if (i3 == 1) {
                    this.f3040l = Typeface.SANS_SERIF;
                    return;
                } else if (i3 == 2) {
                    this.f3040l = Typeface.SERIF;
                    return;
                } else {
                    if (i3 != 3) {
                        return;
                    }
                    this.f3040l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f3040l = null;
        int i4 = typedArray.hasValue(12) ? 12 : 10;
        int i5 = this.f3039k;
        int i6 = this.f3038j;
        if (!context.isRestricted()) {
            try {
                Typeface j2 = c0016l.j(i4, this.f3038j, new C0212U(this, i5, i6, new WeakReference(this.f3032a)));
                if (j2 != null) {
                    if (this.f3039k != -1) {
                        this.f3040l = AbstractC0218X.a(Typeface.create(j2, 0), this.f3039k, (this.f3038j & 2) != 0);
                    } else {
                        this.f3040l = j2;
                    }
                }
                this.f3041m = this.f3040l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f3040l != null || (string = typedArray.getString(i4)) == null) {
            return;
        }
        if (this.f3039k != -1) {
            this.f3040l = AbstractC0218X.a(Typeface.create(string, 0), this.f3039k, (this.f3038j & 2) != 0);
        } else {
            this.f3040l = Typeface.create(string, this.f3038j);
        }
    }
}
