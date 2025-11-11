package f1;

import U.t;
import Y.B;
import android.content.Intent;
import android.graphics.Point;
import android.hardware.display.VirtualDisplay;
import android.media.ImageReader;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;
import com.xiaomi.vlive.App;
import com.xiaomi.vlive.MediaProjectionForegroundService;
import com.xiaomi.vlive.ui.controller.ControllerFragment;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2379a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2380b;

    public /* synthetic */ d(int i, Object obj) {
        this.f2379a = i;
        this.f2380b = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
        View view;
        WindowManager windowManager;
        switch (this.f2379a) {
            case 0:
                ControllerFragment controllerFragment = (ControllerFragment) this.f2380b;
                if (!z2) {
                    d1.e eVar = App.f2120l;
                    if (eVar == null || (view = eVar.f2183b) == null || (windowManager = eVar.f2182a) == null) {
                        return;
                    }
                    windowManager.removeViewImmediate(view);
                    eVar.f2183b = null;
                    return;
                }
                if (Settings.canDrawOverlays(controllerFragment.f2137Y)) {
                    App.h();
                    controllerFragment.f2136X.f2121a.edit().putBoolean("FloatingTool", true).apply();
                    return;
                }
                controllerFragment.f2135W.f2212w.setOnCheckedChangeListener(null);
                controllerFragment.f2135W.f2212w.setChecked(false);
                controllerFragment.f2136X.f2121a.edit().putBoolean("FloatingTool", false).apply();
                controllerFragment.f2135W.f2212w.setOnCheckedChangeListener(controllerFragment.f2145h0);
                t.g("请开启悬浮窗权限");
                controllerFragment.f2160y0.a(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + controllerFragment.f2137Y.getPackageName())));
                return;
            case 1:
                ControllerFragment controllerFragment2 = (ControllerFragment) this.f2380b;
                if (z2) {
                    controllerFragment2.f2136X.f2121a.edit().putBoolean("PlayAutoRotate", true).apply();
                    t.i(Boolean.TRUE);
                    t.g("自动图像旋转已开启");
                    return;
                } else {
                    controllerFragment2.f2136X.f2121a.edit().putBoolean("PlayAutoRotate", false).apply();
                    t.i(Boolean.FALSE);
                    t.g("功能已关闭");
                    return;
                }
            case 2:
                ControllerFragment controllerFragment3 = (ControllerFragment) this.f2380b;
                if (z2) {
                    controllerFragment3.f2136X.g(true);
                    t.e(Boolean.TRUE);
                    t.g("循环播放");
                    return;
                } else {
                    controllerFragment3.f2136X.g(false);
                    t.e(Boolean.FALSE);
                    t.g("功能已关闭");
                    return;
                }
            case 3:
                ControllerFragment controllerFragment4 = (ControllerFragment) this.f2380b;
                if (z2) {
                    controllerFragment4.r0 = controllerFragment4.f2136X.f2121a.getInt("MonitorTargetX", 55);
                    controllerFragment4.f2155s0 = controllerFragment4.f2136X.f2121a.getInt("MonitorTargetY", 380);
                    controllerFragment4.f2137Y.startForegroundService(new Intent(controllerFragment4.f2137Y, (Class<?>) MediaProjectionForegroundService.class));
                    controllerFragment4.f2154q0 = controllerFragment4.H().getResources().getDisplayMetrics().densityDpi;
                    B b2 = controllerFragment4.f1198t;
                    Display defaultDisplay = (b2 != null ? b2.f958e : null).getWindowManager().getDefaultDisplay();
                    Point point = new Point();
                    defaultDisplay.getRealSize(point);
                    controllerFragment4.f2152o0 = point.x;
                    controllerFragment4.f2153p0 = point.y;
                    MediaProjectionManager mediaProjectionManager = (MediaProjectionManager) controllerFragment4.H().getSystemService("media_projection");
                    controllerFragment4.f2147j0 = mediaProjectionManager;
                    controllerFragment4.f2146i0.a(mediaProjectionManager.createScreenCaptureIntent());
                    t.g("三色注入已开启");
                    return;
                }
                VirtualDisplay virtualDisplay = controllerFragment4.f2149l0;
                if (virtualDisplay != null) {
                    virtualDisplay.release();
                    controllerFragment4.f2149l0 = null;
                }
                ImageReader imageReader = controllerFragment4.f2150m0;
                if (imageReader != null) {
                    imageReader.setOnImageAvailableListener(null, null);
                    controllerFragment4.f2150m0.close();
                    controllerFragment4.f2150m0 = null;
                }
                MediaProjection mediaProjection = controllerFragment4.f2148k0;
                if (mediaProjection != null) {
                    mediaProjection.stop();
                    controllerFragment4.f2148k0 = null;
                }
                Handler handler = controllerFragment4.f2151n0;
                if (handler != null) {
                    Looper looper = handler.getLooper();
                    controllerFragment4.f2151n0 = null;
                    if (looper != null) {
                        looper.quitSafely();
                    }
                }
                controllerFragment4.f2137Y.stopService(new Intent(controllerFragment4.f2137Y, (Class<?>) MediaProjectionForegroundService.class));
                t.Y(0);
                t.g("功能已关闭");
                return;
            default:
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = ((Chip) this.f2380b).i;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z2);
                    return;
                }
                return;
        }
    }
}
