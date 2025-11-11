package W0;

import L.C0016l;
import L.S;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.android.music.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import l.C0224b0;

/* loaded from: classes.dex */
public final class p extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f878a;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f879b;

    /* renamed from: c, reason: collision with root package name */
    public final CheckableImageButton f880c;
    public ColorStateList d;

    /* renamed from: e, reason: collision with root package name */
    public PorterDuff.Mode f881e;

    /* renamed from: f, reason: collision with root package name */
    public View.OnLongClickListener f882f;

    /* renamed from: g, reason: collision with root package name */
    public final CheckableImageButton f883g;
    public final o h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashSet f884j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f885k;

    /* renamed from: l, reason: collision with root package name */
    public PorterDuff.Mode f886l;

    /* renamed from: m, reason: collision with root package name */
    public int f887m;

    /* renamed from: n, reason: collision with root package name */
    public ImageView.ScaleType f888n;

    /* renamed from: o, reason: collision with root package name */
    public View.OnLongClickListener f889o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f890p;

    /* renamed from: q, reason: collision with root package name */
    public final C0224b0 f891q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f892r;

    /* renamed from: s, reason: collision with root package name */
    public EditText f893s;

    /* renamed from: t, reason: collision with root package name */
    public final AccessibilityManager f894t;

    /* renamed from: u, reason: collision with root package name */
    public Q.b f895u;

    /* renamed from: v, reason: collision with root package name */
    public final l f896v;

    public p(TextInputLayout textInputLayout, C0016l c0016l) {
        super(textInputLayout.getContext());
        CharSequence text;
        int i = 0;
        this.i = 0;
        this.f884j = new LinkedHashSet();
        this.f896v = new l(this);
        m mVar = new m(this);
        this.f894t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f878a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f879b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton a2 = a(this, from, R.id.text_input_error_icon);
        this.f880c = a2;
        CheckableImageButton a3 = a(frameLayout, from, R.id.text_input_end_icon);
        this.f883g = a3;
        this.h = new o(this, c0016l);
        C0224b0 c0224b0 = new C0224b0(getContext(), null);
        this.f891q = c0224b0;
        TypedArray typedArray = (TypedArray) c0016l.f362c;
        if (typedArray.hasValue(38)) {
            this.d = Z0.i.w(getContext(), c0016l, 38);
        }
        if (typedArray.hasValue(39)) {
            this.f881e = M0.m.i(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            i(c0016l.h(37));
        }
        a2.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap weakHashMap = S.f311a;
        a2.setImportantForAccessibility(2);
        a2.setClickable(false);
        a2.setPressable(false);
        a2.setFocusable(false);
        if (!typedArray.hasValue(53)) {
            if (typedArray.hasValue(32)) {
                this.f885k = Z0.i.w(getContext(), c0016l, 32);
            }
            if (typedArray.hasValue(33)) {
                this.f886l = M0.m.i(typedArray.getInt(33, -1), null);
            }
        }
        if (typedArray.hasValue(30)) {
            g(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27) && a3.getContentDescription() != (text = typedArray.getText(27))) {
                a3.setContentDescription(text);
            }
            a3.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(53)) {
            if (typedArray.hasValue(54)) {
                this.f885k = Z0.i.w(getContext(), c0016l, 54);
            }
            if (typedArray.hasValue(55)) {
                this.f886l = M0.m.i(typedArray.getInt(55, -1), null);
            }
            g(typedArray.getBoolean(53, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(51);
            if (a3.getContentDescription() != text2) {
                a3.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f887m) {
            this.f887m = dimensionPixelSize;
            a3.setMinimumWidth(dimensionPixelSize);
            a3.setMinimumHeight(dimensionPixelSize);
            a2.setMinimumWidth(dimensionPixelSize);
            a2.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType n2 = U.t.n(typedArray.getInt(31, -1));
            this.f888n = n2;
            a3.setScaleType(n2);
            a2.setScaleType(n2);
        }
        c0224b0.setVisibility(8);
        c0224b0.setId(R.id.textinput_suffix_text);
        c0224b0.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        c0224b0.setAccessibilityLiveRegion(1);
        c0224b0.setTextAppearance(typedArray.getResourceId(72, 0));
        if (typedArray.hasValue(73)) {
            c0224b0.setTextColor(c0016l.g(73));
        }
        CharSequence text3 = typedArray.getText(71);
        this.f890p = TextUtils.isEmpty(text3) ? null : text3;
        c0224b0.setText(text3);
        n();
        frameLayout.addView(a3);
        addView(c0224b0);
        addView(frameLayout);
        addView(a2);
        textInputLayout.f2026e0.add(mVar);
        if (textInputLayout.d != null) {
            mVar.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new n(i, this));
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (Z0.i.J(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final q b() {
        q fVar;
        int i = this.i;
        o oVar = this.h;
        SparseArray sparseArray = oVar.f875a;
        q qVar = (q) sparseArray.get(i);
        if (qVar != null) {
            return qVar;
        }
        p pVar = oVar.f876b;
        if (i == -1) {
            fVar = new f(pVar, 0);
        } else if (i == 0) {
            fVar = new f(pVar, 1);
        } else if (i == 1) {
            fVar = new x(pVar, oVar.d);
        } else if (i == 2) {
            fVar = new e(pVar);
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(D.f.b("Invalid end icon mode: ", i));
            }
            fVar = new k(pVar);
        }
        sparseArray.append(i, fVar);
        return fVar;
    }

    public final int c() {
        int marginStart;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.f883g;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        WeakHashMap weakHashMap = S.f311a;
        return this.f891q.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        return this.f879b.getVisibility() == 0 && this.f883g.getVisibility() == 0;
    }

    public final boolean e() {
        return this.f880c.getVisibility() == 0;
    }

    public final void f(boolean z2) {
        boolean z3;
        boolean isActivated;
        boolean z4;
        q b2 = b();
        boolean k2 = b2.k();
        CheckableImageButton checkableImageButton = this.f883g;
        boolean z5 = true;
        if (!k2 || (z4 = checkableImageButton.d) == b2.l()) {
            z3 = false;
        } else {
            checkableImageButton.setChecked(!z4);
            z3 = true;
        }
        if (!(b2 instanceof k) || (isActivated = checkableImageButton.isActivated()) == b2.j()) {
            z5 = z3;
        } else {
            checkableImageButton.setActivated(!isActivated);
        }
        if (z2 || z5) {
            U.t.V(this.f878a, checkableImageButton, this.f885k);
        }
    }

    public final void g(int i) {
        if (this.i == i) {
            return;
        }
        q b2 = b();
        Q.b bVar = this.f895u;
        AccessibilityManager accessibilityManager = this.f894t;
        if (bVar != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(new M.b(bVar));
        }
        this.f895u = null;
        b2.s();
        this.i = i;
        Iterator it = this.f884j.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        h(i != 0);
        q b3 = b();
        int i2 = this.h.f877c;
        if (i2 == 0) {
            i2 = b3.d();
        }
        Drawable u2 = i2 != 0 ? U.t.u(getContext(), i2) : null;
        CheckableImageButton checkableImageButton = this.f883g;
        checkableImageButton.setImageDrawable(u2);
        TextInputLayout textInputLayout = this.f878a;
        if (u2 != null) {
            U.t.h(textInputLayout, checkableImageButton, this.f885k, this.f886l);
            U.t.V(textInputLayout, checkableImageButton, this.f885k);
        }
        int c2 = b3.c();
        CharSequence text = c2 != 0 ? getResources().getText(c2) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(b3.k());
        if (!b3.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        b3.r();
        Q.b h = b3.h();
        this.f895u = h;
        if (h != null && accessibilityManager != null) {
            WeakHashMap weakHashMap = S.f311a;
            if (isAttachedToWindow()) {
                accessibilityManager.addTouchExplorationStateChangeListener(new M.b(this.f895u));
            }
        }
        View.OnClickListener f2 = b3.f();
        View.OnLongClickListener onLongClickListener = this.f889o;
        checkableImageButton.setOnClickListener(f2);
        U.t.b0(checkableImageButton, onLongClickListener);
        EditText editText = this.f893s;
        if (editText != null) {
            b3.m(editText);
            j(b3);
        }
        U.t.h(textInputLayout, checkableImageButton, this.f885k, this.f886l);
        f(true);
    }

    public final void h(boolean z2) {
        if (d() != z2) {
            this.f883g.setVisibility(z2 ? 0 : 8);
            k();
            m();
            this.f878a.q();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f880c;
        checkableImageButton.setImageDrawable(drawable);
        l();
        U.t.h(this.f878a, checkableImageButton, this.d, this.f881e);
    }

    public final void j(q qVar) {
        if (this.f893s == null) {
            return;
        }
        if (qVar.e() != null) {
            this.f893s.setOnFocusChangeListener(qVar.e());
        }
        if (qVar.g() != null) {
            this.f883g.setOnFocusChangeListener(qVar.g());
        }
    }

    public final void k() {
        this.f879b.setVisibility((this.f883g.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || !((this.f890p == null || this.f892r) ? 8 : false)) ? 0 : 8);
    }

    public final void l() {
        CheckableImageButton checkableImageButton = this.f880c;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f878a;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.f2033j.f920q && textInputLayout.m()) ? 0 : 8);
        k();
        m();
        if (this.i != 0) {
            return;
        }
        textInputLayout.q();
    }

    public final void m() {
        int i;
        TextInputLayout textInputLayout = this.f878a;
        if (textInputLayout.d == null) {
            return;
        }
        if (d() || e()) {
            i = 0;
        } else {
            EditText editText = textInputLayout.d;
            WeakHashMap weakHashMap = S.f311a;
            i = editText.getPaddingEnd();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.d.getPaddingTop();
        int paddingBottom = textInputLayout.d.getPaddingBottom();
        WeakHashMap weakHashMap2 = S.f311a;
        this.f891q.setPaddingRelative(dimensionPixelSize, paddingTop, i, paddingBottom);
    }

    public final void n() {
        C0224b0 c0224b0 = this.f891q;
        int visibility = c0224b0.getVisibility();
        int i = (this.f890p == null || this.f892r) ? 8 : 0;
        if (visibility != i) {
            b().p(i == 0);
        }
        k();
        c0224b0.setVisibility(i);
        this.f878a.q();
    }
}
