package l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* renamed from: l.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0234g0 extends ToggleButton {

    /* renamed from: a, reason: collision with root package name */
    public final i0.l f3078a;

    /* renamed from: b, reason: collision with root package name */
    public final C0219Y f3079b;

    /* renamed from: c, reason: collision with root package name */
    public C0269y f3080c;

    public C0234g0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        AbstractC0204P0.a(this, getContext());
        i0.l lVar = new i0.l(this);
        this.f3078a = lVar;
        lVar.d(attributeSet, R.attr.buttonStyleToggle);
        C0219Y c0219y = new C0219Y(this);
        this.f3079b = c0219y;
        c0219y.f(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.buttonStyleToggle);
    }

    private C0269y getEmojiTextViewHelper() {
        if (this.f3080c == null) {
            this.f3080c = new C0269y(this);
        }
        return this.f3080c;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        i0.l lVar = this.f3078a;
        if (lVar != null) {
            lVar.a();
        }
        C0219Y c0219y = this.f3079b;
        if (c0219y != null) {
            c0219y.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        i0.l lVar = this.f3078a;
        if (lVar != null) {
            return lVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        i0.l lVar = this.f3078a;
        if (lVar != null) {
            return lVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3079b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3079b.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        i0.l lVar = this.f3078a;
        if (lVar != null) {
            lVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        i0.l lVar = this.f3078a;
        if (lVar != null) {
            lVar.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0219Y c0219y = this.f3079b;
        if (c0219y != null) {
            c0219y.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0219Y c0219y = this.f3079b;
        if (c0219y != null) {
            c0219y.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((U.t) getEmojiTextViewHelper().f3181b.f33b).w(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        i0.l lVar = this.f3078a;
        if (lVar != null) {
            lVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        i0.l lVar = this.f3078a;
        if (lVar != null) {
            lVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0219Y c0219y = this.f3079b;
        c0219y.i(colorStateList);
        c0219y.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0219Y c0219y = this.f3079b;
        c0219y.j(mode);
        c0219y.b();
    }
}
