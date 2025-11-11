package f1;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import com.xiaomi.vlive.ui.controller.ControllerFragment;
import java.util.Collections;

/* loaded from: classes.dex */
public final class j extends CameraDevice.StateCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ControllerFragment f2390a;

    public j(ControllerFragment controllerFragment) {
        this.f2390a = controllerFragment;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        cameraDevice.close();
        this.f2390a.b0 = null;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        cameraDevice.close();
        this.f2390a.b0 = null;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        ControllerFragment controllerFragment = this.f2390a;
        controllerFragment.b0 = cameraDevice;
        try {
            SurfaceTexture surfaceTexture = controllerFragment.f2135W.d.getSurfaceTexture();
            surfaceTexture.setDefaultBufferSize(640, 480);
            Surface surface = new Surface(surfaceTexture);
            CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(1);
            createCaptureRequest.addTarget(surface);
            cameraDevice.createCaptureSession(Collections.singletonList(surface), new i(this, createCaptureRequest), controllerFragment.f2142e0);
        } catch (CameraAccessException e2) {
            e2.printStackTrace();
        }
    }
}
