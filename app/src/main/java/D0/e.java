package D0;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import y.AbstractC0376a;

/* loaded from: classes.dex */
public final class e extends Z0.i {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f107f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AbstractC0376a f108g;

    public /* synthetic */ e(AbstractC0376a abstractC0376a, int i) {
        this.f107f = i;
        this.f108g = abstractC0376a;
    }

    @Override // Z0.i
    public int E(View view) {
        switch (this.f107f) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f108g;
                return sideSheetBehavior.f1978l + sideSheetBehavior.f1981o;
            default:
                return super.E(view);
        }
    }

    @Override // Z0.i
    public int F() {
        switch (this.f107f) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f108g;
                return bottomSheetBehavior.f1787I ? bottomSheetBehavior.f1798T : bottomSheetBehavior.G;
            default:
                return super.F();
        }
    }

    @Override // Z0.i
    public final void W(int i) {
        switch (this.f107f) {
            case 0:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f108g;
                    if (bottomSheetBehavior.f1789K) {
                        bottomSheetBehavior.C(1);
                        return;
                    }
                    return;
                }
                return;
            default:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f108g;
                    if (sideSheetBehavior.f1975g) {
                        sideSheetBehavior.r(1);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // Z0.i
    public final void X(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f107f) {
            case 0:
                ((BottomSheetBehavior) this.f108g).u(i2);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f108g;
                WeakReference weakReference = sideSheetBehavior.f1983q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f1970a.g0(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f1987u;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.f1970a.k(i);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (r4.f1970a.J(r5) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        if (java.lang.Math.abs(r6 - r4.f1970a.v()) < java.lang.Math.abs(r6 - r4.f1970a.x())) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:
    
        if (r6 > r4.f1784E) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d0, code lost:
    
        if (java.lang.Math.abs(r5.getTop() - r4.x()) < java.lang.Math.abs(r5.getTop() - r4.f1784E)) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x011b, code lost:
    
        if (java.lang.Math.abs(r6 - r4.f1783D) < java.lang.Math.abs(r6 - r4.G)) goto L29;
     */
    @Override // Z0.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Y(android.view.View r5, float r6, float r7) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D0.e.Y(android.view.View, float, float):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0045, code lost:
    
        if (r5.canScrollVertically(-1) != false) goto L36;
     */
    @Override // Z0.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l0(android.view.View r4, int r5) {
        /*
            r3 = this;
            int r0 = r3.f107f
            switch(r0) {
                case 0: goto L1c;
                default: goto L5;
            }
        L5:
            y.a r3 = r3.f108g
            com.google.android.material.sidesheet.SideSheetBehavior r3 = (com.google.android.material.sidesheet.SideSheetBehavior) r3
            int r5 = r3.h
            r0 = 0
            r1 = 1
            if (r5 != r1) goto L10
            goto L1b
        L10:
            java.lang.ref.WeakReference r3 = r3.f1982p
            if (r3 == 0) goto L1b
            java.lang.Object r3 = r3.get()
            if (r3 != r4) goto L1b
            r0 = r1
        L1b:
            return r0
        L1c:
            y.a r3 = r3.f108g
            com.google.android.material.bottomsheet.BottomSheetBehavior r3 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r3
            int r0 = r3.f1790L
            r1 = 1
            if (r0 != r1) goto L26
            goto L56
        L26:
            boolean r2 = r3.f1806a0
            if (r2 == 0) goto L2b
            goto L56
        L2b:
            r2 = 3
            if (r0 != r2) goto L48
            int r0 = r3.f1803Y
            if (r0 != r5) goto L48
            java.lang.ref.WeakReference r5 = r3.f1800V
            if (r5 == 0) goto L3d
            java.lang.Object r5 = r5.get()
            android.view.View r5 = (android.view.View) r5
            goto L3e
        L3d:
            r5 = 0
        L3e:
            if (r5 == 0) goto L48
            r0 = -1
            boolean r5 = r5.canScrollVertically(r0)
            if (r5 == 0) goto L48
            goto L56
        L48:
            java.lang.System.currentTimeMillis()
            java.lang.ref.WeakReference r3 = r3.f1799U
            if (r3 == 0) goto L56
            java.lang.Object r3 = r3.get()
            if (r3 != r4) goto L56
            goto L57
        L56:
            r1 = 0
        L57:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: D0.e.l0(android.view.View, int):boolean");
    }

    @Override // Z0.i
    public final int m(View view, int i) {
        switch (this.f107f) {
            case 0:
                return view.getLeft();
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f108g;
                return Z0.i.l(i, sideSheetBehavior.f1970a.A(), sideSheetBehavior.f1970a.z());
        }
    }

    @Override // Z0.i
    public final int n(View view, int i) {
        switch (this.f107f) {
            case 0:
                return Z0.i.l(i, ((BottomSheetBehavior) this.f108g).x(), F());
            default:
                return view.getTop();
        }
    }
}
