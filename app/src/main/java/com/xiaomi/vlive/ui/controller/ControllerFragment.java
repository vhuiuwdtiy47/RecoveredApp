package com.xiaomi.vlive.ui.controller;

import C.o;
import D0.i;
import L.C0011g;
import U.t;
import U.v;
import Y.AbstractComponentCallbacksC0056x;
import Y.C0050q;
import Y.M;
import android.content.Intent;
import android.graphics.Color;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.display.VirtualDisplay;
import android.media.Image;
import android.media.ImageReader;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.A;
import androidx.lifecycle.B;
import androidx.lifecycle.T;
import androidx.lifecycle.V;
import c0.e;
import com.android.music.R;
import com.kusu.loadingbutton.LoadingButton;
import com.xiaomi.vlive.App;
import com.xiaomi.vlive.ui.controller.ControllerFragment;
import e1.a;
import f1.d;
import f1.h;
import f1.j;
import f1.k;
import f1.l;
import g.AbstractActivityC0146i;
import java.nio.ByteBuffer;
import l.AbstractC0271z;
import q1.b;

/* loaded from: classes.dex */
public class ControllerFragment extends AbstractComponentCallbacksC0056x {

    /* renamed from: W, reason: collision with root package name */
    public a f2135W;

    /* renamed from: X, reason: collision with root package name */
    public App f2136X;

    /* renamed from: Y, reason: collision with root package name */
    public AbstractActivityC0146i f2137Y;

    /* renamed from: Z, reason: collision with root package name */
    public C0050q f2138Z;

    /* renamed from: a0, reason: collision with root package name */
    public C0050q f2139a0;
    public CameraDevice b0;

    /* renamed from: c0, reason: collision with root package name */
    public CameraCaptureSession f2140c0;

    /* renamed from: d0, reason: collision with root package name */
    public CameraManager f2141d0;

    /* renamed from: e0, reason: collision with root package name */
    public Handler f2142e0;

    /* renamed from: f0, reason: collision with root package name */
    public HandlerThread f2143f0;

    /* renamed from: g0, reason: collision with root package name */
    public String f2144g0;

    /* renamed from: h0, reason: collision with root package name */
    public d f2145h0;

    /* renamed from: i0, reason: collision with root package name */
    public C0050q f2146i0;

    /* renamed from: j0, reason: collision with root package name */
    public MediaProjectionManager f2147j0;

    /* renamed from: k0, reason: collision with root package name */
    public MediaProjection f2148k0;

    /* renamed from: l0, reason: collision with root package name */
    public VirtualDisplay f2149l0;

    /* renamed from: m0, reason: collision with root package name */
    public ImageReader f2150m0;

    /* renamed from: n0, reason: collision with root package name */
    public Handler f2151n0;

    /* renamed from: o0, reason: collision with root package name */
    public int f2152o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f2153p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f2154q0;
    public int r0 = 160;

    /* renamed from: s0, reason: collision with root package name */
    public int f2155s0 = 160;

    /* renamed from: t0, reason: collision with root package name */
    public int f2156t0 = 0;

    /* renamed from: u0, reason: collision with root package name */
    public int f2157u0 = 0;
    public Handler v0 = null;

    /* renamed from: w0, reason: collision with root package name */
    public i f2158w0 = null;

    /* renamed from: x0, reason: collision with root package name */
    public final k f2159x0 = new k(this);

    /* renamed from: y0, reason: collision with root package name */
    public final C0050q f2160y0 = F(new M(3), new f1.a(this, 0));

    public static int L(Image image, int i, int i2) {
        int width = image.getWidth();
        int height = image.getHeight();
        if (i >= 0 && i < width && i2 >= 0 && i2 < height) {
            Image.Plane plane = image.getPlanes()[0];
            ByteBuffer buffer = plane.getBuffer();
            int pixelStride = (i * plane.getPixelStride()) + (plane.getRowStride() * i2);
            if (pixelStride + 4 <= buffer.capacity()) {
                byte[] bArr = new byte[4];
                buffer.position(pixelStride);
                buffer.get(bArr, 0, 4);
                int i3 = bArr[0] & 255;
                int i4 = bArr[1] & 255;
                int i5 = bArr[2] & 255;
                int i6 = bArr[3] & 255;
                float[] fArr = new float[3];
                Color.RGBToHSV(i3, i4, i5, fArr);
                float f2 = fArr[1];
                boolean z2 = fArr[2] > 0.7f;
                boolean z3 = f2 > 0.6f;
                if (z2 && z3) {
                    return (i3 << 16) | (i6 << 24) | (i4 << 8) | i5;
                }
            }
        }
        return 0;
    }

