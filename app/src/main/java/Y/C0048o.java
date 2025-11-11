package Y;

import android.app.Dialog;
import android.view.View;

/* renamed from: Y.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0048o extends U.t {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0051s f1129e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0049p f1130f;

    public C0048o(DialogInterfaceOnCancelListenerC0049p dialogInterfaceOnCancelListenerC0049p, C0051s c0051s) {
        this.f1130f = dialogInterfaceOnCancelListenerC0049p;
        this.f1129e = c0051s;
    }

    @Override // U.t
    public final View P(int i) {
        C0051s c0051s = this.f1129e;
        if (c0051s.Q()) {
            return c0051s.P(i);
        }
        Dialog dialog = this.f1130f.f1141h0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // U.t
    public final boolean Q() {
        return this.f1129e.Q() || this.f1130f.f1145l0;
    }
}
