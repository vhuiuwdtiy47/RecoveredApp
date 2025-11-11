package l;

import L.C0016l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.android.music.R;
import f.AbstractC0117a;
import java.util.WeakHashMap;

/* renamed from: l.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0191J extends C0181E {

    /* renamed from: e, reason: collision with root package name */
    public final C0189I f2974e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f2975f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f2976g;
    public PorterDuff.Mode h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2977j;

    public C0191J(C0189I c0189i) {
        super(c0189i);
        this.f2976g = null;
        this.h = null;
        this.i = false;
        this.f2977j = false;
        this.f2974e = c0189i;
    }

    @Override // l.C0181E
    public final void e(AttributeSet attributeSet, int i) {
        super.e(attributeSet, R.attr.seekBarStyle);
        C0189I c0189i = this.f2974e;
        Context context = c0189i.getContext();
        int[] iArr = AbstractC0117a.f2240g;
        C0016l s2 = C0016l.s(context, attributeSet, iArr, R.attr.seekBarStyle);
        Context context2 = c0189i.getContext();
        WeakHashMap weakHashMap = L.S.f311a;
        L.M.d(c0189i, context2, iArr, attributeSet, (TypedArray) s2.f362c, R.attr.seekBarStyle, 0);
        Drawable i2 = s2.i(0);
        if (i2 != null) {
            c0189i.setThumb(i2);
        }
        Drawable h = s2.h(1);
        Drawable drawable = this.f2975f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f2975f = h;
        if (h != null) {
            h.setCallback(c0189i);
            E.b.b(h, c0189i.getLayoutDirection());
            if (h.isStateful()) {
                h.setState(c0189i.getDrawableState());
            }
            i();
        }
        c0189i.invalidate();
        TypedArray typedArray = (TypedArray) s2.f362c;
        if (typedArray.hasValue(3)) {
            this.h = AbstractC0242k0.b(typedArray.getInt(3, -1), this.h);
            this.f2977j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f2976g = s2.g(2);
            this.i = true;
        }
        s2.u();
        i();
    }

    public final void i() {
        Drawable drawable = this.f2975f;
        if (drawable != null) {
            if (this.i || this.f2977j) {
                Drawable mutate = drawable.mutate();
                this.f2975f = mutate;
                if (this.i) {
                    E.a.h(mutate, this.f2976g);
                }
                if (this.f2977j) {
                    E.a.i(this.f2975f, this.h);
                }
                if (this.f2975f.isStateful()) {
                    this.f2975f.setState(this.f2974e.getDrawableState());
                }
            }
        }
    }

    public final void j(Canvas canvas) {
        if (this.f2975f != null) {
            int max = this.f2974e.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f2975f.getIntrinsicWidth();
                int intrinsicHeight = this.f2975f.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f2975f.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f2975f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
