package n0;

import L.C0021q;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: n0.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0301y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f3472a;

    public /* synthetic */ C0301y(RecyclerView recyclerView) {
        this.f3472a = recyclerView;
    }

    public void a(C0278a c0278a) {
        int i = c0278a.f3316a;
        RecyclerView recyclerView = this.f3472a;
        if (i == 1) {
            recyclerView.f1680l.W(c0278a.f3317b, c0278a.f3318c);
            return;
        }
        if (i == 2) {
            recyclerView.f1680l.Z(c0278a.f3317b, c0278a.f3318c);
        } else if (i == 4) {
            recyclerView.f1680l.a0(c0278a.f3317b, c0278a.f3318c);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.f1680l.Y(c0278a.f3317b, c0278a.f3318c);
        }
    }

    public W b(int i) {
        RecyclerView recyclerView = this.f3472a;
        int n2 = recyclerView.f1668e.n();
        int i2 = 0;
        W w2 = null;
        while (true) {
            if (i2 >= n2) {
                break;
            }
            W I2 = RecyclerView.I(recyclerView.f1668e.m(i2));
            if (I2 != null && !I2.h() && I2.f3299c == i) {
                if (!((ArrayList) recyclerView.f1668e.d).contains(I2.f3297a)) {
                    w2 = I2;
                    break;
                }
                w2 = I2;
            }
            i2++;
        }
        if (w2 == null || ((ArrayList) recyclerView.f1668e.d).contains(w2.f3297a)) {
            return null;
        }
        return w2;
    }

    public void c(int i, int i2) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.f3472a;
        int n2 = recyclerView.f1668e.n();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < n2; i6++) {
            View m2 = recyclerView.f1668e.m(i6);
            W I2 = RecyclerView.I(m2);
            if (I2 != null && !I2.o() && (i4 = I2.f3299c) >= i && i4 < i5) {
                I2.a(2);
                I2.a(1024);
                ((I) m2.getLayoutParams()).f3260c = true;
            }
        }
        N n3 = recyclerView.f1664b;
        ArrayList arrayList = n3.f3268c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            W w2 = (W) arrayList.get(size);
            if (w2 != null && (i3 = w2.f3299c) >= i && i3 < i5) {
                w2.a(2);
                n3.e(size);
            }
        }
        recyclerView.f1673g0 = true;
    }

    public void d(int i, int i2) {
        RecyclerView recyclerView = this.f3472a;
        int n2 = recyclerView.f1668e.n();
        for (int i3 = 0; i3 < n2; i3++) {
            W I2 = RecyclerView.I(recyclerView.f1668e.m(i3));
            if (I2 != null && !I2.o() && I2.f3299c >= i) {
                I2.l(i2, false);
                recyclerView.f1666c0.f3283f = true;
            }
        }
        ArrayList arrayList = recyclerView.f1664b.f3268c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            W w2 = (W) arrayList.get(i4);
            if (w2 != null && w2.f3299c >= i) {
                w2.l(i2, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f1671f0 = true;
    }

    public void e(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = this.f3472a;
        int n2 = recyclerView.f1668e.n();
        int i10 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i11 = 0; i11 < n2; i11++) {
            W I2 = RecyclerView.I(recyclerView.f1668e.m(i11));
            if (I2 != null && (i9 = I2.f3299c) >= i4 && i9 <= i3) {
                if (i9 == i) {
                    I2.l(i2 - i, false);
                } else {
                    I2.l(i5, false);
                }
                recyclerView.f1666c0.f3283f = true;
            }
        }
        N n3 = recyclerView.f1664b;
        n3.getClass();
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        ArrayList arrayList = n3.f3268c;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            W w2 = (W) arrayList.get(i12);
            if (w2 != null && (i8 = w2.f3299c) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    w2.l(i2 - i, false);
                } else {
                    w2.l(i10, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f1671f0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(n0.W r8, L.C0021q r9, L.C0021q r10) {
        /*
            r7 = this;
            androidx.recyclerview.widget.RecyclerView r7 = r7.f3472a
            r7.getClass()
            r0 = 0
            r8.n(r0)
            n0.D r0 = r7.f1646H
            r1 = r0
            n0.i r1 = (n0.C0286i) r1
            if (r9 == 0) goto L20
            r1.getClass()
            int r3 = r9.f377a
            int r5 = r10.f377a
            if (r3 != r5) goto L22
            int r0 = r9.f378b
            int r2 = r10.f378b
            if (r0 == r2) goto L20
            goto L22
        L20:
            r2 = r8
            goto L2c
        L22:
            int r4 = r9.f378b
            int r6 = r10.f378b
            r2 = r8
            boolean r8 = r1.g(r2, r3, r4, r5, r6)
            goto L3b
        L2c:
            r1.l(r2)
            android.view.View r8 = r2.f3297a
            r9 = 0
            r8.setAlpha(r9)
            java.util.ArrayList r8 = r1.i
            r8.add(r2)
            r8 = 1
        L3b:
            if (r8 == 0) goto L40
            r7.S()
        L40:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.C0301y.f(n0.W, L.q, L.q):void");
    }

    public void g(W w2, C0021q c0021q, C0021q c0021q2) {
        boolean z2;
        RecyclerView recyclerView = this.f3472a;
        recyclerView.f1664b.j(w2);
        recyclerView.f(w2);
        w2.n(false);
        C0286i c0286i = (C0286i) recyclerView.f1646H;
        c0286i.getClass();
        int i = c0021q.f377a;
        int i2 = c0021q.f378b;
        View view = w2.f3297a;
        int left = c0021q2 == null ? view.getLeft() : c0021q2.f377a;
        int top = c0021q2 == null ? view.getTop() : c0021q2.f378b;
        if (w2.h() || (i == left && i2 == top)) {
            c0286i.l(w2);
            c0286i.h.add(w2);
            z2 = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z2 = c0286i.g(w2, i, i2, left, top);
        }
        if (z2) {
            recyclerView.S();
        }
    }

    public void h(int i) {
        RecyclerView recyclerView = this.f3472a;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            RecyclerView.I(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }
}
