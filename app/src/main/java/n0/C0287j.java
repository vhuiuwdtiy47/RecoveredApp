package n0;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: n0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0287j extends K {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0289l f3387a;

    public C0287j(C0289l c0289l) {
        this.f3387a = c0289l;
    }

    @Override // n0.K
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        C0289l c0289l = this.f3387a;
        int computeVerticalScrollRange = c0289l.f3409s.computeVerticalScrollRange();
        int i3 = c0289l.f3408r;
        int i4 = computeVerticalScrollRange - i3;
        int i5 = c0289l.f3394a;
        c0289l.f3410t = i4 > 0 && i3 >= i5;
        int computeHorizontalScrollRange = c0289l.f3409s.computeHorizontalScrollRange();
        int i6 = c0289l.f3407q;
        boolean z2 = computeHorizontalScrollRange - i6 > 0 && i6 >= i5;
        c0289l.f3411u = z2;
        boolean z3 = c0289l.f3410t;
        if (!z3 && !z2) {
            if (c0289l.f3412v != 0) {
                c0289l.f(0);
                return;
            }
            return;
        }
        if (z3) {
            float f2 = i3;
            c0289l.f3402l = (int) ((((f2 / 2.0f) + computeVerticalScrollOffset) * f2) / computeVerticalScrollRange);
            c0289l.f3401k = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
        }
        if (c0289l.f3411u) {
            float f3 = computeHorizontalScrollOffset;
            float f4 = i6;
            c0289l.f3405o = (int) ((((f4 / 2.0f) + f3) * f4) / computeHorizontalScrollRange);
            c0289l.f3404n = Math.min(i6, (i6 * i6) / computeHorizontalScrollRange);
        }
        int i7 = c0289l.f3412v;
        if (i7 == 0 || i7 == 1) {
            c0289l.f(1);
        }
    }
}
