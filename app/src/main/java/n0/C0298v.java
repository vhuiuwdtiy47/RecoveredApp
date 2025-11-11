package n0;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: n0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0298v {

    /* renamed from: a, reason: collision with root package name */
    public int f3456a = -1;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f3457b;

    /* renamed from: c, reason: collision with root package name */
    public H f3458c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3459e;

    /* renamed from: f, reason: collision with root package name */
    public View f3460f;

    /* renamed from: g, reason: collision with root package name */
    public final Q f3461g;
    public boolean h;
    public final LinearInterpolator i;

    /* renamed from: j, reason: collision with root package name */
    public final DecelerateInterpolator f3462j;

    /* renamed from: k, reason: collision with root package name */
    public PointF f3463k;

    /* renamed from: l, reason: collision with root package name */
    public final DisplayMetrics f3464l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3465m;

    /* renamed from: n, reason: collision with root package name */
    public float f3466n;

    /* renamed from: o, reason: collision with root package name */
    public int f3467o;

    /* renamed from: p, reason: collision with root package name */
    public int f3468p;

    /* JADX WARN: Type inference failed for: r1v0, types: [n0.Q, java.lang.Object] */
    public C0298v(Context context) {
        ?? obj = new Object();
        obj.d = -1;
        obj.f3277f = false;
        obj.f3278g = 0;
        obj.f3273a = 0;
        obj.f3274b = 0;
        obj.f3275c = Integer.MIN_VALUE;
        obj.f3276e = null;
        this.f3461g = obj;
        this.i = new LinearInterpolator();
        this.f3462j = new DecelerateInterpolator();
        this.f3465m = false;
        this.f3467o = 0;
        this.f3468p = 0;
        this.f3464l = context.getResources().getDisplayMetrics();
    }

    public static int a(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            if (i5 == 1) {
                return i4 - i2;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 < 0) {
            return i7;
        }
        return 0;
    }

    public int b(View view, int i) {
        H h = this.f3458c;
        if (h == null || !h.d()) {
            return 0;
        }
        I i2 = (I) view.getLayoutParams();
        return a((view.getLeft() - ((I) view.getLayoutParams()).f3259b.left) - ((ViewGroup.MarginLayoutParams) i2).leftMargin, view.getRight() + ((I) view.getLayoutParams()).f3259b.right + ((ViewGroup.MarginLayoutParams) i2).rightMargin, h.E(), h.f3256n - h.F(), i);
    }

    public int c(View view, int i) {
        H h = this.f3458c;
        if (h == null || !h.e()) {
            return 0;
        }
        I i2 = (I) view.getLayoutParams();
        return a((view.getTop() - ((I) view.getLayoutParams()).f3259b.top) - ((ViewGroup.MarginLayoutParams) i2).topMargin, view.getBottom() + ((I) view.getLayoutParams()).f3259b.bottom + ((ViewGroup.MarginLayoutParams) i2).bottomMargin, h.G(), h.f3257o - h.D(), i);
    }

    public float d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int e(int i) {
        float abs = Math.abs(i);
        if (!this.f3465m) {
            this.f3466n = d(this.f3464l);
            this.f3465m = true;
        }
        return (int) Math.ceil(abs * this.f3466n);
    }

    public PointF f(int i) {
        Object obj = this.f3458c;
        if (obj instanceof S) {
            return ((S) obj).a(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + S.class.getCanonicalName());
        return null;
    }

    public final void g(int i, int i2) {
        PointF f2;
        RecyclerView recyclerView = this.f3457b;
        if (this.f3456a == -1 || recyclerView == null) {
            i();
        }
        if (this.d && this.f3460f == null && this.f3458c != null && (f2 = f(this.f3456a)) != null) {
            float f3 = f2.x;
            if (f3 != 0.0f || f2.y != 0.0f) {
                recyclerView.X((int) Math.signum(f3), (int) Math.signum(f2.y), null);
            }
        }
        this.d = false;
        View view = this.f3460f;
        Q q2 = this.f3461g;
        if (view != null) {
            this.f3457b.getClass();
            W I2 = RecyclerView.I(view);
            if ((I2 != null ? I2.b() : -1) == this.f3456a) {
                View view2 = this.f3460f;
                T t2 = recyclerView.f1666c0;
                h(view2, q2);
                q2.a(recyclerView);
                i();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f3460f = null;
            }
        }
        if (this.f3459e) {
            T t3 = recyclerView.f1666c0;
            if (this.f3457b.f1680l.v() == 0) {
                i();
            } else {
                int i3 = this.f3467o;
                int i4 = i3 - i;
                if (i3 * i4 <= 0) {
                    i4 = 0;
                }
                this.f3467o = i4;
                int i5 = this.f3468p;
                int i6 = i5 - i2;
                if (i5 * i6 <= 0) {
                    i6 = 0;
                }
                this.f3468p = i6;
                if (i4 == 0 && i6 == 0) {
                    PointF f4 = f(this.f3456a);
                    if (f4 != null) {
                        if (f4.x != 0.0f || f4.y != 0.0f) {
                            float f5 = f4.y;
                            float sqrt = (float) Math.sqrt((f5 * f5) + (r10 * r10));
                            float f6 = f4.x / sqrt;
                            f4.x = f6;
                            float f7 = f4.y / sqrt;
                            f4.y = f7;
                            this.f3463k = f4;
                            this.f3467o = (int) (f6 * 10000.0f);
                            this.f3468p = (int) (f7 * 10000.0f);
                            int e2 = e(10000);
                            LinearInterpolator linearInterpolator = this.i;
                            q2.f3273a = (int) (this.f3467o * 1.2f);
                            q2.f3274b = (int) (this.f3468p * 1.2f);
                            q2.f3275c = (int) (e2 * 1.2f);
                            q2.f3276e = linearInterpolator;
                            q2.f3277f = true;
                        }
                    }
                    q2.d = this.f3456a;
                    i();
                }
            }
            boolean z2 = q2.d >= 0;
            q2.a(recyclerView);
            if (z2 && this.f3459e) {
                this.d = true;
                recyclerView.f1661W.a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(android.view.View r7, n0.Q r8) {
        /*
            r6 = this;
            android.graphics.PointF r0 = r6.f3463k
            r1 = 1
            r2 = 0
            r3 = -1
            r4 = 0
            if (r0 == 0) goto L15
            float r0 = r0.x
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto Lf
            goto L15
        Lf:
            if (r0 <= 0) goto L13
            r0 = r1
            goto L16
        L13:
            r0 = r3
            goto L16
        L15:
            r0 = r2
        L16:
            int r0 = r6.b(r7, r0)
            android.graphics.PointF r5 = r6.f3463k
            if (r5 == 0) goto L2a
            float r5 = r5.y
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 != 0) goto L25
            goto L2a
        L25:
            if (r4 <= 0) goto L29
            r2 = r1
            goto L2a
        L29:
            r2 = r3
        L2a:
            int r7 = r6.c(r7, r2)
            int r2 = r0 * r0
            int r3 = r7 * r7
            int r3 = r3 + r2
            double r2 = (double) r3
            double r2 = java.lang.Math.sqrt(r2)
            int r2 = (int) r2
            int r2 = r6.e(r2)
            double r2 = (double) r2
            r4 = 4599717252057688074(0x3fd57a786c22680a, double:0.3356)
            double r2 = r2 / r4
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            if (r2 <= 0) goto L59
            int r0 = -r0
            int r7 = -r7
            android.view.animation.DecelerateInterpolator r6 = r6.f3462j
            r8.f3273a = r0
            r8.f3274b = r7
            r8.f3275c = r2
            r8.f3276e = r6
            r8.f3277f = r1
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.C0298v.h(android.view.View, n0.Q):void");
    }

    public final void i() {
        if (this.f3459e) {
            this.f3459e = false;
            this.f3468p = 0;
            this.f3467o = 0;
            this.f3463k = null;
            this.f3457b.f1666c0.f3279a = -1;
            this.f3460f = null;
            this.f3456a = -1;
            this.d = false;
            H h = this.f3458c;
            if (h.f3249e == this) {
                h.f3249e = null;
            }
            this.f3458c = null;
            this.f3457b = null;
        }
    }
}
