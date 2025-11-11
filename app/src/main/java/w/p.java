package w;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* loaded from: classes.dex */
public final class p extends View {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4136a;

    public p(Context context) {
        super(context);
        this.f4136a = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z2) {
        this.f4136a = z2;
    }

    public void setGuidelineBegin(int i) {
        C0367e c0367e = (C0367e) getLayoutParams();
        if (this.f4136a && c0367e.f3985a == i) {
            return;
        }
        c0367e.f3985a = i;
        setLayoutParams(c0367e);
    }

    public void setGuidelineEnd(int i) {
        C0367e c0367e = (C0367e) getLayoutParams();
        if (this.f4136a && c0367e.f3987b == i) {
            return;
        }
        c0367e.f3987b = i;
        setLayoutParams(c0367e);
    }

    public void setGuidelinePercent(float f2) {
        C0367e c0367e = (C0367e) getLayoutParams();
        if (this.f4136a && c0367e.f3988c == f2) {
            return;
        }
        c0367e.f3988c = f2;
        setLayoutParams(c0367e);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
