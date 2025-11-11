package k;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import g.DialogInterfaceC0143f;

/* loaded from: classes.dex */
public final class n implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, x {

    /* renamed from: a, reason: collision with root package name */
    public E f2859a;

    /* renamed from: b, reason: collision with root package name */
    public DialogInterfaceC0143f f2860b;

    /* renamed from: c, reason: collision with root package name */
    public i f2861c;

    @Override // k.x
    public final void b(m mVar, boolean z2) {
        DialogInterfaceC0143f dialogInterfaceC0143f;
        if ((z2 || mVar == this.f2859a) && (dialogInterfaceC0143f = this.f2860b) != null) {
            dialogInterfaceC0143f.dismiss();
        }
    }

    @Override // k.x
    public final boolean g(m mVar) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        i iVar = this.f2861c;
        if (iVar.f2831f == null) {
            iVar.f2831f = new h(iVar);
        }
        this.f2859a.q(iVar.f2831f.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f2861c.b(this.f2859a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        E e2 = this.f2859a;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f2860b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f2860b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                e2.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return e2.performShortcut(i, keyEvent, 0);
    }
}
