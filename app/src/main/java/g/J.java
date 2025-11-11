package g;

import L.S;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class J extends Z0.i {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2470f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ L f2471g;

    public /* synthetic */ J(L l2, int i) {
        this.f2470f = i;
        this.f2471g = l2;
    }

    @Override // L.Z
    public final void a() {
        View view;
        L l2 = this.f2471g;
        switch (this.f2470f) {
            case 0:
                if (l2.f2492s && (view = l2.f2484k) != null) {
                    view.setTranslationY(0.0f);
                    l2.h.setTranslationY(0.0f);
                }
                l2.h.setVisibility(8);
                l2.h.setTransitioning(false);
                l2.f2496w = null;
                C.j jVar = l2.f2488o;
                if (jVar != null) {
                    jVar.B(l2.f2487n);
                    l2.f2487n = null;
                    l2.f2488o = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = l2.f2482g;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = S.f311a;
                    L.E.c(actionBarOverlayLayout);
                    return;
                }
                return;
            default:
                l2.f2496w = null;
                l2.h.requestLayout();
                return;
        }
    }
}
