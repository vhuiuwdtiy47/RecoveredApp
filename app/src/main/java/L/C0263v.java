package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

/* renamed from: l.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0263v {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f3159b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static C0263v f3160c;

    /* renamed from: a, reason: collision with root package name */
    public C0194K0 f3161a;

    public static synchronized C0263v a() {
        C0263v c0263v;
        synchronized (C0263v.class) {
            try {
                if (f3160c == null) {
                    d();
                }
                c0263v = f3160c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0263v;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter e2;
        synchronized (C0263v.class) {
            e2 = C0194K0.e(i, mode);
        }
        return e2;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [l.v, java.lang.Object] */
    public static synchronized void d() {
        synchronized (C0263v.class) {
            if (f3160c == null) {
                ?? obj = new Object();
                f3160c = obj;
                obj.f3161a = C0194K0.b();
                C0194K0 c0194k0 = f3160c.f3161a;
                C0261u c0261u = new C0261u();
                synchronized (c0194k0) {
                    c0194k0.f2985e = c0261u;
                }
            }
        }
    }

    public static void e(Drawable drawable, C0207R0 c0207r0, int[] iArr) {
        PorterDuff.Mode mode = C0194K0.f2980f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z2 = c0207r0.d;
        if (!z2 && !c0207r0.f3014c) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z2 ? c0207r0.f3012a : null;
        PorterDuff.Mode mode2 = c0207r0.f3014c ? c0207r0.f3013b : C0194K0.f2980f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = C0194K0.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.f3161a.c(context, i);
    }
}
