package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.android.music.R;

/* renamed from: l.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0183F extends RadioButton implements R.q {

    /* renamed from: a, reason: collision with root package name */
    public final C0259t f2964a;

    /* renamed from: b, reason: collision with root package name */
    public final i0.l f2965b;

    /* renamed from: c, reason: collision with root package name */
    public final C0219Y f2966c;
    public C0269y d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0183F(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        AbstractC0206Q0.a(context);
        AbstractC0204P0.a(this, getContext());
        C0259t c0259t = new C0259t(this);
        this.f2964a = c0259t;
        c0259t.c(attributeSet, R.attr.radioButtonStyle);
        i0.l lVar = new i0.l(this);
        this.f2965b = lVar;
        lVar.d(attributeSet, R.attr.radioButtonStyle);
        C0219Y c0219y = new C0219Y(this);
        this.f2966c = c0219y;
        c0219y.f(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.radioButtonStyle);
    }

    private C0269y getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new C0269y(this);
        }
        return this.d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        i0.l lVar = this.f2965b;
        if (lVar != null) {
            lVar.a();
        }
        C0219Y c0219y = this.f2966c;
        if (c0219y != null) {
            c0219y.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        i0.l lVar = this.f2965b;
        if (lVar != null) {
            return lVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        i0.l lVar = this.f2965b;
        if (lVar != null) {
            return lVar.c();
        }
        return null;
    }

    @Override // R.q
    public ColorStateList getSupportButtonTintList() {
        C0259t c0259t = this.f2964a;
        if (c0259t != null) {
            return c0259t.f3143a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0259t c0259t = this.f2964a;
        if (c0259t != null) {
            return c0259t.f3144b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2966c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2966c.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        i0.l lVar = this.f2965b;
        if (lVar != null) {
            lVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        i0.l lVar = this.f2965b;
        if (lVar != null) {
            lVar.f(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0259t c0259t = this.f2964a;
        if (c0259t != null) {
            if (c0259t.f3146e) {
                c0259t.f3146e = false;
            } else {
                c0259t.f3146e = true;
                c0259t.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0219Y c0219y = this.f2966c;
        if (c0219y != null) {
            c0219y.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0219Y c0219y = this.f2966c;
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
        i0.l lVar = this.f2965b;
        if (lVar != null) {
            lVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        i0.l lVar = this.f2965b;
        if (lVar != null) {
            lVar.i(mode);
        }
    }

    @Override // R.q
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0259t c0259t = this.f2964a;
        if (c0259t != null) {
            c0259t.f3143a = colorStateList;
            c0259t.f3145c = true;
            c0259t.a();
        }
    }

    @Override // R.q
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0259t c0259t = this.f2964a;
        if (c0259t != null) {
            c0259t.f3144b = mode;
            c0259t.d = true;
            c0259t.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0219Y c0219y = this.f2966c;
        c0219y.i(colorStateList);
        c0219y.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0219Y c0219y = this.f2966c;
        c0219y.j(mode);
        c0219y.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(U.t.u(getContext(), i));
    }
}
