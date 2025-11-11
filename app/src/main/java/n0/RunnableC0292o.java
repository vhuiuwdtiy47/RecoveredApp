package n0;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* renamed from: n0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0292o implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadLocal f3424e = new ThreadLocal();

    /* renamed from: f, reason: collision with root package name */
    public static final M0.n f3425f = new M0.n(1);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f3426a;

    /* renamed from: b, reason: collision with root package name */
    public long f3427b;

    /* renamed from: c, reason: collision with root package name */
    public long f3428c;
    public ArrayList d;

    public static W c(RecyclerView recyclerView, int i, long j2) {
        int n2 = recyclerView.f1668e.n();
        for (int i2 = 0; i2 < n2; i2++) {
            W I2 = RecyclerView.I(recyclerView.f1668e.m(i2));
            if (I2.f3299c == i && !I2.f()) {
                return null;
            }
        }
        N n3 = recyclerView.f1664b;
        try {
            recyclerView.P();
            W i3 = n3.i(i, j2);
            if (i3 != null) {
                if (!i3.e() || i3.f()) {
                    n3.a(i3, false);
                } else {
                    n3.f(i3.f3297a);
                }
            }
            recyclerView.Q(false);
            return i3;
        } catch (Throwable th) {
            recyclerView.Q(false);
            throw th;
        }
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.f1688p && this.f3427b == 0) {
            this.f3427b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C0290m c0290m = recyclerView.b0;
        c0290m.f3417a = i;
        c0290m.f3418b = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(long j2) {
        C0291n c0291n;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C0291n c0291n2;
        ArrayList arrayList = this.f3426a;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i2);
            if (recyclerView3.getWindowVisibility() == 0) {
                C0290m c0290m = recyclerView3.b0;
                c0290m.b(recyclerView3, false);
                i += c0290m.d;
            }
        }
        ArrayList arrayList2 = this.d;
        arrayList2.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                C0290m c0290m2 = recyclerView4.b0;
                int abs = Math.abs(c0290m2.f3418b) + Math.abs(c0290m2.f3417a);
                for (int i5 = 0; i5 < c0290m2.d * 2; i5 += 2) {
                    if (i3 >= arrayList2.size()) {
                        Object obj = new Object();
                        arrayList2.add(obj);
                        c0291n2 = obj;
                    } else {
                        c0291n2 = (C0291n) arrayList2.get(i3);
                    }
                    int[] iArr = c0290m2.f3419c;
                    int i6 = iArr[i5 + 1];
                    c0291n2.f3420a = i6 <= abs;
                    c0291n2.f3421b = abs;
                    c0291n2.f3422c = i6;
                    c0291n2.d = recyclerView4;
                    c0291n2.f3423e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(arrayList2, f3425f);
        for (int i7 = 0; i7 < arrayList2.size() && (recyclerView = (c0291n = (C0291n) arrayList2.get(i7)).d) != null; i7++) {
            W c2 = c(recyclerView, c0291n.f3423e, c0291n.f3420a ? Long.MAX_VALUE : j2);
            if (c2 != null && c2.f3298b != null && c2.e() && !c2.f() && (recyclerView2 = (RecyclerView) c2.f3298b.get()) != null) {
                if (recyclerView2.f1699y && recyclerView2.f1668e.n() != 0) {
                    D d = recyclerView2.f1646H;
                    if (d != null) {
                        d.e();
                    }
                    H h = recyclerView2.f1680l;
                    N n2 = recyclerView2.f1664b;
                    if (h != null) {
                        h.g0(n2);
                        recyclerView2.f1680l.h0(n2);
                    }
                    n2.f3266a.clear();
                    n2.d();
                }
                C0290m c0290m3 = recyclerView2.b0;
                c0290m3.b(recyclerView2, true);
                if (c0290m3.d != 0) {
                    try {
                        Trace.beginSection("RV Nested Prefetch");
                        T t2 = recyclerView2.f1666c0;
                        AbstractC0302z abstractC0302z = recyclerView2.f1678k;
                        t2.d = 1;
                        t2.f3282e = abstractC0302z.a();
                        t2.f3284g = false;
                        t2.h = false;
                        t2.i = false;
                        for (int i8 = 0; i8 < c0290m3.d * 2; i8 += 2) {
                            c(recyclerView2, c0290m3.f3419c[i8], j2);
                        }
                        c0291n.f3420a = false;
                        c0291n.f3421b = 0;
                        c0291n.f3422c = 0;
                        c0291n.d = null;
                        c0291n.f3423e = 0;
                    } finally {
                        Trace.endSection();
                    }
                }
            }
            c0291n.f3420a = false;
            c0291n.f3421b = 0;
            c0291n.f3422c = 0;
            c0291n.d = null;
            c0291n.f3423e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f3426a;
            if (arrayList.isEmpty()) {
                return;
            }
            int size = arrayList.size();
            long j2 = 0;
            for (int i = 0; i < size; i++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i);
                if (recyclerView.getWindowVisibility() == 0) {
                    j2 = Math.max(recyclerView.getDrawingTime(), j2);
                }
            }
            if (j2 == 0) {
                return;
            }
            b(TimeUnit.MILLISECONDS.toNanos(j2) + this.f3428c);
        } finally {
            this.f3427b = 0L;
            Trace.endSection();
        }
    }
}
