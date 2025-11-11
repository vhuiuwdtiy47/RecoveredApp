package g;

import L.S;
import L.Y;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2552a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B f2553b;

    public /* synthetic */ q(B b2, int i) {
        this.f2552a = i;
        this.f2553b = b2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f2552a) {
            case 0:
                B b2 = this.f2553b;
                if ((b2.f2432Z & 1) != 0) {
                    b2.u(0);
                }
                if ((b2.f2432Z & 4096) != 0) {
                    b2.u(108);
                }
                b2.f2431Y = false;
                b2.f2432Z = 0;
                return;
            default:
                B b3 = this.f2553b;
                b3.f2452w.showAtLocation(b3.f2451v, 55, 0, 0);
                Y y2 = b3.f2454y;
                if (y2 != null) {
                    y2.b();
                }
                if (!(b3.f2455z && (viewGroup = b3.f2408A) != null && viewGroup.isLaidOut())) {
                    b3.f2451v.setAlpha(1.0f);
                    b3.f2451v.setVisibility(0);
                    return;
                }
                b3.f2451v.setAlpha(0.0f);
                Y a2 = S.a(b3.f2451v);
                a2.a(1.0f);
                b3.f2454y = a2;
                a2.d(new s(0, this));
                return;
        }
    }
}
