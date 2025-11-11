package L;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: b, reason: collision with root package name */
    public static final u0 f388b;

    /* renamed from: a, reason: collision with root package name */
    public final s0 f389a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f388b = r0.f382q;
        } else {
            f388b = s0.f383b;
        }
    }

    public u0(WindowInsets windowInsets) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f389a = new r0(this, windowInsets);
        } else {
            this.f389a = new q0(this, windowInsets);
        }
    }

    public static u0 f(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        u0 u0Var = new u0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = S.f311a;
            u0 a2 = H.a(view);
            s0 s0Var = u0Var.f389a;
            s0Var.p(a2);
            s0Var.d(view.getRootView());
        }
        return u0Var;
    }

    public final int a() {
        return this.f389a.j().d;
    }

    public final int b() {
        return this.f389a.j().f92a;
    }

    public final int c() {
        return this.f389a.j().f94c;
    }

    public final int d() {
        return this.f389a.j().f93b;
    }

    public final WindowInsets e() {
        s0 s0Var = this.f389a;
        if (s0Var instanceof n0) {
            return ((n0) s0Var).f372c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        return Objects.equals(this.f389a, ((u0) obj).f389a);
    }

    public final int hashCode() {
        s0 s0Var = this.f389a;
        if (s0Var == null) {
            return 0;
        }
        return s0Var.hashCode();
    }

    public u0() {
        this.f389a = new s0(this);
    }
}
