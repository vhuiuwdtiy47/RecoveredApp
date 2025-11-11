package k;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import l.C0190I0;
import l.C0203P;
import l.C0210T;

/* renamed from: k.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0170d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2795a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2796b;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0170d(int i, Object obj) {
        this.f2795a = i;
        this.f2796b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f2795a) {
            case 0:
                g gVar = (g) this.f2796b;
                if (gVar.a()) {
                    ArrayList arrayList = gVar.h;
                    if (arrayList.size() <= 0 || ((f) arrayList.get(0)).f2800a.f2959y) {
                        return;
                    }
                    View view = gVar.f2813o;
                    if (view == null || !view.isShown()) {
                        gVar.dismiss();
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((f) it.next()).f2800a.show();
                    }
                    return;
                }
                return;
            case 1:
                D d = (D) this.f2796b;
                if (d.a()) {
                    C0190I0 c0190i0 = d.h;
                    if (c0190i0.f2959y) {
                        return;
                    }
                    View view2 = d.f2770m;
                    if (view2 == null || !view2.isShown()) {
                        d.dismiss();
                        return;
                    } else {
                        c0190i0.show();
                        return;
                    }
                }
                return;
            case 2:
                C0210T c0210t = (C0210T) this.f2796b;
                if (!c0210t.getInternalPopup().a()) {
                    c0210t.f3019f.g(c0210t.getTextDirection(), c0210t.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = c0210t.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    return;
                }
                return;
            default:
                C0203P c0203p = (C0203P) this.f2796b;
                C0210T c0210t2 = c0203p.f3003E;
                c0203p.getClass();
                if (!c0210t2.isAttachedToWindow() || !c0210t2.getGlobalVisibleRect(c0203p.f3001C)) {
                    c0203p.dismiss();
                    return;
                } else {
                    c0203p.q();
                    c0203p.show();
                    return;
                }
        }
    }
}
