package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f2094a;

    public b(ClockFaceView clockFaceView) {
        this.f2094a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f2094a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f2074t.d) - clockFaceView.f2068B;
        if (height != clockFaceView.f2096r) {
            clockFaceView.f2096r = height;
            clockFaceView.m();
            int i = clockFaceView.f2096r;
            ClockHandView clockHandView = clockFaceView.f2074t;
            clockHandView.f2089l = i;
            clockHandView.invalidate();
        }
        return true;
    }
}
