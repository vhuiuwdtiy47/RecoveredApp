package w;

import android.view.ViewGroup;
import t.C0326d;

/* renamed from: w.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0367e extends ViewGroup.MarginLayoutParams {

    /* renamed from: A, reason: collision with root package name */
    public int f3960A;

    /* renamed from: B, reason: collision with root package name */
    public int f3961B;

    /* renamed from: C, reason: collision with root package name */
    public int f3962C;

    /* renamed from: D, reason: collision with root package name */
    public int f3963D;

    /* renamed from: E, reason: collision with root package name */
    public float f3964E;

    /* renamed from: F, reason: collision with root package name */
    public float f3965F;
    public String G;

    /* renamed from: H, reason: collision with root package name */
    public float f3966H;

    /* renamed from: I, reason: collision with root package name */
    public float f3967I;

    /* renamed from: J, reason: collision with root package name */
    public int f3968J;

    /* renamed from: K, reason: collision with root package name */
    public int f3969K;

    /* renamed from: L, reason: collision with root package name */
    public int f3970L;

    /* renamed from: M, reason: collision with root package name */
    public int f3971M;

    /* renamed from: N, reason: collision with root package name */
    public int f3972N;

    /* renamed from: O, reason: collision with root package name */
    public int f3973O;

    /* renamed from: P, reason: collision with root package name */
    public int f3974P;

    /* renamed from: Q, reason: collision with root package name */
    public int f3975Q;

    /* renamed from: R, reason: collision with root package name */
    public float f3976R;

    /* renamed from: S, reason: collision with root package name */
    public float f3977S;

    /* renamed from: T, reason: collision with root package name */
    public int f3978T;

    /* renamed from: U, reason: collision with root package name */
    public int f3979U;

    /* renamed from: V, reason: collision with root package name */
    public int f3980V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f3981W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f3982X;

    /* renamed from: Y, reason: collision with root package name */
    public String f3983Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f3984Z;

    /* renamed from: a, reason: collision with root package name */
    public int f3985a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f3986a0;

    /* renamed from: b, reason: collision with root package name */
    public int f3987b;
    public boolean b0;

    /* renamed from: c, reason: collision with root package name */
    public float f3988c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f3989c0;
    public boolean d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f3990d0;

    /* renamed from: e, reason: collision with root package name */
    public int f3991e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f3992e0;

    /* renamed from: f, reason: collision with root package name */
    public int f3993f;

    /* renamed from: f0, reason: collision with root package name */
    public int f3994f0;

    /* renamed from: g, reason: collision with root package name */
    public int f3995g;

    /* renamed from: g0, reason: collision with root package name */
    public int f3996g0;
    public int h;

    /* renamed from: h0, reason: collision with root package name */
    public int f3997h0;
    public int i;

    /* renamed from: i0, reason: collision with root package name */
    public int f3998i0;

    /* renamed from: j, reason: collision with root package name */
    public int f3999j;

    /* renamed from: j0, reason: collision with root package name */
    public int f4000j0;

    /* renamed from: k, reason: collision with root package name */
    public int f4001k;

    /* renamed from: k0, reason: collision with root package name */
    public int f4002k0;

    /* renamed from: l, reason: collision with root package name */
    public int f4003l;

    /* renamed from: l0, reason: collision with root package name */
    public float f4004l0;

    /* renamed from: m, reason: collision with root package name */
    public int f4005m;

    /* renamed from: m0, reason: collision with root package name */
    public int f4006m0;

    /* renamed from: n, reason: collision with root package name */
    public int f4007n;

    /* renamed from: n0, reason: collision with root package name */
    public int f4008n0;

    /* renamed from: o, reason: collision with root package name */
    public int f4009o;

    /* renamed from: o0, reason: collision with root package name */
    public float f4010o0;

    /* renamed from: p, reason: collision with root package name */
    public int f4011p;

    /* renamed from: p0, reason: collision with root package name */
    public C0326d f4012p0;

    /* renamed from: q, reason: collision with root package name */
    public int f4013q;

    /* renamed from: r, reason: collision with root package name */
    public float f4014r;

    /* renamed from: s, reason: collision with root package name */
    public int f4015s;

    /* renamed from: t, reason: collision with root package name */
    public int f4016t;

    /* renamed from: u, reason: collision with root package name */
    public int f4017u;

    /* renamed from: v, reason: collision with root package name */
    public int f4018v;

    /* renamed from: w, reason: collision with root package name */
    public int f4019w;

    /* renamed from: x, reason: collision with root package name */
    public int f4020x;

    /* renamed from: y, reason: collision with root package name */
    public int f4021y;

    /* renamed from: z, reason: collision with root package name */
    public int f4022z;

    public final void a() {
        this.f3990d0 = false;
        this.f3986a0 = true;
        this.b0 = true;
        int i = ((ViewGroup.MarginLayoutParams) this).width;
        if (i == -2 && this.f3981W) {
            this.f3986a0 = false;
            if (this.f3970L == 0) {
                this.f3970L = 1;
            }
        }
        int i2 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i2 == -2 && this.f3982X) {
            this.b0 = false;
            if (this.f3971M == 0) {
                this.f3971M = 1;
            }
        }
        if (i == 0 || i == -1) {
            this.f3986a0 = false;
            if (i == 0 && this.f3970L == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.f3981W = true;
            }
        }
        if (i2 == 0 || i2 == -1) {
            this.b0 = false;
            if (i2 == 0 && this.f3971M == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.f3982X = true;
            }
        }
        if (this.f3988c == -1.0f && this.f3985a == -1 && this.f3987b == -1) {
            return;
        }
        this.f3990d0 = true;
        this.f3986a0 = true;
        this.b0 = true;
        if (!(this.f4012p0 instanceof t.h)) {
            this.f4012p0 = new t.h();
        }
        ((t.h) this.f4012p0).S(this.f3980V);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void resolveLayoutDirection(int r11) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w.C0367e.resolveLayoutDirection(int):void");
    }
}
