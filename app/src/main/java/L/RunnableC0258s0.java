package l;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* renamed from: l.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0258s0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3141a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractViewOnTouchListenerC0260t0 f3142b;

    public /* synthetic */ RunnableC0258s0(AbstractViewOnTouchListenerC0260t0 abstractViewOnTouchListenerC0260t0, int i) {
        this.f3141a = i;
        this.f3142b = abstractViewOnTouchListenerC0260t0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3141a) {
            case 0:
                ViewParent parent = this.f3142b.d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            default:
                AbstractViewOnTouchListenerC0260t0 abstractViewOnTouchListenerC0260t0 = this.f3142b;
                abstractViewOnTouchListenerC0260t0.a();
                View view = abstractViewOnTouchListenerC0260t0.d;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC0260t0.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    abstractViewOnTouchListenerC0260t0.f3153g = true;
                    return;
                }
                return;
        }
    }
}
