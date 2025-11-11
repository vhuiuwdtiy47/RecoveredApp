package f0;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class u implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final v f2352a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f2353b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2354c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2355e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2356f;

    public u(v vVar, Bundle bundle, boolean z2, int i, boolean z3, int i2) {
        q1.d.e(vVar, "destination");
        this.f2352a = vVar;
        this.f2353b = bundle;
        this.f2354c = z2;
        this.d = i;
        this.f2355e = z3;
        this.f2356f = i2;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(u uVar) {
        q1.d.e(uVar, "other");
        boolean z2 = uVar.f2354c;
        boolean z3 = this.f2354c;
        if (z3 && !z2) {
            return 1;
        }
        if (!z3 && z2) {
            return -1;
        }
        int i = this.d - uVar.d;
        if (i > 0) {
            return 1;
        }
        if (i < 0) {
            return -1;
        }
        Bundle bundle = uVar.f2353b;
        Bundle bundle2 = this.f2353b;
        if (bundle2 != null && bundle == null) {
            return 1;
        }
        if (bundle2 == null && bundle != null) {
            return -1;
        }
        if (bundle2 != null) {
            q1.d.e(bundle2, "source");
            int size = bundle2.size();
            q1.d.b(bundle);
            int size2 = size - bundle.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        boolean z4 = uVar.f2355e;
        boolean z5 = this.f2355e;
        if (z5 && !z4) {
            return 1;
        }
        if (z5 || !z4) {
            return this.f2356f - uVar.f2356f;
        }
        return -1;
    }
}
