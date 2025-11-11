package W0;

import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes.dex */
public final class f extends q {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f853e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(p pVar, int i) {
        super(pVar);
        this.f853e = i;
    }

    @Override // W0.q
    public void r() {
        switch (this.f853e) {
            case 0:
                p pVar = this.f898b;
                pVar.f889o = null;
                CheckableImageButton checkableImageButton = pVar.f883g;
                checkableImageButton.setOnLongClickListener(null);
                U.t.b0(checkableImageButton, null);
                return;
            default:
                return;
        }
    }
}
