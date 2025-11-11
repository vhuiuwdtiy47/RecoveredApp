package l;

import L.C0016l;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* renamed from: l.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0251p extends AutoCompleteTextView {
    public static final int[] d = {R.attr.popupBackground};

    /* renamed from: a, reason: collision with root package name */
    public final i0.l f3119a;

    /* renamed from: b, reason: collision with root package name */
    public final C0219Y f3120b;

    /* renamed from: c, reason: collision with root package name */
    public final C0181E f3121c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0251p(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.android.music.R.attr.autoCompleteTextViewStyle);
        AbstractC0206Q0.a(context);
        AbstractC0204P0.a(this, getContext());
        C0016l s2 = C0016l.s(getContext(), attributeSet, d, com.android.music.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) s2.f362c).hasValue(0)) {
            setDropDownBackgroundDrawable(s2.h(0));
        }
        s2.u();
        i0.l lVar = new i0.l(this);
        this.f3119a = lVar;
        lVar.d(attributeSet, com.android.music.R.attr.autoCompleteTextViewStyle);
        C0219Y c0219y = new C0219Y(this);
        this.f3120b = c0219y;
        c0219y.f(attributeSet, com.android.music.R.attr.autoCompleteTextViewStyle);
        c0219y.b();
        C0181E c0181e = new C0181E(this);
        this.f3121c = c0181e;
        c0181e.e(attributeSet, com.android.music.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = super.isFocusable();
        boolean isClickable = super.isClickable();
        boolean isLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener d2 = c0181e.d(keyListener);
        if (d2 == keyListener) {
            return;
        }
        super.setKeyListener(d2);
        super.setRawInputType(inputType);
        super.setFocusable(isFocusable);
        super.setClickable(isClickable);
        super.setLongClickable(isLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        i0.l lVar = this.f3119a;
        if (lVar != null) {
            lVar.a();
        }
        C0219Y c0219y = this.f3120b;
        if (c0219y != null) {
            c0219y.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    public ColorStateList getSupportBackgroundTintList() {
        i0.l lVar = this.f3119a;
        if (lVar != null) {
            return lVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        i0.l lVar = this.f3119a;
        if (lVar != null) {
            return lVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3120b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3120b.e();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC0271z.q(editorInfo, onCreateInputConnection, this);
        return this.f3121c.f(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        i0.l lVar = this.f3119a;
        if (lVar != null) {
            lVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        i0.l lVar = this.f3119a;
        if (lVar != null) {
            lVar.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0219Y c0219y = this.f3120b;
        if (c0219y != null) {
            c0219y.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0219Y c0219y = this.f3120b;
        if (c0219y != null) {
            c0219y.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(U.t.u(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        this.f3121c.g(z2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f3121c.d(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        i0.l lVar = this.f3119a;
        if (lVar != null) {
            lVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        i0.l lVar = this.f3119a;
        if (lVar != null) {
            lVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0219Y c0219y = this.f3120b;
        c0219y.i(colorStateList);
        c0219y.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0219Y c0219y = this.f3120b;
        c0219y.j(mode);
        c0219y.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0219Y c0219y = this.f3120b;
        if (c0219y != null) {
            c0219y.g(context, i);
        }
    }
}
