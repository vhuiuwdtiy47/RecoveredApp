package A0;

import L.Z;
import W0.k;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.tencent.wechat.Platform;
import java.util.ArrayList;
import s0.l;
import t0.C0333f;

/* loaded from: classes.dex */
public final class a extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28b;

    public /* synthetic */ a(int i, Object obj) {
        this.f27a = i;
        this.f28b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f27a) {
            case 1:
                ((Z) this.f28b).b();
                return;
            case 2:
            default:
                super.onAnimationCancel(animator);
                return;
            case 3:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f28b;
                actionBarOverlayLayout.f1391w = null;
                actionBarOverlayLayout.f1378j = false;
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27a) {
            case 0:
                ((HideBottomViewOnScrollBehavior) this.f28b).h = null;
                return;
            case 1:
                ((Z) this.f28b).a();
                return;
            case 2:
                k kVar = (k) this.f28b;
                kVar.q();
                kVar.f870r.start();
                return;
            case 3:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f28b;
                actionBarOverlayLayout.f1391w = null;
                actionBarOverlayLayout.f1378j = false;
                return;
            case Platform.INFO /* 4 */:
                ((l) this.f28b).m();
                animator.removeListener(this);
                return;
            default:
                C0333f c0333f = (C0333f) this.f28b;
                ArrayList arrayList = new ArrayList(c0333f.f3837e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ColorStateList colorStateList = ((G0.a) arrayList.get(i)).f159b.f174o;
                    if (colorStateList != null) {
                        E.a.h(c0333f, colorStateList);
                    }
                }
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f27a) {
            case 1:
                ((Z) this.f28b).c();
                return;
            case Platform.WARN /* 5 */:
                C0333f c0333f = (C0333f) this.f28b;
                ArrayList arrayList = new ArrayList(c0333f.f3837e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    G0.d dVar = ((G0.a) arrayList.get(i)).f159b;
                    ColorStateList colorStateList = dVar.f174o;
                    if (colorStateList != null) {
                        E.a.g(c0333f, colorStateList.getColorForState(dVar.f178s, colorStateList.getDefaultColor()));
                    }
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public a(Z z2, View view) {
        this.f27a = 1;
        this.f28b = z2;
    }
}
