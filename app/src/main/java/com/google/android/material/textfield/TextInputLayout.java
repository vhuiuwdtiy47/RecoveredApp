package com.google.android.material.textfield;

import D0.c;
import D0.d;
import L.C0011g;
import L.C0016l;
import L.J;
import L.S;
import M0.b;
import M0.m;
import T0.e;
import T0.f;
import T0.g;
import T0.j;
import T0.k;
import W0.A;
import W0.B;
import W0.C;
import W0.h;
import W0.p;
import W0.s;
import W0.t;
import W0.w;
import W0.y;
import W0.z;
import Y0.a;
import Z0.i;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import l.AbstractC0242k0;
import l.C0224b0;
import l.C0263v;
import w0.AbstractC0373a;
import x0.AbstractC0375a;

/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: C0, reason: collision with root package name */
    public static final int[][] f1994C0 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f1995A;

    /* renamed from: A0, reason: collision with root package name */
    public boolean f1996A0;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f1997B;

    /* renamed from: B0, reason: collision with root package name */
    public boolean f1998B0;

    /* renamed from: C, reason: collision with root package name */
    public boolean f1999C;

    /* renamed from: D, reason: collision with root package name */
    public CharSequence f2000D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f2001E;

    /* renamed from: F, reason: collision with root package name */
    public g f2002F;
    public g G;

    /* renamed from: H, reason: collision with root package name */
    public StateListDrawable f2003H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f2004I;

    /* renamed from: J, reason: collision with root package name */
    public g f2005J;

    /* renamed from: K, reason: collision with root package name */
    public g f2006K;

    /* renamed from: L, reason: collision with root package name */
    public k f2007L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f2008M;

    /* renamed from: N, reason: collision with root package name */
    public final int f2009N;

    /* renamed from: O, reason: collision with root package name */
    public int f2010O;

    /* renamed from: P, reason: collision with root package name */
    public int f2011P;

    /* renamed from: Q, reason: collision with root package name */
    public int f2012Q;

    /* renamed from: R, reason: collision with root package name */
    public int f2013R;

    /* renamed from: S, reason: collision with root package name */
    public int f2014S;

    /* renamed from: T, reason: collision with root package name */
    public int f2015T;

    /* renamed from: U, reason: collision with root package name */
    public int f2016U;

    /* renamed from: V, reason: collision with root package name */
    public final Rect f2017V;

    /* renamed from: W, reason: collision with root package name */
    public final Rect f2018W;

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f2019a;

    /* renamed from: a0, reason: collision with root package name */
    public final RectF f2020a0;

    /* renamed from: b, reason: collision with root package name */
    public final y f2021b;
    public Typeface b0;

    /* renamed from: c, reason: collision with root package name */
    public final p f2022c;

    /* renamed from: c0, reason: collision with root package name */
    public ColorDrawable f2023c0;
    public EditText d;

    /* renamed from: d0, reason: collision with root package name */
    public int f2024d0;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f2025e;

    /* renamed from: e0, reason: collision with root package name */
    public final LinkedHashSet f2026e0;

    /* renamed from: f, reason: collision with root package name */
    public int f2027f;

    /* renamed from: f0, reason: collision with root package name */
    public ColorDrawable f2028f0;

    /* renamed from: g, reason: collision with root package name */
    public int f2029g;

    /* renamed from: g0, reason: collision with root package name */
    public int f2030g0;
    public int h;

    /* renamed from: h0, reason: collision with root package name */
    public Drawable f2031h0;
    public int i;

    /* renamed from: i0, reason: collision with root package name */
    public ColorStateList f2032i0;

    /* renamed from: j, reason: collision with root package name */
    public final t f2033j;

    /* renamed from: j0, reason: collision with root package name */
    public ColorStateList f2034j0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2035k;

    /* renamed from: k0, reason: collision with root package name */
    public int f2036k0;

    /* renamed from: l, reason: collision with root package name */
    public int f2037l;

    /* renamed from: l0, reason: collision with root package name */
    public int f2038l0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2039m;

    /* renamed from: m0, reason: collision with root package name */
    public int f2040m0;

    /* renamed from: n, reason: collision with root package name */
    public B f2041n;

    /* renamed from: n0, reason: collision with root package name */
    public ColorStateList f2042n0;

    /* renamed from: o, reason: collision with root package name */
    public C0224b0 f2043o;

    /* renamed from: o0, reason: collision with root package name */
    public int f2044o0;

    /* renamed from: p, reason: collision with root package name */
    public int f2045p;

    /* renamed from: p0, reason: collision with root package name */
    public int f2046p0;

    /* renamed from: q, reason: collision with root package name */
    public int f2047q;

    /* renamed from: q0, reason: collision with root package name */
    public int f2048q0;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f2049r;
    public int r0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2050s;

    /* renamed from: s0, reason: collision with root package name */
    public int f2051s0;

    /* renamed from: t, reason: collision with root package name */
    public C0224b0 f2052t;

    /* renamed from: t0, reason: collision with root package name */
    public int f2053t0;

    /* renamed from: u, reason: collision with root package name */
    public ColorStateList f2054u;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f2055u0;

    /* renamed from: v, reason: collision with root package name */
    public int f2056v;
    public final b v0;

    /* renamed from: w, reason: collision with root package name */
    public s0.g f2057w;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f2058w0;

    /* renamed from: x, reason: collision with root package name */
    public s0.g f2059x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f2060x0;

    /* renamed from: y, reason: collision with root package name */
    public ColorStateList f2061y;

    /* renamed from: y0, reason: collision with root package name */
    public ValueAnimator f2062y0;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f2063z;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f2064z0;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.android.music.R.attr.textInputStyle, com.android.music.R.style.Widget_Design_TextInputLayout), attributeSet, com.android.music.R.attr.textInputStyle);
        this.f2027f = -1;
        this.f2029g = -1;
        this.h = -1;
        this.i = -1;
        this.f2033j = new t(this);
        this.f2041n = new C0011g(2);
        this.f2017V = new Rect();
        this.f2018W = new Rect();
        this.f2020a0 = new RectF();
        this.f2026e0 = new LinkedHashSet();
        b bVar = new b(this);
        this.v0 = bVar;
        this.f1998B0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f2019a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = AbstractC0375a.f4189a;
        bVar.f436Q = linearInterpolator;
        bVar.h(false);
        bVar.f435P = linearInterpolator;
        bVar.h(false);
        if (bVar.f456g != 8388659) {
            bVar.f456g = 8388659;
            bVar.h(false);
        }
        C0016l h = m.h(context2, attributeSet, AbstractC0373a.f4148E, com.android.music.R.attr.textInputStyle, com.android.music.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 49);
        y yVar = new y(this, h);
        this.f2021b = yVar;
        TypedArray typedArray = (TypedArray) h.f362c;
        this.f1999C = typedArray.getBoolean(48, true);
        setHint(typedArray.getText(4));
        this.f2060x0 = typedArray.getBoolean(47, true);
        this.f2058w0 = typedArray.getBoolean(42, true);
        if (typedArray.hasValue(6)) {
            setMinEms(typedArray.getInt(6, -1));
        } else if (typedArray.hasValue(3)) {
            setMinWidth(typedArray.getDimensionPixelSize(3, -1));
        }
        if (typedArray.hasValue(5)) {
            setMaxEms(typedArray.getInt(5, -1));
        } else if (typedArray.hasValue(2)) {
            setMaxWidth(typedArray.getDimensionPixelSize(2, -1));
        }
        this.f2007L = k.b(context2, attributeSet, com.android.music.R.attr.textInputStyle, com.android.music.R.style.Widget_Design_TextInputLayout).a();
        this.f2009N = context2.getResources().getDimensionPixelOffset(com.android.music.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f2011P = typedArray.getDimensionPixelOffset(9, 0);
        this.f2013R = typedArray.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.android.music.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f2014S = typedArray.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.android.music.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f2012Q = this.f2013R;
        float dimension = typedArray.getDimension(13, -1.0f);
        float dimension2 = typedArray.getDimension(12, -1.0f);
        float dimension3 = typedArray.getDimension(10, -1.0f);
        float dimension4 = typedArray.getDimension(11, -1.0f);
        j e2 = this.f2007L.e();
        if (dimension >= 0.0f) {
            e2.f704e = new T0.a(dimension);
        }
        if (dimension2 >= 0.0f) {
            e2.f705f = new T0.a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            e2.f706g = new T0.a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            e2.h = new T0.a(dimension4);
        }
        this.f2007L = e2.a();
        ColorStateList w2 = i.w(context2, h, 7);
        if (w2 != null) {
            int defaultColor = w2.getDefaultColor();
            this.f2044o0 = defaultColor;
            this.f2016U = defaultColor;
            if (w2.isStateful()) {
                this.f2046p0 = w2.getColorForState(new int[]{-16842910}, -1);
                this.f2048q0 = w2.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.r0 = w2.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f2048q0 = this.f2044o0;
                ColorStateList v2 = i.v(context2, com.android.music.R.color.mtrl_filled_background_color);
                this.f2046p0 = v2.getColorForState(new int[]{-16842910}, -1);
                this.r0 = v2.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f2016U = 0;
            this.f2044o0 = 0;
            this.f2046p0 = 0;
            this.f2048q0 = 0;
            this.r0 = 0;
        }
        if (typedArray.hasValue(1)) {
            ColorStateList g2 = h.g(1);
            this.f2034j0 = g2;
            this.f2032i0 = g2;
        }
        ColorStateList w3 = i.w(context2, h, 14);
        this.f2040m0 = typedArray.getColor(14, 0);
        this.f2036k0 = B.b.a(context2, com.android.music.R.color.mtrl_textinput_default_box_stroke_color);
        this.f2051s0 = B.b.a(context2, com.android.music.R.color.mtrl_textinput_disabled_color);
        this.f2038l0 = B.b.a(context2, com.android.music.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (w3 != null) {
            setBoxStrokeColorStateList(w3);
        }
        if (typedArray.hasValue(15)) {
            setBoxStrokeErrorColor(i.w(context2, h, 15));
        }
        if (typedArray.getResourceId(49, -1) != -1) {
            setHintTextAppearance(typedArray.getResourceId(49, 0));
        }
        this.f1995A = h.g(24);
        this.f1997B = h.g(25);
        int resourceId = typedArray.getResourceId(40, 0);
        CharSequence text = typedArray.getText(35);
        int i = typedArray.getInt(34, 1);
        boolean z2 = typedArray.getBoolean(36, false);
        int resourceId2 = typedArray.getResourceId(45, 0);
        boolean z3 = typedArray.getBoolean(44, false);
        CharSequence text2 = typedArray.getText(43);
        int resourceId3 = typedArray.getResourceId(57, 0);
        CharSequence text3 = typedArray.getText(56);
        boolean z4 = typedArray.getBoolean(18, false);
        setCounterMaxLength(typedArray.getInt(19, -1));
        this.f2047q = typedArray.getResourceId(22, 0);
        this.f2045p = typedArray.getResourceId(20, 0);
        setBoxBackgroundMode(typedArray.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i);
        setCounterOverflowTextAppearance(this.f2045p);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f2047q);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArray.hasValue(41)) {
            setErrorTextColor(h.g(41));
        }
        if (typedArray.hasValue(46)) {
            setHelperTextColor(h.g(46));
        }
        if (typedArray.hasValue(50)) {
            setHintTextColor(h.g(50));
        }
        if (typedArray.hasValue(23)) {
            setCounterTextColor(h.g(23));
        }
        if (typedArray.hasValue(21)) {
            setCounterOverflowTextColor(h.g(21));
        }
        if (typedArray.hasValue(58)) {
            setPlaceholderTextColor(h.g(58));
        }
        p pVar = new p(this, h);
        this.f2022c = pVar;
        boolean z5 = typedArray.getBoolean(0, true);
        h.u();
        WeakHashMap weakHashMap = S.f311a;
        setImportantForAccessibility(2);
        J.m(this, 1);
        frameLayout.addView(yVar);
        frameLayout.addView(pVar);
        addView(frameLayout);
        setEnabled(z5);
        setHelperTextEnabled(z3);
        setErrorEnabled(z2);
        setCounterEnabled(z4);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.d;
        if (!(editText instanceof AutoCompleteTextView) || U.t.H(editText)) {
            return this.f2002F;
        }
        int u2 = i.u(this.d, com.android.music.R.attr.colorControlHighlight);
        int i = this.f2010O;
        int[][] iArr = f1994C0;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            g gVar = this.f2002F;
            int i2 = this.f2016U;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{i.L(u2, i2, 0.1f), i2}), gVar, gVar);
        }
        Context context = getContext();
        g gVar2 = this.f2002F;
        TypedValue d02 = i.d0(com.android.music.R.attr.colorSurface, context, "TextInputLayout");
        int i3 = d02.resourceId;
        int a2 = i3 != 0 ? B.b.a(context, i3) : d02.data;
        g gVar3 = new g(gVar2.f683a.f669a);
        int L2 = i.L(u2, a2, 0.1f);
        gVar3.j(new ColorStateList(iArr, new int[]{L2, 0}));
        gVar3.setTint(a2);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{L2, a2});
        g gVar4 = new g(gVar2.f683a.f669a);
        gVar4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar3, gVar4), gVar2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f2003H == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f2003H = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f2003H.addState(new int[0], f(false));
        }
        return this.f2003H;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.G == null) {
            this.G = f(true);
        }
        return this.G;
    }

    public static void k(ViewGroup viewGroup, boolean z2) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z2);
            if (childAt instanceof ViewGroup) {
                k((ViewGroup) childAt, z2);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.d != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.d = editText;
        int i = this.f2027f;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.h);
        }
        int i2 = this.f2029g;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.i);
        }
        this.f2004I = false;
        i();
        setTextInputAccessibilityDelegate(new A(this));
        Typeface typeface = this.d.getTypeface();
        b bVar = this.v0;
        bVar.m(typeface);
        float textSize = this.d.getTextSize();
        if (bVar.h != textSize) {
            bVar.h = textSize;
            bVar.h(false);
        }
        float letterSpacing = this.d.getLetterSpacing();
        if (bVar.f442W != letterSpacing) {
            bVar.f442W = letterSpacing;
            bVar.h(false);
        }
        int gravity = this.d.getGravity();
        int i3 = (gravity & (-113)) | 48;
        if (bVar.f456g != i3) {
            bVar.f456g = i3;
            bVar.h(false);
        }
        if (bVar.f454f != gravity) {
            bVar.f454f = gravity;
            bVar.h(false);
        }
        WeakHashMap weakHashMap = S.f311a;
        this.f2053t0 = editText.getMinimumHeight();
        this.d.addTextChangedListener(new z(this, editText));
        if (this.f2032i0 == null) {
            this.f2032i0 = this.d.getHintTextColors();
        }
        if (this.f1999C) {
            if (TextUtils.isEmpty(this.f2000D)) {
                CharSequence hint = this.d.getHint();
                this.f2025e = hint;
                setHint(hint);
                this.d.setHint((CharSequence) null);
            }
            this.f2001E = true;
        }
        p();
        if (this.f2043o != null) {
            n(this.d.getText());
        }
        r();
        this.f2033j.b();
        this.f2021b.bringToFront();
        p pVar = this.f2022c;
        pVar.bringToFront();
        Iterator it = this.f2026e0.iterator();
        while (it.hasNext()) {
            ((W0.m) it.next()).a(this);
        }
        pVar.m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        u(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f2000D)) {
            return;
        }
        this.f2000D = charSequence;
        b bVar = this.v0;
        if (charSequence == null || !TextUtils.equals(bVar.f421A, charSequence)) {
            bVar.f421A = charSequence;
            bVar.f422B = null;
            Bitmap bitmap = bVar.f425E;
            if (bitmap != null) {
                bitmap.recycle();
                bVar.f425E = null;
            }
            bVar.h(false);
        }
        if (this.f2055u0) {
            return;
        }
        j();
    }

    private void setPlaceholderTextEnabled(boolean z2) {
        if (this.f2050s == z2) {
            return;
        }
        if (z2) {
            C0224b0 c0224b0 = this.f2052t;
            if (c0224b0 != null) {
                this.f2019a.addView(c0224b0);
                this.f2052t.setVisibility(0);
            }
        } else {
            C0224b0 c0224b02 = this.f2052t;
            if (c0224b02 != null) {
                c0224b02.setVisibility(8);
            }
            this.f2052t = null;
        }
        this.f2050s = z2;
    }

    public final void a(float f2) {
        int i = 2;
        b bVar = this.v0;
        if (bVar.f448b == f2) {
            return;
        }
        if (this.f2062y0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f2062y0 = valueAnimator;
            valueAnimator.setInterpolator(i.c0(getContext(), com.android.music.R.attr.motionEasingEmphasizedInterpolator, AbstractC0375a.f4190b));
            this.f2062y0.setDuration(i.b0(getContext(), com.android.music.R.attr.motionDurationMedium4, 167));
            this.f2062y0.addUpdateListener(new c(i, this));
        }
        this.f2062y0.setFloatValues(bVar.f448b, f2);
        this.f2062y0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f2019a;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        t();
        setEditText((EditText) view);
    }

    public final void b() {
        int i;
        int i2;
        g gVar = this.f2002F;
        if (gVar == null) {
            return;
        }
        k kVar = gVar.f683a.f669a;
        k kVar2 = this.f2007L;
        if (kVar != kVar2) {
            gVar.setShapeAppearanceModel(kVar2);
        }
        if (this.f2010O == 2 && (i = this.f2012Q) > -1 && (i2 = this.f2015T) != 0) {
            g gVar2 = this.f2002F;
            gVar2.f683a.f675j = i;
            gVar2.invalidateSelf();
            ColorStateList valueOf = ColorStateList.valueOf(i2);
            f fVar = gVar2.f683a;
            if (fVar.d != valueOf) {
                fVar.d = valueOf;
                gVar2.onStateChange(gVar2.getState());
            }
        }
        int i3 = this.f2016U;
        if (this.f2010O == 1) {
            i3 = D.a.b(this.f2016U, i.t(getContext(), com.android.music.R.attr.colorSurface, 0));
        }
        this.f2016U = i3;
        this.f2002F.j(ColorStateList.valueOf(i3));
        g gVar3 = this.f2005J;
        if (gVar3 != null && this.f2006K != null) {
            if (this.f2012Q > -1 && this.f2015T != 0) {
                gVar3.j(this.d.isFocused() ? ColorStateList.valueOf(this.f2036k0) : ColorStateList.valueOf(this.f2015T));
                this.f2006K.j(ColorStateList.valueOf(this.f2015T));
            }
            invalidate();
        }
        s();
    }

    public final int c() {
        float d;
        if (!this.f1999C) {
            return 0;
        }
        int i = this.f2010O;
        b bVar = this.v0;
        if (i == 0) {
            d = bVar.d();
        } else {
            if (i != 2) {
                return 0;
            }
            d = bVar.d() / 2.0f;
        }
        return (int) d;
    }

    public final s0.g d() {
        s0.g gVar = new s0.g();
        gVar.f3620c = i.b0(getContext(), com.android.music.R.attr.motionDurationShort2, 87);
        gVar.d = i.c0(getContext(), com.android.music.R.attr.motionEasingLinearInterpolator, AbstractC0375a.f4189a);
        return gVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.d;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f2025e != null) {
            boolean z2 = this.f2001E;
            this.f2001E = false;
            CharSequence hint = editText.getHint();
            this.d.setHint(this.f2025e);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.d.setHint(hint);
                this.f2001E = z2;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.f2019a;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure newChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(newChild, i);
            if (childAt == this.d) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f1996A0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f1996A0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        g gVar;
        Canvas canvas2 = canvas;
        super.draw(canvas);
        boolean z2 = this.f1999C;
        b bVar = this.v0;
        if (z2) {
            bVar.getClass();
            int save = canvas2.save();
            if (bVar.f422B != null) {
                RectF rectF = bVar.f452e;
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    TextPaint textPaint = bVar.f433N;
                    textPaint.setTextSize(bVar.G);
                    float f2 = bVar.f463p;
                    float f3 = bVar.f464q;
                    float f4 = bVar.f426F;
                    if (f4 != 1.0f) {
                        canvas2.scale(f4, f4, f2, f3);
                    }
                    if (bVar.f451d0 <= 1 || bVar.f423C) {
                        canvas2.translate(f2, f3);
                        bVar.f444Y.draw(canvas2);
                    } else {
                        float lineStart = bVar.f463p - bVar.f444Y.getLineStart(0);
                        int alpha = textPaint.getAlpha();
                        canvas2.translate(lineStart, f3);
                        float f5 = alpha;
                        textPaint.setAlpha((int) (bVar.b0 * f5));
                        int i = Build.VERSION.SDK_INT;
                        if (i >= 31) {
                            float f6 = bVar.f427H;
                            float f7 = bVar.f428I;
                            float f8 = bVar.f429J;
                            int i2 = bVar.f430K;
                            textPaint.setShadowLayer(f6, f7, f8, D.a.d(i2, (textPaint.getAlpha() * Color.alpha(i2)) / 255));
                        }
                        bVar.f444Y.draw(canvas2);
                        textPaint.setAlpha((int) (bVar.f447a0 * f5));
                        if (i >= 31) {
                            float f9 = bVar.f427H;
                            float f10 = bVar.f428I;
                            float f11 = bVar.f429J;
                            int i3 = bVar.f430K;
                            textPaint.setShadowLayer(f9, f10, f11, D.a.d(i3, (Color.alpha(i3) * textPaint.getAlpha()) / 255));
                        }
                        int lineBaseline = bVar.f444Y.getLineBaseline(0);
                        CharSequence charSequence = bVar.f450c0;
                        float f12 = lineBaseline;
                        canvas2.drawText(charSequence, 0, charSequence.length(), 0.0f, f12, textPaint);
                        if (i >= 31) {
                            textPaint.setShadowLayer(bVar.f427H, bVar.f428I, bVar.f429J, bVar.f430K);
                        }
                        String trim = bVar.f450c0.toString().trim();
                        if (trim.endsWith("…")) {
                            trim = trim.substring(0, trim.length() - 1);
                        }
                        String str = trim;
                        textPaint.setAlpha(alpha);
                        canvas2 = canvas;
                        canvas2.drawText(str, 0, Math.min(bVar.f444Y.getLineEnd(0), str.length()), 0.0f, f12, (Paint) textPaint);
                    }
                    canvas2.restoreToCount(save);
                }
            }
        }
        if (this.f2006K == null || (gVar = this.f2005J) == null) {
            return;
        }
        gVar.draw(canvas2);
        if (this.d.isFocused()) {
            Rect bounds = this.f2006K.getBounds();
            Rect bounds2 = this.f2005J.getBounds();
            float f13 = bVar.f448b;
            int centerX = bounds2.centerX();
            bounds.left = AbstractC0375a.c(centerX, bounds2.left, f13);
            bounds.right = AbstractC0375a.c(centerX, bounds2.right, f13);
            this.f2006K.draw(canvas2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void drawableStateChanged() {
        /*
            r4 = this;
            boolean r0 = r4.f2064z0
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.f2064z0 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            r2 = 0
            M0.b r3 = r4.v0
            if (r3 == 0) goto L2f
            r3.f431L = r1
            android.content.res.ColorStateList r1 = r3.f458k
            if (r1 == 0) goto L20
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L2a
        L20:
            android.content.res.ColorStateList r1 = r3.f457j
            if (r1 == 0) goto L2f
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L2f
        L2a:
            r3.h(r2)
            r1 = r0
            goto L30
        L2f:
            r1 = r2
        L30:
            android.widget.EditText r3 = r4.d
            if (r3 == 0) goto L47
            java.util.WeakHashMap r3 = L.S.f311a
            boolean r3 = r4.isLaidOut()
            if (r3 == 0) goto L43
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L43
            goto L44
        L43:
            r0 = r2
        L44:
            r4.u(r0, r2)
        L47:
            r4.r()
            r4.x()
            if (r1 == 0) goto L52
            r4.invalidate()
        L52:
            r4.f2064z0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    public final boolean e() {
        return this.f1999C && !TextUtils.isEmpty(this.f2000D) && (this.f2002F instanceof h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, T0.k] */
    /* JADX WARN: Type inference failed for: r6v1, types: [Z0.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [Z0.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [Z0.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [Z0.i, java.lang.Object] */
    public final g f(boolean z2) {
        int i = 0;
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.android.music.R.dimen.mtrl_shape_corner_size_small_component);
        float f2 = z2 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.d;
        float popupElevation = editText instanceof w ? ((w) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.android.music.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.android.music.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        ?? obj = new Object();
        ?? obj2 = new Object();
        ?? obj3 = new Object();
        ?? obj4 = new Object();
        e eVar = new e(i);
        e eVar2 = new e(i);
        e eVar3 = new e(i);
        e eVar4 = new e(i);
        T0.a aVar = new T0.a(f2);
        T0.a aVar2 = new T0.a(f2);
        T0.a aVar3 = new T0.a(dimensionPixelOffset);
        T0.a aVar4 = new T0.a(dimensionPixelOffset);
        ?? obj5 = new Object();
        obj5.f710a = obj;
        obj5.f711b = obj2;
        obj5.f712c = obj3;
        obj5.d = obj4;
        obj5.f713e = aVar;
        obj5.f714f = aVar2;
        obj5.f715g = aVar4;
        obj5.h = aVar3;
        obj5.i = eVar;
        obj5.f716j = eVar2;
        obj5.f717k = eVar3;
        obj5.f718l = eVar4;
        EditText editText2 = this.d;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof w ? ((w) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            int i2 = g.f682u;
            TypedValue d02 = i.d0(com.android.music.R.attr.colorSurface, context, g.class.getSimpleName());
            int i3 = d02.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i3 != 0 ? B.b.a(context, i3) : d02.data);
        }
        g gVar = new g();
        gVar.h(context);
        gVar.j(dropDownBackgroundTintList);
        gVar.i(popupElevation);
        gVar.setShapeAppearanceModel(obj5);
        f fVar = gVar.f683a;
        if (fVar.f674g == null) {
            fVar.f674g = new Rect();
        }
        gVar.f683a.f674g.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        gVar.invalidateSelf();
        return gVar;
    }

    public final int g(int i, boolean z2) {
        return ((z2 || getPrefixText() == null) ? (!z2 || getSuffixText() == null) ? this.d.getCompoundPaddingLeft() : this.f2022c.c() : this.f2021b.a()) + i;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.d;
        if (editText == null) {
            return super.getBaseline();
        }
        return c() + getPaddingTop() + editText.getBaseline();
    }

    public g getBoxBackground() {
        int i = this.f2010O;
        if (i == 1 || i == 2) {
            return this.f2002F;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f2016U;
    }

    public int getBoxBackgroundMode() {
        return this.f2010O;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f2011P;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean f2 = m.f(this);
        RectF rectF = this.f2020a0;
        return f2 ? this.f2007L.h.a(rectF) : this.f2007L.f715g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean f2 = m.f(this);
        RectF rectF = this.f2020a0;
        return f2 ? this.f2007L.f715g.a(rectF) : this.f2007L.h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean f2 = m.f(this);
        RectF rectF = this.f2020a0;
        return f2 ? this.f2007L.f713e.a(rectF) : this.f2007L.f714f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean f2 = m.f(this);
        RectF rectF = this.f2020a0;
        return f2 ? this.f2007L.f714f.a(rectF) : this.f2007L.f713e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f2040m0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f2042n0;
    }

    public int getBoxStrokeWidth() {
        return this.f2013R;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f2014S;
    }

    public int getCounterMaxLength() {
        return this.f2037l;
    }

    public CharSequence getCounterOverflowDescription() {
        C0224b0 c0224b0;
        if (this.f2035k && this.f2039m && (c0224b0 = this.f2043o) != null) {
            return c0224b0.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f2063z;
    }

    public ColorStateList getCounterTextColor() {
        return this.f2061y;
    }

    public ColorStateList getCursorColor() {
        return this.f1995A;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f1997B;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f2032i0;
    }

    public EditText getEditText() {
        return this.d;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f2022c.f883g.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f2022c.f883g.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f2022c.f887m;
    }

    public int getEndIconMode() {
        return this.f2022c.i;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f2022c.f888n;
    }

    public CheckableImageButton getEndIconView() {
        return this.f2022c.f883g;
    }

    public CharSequence getError() {
        t tVar = this.f2033j;
        if (tVar.f920q) {
            return tVar.f919p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f2033j.f923t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f2033j.f922s;
    }

    public int getErrorCurrentTextColors() {
        C0224b0 c0224b0 = this.f2033j.f921r;
        if (c0224b0 != null) {
            return c0224b0.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f2022c.f880c.getDrawable();
    }

    public CharSequence getHelperText() {
        t tVar = this.f2033j;
        if (tVar.f927x) {
            return tVar.f926w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        C0224b0 c0224b0 = this.f2033j.f928y;
        if (c0224b0 != null) {
            return c0224b0.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f1999C) {
            return this.f2000D;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.v0.d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        b bVar = this.v0;
        return bVar.e(bVar.f458k);
    }

    public ColorStateList getHintTextColor() {
        return this.f2034j0;
    }

    public B getLengthCounter() {
        return this.f2041n;
    }

    public int getMaxEms() {
        return this.f2029g;
    }

    public int getMaxWidth() {
        return this.i;
    }

    public int getMinEms() {
        return this.f2027f;
    }

    public int getMinWidth() {
        return this.h;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f2022c.f883g.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f2022c.f883g.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f2050s) {
            return this.f2049r;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f2056v;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f2054u;
    }

    public CharSequence getPrefixText() {
        return this.f2021b.f946c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f2021b.f945b.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f2021b.f945b;
    }

    public k getShapeAppearanceModel() {
        return this.f2007L;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f2021b.d.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f2021b.d.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f2021b.f949g;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f2021b.h;
    }

    public CharSequence getSuffixText() {
        return this.f2022c.f890p;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f2022c.f891q.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f2022c.f891q;
    }

    public Typeface getTypeface() {
        return this.b0;
    }

    public final int h(int i, boolean z2) {
        return i - ((z2 || getSuffixText() == null) ? (!z2 || getPrefixText() == null) ? this.d.getCompoundPaddingRight() : this.f2021b.a() : this.f2022c.c());
    }

    /* JADX WARN: Type inference failed for: r0v37, types: [T0.g, W0.h] */
    public final void i() {
        int i = this.f2010O;
        if (i == 0) {
            this.f2002F = null;
            this.f2005J = null;
            this.f2006K = null;
        } else if (i == 1) {
            this.f2002F = new g(this.f2007L);
            this.f2005J = new g();
            this.f2006K = new g();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(this.f2010O + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.f1999C || (this.f2002F instanceof h)) {
                this.f2002F = new g(this.f2007L);
            } else {
                k kVar = this.f2007L;
                int i2 = h.f855w;
                if (kVar == null) {
                    kVar = new k();
                }
                W0.g gVar = new W0.g(kVar, new RectF());
                ?? gVar2 = new g(gVar);
                gVar2.f856v = gVar;
                this.f2002F = gVar2;
            }
            this.f2005J = null;
            this.f2006K = null;
        }
        s();
        x();
        if (this.f2010O == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f2011P = getResources().getDimensionPixelSize(com.android.music.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (i.J(getContext())) {
                this.f2011P = getResources().getDimensionPixelSize(com.android.music.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.d != null && this.f2010O == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.d;
                WeakHashMap weakHashMap = S.f311a;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(com.android.music.R.dimen.material_filled_edittext_font_2_0_padding_top), this.d.getPaddingEnd(), getResources().getDimensionPixelSize(com.android.music.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (i.J(getContext())) {
                EditText editText2 = this.d;
                WeakHashMap weakHashMap2 = S.f311a;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.android.music.R.dimen.material_filled_edittext_font_1_3_padding_top), this.d.getPaddingEnd(), getResources().getDimensionPixelSize(com.android.music.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f2010O != 0) {
            t();
        }
        EditText editText3 = this.d;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.f2010O;
                if (i3 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i3 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    public final void j() {
        float f2;
        float f3;
        float f4;
        RectF rectF;
        float f5;
        int i;
        float f6;
        int i2;
        if (e()) {
            int width = this.d.getWidth();
            int gravity = this.d.getGravity();
            b bVar = this.v0;
            boolean b2 = bVar.b(bVar.f421A);
            bVar.f423C = b2;
            Rect rect = bVar.d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (b2) {
                        i2 = rect.left;
                        f4 = i2;
                    } else {
                        f2 = rect.right;
                        f3 = bVar.f445Z;
                    }
                } else if (b2) {
                    f2 = rect.right;
                    f3 = bVar.f445Z;
                } else {
                    i2 = rect.left;
                    f4 = i2;
                }
                float max = Math.max(f4, rect.left);
                rectF = this.f2020a0;
                rectF.left = max;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f5 = (width / 2.0f) + (bVar.f445Z / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (bVar.f423C) {
                        f6 = bVar.f445Z;
                        f5 = f6 + max;
                    } else {
                        i = rect.right;
                        f5 = i;
                    }
                } else if (bVar.f423C) {
                    i = rect.right;
                    f5 = i;
                } else {
                    f6 = bVar.f445Z;
                    f5 = f6 + max;
                }
                rectF.right = Math.min(f5, rect.right);
                rectF.bottom = bVar.d() + rect.top;
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f7 = rectF.left;
                float f8 = this.f2009N;
                rectF.left = f7 - f8;
                rectF.right += f8;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f2012Q);
                h hVar = (h) this.f2002F;
                hVar.getClass();
                hVar.n(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f2 = width / 2.0f;
            f3 = bVar.f445Z / 2.0f;
            f4 = f2 - f3;
            float max2 = Math.max(f4, rect.left);
            rectF = this.f2020a0;
            rectF.left = max2;
            rectF.top = rect.top;
            if (gravity != 17) {
            }
            f5 = (width / 2.0f) + (bVar.f445Z / 2.0f);
            rectF.right = Math.min(f5, rect.right);
            rectF.bottom = bVar.d() + rect.top;
            if (rectF.width() > 0.0f) {
            }
        }
    }

    public final void l(C0224b0 c0224b0, int i) {
        try {
            c0224b0.setTextAppearance(i);
            if (c0224b0.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        c0224b0.setTextAppearance(com.android.music.R.style.TextAppearance_AppCompat_Caption);
        c0224b0.setTextColor(B.b.a(getContext(), com.android.music.R.color.design_error));
    }

    public final boolean m() {
        t tVar = this.f2033j;
        return (tVar.f918o != 1 || tVar.f921r == null || TextUtils.isEmpty(tVar.f919p)) ? false : true;
    }

    public final void n(Editable editable) {
        ((C0011g) this.f2041n).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z2 = this.f2039m;
        int i = this.f2037l;
        String str = null;
        if (i == -1) {
            this.f2043o.setText(String.valueOf(length));
            this.f2043o.setContentDescription(null);
            this.f2039m = false;
        } else {
            this.f2039m = length > i;
            Context context = getContext();
            this.f2043o.setContentDescription(context.getString(this.f2039m ? com.android.music.R.string.character_counter_overflowed_content_description : com.android.music.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f2037l)));
            if (z2 != this.f2039m) {
                o();
            }
            String str2 = J.b.f285b;
            J.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? J.b.f287e : J.b.d;
            C0224b0 c0224b0 = this.f2043o;
            String string = getContext().getString(com.android.music.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f2037l));
            if (string == null) {
                bVar.getClass();
            } else {
                bVar.getClass();
                d dVar = J.g.f293a;
                str = bVar.c(string).toString();
            }
            c0224b0.setText(str);
        }
        if (this.d == null || z2 == this.f2039m) {
            return;
        }
        u(false, false);
        x();
        r();
    }

    public final void o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0224b0 c0224b0 = this.f2043o;
        if (c0224b0 != null) {
            l(c0224b0, this.f2039m ? this.f2045p : this.f2047q);
            if (!this.f2039m && (colorStateList2 = this.f2061y) != null) {
                this.f2043o.setTextColor(colorStateList2);
            }
            if (!this.f2039m || (colorStateList = this.f2063z) == null) {
                return;
            }
            this.f2043o.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.v0.g(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int max;
        p pVar = this.f2022c;
        pVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z2 = false;
        this.f1998B0 = false;
        if (this.d != null && this.d.getMeasuredHeight() < (max = Math.max(pVar.getMeasuredHeight(), this.f2021b.getMeasuredHeight()))) {
            this.d.setMinimumHeight(max);
            z2 = true;
        }
        boolean q2 = q();
        if (z2 || q2) {
            this.d.post(new F0.b(6, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        EditText editText = this.d;
        if (editText != null) {
            ThreadLocal threadLocal = M0.c.f474a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.f2017V;
            rect.set(0, 0, width, height);
            ThreadLocal threadLocal2 = M0.c.f474a;
            Matrix matrix = (Matrix) threadLocal2.get();
            if (matrix == null) {
                matrix = new Matrix();
                threadLocal2.set(matrix);
            } else {
                matrix.reset();
            }
            M0.c.a(this, editText, matrix);
            ThreadLocal threadLocal3 = M0.c.f475b;
            RectF rectF = (RectF) threadLocal3.get();
            if (rectF == null) {
                rectF = new RectF();
                threadLocal3.set(rectF);
            }
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
            g gVar = this.f2005J;
            if (gVar != null) {
                int i5 = rect.bottom;
                gVar.setBounds(rect.left, i5 - this.f2013R, rect.right, i5);
            }
            g gVar2 = this.f2006K;
            if (gVar2 != null) {
                int i6 = rect.bottom;
                gVar2.setBounds(rect.left, i6 - this.f2014S, rect.right, i6);
            }
            if (this.f1999C) {
                float textSize = this.d.getTextSize();
                b bVar = this.v0;
                if (bVar.h != textSize) {
                    bVar.h = textSize;
                    bVar.h(false);
                }
                int gravity = this.d.getGravity();
                int i7 = (gravity & (-113)) | 48;
                if (bVar.f456g != i7) {
                    bVar.f456g = i7;
                    bVar.h(false);
                }
                if (bVar.f454f != gravity) {
                    bVar.f454f = gravity;
                    bVar.h(false);
                }
                if (this.d == null) {
                    throw new IllegalStateException();
                }
                boolean f2 = m.f(this);
                int i8 = rect.bottom;
                Rect rect2 = this.f2018W;
                rect2.bottom = i8;
                int i9 = this.f2010O;
                if (i9 == 1) {
                    rect2.left = g(rect.left, f2);
                    rect2.top = rect.top + this.f2011P;
                    rect2.right = h(rect.right, f2);
                } else if (i9 != 2) {
                    rect2.left = g(rect.left, f2);
                    rect2.top = getPaddingTop();
                    rect2.right = h(rect.right, f2);
                } else {
                    rect2.left = this.d.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - c();
                    rect2.right = rect.right - this.d.getPaddingRight();
                }
                int i10 = rect2.left;
                int i11 = rect2.top;
                int i12 = rect2.right;
                int i13 = rect2.bottom;
                Rect rect3 = bVar.d;
                if (rect3.left != i10 || rect3.top != i11 || rect3.right != i12 || rect3.bottom != i13) {
                    rect3.set(i10, i11, i12, i13);
                    bVar.f432M = true;
                }
                if (this.d == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = bVar.f434O;
                textPaint.setTextSize(bVar.h);
                textPaint.setTypeface(bVar.f468u);
                textPaint.setLetterSpacing(bVar.f442W);
                float f3 = -textPaint.ascent();
                rect2.left = this.d.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.f2010O != 1 || this.d.getMinLines() > 1) ? rect.top + this.d.getCompoundPaddingTop() : (int) (rect.centerY() - (f3 / 2.0f));
                rect2.right = rect.right - this.d.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f2010O != 1 || this.d.getMinLines() > 1) ? rect.bottom - this.d.getCompoundPaddingBottom() : (int) (rect2.top + f3);
                rect2.bottom = compoundPaddingBottom;
                int i14 = rect2.left;
                int i15 = rect2.top;
                int i16 = rect2.right;
                Rect rect4 = bVar.f449c;
                if (rect4.left != i14 || rect4.top != i15 || rect4.right != i16 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i14, i15, i16, compoundPaddingBottom);
                    bVar.f432M = true;
                }
                bVar.h(false);
                if (!e() || this.f2055u0) {
                    return;
                }
                j();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        EditText editText;
        super.onMeasure(i, i2);
        boolean z2 = this.f1998B0;
        p pVar = this.f2022c;
        if (!z2) {
            pVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f1998B0 = true;
        }
        if (this.f2052t != null && (editText = this.d) != null) {
            this.f2052t.setGravity(editText.getGravity());
            this.f2052t.setPadding(this.d.getCompoundPaddingLeft(), this.d.getCompoundPaddingTop(), this.d.getCompoundPaddingRight(), this.d.getCompoundPaddingBottom());
        }
        pVar.m();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C c2 = (C) parcelable;
        super.onRestoreInstanceState(c2.f628a);
        setError(c2.f837c);
        if (c2.d) {
            post(new D0.i(3, this));
        }
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, T0.k] */
    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z2 = i == 1;
        if (z2 != this.f2008M) {
            T0.c cVar = this.f2007L.f713e;
            RectF rectF = this.f2020a0;
            float a2 = cVar.a(rectF);
            float a3 = this.f2007L.f714f.a(rectF);
            float a4 = this.f2007L.h.a(rectF);
            float a5 = this.f2007L.f715g.a(rectF);
            k kVar = this.f2007L;
            i iVar = kVar.f710a;
            i iVar2 = kVar.f711b;
            i iVar3 = kVar.d;
            i iVar4 = kVar.f712c;
            e eVar = new e(0);
            e eVar2 = new e(0);
            e eVar3 = new e(0);
            e eVar4 = new e(0);
            j.b(iVar2);
            j.b(iVar);
            j.b(iVar4);
            j.b(iVar3);
            T0.a aVar = new T0.a(a3);
            T0.a aVar2 = new T0.a(a2);
            T0.a aVar3 = new T0.a(a5);
            T0.a aVar4 = new T0.a(a4);
            ?? obj = new Object();
            obj.f710a = iVar2;
            obj.f711b = iVar;
            obj.f712c = iVar3;
            obj.d = iVar4;
            obj.f713e = aVar;
            obj.f714f = aVar2;
            obj.f715g = aVar4;
            obj.h = aVar3;
            obj.i = eVar;
            obj.f716j = eVar2;
            obj.f717k = eVar3;
            obj.f718l = eVar4;
            this.f2008M = z2;
            setShapeAppearanceModel(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, S.b, W0.C] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? bVar = new S.b(super.onSaveInstanceState());
        if (m()) {
            bVar.f837c = getError();
        }
        p pVar = this.f2022c;
        bVar.d = pVar.i != 0 && pVar.f883g.d;
        return bVar;
    }

    public final void p() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f1995A;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue Z2 = i.Z(context, com.android.music.R.attr.colorControlActivated);
            if (Z2 != null) {
                int i = Z2.resourceId;
                if (i != 0) {
                    colorStateList2 = i.v(context, i);
                } else {
                    int i2 = Z2.data;
                    if (i2 != 0) {
                        colorStateList2 = ColorStateList.valueOf(i2);
                    }
                }
            }
            colorStateList2 = null;
        }
        EditText editText = this.d;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable mutate = this.d.getTextCursorDrawable().mutate();
        if ((m() || (this.f2043o != null && this.f2039m)) && (colorStateList = this.f1997B) != null) {
            colorStateList2 = colorStateList;
        }
        E.a.h(mutate, colorStateList2);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q() {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.q():boolean");
    }

    public final void r() {
        Drawable background;
        C0224b0 c0224b0;
        EditText editText = this.d;
        if (editText == null || this.f2010O != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = AbstractC0242k0.f3085a;
        Drawable mutate = background.mutate();
        if (m()) {
            mutate.setColorFilter(C0263v.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f2039m && (c0224b0 = this.f2043o) != null) {
            mutate.setColorFilter(C0263v.c(c0224b0.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            mutate.clearColorFilter();
            this.d.refreshDrawableState();
        }
    }

    public final void s() {
        EditText editText = this.d;
        if (editText == null || this.f2002F == null) {
            return;
        }
        if ((this.f2004I || editText.getBackground() == null) && this.f2010O != 0) {
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            EditText editText2 = this.d;
            WeakHashMap weakHashMap = S.f311a;
            editText2.setBackground(editTextBoxBackground);
            this.f2004I = true;
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f2016U != i) {
            this.f2016U = i;
            this.f2044o0 = i;
            this.f2048q0 = i;
            this.r0 = i;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(B.b.a(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f2044o0 = defaultColor;
        this.f2016U = defaultColor;
        this.f2046p0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f2048q0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.r0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.f2010O) {
            return;
        }
        this.f2010O = i;
        if (this.d != null) {
            i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.f2011P = i;
    }

    public void setBoxCornerFamily(int i) {
        j e2 = this.f2007L.e();
        T0.c cVar = this.f2007L.f713e;
        i q2 = i.q(i);
        e2.f701a = q2;
        j.b(q2);
        e2.f704e = cVar;
        T0.c cVar2 = this.f2007L.f714f;
        i q3 = i.q(i);
        e2.f702b = q3;
        j.b(q3);
        e2.f705f = cVar2;
        T0.c cVar3 = this.f2007L.h;
        i q4 = i.q(i);
        e2.d = q4;
        j.b(q4);
        e2.h = cVar3;
        T0.c cVar4 = this.f2007L.f715g;
        i q5 = i.q(i);
        e2.f703c = q5;
        j.b(q5);
        e2.f706g = cVar4;
        this.f2007L = e2.a();
        b();
    }

    public void setBoxStrokeColor(int i) {
        if (this.f2040m0 != i) {
            this.f2040m0 = i;
            x();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f2036k0 = colorStateList.getDefaultColor();
            this.f2051s0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f2038l0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f2040m0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f2040m0 != colorStateList.getDefaultColor()) {
            this.f2040m0 = colorStateList.getDefaultColor();
        }
        x();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f2042n0 != colorStateList) {
            this.f2042n0 = colorStateList;
            x();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f2013R = i;
        x();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f2014S = i;
        x();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z2) {
        if (this.f2035k != z2) {
            t tVar = this.f2033j;
            if (z2) {
                C0224b0 c0224b0 = new C0224b0(getContext(), null);
                this.f2043o = c0224b0;
                c0224b0.setId(com.android.music.R.id.textinput_counter);
                Typeface typeface = this.b0;
                if (typeface != null) {
                    this.f2043o.setTypeface(typeface);
                }
                this.f2043o.setMaxLines(1);
                tVar.a(this.f2043o, 2);
                ((ViewGroup.MarginLayoutParams) this.f2043o.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.android.music.R.dimen.mtrl_textinput_counter_margin_start));
                o();
                if (this.f2043o != null) {
                    EditText editText = this.d;
                    n(editText != null ? editText.getText() : null);
                }
            } else {
                tVar.g(this.f2043o, 2);
                this.f2043o = null;
            }
            this.f2035k = z2;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f2037l != i) {
            if (i > 0) {
                this.f2037l = i;
            } else {
                this.f2037l = -1;
            }
            if (!this.f2035k || this.f2043o == null) {
                return;
            }
            EditText editText = this.d;
            n(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f2045p != i) {
            this.f2045p = i;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f2063z != colorStateList) {
            this.f2063z = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f2047q != i) {
            this.f2047q = i;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f2061y != colorStateList) {
            this.f2061y = colorStateList;
            o();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f1995A != colorStateList) {
            this.f1995A = colorStateList;
            p();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f1997B != colorStateList) {
            this.f1997B = colorStateList;
            if (m() || (this.f2043o != null && this.f2039m)) {
                p();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f2032i0 = colorStateList;
        this.f2034j0 = colorStateList;
        if (this.d != null) {
            u(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        k(this, z2);
        super.setEnabled(z2);
    }

    public void setEndIconActivated(boolean z2) {
        this.f2022c.f883g.setActivated(z2);
    }

    public void setEndIconCheckable(boolean z2) {
        this.f2022c.f883g.setCheckable(z2);
    }

    public void setEndIconContentDescription(int i) {
        p pVar = this.f2022c;
        CharSequence text = i != 0 ? pVar.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = pVar.f883g;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i) {
        p pVar = this.f2022c;
        Drawable u2 = i != 0 ? U.t.u(pVar.getContext(), i) : null;
        CheckableImageButton checkableImageButton = pVar.f883g;
        checkableImageButton.setImageDrawable(u2);
        if (u2 != null) {
            ColorStateList colorStateList = pVar.f885k;
            PorterDuff.Mode mode = pVar.f886l;
            TextInputLayout textInputLayout = pVar.f878a;
            U.t.h(textInputLayout, checkableImageButton, colorStateList, mode);
            U.t.V(textInputLayout, checkableImageButton, pVar.f885k);
        }
    }

    public void setEndIconMinSize(int i) {
        p pVar = this.f2022c;
        if (i < 0) {
            pVar.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != pVar.f887m) {
            pVar.f887m = i;
            CheckableImageButton checkableImageButton = pVar.f883g;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = pVar.f880c;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.f2022c.g(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        p pVar = this.f2022c;
        View.OnLongClickListener onLongClickListener = pVar.f889o;
        CheckableImageButton checkableImageButton = pVar.f883g;
        checkableImageButton.setOnClickListener(onClickListener);
        U.t.b0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        p pVar = this.f2022c;
        pVar.f889o = onLongClickListener;
        CheckableImageButton checkableImageButton = pVar.f883g;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        U.t.b0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        p pVar = this.f2022c;
        pVar.f888n = scaleType;
        pVar.f883g.setScaleType(scaleType);
        pVar.f880c.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        p pVar = this.f2022c;
        if (pVar.f885k != colorStateList) {
            pVar.f885k = colorStateList;
            U.t.h(pVar.f878a, pVar.f883g, colorStateList, pVar.f886l);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        p pVar = this.f2022c;
        if (pVar.f886l != mode) {
            pVar.f886l = mode;
            U.t.h(pVar.f878a, pVar.f883g, pVar.f885k, mode);
        }
    }

    public void setEndIconVisible(boolean z2) {
        this.f2022c.h(z2);
    }

    public void setError(CharSequence charSequence) {
        t tVar = this.f2033j;
        if (!tVar.f920q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            tVar.f();
            return;
        }
        tVar.c();
        tVar.f919p = charSequence;
        tVar.f921r.setText(charSequence);
        int i = tVar.f917n;
        if (i != 1) {
            tVar.f918o = 1;
        }
        tVar.i(i, tVar.f918o, tVar.h(tVar.f921r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        t tVar = this.f2033j;
        tVar.f923t = i;
        C0224b0 c0224b0 = tVar.f921r;
        if (c0224b0 != null) {
            WeakHashMap weakHashMap = S.f311a;
            c0224b0.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        t tVar = this.f2033j;
        tVar.f922s = charSequence;
        C0224b0 c0224b0 = tVar.f921r;
        if (c0224b0 != null) {
            c0224b0.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z2) {
        t tVar = this.f2033j;
        if (tVar.f920q == z2) {
            return;
        }
        tVar.c();
        TextInputLayout textInputLayout = tVar.h;
        if (z2) {
            C0224b0 c0224b0 = new C0224b0(tVar.f912g, null);
            tVar.f921r = c0224b0;
            c0224b0.setId(com.android.music.R.id.textinput_error);
            tVar.f921r.setTextAlignment(5);
            Typeface typeface = tVar.f906B;
            if (typeface != null) {
                tVar.f921r.setTypeface(typeface);
            }
            int i = tVar.f924u;
            tVar.f924u = i;
            C0224b0 c0224b02 = tVar.f921r;
            if (c0224b02 != null) {
                textInputLayout.l(c0224b02, i);
            }
            ColorStateList colorStateList = tVar.f925v;
            tVar.f925v = colorStateList;
            C0224b0 c0224b03 = tVar.f921r;
            if (c0224b03 != null && colorStateList != null) {
                c0224b03.setTextColor(colorStateList);
            }
            CharSequence charSequence = tVar.f922s;
            tVar.f922s = charSequence;
            C0224b0 c0224b04 = tVar.f921r;
            if (c0224b04 != null) {
                c0224b04.setContentDescription(charSequence);
            }
            int i2 = tVar.f923t;
            tVar.f923t = i2;
            C0224b0 c0224b05 = tVar.f921r;
            if (c0224b05 != null) {
                WeakHashMap weakHashMap = S.f311a;
                c0224b05.setAccessibilityLiveRegion(i2);
            }
            tVar.f921r.setVisibility(4);
            tVar.a(tVar.f921r, 0);
        } else {
            tVar.f();
            tVar.g(tVar.f921r, 0);
            tVar.f921r = null;
            textInputLayout.r();
            textInputLayout.x();
        }
        tVar.f920q = z2;
    }

    public void setErrorIconDrawable(int i) {
        p pVar = this.f2022c;
        pVar.i(i != 0 ? U.t.u(pVar.getContext(), i) : null);
        U.t.V(pVar.f878a, pVar.f880c, pVar.d);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        p pVar = this.f2022c;
        CheckableImageButton checkableImageButton = pVar.f880c;
        View.OnLongClickListener onLongClickListener = pVar.f882f;
        checkableImageButton.setOnClickListener(onClickListener);
        U.t.b0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        p pVar = this.f2022c;
        pVar.f882f = onLongClickListener;
        CheckableImageButton checkableImageButton = pVar.f880c;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        U.t.b0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        p pVar = this.f2022c;
        if (pVar.d != colorStateList) {
            pVar.d = colorStateList;
            U.t.h(pVar.f878a, pVar.f880c, colorStateList, pVar.f881e);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        p pVar = this.f2022c;
        if (pVar.f881e != mode) {
            pVar.f881e = mode;
            U.t.h(pVar.f878a, pVar.f880c, pVar.d, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        t tVar = this.f2033j;
        tVar.f924u = i;
        C0224b0 c0224b0 = tVar.f921r;
        if (c0224b0 != null) {
            tVar.h.l(c0224b0, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        t tVar = this.f2033j;
        tVar.f925v = colorStateList;
        C0224b0 c0224b0 = tVar.f921r;
        if (c0224b0 == null || colorStateList == null) {
            return;
        }
        c0224b0.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z2) {
        if (this.f2058w0 != z2) {
            this.f2058w0 = z2;
            u(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        t tVar = this.f2033j;
        if (isEmpty) {
            if (tVar.f927x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!tVar.f927x) {
            setHelperTextEnabled(true);
        }
        tVar.c();
        tVar.f926w = charSequence;
        tVar.f928y.setText(charSequence);
        int i = tVar.f917n;
        if (i != 2) {
            tVar.f918o = 2;
        }
        tVar.i(i, tVar.f918o, tVar.h(tVar.f928y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        t tVar = this.f2033j;
        tVar.f905A = colorStateList;
        C0224b0 c0224b0 = tVar.f928y;
        if (c0224b0 == null || colorStateList == null) {
            return;
        }
        c0224b0.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z2) {
        t tVar = this.f2033j;
        if (tVar.f927x == z2) {
            return;
        }
        tVar.c();
        if (z2) {
            C0224b0 c0224b0 = new C0224b0(tVar.f912g, null);
            tVar.f928y = c0224b0;
            c0224b0.setId(com.android.music.R.id.textinput_helper_text);
            tVar.f928y.setTextAlignment(5);
            Typeface typeface = tVar.f906B;
            if (typeface != null) {
                tVar.f928y.setTypeface(typeface);
            }
            tVar.f928y.setVisibility(4);
            C0224b0 c0224b02 = tVar.f928y;
            WeakHashMap weakHashMap = S.f311a;
            c0224b02.setAccessibilityLiveRegion(1);
            int i = tVar.f929z;
            tVar.f929z = i;
            C0224b0 c0224b03 = tVar.f928y;
            if (c0224b03 != null) {
                c0224b03.setTextAppearance(i);
            }
            ColorStateList colorStateList = tVar.f905A;
            tVar.f905A = colorStateList;
            C0224b0 c0224b04 = tVar.f928y;
            if (c0224b04 != null && colorStateList != null) {
                c0224b04.setTextColor(colorStateList);
            }
            tVar.a(tVar.f928y, 1);
            tVar.f928y.setAccessibilityDelegate(new s(tVar));
        } else {
            tVar.c();
            int i2 = tVar.f917n;
            if (i2 == 2) {
                tVar.f918o = 0;
            }
            tVar.i(i2, tVar.f918o, tVar.h(tVar.f928y, ""));
            tVar.g(tVar.f928y, 1);
            tVar.f928y = null;
            TextInputLayout textInputLayout = tVar.h;
            textInputLayout.r();
            textInputLayout.x();
        }
        tVar.f927x = z2;
    }

    public void setHelperTextTextAppearance(int i) {
        t tVar = this.f2033j;
        tVar.f929z = i;
        C0224b0 c0224b0 = tVar.f928y;
        if (c0224b0 != null) {
            c0224b0.setTextAppearance(i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f1999C) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z2) {
        this.f2060x0 = z2;
    }

    public void setHintEnabled(boolean z2) {
        if (z2 != this.f1999C) {
            this.f1999C = z2;
            if (z2) {
                CharSequence hint = this.d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f2000D)) {
                        setHint(hint);
                    }
                    this.d.setHint((CharSequence) null);
                }
                this.f2001E = true;
            } else {
                this.f2001E = false;
                if (!TextUtils.isEmpty(this.f2000D) && TextUtils.isEmpty(this.d.getHint())) {
                    this.d.setHint(this.f2000D);
                }
                setHintInternal(null);
            }
            if (this.d != null) {
                t();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        b bVar = this.v0;
        TextInputLayout textInputLayout = bVar.f446a;
        Q0.d dVar = new Q0.d(textInputLayout.getContext(), i);
        ColorStateList colorStateList = dVar.f597j;
        if (colorStateList != null) {
            bVar.f458k = colorStateList;
        }
        float f2 = dVar.f598k;
        if (f2 != 0.0f) {
            bVar.i = f2;
        }
        ColorStateList colorStateList2 = dVar.f591a;
        if (colorStateList2 != null) {
            bVar.f440U = colorStateList2;
        }
        bVar.f438S = dVar.f594e;
        bVar.f439T = dVar.f595f;
        bVar.f437R = dVar.f596g;
        bVar.f441V = dVar.i;
        Q0.a aVar = bVar.f472y;
        if (aVar != null) {
            aVar.h = true;
        }
        A0.c cVar = new A0.c(6, bVar);
        dVar.a();
        bVar.f472y = new Q0.a(cVar, dVar.f601n);
        dVar.c(textInputLayout.getContext(), bVar.f472y);
        bVar.h(false);
        this.f2034j0 = bVar.f458k;
        if (this.d != null) {
            u(false, false);
            t();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f2034j0 != colorStateList) {
            if (this.f2032i0 == null) {
                b bVar = this.v0;
                if (bVar.f458k != colorStateList) {
                    bVar.f458k = colorStateList;
                    bVar.h(false);
                }
            }
            this.f2034j0 = colorStateList;
            if (this.d != null) {
                u(false, false);
            }
        }
    }

    public void setLengthCounter(B b2) {
        this.f2041n = b2;
    }

    public void setMaxEms(int i) {
        this.f2029g = i;
        EditText editText = this.d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.i = i;
        EditText editText = this.d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.f2027f = i;
        EditText editText = this.d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.h = i;
        EditText editText = this.d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        p pVar = this.f2022c;
        pVar.f883g.setContentDescription(i != 0 ? pVar.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        p pVar = this.f2022c;
        pVar.f883g.setImageDrawable(i != 0 ? U.t.u(pVar.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z2) {
        p pVar = this.f2022c;
        if (z2 && pVar.i != 1) {
            pVar.g(1);
        } else if (z2) {
            pVar.getClass();
        } else {
            pVar.g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        p pVar = this.f2022c;
        pVar.f885k = colorStateList;
        U.t.h(pVar.f878a, pVar.f883g, colorStateList, pVar.f886l);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        p pVar = this.f2022c;
        pVar.f886l = mode;
        U.t.h(pVar.f878a, pVar.f883g, pVar.f885k, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f2052t == null) {
            C0224b0 c0224b0 = new C0224b0(getContext(), null);
            this.f2052t = c0224b0;
            c0224b0.setId(com.android.music.R.id.textinput_placeholder);
            C0224b0 c0224b02 = this.f2052t;
            WeakHashMap weakHashMap = S.f311a;
            c0224b02.setImportantForAccessibility(2);
            s0.g d = d();
            this.f2057w = d;
            d.f3619b = 67L;
            this.f2059x = d();
            setPlaceholderTextAppearance(this.f2056v);
            setPlaceholderTextColor(this.f2054u);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f2050s) {
                setPlaceholderTextEnabled(true);
            }
            this.f2049r = charSequence;
        }
        EditText editText = this.d;
        v(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f2056v = i;
        C0224b0 c0224b0 = this.f2052t;
        if (c0224b0 != null) {
            c0224b0.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f2054u != colorStateList) {
            this.f2054u = colorStateList;
            C0224b0 c0224b0 = this.f2052t;
            if (c0224b0 == null || colorStateList == null) {
                return;
            }
            c0224b0.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        y yVar = this.f2021b;
        yVar.getClass();
        yVar.f946c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        yVar.f945b.setText(charSequence);
        yVar.e();
    }

    public void setPrefixTextAppearance(int i) {
        this.f2021b.f945b.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f2021b.f945b.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(k kVar) {
        g gVar = this.f2002F;
        if (gVar == null || gVar.f683a.f669a == kVar) {
            return;
        }
        this.f2007L = kVar;
        b();
    }

    public void setStartIconCheckable(boolean z2) {
        this.f2021b.d.setCheckable(z2);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f2021b.d;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? U.t.u(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        y yVar = this.f2021b;
        if (i < 0) {
            yVar.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != yVar.f949g) {
            yVar.f949g = i;
            CheckableImageButton checkableImageButton = yVar.d;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        y yVar = this.f2021b;
        View.OnLongClickListener onLongClickListener = yVar.i;
        CheckableImageButton checkableImageButton = yVar.d;
        checkableImageButton.setOnClickListener(onClickListener);
        U.t.b0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        y yVar = this.f2021b;
        yVar.i = onLongClickListener;
        CheckableImageButton checkableImageButton = yVar.d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        U.t.b0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        y yVar = this.f2021b;
        yVar.h = scaleType;
        yVar.d.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        y yVar = this.f2021b;
        if (yVar.f947e != colorStateList) {
            yVar.f947e = colorStateList;
            U.t.h(yVar.f944a, yVar.d, colorStateList, yVar.f948f);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        y yVar = this.f2021b;
        if (yVar.f948f != mode) {
            yVar.f948f = mode;
            U.t.h(yVar.f944a, yVar.d, yVar.f947e, mode);
        }
    }

    public void setStartIconVisible(boolean z2) {
        this.f2021b.c(z2);
    }

    public void setSuffixText(CharSequence charSequence) {
        p pVar = this.f2022c;
        pVar.getClass();
        pVar.f890p = TextUtils.isEmpty(charSequence) ? null : charSequence;
        pVar.f891q.setText(charSequence);
        pVar.n();
    }

    public void setSuffixTextAppearance(int i) {
        this.f2022c.f891q.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f2022c.f891q.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(A a2) {
        EditText editText = this.d;
        if (editText != null) {
            S.h(editText, a2);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.b0) {
            this.b0 = typeface;
            this.v0.m(typeface);
            t tVar = this.f2033j;
            if (typeface != tVar.f906B) {
                tVar.f906B = typeface;
                C0224b0 c0224b0 = tVar.f921r;
                if (c0224b0 != null) {
                    c0224b0.setTypeface(typeface);
                }
                C0224b0 c0224b02 = tVar.f928y;
                if (c0224b02 != null) {
                    c0224b02.setTypeface(typeface);
                }
            }
            C0224b0 c0224b03 = this.f2043o;
            if (c0224b03 != null) {
                c0224b03.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        if (this.f2010O != 1) {
            FrameLayout frameLayout = this.f2019a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int c2 = c();
            if (c2 != layoutParams.topMargin) {
                layoutParams.topMargin = c2;
                frameLayout.requestLayout();
            }
        }
    }

    public final void u(boolean z2, boolean z3) {
        ColorStateList colorStateList;
        C0224b0 c0224b0;
        boolean isEnabled = isEnabled();
        EditText editText = this.d;
        boolean z4 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.d;
        boolean z5 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f2032i0;
        b bVar = this.v0;
        if (colorStateList2 != null) {
            bVar.i(colorStateList2);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f2032i0;
            bVar.i(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f2051s0) : this.f2051s0));
        } else if (m()) {
            C0224b0 c0224b02 = this.f2033j.f921r;
            bVar.i(c0224b02 != null ? c0224b02.getTextColors() : null);
        } else if (this.f2039m && (c0224b0 = this.f2043o) != null) {
            bVar.i(c0224b0.getTextColors());
        } else if (z5 && (colorStateList = this.f2034j0) != null && bVar.f458k != colorStateList) {
            bVar.f458k = colorStateList;
            bVar.h(false);
        }
        p pVar = this.f2022c;
        y yVar = this.f2021b;
        if (z4 || !this.f2058w0 || (isEnabled() && z5)) {
            if (z3 || this.f2055u0) {
                ValueAnimator valueAnimator = this.f2062y0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f2062y0.cancel();
                }
                if (z2 && this.f2060x0) {
                    a(1.0f);
                } else {
                    bVar.k(1.0f);
                }
                this.f2055u0 = false;
                if (e()) {
                    j();
                }
                EditText editText3 = this.d;
                v(editText3 != null ? editText3.getText() : null);
                yVar.f950j = false;
                yVar.e();
                pVar.f892r = false;
                pVar.n();
                return;
            }
            return;
        }
        if (z3 || !this.f2055u0) {
            ValueAnimator valueAnimator2 = this.f2062y0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f2062y0.cancel();
            }
            if (z2 && this.f2060x0) {
                a(0.0f);
            } else {
                bVar.k(0.0f);
            }
            if (e() && !((h) this.f2002F).f856v.f854q.isEmpty() && e()) {
                ((h) this.f2002F).n(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f2055u0 = true;
            C0224b0 c0224b03 = this.f2052t;
            if (c0224b03 != null && this.f2050s) {
                c0224b03.setText((CharSequence) null);
                s0.p.a(this.f2019a, this.f2059x);
                this.f2052t.setVisibility(4);
            }
            yVar.f950j = true;
            yVar.e();
            pVar.f892r = true;
            pVar.n();
        }
    }

    public final void v(Editable editable) {
        ((C0011g) this.f2041n).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f2019a;
        if (length != 0 || this.f2055u0) {
            C0224b0 c0224b0 = this.f2052t;
            if (c0224b0 == null || !this.f2050s) {
                return;
            }
            c0224b0.setText((CharSequence) null);
            s0.p.a(frameLayout, this.f2059x);
            this.f2052t.setVisibility(4);
            return;
        }
        if (this.f2052t == null || !this.f2050s || TextUtils.isEmpty(this.f2049r)) {
            return;
        }
        this.f2052t.setText(this.f2049r);
        s0.p.a(frameLayout, this.f2057w);
        this.f2052t.setVisibility(0);
        this.f2052t.bringToFront();
        announceForAccessibility(this.f2049r);
    }

    public final void w(boolean z2, boolean z3) {
        int defaultColor = this.f2042n0.getDefaultColor();
        int colorForState = this.f2042n0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f2042n0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z2) {
            this.f2015T = colorForState2;
        } else if (z3) {
            this.f2015T = colorForState;
        } else {
            this.f2015T = defaultColor;
        }
    }

    public final void x() {
        C0224b0 c0224b0;
        EditText editText;
        EditText editText2;
        if (this.f2002F == null || this.f2010O == 0) {
            return;
        }
        boolean z2 = false;
        boolean z3 = isFocused() || ((editText2 = this.d) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.d) != null && editText.isHovered())) {
            z2 = true;
        }
        if (!isEnabled()) {
            this.f2015T = this.f2051s0;
        } else if (m()) {
            if (this.f2042n0 != null) {
                w(z3, z2);
            } else {
                this.f2015T = getErrorCurrentTextColors();
            }
        } else if (!this.f2039m || (c0224b0 = this.f2043o) == null) {
            if (z3) {
                this.f2015T = this.f2040m0;
            } else if (z2) {
                this.f2015T = this.f2038l0;
            } else {
                this.f2015T = this.f2036k0;
            }
        } else if (this.f2042n0 != null) {
            w(z3, z2);
        } else {
            this.f2015T = c0224b0.getCurrentTextColor();
        }
        p();
        p pVar = this.f2022c;
        pVar.l();
        CheckableImageButton checkableImageButton = pVar.f880c;
        ColorStateList colorStateList = pVar.d;
        TextInputLayout textInputLayout = pVar.f878a;
        U.t.V(textInputLayout, checkableImageButton, colorStateList);
        ColorStateList colorStateList2 = pVar.f885k;
        CheckableImageButton checkableImageButton2 = pVar.f883g;
        U.t.V(textInputLayout, checkableImageButton2, colorStateList2);
        if (pVar.b() instanceof W0.k) {
            if (!textInputLayout.m() || checkableImageButton2.getDrawable() == null) {
                U.t.h(textInputLayout, checkableImageButton2, pVar.f885k, pVar.f886l);
            } else {
                Drawable mutate = checkableImageButton2.getDrawable().mutate();
                E.a.g(mutate, textInputLayout.getErrorCurrentTextColors());
                checkableImageButton2.setImageDrawable(mutate);
            }
        }
        y yVar = this.f2021b;
        U.t.V(yVar.f944a, yVar.d, yVar.f947e);
        if (this.f2010O == 2) {
            int i = this.f2012Q;
            if (z3 && isEnabled()) {
                this.f2012Q = this.f2014S;
            } else {
                this.f2012Q = this.f2013R;
            }
            if (this.f2012Q != i && e() && !this.f2055u0) {
                if (e()) {
                    ((h) this.f2002F).n(0.0f, 0.0f, 0.0f, 0.0f);
                }
                j();
            }
        }
        if (this.f2010O == 1) {
            if (!isEnabled()) {
                this.f2016U = this.f2046p0;
            } else if (z2 && !z3) {
                this.f2016U = this.r0;
            } else if (z3) {
                this.f2016U = this.f2048q0;
            } else {
                this.f2016U = this.f2044o0;
            }
        }
        b();
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f2021b.b(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f2022c.f883g.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f2022c.f883g.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f2022c.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f2022c.f883g;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        p pVar = this.f2022c;
        CheckableImageButton checkableImageButton = pVar.f883g;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = pVar.f885k;
            PorterDuff.Mode mode = pVar.f886l;
            TextInputLayout textInputLayout = pVar.f878a;
            U.t.h(textInputLayout, checkableImageButton, colorStateList, mode);
            U.t.V(textInputLayout, checkableImageButton, pVar.f885k);
        }
    }
}
