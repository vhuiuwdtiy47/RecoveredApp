package L;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract class H {
    public static u0 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        u0 f2 = u0.f(null, rootWindowInsets);
        s0 s0Var = f2.f389a;
        s0Var.p(f2);
        s0Var.d(view.getRootView());
        return f2;
    }

    public static int b(View view) {
        return view.getScrollIndicators();
    }

    public static void c(View view, int i) {
        view.setScrollIndicators(i);
    }

    public static void d(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }
}
