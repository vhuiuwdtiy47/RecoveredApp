package Y;

import android.os.Bundle;
import p0.C0309a;

/* loaded from: classes.dex */
public final class r extends AbstractC0055w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC0056x f1147a;

    public r(AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x) {
        this.f1147a = abstractComponentCallbacksC0056x;
    }

    @Override // Y.AbstractC0055w
    public final void a() {
        AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x = this.f1147a;
        ((C0309a) abstractComponentCallbacksC0056x.f1178R.f60b).a();
        androidx.lifecycle.L.d(abstractComponentCallbacksC0056x);
        Bundle bundle = abstractComponentCallbacksC0056x.f1183b;
        abstractComponentCallbacksC0056x.f1178R.F(bundle != null ? bundle.getBundle("registryState") : null);
    }
}
