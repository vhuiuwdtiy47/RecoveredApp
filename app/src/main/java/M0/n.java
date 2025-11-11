package M0;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class n implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f499a;

    public /* synthetic */ n(int i) {
        this.f499a = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0040, code lost:
    
        if (r5 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0049, code lost:
    
        if (r5 != false) goto L27;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int compare(java.lang.Object r6, java.lang.Object r7) {
        /*
            r5 = this;
            r0 = 0
            r1 = 1
            r2 = -1
            int r5 = r5.f499a
            switch(r5) {
                case 0: goto L61;
                case 1: goto L2c;
                case 2: goto L22;
                default: goto L8;
            }
        L8:
            android.view.View r6 = (android.view.View) r6
            android.view.View r7 = (android.view.View) r7
            java.util.WeakHashMap r5 = L.S.f311a
            float r5 = L.G.m(r6)
            float r6 = L.G.m(r7)
            int r7 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r7 <= 0) goto L1c
            r0 = r2
            goto L21
        L1c:
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 >= 0) goto L21
            r0 = r1
        L21:
            return r0
        L22:
            r.f r6 = (r.C0320f) r6
            r.f r7 = (r.C0320f) r7
            int r5 = r6.f3573b
            int r6 = r7.f3573b
            int r5 = r5 - r6
            return r5
        L2c:
            n0.n r6 = (n0.C0291n) r6
            n0.n r7 = (n0.C0291n) r7
            androidx.recyclerview.widget.RecyclerView r5 = r6.d
            if (r5 != 0) goto L36
            r3 = r1
            goto L37
        L36:
            r3 = r0
        L37:
            androidx.recyclerview.widget.RecyclerView r4 = r7.d
            if (r4 != 0) goto L3d
            r4 = r1
            goto L3e
        L3d:
            r4 = r0
        L3e:
            if (r3 == r4) goto L43
            if (r5 != 0) goto L4b
            goto L4d
        L43:
            boolean r5 = r6.f3420a
            boolean r3 = r7.f3420a
            if (r5 == r3) goto L4f
            if (r5 == 0) goto L4d
        L4b:
            r0 = r2
            goto L60
        L4d:
            r0 = r1
            goto L60
        L4f:
            int r5 = r7.f3421b
            int r1 = r6.f3421b
            int r5 = r5 - r1
            if (r5 == 0) goto L58
        L56:
            r0 = r5
            goto L60
        L58:
            int r5 = r6.f3422c
            int r6 = r7.f3422c
            int r5 = r5 - r6
            if (r5 == 0) goto L60
            goto L56
        L60:
            return r0
        L61:
            android.view.View r6 = (android.view.View) r6
            android.view.View r7 = (android.view.View) r7
            int r5 = r6.getTop()
            int r6 = r7.getTop()
            int r5 = r5 - r6
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: M0.n.compare(java.lang.Object, java.lang.Object):int");
    }
}
