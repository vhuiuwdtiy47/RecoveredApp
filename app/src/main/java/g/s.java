package g;

import L.S;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class s extends Z0.i {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2556f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2557g;

    public /* synthetic */ s(int i, Object obj) {
        this.f2556f = i;
        this.f2557g = obj;
    }

    @Override // L.Z
    public final void a() {
        Object obj = this.f2557g;
        switch (this.f2556f) {
            case 0:
                B b2 = ((q) obj).f2553b;
                b2.f2451v.setAlpha(1.0f);
                b2.f2454y.d(null);
                b2.f2454y = null;
                return;
            case 1:
                B b3 = (B) obj;
                b3.f2451v.setAlpha(1.0f);
                b3.f2454y.d(null);
                b3.f2454y = null;
                return;
            default:
                C.j jVar = (C.j) obj;
                ((B) jVar.f61c).f2451v.setVisibility(8);
                B b4 = (B) jVar.f61c;
                PopupWindow popupWindow = b4.f2452w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (b4.f2451v.getParent() instanceof View) {
                    View view = (View) b4.f2451v.getParent();
                    WeakHashMap weakHashMap = S.f311a;
                    L.E.c(view);
                }
                b4.f2451v.e();
                b4.f2454y.d(null);
                b4.f2454y = null;
                ViewGroup viewGroup = b4.f2408A;
                WeakHashMap weakHashMap2 = S.f311a;
                L.E.c(viewGroup);
                return;
        }
    }

    @Override // Z0.i, L.Z
    public void c() {
        Object obj = this.f2557g;
        switch (this.f2556f) {
            case 0:
                ((q) obj).f2553b.f2451v.setVisibility(0);
                return;
            case 1:
                B b2 = (B) obj;
                b2.f2451v.setVisibility(0);
                if (b2.f2451v.getParent() instanceof View) {
                    View view = (View) b2.f2451v.getParent();
                    WeakHashMap weakHashMap = S.f311a;
                    L.E.c(view);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
