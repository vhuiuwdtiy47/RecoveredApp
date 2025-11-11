package L;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class d0 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final C0008d f333a;

    /* renamed from: b, reason: collision with root package name */
    public u0 f334b;

    public d0(View view, C0008d c0008d) {
        u0 u0Var;
        this.f333a = c0008d;
        WeakHashMap weakHashMap = S.f311a;
        u0 a2 = H.a(view);
        if (a2 != null) {
            u0Var = (Build.VERSION.SDK_INT >= 30 ? new l0(a2) : new k0(a2)).b();
        } else {
            u0Var = null;
        }
        this.f334b = u0Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        s0 s0Var;
        if (!view.isLaidOut()) {
            this.f334b = u0.f(view, windowInsets);
            return e0.i(view, windowInsets);
        }
        u0 f2 = u0.f(view, windowInsets);
        if (this.f334b == null) {
            WeakHashMap weakHashMap = S.f311a;
            this.f334b = H.a(view);
        }
        if (this.f334b == null) {
            this.f334b = f2;
            return e0.i(view, windowInsets);
        }
        C0008d j2 = e0.j(view);
        if (j2 != null && Objects.equals((WindowInsets) j2.f329b, windowInsets)) {
            return e0.i(view, windowInsets);
        }
        u0 u0Var = this.f334b;
        int i = 1;
        int i2 = 0;
        while (true) {
            s0Var = f2.f389a;
            if (i > 256) {
                break;
            }
            if (!s0Var.f(i).equals(u0Var.f389a.f(i))) {
                i2 |= i;
            }
            i <<= 1;
        }
        if (i2 == 0) {
            return e0.i(view, windowInsets);
        }
        u0 u0Var2 = this.f334b;
        i0 i0Var = new i0(i2, (i2 & 8) != 0 ? s0Var.f(8).d > u0Var2.f389a.f(8).d ? e0.f335e : e0.f336f : e0.f337g, 160L);
        i0Var.f353a.d(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(i0Var.f353a.a());
        D.c f3 = s0Var.f(i2);
        D.c f4 = u0Var2.f389a.f(i2);
        int min = Math.min(f3.f92a, f4.f92a);
        int i3 = f3.f93b;
        int i4 = f4.f93b;
        int min2 = Math.min(i3, i4);
        int i5 = f3.f94c;
        int i6 = f4.f94c;
        int min3 = Math.min(i5, i6);
        int i7 = f3.d;
        int i8 = f4.d;
        C.j jVar = new C.j(D.c.b(min, min2, min3, Math.min(i7, i8)), 2, D.c.b(Math.max(f3.f92a, f4.f92a), Math.max(i3, i4), Math.max(i5, i6), Math.max(i7, i8)));
        e0.f(view, windowInsets, false);
        duration.addUpdateListener(new b0(i0Var, f2, u0Var2, i2, view));
        duration.addListener(new c0(i0Var, view));
        ViewTreeObserverOnPreDrawListenerC0024u.a(view, new I.l(view, i0Var, jVar, duration));
        this.f334b = f2;
        return e0.i(view, windowInsets);
    }
}
