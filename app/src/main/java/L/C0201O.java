package l;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import k.ViewTreeObserverOnGlobalLayoutListenerC0170d;

/* renamed from: l.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0201O implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0170d f2997a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0203P f2998b;

    public C0201O(C0203P c0203p, ViewTreeObserverOnGlobalLayoutListenerC0170d viewTreeObserverOnGlobalLayoutListenerC0170d) {
        this.f2998b = c0203p;
        this.f2997a = viewTreeObserverOnGlobalLayoutListenerC0170d;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f2998b.f3003E.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f2997a);
        }
    }
}
