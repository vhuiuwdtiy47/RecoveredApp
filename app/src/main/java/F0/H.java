package f0;

import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class H {

    /* renamed from: b, reason: collision with root package name */
    public static final C0129e f2273b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0129e f2274c;
    public static final C0128d d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0128d f2275e;

    /* renamed from: f, reason: collision with root package name */
    public static final C0129e f2276f;

    /* renamed from: g, reason: collision with root package name */
    public static final C0128d f2277g;
    public static final C0128d h;
    public static final C0129e i;

    /* renamed from: j, reason: collision with root package name */
    public static final C0128d f2278j;

    /* renamed from: k, reason: collision with root package name */
    public static final C0128d f2279k;

    /* renamed from: l, reason: collision with root package name */
    public static final C0129e f2280l;

    /* renamed from: m, reason: collision with root package name */
    public static final C0128d f2281m;

    /* renamed from: n, reason: collision with root package name */
    public static final C0128d f2282n;

    /* renamed from: o, reason: collision with root package name */
    public static final C0129e f2283o;

    /* renamed from: p, reason: collision with root package name */
    public static final C0128d f2284p;

    /* renamed from: q, reason: collision with root package name */
    public static final C0128d f2285q;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2286a;

    static {
        boolean z2 = false;
        f2273b = new C0129e(2, z2);
        f2274c = new C0129e(4, z2);
        boolean z3 = true;
        d = new C0128d(4, z3);
        f2275e = new C0128d(5, z3);
        f2276f = new C0129e(3, z2);
        f2277g = new C0128d(6, z3);
        h = new C0128d(7, z3);
        i = new C0129e(1, z2);
        f2278j = new C0128d(2, z3);
        f2279k = new C0128d(3, z3);
        f2280l = new C0129e(0, z2);
        f2281m = new C0128d(0, z3);
        f2282n = new C0128d(1, z3);
        f2283o = new C0129e(5, z3);
        f2284p = new C0128d(8, z3);
        f2285q = new C0128d(9, z3);
    }

    public H(boolean z2) {
        this.f2286a = z2;
    }

    public abstract Object a(Bundle bundle, String str);

    public abstract String b();

    public Object c(Object obj, String str) {
        return d(str);
    }

    public abstract Object d(String str);

    public abstract void e(Bundle bundle, String str, Object obj);

    public String f(Object obj) {
        return String.valueOf(obj);
    }

    public final String toString() {
        return b();
    }
}
