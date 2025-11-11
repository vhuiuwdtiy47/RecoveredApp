package R;

import L.C0006b;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;

/* loaded from: classes.dex */
public final class h extends C0006b {
    public final /* synthetic */ int d;

    public /* synthetic */ h(int i) {
        this.d = i;
    }

    @Override // L.C0006b
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.d) {
            case 0:
                super.c(view, accessibilityEvent);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                accessibilityEvent.setClassName(ScrollView.class.getName());
                accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
                accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
                accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
                return;
            default:
                super.c(view, accessibilityEvent);
                return;
        }
    }

    @Override // L.C0006b
    public final void d(View view, M.k kVar) {
        int scrollRange;
        switch (this.d) {
            case 0:
                View.AccessibilityDelegate accessibilityDelegate = this.f319a;
                AccessibilityNodeInfo accessibilityNodeInfo = kVar.f417a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                accessibilityNodeInfo.setClassName(ScrollView.class.getName());
                if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                    return;
                }
                accessibilityNodeInfo.setScrollable(true);
                if (nestedScrollView.getScrollY() > 0) {
                    kVar.b(M.f.f409g);
                    kVar.b(M.f.f411k);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    kVar.b(M.f.f408f);
                    kVar.b(M.f.f412l);
                    return;
                }
                return;
            case 1:
                View.AccessibilityDelegate accessibilityDelegate2 = this.f319a;
                AccessibilityNodeInfo accessibilityNodeInfo2 = kVar.f417a;
                accessibilityDelegate2.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setCollectionInfo(null);
                return;
            case 2:
                View.AccessibilityDelegate accessibilityDelegate3 = this.f319a;
                AccessibilityNodeInfo accessibilityNodeInfo3 = kVar.f417a;
                accessibilityDelegate3.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                accessibilityNodeInfo3.setScrollable(false);
                return;
            default:
                View.AccessibilityDelegate accessibilityDelegate4 = this.f319a;
                AccessibilityNodeInfo accessibilityNodeInfo4 = kVar.f417a;
                accessibilityDelegate4.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo4);
                accessibilityNodeInfo4.setCollectionInfo(null);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        if (r5 != 16908346) goto L32;
     */
    @Override // L.C0006b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean g(android.view.View r4, int r5, android.os.Bundle r6) {
        /*
            r3 = this;
            int r0 = r3.d
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            boolean r3 = super.g(r4, r5, r6)
            return r3
        La:
            boolean r3 = super.g(r4, r5, r6)
            r6 = 1
            if (r3 == 0) goto L13
            goto La1
        L13:
            androidx.core.widget.NestedScrollView r4 = (androidx.core.widget.NestedScrollView) r4
            boolean r3 = r4.isEnabled()
            r0 = 0
            if (r3 != 0) goto L1e
            goto La0
        L1e:
            int r3 = r4.getHeight()
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            android.graphics.Matrix r2 = r4.getMatrix()
            boolean r2 = r2.isIdentity()
            if (r2 == 0) goto L3b
            boolean r2 = r4.getGlobalVisibleRect(r1)
            if (r2 == 0) goto L3b
            int r3 = r1.height()
        L3b:
            r1 = 4096(0x1000, float:5.74E-42)
            if (r5 == r1) goto L75
            r1 = 8192(0x2000, float:1.14794E-41)
            if (r5 == r1) goto L4e
            r1 = 16908344(0x1020038, float:2.3877386E-38)
            if (r5 == r1) goto L4e
            r1 = 16908346(0x102003a, float:2.3877392E-38)
            if (r5 == r1) goto L75
            goto La0
        L4e:
            int r5 = r4.getPaddingBottom()
            int r3 = r3 - r5
            int r5 = r4.getPaddingTop()
            int r3 = r3 - r5
            int r5 = r4.getScrollY()
            int r5 = r5 - r3
            int r3 = java.lang.Math.max(r5, r0)
            int r5 = r4.getScrollY()
            if (r3 == r5) goto La0
            int r5 = r4.getScrollX()
            int r0 = r0 - r5
            int r5 = r4.getScrollY()
            int r3 = r3 - r5
            r4.u(r0, r3, r6)
            goto La1
        L75:
            int r5 = r4.getPaddingBottom()
            int r3 = r3 - r5
            int r5 = r4.getPaddingTop()
            int r3 = r3 - r5
            int r5 = r4.getScrollY()
            int r5 = r5 + r3
            int r3 = r4.getScrollRange()
            int r3 = java.lang.Math.min(r5, r3)
            int r5 = r4.getScrollY()
            if (r3 == r5) goto La0
            int r5 = r4.getScrollX()
            int r0 = r0 - r5
            int r5 = r4.getScrollY()
            int r3 = r3 - r5
            r4.u(r0, r3, r6)
            goto La1
        La0:
            r6 = r0
        La1:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: R.h.g(android.view.View, int, android.os.Bundle):boolean");
    }
}
