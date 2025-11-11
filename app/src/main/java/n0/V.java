package n0;

import android.view.animation.BaseInterpolator;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class V implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public int f3290a;

    /* renamed from: b, reason: collision with root package name */
    public int f3291b;

    /* renamed from: c, reason: collision with root package name */
    public OverScroller f3292c;
    public Interpolator d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3293e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3294f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f3295g;

    public V(RecyclerView recyclerView) {
        this.f3295g = recyclerView;
        T.d dVar = RecyclerView.f1639u0;
        this.d = dVar;
        this.f3293e = false;
        this.f3294f = false;
        this.f3292c = new OverScroller(recyclerView.getContext(), dVar);
    }

    public final void a() {
        if (this.f3293e) {
            this.f3294f = true;
            return;
        }
        RecyclerView recyclerView = this.f3295g;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = L.S.f311a;
        recyclerView.postOnAnimation(this);
    }

    public final void b(int i, int i2, int i3, BaseInterpolator baseInterpolator) {
        int i4;
        RecyclerView recyclerView = this.f3295g;
        if (i3 == Integer.MIN_VALUE) {
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z2 = abs > abs2;
            int sqrt = (int) Math.sqrt(0);
            int sqrt2 = (int) Math.sqrt((i2 * i2) + (i * i));
            int width = z2 ? recyclerView.getWidth() : recyclerView.getHeight();
            int i5 = width / 2;
            float f2 = width;
            float f3 = i5;
            float sin = (((float) Math.sin((Math.min(1.0f, (sqrt2 * 1.0f) / f2) - 0.5f) * 0.47123894f)) * f3) + f3;
            if (sqrt > 0) {
                i4 = Math.round(Math.abs(sin / sqrt) * 1000.0f) * 4;
            } else {
                if (!z2) {
                    abs = abs2;
                }
                i4 = (int) (((abs / f2) + 1.0f) * 300.0f);
            }
            i3 = Math.min(i4, 2000);
        }
        int i6 = i3;
        Interpolator interpolator = baseInterpolator;
        if (baseInterpolator == null) {
            interpolator = RecyclerView.f1639u0;
        }
        if (this.d != interpolator) {
            this.d = interpolator;
            this.f3292c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f3291b = 0;
        this.f3290a = 0;
        recyclerView.setScrollState(2);
        this.f3292c.startScroll(0, 0, i, i2, i6);
        a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        boolean awakenScrollBars;
        RecyclerView recyclerView = this.f3295g;
        if (recyclerView.f1680l == null) {
            recyclerView.removeCallbacks(this);
            this.f3292c.abortAnimation();
            return;
        }
        this.f3294f = false;
        this.f3293e = true;
        recyclerView.m();
        OverScroller overScroller = this.f3292c;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i5 = currX - this.f3290a;
            int i6 = currY - this.f3291b;
            this.f3290a = currX;
            this.f3291b = currY;
            int[] iArr = recyclerView.f1687o0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean r2 = recyclerView.r(i5, i6, 1, iArr, null);
            int[] iArr2 = recyclerView.f1687o0;
            if (r2) {
                i = i5 - iArr2[0];
                i2 = i6 - iArr2[1];
            } else {
                i = i5;
                i2 = i6;
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.l(i, i2);
            }
            if (recyclerView.f1678k != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                recyclerView.X(i, i2, iArr2);
                i3 = iArr2[0];
                i4 = iArr2[1];
                i -= i3;
                i2 -= i4;
                C0298v c0298v = recyclerView.f1680l.f3249e;
                if (c0298v != null && !c0298v.d && c0298v.f3459e) {
                    int b2 = recyclerView.f1666c0.b();
                    if (b2 == 0) {
                        c0298v.i();
                    } else if (c0298v.f3456a >= b2) {
                        c0298v.f3456a = b2 - 1;
                        c0298v.g(i3, i4);
                    } else {
                        c0298v.g(i3, i4);
                    }
                }
            } else {
                i3 = 0;
                i4 = 0;
            }
            if (!recyclerView.f1682m.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f1687o0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.s(i3, i4, i, i2, null, 1, iArr3);
            int i7 = i - iArr2[0];
            int i8 = i2 - iArr2[1];
            if (i3 != 0 || i4 != 0) {
                recyclerView.t(i3, i4);
            }
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            boolean z2 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i7 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i8 != 0));
            C0298v c0298v2 = recyclerView.f1680l.f3249e;
            if ((c0298v2 == null || !c0298v2.d) && z2) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i9 = i7 < 0 ? -currVelocity : i7 > 0 ? currVelocity : 0;
                    if (i8 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i8 <= 0) {
                        currVelocity = 0;
                    }
                    if (i9 < 0) {
                        recyclerView.v();
                        if (recyclerView.f1643D.isFinished()) {
                            recyclerView.f1643D.onAbsorb(-i9);
                        }
                    } else if (i9 > 0) {
                        recyclerView.w();
                        if (recyclerView.f1645F.isFinished()) {
                            recyclerView.f1645F.onAbsorb(i9);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.x();
                        if (recyclerView.f1644E.isFinished()) {
                            recyclerView.f1644E.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.u();
                        if (recyclerView.G.isFinished()) {
                            recyclerView.G.onAbsorb(currVelocity);
                        }
                    }
                    if (i9 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = L.S.f311a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                C0290m c0290m = recyclerView.b0;
                int[] iArr4 = c0290m.f3419c;
                if (iArr4 != null) {
                    Arrays.fill(iArr4, -1);
                }
                c0290m.d = 0;
            } else {
                a();
                RunnableC0292o runnableC0292o = recyclerView.f1663a0;
                if (runnableC0292o != null) {
                    runnableC0292o.a(recyclerView, i3, i4);
                }
            }
        }
        C0298v c0298v3 = recyclerView.f1680l.f3249e;
        if (c0298v3 != null && c0298v3.d) {
            c0298v3.g(0, 0);
        }
        this.f3293e = false;
        if (!this.f3294f) {
            recyclerView.setScrollState(0);
            recyclerView.c0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = L.S.f311a;
            recyclerView.postOnAnimation(this);
        }
    }
}
