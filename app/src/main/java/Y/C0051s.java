package Y;

import android.view.View;

/* renamed from: Y.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0051s extends U.t {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC0056x f1148e;

    public C0051s(AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x) {
        this.f1148e = abstractComponentCallbacksC0056x;
    }

    @Override // U.t
    public final View P(int i) {
        AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x = this.f1148e;
        View view = abstractComponentCallbacksC0056x.f1167F;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0056x + " does not have a view");
    }

    @Override // U.t
    public final boolean Q() {
        return this.f1148e.f1167F != null;
    }
}
