package com.google.android.material.timepicker;

import L.C0006b;
import M.j;
import M.k;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.android.music.R;

/* loaded from: classes.dex */
public final class c extends C0006b {
    public final /* synthetic */ ClockFaceView d;

    public c(ClockFaceView clockFaceView) {
        this.d = clockFaceView;
    }

    @Override // L.C0006b
    public final void d(View view, k kVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f319a;
        AccessibilityNodeInfo accessibilityNodeInfo = kVar.f417a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (intValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((View) this.d.f2078x.get(intValue - 1));
        }
        kVar.h(j.a(view.isSelected(), 0, 1, intValue, 1));
        accessibilityNodeInfo.setClickable(true);
        kVar.b(M.f.f407e);
    }

    @Override // L.C0006b
    public final boolean g(View view, int i, Bundle bundle) {
        if (i != 16) {
            return super.g(view, i, bundle);
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        ClockFaceView clockFaceView = this.d;
        view.getHitRect(clockFaceView.f2075u);
        float centerX = clockFaceView.f2075u.centerX();
        float centerY = clockFaceView.f2075u.centerY();
        clockFaceView.f2074t.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
        clockFaceView.f2074t.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
        return true;
    }
}
