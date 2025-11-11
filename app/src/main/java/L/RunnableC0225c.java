package l;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: l.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0225c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3067a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f3068b;

    public /* synthetic */ RunnableC0225c(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f3067a = i;
        this.f3068b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3067a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f3068b;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f1391w = actionBarOverlayLayout.d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f1392x);
                return;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f3068b;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f1391w = actionBarOverlayLayout2.d.animate().translationY(-actionBarOverlayLayout2.d.getHeight()).setListener(actionBarOverlayLayout2.f1392x);
                return;
        }
    }
}
