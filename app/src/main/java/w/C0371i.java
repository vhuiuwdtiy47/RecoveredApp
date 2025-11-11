package w;

import android.view.ViewGroup;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: w.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0371i {

    /* renamed from: a, reason: collision with root package name */
    public int f4042a;

    /* renamed from: b, reason: collision with root package name */
    public final l f4043b;

    /* renamed from: c, reason: collision with root package name */
    public final k f4044c;
    public final C0372j d;

    /* renamed from: e, reason: collision with root package name */
    public final m f4045e;

    /* renamed from: f, reason: collision with root package name */
    public HashMap f4046f;

    /* JADX WARN: Type inference failed for: r0v0, types: [w.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [w.k, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [w.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [w.m, java.lang.Object] */
    public C0371i() {
        ?? obj = new Object();
        obj.f4117a = 0;
        obj.f4118b = 0;
        obj.f4119c = 1.0f;
        obj.d = Float.NaN;
        this.f4043b = obj;
        ?? obj2 = new Object();
        obj2.f4111a = -1;
        obj2.f4112b = 0;
        obj2.f4113c = -1;
        obj2.d = Float.NaN;
        obj2.f4114e = Float.NaN;
        obj2.f4115f = Float.NaN;
        obj2.f4116g = -1;
        obj2.h = null;
        obj2.i = -1;
        this.f4044c = obj2;
        ?? obj3 = new Object();
        obj3.f4073a = false;
        obj3.d = -1;
        obj3.f4079e = -1;
        obj3.f4081f = -1.0f;
        obj3.f4083g = true;
        obj3.h = -1;
        obj3.i = -1;
        obj3.f4087j = -1;
        obj3.f4089k = -1;
        obj3.f4091l = -1;
        obj3.f4093m = -1;
        obj3.f4095n = -1;
        obj3.f4097o = -1;
        obj3.f4099p = -1;
        obj3.f4100q = -1;
        obj3.f4101r = -1;
        obj3.f4102s = -1;
        obj3.f4103t = -1;
        obj3.f4104u = -1;
        obj3.f4105v = -1;
        obj3.f4106w = 0.5f;
        obj3.f4107x = 0.5f;
        obj3.f4108y = null;
        obj3.f4109z = -1;
        obj3.f4048A = 0;
        obj3.f4049B = 0.0f;
        obj3.f4050C = -1;
        obj3.f4051D = -1;
        obj3.f4052E = -1;
        obj3.f4053F = 0;
        obj3.G = 0;
        obj3.f4054H = 0;
        obj3.f4055I = 0;
        obj3.f4056J = 0;
        obj3.f4057K = 0;
        obj3.f4058L = 0;
        obj3.f4059M = Integer.MIN_VALUE;
        obj3.f4060N = Integer.MIN_VALUE;
        obj3.f4061O = Integer.MIN_VALUE;
        obj3.f4062P = Integer.MIN_VALUE;
        obj3.f4063Q = Integer.MIN_VALUE;
        obj3.f4064R = Integer.MIN_VALUE;
        obj3.f4065S = Integer.MIN_VALUE;
        obj3.f4066T = -1.0f;
        obj3.f4067U = -1.0f;
        obj3.f4068V = 0;
        obj3.f4069W = 0;
        obj3.f4070X = 0;
        obj3.f4071Y = 0;
        obj3.f4072Z = 0;
        obj3.f4074a0 = 0;
        obj3.b0 = 0;
        obj3.f4077c0 = 0;
        obj3.f4078d0 = 1.0f;
        obj3.f4080e0 = 1.0f;
        obj3.f4082f0 = -1;
        obj3.f4084g0 = 0;
        obj3.f4085h0 = -1;
        obj3.f4092l0 = false;
        obj3.f4094m0 = false;
        obj3.f4096n0 = true;
        obj3.f4098o0 = 0;
        this.d = obj3;
        ?? obj4 = new Object();
        obj4.f4121a = 0.0f;
        obj4.f4122b = 0.0f;
        obj4.f4123c = 0.0f;
        obj4.d = 1.0f;
        obj4.f4124e = 1.0f;
        obj4.f4125f = Float.NaN;
        obj4.f4126g = Float.NaN;
        obj4.h = -1;
        obj4.i = 0.0f;
        obj4.f4127j = 0.0f;
        obj4.f4128k = 0.0f;
        obj4.f4129l = false;
        obj4.f4130m = 0.0f;
        this.f4045e = obj4;
        this.f4046f = new HashMap();
    }

    public final void a(C0367e c0367e) {
        C0372j c0372j = this.d;
        c0367e.f3991e = c0372j.h;
        c0367e.f3993f = c0372j.i;
        c0367e.f3995g = c0372j.f4087j;
        c0367e.h = c0372j.f4089k;
        c0367e.i = c0372j.f4091l;
        c0367e.f3999j = c0372j.f4093m;
        c0367e.f4001k = c0372j.f4095n;
        c0367e.f4003l = c0372j.f4097o;
        c0367e.f4005m = c0372j.f4099p;
        c0367e.f4007n = c0372j.f4100q;
        c0367e.f4009o = c0372j.f4101r;
        c0367e.f4015s = c0372j.f4102s;
        c0367e.f4016t = c0372j.f4103t;
        c0367e.f4017u = c0372j.f4104u;
        c0367e.f4018v = c0372j.f4105v;
        ((ViewGroup.MarginLayoutParams) c0367e).leftMargin = c0372j.f4053F;
        ((ViewGroup.MarginLayoutParams) c0367e).rightMargin = c0372j.G;
        ((ViewGroup.MarginLayoutParams) c0367e).topMargin = c0372j.f4054H;
        ((ViewGroup.MarginLayoutParams) c0367e).bottomMargin = c0372j.f4055I;
        c0367e.f3960A = c0372j.f4064R;
        c0367e.f3961B = c0372j.f4063Q;
        c0367e.f4020x = c0372j.f4060N;
        c0367e.f4022z = c0372j.f4062P;
        c0367e.f3964E = c0372j.f4106w;
        c0367e.f3965F = c0372j.f4107x;
        c0367e.f4011p = c0372j.f4109z;
        c0367e.f4013q = c0372j.f4048A;
        c0367e.f4014r = c0372j.f4049B;
        c0367e.G = c0372j.f4108y;
        c0367e.f3978T = c0372j.f4050C;
        c0367e.f3979U = c0372j.f4051D;
        c0367e.f3967I = c0372j.f4066T;
        c0367e.f3966H = c0372j.f4067U;
        c0367e.f3969K = c0372j.f4069W;
        c0367e.f3968J = c0372j.f4068V;
        c0367e.f3981W = c0372j.f4092l0;
        c0367e.f3982X = c0372j.f4094m0;
        c0367e.f3970L = c0372j.f4070X;
        c0367e.f3971M = c0372j.f4071Y;
        c0367e.f3974P = c0372j.f4072Z;
        c0367e.f3975Q = c0372j.f4074a0;
        c0367e.f3972N = c0372j.b0;
        c0367e.f3973O = c0372j.f4077c0;
        c0367e.f3976R = c0372j.f4078d0;
        c0367e.f3977S = c0372j.f4080e0;
        c0367e.f3980V = c0372j.f4052E;
        c0367e.f3988c = c0372j.f4081f;
        c0367e.f3985a = c0372j.d;
        c0367e.f3987b = c0372j.f4079e;
        ((ViewGroup.MarginLayoutParams) c0367e).width = c0372j.f4075b;
        ((ViewGroup.MarginLayoutParams) c0367e).height = c0372j.f4076c;
        String str = c0372j.f4090k0;
        if (str != null) {
            c0367e.f3983Y = str;
        }
        c0367e.f3984Z = c0372j.f4098o0;
        c0367e.setMarginStart(c0372j.f4057K);
        c0367e.setMarginEnd(c0372j.f4056J);
        c0367e.a();
    }

    public final Object clone() {
        C0371i c0371i = new C0371i();
        C0372j c0372j = c0371i.d;
        c0372j.getClass();
        C0372j c0372j2 = this.d;
        c0372j.f4073a = c0372j2.f4073a;
        c0372j.f4075b = c0372j2.f4075b;
        c0372j.f4076c = c0372j2.f4076c;
        c0372j.d = c0372j2.d;
        c0372j.f4079e = c0372j2.f4079e;
        c0372j.f4081f = c0372j2.f4081f;
        c0372j.f4083g = c0372j2.f4083g;
        c0372j.h = c0372j2.h;
        c0372j.i = c0372j2.i;
        c0372j.f4087j = c0372j2.f4087j;
        c0372j.f4089k = c0372j2.f4089k;
        c0372j.f4091l = c0372j2.f4091l;
        c0372j.f4093m = c0372j2.f4093m;
        c0372j.f4095n = c0372j2.f4095n;
        c0372j.f4097o = c0372j2.f4097o;
        c0372j.f4099p = c0372j2.f4099p;
        c0372j.f4100q = c0372j2.f4100q;
        c0372j.f4101r = c0372j2.f4101r;
        c0372j.f4102s = c0372j2.f4102s;
        c0372j.f4103t = c0372j2.f4103t;
        c0372j.f4104u = c0372j2.f4104u;
        c0372j.f4105v = c0372j2.f4105v;
        c0372j.f4106w = c0372j2.f4106w;
        c0372j.f4107x = c0372j2.f4107x;
        c0372j.f4108y = c0372j2.f4108y;
        c0372j.f4109z = c0372j2.f4109z;
        c0372j.f4048A = c0372j2.f4048A;
        c0372j.f4049B = c0372j2.f4049B;
        c0372j.f4050C = c0372j2.f4050C;
        c0372j.f4051D = c0372j2.f4051D;
        c0372j.f4052E = c0372j2.f4052E;
        c0372j.f4053F = c0372j2.f4053F;
        c0372j.G = c0372j2.G;
        c0372j.f4054H = c0372j2.f4054H;
        c0372j.f4055I = c0372j2.f4055I;
        c0372j.f4056J = c0372j2.f4056J;
        c0372j.f4057K = c0372j2.f4057K;
        c0372j.f4058L = c0372j2.f4058L;
        c0372j.f4059M = c0372j2.f4059M;
        c0372j.f4060N = c0372j2.f4060N;
        c0372j.f4061O = c0372j2.f4061O;
        c0372j.f4062P = c0372j2.f4062P;
        c0372j.f4063Q = c0372j2.f4063Q;
        c0372j.f4064R = c0372j2.f4064R;
        c0372j.f4065S = c0372j2.f4065S;
        c0372j.f4066T = c0372j2.f4066T;
        c0372j.f4067U = c0372j2.f4067U;
        c0372j.f4068V = c0372j2.f4068V;
        c0372j.f4069W = c0372j2.f4069W;
        c0372j.f4070X = c0372j2.f4070X;
        c0372j.f4071Y = c0372j2.f4071Y;
        c0372j.f4072Z = c0372j2.f4072Z;
        c0372j.f4074a0 = c0372j2.f4074a0;
        c0372j.b0 = c0372j2.b0;
        c0372j.f4077c0 = c0372j2.f4077c0;
        c0372j.f4078d0 = c0372j2.f4078d0;
        c0372j.f4080e0 = c0372j2.f4080e0;
        c0372j.f4082f0 = c0372j2.f4082f0;
        c0372j.f4084g0 = c0372j2.f4084g0;
        c0372j.f4085h0 = c0372j2.f4085h0;
        c0372j.f4090k0 = c0372j2.f4090k0;
        int[] iArr = c0372j2.f4086i0;
        if (iArr == null || c0372j2.f4088j0 != null) {
            c0372j.f4086i0 = null;
        } else {
            c0372j.f4086i0 = Arrays.copyOf(iArr, iArr.length);
        }
        c0372j.f4088j0 = c0372j2.f4088j0;
        c0372j.f4092l0 = c0372j2.f4092l0;
        c0372j.f4094m0 = c0372j2.f4094m0;
        c0372j.f4096n0 = c0372j2.f4096n0;
        c0372j.f4098o0 = c0372j2.f4098o0;
        k kVar = c0371i.f4044c;
        kVar.getClass();
        k kVar2 = this.f4044c;
        kVar2.getClass();
        kVar.f4111a = kVar2.f4111a;
        kVar.f4113c = kVar2.f4113c;
        kVar.f4114e = kVar2.f4114e;
        kVar.d = kVar2.d;
        l lVar = c0371i.f4043b;
        l lVar2 = this.f4043b;
        lVar.f4117a = lVar2.f4117a;
        lVar.f4119c = lVar2.f4119c;
        lVar.d = lVar2.d;
        lVar.f4118b = lVar2.f4118b;
        m mVar = c0371i.f4045e;
        mVar.getClass();
        m mVar2 = this.f4045e;
        mVar2.getClass();
        mVar.f4121a = mVar2.f4121a;
        mVar.f4122b = mVar2.f4122b;
        mVar.f4123c = mVar2.f4123c;
        mVar.d = mVar2.d;
        mVar.f4124e = mVar2.f4124e;
        mVar.f4125f = mVar2.f4125f;
        mVar.f4126g = mVar2.f4126g;
        mVar.h = mVar2.h;
        mVar.i = mVar2.i;
        mVar.f4127j = mVar2.f4127j;
        mVar.f4128k = mVar2.f4128k;
        mVar.f4129l = mVar2.f4129l;
        mVar.f4130m = mVar2.f4130m;
        c0371i.f4042a = this.f4042a;
        return c0371i;
    }
}
