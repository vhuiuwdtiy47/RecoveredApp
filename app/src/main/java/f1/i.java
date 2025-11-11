package f1;

import U.t;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;

/* loaded from: classes.dex */
public final class i extends CameraCaptureSession.StateCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CaptureRequest.Builder f2388a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f2389b;

    public i(j jVar, CaptureRequest.Builder builder) {
        this.f2389b = jVar;
        this.f2388a = builder;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        t.g("配置失败");
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        j jVar = this.f2389b;
        jVar.f2390a.f2140c0 = cameraCaptureSession;
        try {
            cameraCaptureSession.setRepeatingRequest(this.f2388a.build(), null, jVar.f2390a.f2142e0);
        } catch (CameraAccessException e2) {
            e2.printStackTrace();
        }
    }
}
