package l;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: l.C0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC0178C0 implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0180D0 f2937a;

    public ViewOnTouchListenerC0178C0(C0180D0 c0180d0) {
        this.f2937a = c0180d0;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C0179D c0179d;
        int action = motionEvent.getAction();
        int x2 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        C0180D0 c0180d0 = this.f2937a;
        if (action == 0 && (c0179d = c0180d0.f2960z) != null && c0179d.isShowing() && x2 >= 0 && x2 < c0180d0.f2960z.getWidth() && y2 >= 0 && y2 < c0180d0.f2960z.getHeight()) {
            c0180d0.f2956v.postDelayed(c0180d0.f2952r, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        c0180d0.f2956v.removeCallbacks(c0180d0.f2952r);
        return false;
    }
}
