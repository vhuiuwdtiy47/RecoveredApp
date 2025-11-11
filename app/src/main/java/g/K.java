package g;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import j.AbstractC0156a;
import java.lang.ref.WeakReference;
import l.C0243l;

/* loaded from: classes.dex */
public final class K extends AbstractC0156a implements k.k {

    /* renamed from: c, reason: collision with root package name */
    public final Context f2472c;
    public final k.m d;

    /* renamed from: e, reason: collision with root package name */
    public C.j f2473e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f2474f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ L f2475g;

    public K(L l2, Context context, C.j jVar) {
        this.f2475g = l2;
        this.f2472c = context;
        this.f2473e = jVar;
        k.m mVar = new k.m(context);
        mVar.f2846l = 1;
        this.d = mVar;
        mVar.f2841e = this;
    }

    @Override // j.AbstractC0156a
    public final void a() {
        L l2 = this.f2475g;
        if (l2.f2486m != this) {
            return;
        }
        if (l2.f2493t) {
            l2.f2487n = this;
            l2.f2488o = this.f2473e;
        } else {
            this.f2473e.B(this);
        }
        this.f2473e = null;
        l2.h0(false);
        ActionBarContextView actionBarContextView = l2.f2483j;
        if (actionBarContextView.f1357k == null) {
            actionBarContextView.e();
        }
        l2.f2482g.setHideOnContentScrollEnabled(l2.f2498y);
        l2.f2486m = null;
    }

    @Override // j.AbstractC0156a
    public final View b() {
        WeakReference weakReference = this.f2474f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // j.AbstractC0156a
    public final k.m c() {
        return this.d;
    }

    @Override // j.AbstractC0156a
    public final MenuInflater d() {
        return new j.h(this.f2472c);
    }

    @Override // j.AbstractC0156a
    public final CharSequence e() {
        return this.f2475g.f2483j.getSubtitle();
    }

    @Override // j.AbstractC0156a
    public final CharSequence f() {
        return this.f2475g.f2483j.getTitle();
    }

    @Override // j.AbstractC0156a
    public final void g() {
        if (this.f2475g.f2486m != this) {
            return;
        }
        k.m mVar = this.d;
        mVar.w();
        try {
            this.f2473e.C(this, mVar);
        } finally {
            mVar.v();
        }
    }

    @Override // j.AbstractC0156a
    public final boolean h() {
        return this.f2475g.f2483j.f1365s;
    }

    @Override // j.AbstractC0156a
    public final void i(View view) {
        this.f2475g.f2483j.setCustomView(view);
        this.f2474f = new WeakReference(view);
    }

    @Override // j.AbstractC0156a
    public final void j(int i) {
        k(this.f2475g.f2480e.getResources().getString(i));
    }

    @Override // j.AbstractC0156a
    public final void k(CharSequence charSequence) {
        this.f2475g.f2483j.setSubtitle(charSequence);
    }

    @Override // j.AbstractC0156a
    public final void l(int i) {
        m(this.f2475g.f2480e.getResources().getString(i));
    }

    @Override // j.AbstractC0156a
    public final void m(CharSequence charSequence) {
        this.f2475g.f2483j.setTitle(charSequence);
    }

    @Override // j.AbstractC0156a
    public final void n(boolean z2) {
        this.f2684b = z2;
        this.f2475g.f2483j.setTitleOptional(z2);
    }

    @Override // k.k
    public final void p(k.m mVar) {
        if (this.f2473e == null) {
            return;
        }
        g();
        C0243l c0243l = this.f2475g.f2483j.d;
        if (c0243l != null) {
            c0243l.o();
        }
    }

    @Override // k.k
    public final boolean q(k.m mVar, MenuItem menuItem) {
        C.j jVar = this.f2473e;
        if (jVar != null) {
            return ((U.v) jVar.f60b).l(this, menuItem);
        }
        return false;
    }
}
