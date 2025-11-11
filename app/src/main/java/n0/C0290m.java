package n0;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* renamed from: n0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0290m {

    /* renamed from: a, reason: collision with root package name */
    public int f3417a;

    /* renamed from: b, reason: collision with root package name */
    public int f3418b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f3419c;
    public int d;

    public final void a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i3 = this.d;
        int i4 = i3 * 2;
        int[] iArr = this.f3419c;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f3419c = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i4 >= iArr.length) {
            int[] iArr3 = new int[i3 * 4];
            this.f3419c = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.f3419c;
        iArr4[i4] = i;
        iArr4[i4 + 1] = i2;
        this.d++;
    }

    public final void b(RecyclerView recyclerView, boolean z2) {
        this.d = 0;
        int[] iArr = this.f3419c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        H h = recyclerView.f1680l;
        if (recyclerView.f1678k == null || h == null || !h.i) {
            return;
        }
        if (z2) {
            if (!recyclerView.d.f()) {
                h.i(recyclerView.f1678k.a(), this);
            }
        } else if (!recyclerView.K()) {
            h.h(this.f3417a, this.f3418b, recyclerView.f1666c0, this);
        }
        int i = this.d;
        if (i > h.f3252j) {
            h.f3252j = i;
            h.f3253k = z2;
            recyclerView.f1664b.k();
        }
    }
}
