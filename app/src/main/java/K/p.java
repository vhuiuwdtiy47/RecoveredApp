package k;

import android.view.ActionProvider;

/* loaded from: classes.dex */
public final class p implements ActionProvider.VisibilityListener {

    /* renamed from: a, reason: collision with root package name */
    public A0.c f2888a;

    /* renamed from: b, reason: collision with root package name */
    public final ActionProvider f2889b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f2890c;

    public p(t tVar, ActionProvider actionProvider) {
        this.f2890c = tVar;
        this.f2889b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z2) {
        A0.c cVar = this.f2888a;
        if (cVar != null) {
            m mVar = ((o) cVar.f33b).f2875n;
            mVar.h = true;
            mVar.p(true);
        }
    }
}
