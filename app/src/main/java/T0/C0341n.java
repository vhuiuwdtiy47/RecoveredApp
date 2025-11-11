package t0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* renamed from: t0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0341n extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public int f3872a;

    /* renamed from: b, reason: collision with root package name */
    public C0340m f3873b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f3874c;
    public PorterDuff.Mode d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3875e;

    /* renamed from: f, reason: collision with root package name */
    public Bitmap f3876f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f3877g;
    public PorterDuff.Mode h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3878j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3879k;

    /* renamed from: l, reason: collision with root package name */
    public Paint f3880l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f3872a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C0343p(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C0343p(this);
    }
}
