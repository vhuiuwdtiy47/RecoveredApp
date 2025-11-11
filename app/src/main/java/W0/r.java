package W0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import l.C0224b0;

/* loaded from: classes.dex */
public final class r extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f900a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f901b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f902c;
    public final /* synthetic */ TextView d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f903e;

    public r(t tVar, int i, TextView textView, int i2, TextView textView2) {
        this.f903e = tVar;
        this.f900a = i;
        this.f901b = textView;
        this.f902c = i2;
        this.d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C0224b0 c0224b0;
        int i = this.f900a;
        t tVar = this.f903e;
        tVar.f917n = i;
        tVar.f915l = null;
        TextView textView = this.f901b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f902c == 1 && (c0224b0 = tVar.f921r) != null) {
                c0224b0.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
