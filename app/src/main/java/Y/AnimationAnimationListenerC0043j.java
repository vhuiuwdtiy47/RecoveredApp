package Y;

import android.util.Log;
import android.view.View;
import android.view.animation.Animation;

/* renamed from: Y.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC0043j implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d0 f1119a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0044k f1120b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f1121c;
    public final /* synthetic */ C0039f d;

    public AnimationAnimationListenerC0043j(C0039f c0039f, C0044k c0044k, d0 d0Var, View view) {
        this.f1119a = d0Var;
        this.f1120b = c0044k;
        this.f1121c = view;
        this.d = c0039f;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        q1.d.e(animation, "animation");
        C0044k c0044k = this.f1120b;
        c0044k.f1122a.post(new U.k(c0044k, this.f1121c, this.d, 2));
        if (S.H(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f1119a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        q1.d.e(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        q1.d.e(animation, "animation");
        if (S.H(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f1119a + " has reached onAnimationStart.");
        }
    }
}
