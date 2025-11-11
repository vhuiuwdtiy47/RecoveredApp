package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.android.music.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import p.AbstractC0308a;
import t0.C0343p;

/* renamed from: l.K0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0194K0 {

    /* renamed from: g, reason: collision with root package name */
    public static C0194K0 f2981g;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f2982a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap f2983b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f2984c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public C0261u f2985e;

    /* renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f2980f = PorterDuff.Mode.SRC_IN;
    public static final C0192J0 h = new n0.e0(6);

    public static synchronized C0194K0 b() {
        C0194K0 c0194k0;
        synchronized (C0194K0.class) {
            try {
                if (f2981g == null) {
                    f2981g = new C0194K0();
                }
                c0194k0 = f2981g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0194k0;
    }

    public static synchronized PorterDuffColorFilter e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (C0194K0.class) {
            C0192J0 c0192j0 = h;
            c0192j0.getClass();
            int i2 = (31 + i) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) c0192j0.f(Integer.valueOf(mode.hashCode() + i2));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
            }
        }
        return porterDuffColorFilter;
    }

    public final Drawable a(Context context, int i) {
        Drawable drawable;
        if (this.f2984c == null) {
            this.f2984c = new TypedValue();
        }
        TypedValue typedValue = this.f2984c;
        context.getResources().getValue(i, typedValue, true);
        long j2 = (typedValue.assetCookie << 32) | typedValue.data;
        synchronized (this) {
            o.h hVar = (o.h) this.f2983b.get(context);
            drawable = null;
            if (hVar != null) {
                WeakReference weakReference = (WeakReference) hVar.b(j2);
                if (weakReference != null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                    if (constantState != null) {
                        drawable = constantState.newDrawable(context.getResources());
                    } else {
                        int b2 = AbstractC0308a.b(hVar.f3492b, hVar.d, j2);
                        if (b2 >= 0) {
                            Object[] objArr = hVar.f3493c;
                            Object obj = objArr[b2];
                            Object obj2 = o.i.f3494a;
                            if (obj != obj2) {
                                objArr[b2] = obj2;
                                hVar.f3491a = true;
                            }
                        }
                    }
                }
            }
        }
        if (drawable != null) {
            return drawable;
        }
        LayerDrawable layerDrawable = null;
        if (this.f2985e != null) {
            if (i == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{c(context, R.drawable.abc_cab_background_internal_bg), c(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i == R.drawable.abc_ratingbar_material) {
                layerDrawable = C0261u.c(this, context, R.dimen.abc_star_big);
            } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawable = C0261u.c(this, context, R.dimen.abc_star_medium);
            } else if (i == R.drawable.abc_ratingbar_small_material) {
                layerDrawable = C0261u.c(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawable == null) {
            return layerDrawable;
        }
        layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawable.getConstantState();
                if (constantState2 != null) {
                    o.h hVar2 = (o.h) this.f2983b.get(context);
                    if (hVar2 == null) {
                        hVar2 = new o.h();
                        this.f2983b.put(context, hVar2);
                    }
                    hVar2.d(j2, new WeakReference(constantState2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return layerDrawable;
    }

    public final synchronized Drawable c(Context context, int i) {
        return d(context, i, false);
    }

    public final synchronized Drawable d(Context context, int i, boolean z2) {
        Drawable a2;
        try {
            if (!this.d) {
                this.d = true;
                Drawable c2 = c(context, R.drawable.abc_vector_test);
                if (c2 == null || (!(c2 instanceof C0343p) && !"android.graphics.drawable.VectorDrawable".equals(c2.getClass().getName()))) {
                    this.d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            a2 = a(context, i);
            if (a2 == null) {
                a2 = B.a.b(context, i);
            }
            if (a2 != null) {
                a2 = g(context, i, z2, a2);
            }
            if (a2 != null) {
                AbstractC0242k0.a(a2);
            }
        } catch (Throwable th) {
            throw th;
        }
        return a2;
    }

    public final synchronized ColorStateList f(Context context, int i) {
        ColorStateList colorStateList;
        o.k kVar;
        WeakHashMap weakHashMap = this.f2982a;
        ColorStateList colorStateList2 = null;
        colorStateList = (weakHashMap == null || (kVar = (o.k) weakHashMap.get(context)) == null) ? null : (ColorStateList) kVar.b(i);
        if (colorStateList == null) {
            C0261u c0261u = this.f2985e;
            if (c0261u != null) {
                colorStateList2 = c0261u.d(context, i);
            }
            if (colorStateList2 != null) {
                if (this.f2982a == null) {
                    this.f2982a = new WeakHashMap();
                }
                o.k kVar2 = (o.k) this.f2982a.get(context);
                if (kVar2 == null) {
                    kVar2 = new o.k(0);
                    this.f2982a.put(context, kVar2);
                }
                kVar2.a(i, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable g(android.content.Context r8, int r9, boolean r10, android.graphics.drawable.Drawable r11) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0194K0.g(android.content.Context, int, boolean, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }
}
