package L;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class n0 extends s0 {
    public static boolean h;
    public static Method i;

    /* renamed from: j, reason: collision with root package name */
    public static Class f369j;

    /* renamed from: k, reason: collision with root package name */
    public static Field f370k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f371l;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f372c;
    public D.c[] d;

    /* renamed from: e, reason: collision with root package name */
    public D.c f373e;

    /* renamed from: f, reason: collision with root package name */
    public u0 f374f;

    /* renamed from: g, reason: collision with root package name */
    public D.c f375g;

    public n0(u0 u0Var, WindowInsets windowInsets) {
        super(u0Var);
        this.f373e = null;
        this.f372c = windowInsets;
    }

    @SuppressLint({"WrongConstant"})
    private D.c q(int i2, boolean z2) {
        D.c cVar = D.c.f91e;
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i2 & i3) != 0) {
                cVar = D.c.a(cVar, r(i3, z2));
            }
        }
        return cVar;
    }

    private D.c s() {
        u0 u0Var = this.f374f;
        return u0Var != null ? u0Var.f389a.h() : D.c.f91e;
    }

    private D.c t(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!h) {
            u();
        }
        Method method = i;
        if (method != null && f369j != null && f370k != null) {
            try {
                Object invoke = method.invoke(view, new Object[0]);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f370k.get(f371l.get(invoke));
                if (rect != null) {
                    return D.c.b(rect.left, rect.top, rect.right, rect.bottom);
                }
            } catch (ReflectiveOperationException e2) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    private static void u() {
        try {
            i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f369j = cls;
            f370k = cls.getDeclaredField("mVisibleInsets");
            f371l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f370k.setAccessible(true);
            f371l.setAccessible(true);
        } catch (ReflectiveOperationException e2) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
        }
        h = true;
    }

    @Override // L.s0
    public void d(View view) {
        D.c t2 = t(view);
        if (t2 == null) {
            t2 = D.c.f91e;
        }
        v(t2);
    }

    @Override // L.s0
    public D.c f(int i2) {
        return q(i2, false);
    }

    @Override // L.s0
    public final D.c j() {
        if (this.f373e == null) {
            WindowInsets windowInsets = this.f372c;
            this.f373e = D.c.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f373e;
    }

    @Override // L.s0
    public boolean n() {
        return this.f372c.isRound();
    }

    @Override // L.s0
    public void o(D.c[] cVarArr) {
        this.d = cVarArr;
    }

    @Override // L.s0
    public void p(u0 u0Var) {
        this.f374f = u0Var;
    }

    public D.c r(int i2, boolean z2) {
        D.c h2;
        int i3;
        if (i2 == 1) {
            return z2 ? D.c.b(0, Math.max(s().f93b, j().f93b), 0, 0) : D.c.b(0, j().f93b, 0, 0);
        }
        if (i2 == 2) {
            if (z2) {
                D.c s2 = s();
                D.c h3 = h();
                return D.c.b(Math.max(s2.f92a, h3.f92a), 0, Math.max(s2.f94c, h3.f94c), Math.max(s2.d, h3.d));
            }
            D.c j2 = j();
            u0 u0Var = this.f374f;
            h2 = u0Var != null ? u0Var.f389a.h() : null;
            int i4 = j2.d;
            if (h2 != null) {
                i4 = Math.min(i4, h2.d);
            }
            return D.c.b(j2.f92a, 0, j2.f94c, i4);
        }
        D.c cVar = D.c.f91e;
        if (i2 == 8) {
            D.c[] cVarArr = this.d;
            h2 = cVarArr != null ? cVarArr[Z0.i.G(8)] : null;
            if (h2 != null) {
                return h2;
            }
            D.c j3 = j();
            D.c s3 = s();
            int i5 = j3.d;
            if (i5 > s3.d) {
                return D.c.b(0, 0, 0, i5);
            }
            D.c cVar2 = this.f375g;
            return (cVar2 == null || cVar2.equals(cVar) || (i3 = this.f375g.d) <= s3.d) ? cVar : D.c.b(0, 0, 0, i3);
        }
        if (i2 == 16) {
            return i();
        }
        if (i2 == 32) {
            return g();
        }
        if (i2 == 64) {
            return k();
        }
        if (i2 != 128) {
            return cVar;
        }
        u0 u0Var2 = this.f374f;
        C0014j e2 = u0Var2 != null ? u0Var2.f389a.e() : e();
        if (e2 == null) {
            return cVar;
        }
        DisplayCutout displayCutout = e2.f354a;
        return D.c.b(AbstractC0013i.d(displayCutout), AbstractC0013i.f(displayCutout), AbstractC0013i.e(displayCutout), AbstractC0013i.c(displayCutout));
    }

    public void v(D.c cVar) {
        this.f375g = cVar;
    }
}
