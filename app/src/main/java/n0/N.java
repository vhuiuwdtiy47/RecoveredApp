package n0;

import L.C0006b;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3266a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f3267b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3268c;
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public int f3269e;

    /* renamed from: f, reason: collision with root package name */
    public int f3270f;

    /* renamed from: g, reason: collision with root package name */
    public M f3271g;
    public final /* synthetic */ RecyclerView h;

    public N(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f3266a = arrayList;
        this.f3267b = null;
        this.f3268c = new ArrayList();
        this.d = Collections.unmodifiableList(arrayList);
        this.f3269e = 2;
        this.f3270f = 2;
    }

    public final void a(W w2, boolean z2) {
        RecyclerView.j(w2);
        RecyclerView recyclerView = this.h;
        Y y2 = recyclerView.f1677j0;
        if (y2 != null) {
            X x2 = y2.f3313e;
            View view = w2.f3297a;
            L.S.h(view, x2 != null ? (C0006b) x2.f3312e.remove(view) : null);
        }
        if (z2 && recyclerView.f1666c0 != null) {
            recyclerView.f1670f.K(w2);
        }
        w2.f3311r = null;
        M c2 = c();
        c2.getClass();
        int i = w2.f3301f;
        ArrayList arrayList = c2.a(i).f3261a;
        if (((L) c2.f3264a.get(i)).f3262b <= arrayList.size()) {
            return;
        }
        w2.m();
        arrayList.add(w2);
    }

    public final int b(int i) {
        RecyclerView recyclerView = this.h;
        if (i >= 0 && i < recyclerView.f1666c0.b()) {
            return !recyclerView.f1666c0.f3284g ? i : recyclerView.d.e(i, 0);
        }
        throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + recyclerView.f1666c0.b() + recyclerView.y());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [n0.M, java.lang.Object] */
    public final M c() {
        if (this.f3271g == null) {
            ?? obj = new Object();
            obj.f3264a = new SparseArray();
            obj.f3265b = 0;
            this.f3271g = obj;
        }
        return this.f3271g;
    }

    public final void d() {
        ArrayList arrayList = this.f3268c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            e(size);
        }
        arrayList.clear();
        int[] iArr = RecyclerView.f1637s0;
        C0290m c0290m = this.h.b0;
        int[] iArr2 = c0290m.f3419c;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        c0290m.d = 0;
    }

    public final void e(int i) {
        ArrayList arrayList = this.f3268c;
        a((W) arrayList.get(i), true);
        arrayList.remove(i);
    }

    public final void f(View view) {
        W I2 = RecyclerView.I(view);
        boolean j2 = I2.j();
        RecyclerView recyclerView = this.h;
        if (j2) {
            recyclerView.removeDetachedView(view, false);
        }
        if (I2.i()) {
            I2.f3307n.j(I2);
        } else if (I2.p()) {
            I2.f3303j &= -33;
        }
        g(I2);
        if (recyclerView.f1646H == null || I2.g()) {
            return;
        }
        recyclerView.f1646H.d(I2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0090, code lost:
    
        r5 = r5 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(n0.W r12) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.N.g(n0.W):void");
    }

    public final void h(View view) {
        D d;
        W I2 = RecyclerView.I(view);
        boolean z2 = (I2.f3303j & 12) != 0;
        RecyclerView recyclerView = this.h;
        if (!z2 && I2.k() && (d = recyclerView.f1646H) != null) {
            C0286i c0286i = (C0286i) d;
            if (I2.c().isEmpty() && c0286i.f3377g && !I2.f()) {
                if (this.f3267b == null) {
                    this.f3267b = new ArrayList();
                }
                I2.f3307n = this;
                I2.f3308o = true;
                this.f3267b.add(I2);
                return;
            }
        }
        if (I2.f() && !I2.h() && !recyclerView.f1678k.f3474b) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.y());
        }
        I2.f3307n = this;
        I2.f3308o = false;
        this.f3266a.add(I2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:192:0x042c, code lost:
    
        if (r11.f() == false) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01d5, code lost:
    
        if (r11.f3301f != 0) goto L110;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0533 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0082  */
    /* JADX WARN: Type inference failed for: r2v32, types: [java.lang.Object, L.q] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final n0.W i(int r27, long r28) {
        /*
            Method dump skipped, instructions count: 1388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.N.i(int, long):n0.W");
    }

    public final void j(W w2) {
        if (w2.f3308o) {
            this.f3267b.remove(w2);
        } else {
            this.f3266a.remove(w2);
        }
        w2.f3307n = null;
        w2.f3308o = false;
        w2.f3303j &= -33;
    }

    public final void k() {
        H h = this.h.f1680l;
        this.f3270f = this.f3269e + (h != null ? h.f3252j : 0);
        ArrayList arrayList = this.f3268c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f3270f; size--) {
            e(size);
        }
    }
}
