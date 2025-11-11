package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.android.music.R;
import k.C0168b;

/* renamed from: l.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0239j extends C0175B implements InterfaceC0245m {
    public final /* synthetic */ C0243l d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0239j(C0243l c0243l, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.d = c0243l;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        c1.a(this, getContentDescription());
        setOnTouchListener(new C0168b(this, this));
    }

    @Override // l.InterfaceC0245m
    public final boolean b() {
        return false;
    }

    @Override // l.InterfaceC0245m
    public final boolean c() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.d.o();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            E.a.f(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
