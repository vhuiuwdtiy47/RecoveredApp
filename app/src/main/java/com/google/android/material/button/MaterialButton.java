package com.google.android.material.button;

import E0.a;
import E0.b;
import E0.c;
import L.S;
import M0.m;
import T0.j;
import T0.k;
import T0.u;
import U.t;
import Z0.i;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import l.C0253q;
import w0.AbstractC0373a;

/* loaded from: classes.dex */
public class MaterialButton extends C0253q implements Checkable, u {

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f1831r = {R.attr.state_checkable};

    /* renamed from: s, reason: collision with root package name */
    public static final int[] f1832s = {R.attr.state_checked};
    public final c d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f1833e;

    /* renamed from: f, reason: collision with root package name */
    public a f1834f;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f1835g;
    public ColorStateList h;
    public Drawable i;

    /* renamed from: j, reason: collision with root package name */
    public String f1836j;

    /* renamed from: k, reason: collision with root package name */
    public int f1837k;

    /* renamed from: l, reason: collision with root package name */
    public int f1838l;

    /* renamed from: m, reason: collision with root package name */
    public int f1839m;

    /* renamed from: n, reason: collision with root package name */
    public int f1840n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1841o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1842p;

    /* renamed from: q, reason: collision with root package name */
    public int f1843q;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(Y0.a.a(context, attributeSet, com.android.music.R.attr.materialButtonStyle, com.android.music.R.style.Widget_MaterialComponents_Button), attributeSet, com.android.music.R.attr.materialButtonStyle);
        this.f1833e = new LinkedHashSet();
        this.f1841o = false;
        this.f1842p = false;
        Context context2 = getContext();
        TypedArray g2 = m.g(context2, attributeSet, AbstractC0373a.f4158l, com.android.music.R.attr.materialButtonStyle, com.android.music.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f1840n = g2.getDimensionPixelSize(12, 0);
        int i = g2.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f1835g = m.i(i, mode);
        this.h = i.x(getContext(), g2, 14);
        this.i = i.B(getContext(), g2, 10);
        this.f1843q = g2.getInteger(11, 1);
        this.f1837k = g2.getDimensionPixelSize(13, 0);
        c cVar = new c(this, k.b(context2, attributeSet, com.android.music.R.attr.materialButtonStyle, com.android.music.R.style.Widget_MaterialComponents_Button).a());
        this.d = cVar;
        cVar.f125c = g2.getDimensionPixelOffset(1, 0);
        cVar.d = g2.getDimensionPixelOffset(2, 0);
        cVar.f126e = g2.getDimensionPixelOffset(3, 0);
        cVar.f127f = g2.getDimensionPixelOffset(4, 0);
        if (g2.hasValue(8)) {
            int dimensionPixelSize = g2.getDimensionPixelSize(8, -1);
            cVar.f128g = dimensionPixelSize;
            float f2 = dimensionPixelSize;
            j e2 = cVar.f124b.e();
            e2.f704e = new T0.a(f2);
            e2.f705f = new T0.a(f2);
            e2.f706g = new T0.a(f2);
            e2.h = new T0.a(f2);
            cVar.c(e2.a());
            cVar.f135p = true;
        }
        cVar.h = g2.getDimensionPixelSize(20, 0);
        cVar.i = m.i(g2.getInt(7, -1), mode);
        cVar.f129j = i.x(getContext(), g2, 6);
        cVar.f130k = i.x(getContext(), g2, 19);
        cVar.f131l = i.x(getContext(), g2, 16);
        cVar.f136q = g2.getBoolean(5, false);
        cVar.f139t = g2.getDimensionPixelSize(9, 0);
        cVar.f137r = g2.getBoolean(21, true);
        WeakHashMap weakHashMap = S.f311a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (g2.hasValue(0)) {
            cVar.f134o = true;
            setSupportBackgroundTintList(cVar.f129j);
            setSupportBackgroundTintMode(cVar.i);
        } else {
            cVar.e();
        }
        setPaddingRelative(paddingStart + cVar.f125c, paddingTop + cVar.f126e, paddingEnd + cVar.d, paddingBottom + cVar.f127f);
        g2.recycle();
        setCompoundDrawablePadding(this.f1840n);
        c(this.i != null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f2 = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            f2 = Math.max(f2, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(f2);
    }

    public final boolean a() {
        c cVar = this.d;
        return (cVar == null || cVar.f134o) ? false : true;
    }

    public final void b() {
        int i = this.f1843q;
        boolean z2 = true;
        if (i != 1 && i != 2) {
            z2 = false;
        }
        if (z2) {
            setCompoundDrawablesRelative(this.i, null, null, null);
            return;
        }
        if (i == 3 || i == 4) {
            setCompoundDrawablesRelative(null, null, this.i, null);
        } else if (i == 16 || i == 32) {
            setCompoundDrawablesRelative(null, this.i, null, null);
        }
    }

    public final void c(boolean z2) {
        Drawable drawable = this.i;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.i = mutate;
            E.a.h(mutate, this.h);
            PorterDuff.Mode mode = this.f1835g;
            if (mode != null) {
                E.a.i(this.i, mode);
            }
            int i = this.f1837k;
            if (i == 0) {
                i = this.i.getIntrinsicWidth();
            }
            int i2 = this.f1837k;
            if (i2 == 0) {
                i2 = this.i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.i;
            int i3 = this.f1838l;
            int i4 = this.f1839m;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
            this.i.setVisible(true, z2);
        }
        if (z2) {
            b();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i5 = this.f1843q;
        if (((i5 == 1 || i5 == 2) && drawable3 != this.i) || (((i5 == 3 || i5 == 4) && drawable5 != this.i) || ((i5 == 16 || i5 == 32) && drawable4 != this.i))) {
            b();
        }
    }

    public final void d(int i, int i2) {
        if (this.i == null || getLayout() == null) {
            return;
        }
        int i3 = this.f1843q;
        if (!(i3 == 1 || i3 == 2) && i3 != 3 && i3 != 4) {
            if (i3 == 16 || i3 == 32) {
                this.f1838l = 0;
                if (i3 == 16) {
                    this.f1839m = 0;
                    c(false);
                    return;
                }
                int i4 = this.f1837k;
                if (i4 == 0) {
                    i4 = this.i.getIntrinsicHeight();
                }
                int max = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - i4) - this.f1840n) - getPaddingBottom()) / 2);
                if (this.f1839m != max) {
                    this.f1839m = max;
                    c(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f1839m = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i5 = this.f1843q;
        if (i5 == 1 || i5 == 3 || ((i5 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i5 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f1838l = 0;
            c(false);
            return;
        }
        int i6 = this.f1837k;
        if (i6 == 0) {
            i6 = this.i.getIntrinsicWidth();
        }
        int textLayoutWidth = i - getTextLayoutWidth();
        WeakHashMap weakHashMap = S.f311a;
        int paddingEnd = (((textLayoutWidth - getPaddingEnd()) - i6) - this.f1840n) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            paddingEnd /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.f1843q == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.f1838l != paddingEnd) {
            this.f1838l = paddingEnd;
            c(false);
        }
    }

    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.f1836j)) {
            return this.f1836j;
        }
        c cVar = this.d;
        return ((cVar == null || !cVar.f136q) ? Button.class : CompoundButton.class).getName();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (a()) {
            return this.d.f128g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.i;
    }

    public int getIconGravity() {
        return this.f1843q;
    }

    public int getIconPadding() {
        return this.f1840n;
    }

    public int getIconSize() {
        return this.f1837k;
    }

    public ColorStateList getIconTint() {
        return this.h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f1835g;
    }

    public int getInsetBottom() {
        return this.d.f127f;
    }

    public int getInsetTop() {
        return this.d.f126e;
    }

    public ColorStateList getRippleColor() {
        if (a()) {
            return this.d.f131l;
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        if (a()) {
            return this.d.f124b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (a()) {
            return this.d.f130k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (a()) {
            return this.d.h;
        }
        return 0;
    }

    @Override // l.C0253q
    public ColorStateList getSupportBackgroundTintList() {
        return a() ? this.d.f129j : super.getSupportBackgroundTintList();
    }

    @Override // l.C0253q
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return a() ? this.d.i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f1841o;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (a()) {
            i.h0(this, this.d.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        c cVar = this.d;
        if (cVar != null && cVar.f136q) {
            View.mergeDrawableStates(onCreateDrawableState, f1831r);
        }
        if (this.f1841o) {
            View.mergeDrawableStates(onCreateDrawableState, f1832s);
        }
        return onCreateDrawableState;
    }

    @Override // l.C0253q, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f1841o);
    }

    @Override // l.C0253q, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        c cVar = this.d;
        accessibilityNodeInfo.setCheckable(cVar != null && cVar.f136q);
        accessibilityNodeInfo.setChecked(this.f1841o);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // l.C0253q, android.widget.TextView, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.f628a);
        setChecked(bVar.f122c);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, S.b, E0.b] */
    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? bVar = new S.b(super.onSaveInstanceState());
        bVar.f122c = this.f1841o;
        return bVar;
    }

    @Override // l.C0253q, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.d.f137r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.i != null) {
            if (this.i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f1836j = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!a()) {
            super.setBackgroundColor(i);
            return;
        }
        c cVar = this.d;
        if (cVar.b(false) != null) {
            cVar.b(false).setTint(i);
        }
    }

    @Override // l.C0253q, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!a()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        c cVar = this.d;
        cVar.f134o = true;
        ColorStateList colorStateList = cVar.f129j;
        MaterialButton materialButton = cVar.f123a;
        materialButton.setSupportBackgroundTintList(colorStateList);
        materialButton.setSupportBackgroundTintMode(cVar.i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // l.C0253q, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? t.u(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z2) {
        if (a()) {
            this.d.f136q = z2;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        c cVar = this.d;
        if (cVar == null || !cVar.f136q || !isEnabled() || this.f1841o == z2) {
            return;
        }
        this.f1841o = z2;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z3 = this.f1841o;
            if (!materialButtonToggleGroup.f1849f) {
                materialButtonToggleGroup.b(getId(), z3);
            }
        }
        if (this.f1842p) {
            return;
        }
        this.f1842p = true;
        Iterator it = this.f1833e.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        this.f1842p = false;
    }

    public void setCornerRadius(int i) {
        if (a()) {
            c cVar = this.d;
            if (cVar.f135p && cVar.f128g == i) {
                return;
            }
            cVar.f128g = i;
            cVar.f135p = true;
            float f2 = i;
            j e2 = cVar.f124b.e();
            e2.f704e = new T0.a(f2);
            e2.f705f = new T0.a(f2);
            e2.f706g = new T0.a(f2);
            e2.h = new T0.a(f2);
            cVar.c(e2.a());
        }
    }

    public void setCornerRadiusResource(int i) {
        if (a()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        if (a()) {
            this.d.b(false).i(f2);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.i != drawable) {
            this.i = drawable;
            c(true);
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.f1843q != i) {
            this.f1843q = i;
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.f1840n != i) {
            this.f1840n = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? t.u(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f1837k != i) {
            this.f1837k = i;
            c(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.h != colorStateList) {
            this.h = colorStateList;
            c(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f1835g != mode) {
            this.f1835g = mode;
            c(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(i.v(getContext(), i));
    }

    public void setInsetBottom(int i) {
        c cVar = this.d;
        cVar.d(cVar.f126e, i);
    }

    public void setInsetTop(int i) {
        c cVar = this.d;
        cVar.d(i, cVar.f127f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(a aVar) {
        this.f1834f = aVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z2) {
        a aVar = this.f1834f;
        if (aVar != null) {
            ((MaterialButtonToggleGroup) ((A0.c) aVar).f33b).invalidate();
        }
        super.setPressed(z2);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (a()) {
            c cVar = this.d;
            if (cVar.f131l != colorStateList) {
                cVar.f131l = colorStateList;
                MaterialButton materialButton = cVar.f123a;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(R0.a.b(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (a()) {
            setRippleColor(i.v(getContext(), i));
        }
    }

    @Override // T0.u
    public void setShapeAppearanceModel(k kVar) {
        if (!a()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.d.c(kVar);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z2) {
        if (a()) {
            c cVar = this.d;
            cVar.f133n = z2;
            cVar.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (a()) {
            c cVar = this.d;
            if (cVar.f130k != colorStateList) {
                cVar.f130k = colorStateList;
                cVar.f();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (a()) {
            setStrokeColor(i.v(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (a()) {
            c cVar = this.d;
            if (cVar.h != i) {
                cVar.h = i;
                cVar.f();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (a()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // l.C0253q
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!a()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        c cVar = this.d;
        if (cVar.f129j != colorStateList) {
            cVar.f129j = colorStateList;
            if (cVar.b(false) != null) {
                E.a.h(cVar.b(false), cVar.f129j);
            }
        }
    }

    @Override // l.C0253q
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!a()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        c cVar = this.d;
        if (cVar.i != mode) {
            cVar.i = mode;
            if (cVar.b(false) == null || cVar.i == null) {
                return;
            }
            E.a.i(cVar.b(false), cVar.i);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z2) {
        this.d.f137r = z2;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f1841o);
    }
}
