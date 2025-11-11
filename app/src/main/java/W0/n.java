package W0;

import L.E;
import L.S;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import java.util.WeakHashMap;
import k.D;

/* loaded from: classes.dex */
public final class n implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f873a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f874b;

    public /* synthetic */ n(int i, Object obj) {
        this.f873a = i;
        this.f874b = obj;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager;
        Object obj = this.f874b;
        switch (this.f873a) {
            case 0:
                p pVar = (p) obj;
                if (pVar.f895u == null || (accessibilityManager = pVar.f894t) == null) {
                    return;
                }
                WeakHashMap weakHashMap = S.f311a;
                if (pVar.isAttachedToWindow()) {
                    accessibilityManager.addTouchExplorationStateChangeListener(new M.b(pVar.f895u));
                    return;
                }
                return;
            case 1:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap2 = S.f311a;
                E.c(view2);
                return;
            case 2:
            default:
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.f873a) {
            case 0:
                p pVar = (p) this.f874b;
                Q.b bVar = pVar.f895u;
                if (bVar == null || (accessibilityManager = pVar.f894t) == null) {
                    return;
                }
                accessibilityManager.removeTouchExplorationStateChangeListener(new M.b(bVar));
                return;
            case 1:
                return;
            case 2:
                k.g gVar = (k.g) this.f874b;
                ViewTreeObserver viewTreeObserver = gVar.f2822x;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        gVar.f2822x = view.getViewTreeObserver();
                    }
                    gVar.f2822x.removeGlobalOnLayoutListener(gVar.i);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            default:
                D d = (D) this.f874b;
                ViewTreeObserver viewTreeObserver2 = d.f2772o;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        d.f2772o = view.getViewTreeObserver();
                    }
                    d.f2772o.removeGlobalOnLayoutListener(d.i);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
        }
    }
}
