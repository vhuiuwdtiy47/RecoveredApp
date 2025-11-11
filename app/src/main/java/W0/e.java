package W0;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.android.music.R;
import com.google.android.material.internal.CheckableImageButton;
import x0.AbstractC0375a;

/* loaded from: classes.dex */
public final class e extends q {

    /* renamed from: e, reason: collision with root package name */
    public final int f846e;

    /* renamed from: f, reason: collision with root package name */
    public final int f847f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f848g;
    public final TimeInterpolator h;
    public EditText i;

    /* renamed from: j, reason: collision with root package name */
    public final ViewOnClickListenerC0031a f849j;

    /* renamed from: k, reason: collision with root package name */
    public final ViewOnFocusChangeListenerC0032b f850k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f851l;

    /* renamed from: m, reason: collision with root package name */
    public ValueAnimator f852m;

    public e(p pVar) {
        super(pVar);
        this.f849j = new ViewOnClickListenerC0031a(0, this);
        this.f850k = new ViewOnFocusChangeListenerC0032b(this, 0);
        this.f846e = Z0.i.b0(pVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f847f = Z0.i.b0(pVar.getContext(), R.attr.motionDurationShort3, 150);
        this.f848g = Z0.i.c0(pVar.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0375a.f4189a);
        this.h = Z0.i.c0(pVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0375a.d);
    }

    @Override // W0.q
    public final void a() {
        if (this.f898b.f890p != null) {
            return;
        }
        t(u());
    }

    @Override // W0.q
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // W0.q
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // W0.q
    public final View.OnFocusChangeListener e() {
        return this.f850k;
    }

    @Override // W0.q
    public final View.OnClickListener f() {
        return this.f849j;
    }

    @Override // W0.q
    public final View.OnFocusChangeListener g() {
        return this.f850k;
    }

    @Override // W0.q
    public final void m(EditText editText) {
        this.i = editText;
        this.f897a.setEndIconVisible(u());
    }

    @Override // W0.q
    public final void p(boolean z2) {
        if (this.f898b.f890p == null) {
            return;
        }
        t(z2);
    }

    @Override // W0.q
    public final void r() {
        final int i = 1;
        final int i2 = 0;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.h);
        ofFloat.setDuration(this.f847f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: W0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f843b;

            {
                this.f843b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i3 = i;
                e eVar = this.f843b;
                eVar.getClass();
                switch (i3) {
                    case 0:
                        eVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = eVar.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f848g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i3 = this.f846e;
        ofFloat2.setDuration(i3);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: W0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f843b;

            {
                this.f843b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i32 = i2;
                e eVar = this.f843b;
                eVar.getClass();
                switch (i32) {
                    case 0:
                        eVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = eVar.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f851l = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f851l.addListener(new d(this, i2));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i3);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: W0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f843b;

            {
                this.f843b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i32 = i2;
                e eVar = this.f843b;
                eVar.getClass();
                switch (i32) {
                    case 0:
                        eVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = eVar.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                }
            }
        });
        this.f852m = ofFloat3;
        ofFloat3.addListener(new d(this, i));
    }

    @Override // W0.q
    public final void s() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new F0.b(4, this));
        }
    }

    public final void t(boolean z2) {
        boolean z3 = this.f898b.d() == z2;
        if (z2 && !this.f851l.isRunning()) {
            this.f852m.cancel();
            this.f851l.start();
            if (z3) {
                this.f851l.end();
                return;
            }
            return;
        }
        if (z2) {
            return;
        }
        this.f851l.cancel();
        this.f852m.start();
        if (z3) {
            this.f852m.end();
        }
    }

    public final boolean u() {
        EditText editText = this.i;
        if (editText != null) {
            return (editText.hasFocus() || this.d.hasFocus()) && this.i.getText().length() > 0;
        }
        return false;
    }
}
