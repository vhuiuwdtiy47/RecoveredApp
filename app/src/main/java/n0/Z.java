package n0;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class Z extends K {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3314a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0300x f3315b;

    public Z(C0300x c0300x) {
        this.f3315b = c0300x;
    }

    @Override // n0.K
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0 && this.f3314a) {
            this.f3314a = false;
            this.f3315b.f();
        }
    }

    @Override // n0.K
    public final void b(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.f3314a = true;
    }
}
