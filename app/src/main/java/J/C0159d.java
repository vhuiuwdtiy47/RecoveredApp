package j;

import U.v;
import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import l.C0243l;

/* renamed from: j.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0159d extends AbstractC0156a implements k.k {

    /* renamed from: c, reason: collision with root package name */
    public Context f2690c;
    public ActionBarContextView d;

    /* renamed from: e, reason: collision with root package name */
    public C.j f2691e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f2692f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2693g;
    public k.m h;

    @Override // j.AbstractC0156a
    public final void a() {
        if (this.f2693g) {
            return;
        }
        this.f2693g = true;
        this.f2691e.B(this);
    }

    @Override // j.AbstractC0156a
    public final View b() {
        WeakReference weakReference = this.f2692f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // j.AbstractC0156a
    public final k.m c() {
        return this.h;
    }

    @Override // j.AbstractC0156a
    public final MenuInflater d() {
        return new h(this.d.getContext());
    }

    @Override // j.AbstractC0156a
    public final CharSequence e() {
        return this.d.getSubtitle();
    }

    @Override // j.AbstractC0156a
    public final CharSequence f() {
        return this.d.getTitle();
    }

    @Override // j.AbstractC0156a
    public final void g() {
        this.f2691e.C(this, this.h);
    }

    @Override // j.AbstractC0156a
    public final boolean h() {
        return this.d.f1365s;
    }

    @Override // j.AbstractC0156a
    public final void i(View view) {
        this.d.setCustomView(view);
        this.f2692f = view != null ? new WeakReference(view) : null;
    }

    @Override // j.AbstractC0156a
    public final void j(int i) {
        k(this.f2690c.getString(i));
    }

    @Override // j.AbstractC0156a
    public final void k(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override // j.AbstractC0156a
    public final void l(int i) {
        m(this.f2690c.getString(i));
    }

    @Override // j.AbstractC0156a
    public final void m(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override // j.AbstractC0156a
    public final void n(boolean z2) {
        this.f2684b = z2;
        this.d.setTitleOptional(z2);
    }

    @Override // k.k
    public final void p(k.m mVar) {
        g();
        C0243l c0243l = this.d.d;
        if (c0243l != null) {
            c0243l.o();
        }
    }

    @Override // k.k
    public final boolean q(k.m mVar, MenuItem menuItem) {
        return ((v) this.f2691e.f60b).l(this, menuItem);
    }
}
