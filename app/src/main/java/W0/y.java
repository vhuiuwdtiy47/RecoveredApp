package W0;

import L.C0016l;
import L.S;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.android.music.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import l.C0224b0;

/* loaded from: classes.dex */
public final class y extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f944a;

    /* renamed from: b, reason: collision with root package name */
    public final C0224b0 f945b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f946c;
    public final CheckableImageButton d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f947e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f948f;

    /* renamed from: g, reason: collision with root package name */
    public int f949g;
    public ImageView.ScaleType h;
    public View.OnLongClickListener i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f950j;

    public y(TextInputLayout textInputLayout, C0016l c0016l) {
        super(textInputLayout.getContext());
        CharSequence text;
        this.f944a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.d = checkableImageButton;
        C0224b0 c0224b0 = new C0224b0(getContext(), null);
        this.f945b = c0224b0;
        if (Z0.i.J(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.i;
        checkableImageButton.setOnClickListener(null);
        U.t.b0(checkableImageButton, onLongClickListener);
        this.i = null;
        checkableImageButton.setOnLongClickListener(null);
        U.t.b0(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) c0016l.f362c;
        if (typedArray.hasValue(69)) {
            this.f947e = Z0.i.w(getContext(), c0016l, 69);
        }
        if (typedArray.hasValue(70)) {
            this.f948f = M0.m.i(typedArray.getInt(70, -1), null);
        }
        if (typedArray.hasValue(66)) {
            b(c0016l.h(66));
            if (typedArray.hasValue(65) && checkableImageButton.getContentDescription() != (text = typedArray.getText(65))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(64, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(67, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f949g) {
            this.f949g = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(68)) {
            ImageView.ScaleType n2 = U.t.n(typedArray.getInt(68, -1));
            this.h = n2;
            checkableImageButton.setScaleType(n2);
        }
        c0224b0.setVisibility(8);
        c0224b0.setId(R.id.textinput_prefix_text);
        c0224b0.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        WeakHashMap weakHashMap = S.f311a;
        c0224b0.setAccessibilityLiveRegion(1);
        c0224b0.setTextAppearance(typedArray.getResourceId(60, 0));
        if (typedArray.hasValue(61)) {
            c0224b0.setTextColor(c0016l.g(61));
        }
        CharSequence text2 = typedArray.getText(59);
        this.f946c = TextUtils.isEmpty(text2) ? null : text2;
        c0224b0.setText(text2);
        e();
        addView(checkableImageButton);
        addView(c0224b0);
    }

    public final int a() {
        int i;
        CheckableImageButton checkableImageButton = this.d;
        if (checkableImageButton.getVisibility() == 0) {
            i = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            i = 0;
        }
        WeakHashMap weakHashMap = S.f311a;
        return this.f945b.getPaddingStart() + getPaddingStart() + i;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.d;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f947e;
            PorterDuff.Mode mode = this.f948f;
            TextInputLayout textInputLayout = this.f944a;
            U.t.h(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            U.t.V(textInputLayout, checkableImageButton, this.f947e);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.i;
        checkableImageButton.setOnClickListener(null);
        U.t.b0(checkableImageButton, onLongClickListener);
        this.i = null;
        checkableImageButton.setOnLongClickListener(null);
        U.t.b0(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void c(boolean z2) {
        CheckableImageButton checkableImageButton = this.d;
        if ((checkableImageButton.getVisibility() == 0) != z2) {
            checkableImageButton.setVisibility(z2 ? 0 : 8);
            d();
            e();
        }
    }

    public final void d() {
        int paddingStart;
        EditText editText = this.f944a.d;
        if (editText == null) {
            return;
        }
        if (this.d.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            WeakHashMap weakHashMap = S.f311a;
            paddingStart = editText.getPaddingStart();
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap weakHashMap2 = S.f311a;
        this.f945b.setPaddingRelative(paddingStart, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void e() {
        int i = (this.f946c == null || this.f950j) ? 8 : 0;
        setVisibility((this.d.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.f945b.setVisibility(i);
        this.f944a.q();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        d();
    }
}
