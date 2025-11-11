package Y;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import android.view.View;
import java.util.LinkedHashSet;

/* renamed from: Y.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0040g {

    /* renamed from: a, reason: collision with root package name */
    public Object f1113a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1114b;

    public AbstractC0040g(Context context) {
        this.f1113a = context;
    }

    public void c() {
        g.y yVar = (g.y) this.f1113a;
        if (yVar != null) {
            try {
                ((g.B) this.f1114b).f2440k.unregisterReceiver(yVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f1113a = null;
        }
    }

    public void d() {
        d0 d0Var = (d0) this.f1113a;
        H.d dVar = (H.d) this.f1114b;
        LinkedHashSet linkedHashSet = d0Var.f1104e;
        if (linkedHashSet.remove(dVar) && linkedHashSet.isEmpty()) {
            d0Var.b();
        }
    }

    public abstract IntentFilter e();

    public abstract int f();

    public MenuItem g(MenuItem menuItem) {
        if (!(menuItem instanceof F.a)) {
            return menuItem;
        }
        F.a aVar = (F.a) menuItem;
        if (((o.j) this.f1114b) == null) {
            this.f1114b = new o.j(0);
        }
        MenuItem menuItem2 = (MenuItem) ((o.j) this.f1114b).get(aVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        k.t tVar = new k.t((Context) this.f1113a, aVar);
        ((o.j) this.f1114b).put(aVar, tVar);
        return tVar;
    }

    public boolean h() {
        d0 d0Var = (d0) this.f1113a;
        View view = d0Var.f1103c.f1167F;
        q1.d.d(view, "operation.fragment.mView");
        int i = 4;
        if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
            int visibility = view.getVisibility();
            if (visibility == 0) {
                i = 2;
            } else if (visibility != 4) {
                if (visibility != 8) {
                    throw new IllegalArgumentException(D.f.b("Unknown visibility ", visibility));
                }
                i = 3;
            }
        }
        int i2 = d0Var.f1101a;
        if (i != i2) {
            return (i == 2 || i2 == 2) ? false : true;
        }
        return true;
    }

    public abstract void i();

    public void j() {
        c();
        IntentFilter e2 = e();
        if (e2.countActions() == 0) {
            return;
        }
        if (((g.y) this.f1113a) == null) {
            this.f1113a = new g.y(this);
        }
        ((g.B) this.f1114b).f2440k.registerReceiver((g.y) this.f1113a, e2);
    }

    public AbstractC0040g(d0 d0Var, H.d dVar) {
        this.f1113a = d0Var;
        this.f1114b = dVar;
    }

    public AbstractC0040g(g.B b2) {
        this.f1114b = b2;
    }
}
