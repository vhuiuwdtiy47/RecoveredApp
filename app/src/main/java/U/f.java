package U;

import android.graphics.Rect;
import android.view.View;
import n0.C0299w;
import n0.H;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public int f755a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f756b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f757c;

    public f(H h) {
        this.f755a = Integer.MIN_VALUE;
        this.f757c = new Rect();
        this.f756b = h;
    }

    public static f a(H h, int i) {
        if (i == 0) {
            return new C0299w(h, 0);
        }
        if (i == 1) {
            return new C0299w(h, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m(View view);

    public abstract int n(View view);

    public abstract void o(int i);

    public f(h hVar) {
        this.f755a = 0;
        this.f757c = new c();
        this.f756b = hVar;
    }
}
