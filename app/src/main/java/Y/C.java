package Y;

import L.ViewTreeObserverOnPreDrawListenerC0024u;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* loaded from: classes.dex */
public final class C extends AnimationSet implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f961a;

    /* renamed from: b, reason: collision with root package name */
    public final View f962b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f963c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f964e;

    public C(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f964e = true;
        this.f961a = viewGroup;
        this.f962b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j2, Transformation transformation) {
        this.f964e = true;
        if (this.f963c) {
            return !this.d;
        }
        if (!super.getTransformation(j2, transformation)) {
            this.f963c = true;
            ViewTreeObserverOnPreDrawListenerC0024u.a(this.f961a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2 = this.f963c;
        ViewGroup viewGroup = this.f961a;
        if (z2 || !this.f964e) {
            viewGroup.endViewTransition(this.f962b);
            this.d = true;
        } else {
            this.f964e = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j2, Transformation transformation, float f2) {
        this.f964e = true;
        if (this.f963c) {
            return !this.d;
        }
        if (!super.getTransformation(j2, transformation, f2)) {
            this.f963c = true;
            ViewTreeObserverOnPreDrawListenerC0024u.a(this.f961a, this);
        }
        return true;
    }
}
