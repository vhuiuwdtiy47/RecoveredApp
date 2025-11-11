package t0;

import C.r;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: t0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0333f extends AbstractC0334g implements Animatable {

    /* renamed from: c, reason: collision with root package name */
    public final Context f3836c;
    public A0.a d = null;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f3837e = null;

    /* renamed from: f, reason: collision with root package name */
    public final C0330c f3838f = new C0330c(this);

    /* renamed from: b, reason: collision with root package name */
    public final C0331d f3835b = new Drawable.ConstantState();

    /* JADX WARN: Type inference failed for: r2v1, types: [android.graphics.drawable.Drawable$ConstantState, t0.d] */
    public C0333f(Context context) {
        this.f3836c = context;
    }

    @Override // t0.AbstractC0334g, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f3839a;
        if (drawable != null) {
            E.a.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f3839a;
        if (drawable != null) {
            return E.a.b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f3839a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        C0331d c0331d = this.f3835b;
        c0331d.f3831a.draw(canvas);
        if (c0331d.f3832b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f3839a;
        return drawable != null ? drawable.getAlpha() : this.f3835b.f3831a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f3839a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f3835b.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f3839a;
        return drawable != null ? E.a.c(drawable) : this.f3835b.f3831a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f3839a != null) {
            return new C0332e(this.f3839a.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f3839a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f3835b.f3831a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f3839a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f3835b.f3831a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f3839a;
        return drawable != null ? drawable.getOpacity() : this.f3835b.f3831a.getOpacity();
    }

    /* JADX WARN: Type inference failed for: r7v8, types: [o.f, o.j] */
    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C0331d c0331d;
        Drawable drawable = this.f3839a;
        if (drawable != null) {
            E.a.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            c0331d = this.f3835b;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray f2 = C.b.f(resources, theme, attributeSet, AbstractC0328a.f3827e);
                    int resourceId = f2.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C0343p c0343p = new C0343p();
                        ThreadLocal threadLocal = r.f73a;
                        c0343p.f3839a = C.k.a(resources, resourceId, theme);
                        new C0342o(c0343p.f3839a.getConstantState());
                        c0343p.f3886f = false;
                        c0343p.setCallback(this.f3838f);
                        C0343p c0343p2 = c0331d.f3831a;
                        if (c0343p2 != null) {
                            c0343p2.setCallback(null);
                        }
                        c0331d.f3831a = c0343p;
                    }
                    f2.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, AbstractC0328a.f3828f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f3836c;
                        if (context != null) {
                            Animator loadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                            loadAnimator.setTarget(c0331d.f3831a.f3883b.f3873b.f3871o.get(string));
                            if (c0331d.f3833c == null) {
                                c0331d.f3833c = new ArrayList();
                                c0331d.d = new o.j(0);
                            }
                            c0331d.f3833c.add(loadAnimator);
                            c0331d.d.put(loadAnimator, string);
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (c0331d.f3832b == null) {
            c0331d.f3832b = new AnimatorSet();
        }
        c0331d.f3832b.playTogether(c0331d.f3833c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f3839a;
        return drawable != null ? drawable.isAutoMirrored() : this.f3835b.f3831a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f3839a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f3835b.f3832b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f3839a;
        return drawable != null ? drawable.isStateful() : this.f3835b.f3831a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f3839a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3839a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f3835b.f3831a.setBounds(rect);
        }
    }

    @Override // t0.AbstractC0334g, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f3839a;
        return drawable != null ? drawable.setLevel(i) : this.f3835b.f3831a.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f3839a;
        return drawable != null ? drawable.setState(iArr) : this.f3835b.f3831a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f3839a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f3835b.f3831a.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f3839a;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.f3835b.f3831a.setAutoMirrored(z2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3839a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f3835b.f3831a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f3839a;
        if (drawable != null) {
            Z0.i.j0(drawable, i);
        } else {
            this.f3835b.f3831a.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f3839a;
        if (drawable != null) {
            E.a.h(drawable, colorStateList);
        } else {
            this.f3835b.f3831a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3839a;
        if (drawable != null) {
            E.a.i(drawable, mode);
        } else {
            this.f3835b.f3831a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f3839a;
        if (drawable != null) {
            return drawable.setVisible(z2, z3);
        }
        this.f3835b.f3831a.setVisible(z2, z3);
        return super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f3839a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        C0331d c0331d = this.f3835b;
        if (c0331d.f3832b.isStarted()) {
            return;
        }
        c0331d.f3832b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f3839a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f3835b.f3832b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
