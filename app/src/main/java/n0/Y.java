package n0;

import L.C0006b;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class Y extends C0006b {
    public final RecyclerView d;

    /* renamed from: e, reason: collision with root package name */
    public final X f3313e;

    public Y(RecyclerView recyclerView) {
        this.d = recyclerView;
        X x2 = this.f3313e;
        if (x2 != null) {
            this.f3313e = x2;
        } else {
            this.f3313e = new X(this);
        }
    }

    @Override // L.C0006b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.d.K()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().T(accessibilityEvent);
        }
    }

    @Override // L.C0006b
    public final void d(View view, M.k kVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f319a;
        AccessibilityNodeInfo accessibilityNodeInfo = kVar.f417a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        RecyclerView recyclerView = this.d;
        if (recyclerView.K() || recyclerView.getLayoutManager() == null) {
            return;
        }
        H layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f3247b;
        N n2 = recyclerView2.f1664b;
        if (recyclerView2.canScrollVertically(-1) || layoutManager.f3247b.canScrollHorizontally(-1)) {
            kVar.a(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (layoutManager.f3247b.canScrollVertically(1) || layoutManager.f3247b.canScrollHorizontally(1)) {
            kVar.a(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        T t2 = recyclerView2.f1666c0;
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.J(n2, t2), layoutManager.x(n2, t2), false, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0082 A[ADDED_TO_REGION] */
    @Override // L.C0006b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(android.view.View r3, int r4, android.os.Bundle r5) {
        /*
            r2 = this;
            boolean r3 = super.g(r3, r4, r5)
            r5 = 1
            if (r3 == 0) goto L8
            return r5
        L8:
            androidx.recyclerview.widget.RecyclerView r2 = r2.d
            boolean r3 = r2.K()
            r0 = 0
            if (r3 != 0) goto L8b
            n0.H r3 = r2.getLayoutManager()
            if (r3 == 0) goto L8b
            n0.H r2 = r2.getLayoutManager()
            androidx.recyclerview.widget.RecyclerView r3 = r2.f3247b
            n0.N r1 = r3.f1664b
            r1 = 4096(0x1000, float:5.74E-42)
            if (r4 == r1) goto L58
            r1 = 8192(0x2000, float:1.14794E-41)
            if (r4 == r1) goto L2a
            r3 = r0
            r4 = r3
            goto L80
        L2a:
            r4 = -1
            boolean r3 = r3.canScrollVertically(r4)
            if (r3 == 0) goto L3f
            int r3 = r2.f3257o
            int r1 = r2.G()
            int r3 = r3 - r1
            int r1 = r2.D()
            int r3 = r3 - r1
            int r3 = -r3
            goto L40
        L3f:
            r3 = r0
        L40:
            androidx.recyclerview.widget.RecyclerView r1 = r2.f3247b
            boolean r4 = r1.canScrollHorizontally(r4)
            if (r4 == 0) goto L56
            int r4 = r2.f3256n
            int r1 = r2.E()
            int r4 = r4 - r1
            int r1 = r2.F()
            int r4 = r4 - r1
            int r4 = -r4
            goto L80
        L56:
            r4 = r0
            goto L80
        L58:
            boolean r3 = r3.canScrollVertically(r5)
            if (r3 == 0) goto L6b
            int r3 = r2.f3257o
            int r4 = r2.G()
            int r3 = r3 - r4
            int r4 = r2.D()
            int r3 = r3 - r4
            goto L6c
        L6b:
            r3 = r0
        L6c:
            androidx.recyclerview.widget.RecyclerView r4 = r2.f3247b
            boolean r4 = r4.canScrollHorizontally(r5)
            if (r4 == 0) goto L56
            int r4 = r2.f3256n
            int r1 = r2.E()
            int r4 = r4 - r1
            int r1 = r2.F()
            int r4 = r4 - r1
        L80:
            if (r3 != 0) goto L85
            if (r4 != 0) goto L85
            goto L8b
        L85:
            androidx.recyclerview.widget.RecyclerView r2 = r2.f3247b
            r2.Z(r4, r3, r5)
            return r5
        L8b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.Y.g(android.view.View, int, android.os.Bundle):boolean");
    }
}
