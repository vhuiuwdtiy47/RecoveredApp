package com.xiaomi.vlive;

import A.b;
import C.j;
import O0.i;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.android.music.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import f0.C0125a;
import f0.C0133i;
import f0.v;
import f0.y;
import g.AbstractActivityC0146i;
import g.C0144g;
import g.C0145h;
import j1.q;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import k0.C0172a;
import l.AbstractC0271z;
import q1.d;
import w1.c;
import w1.f;
import w1.h;

/* loaded from: classes.dex */
public class MainActivity extends AbstractActivityC0146i {

    /* renamed from: x, reason: collision with root package name */
    public i f2134x;

    public MainActivity() {
        ((j) this.f1270e.f61c).I("androidx:appcompat", new C0144g(this));
        g(new C0145h(this));
    }

    @Override // g.AbstractActivityC0146i, a.AbstractActivityC0068j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View inflate = getLayoutInflater().inflate(R.layout.activity_main, (ViewGroup) null, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
        BottomNavigationView bottomNavigationView = (BottomNavigationView) AbstractC0271z.i(inflate, R.id.nav_view);
        if (bottomNavigationView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.nav_view)));
        }
        this.f2134x = new i(constraintLayout, bottomNavigationView);
        setContentView(constraintLayout);
        int[] iArr = {R.id.navigation_home, R.id.navigation_controller, R.id.navigation_settings};
        HashSet hashSet = new HashSet();
        for (int i = 0; i < 3; i++) {
            hashSet.add(Integer.valueOf(iArr[i]));
        }
        View view = (View) b.a(this, R.id.nav_host_fragment_activity_main);
        d.d(view, "requireViewById(...)");
        c cVar = new c(new q(1, new h(f.y(view, new C0125a(5)), new C0125a(6), 1)));
        y yVar = (y) (cVar.hasNext() ? cVar.next() : null);
        if (yVar == null) {
            throw new IllegalStateException("Activity " + this + " does not have a NavController set on 2131231077");
        }
        BottomNavigationView bottomNavigationView2 = this.f2134x.f574a;
        bottomNavigationView2.setOnItemSelectedListener(new Q.b(yVar));
        C0172a c0172a = new C0172a(new WeakReference(bottomNavigationView2), yVar);
        i0.j jVar = yVar.f2365b;
        jVar.getClass();
        jVar.f2647o.add(c0172a);
        j1.h hVar = jVar.f2640f;
        if (hVar.isEmpty()) {
            return;
        }
        C0133i c0133i = (C0133i) hVar.e();
        v vVar = c0133i.f2306b;
        c0133i.h.a();
        c0172a.a(jVar.f2636a, vVar);
    }
}
