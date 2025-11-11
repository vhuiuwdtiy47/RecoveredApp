package Y;

import android.util.Log;
import android.view.View;
import androidx.lifecycle.InterfaceC0096t;

/* renamed from: Y.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0047n implements androidx.lifecycle.B {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0049p f1128a;

    public C0047n(DialogInterfaceOnCancelListenerC0049p dialogInterfaceOnCancelListenerC0049p) {
        this.f1128a = dialogInterfaceOnCancelListenerC0049p;
    }

    @Override // androidx.lifecycle.B
    public final void a(Object obj) {
        if (((InterfaceC0096t) obj) != null) {
            DialogInterfaceOnCancelListenerC0049p dialogInterfaceOnCancelListenerC0049p = this.f1128a;
            if (dialogInterfaceOnCancelListenerC0049p.f1137d0) {
                View I2 = dialogInterfaceOnCancelListenerC0049p.I();
                if (I2.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                if (dialogInterfaceOnCancelListenerC0049p.f1141h0 != null) {
                    if (S.H(3)) {
                        Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + dialogInterfaceOnCancelListenerC0049p.f1141h0);
                    }
                    dialogInterfaceOnCancelListenerC0049p.f1141h0.setContentView(I2);
                }
            }
        }
    }
}
