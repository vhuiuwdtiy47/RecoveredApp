package t0;

import android.graphics.Paint;

/* renamed from: t0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0336i extends AbstractC0339l {
    public C.d d;

    /* renamed from: e, reason: collision with root package name */
    public float f3840e;

    /* renamed from: f, reason: collision with root package name */
    public C.d f3841f;

    /* renamed from: g, reason: collision with root package name */
    public float f3842g;
    public float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f3843j;

    /* renamed from: k, reason: collision with root package name */
    public float f3844k;

    /* renamed from: l, reason: collision with root package name */
    public Paint.Cap f3845l;

    /* renamed from: m, reason: collision with root package name */
    public Paint.Join f3846m;

    /* renamed from: n, reason: collision with root package name */
    public float f3847n;

    @Override // t0.AbstractC0338k
    public final boolean a() {
        return this.f3841f.c() || this.d.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // t0.AbstractC0338k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(int[] r6) {
        /*
            r5 = this;
            C.d r0 = r5.f3841f
            boolean r1 = r0.c()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.f50c
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            int r4 = r1.getDefaultColor()
            int r1 = r1.getColorForState(r6, r4)
            int r4 = r0.f48a
            if (r1 == r4) goto L1e
            r0.f48a = r1
            r0 = r3
            goto L1f
        L1e:
            r0 = r2
        L1f:
            C.d r5 = r5.d
            boolean r1 = r5.c()
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r5.f50c
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            int r4 = r1.getDefaultColor()
            int r6 = r1.getColorForState(r6, r4)
            int r1 = r5.f48a
            if (r6 == r1) goto L3a
            r5.f48a = r6
            r2 = r3
        L3a:
            r5 = r0 | r2
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.C0336i.b(int[]):boolean");
    }

    public float getFillAlpha() {
        return this.h;
    }

    public int getFillColor() {
        return this.f3841f.f48a;
    }

    public float getStrokeAlpha() {
        return this.f3842g;
    }

    public int getStrokeColor() {
        return this.d.f48a;
    }

    public float getStrokeWidth() {
        return this.f3840e;
    }

    public float getTrimPathEnd() {
        return this.f3843j;
    }

    public float getTrimPathOffset() {
        return this.f3844k;
    }

    public float getTrimPathStart() {
        return this.i;
    }

    public void setFillAlpha(float f2) {
        this.h = f2;
    }

    public void setFillColor(int i) {
        this.f3841f.f48a = i;
    }

    public void setStrokeAlpha(float f2) {
        this.f3842g = f2;
    }

    public void setStrokeColor(int i) {
        this.d.f48a = i;
    }

    public void setStrokeWidth(float f2) {
        this.f3840e = f2;
    }

    public void setTrimPathEnd(float f2) {
        this.f3843j = f2;
    }

    public void setTrimPathOffset(float f2) {
        this.f3844k = f2;
    }

    public void setTrimPathStart(float f2) {
        this.i = f2;
    }
}
