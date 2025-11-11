package f1;

import android.widget.SeekBar;
import com.xiaomi.vlive.ui.controller.ControllerFragment;

/* loaded from: classes.dex */
public final class h implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2386a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ControllerFragment f2387b;

    public /* synthetic */ h(ControllerFragment controllerFragment, int i) {
        this.f2386a = i;
        this.f2387b = controllerFragment;
    }

    private final void a(SeekBar seekBar) {
    }

    private final void b(SeekBar seekBar) {
    }

    private final void c(SeekBar seekBar) {
    }

    private final void d(SeekBar seekBar) {
    }

    private final void e(SeekBar seekBar) {
    }

    private final void f(SeekBar seekBar) {
    }

    private final void g(SeekBar seekBar) {
    }

    private final void h(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z2) {
        switch (this.f2386a) {
            case 0:
                ControllerFragment controllerFragment = this.f2387b;
                controllerFragment.f2135W.f2214y.setText("照射强度:" + i + "%");
                controllerFragment.f2136X.f2121a.edit().putFloat("AutoColor_intensity", ((float) i) / 100.0f).apply();
                return;
            case 1:
                ControllerFragment controllerFragment2 = this.f2387b;
                controllerFragment2.f2135W.f2215z.setText("照射直径:" + i + "%");
                controllerFragment2.f2136X.f2121a.edit().putFloat("AutoColor_diameter", ((float) i) / 100.0f).apply();
                return;
            case 2:
                ControllerFragment controllerFragment3 = this.f2387b;
                controllerFragment3.f2135W.f2191A.setText("X坐标:" + i + "%");
                controllerFragment3.f2136X.f2121a.edit().putFloat("AutoColor_X", (float) i).apply();
                return;
            default:
                ControllerFragment controllerFragment4 = this.f2387b;
                controllerFragment4.f2135W.f2192B.setText("Y坐标:" + i + "%");
                controllerFragment4.f2136X.f2121a.edit().putFloat("AutoColor_Y", (float) i).apply();
                return;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        int i = this.f2386a;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        int i = this.f2386a;
    }
}
