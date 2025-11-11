package t0;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* renamed from: t0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0329b extends Animatable2.AnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ G0.a f3829a;

    public C0329b(G0.a aVar) {
        this.f3829a = aVar;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.f3829a.f159b.f174o;
        if (colorStateList != null) {
            E.a.h(drawable, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        G0.d dVar = this.f3829a.f159b;
        ColorStateList colorStateList = dVar.f174o;
        if (colorStateList != null) {
            E.a.g(drawable, colorStateList.getColorForState(dVar.f178s, colorStateList.getDefaultColor()));
        }
    }
}
