package W0;

import L.S;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.music.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l.C0224b0;
import x0.AbstractC0375a;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f905A;

    /* renamed from: B, reason: collision with root package name */
    public Typeface f906B;

    /* renamed from: a, reason: collision with root package name */
    public final int f907a;

    /* renamed from: b, reason: collision with root package name */
    public final int f908b;

    /* renamed from: c, reason: collision with root package name */
    public final int f909c;
    public final TimeInterpolator d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f910e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f911f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f912g;
    public final TextInputLayout h;
    public LinearLayout i;

    /* renamed from: j, reason: collision with root package name */
    public int f913j;

    /* renamed from: k, reason: collision with root package name */
    public FrameLayout f914k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f915l;

    /* renamed from: m, reason: collision with root package name */
    public final float f916m;

    /* renamed from: n, reason: collision with root package name */
    public int f917n;

    /* renamed from: o, reason: collision with root package name */
    public int f918o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f919p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f920q;

    /* renamed from: r, reason: collision with root package name */
    public C0224b0 f921r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f922s;

    /* renamed from: t, reason: collision with root package name */
    public int f923t;

    /* renamed from: u, reason: collision with root package name */
    public int f924u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f925v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f926w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f927x;

    /* renamed from: y, reason: collision with root package name */
    public C0224b0 f928y;

    /* renamed from: z, reason: collision with root package name */
    public int f929z;

    public t(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f912g = context;
        this.h = textInputLayout;
        this.f916m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f907a = Z0.i.b0(context, R.attr.motionDurationShort4, 217);
        this.f908b = Z0.i.b0(context, R.attr.motionDurationMedium4, 167);
        this.f909c = Z0.i.b0(context, R.attr.motionDurationShort4, 167);
        this.d = Z0.i.c0(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, AbstractC0375a.d);
        LinearInterpolator linearInterpolator = AbstractC0375a.f4189a;
        this.f910e = Z0.i.c0(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f911f = Z0.i.c0(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(C0224b0 c0224b0, int i) {
        if (this.i == null && this.f914k == null) {
            Context context = this.f912g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.i;
            TextInputLayout textInputLayout = this.h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f914k = new FrameLayout(context);
            this.i.addView(this.f914k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i == 0 || i == 1) {
            this.f914k.setVisibility(0);
            this.f914k.addView(c0224b0);
        } else {
            this.i.addView(c0224b0, new LinearLayout.LayoutParams(-2, -2));
        }
        this.i.setVisibility(0);
        this.f913j++;
    }

    public final void b() {
        if (this.i != null) {
            TextInputLayout textInputLayout = this.h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f912g;
                boolean J2 = Z0.i.J(context);
                LinearLayout linearLayout = this.i;
                WeakHashMap weakHashMap = S.f311a;
                int paddingStart = editText.getPaddingStart();
                if (J2) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (J2) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (J2) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.f915l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z2, C0224b0 c0224b0, int i, int i2, int i3) {
        if (c0224b0 == null || !z2) {
            return;
        }
        if (i == i3 || i == i2) {
            boolean z3 = i3 == i;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c0224b0, (Property<C0224b0, Float>) View.ALPHA, z3 ? 1.0f : 0.0f);
            int i4 = this.f909c;
            ofFloat.setDuration(z3 ? this.f908b : i4);
            ofFloat.setInterpolator(z3 ? this.f910e : this.f911f);
            if (i == i3 && i2 != 0) {
                ofFloat.setStartDelay(i4);
            }
            arrayList.add(ofFloat);
            if (i3 != i || i2 == 0) {
                return;
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c0224b0, (Property<C0224b0, Float>) View.TRANSLATION_Y, -this.f916m, 0.0f);
            ofFloat2.setDuration(this.f907a);
            ofFloat2.setInterpolator(this.d);
            ofFloat2.setStartDelay(i4);
            arrayList.add(ofFloat2);
        }
    }

    public final TextView e(int i) {
        if (i == 1) {
            return this.f921r;
        }
        if (i != 2) {
            return null;
        }
        return this.f928y;
    }

    public final void f() {
        this.f919p = null;
        c();
        if (this.f917n == 1) {
            if (!this.f927x || TextUtils.isEmpty(this.f926w)) {
                this.f918o = 0;
            } else {
                this.f918o = 2;
            }
        }
        i(this.f917n, this.f918o, h(this.f921r, ""));
    }

    public final void g(C0224b0 c0224b0, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.i;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.f914k) != null) {
            frameLayout.removeView(c0224b0);
        } else {
            linearLayout.removeView(c0224b0);
        }
        int i2 = this.f913j - 1;
        this.f913j = i2;
        LinearLayout linearLayout2 = this.i;
        if (i2 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(C0224b0 c0224b0, CharSequence charSequence) {
        WeakHashMap weakHashMap = S.f311a;
        TextInputLayout textInputLayout = this.h;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            return (this.f918o == this.f917n && c0224b0 != null && TextUtils.equals(c0224b0.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    public final void i(int i, int i2, boolean z2) {
        TextView e2;
        TextView e3;
        t tVar = this;
        if (i == i2) {
            return;
        }
        if (z2) {
            AnimatorSet animatorSet = new AnimatorSet();
            tVar.f915l = animatorSet;
            ArrayList arrayList = new ArrayList();
            tVar.d(arrayList, tVar.f927x, tVar.f928y, 2, i, i2);
            tVar.d(arrayList, tVar.f920q, tVar.f921r, 1, i, i2);
            int size = arrayList.size();
            long j2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Animator animator = (Animator) arrayList.get(i3);
                j2 = Math.max(j2, animator.getDuration() + animator.getStartDelay());
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
            ofInt.setDuration(j2);
            arrayList.add(0, ofInt);
            animatorSet.playTogether(arrayList);
            r rVar = new r(this, i2, e(i), i, tVar.e(i2));
            tVar = this;
            animatorSet.addListener(rVar);
            animatorSet.start();
        } else if (i != i2) {
            if (i2 != 0 && (e3 = tVar.e(i2)) != null) {
                e3.setVisibility(0);
                e3.setAlpha(1.0f);
            }
            if (i != 0 && (e2 = e(i)) != null) {
                e2.setVisibility(4);
                if (i == 1) {
                    e2.setText((CharSequence) null);
                }
            }
            tVar.f917n = i2;
        }
        TextInputLayout textInputLayout = tVar.h;
        textInputLayout.r();
        textInputLayout.u(z2, false);
        textInputLayout.x();
    }
}
