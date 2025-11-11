package L;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class v0 extends Z0.i {

    /* renamed from: f, reason: collision with root package name */
    public final Window f390f;

    public v0(Window window, T0.e eVar) {
        this.f390f = window;
    }

    @Override // Z0.i
    public final void e0(boolean z2) {
        if (!z2) {
            m0(16);
            return;
        }
        Window window = this.f390f;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
    }

    @Override // Z0.i
    public final void f0(boolean z2) {
        if (!z2) {
            m0(8192);
            return;
        }
        Window window = this.f390f;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
    }

    public final void m0(int i) {
        View decorView = this.f390f.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }
}
