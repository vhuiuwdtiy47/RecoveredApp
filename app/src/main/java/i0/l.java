package i0;

import L.C0016l;
import L.G;
import L.M;
import L.S;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import f.AbstractC0117a;
import f0.v;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;
import l.AbstractC0242k0;
import l.C0207R0;
import l.C0263v;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public int f2660a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2661b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2662c;
    public Object d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2663e;

    /* renamed from: f, reason: collision with root package name */
    public Object f2664f;

    public l(v vVar) {
        q1.d.e(vVar, "destination");
        this.f2661b = vVar;
        this.f2663e = new ArrayList();
        this.f2664f = new LinkedHashMap();
    }

    public void a() {
        View view = (View) this.f2661b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((C0207R0) this.d) != null) {
                if (((C0207R0) this.f2664f) == null) {
                    this.f2664f = new Object();
                }
                C0207R0 c0207r0 = (C0207R0) this.f2664f;
                c0207r0.f3012a = null;
                c0207r0.d = false;
                c0207r0.f3013b = null;
                c0207r0.f3014c = false;
                WeakHashMap weakHashMap = S.f311a;
                ColorStateList g2 = G.g(view);
                if (g2 != null) {
                    c0207r0.d = true;
                    c0207r0.f3012a = g2;
                }
                PorterDuff.Mode h = G.h(view);
                if (h != null) {
                    c0207r0.f3014c = true;
                    c0207r0.f3013b = h;
                }
                if (c0207r0.d || c0207r0.f3014c) {
                    C0263v.e(background, c0207r0, view.getDrawableState());
                    return;
                }
            }
            C0207R0 c0207r02 = (C0207R0) this.f2663e;
            if (c0207r02 != null) {
                C0263v.e(background, c0207r02, view.getDrawableState());
                return;
            }
            C0207R0 c0207r03 = (C0207R0) this.d;
            if (c0207r03 != null) {
                C0263v.e(background, c0207r03, view.getDrawableState());
            }
        }
    }

    public ColorStateList b() {
        C0207R0 c0207r0 = (C0207R0) this.f2663e;
        if (c0207r0 != null) {
            return c0207r0.f3012a;
        }
        return null;
    }

    public PorterDuff.Mode c() {
        C0207R0 c0207r0 = (C0207R0) this.f2663e;
        if (c0207r0 != null) {
            return c0207r0.f3013b;
        }
        return null;
    }

    public void d(AttributeSet attributeSet, int i) {
        ColorStateList f2;
        View view = (View) this.f2661b;
        Context context = view.getContext();
        int[] iArr = AbstractC0117a.f2256y;
        C0016l s2 = C0016l.s(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) s2.f362c;
        View view2 = (View) this.f2661b;
        Context context2 = view2.getContext();
        WeakHashMap weakHashMap = S.f311a;
        M.d(view2, context2, iArr, attributeSet, (TypedArray) s2.f362c, i, 0);
        try {
            if (typedArray.hasValue(0)) {
                this.f2660a = typedArray.getResourceId(0, -1);
                C0263v c0263v = (C0263v) this.f2662c;
                Context context3 = view.getContext();
                int i2 = this.f2660a;
                synchronized (c0263v) {
                    f2 = c0263v.f3161a.f(context3, i2);
                }
                if (f2 != null) {
                    g(f2);
                }
            }
            if (typedArray.hasValue(1)) {
                G.q(view, s2.g(1));
            }
            if (typedArray.hasValue(2)) {
                G.r(view, AbstractC0242k0.b(typedArray.getInt(2, -1), null));
            }
            s2.u();
        } catch (Throwable th) {
            s2.u();
            throw th;
        }
    }

    public void e() {
        this.f2660a = -1;
        g(null);
        a();
    }

    public void f(int i) {
        ColorStateList colorStateList;
        this.f2660a = i;
        C0263v c0263v = (C0263v) this.f2662c;
        if (c0263v != null) {
            Context context = ((View) this.f2661b).getContext();
            synchronized (c0263v) {
                colorStateList = c0263v.f3161a.f(context, i);
            }
        } else {
            colorStateList = null;
        }
        g(colorStateList);
        a();
    }

    public void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((C0207R0) this.d) == null) {
                this.d = new Object();
            }
            C0207R0 c0207r0 = (C0207R0) this.d;
            c0207r0.f3012a = colorStateList;
            c0207r0.d = true;
        } else {
            this.d = null;
        }
        a();
    }

    public void h(ColorStateList colorStateList) {
        if (((C0207R0) this.f2663e) == null) {
            this.f2663e = new Object();
        }
        C0207R0 c0207r0 = (C0207R0) this.f2663e;
        c0207r0.f3012a = colorStateList;
        c0207r0.d = true;
        a();
    }

    public void i(PorterDuff.Mode mode) {
        if (((C0207R0) this.f2663e) == null) {
            this.f2663e = new Object();
        }
        C0207R0 c0207r0 = (C0207R0) this.f2663e;
        c0207r0.f3013b = mode;
        c0207r0.f3014c = true;
        a();
    }

    public l(View view) {
        this.f2660a = -1;
        this.f2661b = view;
        this.f2662c = C0263v.a();
    }
}
