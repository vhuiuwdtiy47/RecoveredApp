package L;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class p0 extends o0 {
    public p0(u0 u0Var, WindowInsets windowInsets) {
        super(u0Var, windowInsets);
    }

    @Override // L.s0
    public u0 a() {
        return u0.f(null, this.f372c.consumeDisplayCutout());
    }

    @Override // L.s0
    public C0014j e() {
        DisplayCutout displayCutout = this.f372c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0014j(displayCutout);
    }

    @Override // L.s0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return Objects.equals(this.f372c, p0Var.f372c) && Objects.equals(this.f375g, p0Var.f375g);
    }

    @Override // L.s0
    public int hashCode() {
        return this.f372c.hashCode();
    }
}
