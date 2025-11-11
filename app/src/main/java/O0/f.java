package O0;

import L.S;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.HashSet;
import java.util.WeakHashMap;
import k.InterfaceC0164A;
import k.o;
import s0.C0322a;
import x0.AbstractC0375a;
import z0.C0385a;

/* loaded from: classes.dex */
public abstract class f extends ViewGroup implements InterfaceC0164A {

    /* renamed from: F, reason: collision with root package name */
    public static final int[] f540F = {R.attr.state_checked};
    public static final int[] G = {-16842910};

    /* renamed from: A, reason: collision with root package name */
    public T0.k f541A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f542B;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f543C;

    /* renamed from: D, reason: collision with root package name */
    public h f544D;

    /* renamed from: E, reason: collision with root package name */
    public k.m f545E;

    /* renamed from: a, reason: collision with root package name */
    public final C0322a f546a;

    /* renamed from: b, reason: collision with root package name */
    public final e f547b;

    /* renamed from: c, reason: collision with root package name */
    public final K.c f548c;
    public final SparseArray d;

    /* renamed from: e, reason: collision with root package name */
    public int f549e;

    /* renamed from: f, reason: collision with root package name */
    public c[] f550f;

    /* renamed from: g, reason: collision with root package name */
    public int f551g;
    public int h;
    public ColorStateList i;

    /* renamed from: j, reason: collision with root package name */
    public int f552j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f553k;

    /* renamed from: l, reason: collision with root package name */
    public final ColorStateList f554l;

    /* renamed from: m, reason: collision with root package name */
    public int f555m;

    /* renamed from: n, reason: collision with root package name */
    public int f556n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f557o;

    /* renamed from: p, reason: collision with root package name */
    public Drawable f558p;

    /* renamed from: q, reason: collision with root package name */
    public ColorStateList f559q;

    /* renamed from: r, reason: collision with root package name */
    public int f560r;

    /* renamed from: s, reason: collision with root package name */
    public final SparseArray f561s;

    /* renamed from: t, reason: collision with root package name */
    public int f562t;

    /* renamed from: u, reason: collision with root package name */
    public int f563u;

    /* renamed from: v, reason: collision with root package name */
    public int f564v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f565w;

    /* renamed from: x, reason: collision with root package name */
    public int f566x;

    /* renamed from: y, reason: collision with root package name */
    public int f567y;

    /* renamed from: z, reason: collision with root package name */
    public int f568z;

    public f(Context context) {
        super(context);
        this.f548c = new K.c(5);
        this.d = new SparseArray(5);
        int i = 0;
        this.f551g = 0;
        this.h = 0;
        this.f561s = new SparseArray(5);
        this.f562t = -1;
        this.f563u = -1;
        this.f564v = -1;
        this.f542B = false;
        this.f554l = b();
        if (isInEditMode()) {
            this.f546a = null;
        } else {
            C0322a c0322a = new C0322a();
            this.f546a = c0322a;
            c0322a.L(0);
            c0322a.A(Z0.i.b0(getContext(), com.android.music.R.attr.motionDurationMedium4, getResources().getInteger(com.android.music.R.integer.material_motion_duration_long_1)));
            c0322a.C(Z0.i.c0(getContext(), com.android.music.R.attr.motionEasingStandard, AbstractC0375a.f4190b));
            c0322a.I(new s0.l());
        }
        this.f547b = new e(i, (C0.b) this);
        WeakHashMap weakHashMap = S.f311a;
        setImportantForAccessibility(1);
    }

    private c getNewItem() {
        c cVar = (c) this.f548c.a();
        return cVar == null ? new c(getContext()) : cVar;
    }

    private void setBadgeIfNeeded(c cVar) {
        C0385a c0385a;
        int id = cVar.getId();
        if (id == -1 || (c0385a = (C0385a) this.f561s.get(id)) == null) {
            return;
        }
        cVar.setBadge(c0385a);
    }

