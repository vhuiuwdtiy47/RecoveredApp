package Y;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: Y.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC0046m implements DialogInterface.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0049p f1127a;

    public DialogInterfaceOnDismissListenerC0046m(DialogInterfaceOnCancelListenerC0049p dialogInterfaceOnCancelListenerC0049p) {
        this.f1127a = dialogInterfaceOnCancelListenerC0049p;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0049p dialogInterfaceOnCancelListenerC0049p = this.f1127a;
        Dialog dialog = dialogInterfaceOnCancelListenerC0049p.f1141h0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0049p.onDismiss(dialog);
        }
    }
}
