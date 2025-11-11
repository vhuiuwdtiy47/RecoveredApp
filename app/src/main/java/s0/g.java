package s0;

import android.animation.ObjectAnimator;
import android.view.View;
import com.android.music.R;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class g extends l {

    /* renamed from: B, reason: collision with root package name */
    public static final String[] f3603B = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: A, reason: collision with root package name */
    public final int f3604A;

    public g(int i) {
        this();
        this.f3604A = i;
    }

    public static void I(s sVar) {
        int visibility = sVar.f3647b.getVisibility();
        HashMap hashMap = sVar.f3646a;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = sVar.f3647b;
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    public static float K(s sVar, float f2) {
        Float f3;
        return (sVar == null || (f3 = (Float) sVar.f3646a.get("android:fade:transitionAlpha")) == null) ? f2 : f3.floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, s0.z] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static s0.z L(s0.s r8, s0.s r9) {
        /*
            s0.z r0 = new s0.z
            r0.<init>()
            r1 = 0
            r0.f3659a = r1
            r0.f3660b = r1
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:parent"
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.f3646a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.f3661c = r7
            java.lang.Object r6 = r6.get(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f3662e = r6
            goto L33
        L2f:
            r0.f3661c = r3
            r0.f3662e = r2
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.f3646a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r2 = r6.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.d = r2
            java.lang.Object r2 = r6.get(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f3663f = r2
            goto L56
        L52:
            r0.d = r3
            r0.f3663f = r2
        L56:
            r2 = 1
            if (r8 == 0) goto L8a
            if (r9 == 0) goto L8a
            int r8 = r0.f3661c
            int r9 = r0.d
            if (r8 != r9) goto L68
            android.view.ViewGroup r3 = r0.f3662e
            android.view.ViewGroup r4 = r0.f3663f
            if (r3 != r4) goto L68
            goto L9f
        L68:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L71
            r0.f3660b = r1
            r0.f3659a = r2
            return r0
        L71:
            if (r9 != 0) goto L9f
            r0.f3660b = r2
            r0.f3659a = r2
            return r0
        L78:
            android.view.ViewGroup r8 = r0.f3663f
            if (r8 != 0) goto L81
            r0.f3660b = r1
            r0.f3659a = r2
            return r0
        L81:
            android.view.ViewGroup r8 = r0.f3662e
            if (r8 != 0) goto L9f
            r0.f3660b = r2
            r0.f3659a = r2
            return r0
        L8a:
            if (r8 != 0) goto L95
            int r8 = r0.d
            if (r8 != 0) goto L95
            r0.f3660b = r2
            r0.f3659a = r2
            return r0
        L95:
            if (r9 != 0) goto L9f
            int r8 = r0.f3661c
            if (r8 != 0) goto L9f
            r0.f3660b = r1
            r0.f3659a = r2
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.g.L(s0.s, s0.s):s0.z");
    }

    public final ObjectAnimator J(View view, float f2, float f3) {
        if (f2 == f3) {
            return null;
        }
        c1.a aVar = u.f3649a;
        view.setTransitionAlpha(f2);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, u.f3649a, f3);
        f fVar = new f(view);
        ofFloat.addListener(fVar);
        o().a(fVar);
        return ofFloat;
    }

    @Override // s0.l
    public final void d(s sVar) {
        I(sVar);
    }

    @Override // s0.l
    public final void g(s sVar) {
        I(sVar);
        View view = sVar.f3647b;
        Float f2 = (Float) view.getTag(R.id.transition_pause_alpha);
        if (f2 == null) {
            if (view.getVisibility() == 0) {
                c1.a aVar = u.f3649a;
                f2 = Float.valueOf(view.getTransitionAlpha());
            } else {
                f2 = Float.valueOf(0.0f);
            }
        }
        sVar.f3646a.put("android:fade:transitionAlpha", f2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        if (L(n(r3, false), r(r3, false)).f3659a != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01bb  */
    @Override // s0.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator k(android.view.ViewGroup r24, s0.s r25, s0.s r26) {
        /*
            Method dump skipped, instructions count: 685
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.g.k(android.view.ViewGroup, s0.s, s0.s):android.animation.Animator");
    }

    @Override // s0.l
    public final String[] q() {
        return f3603B;
    }

    @Override // s0.l
    public final boolean s(s sVar, s sVar2) {
        if (sVar == null && sVar2 == null) {
            return false;
        }
        if (sVar != null && sVar2 != null && sVar2.f3646a.containsKey("android:visibility:visibility") != sVar.f3646a.containsKey("android:visibility:visibility")) {
            return false;
        }
        z L2 = L(sVar, sVar2);
        if (L2.f3659a) {
            return L2.f3661c == 0 || L2.d == 0;
        }
        return false;
    }

    public g() {
        this.f3604A = 3;
    }
}
