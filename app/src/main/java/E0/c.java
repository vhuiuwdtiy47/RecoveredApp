package E0;

import L.S;
import T0.g;
import T0.k;
import T0.u;
import Z0.i;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.android.music.R;
import com.google.android.material.button.MaterialButton;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final MaterialButton f123a;

    /* renamed from: b, reason: collision with root package name */
    public k f124b;

    /* renamed from: c, reason: collision with root package name */
    public int f125c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f126e;

    /* renamed from: f, reason: collision with root package name */
    public int f127f;

    /* renamed from: g, reason: collision with root package name */
    public int f128g;
    public int h;
    public PorterDuff.Mode i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f129j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f130k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f131l;

    /* renamed from: m, reason: collision with root package name */
    public g f132m;

    /* renamed from: q, reason: collision with root package name */
    public boolean f136q;

    /* renamed from: s, reason: collision with root package name */
    public RippleDrawable f138s;

    /* renamed from: t, reason: collision with root package name */
    public int f139t;

    /* renamed from: n, reason: collision with root package name */
    public boolean f133n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f134o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f135p = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f137r = true;

    public c(MaterialButton materialButton, k kVar) {
        this.f123a = materialButton;
        this.f124b = kVar;
    }

    public final u a() {
        RippleDrawable rippleDrawable = this.f138s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f138s.getNumberOfLayers() > 2 ? (u) this.f138s.getDrawable(2) : (u) this.f138s.getDrawable(1);
    }

    public final g b(boolean z2) {
        RippleDrawable rippleDrawable = this.f138s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (g) ((LayerDrawable) ((InsetDrawable) this.f138s.getDrawable(0)).getDrawable()).getDrawable(!z2 ? 1 : 0);
    }

    public final void c(k kVar) {
        this.f124b = kVar;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(kVar);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(kVar);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(kVar);
        }
    }

    public final void d(int i, int i2) {
        WeakHashMap weakHashMap = S.f311a;
        MaterialButton materialButton = this.f123a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = this.f126e;
        int i4 = this.f127f;
        this.f127f = i2;
        this.f126e = i;
        if (!this.f134o) {
            e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    public final void e() {
        g gVar = new g(this.f124b);
        MaterialButton materialButton = this.f123a;
        gVar.h(materialButton.getContext());
        E.a.h(gVar, this.f129j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            E.a.i(gVar, mode);
        }
        float f2 = this.h;
        ColorStateList colorStateList = this.f130k;
        gVar.f683a.f675j = f2;
        gVar.invalidateSelf();
        T0.f fVar = gVar.f683a;
        if (fVar.d != colorStateList) {
            fVar.d = colorStateList;
            gVar.onStateChange(gVar.getState());
        }
        g gVar2 = new g(this.f124b);
        gVar2.setTint(0);
        float f3 = this.h;
        int u2 = this.f133n ? i.u(materialButton, R.attr.colorSurface) : 0;
        gVar2.f683a.f675j = f3;
        gVar2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(u2);
        T0.f fVar2 = gVar2.f683a;
        if (fVar2.d != valueOf) {
            fVar2.d = valueOf;
            gVar2.onStateChange(gVar2.getState());
        }
        g gVar3 = new g(this.f124b);
        this.f132m = gVar3;
        E.a.g(gVar3, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(R0.a.b(this.f131l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{gVar2, gVar}), this.f125c, this.f126e, this.d, this.f127f), this.f132m);
        this.f138s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        g b2 = b(false);
        if (b2 != null) {
            b2.i(this.f139t);
            b2.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        g b2 = b(false);
        g b3 = b(true);
        if (b2 != null) {
            float f2 = this.h;
            ColorStateList colorStateList = this.f130k;
            b2.f683a.f675j = f2;
            b2.invalidateSelf();
            T0.f fVar = b2.f683a;
            if (fVar.d != colorStateList) {
                fVar.d = colorStateList;
                b2.onStateChange(b2.getState());
            }
            if (b3 != null) {
                float f3 = this.h;
                int u2 = this.f133n ? i.u(this.f123a, R.attr.colorSurface) : 0;
                b3.f683a.f675j = f3;
                b3.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(u2);
                T0.f fVar2 = b3.f683a;
                if (fVar2.d != valueOf) {
                    fVar2.d = valueOf;
                    b3.onStateChange(b3.getState());
                }
            }
        }
    }
}
