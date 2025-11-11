package k;

import android.view.MenuItem;

/* loaded from: classes.dex */
public final class r implements MenuItem.OnActionExpandListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f2892a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f2893b;

    public r(t tVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f2893b = tVar;
        this.f2892a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f2892a.onMenuItemActionCollapse(this.f2893b.g(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f2892a.onMenuItemActionExpand(this.f2893b.g(menuItem));
    }
}
