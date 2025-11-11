package n0;

import L.C0016l;
import L.C0021q;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class D {

    /* renamed from: a, reason: collision with root package name */
    public C0301y f3236a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f3237b;

    /* renamed from: c, reason: collision with root package name */
    public long f3238c;
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public long f3239e;

    /* renamed from: f, reason: collision with root package name */
    public long f3240f;

    public static void b(W w2) {
        RecyclerView recyclerView;
        int i = w2.f3303j;
        if (w2.f() || (i & 4) != 0 || (recyclerView = w2.f3311r) == null) {
            return;
        }
        recyclerView.F(w2);
    }

    public abstract boolean a(W w2, W w3, C0021q c0021q, C0021q c0021q2);

    public final void c(W w2) {
        C0301y c0301y = this.f3236a;
        if (c0301y != null) {
            boolean z2 = true;
            w2.n(true);
            if (w2.h != null && w2.i == null) {
                w2.h = null;
            }
            w2.i = null;
            if ((w2.f3303j & 16) != 0) {
                return;
            }
            RecyclerView recyclerView = c0301y.f3472a;
            recyclerView.a0();
            C0016l c0016l = recyclerView.f1668e;
            C0301y c0301y2 = (C0301y) c0016l.f361b;
            RecyclerView recyclerView2 = c0301y2.f3472a;
            View view = w2.f3297a;
            int indexOfChild = recyclerView2.indexOfChild(view);
            if (indexOfChild == -1) {
                c0016l.w(view);
            } else {
                C0279b c0279b = (C0279b) c0016l.f362c;
                if (c0279b.d(indexOfChild)) {
                    c0279b.f(indexOfChild);
                    c0016l.w(view);
                    c0301y2.h(indexOfChild);
                } else {
                    z2 = false;
                }
            }
            if (z2) {
                W I2 = RecyclerView.I(view);
                N n2 = recyclerView.f1664b;
                n2.j(I2);
                n2.g(I2);
            }
            recyclerView.b0(!z2);
            if (z2 || !w2.j()) {
                return;
            }
            recyclerView.removeDetachedView(view, false);
        }
    }

    public abstract void d(W w2);

    public abstract void e();

    public abstract boolean f();
}
