package j;

import L.AbstractC0017m;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import k.o;
import k.p;
import k.t;

/* renamed from: j.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0162g {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f2699A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f2700B;

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ h f2703E;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f2704a;
    public boolean h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f2710j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f2711k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f2712l;

    /* renamed from: m, reason: collision with root package name */
    public int f2713m;

    /* renamed from: n, reason: collision with root package name */
    public char f2714n;

    /* renamed from: o, reason: collision with root package name */
    public int f2715o;

    /* renamed from: p, reason: collision with root package name */
    public char f2716p;

    /* renamed from: q, reason: collision with root package name */
    public int f2717q;

    /* renamed from: r, reason: collision with root package name */
    public int f2718r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2719s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2720t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2721u;

    /* renamed from: v, reason: collision with root package name */
    public int f2722v;

    /* renamed from: w, reason: collision with root package name */
    public int f2723w;

    /* renamed from: x, reason: collision with root package name */
    public String f2724x;

    /* renamed from: y, reason: collision with root package name */
    public String f2725y;

    /* renamed from: z, reason: collision with root package name */
    public p f2726z;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f2701C = null;

    /* renamed from: D, reason: collision with root package name */
    public PorterDuff.Mode f2702D = null;

    /* renamed from: b, reason: collision with root package name */
    public int f2705b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f2706c = 0;
    public int d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f2707e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2708f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2709g = true;

    public C0162g(h hVar, Menu menu) {
        this.f2703E = hVar;
        this.f2704a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f2703E.f2731c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e2) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [android.view.MenuItem$OnMenuItemClickListener, j.f, java.lang.Object] */
    public final void b(MenuItem menuItem) {
        boolean z2 = false;
        menuItem.setChecked(this.f2719s).setVisible(this.f2720t).setEnabled(this.f2721u).setCheckable(this.f2718r >= 1).setTitleCondensed(this.f2712l).setIcon(this.f2713m);
        int i = this.f2722v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        String str = this.f2725y;
        h hVar = this.f2703E;
        if (str != null) {
            if (hVar.f2731c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (hVar.d == null) {
                hVar.d = h.a(hVar.f2731c);
            }
            Object obj = hVar.d;
            String str2 = this.f2725y;
            ?? obj2 = new Object();
            obj2.f2697a = obj;
            Class<?> cls = obj.getClass();
            try {
                obj2.f2698b = cls.getMethod(str2, MenuItemOnMenuItemClickListenerC0161f.f2696c);
                menuItem.setOnMenuItemClickListener(obj2);
            } catch (Exception e2) {
                StringBuilder e3 = D.f.e("Couldn't resolve menu item onClick handler ", str2, " in class ");
                e3.append(cls.getName());
                InflateException inflateException = new InflateException(e3.toString());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }
        if (this.f2718r >= 2) {
            if (menuItem instanceof o) {
                ((o) menuItem).f(true);
            } else if (menuItem instanceof t) {
                t tVar = (t) menuItem;
                try {
                    Method method = tVar.d;
                    F.a aVar = tVar.f2896c;
                    if (method == null) {
                        tVar.d = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    tVar.d.invoke(aVar, Boolean.TRUE);
                } catch (Exception e4) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e4);
                }
            }
        }
        String str3 = this.f2724x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, h.f2727e, hVar.f2729a));
            z2 = true;
        }
        int i2 = this.f2723w;
        if (i2 > 0) {
            if (z2) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i2);
            }
        }
        p pVar = this.f2726z;
        if (pVar != null) {
            if (menuItem instanceof F.a) {
                ((F.a) menuItem).b(pVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f2699A;
        boolean z3 = menuItem instanceof F.a;
        if (z3) {
            ((F.a) menuItem).setContentDescription(charSequence);
        } else {
            AbstractC0017m.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f2700B;
        if (z3) {
            ((F.a) menuItem).setTooltipText(charSequence2);
        } else {
            AbstractC0017m.m(menuItem, charSequence2);
        }
        char c2 = this.f2714n;
        int i3 = this.f2715o;
        if (z3) {
            ((F.a) menuItem).setAlphabeticShortcut(c2, i3);
        } else {
            AbstractC0017m.g(menuItem, c2, i3);
        }
        char c3 = this.f2716p;
        int i4 = this.f2717q;
        if (z3) {
            ((F.a) menuItem).setNumericShortcut(c3, i4);
        } else {
            AbstractC0017m.k(menuItem, c3, i4);
        }
        PorterDuff.Mode mode = this.f2702D;
        if (mode != null) {
            if (z3) {
                ((F.a) menuItem).setIconTintMode(mode);
            } else {
                AbstractC0017m.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f2701C;
        if (colorStateList != null) {
            if (z3) {
                ((F.a) menuItem).setIconTintList(colorStateList);
            } else {
                AbstractC0017m.i(menuItem, colorStateList);
            }
        }
    }
}
