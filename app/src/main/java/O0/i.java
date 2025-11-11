package O0;

import U.t;
import android.util.Log;
import android.view.MenuItem;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.android.music.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import f0.C0118A;
import f0.C0126b;
import f0.v;
import f0.w;
import f0.y;

/* loaded from: classes.dex */
public final class i implements k.k {

    /* renamed from: a, reason: collision with root package name */
    public final BottomNavigationView f574a;

    public i(ConstraintLayout constraintLayout, BottomNavigationView bottomNavigationView) {
        this.f574a = bottomNavigationView;
    }

    @Override // k.k
    public void p(k.m mVar) {
    }

    @Override // k.k
    public boolean q(k.m mVar, MenuItem menuItem) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z2;
        k kVar = this.f574a.f579e;
        if (kVar == null) {
            return false;
        }
        q1.d.e(menuItem, "item");
        y yVar = (y) ((Q.b) kVar).f583a;
        i0.j jVar = yVar.f2365b;
        v f2 = jVar.f();
        q1.d.b(f2);
        w wVar = f2.f2360c;
        q1.d.b(wVar);
        if (wVar.g(menuItem.getItemId()) instanceof C0126b) {
            i = R.anim.nav_default_enter_anim;
            i2 = R.anim.nav_default_exit_anim;
            i3 = R.anim.nav_default_pop_enter_anim;
            i4 = R.anim.nav_default_pop_exit_anim;
        } else {
            i = R.animator.nav_default_enter_anim;
            i2 = R.animator.nav_default_exit_anim;
            i3 = R.animator.nav_default_pop_enter_anim;
            i4 = R.animator.nav_default_pop_exit_anim;
        }
        int i6 = i;
        int i7 = i2;
        int i8 = i3;
        int i9 = i4;
        if ((menuItem.getOrder() & 196608) == 0) {
            int i10 = w.h;
            i5 = t.r(jVar.g()).f2359b.f2660a;
            z2 = true;
        } else {
            i5 = -1;
            z2 = false;
        }
        try {
            yVar.a(menuItem.getItemId(), new C0118A(true, true, i5, false, z2, i6, i7, i8, i9));
            v f3 = jVar.f();
            if (f3 != null) {
                if (t.N(menuItem.getItemId(), f3)) {
                    return false;
                }
            }
        } catch (IllegalArgumentException e2) {
            int i11 = v.f2357f;
            StringBuilder e3 = D.f.e("Ignoring onNavDestinationSelected for MenuItem ", t.t(new U.m(yVar.f2364a, 1), menuItem.getItemId()), " as it cannot be found from the current destination ");
            e3.append(jVar.f());
            Log.i("NavigationUI", e3.toString(), e2);
        }
        return true;
    }

    public i(BottomNavigationView bottomNavigationView) {
        this.f574a = bottomNavigationView;
    }
}
