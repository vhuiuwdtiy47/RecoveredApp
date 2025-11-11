package L;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public final class r0 extends q0 {

    /* renamed from: q, reason: collision with root package name */
    public static final u0 f382q;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f382q = u0.f(null, windowInsets);
    }

    public r0(u0 u0Var, WindowInsets windowInsets) {
        super(u0Var, windowInsets);
    }

    @Override // L.n0, L.s0
    public final void d(View view) {
    }

    @Override // L.n0, L.s0
    public D.c f(int i) {
        Insets insets;
        insets = this.f372c.getInsets(t0.a(i));
        return D.c.c(insets);
    }
}
