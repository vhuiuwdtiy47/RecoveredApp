package T;

import L.S;
import Z0.i;
import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: v, reason: collision with root package name */
    public static final d f644v = new d(0);

    /* renamed from: a, reason: collision with root package name */
    public int f645a;

    /* renamed from: b, reason: collision with root package name */
    public final int f646b;
    public float[] d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f648e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f649f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f650g;
    public int[] h;
    public int[] i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f651j;

    /* renamed from: k, reason: collision with root package name */
    public int f652k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f653l;

    /* renamed from: m, reason: collision with root package name */
    public final float f654m;

    /* renamed from: n, reason: collision with root package name */
    public final float f655n;

    /* renamed from: o, reason: collision with root package name */
    public final int f656o;

    /* renamed from: p, reason: collision with root package name */
    public final OverScroller f657p;

    /* renamed from: q, reason: collision with root package name */
    public final i f658q;

    /* renamed from: r, reason: collision with root package name */
    public View f659r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f660s;

    /* renamed from: t, reason: collision with root package name */
    public final CoordinatorLayout f661t;

    /* renamed from: c, reason: collision with root package name */
    public int f647c = -1;

    /* renamed from: u, reason: collision with root package name */
    public final D0.i f662u = new D0.i(2, this);

    public e(Context context, CoordinatorLayout coordinatorLayout, i iVar) {
        if (coordinatorLayout == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (iVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f661t = coordinatorLayout;
        this.f658q = iVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f656o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f646b = viewConfiguration.getScaledTouchSlop();
        this.f654m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f655n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f657p = new OverScroller(context, f644v);
    }

    public final void a() {
        this.f647c = -1;
        float[] fArr = this.d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f648e, 0.0f);
            Arrays.fill(this.f649f, 0.0f);
            Arrays.fill(this.f650g, 0.0f);
            Arrays.fill(this.h, 0);
            Arrays.fill(this.i, 0);
            Arrays.fill(this.f651j, 0);
            this.f652k = 0;
        }
        VelocityTracker velocityTracker = this.f653l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f653l = null;
        }
    }

    public final void b(View view, int i) {
        ViewParent parent = view.getParent();
        CoordinatorLayout coordinatorLayout = this.f661t;
        if (parent != coordinatorLayout) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + coordinatorLayout + ")");
        }
        this.f659r = view;
        this.f647c = i;
        this.f658q.V(view, i);
        n(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(android.view.View r4, float r5, float r6) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            goto L45
        L4:
            Z0.i r1 = r3.f658q
            int r4 = r1.E(r4)
            r2 = 1
            if (r4 <= 0) goto Lf
            r4 = r2
            goto L10
        Lf:
            r4 = r0
        L10:
            int r1 = r1.F()
            if (r1 <= 0) goto L18
            r1 = r2
            goto L19
        L18:
            r1 = r0
        L19:
            if (r4 == 0) goto L29
            if (r1 == 0) goto L29
            float r5 = r5 * r5
            float r6 = r6 * r6
            float r6 = r6 + r5
            int r3 = r3.f646b
            int r3 = r3 * r3
            float r3 = (float) r3
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 <= 0) goto L45
            goto L44
        L29:
            if (r4 == 0) goto L37
            float r4 = java.lang.Math.abs(r5)
            int r3 = r3.f646b
            float r3 = (float) r3
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 <= 0) goto L45
            goto L44
        L37:
            if (r1 == 0) goto L45
            float r4 = java.lang.Math.abs(r6)
            int r3 = r3.f646b
            float r3 = (float) r3
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 <= 0) goto L45
        L44:
            return r2
        L45:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: T.e.c(android.view.View, float, float):boolean");
    }

    public final void d(int i) {
        float[] fArr = this.d;
        if (fArr != null) {
            int i2 = this.f652k;
            int i3 = 1 << i;
            if ((i2 & i3) != 0) {
                fArr[i] = 0.0f;
                this.f648e[i] = 0.0f;
                this.f649f[i] = 0.0f;
                this.f650g[i] = 0.0f;
                this.h[i] = 0;
                this.i[i] = 0;
                this.f651j[i] = 0;
                this.f652k = (~i3) & i2;
            }
        }
    }

    public final int e(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        float width = this.f661t.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / r3) - 0.5f) * 0.47123894f)) * width) + width;
        int abs = Math.abs(i2);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / abs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
    }

    public final boolean f() {
        if (this.f645a == 2) {
            OverScroller overScroller = this.f657p;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f659r.getLeft();
            int top = currY - this.f659r.getTop();
            if (left != 0) {
                View view = this.f659r;
                WeakHashMap weakHashMap = S.f311a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f659r;
                WeakHashMap weakHashMap2 = S.f311a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f658q.X(this.f659r, currX, currY);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.f661t.post(this.f662u);
            }
        }
        return this.f645a == 2;
    }

    public final View g(int i, int i2) {
        CoordinatorLayout coordinatorLayout = this.f661t;
        for (int childCount = coordinatorLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f658q.getClass();
            View childAt = coordinatorLayout.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean h(int i, int i2, int i3, int i4) {
        float f2;
        float f3;
        float f4;
        float f5;
        int left = this.f659r.getLeft();
        int top = this.f659r.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        OverScroller overScroller = this.f657p;
        if (i5 == 0 && i6 == 0) {
            overScroller.abortAnimation();
            n(0);
            return false;
        }
        View view = this.f659r;
        int i7 = (int) this.f655n;
        int i8 = (int) this.f654m;
        int abs = Math.abs(i3);
        if (abs < i7) {
            i3 = 0;
        } else if (abs > i8) {
            i3 = i3 > 0 ? i8 : -i8;
        }
        int abs2 = Math.abs(i4);
        if (abs2 < i7) {
            i4 = 0;
        } else if (abs2 > i8) {
            i4 = i4 > 0 ? i8 : -i8;
        }
        int abs3 = Math.abs(i5);
        int abs4 = Math.abs(i6);
        int abs5 = Math.abs(i3);
        int abs6 = Math.abs(i4);
        int i9 = abs5 + abs6;
        int i10 = abs3 + abs4;
        if (i3 != 0) {
            f2 = abs5;
            f3 = i9;
        } else {
            f2 = abs3;
            f3 = i10;
        }
        float f6 = f2 / f3;
        if (i4 != 0) {
            f4 = abs6;
            f5 = i9;
        } else {
            f4 = abs4;
            f5 = i10;
        }
        float f7 = f4 / f5;
        i iVar = this.f658q;
        overScroller.startScroll(left, top, i5, i6, (int) ((e(i6, i4, iVar.F()) * f7) + (e(i5, i3, iVar.E(view)) * f6)));
        n(2);
        return true;
    }

    public final boolean i(int i) {
        if ((this.f652k & (1 << i)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void j(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f653l == null) {
            this.f653l = VelocityTracker.obtain();
        }
        this.f653l.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View g2 = g((int) x2, (int) y2);
            l(x2, y2, pointerId);
            q(g2, pointerId);
            int i3 = this.h[pointerId];
            return;
        }
        if (actionMasked == 1) {
            if (this.f645a == 1) {
                k();
            }
            a();
            return;
        }
        i iVar = this.f658q;
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f645a == 1) {
                    this.f660s = true;
                    iVar.Y(this.f659r, 0.0f, 0.0f);
                    this.f660s = false;
                    if (this.f645a == 1) {
                        n(0);
                    }
                }
                a();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x3 = motionEvent.getX(actionIndex);
                float y3 = motionEvent.getY(actionIndex);
                l(x3, y3, pointerId2);
                if (this.f645a == 0) {
                    q(g((int) x3, (int) y3), pointerId2);
                    int i4 = this.h[pointerId2];
                    return;
                }
                int i5 = (int) x3;
                int i6 = (int) y3;
                View view = this.f659r;
                if (view != null && i5 >= view.getLeft() && i5 < view.getRight() && i6 >= view.getTop() && i6 < view.getBottom()) {
                    q(this.f659r, pointerId2);
                    return;
                }
                return;
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f645a == 1 && pointerId3 == this.f647c) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (i2 >= pointerCount) {
                        i = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i2);
                    if (pointerId4 != this.f647c) {
                        View g3 = g((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                        View view2 = this.f659r;
                        if (g3 == view2 && q(view2, pointerId4)) {
                            i = this.f647c;
                            break;
                        }
                    }
                    i2++;
                }
                if (i == -1) {
                    k();
                }
            }
            d(pointerId3);
            return;
        }
        if (this.f645a == 1) {
            if (i(this.f647c)) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f647c);
                float x4 = motionEvent.getX(findPointerIndex);
                float y4 = motionEvent.getY(findPointerIndex);
                float[] fArr = this.f649f;
                int i7 = this.f647c;
                int i8 = (int) (x4 - fArr[i7]);
                int i9 = (int) (y4 - this.f650g[i7]);
                int left = this.f659r.getLeft() + i8;
                int top = this.f659r.getTop() + i9;
                int left2 = this.f659r.getLeft();
                int top2 = this.f659r.getTop();
                if (i8 != 0) {
                    left = iVar.m(this.f659r, left);
                    WeakHashMap weakHashMap = S.f311a;
                    this.f659r.offsetLeftAndRight(left - left2);
                }
                if (i9 != 0) {
                    top = iVar.n(this.f659r, top);
                    WeakHashMap weakHashMap2 = S.f311a;
                    this.f659r.offsetTopAndBottom(top - top2);
                }
                if (i8 != 0 || i9 != 0) {
                    iVar.X(this.f659r, left, top);
                }
                m(motionEvent);
                return;
            }
            return;
        }
        int pointerCount2 = motionEvent.getPointerCount();
        while (i2 < pointerCount2) {
            int pointerId5 = motionEvent.getPointerId(i2);
            if (i(pointerId5)) {
                float x5 = motionEvent.getX(i2);
                float y5 = motionEvent.getY(i2);
                float f2 = x5 - this.d[pointerId5];
                float f3 = y5 - this.f648e[pointerId5];
                Math.abs(f2);
                Math.abs(f3);
                int i10 = this.h[pointerId5];
                Math.abs(f3);
                Math.abs(f2);
                int i11 = this.h[pointerId5];
                Math.abs(f2);
                Math.abs(f3);
                int i12 = this.h[pointerId5];
                Math.abs(f3);
                Math.abs(f2);
                int i13 = this.h[pointerId5];
                if (this.f645a != 1) {
                    View g4 = g((int) x5, (int) y5);
                    if (c(g4, f2, f3) && q(g4, pointerId5)) {
                        break;
                    }
                } else {
                    break;
                }
            }
            i2++;
        }
        m(motionEvent);
    }

    public final void k() {
        VelocityTracker velocityTracker = this.f653l;
        float f2 = this.f654m;
        velocityTracker.computeCurrentVelocity(1000, f2);
        float xVelocity = this.f653l.getXVelocity(this.f647c);
        float f3 = this.f655n;
        float abs = Math.abs(xVelocity);
        if (abs < f3) {
            xVelocity = 0.0f;
        } else if (abs > f2) {
            xVelocity = xVelocity > 0.0f ? f2 : -f2;
        }
        float yVelocity = this.f653l.getYVelocity(this.f647c);
        float abs2 = Math.abs(yVelocity);
        if (abs2 < f3) {
            f2 = 0.0f;
        } else if (abs2 <= f2) {
            f2 = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f2 = -f2;
        }
        this.f660s = true;
        this.f658q.Y(this.f659r, xVelocity, f2);
        this.f660s = false;
        if (this.f645a == 1) {
            n(0);
        }
    }

    public final void l(float f2, float f3, int i) {
        float[] fArr = this.d;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f648e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f649f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f650g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f651j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.d = fArr2;
            this.f648e = fArr3;
            this.f649f = fArr4;
            this.f650g = fArr5;
            this.h = iArr;
            this.i = iArr2;
            this.f651j = iArr3;
        }
        float[] fArr9 = this.d;
        this.f649f[i] = f2;
        fArr9[i] = f2;
        float[] fArr10 = this.f648e;
        this.f650g[i] = f3;
        fArr10[i] = f3;
        int[] iArr7 = this.h;
        int i3 = (int) f2;
        int i4 = (int) f3;
        CoordinatorLayout coordinatorLayout = this.f661t;
        int left = coordinatorLayout.getLeft();
        int i5 = this.f656o;
        int i6 = i3 < left + i5 ? 1 : 0;
        if (i4 < coordinatorLayout.getTop() + i5) {
            i6 |= 4;
        }
        if (i3 > coordinatorLayout.getRight() - i5) {
            i6 |= 2;
        }
        if (i4 > coordinatorLayout.getBottom() - i5) {
            i6 |= 8;
        }
        iArr7[i] = i6;
        this.f652k |= 1 << i;
    }

    public final void m(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (i(pointerId)) {
                float x2 = motionEvent.getX(i);
                float y2 = motionEvent.getY(i);
                this.f649f[pointerId] = x2;
                this.f650g[pointerId] = y2;
            }
        }
    }

    public final void n(int i) {
        this.f661t.removeCallbacks(this.f662u);
        if (this.f645a != i) {
            this.f645a = i;
            this.f658q.W(i);
            if (this.f645a == 0) {
                this.f659r = null;
            }
        }
    }

    public final boolean o(int i, int i2) {
        if (this.f660s) {
            return h(i, i2, (int) this.f653l.getXVelocity(this.f647c), (int) this.f653l.getYVelocity(this.f647c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cd, code lost:
    
        if (r12 != r11) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean p(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T.e.p(android.view.MotionEvent):boolean");
    }

    public final boolean q(View view, int i) {
        if (view == this.f659r && this.f647c == i) {
            return true;
        }
        if (view == null || !this.f658q.l0(view, i)) {
            return false;
        }
        this.f647c = i;
        b(view, i);
        return true;
    }
}
