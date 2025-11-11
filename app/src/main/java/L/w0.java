package L;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public final class w0 extends Z0.i {

    /* renamed from: f, reason: collision with root package name */
    public final WindowInsetsController f391f;

    /* renamed from: g, reason: collision with root package name */
    public Window f392g;

    public w0(WindowInsetsController windowInsetsController, T0.e eVar) {
        this.f391f = windowInsetsController;
    }

    @Override // Z0.i
    public final void e0(boolean z2) {
        Window window = this.f392g;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f391f.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f391f.setSystemBarsAppearance(0, 16);
    }

    @Override // Z0.i
    public final void f0(boolean z2) {
        Window window = this.f392g;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f391f.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f391f.setSystemBarsAppearance(0, 8);
    }
}
