package Y;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: Y.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC0045l implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0049p f1126a;

    public DialogInterfaceOnCancelListenerC0045l(DialogInterfaceOnCancelListenerC0049p dialogInterfaceOnCancelListenerC0049p) {
        this.f1126a = dialogInterfaceOnCancelListenerC0049p;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0049p dialogInterfaceOnCancelListenerC0049p = this.f1126a;
        Dialog dialog = dialogInterfaceOnCancelListenerC0049p.f1141h0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0049p.onCancel(dialog);
        }
    }
}