    public final void a() {
        removeAllViews();
        c[] cVarArr = this.f550f;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                if (cVar != null) {
                    this.f548c.c(cVar);
                    cVar.i(cVar.f523n);
                    cVar.f529t = null;
                    cVar.f535z = 0.0f;
                    cVar.f513a = false;
                }
            }
        }
        if (this.f545E.f2842f.size() == 0) {
            this.f551g = 0;
            this.h = 0;
            this.f550f = null;
            return;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.f545E.f2842f.size(); i++) {
            hashSet.add(Integer.valueOf(this.f545E.getItem(i).getItemId()));
        }
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.f561s;
            if (i2 >= sparseArray.size()) {
                break;
            }
            int keyAt = sparseArray.keyAt(i2);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                sparseArray.delete(keyAt);
            }
            i2++;
        }
        this.f550f = new c[this.f545E.f2842f.size()];
        int i3 = this.f549e;
        boolean z2 = i3 != -1 ? i3 == 0 : this.f545E.l().size() > 3;
        for (int i4 = 0; i4 < this.f545E.f2842f.size(); i4++) {
            this.f544D.f572b = true;
            this.f545E.getItem(i4).setCheckable(true);
            this.f544D.f572b = false;
            c newItem = getNewItem();
            this.f550f[i4] = newItem;
            newItem.setIconTintList(this.i);
            newItem.setIconSize(this.f552j);
            newItem.setTextColor(this.f554l);
            newItem.setTextAppearanceInactive(this.f555m);
            newItem.setTextAppearanceActive(this.f556n);
            newItem.setTextAppearanceActiveBoldEnabled(this.f557o);
            newItem.setTextColor(this.f553k);
            int i5 = this.f562t;
            if (i5 != -1) {
                newItem.setItemPaddingTop(i5);
            }
            int i6 = this.f563u;
            if (i6 != -1) {
                newItem.setItemPaddingBottom(i6);
            }
            int i7 = this.f564v;
            if (i7 != -1) {
                newItem.setActiveIndicatorLabelPadding(i7);
            }
            newItem.setActiveIndicatorWidth(this.f566x);
            newItem.setActiveIndicatorHeight(this.f567y);
            newItem.setActiveIndicatorMarginHorizontal(this.f568z);
            newItem.setActiveIndicatorDrawable(d());
            newItem.setActiveIndicatorResizeable(this.f542B);
            newItem.setActiveIndicatorEnabled(this.f565w);
            Drawable drawable = this.f558p;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.f560r);
            }
            newItem.setItemRippleColor(this.f559q);
            newItem.setShifting(z2);
            newItem.setLabelVisibilityMode(this.f549e);
            o oVar = (o) this.f545E.getItem(i4);
            newItem.a(oVar);
            newItem.setItemPosition(i4);
            SparseArray sparseArray2 = this.d;
            int i8 = oVar.f2865a;
            newItem.setOnTouchListener((View.OnTouchListener) sparseArray2.get(i8));
            newItem.setOnClickListener(this.f547b);
            int i9 = this.f551g;
            if (i9 != 0 && i8 == i9) {
                this.h = i4;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int min = Math.min(this.f545E.f2842f.size() - 1, this.h);
        this.h = min;
        this.f545E.getItem(min).setChecked(true);
    }

    public final ColorStateList b() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(R.attr.textColorSecondary, typedValue, true)) {
            return null;
        }
        ColorStateList v2 = Z0.i.v(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(com.android.music.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i = typedValue.data;
        int defaultColor = v2.getDefaultColor();
        int[] iArr = G;
        return new ColorStateList(new int[][]{iArr, f540F, ViewGroup.EMPTY_STATE_SET}, new int[]{v2.getColorForState(iArr, defaultColor), i, defaultColor});
    }

    @Override // k.InterfaceC0164A
    public final void c(k.m mVar) {
        this.f545E = mVar;
    }

    public final T0.g d() {
        if (this.f541A == null || this.f543C == null) {
            return null;
        }
        T0.g gVar = new T0.g(this.f541A);
        gVar.j(this.f543C);
        return gVar;
    }

    public int getActiveIndicatorLabelPadding() {
        return this.f564v;
    }

    public SparseArray<C0385a> getBadgeDrawables() {
        return this.f561s;
    }

    public ColorStateList getIconTintList() {
        return this.i;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f543C;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.f565w;
    }

    public int getItemActiveIndicatorHeight() {
        return this.f567y;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f568z;
    }

    public T0.k getItemActiveIndicatorShapeAppearance() {
        return this.f541A;
    }

    public int getItemActiveIndicatorWidth() {
        return this.f566x;
    }

    public Drawable getItemBackground() {
        c[] cVarArr = this.f550f;
        return (cVarArr == null || cVarArr.length <= 0) ? this.f558p : cVarArr[0].getBackground();
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.f560r;
    }

    public int getItemIconSize() {
        return this.f552j;
    }

    public int getItemPaddingBottom() {
        return this.f563u;
    }

    public int getItemPaddingTop() {
        return this.f562t;
    }

    public ColorStateList getItemRippleColor() {
        return this.f559q;
    }

    public int getItemTextAppearanceActive() {
        return this.f556n;
    }

    public int getItemTextAppearanceInactive() {
        return this.f555m;
    }

    public ColorStateList getItemTextColor() {
        return this.f553k;
    }

    public int getLabelVisibilityMode() {
        return this.f549e;
    }

    public k.m getMenu() {
        return this.f545E;
    }

    public int getSelectedItemId() {
        return this.f551g;
    }

    public int getSelectedItemPosition() {
        return this.h;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.f545E.l().size(), false, 1));
    }

    public void setActiveIndicatorLabelPadding(int i) {
        this.f564v = i;
        c[] cVarArr = this.f550f;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setActiveIndicatorLabelPadding(i);
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.i = colorStateList;
        c[] cVarArr = this.f550f;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f543C = colorStateList;
        c[] cVarArr = this.f550f;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setActiveIndicatorDrawable(d());
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z2) {
        this.f565w = z2;
        c[] cVarArr = this.f550f;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setActiveIndicatorEnabled(z2);
            }
        }
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.f567y = i;
        c[] cVarArr = this.f550f;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setActiveIndicatorHeight(i);
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.f568z = i;
        c[] cVarArr = this.f550f;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setActiveIndicatorMarginHorizontal(i);
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean z2) {
        this.f542B = z2;
        c[] cVarArr = this.f550f;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setActiveIndicatorResizeable(z2);
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(T0.k kVar) {
        this.f541A = kVar;
        c[] cVarArr = this.f550f;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setActiveIndicatorDrawable(d());
            }
        }
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.f566x = i;
        c[] cVarArr = this.f550f;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setActiveIndicatorWidth(i);
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.f558p = drawable;
        c[] cVarArr = this.f550f;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.f560r = i;
        c[] cVarArr = this.f550f;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setItemBackground(i);
            }
        }
    }

    public void setItemIconSize(int i) {
        this.f552j = i;
        c[] cVarArr = this.f550f;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setIconSize(i);
            }
        }
    }

    public void setItemPaddingBottom(int i) {
        this.f563u = i;
        c[] cVarArr = this.f550f;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setItemPaddingBottom(i);
            }
        }
    }

    public void setItemPaddingTop(int i) {
        this.f562t = i;
        c[] cVarArr = this.f550f;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setItemPaddingTop(i);
            }
        }
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f559q = colorStateList;
        c[] cVarArr = this.f550f;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setItemRippleColor(colorStateList);
            }
        }
    }

    public void setItemTextAppearanceActive(int i) {
        this.f556n = i;
        c[] cVarArr = this.f550f;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setTextAppearanceActive(i);
                ColorStateList colorStateList = this.f553k;
                if (colorStateList != null) {
                    cVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z2) {
        this.f557o = z2;
        c[] cVarArr = this.f550f;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setTextAppearanceActiveBoldEnabled(z2);
            }
        }
    }

    public void setItemTextAppearanceInactive(int i) {
        this.f555m = i;
        c[] cVarArr = this.f550f;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setTextAppearanceInactive(i);
                ColorStateList colorStateList = this.f553k;
                if (colorStateList != null) {
                    cVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f553k = colorStateList;
        c[] cVarArr = this.f550f;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i) {
        this.f549e = i;
    }

    public void setPresenter(h hVar) {
        this.f544D = hVar;
    }
}
