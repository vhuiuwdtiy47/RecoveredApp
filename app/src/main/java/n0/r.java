package n0;

import android.view.View;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public U.f f3437a;

    /* renamed from: b, reason: collision with root package name */
    public int f3438b;

    /* renamed from: c, reason: collision with root package name */
    public int f3439c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3440e;

    public r() {
        d();
    }

    public final void a() {
        this.f3439c = this.d ? this.f3437a.g() : this.f3437a.k();
    }

    public final void b(View view, int i) {
        if (this.d) {
            int b2 = this.f3437a.b(view);
            U.f fVar = this.f3437a;
            this.f3439c = (Integer.MIN_VALUE == fVar.f755a ? 0 : fVar.l() - fVar.f755a) + b2;
        } else {
            this.f3439c = this.f3437a.e(view);
        }
        this.f3438b = i;
    }

    public final void c(View view, int i) {
        U.f fVar = this.f3437a;
        int l2 = Integer.MIN_VALUE == fVar.f755a ? 0 : fVar.l() - fVar.f755a;
        if (l2 >= 0) {
            b(view, i);
            return;
        }
        this.f3438b = i;
        if (!this.d) {
            int e2 = this.f3437a.e(view);
            int k2 = e2 - this.f3437a.k();
            this.f3439c = e2;
            if (k2 > 0) {
                int g2 = (this.f3437a.g() - Math.min(0, (this.f3437a.g() - l2) - this.f3437a.b(view))) - (this.f3437a.c(view) + e2);
                if (g2 < 0) {
                    this.f3439c -= Math.min(k2, -g2);
                    return;
                }
                return;
            }
            return;
        }
        int g3 = (this.f3437a.g() - l2) - this.f3437a.b(view);
        this.f3439c = this.f3437a.g() - g3;
        if (g3 > 0) {
            int c2 = this.f3439c - this.f3437a.c(view);
            int k3 = this.f3437a.k();
            int min = c2 - (Math.min(this.f3437a.e(view) - k3, 0) + k3);
            if (min < 0) {
                this.f3439c = Math.min(g3, -min) + this.f3439c;
            }
        }
    }

    public final void d() {
        this.f3438b = -1;
        this.f3439c = Integer.MIN_VALUE;
        this.d = false;
        this.f3440e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f3438b + ", mCoordinate=" + this.f3439c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.f3440e + '}';
    }
}
