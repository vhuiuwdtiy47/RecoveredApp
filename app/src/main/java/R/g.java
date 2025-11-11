package R;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import l.C0254q0;

/* loaded from: classes.dex */
public final class g implements View.OnTouchListener {

    /* renamed from: r, reason: collision with root package name */
    public static final int f608r = ViewConfiguration.getTapTimeout();

    /* renamed from: a, reason: collision with root package name */
    public final a f609a;

    /* renamed from: b, reason: collision with root package name */
    public final AccelerateInterpolator f610b;

    /* renamed from: c, reason: collision with root package name */
    public final ListView f611c;
    public D0.i d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f612e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f613f;

    /* renamed from: g, reason: collision with root package name */
    public final int f614g;
    public final int h;
    public final float[] i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f615j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f616k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f617l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f618m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f619n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f620o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f621p;

    /* renamed from: q, reason: collision with root package name */
    public final C0254q0 f622q;

    /* JADX WARN: Type inference failed for: r1v0, types: [R.a, java.lang.Object] */
    public g(C0254q0 c0254q0) {
        ?? obj = new Object();
        obj.f605e = Long.MIN_VALUE;
        obj.f607g = -1L;
        obj.f606f = 0L;
        this.f609a = obj;
        this.f610b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f612e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f613f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.i = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f615j = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f616k = fArr5;
        this.f611c = c0254q0;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        float f3 = ((int) ((1575.0f * f2) + 0.5f)) / 1000.0f;
        fArr5[0] = f3;
        fArr5[1] = f3;
        float f4 = ((int) ((f2 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f4;
        fArr4[1] = f4;
        this.f614g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.h = f608r;
        obj.f602a = 500;
        obj.f603b = 500;
        this.f622q = c0254q0;
    }

    public static float b(float f2, float f3, float f4) {
        return f2 > f4 ? f4 : f2 < f3 ? f3 : f2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.f612e
            r0 = r0[r4]
            float[] r1 = r3.f613f
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.c(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.f610b
            if (r6 >= 0) goto L25
            float r5 = -r5
            float r5 = r0.getInterpolation(r5)
            float r5 = -r5
            goto L2d
        L25:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L36
            float r5 = r0.getInterpolation(r5)
        L2d:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = b(r5, r6, r0)
            goto L37
        L36:
            r5 = r2
        L37:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L3c
            return r2
        L3c:
            float[] r0 = r3.i
            r0 = r0[r4]
            float[] r1 = r3.f615j
            r1 = r1[r4]
            float[] r3 = r3.f616k
            r3 = r3[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L51
            float r5 = r5 * r0
            float r3 = b(r5, r1, r3)
            return r3
        L51:
            float r4 = -r5
            float r4 = r4 * r0
            float r3 = b(r4, r1, r3)
            float r3 = -r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: R.g.a(int, float, float, float):float");
    }

    public final float c(float f2, float f3) {
        if (f3 != 0.0f) {
            int i = this.f614g;
            if (i == 0 || i == 1) {
                if (f2 < f3) {
                    if (f2 >= 0.0f) {
                        return 1.0f - (f2 / f3);
                    }
                    if (this.f620o && i == 1) {
                        return 1.0f;
                    }
                }
            } else if (i == 2 && f2 < 0.0f) {
                return f2 / (-f3);
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i = 0;
        if (this.f618m) {
            this.f620o = false;
            return;
        }
        a aVar = this.f609a;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (currentAnimationTimeMillis - aVar.f605e);
        int i3 = aVar.f603b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        aVar.i = i;
        aVar.h = aVar.a(currentAnimationTimeMillis);
        aVar.f607g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        C0254q0 c0254q0;
        int count;
        a aVar = this.f609a;
        float f2 = aVar.d;
        int abs = (int) (f2 / Math.abs(f2));
        Math.abs(aVar.f604c);
        if (abs != 0 && (count = (c0254q0 = this.f622q).getCount()) != 0) {
            int childCount = c0254q0.getChildCount();
            int firstVisiblePosition = c0254q0.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (abs <= 0 ? !(abs >= 0 || (firstVisiblePosition <= 0 && c0254q0.getChildAt(0).getTop() >= 0)) : !(i >= count && c0254q0.getChildAt(childCount - 1).getBottom() <= c0254q0.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0014, code lost:
    
        if (r1 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            r0 = 1
            boolean r1 = r7.f621p
            r2 = 0
            if (r1 != 0) goto L8
            goto L7c
        L8:
            int r1 = r9.getActionMasked()
            if (r1 == 0) goto L1b
            if (r1 == r0) goto L17
            r3 = 2
            if (r1 == r3) goto L1f
            r8 = 3
            if (r1 == r8) goto L17
            goto L7c
        L17:
            r7.d()
            return r2
        L1b:
            r7.f619n = r0
            r7.f617l = r2
        L1f:
            float r1 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            android.widget.ListView r4 = r7.f611c
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r1 = r7.a(r2, r1, r3, r5)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r0, r9, r8, r3)
            R.a r9 = r7.f609a
            r9.f604c = r1
            r9.d = r8
            boolean r8 = r7.f620o
            if (r8 != 0) goto L7c
            boolean r8 = r7.e()
            if (r8 == 0) goto L7c
            D0.i r8 = r7.d
            if (r8 != 0) goto L60
            D0.i r8 = new D0.i
            r8.<init>(r0, r7)
            r7.d = r8
        L60:
            r7.f620o = r0
            r7.f618m = r0
            boolean r8 = r7.f617l
            if (r8 != 0) goto L75
            int r8 = r7.h
            if (r8 <= 0) goto L75
            D0.i r9 = r7.d
            long r5 = (long) r8
            java.util.WeakHashMap r8 = L.S.f311a
            r4.postOnAnimationDelayed(r9, r5)
            goto L7a
        L75:
            D0.i r8 = r7.d
            r8.run()
        L7a:
            r7.f617l = r0
        L7c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: R.g.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
