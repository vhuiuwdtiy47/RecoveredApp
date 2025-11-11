package t0;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;

/* renamed from: t0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0331d extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public C0343p f3831a;

    /* renamed from: b, reason: collision with root package name */
    public AnimatorSet f3832b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f3833c;
    public o.f d;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }
}
