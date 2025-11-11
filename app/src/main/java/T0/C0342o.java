package t0;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* renamed from: t0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0342o extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable.ConstantState f3881a;

    public C0342o(Drawable.ConstantState constantState) {
        this.f3881a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f3881a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f3881a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C0343p c0343p = new C0343p();
        c0343p.f3839a = (VectorDrawable) this.f3881a.newDrawable();
        return c0343p;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C0343p c0343p = new C0343p();
        c0343p.f3839a = (VectorDrawable) this.f3881a.newDrawable(resources);
        return c0343p;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C0343p c0343p = new C0343p();
        c0343p.f3839a = (VectorDrawable) this.f3881a.newDrawable(resources, theme);
        return c0343p;
    }
}