    public final void M() {
        t.T();
        try {
            String[] cameraIdList = this.f2141d0.getCameraIdList();
            int length = cameraIdList.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                String str = cameraIdList[i];
                Integer num = (Integer) this.f2141d0.getCameraCharacteristics(str).get(CameraCharacteristics.LENS_FACING);
                if (num != null && num.intValue() == 0) {
                    this.f2144g0 = str;
                    break;
                }
                i++;
            }
            if (this.f2144g0 != null) {
                if (this.f2135W.d.isAvailable()) {
                    N();
                } else {
                    this.f2135W.d.setSurfaceTextureListener(this.f2159x0);
                }
            }
        } catch (CameraAccessException e2) {
            e2.printStackTrace();
        }
    }

    public final void N() {
        try {
            this.f2141d0.openCamera(this.f2144g0, new j(this), this.f2142e0);
        } catch (CameraAccessException | SecurityException e2) {
            e2.printStackTrace();
        }
    }

    @Override // Y.AbstractComponentCallbacksC0056x
    public final View u(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f2136X = (App) G().getApplication();
        this.f2137Y = G();
        V c2 = c();
        T i = i();
        e a2 = a();
        q1.d.e(i, "factory");
        v vVar = new v(c2, i, a2);
        b a3 = q1.i.a(l.class);
        String s2 = t.s(a3);
        if (s2 == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        View inflate = layoutInflater.inflate(R.layout.fragment_controller, viewGroup, false);
        int i2 = R.id.auto_color;
        Switch r7 = (Switch) AbstractC0271z.i(inflate, R.id.auto_color);
        if (r7 != null) {
            i2 = R.id.auto_rotate;
            Switch r8 = (Switch) AbstractC0271z.i(inflate, R.id.auto_rotate);
            if (r8 != null) {
                i2 = R.id.camera_preview;
                Button button = (Button) AbstractC0271z.i(inflate, R.id.camera_preview);
                if (button != null) {
                    i2 = R.id.cameraTextureView;
                    TextureView textureView = (TextureView) AbstractC0271z.i(inflate, R.id.cameraTextureView);
                    if (textureView != null) {
                        i2 = R.id.controls;
                        LinearLayout linearLayout = (LinearLayout) AbstractC0271z.i(inflate, R.id.controls);
                        if (linearLayout != null) {
                            i2 = R.id.controls1;
                            if (((LinearLayout) AbstractC0271z.i(inflate, R.id.controls1)) != null) {
                                i2 = R.id.expiration_time;
                                if (((TextView) AbstractC0271z.i(inflate, R.id.expiration_time)) != null) {
                                    i2 = R.id.file_type_mp4;
                                    RadioButton radioButton = (RadioButton) AbstractC0271z.i(inflate, R.id.file_type_mp4);
                                    if (radioButton != null) {
                                        i2 = R.id.file_type_rtmp;
                                        RadioButton radioButton2 = (RadioButton) AbstractC0271z.i(inflate, R.id.file_type_rtmp);
                                        if (radioButton2 != null) {
                                            i2 = R.id.filetypetxt;
                                            TextView textView = (TextView) AbstractC0271z.i(inflate, R.id.filetypetxt);
                                            if (textView != null) {
                                                i2 = R.id.logmsg;
                                                TextView textView2 = (TextView) AbstractC0271z.i(inflate, R.id.logmsg);
                                                if (textView2 != null) {
                                                    i2 = R.id.play_loop;
                                                    Switch r16 = (Switch) AbstractC0271z.i(inflate, R.id.play_loop);
                                                    if (r16 != null) {
                                                        i2 = R.id.playfile;
                                                        EditText editText = (EditText) AbstractC0271z.i(inflate, R.id.playfile);
                                                        if (editText != null) {
                                                            i2 = R.id.preview_overlay;
                                                            FrameLayout frameLayout = (FrameLayout) AbstractC0271z.i(inflate, R.id.preview_overlay);
                                                            if (frameLayout != null) {
                                                                i2 = R.id.radioGroup_file_type;
                                                                RadioGroup radioGroup = (RadioGroup) AbstractC0271z.i(inflate, R.id.radioGroup_file_type);
                                                                if (radioGroup != null) {
                                                                    i2 = R.id.seekBar;
                                                                    SeekBar seekBar = (SeekBar) AbstractC0271z.i(inflate, R.id.seekBar);
                                                                    if (seekBar != null) {
                                                                        i2 = R.id.seekBar2;
                                                                        SeekBar seekBar2 = (SeekBar) AbstractC0271z.i(inflate, R.id.seekBar2);
                                                                        if (seekBar2 != null) {
                                                                            i2 = R.id.seekBar3;
                                                                            SeekBar seekBar3 = (SeekBar) AbstractC0271z.i(inflate, R.id.seekBar3);
                                                                            if (seekBar3 != null) {
                                                                                i2 = R.id.seekBar4;
                                                                                SeekBar seekBar4 = (SeekBar) AbstractC0271z.i(inflate, R.id.seekBar4);
                                                                                if (seekBar4 != null) {
                                                                                    i2 = R.id.selectsave;
                                                                                    LoadingButton loadingButton = (LoadingButton) AbstractC0271z.i(inflate, R.id.selectsave);
                                                                                    if (loadingButton != null) {
                                                                                        i2 = R.id.ssmode;
                                                                                        RadioGroup radioGroup2 = (RadioGroup) AbstractC0271z.i(inflate, R.id.ssmode);
                                                                                        if (radioGroup2 != null) {
                                                                                            i2 = R.id.ssmode1;
                                                                                            RadioButton radioButton3 = (RadioButton) AbstractC0271z.i(inflate, R.id.ssmode1);
                                                                                            if (radioButton3 != null) {
                                                                                                RadioButton radioButton4 = (RadioButton) AbstractC0271z.i(inflate, R.id.ssmode2);
                                                                                                if (radioButton4 != null) {
                                                                                                    int i3 = R.id.start_hook;
                                                                                                    LoadingButton loadingButton2 = (LoadingButton) AbstractC0271z.i(inflate, R.id.start_hook);
                                                                                                    if (loadingButton2 != null) {
                                                                                                        i3 = R.id.switchfloatingwindow;
                                                                                                        Switch r29 = (Switch) AbstractC0271z.i(inflate, R.id.switchfloatingwindow);
                                                                                                        if (r29 != null) {
                                                                                                            i3 = R.id.test_color;
                                                                                                            Button button2 = (Button) AbstractC0271z.i(inflate, R.id.test_color);
                                                                                                            if (button2 != null) {
                                                                                                                i3 = R.id.valueText;
                                                                                                                TextView textView3 = (TextView) AbstractC0271z.i(inflate, R.id.valueText);
                                                                                                                if (textView3 != null) {
                                                                                                                    i3 = R.id.valueText2;
                                                                                                                    TextView textView4 = (TextView) AbstractC0271z.i(inflate, R.id.valueText2);
                                                                                                                    if (textView4 != null) {
                                                                                                                        i3 = R.id.valueText3;
                                                                                                                        TextView textView5 = (TextView) AbstractC0271z.i(inflate, R.id.valueText3);
                                                                                                                        if (textView5 != null) {
                                                                                                                            i3 = R.id.valueText4;
                                                                                                                            TextView textView6 = (TextView) AbstractC0271z.i(inflate, R.id.valueText4);
                                                                                                                            if (textView6 != null) {
                                                                                                                                i3 = R.id.valueTextmode;
                                                                                                                                if (((TextView) AbstractC0271z.i(inflate, R.id.valueTextmode)) != null) {
                                                                                                                                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                                                                                                                    this.f2135W = new a(constraintLayout, r7, r8, button, textureView, linearLayout, radioButton, radioButton2, textView, textView2, r16, editText, frameLayout, radioGroup, seekBar, seekBar2, seekBar3, seekBar4, loadingButton, radioGroup2, radioButton3, radioButton4, loadingButton2, r29, button2, textView3, textView4, textView5, textView6);
                                                                                                                                    this.f2138Z = F(new M(2), new C0011g(3));
                                                                                                                                    F(new M(2), new f1.a(this, 3));
                                                                                                                                    this.f2139a0 = F(new M(3), new f1.a(this, 1));
                                                                                                                                    int i4 = this.f2136X.f2121a.getInt("PlayFileType", 1);
                                                                                                                                    if (i4 == 1) {
                                                                                                                                        this.f2135W.h.setText("文件路径:");
                                                                                                                                        this.f2135W.f2207r.setButtonText("选择视频");
                                                                                                                                        String string = this.f2136X.f2121a.getString("PlayFileMp4", "");
                                                                                                                                        if (!string.isEmpty()) {
                                                                                                                                            string = "已设置MP4视频文件";
                                                                                                                                        }
                                                                                                                                        this.f2135W.f2200k.setText(string);
                                                                                                                                        a aVar = this.f2135W;
                                                                                                                                        aVar.f2202m.check(aVar.f2197f.getId());
                                                                                                                                    } else if (i4 == 2) {
                                                                                                                                        this.f2135W.h.setText("rtmp链接:");
                                                                                                                                        this.f2135W.f2207r.setButtonText("保存链接");
                                                                                                                                        this.f2135W.f2200k.setText(this.f2136X.f2121a.getString("PlayRtmpUrl", "rtmp://ns8.indexforce.com/home/mystream"));
                                                                                                                                        a aVar2 = this.f2135W;
                                                                                                                                        aVar2.f2202m.check(aVar2.f2198g.getId());
                                                                                                                                    }
                                                                                                                                    final int i5 = 0;
                                                                                                                                    this.f2135W.f2202m.setOnCheckedChangeListener(new f1.b(i5, this));
                                                                                                                                    this.f2135W.f2207r.setOnClickListener(new View.OnClickListener(this) { // from class: f1.c

                                                                                                                                        /* renamed from: b, reason: collision with root package name */
                                                                                                                                        public final /* synthetic */ ControllerFragment f2378b;

                                                                                                                                        {
                                                                                                                                            this.f2378b = this;
                                                                                                                                        }

                                                                                                                                        @Override // android.view.View.OnClickListener
                                                                                                                                        public final void onClick(View view) {
                                                                                                                                            switch (i5) {
                                                                                                                                                case 0:
                                                                                                                                                    ControllerFragment controllerFragment = this.f2378b;
                                                                                                                                                    if (!controllerFragment.f2135W.f2207r.getButtonText().equals("保存链接")) {
                                                                                                                                                        Intent intent = new Intent("android.intent.action.GET_CONTENT");
                                                                                                                                                        intent.setType("video/*");
                                                                                                                                                        intent.addCategory("android.intent.category.OPENABLE");
                                                                                                                                                        controllerFragment.f2139a0.a(intent);
                                                                                                                                                        return;
                                                                                                                                                    }
                                                                                                                                                    String trim = controllerFragment.f2135W.f2200k.getText().toString().trim();
                                                                                                                                                    controllerFragment.f2136X.f2121a.edit().putString("PlayRtmpUrl", trim).apply();
                                                                                                                                                    Object obj = controllerFragment.f2136X.f2125f.f1543e;
                                                                                                                                                    if (obj == A.f1539j) {
                                                                                                                                                        obj = null;
                                                                                                                                                    }
                                                                                                                                                    if (((Integer) obj).intValue() != 1) {
                                                                                                                                                        t.g("保存成功");
                                                                                                                                                        return;
                                                                                                                                                    }
                                                                                                                                                    controllerFragment.f2135W.f2207r.setEnabled(false);
                                                                                                                                                    controllerFragment.f2135W.f2207r.e();
                                                                                                                                                    new Thread(new o(controllerFragment, 1, trim)).start();
                                                                                                                                                    return;
                                                                                                                                                case 1:
                                                                                                                                                    ControllerFragment controllerFragment2 = this.f2378b;
                                                                                                                                                    Object obj2 = controllerFragment2.f2136X.f2125f.f1543e;
                                                                                                                                                    if (obj2 == A.f1539j) {
                                                                                                                                                        obj2 = null;
                                                                                                                                                    }
                                                                                                                                                    if (((Integer) obj2).intValue() != 0) {
                                                                                                                                                        try {
                                                                                                                                                            ((d1.f) t.E()).k();
                                                                                                                                                            return;
                                                                                                                                                        } catch (RemoteException | Exception unused) {
                                                                                                                                                            return;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    App app = controllerFragment2.f2136X;
                                                                                                                                                    if ((app.f2121a.getInt("PlayFileType", 1) == 1 ? app.f2121a.getString("PlayFileMp4", "") : app.f2121a.getString("PlayRtmpUrl", "rtmp://ns8.indexforce.com/home/mystream")).isEmpty()) {
                                                                                                                                                        t.g("请先选择要播放的文件 或 rtmp");
                                                                                                                                                        return;
                                                                                                                                                    }
                                                                                                                                                    controllerFragment2.f2135W.f2211v.setEnabled(false);
                                                                                                                                                    controllerFragment2.f2135W.f2211v.e();
                                                                                                                                                    new Thread(new F0.b(14, controllerFragment2)).start();
                                                                                                                                                    return;
                                                                                                                                                case 2:
                                                                                                                                                    ControllerFragment controllerFragment3 = this.f2378b;
                                                                                                                                                    controllerFragment3.f2135W.f2201l.setVisibility(0);
                                                                                                                                                    HandlerThread handlerThread = new HandlerThread("CameraBackground");
                                                                                                                                                    controllerFragment3.f2143f0 = handlerThread;
                                                                                                                                                    handlerThread.start();
                                                                                                                                                    controllerFragment3.f2142e0 = new Handler(controllerFragment3.f2143f0.getLooper());
                                                                                                                                                    if (Z0.i.j(controllerFragment3.H(), "android.permission.CAMERA") != 0) {
                                                                                                                                                        controllerFragment3.f2138Z.a("android.permission.CAMERA");
                                                                                                                                                        return;
                                                                                                                                                    } else {
                                                                                                                                                        controllerFragment3.M();
                                                                                                                                                        return;
                                                                                                                                                    }
                                                                                                                                                case 3:
                                                                                                                                                    ControllerFragment controllerFragment4 = this.f2378b;
                                                                                                                                                    CameraCaptureSession cameraCaptureSession = controllerFragment4.f2140c0;
                                                                                                                                                    if (cameraCaptureSession != null) {
                                                                                                                                                        cameraCaptureSession.close();
                                                                                                                                                        controllerFragment4.f2140c0 = null;
                                                                                                                                                    }
                                                                                                                                                    CameraDevice cameraDevice = controllerFragment4.b0;
                                                                                                                                                    if (cameraDevice != null) {
                                                                                                                                                        cameraDevice.close();
                                                                                                                                                        controllerFragment4.b0 = null;
                                                                                                                                                    }
                                                                                                                                                    HandlerThread handlerThread2 = controllerFragment4.f2143f0;
                                                                                                                                                    if (handlerThread2 != null) {
                                                                                                                                                        handlerThread2.quitSafely();
                                                                                                                                                        try {
                                                                                                                                                            controllerFragment4.f2143f0.join();
                                                                                                                                                            controllerFragment4.f2143f0 = null;
                                                                                                                                                            controllerFragment4.f2142e0 = null;
                                                                                                                                                        } catch (InterruptedException e2) {
                                                                                                                                                            e2.printStackTrace();
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    controllerFragment4.f2135W.f2201l.setVisibility(8);
                                                                                                                                                    return;
                                                                                                                                                default:
                                                                                                                                                    ControllerFragment controllerFragment5 = this.f2378b;
                                                                                                                                                    if (controllerFragment5.v0 == null) {
                                                                                                                                                        t.g("开启闪烁");
                                                                                                                                                        Handler handler = new Handler(Looper.getMainLooper());
                                                                                                                                                        controllerFragment5.v0 = handler;
                                                                                                                                                        D0.i iVar = new D0.i(10, controllerFragment5);
                                                                                                                                                        controllerFragment5.f2158w0 = iVar;
                                                                                                                                                        handler.post(iVar);
                                                                                                                                                        return;
                                                                                                                                                    }
                                                                                                                                                    if (controllerFragment5.f2158w0 != null) {
                                                                                                                                                        t.g("停止闪光");
                                                                                                                                                        controllerFragment5.v0.removeCallbacks(controllerFragment5.f2158w0);
                                                                                                                                                        controllerFragment5.v0 = null;
                                                                                                                                                        controllerFragment5.f2158w0 = null;
                                                                                                                                                        if (t.Y(0).booleanValue()) {
                                                                                                                                                            controllerFragment5.f2156t0 = 0;
                                                                                                                                                        }
                                                                                                                                                        controllerFragment5.f2135W.f2201l.setBackgroundColor(-2013265920);
                                                                                                                                                        return;
                                                                                                                                                    }
                                                                                                                                                    return;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    });
                                                                                                                                    final int i6 = 1;
                                                                                                                                    this.f2135W.f2211v.setOnClickListener(new View.OnClickListener(this) { // from class: f1.c

                                                                                                                                        /* renamed from: b, reason: collision with root package name */
                                                                                                                                        public final /* synthetic */ ControllerFragment f2378b;

                                                                                                                                        {
                                                                                                                                            this.f2378b = this;
                                                                                                                                        }

                                                                                                                                        @Override // android.view.View.OnClickListener
                                                                                                                                        public final void onClick(View view) {
                                                                                                                                            switch (i6) {
                                                                                                                                                case 0:
                                                                                                                                                    ControllerFragment controllerFragment = this.f2378b;
                                                                                                                                                    if (!controllerFragment.f2135W.f2207r.getButtonText().equals("保存链接")) {
                                                                                                                                                        Intent intent = new Intent("android.intent.action.GET_CONTENT");
                                                                                                                                                        intent.setType("video/*");
                                                                                                                                                        intent.addCategory("android.intent.category.OPENABLE");
                                                                                                                                                        controllerFragment.f2139a0.a(intent);
                                                                                                                                                        return;
                                                                                                                                                    }
                                                                                                                                                    String trim = controllerFragment.f2135W.f2200k.getText().toString().trim();
                                                                                                                                                    controllerFragment.f2136X.f2121a.edit().putString("PlayRtmpUrl", trim).apply();
                                                                                                                                                    Object obj = controllerFragment.f2136X.f2125f.f1543e;
                                                                                                                                                    if (obj == A.f1539j) {
                                                                                                                                                        obj = null;
                                                                                                                                                    }
                                                                                                                                                    if (((Integer) obj).intValue() != 1) {
                                                                                                                                                        t.g("保存成功");
                                                                                                                                                        return;
                                                                                                                                                    }
                                                                                                                                                    controllerFragment.f2135W.f2207r.setEnabled(false);
                                                                                                                                                    controllerFragment.f2135W.f2207r.e();
                                                                                                                                                    new Thread(new o(controllerFragment, 1, trim)).start();
                                                                                                                                                    return;
                                                                                                                                                case 1:
                                                                                                                                                    ControllerFragment controllerFragment2 = this.f2378b;
                                                                                                                                                    Object obj2 = controllerFragment2.f2136X.f2125f.f1543e;
                                                                                                                                                    if (obj2 == A.f1539j) {
                                                                                                                                                        obj2 = null;
                                                                                                                                                    }
                                                                                                                                                    if (((Integer) obj2).intValue() != 0) {
                                                                                                                                                        try {
                                                                                                                                                            ((d1.f) t.E()).k();
                                                                                                                                                            return;
                                                                                                                                                        } catch (RemoteException | Exception unused) {
                                                                                                                                                            return;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    App app = controllerFragment2.f2136X;
                                                                                                                                                    if ((app.f2121a.getInt("PlayFileType", 1) == 1 ? app.f2121a.getString("PlayFileMp4", "") : app.f2121a.getString("PlayRtmpUrl", "rtmp://ns8.indexforce.com/home/mystream")).isEmpty()) {
                                                                                                                                                        t.g("请先选择要播放的文件 或 rtmp");
                                                                                                                                                        return;
                                                                                                                                                    }
                                                                                                                                                    controllerFragment2.f2135W.f2211v.setEnabled(false);
                                                                                                                                                    controllerFragment2.f2135W.f2211v.e();
                                                                                                                                                    new Thread(new F0.b(14, controllerFragment2)).start();
                                                                                                                                                    return;
                                                                                                                                                case 2:
                                                                                                                                                    ControllerFragment controllerFragment3 = this.f2378b;
                                                                                                                                                    controllerFragment3.f2135W.f2201l.setVisibility(0);
                                                                                                                                                    HandlerThread handlerThread = new HandlerThread("CameraBackground");
                                                                                                                                                    controllerFragment3.f2143f0 = handlerThread;
                                                                                                                                                    handlerThread.start();
                                                                                                                                                    controllerFragment3.f2142e0 = new Handler(controllerFragment3.f2143f0.getLooper());
                                                                                                                                                    if (Z0.i.j(controllerFragment3.H(), "android.permission.CAMERA") != 0) {
                                                                                                                                                        controllerFragment3.f2138Z.a("android.permission.CAMERA");
                                                                                                                                                        return;
                                                                                                                                                    } else {
                                                                                                                                                        controllerFragment3.M();
                                                                                                                                                        return;
                                                                                                                                                    }
                                                                                                                                                case 3:
                                                                                                                                                    ControllerFragment controllerFragment4 = this.f2378b;
                                                                                                                                                    CameraCaptureSession cameraCaptureSession = controllerFragment4.f2140c0;
                                                                                                                                                    if (cameraCaptureSession != null) {
                                                                                                                                                        cameraCaptureSession.close();
                                                                                                                                                        controllerFragment4.f2140c0 = null;
                                                                                                                                                    }
                                                                                                                                                    CameraDevice cameraDevice = controllerFragment4.b0;
                                                                                                                                                    if (cameraDevice != null) {
                                                                                                                                                        cameraDevice.close();
                                                                                                                                                        controllerFragment4.b0 = null;
                                                                                                                                                    }
                                                                                                                                                    HandlerThread handlerThread2 = controllerFragment4.f2143f0;
                                                                                                                                                    if (handlerThread2 != null) {
                                                                                                                                                        handlerThread2.quitSafely();
                                                                                                                                                        try {
                                                                                                                                                            controllerFragment4.f2143f0.join();
                                                                                                                                                            controllerFragment4.f2143f0 = null;
                                                                                                                                                            controllerFragment4.f2142e0 = null;
                                                                                                                                                        } catch (InterruptedException e2) {
                                                                                                                                                            e2.printStackTrace();
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    controllerFragment4.f2135W.f2201l.setVisibility(8);
                                                                                                                                                    return;
                                                                                                                                                default:
                                                                                                                                                    ControllerFragment controllerFragment5 = this.f2378b;
                                                                                                                                                    if (controllerFragment5.v0 == null) {
                                                                                                                                                        t.g("开启闪烁");
                                                                                                                                                        Handler handler = new Handler(Looper.getMainLooper());
                                                                                                                                                        controllerFragment5.v0 = handler;
                                                                                                                                                        D0.i iVar = new D0.i(10, controllerFragment5);
                                                                                                                                                        controllerFragment5.f2158w0 = iVar;
                                                                                                                                                        handler.post(iVar);
                                                                                                                                                        return;
                                                                                                                                                    }
                                                                                                                                                    if (controllerFragment5.f2158w0 != null) {
                                                                                                                                                        t.g("停止闪光");
                                                                                                                                                        controllerFragment5.v0.removeCallbacks(controllerFragment5.f2158w0);
                                                                                                                                                        controllerFragment5.v0 = null;
                                                                                                                                                        controllerFragment5.f2158w0 = null;
                                                                                                                                                        if (t.Y(0).booleanValue()) {
                                                                                                                                                            controllerFragment5.f2156t0 = 0;
                                                                                                                                                        }
                                                                                                                                                        controllerFragment5.f2135W.f2201l.setBackgroundColor(-2013265920);
                                                                                                                                                        return;
                                                                                                                                                    }
                                                                                                                                                    return;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    });
                                                                                                                                    this.f2135W.f2194b.setChecked(this.f2136X.f2121a.getBoolean("PlayAutoRotate", false));
                                                                                                                                    this.f2135W.f2199j.setChecked(this.f2136X.c());
                                                                                                                                    d dVar = new d(0, this);
                                                                                                                                    this.f2145h0 = dVar;
                                                                                                                                    this.f2135W.f2212w.setOnCheckedChangeListener(dVar);
                                                                                                                                    this.f2135W.f2194b.setOnCheckedChangeListener(new d(1, this));
                                                                                                                                    this.f2135W.f2199j.setOnCheckedChangeListener(new d(2, this));
                                                                                                                                    this.f2146i0 = F(new M(3), new f1.a(this, 2));
                                                                                                                                    this.f2135W.f2193a.setOnCheckedChangeListener(new d(3, this));
                                                                                                                                    this.f2141d0 = (CameraManager) this.f2137Y.getSystemService("camera");
                                                                                                                                    final int i7 = 2;
                                                                                                                                    this.f2135W.f2195c.setOnClickListener(new View.OnClickListener(this) { // from class: f1.c

                                                                                                                                        /* renamed from: b, reason: collision with root package name */
                                                                                                                                        public final /* synthetic */ ControllerFragment f2378b;

                                                                                                                                        {
                                                                                                                                            this.f2378b = this;
                                                                                                                                        }

                                                                                                                                        @Override // android.view.View.OnClickListener
                                                                                                                                        public final void onClick(View view) {
                                                                                                                                            switch (i7) {
                                                                                                                                                case 0:
                                                                                                                                                    ControllerFragment controllerFragment = this.f2378b;
                                                                                                                                                    if (!controllerFragment.f2135W.f2207r.getButtonText().equals("保存链接")) {
                                                                                                                                                        Intent intent = new Intent("android.intent.action.GET_CONTENT");
                                                                                                                                                        intent.setType("video/*");
                                                                                                                                                        intent.addCategory("android.intent.category.OPENABLE");
                                                                                                                                                        controllerFragment.f2139a0.a(intent);
                                                                                                                                                        return;
                                                                                                                                                    }
                                                                                                                                                    String trim = controllerFragment.f2135W.f2200k.getText().toString().trim();
                                                                                                                                                    controllerFragment.f2136X.f2121a.edit().putString("PlayRtmpUrl", trim).apply();
                                                                                                                                                    Object obj = controllerFragment.f2136X.f2125f.f1543e;
                                                                                                                                                    if (obj == A.f1539j) {
                                                                                                                                                        obj = null;
                                                                                                                                                    }
                                                                                                                                                    if (((Integer) obj).intValue() != 1) {
                                                                                                                                                        t.g("保存成功");
                                                                                                                                                        return;
                                                                                                                                                    }
                                                                                                                                                    controllerFragment.f2135W.f2207r.setEnabled(false);
                                                                                                                                                    controllerFragment.f2135W.f2207r.e();
                                                                                                                                                    new Thread(new o(controllerFragment, 1, trim)).start();
                                                                                                                                                    return;
                                                                                                                                                case 1:
                                                                                                                                                    ControllerFragment controllerFragment2 = this.f2378b;
                                                                                                                                                    Object obj2 = controllerFragment2.f2136X.f2125f.f1543e;
                                                                                                                                                    if (obj2 == A.f1539j) {
                                                                                                                                                        obj2 = null;
                                                                                                                                                    }
                                                                                                                                                    if (((Integer) obj2).intValue() != 0) {
                                                                                                                                                        try {
                                                                                                                                                            ((d1.f) t.E()).k();
                                                                                                                                                            return;
                                                                                                                                                        } catch (RemoteException | Exception unused) {
                                                                                                                                                            return;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    App app = controllerFragment2.f2136X;
                                                                                                                                                    if ((app.f2121a.getInt("PlayFileType", 1) == 1 ? app.f2121a.getString("PlayFileMp4", "") : app.f2121a.getString("PlayRtmpUrl", "rtmp://ns8.indexforce.com/home/mystream")).isEmpty()) {
                                                                                                                                                        t.g("请先选择要播放的文件 或 rtmp");
                                                                                                                                                        return;
                                                                                                                                                    }
                                                                                                                                                    controllerFragment2.f2135W.f2211v.setEnabled(false);
                                                                                                                                                    controllerFragment2.f2135W.f2211v.e();
                                                                                                                                                    new Thread(new F0.b(14, controllerFragment2)).start();
                                                                                                                                                    return;
                                                                                                                                                case 2:
                                                                                                                                                    ControllerFragment controllerFragment3 = this.f2378b;
                                                                                                                                                    controllerFragment3.f2135W.f2201l.setVisibility(0);
                                                                                                                                                    HandlerThread handlerThread = new HandlerThread("CameraBackground");
                                                                                                                                                    controllerFragment3.f2143f0 = handlerThread;
                                                                                                                                                    handlerThread.start();
                                                                                                                                                    controllerFragment3.f2142e0 = new Handler(controllerFragment3.f2143f0.getLooper());
                                                                                                                                                    if (Z0.i.j(controllerFragment3.H(), "android.permission.CAMERA") != 0) {
                                                                                                                                                        controllerFragment3.f2138Z.a("android.permission.CAMERA");
                                                                                                                                                        return;
                                                                                                                                                    } else {
                                                                                                                                                        controllerFragment3.M();
                                                                                                                                                        return;
                                                                                                                                                    }
                                                                                                                                                case 3:
                                                                                                                                                    ControllerFragment controllerFragment4 = this.f2378b;
                                                                                                                                                    CameraCaptureSession cameraCaptureSession = controllerFragment4.f2140c0;
                                                                                                                                                    if (cameraCaptureSession != null) {
                                                                                                                                                        cameraCaptureSession.close();
                                                                                                                                                        controllerFragment4.f2140c0 = null;
                                                                                                                                                    }
                                                                                                                                                    CameraDevice cameraDevice = controllerFragment4.b0;
                                                                                                                                                    if (cameraDevice != null) {
                                                                                                                                                        cameraDevice.close();
                                                                                                                                                        controllerFragment4.b0 = null;
                                                                                                                                                    }
                                                                                                                                                    HandlerThread handlerThread2 = controllerFragment4.f2143f0;
                                                                                                                                                    if (handlerThread2 != null) {
                                                                                                                                                        handlerThread2.quitSafely();
                                                                                                                                                        try {
                                                                                                                                                            controllerFragment4.f2143f0.join();
                                                                                                                                                            controllerFragment4.f2143f0 = null;
                                                                                                                                                            controllerFragment4.f2142e0 = null;
                                                                                                                                                        } catch (InterruptedException e2) {
                                                                                                                                                            e2.printStackTrace();
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    controllerFragment4.f2135W.f2201l.setVisibility(8);
                                                                                                                                                    return;
                                                                                                                                                default:
                                                                                                                                                    ControllerFragment controllerFragment5 = this.f2378b;
                                                                                                                                                    if (controllerFragment5.v0 == null) {
                                                                                                                                                        t.g("开启闪烁");
                                                                                                                                                        Handler handler = new Handler(Looper.getMainLooper());
                                                                                                                                                        controllerFragment5.v0 = handler;
                                                                                                                                                        D0.i iVar = new D0.i(10, controllerFragment5);
                                                                                                                                                        controllerFragment5.f2158w0 = iVar;
                                                                                                                                                        handler.post(iVar);
                                                                                                                                                        return;
                                                                                                                                                    }
                                                                                                                                                    if (controllerFragment5.f2158w0 != null) {
                                                                                                                                                        t.g("停止闪光");
                                                                                                                                                        controllerFragment5.v0.removeCallbacks(controllerFragment5.f2158w0);
                                                                                                                                                        controllerFragment5.v0 = null;
                                                                                                                                                        controllerFragment5.f2158w0 = null;
                                                                                                                                                        if (t.Y(0).booleanValue()) {
                                                                                                                                                            controllerFragment5.f2156t0 = 0;
                                                                                                                                                        }
                                                                                                                                                        controllerFragment5.f2135W.f2201l.setBackgroundColor(-2013265920);
                                                                                                                                                        return;
                                                                                                                                                    }
                                                                                                                                                    return;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    });
                                                                                                                                    final int i8 = 3;
                                                                                                                                    this.f2135W.f2201l.setOnClickListener(new View.OnClickListener(this) { // from class: f1.c

                                                                                                                                        /* renamed from: b, reason: collision with root package name */
                                                                                                                                        public final /* synthetic */ ControllerFragment f2378b;

                                                                                                                                        {
                                                                                                                                            this.f2378b = this;
                                                                                                                                        }

                                                                                                                                        @Override // android.view.View.OnClickListener
                                                                                                                                        public final void onClick(View view) {
                                                                                                                                            switch (i8) {
                                                                                                                                                case 0:
                                                                                                                                                    ControllerFragment controllerFragment = this.f2378b;
                                                                                                                                                    if (!controllerFragment.f2135W.f2207r.getButtonText().equals("保存链接")) {
                                                                                                                                                        Intent intent = new Intent("android.intent.action.GET_CONTENT");
                                                                                                                                                        intent.setType("video/*");
                                                                                                                                                        intent.addCategory("android.intent.category.OPENABLE");
                                                                                                                                                        controllerFragment.f2139a0.a(intent);
                                                                                                                                                        return;
                                                                                                                                                    }
                                                                                                                                                    String trim = controllerFragment.f2135W.f2200k.getText().toString().trim();
                                                                                                                                                    controllerFragment.f2136X.f2121a.edit().putString("PlayRtmpUrl", trim).apply();
                                                                                                                                                    Object obj = controllerFragment.f2136X.f2125f.f1543e;
                                                                                                                                                    if (obj == A.f1539j) {
                                                                                                                                                        obj = null;
                                                                                                                                                    }
                                                                                                                                                    if (((Integer) obj).intValue() != 1) {
                                                                                                                                                        t.g("保存成功");
                                                                                                                                                        return;
                                                                                                                                                    }
                                                                                                                                                    controllerFragment.f2135W.f2207r.setEnabled(false);
                                                                                                                                                    controllerFragment.f2135W.f2207r.e();
                                                                                                                                                    new Thread(new o(controllerFragment, 1, trim)).start();
                                                                                                                                                    return;
                                                                                                                                                case 1:
                                                                                                                                                    ControllerFragment controllerFragment2 = this.f2378b;
                                                                                                                                                    Object obj2 = controllerFragment2.f2136X.f2125f.f1543e;
                                                                                                                                                    if (obj2 == A.f1539j) {
                                                                                                                                                        obj2 = null;
                                                                                                                                                    }
                                                                                                                                                    if (((Integer) obj2).intValue() != 0) {
                                                                                                                                                        try {
                                                                                                                                                            ((d1.f) t.E()).k();
                                                                                                                                                            return;
                                                                                                                                                        } catch (RemoteException | Exception unused) {
                                                                                                                                                            return;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    App app = controllerFragment2.f2136X;
                                                                                                                                                    if ((app.f2121a.getInt("PlayFileType", 1) == 1 ? app.f2121a.getString("PlayFileMp4", "") : app.f2121a.getString("PlayRtmpUrl", "rtmp://ns8.indexforce.com/home/mystream")).isEmpty()) {
                                                                                                                                                        t.g("请先选择要播放的文件 或 rtmp");
                                                                                                                                                        return;
                                                                                                                                                    }
                                                                                                                                                    controllerFragment2.f2135W.f2211v.setEnabled(false);
                                                                                                                                                    controllerFragment2.f2135W.f2211v.e();
                                                                                                                                                    new Thread(new F0.b(14, controllerFragment2)).start();
                                                                                                                                                    return;
                                                                                                                                                case 2:
                                                                                                                                                    ControllerFragment controllerFragment3 = this.f2378b;
                                                                                                                                                    controllerFragment3.f2135W.f2201l.setVisibility(0);
                                                                                                                                                    HandlerThread handlerThread = new HandlerThread("CameraBackground");
                                                                                                                                                    controllerFragment3.f2143f0 = handlerThread;
                                                                                                                                                    handlerThread.start();
                                                                                                                                                    controllerFragment3.f2142e0 = new Handler(controllerFragment3.f2143f0.getLooper());
                                                                                                                                                    if (Z0.i.j(controllerFragment3.H(), "android.permission.CAMERA") != 0) {
                                                                                                                                                        controllerFragment3.f2138Z.a("android.permission.CAMERA");
                                                                                                                                                        return;
                                                                                                                                                    } else {
                                                                                                                                                        controllerFragment3.M();
                                                                                                                                                        return;
                                                                                                                                                    }
                                                                                                                                                case 3:
                                                                                                                                                    ControllerFragment controllerFragment4 = this.f2378b;
                                                                                                                                                    CameraCaptureSession cameraCaptureSession = controllerFragment4.f2140c0;
                                                                                                                                                    if (cameraCaptureSession != null) {
                                                                                                                                                        cameraCaptureSession.close();
                                                                                                                                                        controllerFragment4.f2140c0 = null;
                                                                                                                                                    }
                                                                                                                                                    CameraDevice cameraDevice = controllerFragment4.b0;
                                                                                                                                                    if (cameraDevice != null) {
                                                                                                                                                        cameraDevice.close();
                                                                                                                                                        controllerFragment4.b0 = null;
                                                                                                                                                    }
                                                                                                                                                    HandlerThread handlerThread2 = controllerFragment4.f2143f0;
                                                                                                                                                    if (handlerThread2 != null) {
                                                                                                                                                        handlerThread2.quitSafely();
                                                                                                                                                        try {
                                                                                                                                                            controllerFragment4.f2143f0.join();
                                                                                                                                                            controllerFragment4.f2143f0 = null;
                                                                                                                                                            controllerFragment4.f2142e0 = null;
                                                                                                                                                        } catch (InterruptedException e2) {
                                                                                                                                                            e2.printStackTrace();
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    controllerFragment4.f2135W.f2201l.setVisibility(8);
                                                                                                                                                    return;
                                                                                                                                                default:
                                                                                                                                                    ControllerFragment controllerFragment5 = this.f2378b;
                                                                                                                                                    if (controllerFragment5.v0 == null) {
                                                                                                                                                        t.g("开启闪烁");
                                                                                                                                                        Handler handler = new Handler(Looper.getMainLooper());
                                                                                                                                                        controllerFragment5.v0 = handler;
                                                                                                                                                        D0.i iVar = new D0.i(10, controllerFragment5);
                                                                                                                                                        controllerFragment5.f2158w0 = iVar;
                                                                                                                                                        handler.post(iVar);
                                                                                                                                                        return;
                                                                                                                                                    }
                                                                                                                                                    if (controllerFragment5.f2158w0 != null) {
                                                                                                                                                        t.g("停止闪光");
                                                                                                                                                        controllerFragment5.v0.removeCallbacks(controllerFragment5.f2158w0);
                                                                                                                                                        controllerFragment5.v0 = null;
                                                                                                                                                        controllerFragment5.f2158w0 = null;
                                                                                                                                                        if (t.Y(0).booleanValue()) {
                                                                                                                                                            controllerFragment5.f2156t0 = 0;
                                                                                                                                                        }
                                                                                                                                                        controllerFragment5.f2135W.f2201l.setBackgroundColor(-2013265920);
                                                                                                                                                        return;
                                                                                                                                                    }
                                                                                                                                                    return;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    });
                                                                                                                                    final int i9 = 0;
                                                                                                                                    this.f2136X.f2126g.d(this, new B(this) { // from class: f1.g

                                                                                                                                        /* renamed from: b, reason: collision with root package name */
                                                                                                                                        public final /* synthetic */ ControllerFragment f2385b;

                                                                                                                                        {
                                                                                                                                            this.f2385b = this;
                                                                                                                                        }

                                                                                                                                        @Override // androidx.lifecycle.B
                                                                                                                                        public final void a(Object obj) {
                                                                                                                                            switch (i9) {
                                                                                                                                                case 0:
                                                                                                                                                    this.f2385b.f2135W.i.setText((String) obj);
                                                                                                                                                    return;
                                                                                                                                                default:
                                                                                                                                                    ControllerFragment controllerFragment = this.f2385b;
                                                                                                                                                    controllerFragment.getClass();
                                                                                                                                                    if (((Integer) obj).intValue() == 0) {
                                                                                                                                                        controllerFragment.f2135W.f2211v.setTextColor(-1);
                                                                                                                                                        controllerFragment.f2135W.f2211v.setButtonText("替换相机");
                                                                                                                                                        controllerFragment.f2135W.f2196e.setVisibility(8);
                                                                                                                                                        return;
                                                                                                                                                    } else {
                                                                                                                                                        controllerFragment.f2135W.f2211v.setTextColor(-16711936);
                                                                                                                                                        controllerFragment.f2135W.f2211v.setButtonText("还原相机");
                                                                                                                                                        controllerFragment.f2135W.f2196e.setVisibility(0);
                                                                                                                                                        return;
                                                                                                                                                    }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    });
                                                                                                                                    final int i10 = 1;
                                                                                                                                    this.f2136X.f2125f.d(this, new B(this) { // from class: f1.g

                                                                                                                                        /* renamed from: b, reason: collision with root package name */
                                                                                                                                        public final /* synthetic */ ControllerFragment f2385b;

                                                                                                                                        {
                                                                                                                                            this.f2385b = this;
                                                                                                                                        }

                                                                                                                                        @Override // androidx.lifecycle.B
                                                                                                                                        public final void a(Object obj) {
                                                                                                                                            switch (i10) {
                                                                                                                                                case 0:
                                                                                                                                                    this.f2385b.f2135W.i.setText((String) obj);
                                                                                                                                                    return;
                                                                                                                                                default:
                                                                                                                                                    ControllerFragment controllerFragment = this.f2385b;
                                                                                                                                                    controllerFragment.getClass();
                                                                                                                                                    if (((Integer) obj).intValue() == 0) {
                                                                                                                                                        controllerFragment.f2135W.f2211v.setTextColor(-1);
                                                                                                                                                        controllerFragment.f2135W.f2211v.setButtonText("替换相机");
                                                                                                                                                        controllerFragment.f2135W.f2196e.setVisibility(8);
                                                                                                                                                        return;
                                                                                                                                                    } else {
                                                                                                                                                        controllerFragment.f2135W.f2211v.setTextColor(-16711936);
                                                                                                                                                        controllerFragment.f2135W.f2211v.setButtonText("还原相机");
                                                                                                                                                        controllerFragment.f2135W.f2196e.setVisibility(0);
                                                                                                                                                        return;
                                                                                                                                                    }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    });
                                                                                                                                    final int i11 = 4;
                                                                                                                                    this.f2135W.f2213x.setOnClickListener(new View.OnClickListener(this) { // from class: f1.c

                                                                                                                                        /* renamed from: b, reason: collision with root package name */
                                                                                                                                        public final /* synthetic */ ControllerFragment f2378b;

                                                                                                                                        {
                                                                                                                                            this.f2378b = this;
                                                                                                                                        }

                                                                                                                                        @Override // android.view.View.OnClickListener
                                                                                                                                        public final void onClick(View view) {
                                                                                                                                            switch (i11) {
                                                                                                                                                case 0:
                                                                                                                                                    ControllerFragment controllerFragment = this.f2378b;
                                                                                                                                                    if (!controllerFragment.f2135W.f2207r.getButtonText().equals("保存链接")) {
                                                                                                                                                        Intent intent = new Intent("android.intent.action.GET_CONTENT");
                                                                                                                                                        intent.setType("video/*");
                                                                                                                                                        intent.addCategory("android.intent.category.OPENABLE");
                                                                                                                                                        controllerFragment.f2139a0.a(intent);
                                                                                                                                                        return;
                                                                                                                                                    }
                                                                                                                                                    String trim = controllerFragment.f2135W.f2200k.getText().toString().trim();
                                                                                                                                                    controllerFragment.f2136X.f2121a.edit().putString("PlayRtmpUrl", trim).apply();
                                                                                                                                                    Object obj = controllerFragment.f2136X.f2125f.f1543e;
                                                                                                                                                    if (obj == A.f1539j) {
                                                                                                                                                        obj = null;
                                                                                                                                                    }
                                                                                                                                                    if (((Integer) obj).intValue() != 1) {
                                                                                                                                                        t.g("保存成功");
                                                                                                                                                        return;
                                                                                                                                                    }
                                                                                                                                                    controllerFragment.f2135W.f2207r.setEnabled(false);
                                                                                                                                                    controllerFragment.f2135W.f2207r.e();
                                                                                                                                                    new Thread(new o(controllerFragment, 1, trim)).start();
                                                                                                                                                    return;
                                                                                                                                                case 1:
                                                                                                                                                    ControllerFragment controllerFragment2 = this.f2378b;
                                                                                                                                                    Object obj2 = controllerFragment2.f2136X.f2125f.f1543e;
                                                                                                                                                    if (obj2 == A.f1539j) {
                                                                                                                                                        obj2 = null;
                                                                                                                                                    }
                                                                                                                                                    if (((Integer) obj2).intValue() != 0) {
                                                                                                                                                        try {
                                                                                                                                                            ((d1.f) t.E()).k();
                                                                                                                                                            return;
                                                                                                                                                        } catch (RemoteException | Exception unused) {
                                                                                                                                                            return;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    App app = controllerFragment2.f2136X;
                                                                                                                                                    if ((app.f2121a.getInt("PlayFileType", 1) == 1 ? app.f2121a.getString("PlayFileMp4", "") : app.f2121a.getString("PlayRtmpUrl", "rtmp://ns8.indexforce.com/home/mystream")).isEmpty()) {
                                                                                                                                                        t.g("请先选择要播放的文件 或 rtmp");
                                                                                                                                                        return;
                                                                                                                                                    }
                                                                                                                                                    controllerFragment2.f2135W.f2211v.setEnabled(false);
                                                                                                                                                    controllerFragment2.f2135W.f2211v.e();
                                                                                                                                                    new Thread(new F0.b(14, controllerFragment2)).start();
                                                                                                                                                    return;
                                                                                                                                                case 2:
                                                                                                                                                    ControllerFragment controllerFragment3 = this.f2378b;
                                                                                                                                                    controllerFragment3.f2135W.f2201l.setVisibility(0);
                                                                                                                                                    HandlerThread handlerThread = new HandlerThread("CameraBackground");
                                                                                                                                                    controllerFragment3.f2143f0 = handlerThread;
                                                                                                                                                    handlerThread.start();
                                                                                                                                                    controllerFragment3.f2142e0 = new Handler(controllerFragment3.f2143f0.getLooper());
                                                                                                                                                    if (Z0.i.j(controllerFragment3.H(), "android.permission.CAMERA") != 0) {
                                                                                                                                                        controllerFragment3.f2138Z.a("android.permission.CAMERA");
                                                                                                                                                        return;
                                                                                                                                                    } else {
                                                                                                                                                        controllerFragment3.M();
                                                                                                                                                        return;
                                                                                                                                                    }
                                                                                                                                                case 3:
                                                                                                                                                    ControllerFragment controllerFragment4 = this.f2378b;
                                                                                                                                                    CameraCaptureSession cameraCaptureSession = controllerFragment4.f2140c0;
                                                                                                                                                    if (cameraCaptureSession != null) {
                                                                                                                                                        cameraCaptureSession.close();
                                                                                                                                                        controllerFragment4.f2140c0 = null;
                                                                                                                                                    }
                                                                                                                                                    CameraDevice cameraDevice = controllerFragment4.b0;
                                                                                                                                                    if (cameraDevice != null) {
                                                                                                                                                        cameraDevice.close();
                                                                                                                                                        controllerFragment4.b0 = null;
                                                                                                                                                    }
                                                                                                                                                    HandlerThread handlerThread2 = controllerFragment4.f2143f0;
                                                                                                                                                    if (handlerThread2 != null) {
                                                                                                                                                        handlerThread2.quitSafely();
                                                                                                                                                        try {
                                                                                                                                                            controllerFragment4.f2143f0.join();
                                                                                                                                                            controllerFragment4.f2143f0 = null;
                                                                                                                                                            controllerFragment4.f2142e0 = null;
                                                                                                                                                        } catch (InterruptedException e2) {
                                                                                                                                                            e2.printStackTrace();
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    controllerFragment4.f2135W.f2201l.setVisibility(8);
                                                                                                                                                    return;
                                                                                                                                                default:
                                                                                                                                                    ControllerFragment controllerFragment5 = this.f2378b;
                                                                                                                                                    if (controllerFragment5.v0 == null) {
                                                                                                                                                        t.g("开启闪烁");
                                                                                                                                                        Handler handler = new Handler(Looper.getMainLooper());
                                                                                                                                                        controllerFragment5.v0 = handler;
                                                                                                                                                        D0.i iVar = new D0.i(10, controllerFragment5);
                                                                                                                                                        controllerFragment5.f2158w0 = iVar;
                                                                                                                                                        handler.post(iVar);
                                                                                                                                                        return;
                                                                                                                                                    }
                                                                                                                                                    if (controllerFragment5.f2158w0 != null) {
                                                                                                                                                        t.g("停止闪光");
                                                                                                                                                        controllerFragment5.v0.removeCallbacks(controllerFragment5.f2158w0);
                                                                                                                                                        controllerFragment5.v0 = null;
                                                                                                                                                        controllerFragment5.f2158w0 = null;
                                                                                                                                                        if (t.Y(0).booleanValue()) {
                                                                                                                                                            controllerFragment5.f2156t0 = 0;
                                                                                                                                                        }
                                                                                                                                                        controllerFragment5.f2135W.f2201l.setBackgroundColor(-2013265920);
                                                                                                                                                        return;
                                                                                                                                                    }
                                                                                                                                                    return;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    });
                                                                                                                                    if (this.f2136X.f2121a.getInt("PlayAutoColor_mode", 1) == 1) {
                                                                                                                                        this.f2135W.f2208s.check(R.id.ssmode1);
                                                                                                                                    } else {
                                                                                                                                        this.f2135W.f2208s.check(R.id.ssmode2);
                                                                                                                                    }
                                                                                                                                    this.f2135W.f2208s.setOnCheckedChangeListener(new f1.b(1, this));
                                                                                                                                    this.f2135W.f2214y.setText("照射强度:" + ((int) (this.f2136X.f2121a.getFloat("AutoColor_intensity", 0.3f) * 100.0f)) + "%");
                                                                                                                                    this.f2135W.f2203n.setProgress((int) (this.f2136X.f2121a.getFloat("AutoColor_intensity", 0.3f) * 100.0f));
                                                                                                                                    this.f2135W.f2203n.setOnSeekBarChangeListener(new h(this, 0));
                                                                                                                                    this.f2135W.f2215z.setText("照射直径:" + ((int) (this.f2136X.f2121a.getFloat("AutoColor_diameter", 0.6f) * 100.0f)) + "%");
                                                                                                                                    this.f2135W.f2204o.setProgress((int) (this.f2136X.f2121a.getFloat("AutoColor_diameter", 0.6f) * 100.0f));
                                                                                                                                    this.f2135W.f2204o.setOnSeekBarChangeListener(new h(this, 1));
                                                                                                                                    this.f2135W.f2191A.setText("X坐标:" + this.f2136X.f2121a.getFloat("AutoColor_X", 50.0f) + "%");
                                                                                                                                    this.f2135W.f2205p.setProgress((int) this.f2136X.f2121a.getFloat("AutoColor_X", 50.0f));
                                                                                                                                    this.f2135W.f2205p.setOnSeekBarChangeListener(new h(this, 2));
                                                                                                                                    this.f2135W.f2192B.setText("Y坐标:" + this.f2136X.f2121a.getFloat("AutoColor_Y", 50.0f) + "%");
                                                                                                                                    this.f2135W.f2206q.setProgress((int) this.f2136X.f2121a.getFloat("AutoColor_Y", 50.0f));
                                                                                                                                    this.f2135W.f2206q.setOnSeekBarChangeListener(new h(this, 3));
                                                                                                                                    return constraintLayout;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    i2 = i3;
                                                                                                } else {
                                                                                                    i2 = R.id.ssmode2;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }

    @Override // Y.AbstractComponentCallbacksC0056x
    public final void v() {
        i iVar;
        this.f1165D = true;
        Handler handler = this.v0;
        if (handler != null && (iVar = this.f2158w0) != null) {
            handler.removeCallbacks(iVar);
            this.v0 = null;
            this.f2158w0 = null;
        }
        VirtualDisplay virtualDisplay = this.f2149l0;
        if (virtualDisplay != null) {
            virtualDisplay.release();
            this.f2149l0 = null;
        }
        MediaProjection mediaProjection = this.f2148k0;
        if (mediaProjection != null) {
            mediaProjection.stop();
            this.f2148k0 = null;
        }
        ImageReader imageReader = this.f2150m0;
        if (imageReader != null) {
            imageReader.close();
            this.f2150m0 = null;
        }
        Handler handler2 = this.f2151n0;
        if (handler2 != null) {
            handler2.getLooper().quitSafely();
            this.f2151n0 = null;
        }
        this.f2135W = null;
    }
}
