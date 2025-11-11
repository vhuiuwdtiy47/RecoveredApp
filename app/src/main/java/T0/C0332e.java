package t0;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: t0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0332e extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable.ConstantState f3834a;

    public C0332e(Drawable.ConstantState constantState) {
        this.f3834a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f3834a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f3834a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C0333f c0333f = new C0333f(null);
        Drawable newDrawable = this.f3834a.newDrawable();
        c0333f.f3839a = newDrawable;
        newDrawable.setCallback(c0333f.f3838f);
        return c0333f;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C0333f c0333f = new C0333f(null);
        Drawable newDrawable = this.f3834a.newDrawable(resources);
        c0333f.f3839a = newDrawable;
        newDrawable.setCallback(c0333f.f3838f);
        return c0333f;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C0333f c0333f = new C0333f(null);
        Drawable newDrawable = this.f3834a.newDrawable(resources, theme);
        c0333f.f3839a = newDrawable;
        newDrawable.setCallback(c0333f.f3838f);
        return c0333f;
    }
}
