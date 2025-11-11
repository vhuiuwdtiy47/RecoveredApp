package Y;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: Y.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0042i extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0044k f1115a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f1116b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f1117c;
    public final /* synthetic */ d0 d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0039f f1118e;

    public C0042i(C0044k c0044k, View view, boolean z2, d0 d0Var, C0039f c0039f) {
        this.f1115a = c0044k;
        this.f1116b = view;
        this.f1117c = z2;
        this.d = d0Var;
        this.f1118e = c0039f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        q1.d.e(animator, "anim");
        ViewGroup viewGroup = this.f1115a.f1122a;
        View view = this.f1116b;
        viewGroup.endViewTransition(view);
        d0 d0Var = this.d;
        if (this.f1117c) {
            int i = d0Var.f1101a;
            q1.d.d(view, "viewToAnimate");
            D.f.a(view, i);
        }
        this.f1118e.d();
        if (S.H(2)) {
            Log.v("FragmentManager", "Animator from operation " + d0Var + " has ended.");
        }
    }
}
