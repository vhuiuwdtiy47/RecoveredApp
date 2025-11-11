package G0;

import C.k;
import C.r;
import L.C0016l;
import M0.m;
import U.t;
import Z0.i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import com.android.music.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import l.C0255r;
import t0.C0329b;
import t0.C0331d;
import t0.C0332e;
import t0.C0333f;
import w0.AbstractC0373a;

/* loaded from: classes.dex */
public final class d extends C0255r {

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f166e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f167f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f168g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f169j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f170k;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f171l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f172m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f173n;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f174o;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f175p;

    /* renamed from: q, reason: collision with root package name */
    public PorterDuff.Mode f176q;

    /* renamed from: r, reason: collision with root package name */
    public int f177r;

    /* renamed from: s, reason: collision with root package name */
    public int[] f178s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f179t;

    /* renamed from: u, reason: collision with root package name */
    public CharSequence f180u;

    /* renamed from: v, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f181v;

    /* renamed from: w, reason: collision with root package name */
    public final C0333f f182w;

    /* renamed from: x, reason: collision with root package name */
    public final a f183x;

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f164y = {R.attr.state_indeterminate};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f165z = {R.attr.state_error};

    /* renamed from: A, reason: collision with root package name */
    public static final int[][] f162A = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: B, reason: collision with root package name */
    public static final int f163B = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    public d(Context context, AttributeSet attributeSet) {
        super(Y0.a.a(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.f166e = new LinkedHashSet();
        this.f167f = new LinkedHashSet();
        Context context2 = getContext();
        C0333f c0333f = new C0333f(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = r.f73a;
        Drawable a2 = k.a(resources, R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        c0333f.f3839a = a2;
        a2.setCallback(c0333f.f3838f);
        new C0332e(c0333f.f3839a.getConstantState());
        this.f182w = c0333f;
        this.f183x = new a(this);
        Context context3 = getContext();
        this.f171l = R.c.a(this);
        this.f174o = getSuperButtonTintList();
        setSupportButtonTintList(null);
        C0016l h = m.h(context3, attributeSet, AbstractC0373a.f4162p, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        this.f172m = h.h(2);
        Drawable drawable = this.f171l;
        TypedArray typedArray = (TypedArray) h.f362c;
        if (drawable != null && i.a0(context3, R.attr.isMaterial3Theme, false)) {
            int resourceId = typedArray.getResourceId(0, 0);
            int resourceId2 = typedArray.getResourceId(1, 0);
            if (resourceId == f163B && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f171l = t.u(context3, R.drawable.mtrl_checkbox_button);
                this.f173n = true;
                if (this.f172m == null) {
                    this.f172m = t.u(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f175p = i.w(context3, h, 3);
        this.f176q = m.i(typedArray.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.h = typedArray.getBoolean(10, false);
        this.i = typedArray.getBoolean(6, true);
        this.f169j = typedArray.getBoolean(9, false);
        this.f170k = typedArray.getText(8);
        if (typedArray.hasValue(7)) {
            setCheckedState(typedArray.getInt(7, 0));
        }
        h.u();
        a();
    }

    private String getButtonStateDescription() {
        int i = this.f177r;
        return i == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f168g == null) {
            int u2 = i.u(this, R.attr.colorControlActivated);
            int u3 = i.u(this, R.attr.colorError);
            int u4 = i.u(this, R.attr.colorSurface);
            int u5 = i.u(this, R.attr.colorOnSurface);
            this.f168g = new ColorStateList(f162A, new int[]{i.L(u4, u3, 1.0f), i.L(u4, u2, 1.0f), i.L(u4, u5, 0.54f), i.L(u4, u5, 0.38f), i.L(u4, u5, 0.38f)});
        }
        return this.f168g;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f174o;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        A0.a aVar;
        Drawable drawable = this.f171l;
        ColorStateList colorStateList3 = this.f174o;
        PorterDuff.Mode b2 = R.b.b(this);
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList3 != null) {
            drawable = drawable.mutate();
            if (b2 != null) {
                E.a.i(drawable, b2);
            }
        }
        this.f171l = drawable;
        Drawable drawable2 = this.f172m;
        ColorStateList colorStateList4 = this.f175p;
        PorterDuff.Mode mode = this.f176q;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (colorStateList4 != null) {
            drawable2 = drawable2.mutate();
            if (mode != null) {
                E.a.i(drawable2, mode);
            }
        }
        this.f172m = drawable2;
        if (this.f173n) {
            C0333f c0333f = this.f182w;
            if (c0333f != null) {
                Drawable drawable3 = c0333f.f3839a;
                a aVar2 = this.f183x;
                if (drawable3 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable3;
                    if (aVar2.f158a == null) {
                        aVar2.f158a = new C0329b(aVar2);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(aVar2.f158a);
                }
                ArrayList arrayList = c0333f.f3837e;
                C0331d c0331d = c0333f.f3835b;
                if (arrayList != null && aVar2 != null) {
                    arrayList.remove(aVar2);
                    if (c0333f.f3837e.size() == 0 && (aVar = c0333f.d) != null) {
                        c0331d.f3832b.removeListener(aVar);
                        c0333f.d = null;
                    }
                }
                Drawable drawable4 = c0333f.f3839a;
                if (drawable4 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable4;
                    if (aVar2.f158a == null) {
                        aVar2.f158a = new C0329b(aVar2);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(aVar2.f158a);
                } else if (aVar2 != null) {
                    if (c0333f.f3837e == null) {
                        c0333f.f3837e = new ArrayList();
                    }
                    if (!c0333f.f3837e.contains(aVar2)) {
                        c0333f.f3837e.add(aVar2);
                        if (c0333f.d == null) {
                            c0333f.d = new A0.a(5, c0333f);
                        }
                        c0331d.f3832b.addListener(c0333f.d);
                    }
                }
            }
            Drawable drawable5 = this.f171l;
            if ((drawable5 instanceof AnimatedStateListDrawable) && c0333f != null) {
                ((AnimatedStateListDrawable) drawable5).addTransition(R.id.checked, R.id.unchecked, c0333f, false);
                ((AnimatedStateListDrawable) this.f171l).addTransition(R.id.indeterminate, R.id.unchecked, c0333f, false);
            }
        }
        Drawable drawable6 = this.f171l;
        if (drawable6 != null && (colorStateList2 = this.f174o) != null) {
            E.a.h(drawable6, colorStateList2);
        }
        Drawable drawable7 = this.f172m;
        if (drawable7 != null && (colorStateList = this.f175p) != null) {
            E.a.h(drawable7, colorStateList);
        }
        Drawable drawable8 = this.f171l;
        Drawable drawable9 = this.f172m;
        if (drawable8 == null) {
            drawable8 = drawable9;
        } else if (drawable9 != null) {
            int intrinsicWidth = drawable9.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable8.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable9.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable8.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable8.getIntrinsicWidth() || intrinsicHeight > drawable8.getIntrinsicHeight()) {
                float f2 = intrinsicWidth / intrinsicHeight;
                if (f2 >= drawable8.getIntrinsicWidth() / drawable8.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable8.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f2);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable8.getIntrinsicHeight();
                    intrinsicWidth = (int) (f2 * intrinsicHeight);
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable8, drawable9});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable8 = layerDrawable;
        }
        super.setButtonDrawable(drawable8);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f171l;
    }

    public Drawable getButtonIconDrawable() {
        return this.f172m;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f175p;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f176q;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f174o;
    }

    public int getCheckedState() {
        return this.f177r;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f170k;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f177r == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.h && this.f174o == null && this.f175p == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, f164y);
        }
        if (this.f169j) {
            View.mergeDrawableStates(onCreateDrawableState, f165z);
        }
        int i2 = 0;
        while (true) {
            if (i2 >= onCreateDrawableState.length) {
                copyOf = Arrays.copyOf(onCreateDrawableState, onCreateDrawableState.length + 1);
                copyOf[onCreateDrawableState.length] = 16842912;
                break;
            }
            int i3 = onCreateDrawableState[i2];
            if (i3 == 16842912) {
                copyOf = onCreateDrawableState;
                break;
            }
            if (i3 == 0) {
                copyOf = (int[]) onCreateDrawableState.clone();
                copyOf[i2] = 16842912;
                break;
            }
            i2++;
        }
        this.f178s = copyOf;
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable a2;
        if (!this.i || !TextUtils.isEmpty(getText()) || (a2 = R.c.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - a2.getIntrinsicWidth()) / 2) * (m.f(this) ? -1 : 1);
        int save = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = a2.getBounds();
            E.a.f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f169j) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f170k));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        setCheckedState(cVar.f161a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, G0.c] */
    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.f161a = getCheckedState();
        return baseSavedState;
    }

    @Override // l.C0255r, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(t.u(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f172m = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(t.u(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f175p == colorStateList) {
            return;
        }
        this.f175p = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f176q == mode) {
            return;
        }
        this.f176q = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f174o == colorStateList) {
            return;
        }
        this.f174o = colorStateList;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z2) {
        this.i = z2;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        setCheckedState(z2 ? 1 : 0);
    }

    public void setCheckedState(int i) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f177r != i) {
            this.f177r = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.f180u == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f179t) {
                return;
            }
            this.f179t = true;
            LinkedHashSet linkedHashSet = this.f167f;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
            }
            if (this.f177r != 2 && (onCheckedChangeListener = this.f181v) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f179t = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f170k = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z2) {
        if (this.f169j == z2) {
            return;
        }
        this.f169j = z2;
        refreshDrawableState();
        Iterator it = this.f166e.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f181v = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f180u = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.h = z2;
        if (z2) {
            R.b.c(this, getMaterialThemeColorsTintList());
        } else {
            R.b.c(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // l.C0255r, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f171l = drawable;
        this.f173n = false;
        a();
    }
}
