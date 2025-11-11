package W0;

import android.view.View;

/* renamed from: W0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC0032b implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f840a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f841b;

    public /* synthetic */ ViewOnFocusChangeListenerC0032b(q qVar, int i) {
        this.f840a = i;
        this.f841b = qVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z2) {
        switch (this.f840a) {
            case 0:
                e eVar = (e) this.f841b;
                eVar.t(eVar.u());
                return;
            default:
                k kVar = (k) this.f841b;
                kVar.f864l = z2;
                kVar.q();
                if (z2) {
                    return;
                }
                kVar.t(false);
                kVar.f865m = false;
                return;
        }
    }
}
