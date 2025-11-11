package f1;

import U.t;
import android.content.Intent;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.HandlerThread;
import android.provider.Settings;
import android.widget.Toast;
import c.C0102a;
import c.InterfaceC0103b;
import com.xiaomi.vlive.App;
import com.xiaomi.vlive.ui.controller.ControllerFragment;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements InterfaceC0103b {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2373f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ControllerFragment f2374g;

    public /* synthetic */ a(ControllerFragment controllerFragment, int i) {
        this.f2373f = i;
        this.f2374g = controllerFragment;
    }

    @Override // c.InterfaceC0103b
    public final void b(Object obj) {
        Intent intent;
        Intent intent2;
        switch (this.f2373f) {
            case 0:
                ControllerFragment controllerFragment = this.f2374g;
                if (!Settings.canDrawOverlays(controllerFragment.H())) {
                    t.g("悬浮窗权限未授权");
                    return;
                }
                App.h();
                controllerFragment.f2135W.f2212w.setChecked(true);
                controllerFragment.f2136X.f2121a.edit().putBoolean("FloatingTool", true).apply();
                return;
            case 1:
                C0102a c0102a = (C0102a) obj;
                ControllerFragment controllerFragment2 = this.f2374g;
                if (c0102a.f1725a != -1 || (intent = c0102a.f1726b) == null) {
                    return;
                }
                String str = null;
                try {
                    InputStream openInputStream = controllerFragment2.f2137Y.getContentResolver().openInputStream(intent.getData());
                    if (openInputStream != null) {
                        File file = new File(controllerFragment2.f2137Y.getCacheDir(), "play.mp4");
                        if (!file.exists() || file.delete()) {
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            byte[] bArr = new byte[8192];
                            while (true) {
                                int read = openInputStream.read(bArr);
                                if (read != -1) {
                                    fileOutputStream.write(bArr, 0, read);
                                } else {
                                    openInputStream.close();
                                    fileOutputStream.close();
                                    str = file.getAbsolutePath();
                                }
                            }
                        }
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                if (str == null) {
                    t.f(1, App.f2119k.getApplicationContext(), "保存文件失败");
                    return;
                }
                controllerFragment2.f2135W.f2200k.setText(!str.isEmpty() ? "已设置MP4视频文件" : str);
                controllerFragment2.f2136X.f2121a.edit().putInt("PlayFileType", 1).apply();
                controllerFragment2.f2136X.f2121a.edit().putString("PlayFileMp4", str).apply();
                if (t.a0(str, 1).booleanValue()) {
                    t.g("播放文件更换成功");
                    return;
                } else {
                    t.g("文件设置成功未播放");
                    return;
                }
            case 2:
                C0102a c0102a2 = (C0102a) obj;
                final ControllerFragment controllerFragment3 = this.f2374g;
                int i = c0102a2.f1725a;
                if (i != -1 || (intent2 = c0102a2.f1726b) == null) {
                    Toast.makeText(controllerFragment3.H(), "你已拒绝授权，无法使用三色功能", 1).show();
                    return;
                }
                controllerFragment3.f2148k0 = controllerFragment3.f2147j0.getMediaProjection(i, intent2);
                HandlerThread handlerThread = new HandlerThread("ScreenCaptureThread");
                handlerThread.start();
                controllerFragment3.f2151n0 = new Handler(handlerThread.getLooper());
                ImageReader newInstance = ImageReader.newInstance(controllerFragment3.f2152o0, controllerFragment3.f2153p0, 1, 2);
                controllerFragment3.f2150m0 = newInstance;
                controllerFragment3.f2149l0 = controllerFragment3.f2148k0.createVirtualDisplay("ScreenCapture", controllerFragment3.f2152o0, controllerFragment3.f2153p0, controllerFragment3.f2154q0, 16, newInstance.getSurface(), null, controllerFragment3.f2151n0);
                controllerFragment3.f2150m0.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: f1.e
                    @Override // android.media.ImageReader.OnImageAvailableListener
                    public final void onImageAvailable(ImageReader imageReader) {
                        int L2;
                        ControllerFragment controllerFragment4 = ControllerFragment.this;
                        Image image = null;
                        try {
                            try {
                                image = imageReader.acquireLatestImage();
                                if (image != null && controllerFragment4.f2156t0 != (L2 = ControllerFragment.L(image, controllerFragment4.r0, controllerFragment4.f2155s0)) && t.Y(L2).booleanValue()) {
                                    controllerFragment4.f2156t0 = L2;
                                }
                                if (image != null) {
                                    image.close();
                                }
                            } catch (Exception e3) {
                                e3.toString();
                                if (image != null) {
                                    image.close();
                                }
                            }
                        } catch (Throwable th) {
                            if (image != null) {
                                image.close();
                            }
                            throw th;
                        }
                    }
                }, controllerFragment3.f2151n0);
                return;
            default:
                ControllerFragment controllerFragment4 = this.f2374g;
                controllerFragment4.getClass();
                if (((Boolean) obj).booleanValue()) {
                    controllerFragment4.M();
                    return;
                } else {
                    t.g("相机权限被拒绝，无法打开预览");
                    return;
                }
        }
    }
}
