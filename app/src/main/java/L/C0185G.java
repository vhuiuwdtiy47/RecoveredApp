package l;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.android.music.R;

/* renamed from: l.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0185G extends RatingBar {

    /* renamed from: a, reason: collision with root package name */
    public final C0181E f2967a;

    public C0185G(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        AbstractC0204P0.a(this, getContext());
        C0181E c0181e = new C0181E(this);
        this.f2967a = c0181e;
        c0181e.e(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = (Bitmap) this.f2967a.f2963c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
