package a;

import android.view.View;
import android.view.Window;
import androidx.lifecycle.EnumC0091n;
import androidx.lifecycle.InterfaceC0096t;
import androidx.lifecycle.V;
import g.AbstractActivityC0146i;

/* renamed from: a.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0064f implements androidx.lifecycle.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1261a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0146i f1262b;

    public /* synthetic */ C0064f(AbstractActivityC0146i abstractActivityC0146i, int i) {
        this.f1261a = i;
        this.f1262b = abstractActivityC0146i;
    }

    @Override // androidx.lifecycle.r
    public final void a(InterfaceC0096t interfaceC0096t, EnumC0091n enumC0091n) {
        switch (this.f1261a) {
            case 0:
                if (enumC0091n == EnumC0091n.ON_STOP) {
                    Window window = this.f1262b.getWindow();
                    View peekDecorView = window != null ? window.peekDecorView() : null;
                    if (peekDecorView != null) {
                        peekDecorView.cancelPendingInputEvents();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (enumC0091n == EnumC0091n.ON_DESTROY) {
                    this.f1262b.f1268b.f1724b = null;
                    if (!this.f1262b.isChangingConfigurations()) {
                        this.f1262b.c().a();
                    }
                    ExecutorC0067i executorC0067i = this.f1262b.h;
                    AbstractActivityC0146i abstractActivityC0146i = executorC0067i.d;
                    abstractActivityC0146i.getWindow().getDecorView().removeCallbacks(executorC0067i);
                    abstractActivityC0146i.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(executorC0067i);
                    return;
                }
                return;
            default:
                AbstractActivityC0146i abstractActivityC0146i2 = this.f1262b;
                if (abstractActivityC0146i2.f1271f == null) {
                    C0066h c0066h = (C0066h) abstractActivityC0146i2.getLastNonConfigurationInstance();
                    if (c0066h != null) {
                        abstractActivityC0146i2.f1271f = c0066h.f1263a;
                    }
                    if (abstractActivityC0146i2.f1271f == null) {
                        abstractActivityC0146i2.f1271f = new V();
                    }
                }
                abstractActivityC0146i2.d.f(this);
                return;
        }
    }
}
