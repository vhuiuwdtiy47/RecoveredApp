package n0;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public int f3319a;

    /* renamed from: b, reason: collision with root package name */
    public int f3320b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3321c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3322e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f3323f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f3324g;

    public a0(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f3324g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f3319a = -1;
        this.f3320b = Integer.MIN_VALUE;
        this.f3321c = false;
        this.d = false;
        this.f3322e = false;
        int[] iArr = this.f3323f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
