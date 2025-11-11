package l;

import android.view.View;
import android.view.ViewConfiguration;
import k.InterfaceC0166C;

/* renamed from: l.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC0260t0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final float f3148a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3149b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3150c;
    public final View d;

    /* renamed from: e, reason: collision with root package name */
    public RunnableC0258s0 f3151e;

    /* renamed from: f, reason: collision with root package name */
    public RunnableC0258s0 f3152f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3153g;
    public int h;
    public final int[] i = new int[2];

    public AbstractViewOnTouchListenerC0260t0(View view) {
        this.d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f3148a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f3149b = tapTimeout;
        this.f3150c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        RunnableC0258s0 runnableC0258s0 = this.f3152f;
        View view = this.d;
        if (runnableC0258s0 != null) {
            view.removeCallbacks(runnableC0258s0);
        }
        RunnableC0258s0 runnableC0258s02 = this.f3151e;
        if (runnableC0258s02 != null) {
            view.removeCallbacks(runnableC0258s02);
        }
    }

    public abstract InterfaceC0166C b();

    public abstract boolean c();

    public boolean d() {
        InterfaceC0166C b2 = b();
        if (b2 == null || !b2.a()) {
            return true;
        }
        b2.dismiss();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if (r14 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007b, code lost:
    
        if (r4 != 3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0100  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractViewOnTouchListenerC0260t0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f3153g = false;
        this.h = -1;
        RunnableC0258s0 runnableC0258s0 = this.f3151e;
        if (runnableC0258s0 != null) {
            this.d.removeCallbacks(runnableC0258s0);
        }
    }
}
