package D0;

import M0.p;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes.dex */
public final class d implements p {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f105a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f106b;

    public d(J.f fVar, boolean z2) {
        this.f106b = fVar;
        this.f105a = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
    @Override // M0.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public L.u0 a(android.view.View r11, L.u0 r12, M0.q r13) {
        /*
            r10 = this;
            L.s0 r0 = r12.f389a
            r1 = 7
            D.c r1 = r0.f(r1)
            r2 = 32
            D.c r0 = r0.f(r2)
            int r2 = r1.f93b
            java.lang.Object r3 = r10.f106b
            com.google.android.material.bottomsheet.BottomSheetBehavior r3 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r3
            r3.f1827w = r2
            boolean r2 = M0.m.f(r11)
            int r4 = r11.getPaddingBottom()
            int r5 = r11.getPaddingLeft()
            int r6 = r11.getPaddingRight()
            boolean r7 = r3.f1819o
            if (r7 == 0) goto L32
            int r4 = r12.a()
            r3.f1826v = r4
            int r7 = r13.d
            int r4 = r4 + r7
        L32:
            boolean r7 = r3.f1820p
            int r8 = r1.f92a
            if (r7 == 0) goto L40
            if (r2 == 0) goto L3d
            int r5 = r13.f502c
            goto L3f
        L3d:
            int r5 = r13.f500a
        L3f:
            int r5 = r5 + r8
        L40:
            boolean r7 = r3.f1821q
            int r9 = r1.f94c
            if (r7 == 0) goto L4f
            if (r2 == 0) goto L4b
            int r13 = r13.f500a
            goto L4d
        L4b:
            int r13 = r13.f502c
        L4d:
            int r6 = r13 + r9
        L4f:
            android.view.ViewGroup$LayoutParams r13 = r11.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r13 = (android.view.ViewGroup.MarginLayoutParams) r13
            boolean r2 = r3.f1823s
            r7 = 1
            if (r2 == 0) goto L62
            int r2 = r13.leftMargin
            if (r2 == r8) goto L62
            r13.leftMargin = r8
            r2 = r7
            goto L63
        L62:
            r2 = 0
        L63:
            boolean r8 = r3.f1824t
            if (r8 == 0) goto L6e
            int r8 = r13.rightMargin
            if (r8 == r9) goto L6e
            r13.rightMargin = r9
            r2 = r7
        L6e:
            boolean r8 = r3.f1825u
            if (r8 == 0) goto L7b
            int r8 = r13.topMargin
            int r1 = r1.f93b
            if (r8 == r1) goto L7b
            r13.topMargin = r1
            goto L7c
        L7b:
            r7 = r2
        L7c:
            if (r7 == 0) goto L81
            r11.setLayoutParams(r13)
        L81:
            int r13 = r11.getPaddingTop()
            r11.setPadding(r5, r13, r6, r4)
            boolean r10 = r10.f105a
            if (r10 == 0) goto L90
            int r11 = r0.d
            r3.f1817m = r11
        L90:
            boolean r11 = r3.f1819o
            if (r11 != 0) goto L98
            if (r10 == 0) goto L97
            goto L98
        L97:
            return r12
        L98:
            r3.I()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: D0.d.a(android.view.View, L.u0, M0.q):L.u0");
    }

    public boolean b() {
        return this.f105a;
    }

    public boolean c(CharSequence charSequence, int i) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            throw new IllegalArgumentException();
        }
        if (((J.f) this.f106b) == null) {
            return b();
        }
        char c2 = 2;
        for (int i2 = 0; i2 < i && c2 == 2; i2++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i2));
            d dVar = J.g.f293a;
            if (directionality != 0) {
                if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            break;
                        case 16:
                        case 17:
                            break;
                        default:
                            c2 = 2;
                            break;
                    }
                }
                c2 = 0;
            }
            c2 = 1;
        }
        if (c2 == 0) {
            return true;
        }
        if (c2 != 1) {
            return b();
        }
        return false;
    }

    public d(BottomSheetBehavior bottomSheetBehavior, boolean z2) {
        this.f106b = bottomSheetBehavior;
        this.f105a = z2;
    }
}
