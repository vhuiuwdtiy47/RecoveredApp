package g;

import L.S;
import L.k0;
import L.l0;
import L.m0;
import L.u0;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import com.android.music.R;
import java.util.WeakHashMap;
import l.InterfaceC0236h0;
import l.f1;

/* loaded from: classes.dex */
public final class r implements L.r, InterfaceC0236h0, k.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2554a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B f2555b;

    public /* synthetic */ r(B b2, int i) {
        this.f2554a = i;
        this.f2555b = b2;
    }

    @Override // k.x
    public void b(k.m mVar, boolean z2) {
        A a2;
        switch (this.f2554a) {
            case 2:
                this.f2555b.o(mVar);
                return;
            default:
                k.m k2 = mVar.k();
                int i = 0;
                boolean z3 = k2 != mVar;
                if (z3) {
                    mVar = k2;
                }
                B b2 = this.f2555b;
                A[] aArr = b2.f2418L;
                int length = aArr != null ? aArr.length : 0;
                while (true) {
                    if (i >= length) {
                        a2 = null;
                    } else {
                        a2 = aArr[i];
                        if (a2 == null || a2.h != mVar) {
                            i++;
                        }
                    }
                }
                if (a2 != null) {
                    if (!z3) {
                        b2.r(a2, z2);
                        return;
                    } else {
                        b2.n(a2.f2392a, a2, k2);
                        b2.r(a2, true);
                        return;
                    }
                }
                return;
        }
    }

    @Override // k.x
    public boolean g(k.m mVar) {
        Window.Callback callback;
        switch (this.f2554a) {
            case 2:
                Window.Callback callback2 = this.f2555b.f2441l.getCallback();
                if (callback2 == null) {
                    return true;
                }
                callback2.onMenuOpened(108, mVar);
                return true;
            default:
                if (mVar != mVar.k()) {
                    return true;
                }
                B b2 = this.f2555b;
                if (!b2.f2413F || (callback = b2.f2441l.getCallback()) == null || b2.f2423Q) {
                    return true;
                }
                callback.onMenuOpened(108, mVar);
                return true;
        }
    }

    @Override // L.r
    public u0 v(View view, u0 u0Var) {
        boolean z2;
        boolean z3;
        u0 u0Var2 = u0Var;
        int d = u0Var2.d();
        B b2 = this.f2555b;
        b2.getClass();
        int d2 = u0Var2.d();
        ActionBarContextView actionBarContextView = b2.f2451v;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z2 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) b2.f2451v.getLayoutParams();
            if (b2.f2451v.isShown()) {
                if (b2.f2434c0 == null) {
                    b2.f2434c0 = new Rect();
                    b2.f2435d0 = new Rect();
                }
                Rect rect = b2.f2434c0;
                Rect rect2 = b2.f2435d0;
                rect.set(u0Var2.b(), u0Var2.d(), u0Var2.c(), u0Var2.a());
                f1.a(b2.f2408A, rect, rect2);
                int i = rect.top;
                int i2 = rect.left;
                int i3 = rect.right;
                ViewGroup viewGroup = b2.f2408A;
                WeakHashMap weakHashMap = S.f311a;
                u0 a2 = L.H.a(viewGroup);
                int b3 = a2 == null ? 0 : a2.b();
                int c2 = a2 == null ? 0 : a2.c();
                if (marginLayoutParams.topMargin == i && marginLayoutParams.leftMargin == i2 && marginLayoutParams.rightMargin == i3) {
                    z3 = false;
                } else {
                    marginLayoutParams.topMargin = i;
                    marginLayoutParams.leftMargin = i2;
                    marginLayoutParams.rightMargin = i3;
                    z3 = true;
                }
                Context context = b2.f2440k;
                if (i <= 0 || b2.f2410C != null) {
                    View view2 = b2.f2410C;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i4 = marginLayoutParams2.height;
                        int i5 = marginLayoutParams.topMargin;
                        if (i4 != i5 || marginLayoutParams2.leftMargin != b3 || marginLayoutParams2.rightMargin != c2) {
                            marginLayoutParams2.height = i5;
                            marginLayoutParams2.leftMargin = b3;
                            marginLayoutParams2.rightMargin = c2;
                            b2.f2410C.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    b2.f2410C = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b3;
                    layoutParams.rightMargin = c2;
                    b2.f2408A.addView(b2.f2410C, -1, layoutParams);
                }
                View view4 = b2.f2410C;
                r9 = view4 != null;
                if (r9 && view4.getVisibility() != 0) {
                    View view5 = b2.f2410C;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? B.b.a(context, R.color.abc_decor_view_status_guard_light) : B.b.a(context, R.color.abc_decor_view_status_guard));
                }
                if (!b2.f2414H && r9) {
                    d2 = 0;
                }
                z2 = r9;
                r9 = z3;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z2 = false;
            } else {
                z2 = false;
                r9 = false;
            }
            if (r9) {
                b2.f2451v.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = b2.f2410C;
        if (view6 != null) {
            view6.setVisibility(z2 ? 0 : 8);
        }
        if (d != d2) {
            int b4 = u0Var2.b();
            int c3 = u0Var2.c();
            int a3 = u0Var2.a();
            m0 l0Var = Build.VERSION.SDK_INT >= 30 ? new l0(u0Var2) : new k0(u0Var2);
            l0Var.f(D.c.b(b4, d2, c3, a3));
            u0Var2 = l0Var.b();
        }
        WeakHashMap weakHashMap2 = S.f311a;
        WindowInsets e2 = u0Var2.e();
        if (e2 != null) {
            WindowInsets b5 = L.E.b(view, e2);
            if (!b5.equals(e2)) {
                return u0.f(view, b5);
            }
        }
        return u0Var2;
    }
}
