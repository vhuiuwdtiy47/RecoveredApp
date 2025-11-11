package A0;

import L.S;
import Z0.i;
import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class b extends i {

    /* renamed from: f, reason: collision with root package name */
    public int f29f;

    /* renamed from: g, reason: collision with root package name */
    public int f30g = -1;
    public final /* synthetic */ SwipeDismissBehavior h;

    public b(SwipeDismissBehavior swipeDismissBehavior) {
        this.h = swipeDismissBehavior;
    }

    @Override // Z0.i
    public final int E(View view) {
        return view.getWidth();
    }

    @Override // Z0.i
    public final void V(View view, int i) {
        this.f30g = i;
        this.f29f = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.h;
            swipeDismissBehavior.f1776c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f1776c = false;
        }
    }

    @Override // Z0.i
    public final void W(int i) {
    }

    @Override // Z0.i
    public final void X(View view, int i, int i2) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.h;
        float f2 = width * swipeDismissBehavior.f1777e;
        float width2 = view.getWidth() * swipeDismissBehavior.f1778f;
        float abs = Math.abs(i - this.f29f);
        if (abs <= f2) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((abs - f2) / (width2 - f2))), 1.0f));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (java.lang.Math.abs(r9.getLeft() - r8.f29f) >= java.lang.Math.round(r9.getWidth() * 0.5f)) goto L27;
     */
    @Override // Z0.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Y(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            r11 = -1
            r8.f30g = r11
            int r11 = r9.getWidth()
            r0 = 0
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            com.google.android.material.behavior.SwipeDismissBehavior r2 = r8.h
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L39
            java.util.WeakHashMap r5 = L.S.f311a
            int r5 = r9.getLayoutDirection()
            if (r5 != r3) goto L1a
            r5 = r3
            goto L1b
        L1a:
            r5 = r4
        L1b:
            int r6 = r2.d
            r7 = 2
            if (r6 != r7) goto L21
            goto L52
        L21:
            if (r6 != 0) goto L2d
            if (r5 == 0) goto L2a
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L66
            goto L52
        L2a:
            if (r1 <= 0) goto L66
            goto L52
        L2d:
            if (r6 != r3) goto L66
            if (r5 == 0) goto L34
            if (r1 <= 0) goto L66
            goto L52
        L34:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L66
            goto L52
        L39:
            int r1 = r9.getLeft()
            int r5 = r8.f29f
            int r1 = r1 - r5
            int r5 = r9.getWidth()
            float r5 = (float) r5
            r6 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            int r1 = java.lang.Math.abs(r1)
            if (r1 < r5) goto L66
        L52:
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 < 0) goto L61
            int r10 = r9.getLeft()
            int r0 = r8.f29f
            if (r10 >= r0) goto L5f
            goto L61
        L5f:
            int r0 = r0 + r11
            goto L69
        L61:
            int r8 = r8.f29f
            int r0 = r8 - r11
            goto L69
        L66:
            int r0 = r8.f29f
            r3 = r4
        L69:
            T.e r8 = r2.f1774a
            int r10 = r9.getTop()
            boolean r8 = r8.o(r0, r10)
            if (r8 == 0) goto L7f
            A0.d r8 = new A0.d
            r8.<init>(r2, r9, r3)
            java.util.WeakHashMap r10 = L.S.f311a
            r9.postOnAnimation(r8)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: A0.b.Y(android.view.View, float, float):void");
    }

    @Override // Z0.i
    public final boolean l0(View view, int i) {
        int i2 = this.f30g;
        return (i2 == -1 || i2 == i) && this.h.r(view);
    }

    @Override // Z0.i
    public final int m(View view, int i) {
        int width;
        int width2;
        int width3;
        WeakHashMap weakHashMap = S.f311a;
        boolean z2 = view.getLayoutDirection() == 1;
        int i2 = this.h.d;
        if (i2 == 0) {
            if (z2) {
                width = this.f29f - view.getWidth();
                width2 = this.f29f;
            } else {
                width = this.f29f;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i2 != 1) {
            width = this.f29f - view.getWidth();
            width2 = this.f29f + view.getWidth();
        } else if (z2) {
            width = this.f29f;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f29f - view.getWidth();
            width2 = this.f29f;
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // Z0.i
    public final int n(View view, int i) {
        return view.getTop();
    }
}
