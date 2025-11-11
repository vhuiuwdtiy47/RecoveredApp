package l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.android.music.R;

/* renamed from: l.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0189I extends SeekBar {

    /* renamed from: a, reason: collision with root package name */
    public final C0191J f2972a;

    public C0189I(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        AbstractC0204P0.a(this, getContext());
        C0191J c0191j = new C0191J(this);
        this.f2972a = c0191j;
        c0191j.e(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0191J c0191j = this.f2972a;
        Drawable drawable = c0191j.f2975f;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        C0189I c0189i = c0191j.f2974e;
        if (drawable.setState(c0189i.getDrawableState())) {
            c0189i.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2972a.f2975f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f2972a.j(canvas);
    }
}
