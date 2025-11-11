package androidx.appcompat.widget;

import D0.i;
import L.C0016l;
import L.M;
import L.S;
import O0.e;
import S.b;
import U.t;
import Y.J;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.android.music.R;
import f.AbstractC0117a;
import j.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import k.m;
import k.o;
import l.AbstractC0215V0;
import l.C0173A;
import l.C0175B;
import l.C0198M0;
import l.C0213U0;
import l.C0217W0;
import l.C0224b0;
import l.C0243l;
import l.InterfaceC0240j0;
import l.RunnableC0211T0;
import l.X0;
import l.Y0;
import l.Z0;
import l.a1;
import l.b1;
import l.c1;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f1419A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f1420B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f1421C;

    /* renamed from: D, reason: collision with root package name */
    public final ArrayList f1422D;

    /* renamed from: E, reason: collision with root package name */
    public final ArrayList f1423E;

    /* renamed from: F, reason: collision with root package name */
    public final int[] f1424F;
    public final C0016l G;

    /* renamed from: H, reason: collision with root package name */
    public ArrayList f1425H;

    /* renamed from: I, reason: collision with root package name */
    public final C0213U0 f1426I;

    /* renamed from: J, reason: collision with root package name */
    public b1 f1427J;

    /* renamed from: K, reason: collision with root package name */
    public C0243l f1428K;

    /* renamed from: L, reason: collision with root package name */
    public C0217W0 f1429L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f1430M;

    /* renamed from: N, reason: collision with root package name */
    public OnBackInvokedCallback f1431N;

    /* renamed from: O, reason: collision with root package name */
    public OnBackInvokedDispatcher f1432O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f1433P;

    /* renamed from: Q, reason: collision with root package name */
    public final i f1434Q;

    /* renamed from: a, reason: collision with root package name */
    public ActionMenuView f1435a;

    /* renamed from: b, reason: collision with root package name */
    public C0224b0 f1436b;

    /* renamed from: c, reason: collision with root package name */
    public C0224b0 f1437c;
    public C0173A d;

    /* renamed from: e, reason: collision with root package name */
    public C0175B f1438e;

    /* renamed from: f, reason: collision with root package name */
    public final Drawable f1439f;

    /* renamed from: g, reason: collision with root package name */
    public final CharSequence f1440g;
    public C0173A h;
    public View i;

    /* renamed from: j, reason: collision with root package name */
    public Context f1441j;

    /* renamed from: k, reason: collision with root package name */
    public int f1442k;

    /* renamed from: l, reason: collision with root package name */
    public int f1443l;

    /* renamed from: m, reason: collision with root package name */
    public int f1444m;

    /* renamed from: n, reason: collision with root package name */
    public final int f1445n;

    /* renamed from: o, reason: collision with root package name */
    public final int f1446o;

    /* renamed from: p, reason: collision with root package name */
    public int f1447p;

    /* renamed from: q, reason: collision with root package name */
    public int f1448q;

    /* renamed from: r, reason: collision with root package name */
    public int f1449r;

    /* renamed from: s, reason: collision with root package name */
    public int f1450s;

    /* renamed from: t, reason: collision with root package name */
    public C0198M0 f1451t;

    /* renamed from: u, reason: collision with root package name */
    public int f1452u;

    /* renamed from: v, reason: collision with root package name */
    public int f1453v;

    /* renamed from: w, reason: collision with root package name */
    public final int f1454w;

    /* renamed from: x, reason: collision with root package name */
    public CharSequence f1455x;

    /* renamed from: y, reason: collision with root package name */
    public CharSequence f1456y;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f1457z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new h(getContext());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$MarginLayoutParams, l.X0] */
    public static X0 h() {
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.f3031b = 0;
        marginLayoutParams.f3030a = 8388627;
        return marginLayoutParams;
    }

    public static X0 i(ViewGroup.LayoutParams layoutParams) {
        boolean z2 = layoutParams instanceof X0;
        if (z2) {
            X0 x02 = (X0) layoutParams;
            X0 x03 = new X0(x02);
            x03.f3031b = 0;
            x03.f3031b = x02.f3031b;
            return x03;
        }
        if (z2) {
            X0 x04 = new X0((X0) layoutParams);
            x04.f3031b = 0;
            return x04;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            X0 x05 = new X0(layoutParams);
            x05.f3031b = 0;
            return x05;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        X0 x06 = new X0(marginLayoutParams);
        x06.f3031b = 0;
        ((ViewGroup.MarginLayoutParams) x06).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) x06).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) x06).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) x06).bottomMargin = marginLayoutParams.bottomMargin;
        return x06;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(ArrayList arrayList, int i) {
        boolean z2 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z2) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                X0 x02 = (X0) childAt.getLayoutParams();
                if (x02.f3031b == 0 && t(childAt)) {
                    int i3 = x02.f3030a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            X0 x03 = (X0) childAt2.getLayoutParams();
            if (x03.f3031b == 0 && t(childAt2)) {
                int i5 = x03.f3030a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        X0 h = layoutParams == null ? h() : !checkLayoutParams(layoutParams) ? i(layoutParams) : (X0) layoutParams;
        h.f3031b = 1;
        if (!z2 || this.i == null) {
            addView(view, h);
        } else {
            view.setLayoutParams(h);
            this.f1423E.add(view);
        }
    }

    public final void c() {
        if (this.h == null) {
            C0173A c0173a = new C0173A(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.h = c0173a;
            c0173a.setImageDrawable(this.f1439f);
            this.h.setContentDescription(this.f1440g);
            X0 h = h();
            h.f3030a = (this.f1445n & 112) | 8388611;
            h.f3031b = 2;
            this.h.setLayoutParams(h);
            this.h.setOnClickListener(new e(4, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof X0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.M0, java.lang.Object] */
    public final void d() {
        if (this.f1451t == null) {
            ?? obj = new Object();
            obj.f2989a = 0;
            obj.f2990b = 0;
            obj.f2991c = Integer.MIN_VALUE;
            obj.d = Integer.MIN_VALUE;
            obj.f2992e = 0;
            obj.f2993f = 0;
            obj.f2994g = false;
            obj.h = false;
            this.f1451t = obj;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f1435a;
        if (actionMenuView.f1395p == null) {
            m mVar = (m) actionMenuView.getMenu();
            if (this.f1429L == null) {
                this.f1429L = new C0217W0(this);
            }
            this.f1435a.setExpandedActionViewsExclusive(true);
            mVar.b(this.f1429L, this.f1441j);
            u();
        }
    }

    public final void f() {
        if (this.f1435a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f1435a = actionMenuView;
            actionMenuView.setPopupTheme(this.f1442k);
            this.f1435a.setOnMenuItemClickListener(this.f1426I);
            ActionMenuView actionMenuView2 = this.f1435a;
            C0213U0 c0213u0 = new C0213U0(this);
            actionMenuView2.getClass();
            actionMenuView2.f1400u = c0213u0;
            X0 h = h();
            h.f3030a = (this.f1445n & 112) | 8388613;
            this.f1435a.setLayoutParams(h);
            b(this.f1435a, false);
        }
    }

    public final void g() {
        if (this.d == null) {
            this.d = new C0173A(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            X0 h = h();
            h.f3030a = (this.f1445n & 112) | 8388611;
            this.d.setLayoutParams(h);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        C0173A c0173a = this.h;
        if (c0173a != null) {
            return c0173a.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C0173A c0173a = this.h;
        if (c0173a != null) {
            return c0173a.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C0198M0 c0198m0 = this.f1451t;
        if (c0198m0 != null) {
            return c0198m0.f2994g ? c0198m0.f2989a : c0198m0.f2990b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f1453v;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C0198M0 c0198m0 = this.f1451t;
        if (c0198m0 != null) {
            return c0198m0.f2989a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        C0198M0 c0198m0 = this.f1451t;
        if (c0198m0 != null) {
            return c0198m0.f2990b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        C0198M0 c0198m0 = this.f1451t;
        if (c0198m0 != null) {
            return c0198m0.f2994g ? c0198m0.f2990b : c0198m0.f2989a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f1452u;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        m mVar;
        ActionMenuView actionMenuView = this.f1435a;
        return (actionMenuView == null || (mVar = actionMenuView.f1395p) == null || !mVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f1453v, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f1452u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        C0175B c0175b = this.f1438e;
        if (c0175b != null) {
            return c0175b.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C0175B c0175b = this.f1438e;
        if (c0175b != null) {
            return c0175b.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f1435a.getMenu();
    }

    public View getNavButtonView() {
        return this.d;
    }

    public CharSequence getNavigationContentDescription() {
        C0173A c0173a = this.d;
        if (c0173a != null) {
            return c0173a.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C0173A c0173a = this.d;
        if (c0173a != null) {
            return c0173a.getDrawable();
        }
        return null;
    }

    public C0243l getOuterActionMenuPresenter() {
        return this.f1428K;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f1435a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f1441j;
    }

    public int getPopupTheme() {
        return this.f1442k;
    }

    public CharSequence getSubtitle() {
        return this.f1456y;
    }

    public final TextView getSubtitleTextView() {
        return this.f1437c;
    }

    public CharSequence getTitle() {
        return this.f1455x;
    }

    public int getTitleMarginBottom() {
        return this.f1450s;
    }

    public int getTitleMarginEnd() {
        return this.f1448q;
    }

    public int getTitleMarginStart() {
        return this.f1447p;
    }

    public int getTitleMarginTop() {
        return this.f1449r;
    }

    public final TextView getTitleTextView() {
        return this.f1436b;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.b1, java.lang.Object] */
    public InterfaceC0240j0 getWrapper() {
        Drawable drawable;
        if (this.f1427J == null) {
            ?? obj = new Object();
            obj.f3065n = 0;
            obj.f3055a = this;
            obj.h = getTitle();
            obj.i = getSubtitle();
            obj.f3060g = obj.h != null;
            obj.f3059f = getNavigationIcon();
            C0016l s2 = C0016l.s(getContext(), null, AbstractC0117a.f2235a, R.attr.actionBarStyle);
            obj.f3066o = s2.h(15);
            TypedArray typedArray = (TypedArray) s2.f362c;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                obj.f3060g = true;
                obj.h = text;
                if ((obj.f3056b & 8) != 0) {
                    Toolbar toolbar = obj.f3055a;
                    toolbar.setTitle(text);
                    if (obj.f3060g) {
                        S.i(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                obj.i = text2;
                if ((obj.f3056b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable h = s2.h(20);
            if (h != null) {
                obj.f3058e = h;
                obj.c();
            }
            Drawable h2 = s2.h(17);
            if (h2 != null) {
                obj.d = h2;
                obj.c();
            }
            if (obj.f3059f == null && (drawable = obj.f3066o) != null) {
                obj.f3059f = drawable;
                int i = obj.f3056b & 4;
                Toolbar toolbar2 = obj.f3055a;
                if (i != 0) {
                    toolbar2.setNavigationIcon(drawable);
                } else {
                    toolbar2.setNavigationIcon((Drawable) null);
                }
            }
            obj.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = obj.f3057c;
                if (view != null && (obj.f3056b & 16) != 0) {
                    removeView(view);
                }
                obj.f3057c = inflate;
                if (inflate != null && (obj.f3056b & 16) != 0) {
                    addView(inflate);
                }
                obj.a(obj.f3056b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int max = Math.max(dimensionPixelOffset, 0);
                int max2 = Math.max(dimensionPixelOffset2, 0);
                d();
                this.f1451t.a(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f1443l = resourceId2;
                C0224b0 c0224b0 = this.f1436b;
                if (c0224b0 != null) {
                    c0224b0.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f1444m = resourceId3;
                C0224b0 c0224b02 = this.f1437c;
                if (c0224b02 != null) {
                    c0224b02.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            s2.u();
            if (R.string.abc_action_bar_up_description != obj.f3065n) {
                obj.f3065n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i2 = obj.f3065n;
                    obj.f3061j = i2 != 0 ? getContext().getString(i2) : null;
                    obj.b();
                }
            }
            obj.f3061j = getNavigationContentDescription();
            setNavigationOnClickListener(new a1(obj));
            this.f1427J = obj;
        }
        return this.f1427J;
    }

    public final int j(View view, int i) {
        X0 x02 = (X0) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = x02.f3030a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.f1454w & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) x02).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i5 = ((ViewGroup.MarginLayoutParams) x02).topMargin;
        if (i4 < i5) {
            i4 = i5;
        } else {
            int i6 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
            int i7 = ((ViewGroup.MarginLayoutParams) x02).bottomMargin;
            if (i6 < i7) {
                i4 = Math.max(0, i4 - (i7 - i6));
            }
        }
        return paddingTop + i4;
    }

    public void m(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    public final void n() {
        Iterator it = this.f1425H.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it2 = ((CopyOnWriteArrayList) this.G.f362c).iterator();
        while (it2.hasNext()) {
            ((J) it2.next()).f978a.j();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f1425H = currentMenuItems2;
    }

    public final boolean o(View view) {
        return view.getParent() == this || this.f1423E.contains(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        u();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1434Q);
        u();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1421C = false;
        }
        if (!this.f1421C) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1421C = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f1421C = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x028f A[LOOP:0: B:39:0x028d->B:40:0x028f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02a7 A[LOOP:1: B:43:0x02a5->B:44:0x02a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02c8 A[LOOP:2: B:47:0x02c6->B:48:0x02c8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0318 A[LOOP:3: B:56:0x0316->B:57:0x0318, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0218  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 809
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        char c2;
        Object[] objArr;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = 0;
        if (getLayoutDirection() == 1) {
            objArr = true;
            c2 = 0;
        } else {
            c2 = 1;
            objArr = false;
        }
        if (t(this.d)) {
            s(this.d, i, 0, i2, this.f1446o);
            i3 = k(this.d) + this.d.getMeasuredWidth();
            i4 = Math.max(0, l(this.d) + this.d.getMeasuredHeight());
            i5 = View.combineMeasuredStates(0, this.d.getMeasuredState());
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (t(this.h)) {
            s(this.h, i, 0, i2, this.f1446o);
            i3 = k(this.h) + this.h.getMeasuredWidth();
            i4 = Math.max(i4, l(this.h) + this.h.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i3);
        int max2 = Math.max(0, currentContentInsetStart - i3);
        Object[] objArr2 = objArr;
        int[] iArr = this.f1424F;
        iArr[objArr2 == true ? 1 : 0] = max2;
        if (t(this.f1435a)) {
            s(this.f1435a, i, max, i2, this.f1446o);
            i6 = k(this.f1435a) + this.f1435a.getMeasuredWidth();
            i4 = Math.max(i4, l(this.f1435a) + this.f1435a.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.f1435a.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c2] = Math.max(0, currentContentInsetEnd - i6);
        if (t(this.i)) {
            max3 += r(this.i, i, max3, i2, 0, iArr);
            i4 = Math.max(i4, l(this.i) + this.i.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.i.getMeasuredState());
        }
        if (t(this.f1438e)) {
            max3 += r(this.f1438e, i, max3, i2, 0, iArr);
            i4 = Math.max(i4, l(this.f1438e) + this.f1438e.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.f1438e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((X0) childAt.getLayoutParams()).f3031b == 0 && t(childAt)) {
                max3 += r(childAt, i, max3, i2, 0, iArr);
                int max4 = Math.max(i4, l(childAt) + childAt.getMeasuredHeight());
                i5 = View.combineMeasuredStates(i5, childAt.getMeasuredState());
                i4 = max4;
            } else {
                max3 = max3;
            }
        }
        int i12 = max3;
        int i13 = this.f1449r + this.f1450s;
        int i14 = this.f1447p + this.f1448q;
        if (t(this.f1436b)) {
            r(this.f1436b, i, i12 + i14, i2, i13, iArr);
            int k2 = k(this.f1436b) + this.f1436b.getMeasuredWidth();
            i7 = l(this.f1436b) + this.f1436b.getMeasuredHeight();
            i8 = View.combineMeasuredStates(i5, this.f1436b.getMeasuredState());
            i9 = k2;
        } else {
            i7 = 0;
            i8 = i5;
            i9 = 0;
        }
        if (t(this.f1437c)) {
            i9 = Math.max(i9, r(this.f1437c, i, i12 + i14, i2, i13 + i7, iArr));
            i7 += l(this.f1437c) + this.f1437c.getMeasuredHeight();
            i8 = View.combineMeasuredStates(i8, this.f1437c.getMeasuredState());
        }
        int max5 = Math.max(i4, i7);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i12 + i9;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max5;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & i8);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, i8 << 16);
        if (this.f1430M) {
            int childCount2 = getChildCount();
            for (int i15 = 0; i15 < childCount2; i15++) {
                View childAt2 = getChildAt(i15);
                if (!t(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, i10);
        }
        i10 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i10);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof Z0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Z0 z02 = (Z0) parcelable;
        super.onRestoreInstanceState(z02.f628a);
        ActionMenuView actionMenuView = this.f1435a;
        m mVar = actionMenuView != null ? actionMenuView.f1395p : null;
        int i = z02.f3042c;
        if (i != 0 && this.f1429L != null && mVar != null && (findItem = mVar.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (z02.d) {
            i iVar = this.f1434Q;
            removeCallbacks(iVar);
            post(iVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        d();
        C0198M0 c0198m0 = this.f1451t;
        boolean z2 = i == 1;
        if (z2 == c0198m0.f2994g) {
            return;
        }
        c0198m0.f2994g = z2;
        if (!c0198m0.h) {
            c0198m0.f2989a = c0198m0.f2992e;
            c0198m0.f2990b = c0198m0.f2993f;
            return;
        }
        if (z2) {
            int i2 = c0198m0.d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = c0198m0.f2992e;
            }
            c0198m0.f2989a = i2;
            int i3 = c0198m0.f2991c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = c0198m0.f2993f;
            }
            c0198m0.f2990b = i3;
            return;
        }
        int i4 = c0198m0.f2991c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = c0198m0.f2992e;
        }
        c0198m0.f2989a = i4;
        int i5 = c0198m0.d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = c0198m0.f2993f;
        }
        c0198m0.f2990b = i5;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, S.b, l.Z0] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0243l c0243l;
        o oVar;
        ?? bVar = new b(super.onSaveInstanceState());
        C0217W0 c0217w0 = this.f1429L;
        if (c0217w0 != null && (oVar = c0217w0.f3028b) != null) {
            bVar.f3042c = oVar.f2865a;
        }
        ActionMenuView actionMenuView = this.f1435a;
        bVar.d = (actionMenuView == null || (c0243l = actionMenuView.f1399t) == null || !c0243l.n()) ? false : true;
        return bVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1420B = false;
        }
        if (!this.f1420B) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1420B = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f1420B = false;
        return true;
    }

    public final int p(View view, int i, int i2, int[] iArr) {
        X0 x02 = (X0) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) x02).leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int j2 = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, j2, max + measuredWidth, view.getMeasuredHeight() + j2);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) x02).rightMargin + max;
    }

    public final int q(View view, int i, int i2, int[] iArr) {
        X0 x02 = (X0) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) x02).rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int j2 = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, j2, max, view.getMeasuredHeight() + j2);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) x02).leftMargin);
    }

    public final int r(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void s(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public void setBackInvokedCallbackEnabled(boolean z2) {
        if (this.f1433P != z2) {
            this.f1433P = z2;
            u();
        }
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(t.u(getContext(), i));
    }

    public void setCollapsible(boolean z2) {
        this.f1430M = z2;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f1453v) {
            this.f1453v = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f1452u) {
            this.f1452u = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(t.u(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(t.u(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(Y0 y02) {
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f1435a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f1442k != i) {
            this.f1442k = i;
            if (i == 0) {
                this.f1441j = getContext();
            } else {
                this.f1441j = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMarginBottom(int i) {
        this.f1450s = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f1448q = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f1447p = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f1449r = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public final boolean t(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final void u() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a2 = AbstractC0215V0.a(this);
            C0217W0 c0217w0 = this.f1429L;
            boolean z2 = (c0217w0 == null || c0217w0.f3028b == null || a2 == null || !isAttachedToWindow() || !this.f1433P) ? false : true;
            if (z2 && this.f1432O == null) {
                if (this.f1431N == null) {
                    this.f1431N = AbstractC0215V0.b(new RunnableC0211T0(this, 0));
                }
                AbstractC0215V0.c(a2, this.f1431N);
                this.f1432O = a2;
                return;
            }
            if (z2 || (onBackInvokedDispatcher = this.f1432O) == null) {
                return;
            }
            AbstractC0215V0.d(onBackInvokedDispatcher, this.f1431N);
            this.f1432O = null;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f1454w = 8388627;
        this.f1422D = new ArrayList();
        this.f1423E = new ArrayList();
        this.f1424F = new int[2];
        this.G = new C0016l(new RunnableC0211T0(this, 1));
        this.f1425H = new ArrayList();
        this.f1426I = new C0213U0(this);
        this.f1434Q = new i(13, this);
        Context context2 = getContext();
        int[] iArr = AbstractC0117a.f2254w;
        C0016l s2 = C0016l.s(context2, attributeSet, iArr, R.attr.toolbarStyle);
        WeakHashMap weakHashMap = S.f311a;
        M.d(this, context, iArr, attributeSet, (TypedArray) s2.f362c, R.attr.toolbarStyle, 0);
        TypedArray typedArray = (TypedArray) s2.f362c;
        this.f1443l = typedArray.getResourceId(28, 0);
        this.f1444m = typedArray.getResourceId(19, 0);
        this.f1454w = typedArray.getInteger(0, 8388627);
        this.f1445n = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f1450s = dimensionPixelOffset;
        this.f1449r = dimensionPixelOffset;
        this.f1448q = dimensionPixelOffset;
        this.f1447p = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f1447p = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f1448q = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f1449r = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f1450s = dimensionPixelOffset5;
        }
        this.f1446o = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        C0198M0 c0198m0 = this.f1451t;
        c0198m0.h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            c0198m0.f2992e = dimensionPixelSize;
            c0198m0.f2989a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            c0198m0.f2993f = dimensionPixelSize2;
            c0198m0.f2990b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            c0198m0.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f1452u = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f1453v = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f1439f = s2.h(4);
        this.f1440g = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f1441j = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable h = s2.h(16);
        if (h != null) {
            setNavigationIcon(h);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable h2 = s2.h(11);
        if (h2 != null) {
            setLogo(h2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(s2.g(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(s2.g(20));
        }
        if (typedArray.hasValue(14)) {
            m(typedArray.getResourceId(14, 0));
        }
        s2.u();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, l.X0] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.f3030a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0117a.f2236b);
        marginLayoutParams.f3030a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        marginLayoutParams.f3031b = 0;
        return marginLayoutParams;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        C0173A c0173a = this.h;
        if (c0173a != null) {
            c0173a.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.h.setImageDrawable(drawable);
        } else {
            C0173A c0173a = this.h;
            if (c0173a != null) {
                c0173a.setImageDrawable(this.f1439f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f1438e == null) {
                this.f1438e = new C0175B(getContext(), null, 0);
            }
            if (!o(this.f1438e)) {
                b(this.f1438e, true);
            }
        } else {
            C0175B c0175b = this.f1438e;
            if (c0175b != null && o(c0175b)) {
                removeView(this.f1438e);
                this.f1423E.remove(this.f1438e);
            }
        }
        C0175B c0175b2 = this.f1438e;
        if (c0175b2 != null) {
            c0175b2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f1438e == null) {
            this.f1438e = new C0175B(getContext(), null, 0);
        }
        C0175B c0175b = this.f1438e;
        if (c0175b != null) {
            c0175b.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        C0173A c0173a = this.d;
        if (c0173a != null) {
            c0173a.setContentDescription(charSequence);
            c1.a(this.d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!o(this.d)) {
                b(this.d, true);
            }
        } else {
            C0173A c0173a = this.d;
            if (c0173a != null && o(c0173a)) {
                removeView(this.d);
                this.f1423E.remove(this.d);
            }
        }
        C0173A c0173a2 = this.d;
        if (c0173a2 != null) {
            c0173a2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1437c == null) {
                Context context = getContext();
                C0224b0 c0224b0 = new C0224b0(context, null);
                this.f1437c = c0224b0;
                c0224b0.setSingleLine();
                this.f1437c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1444m;
                if (i != 0) {
                    this.f1437c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1419A;
                if (colorStateList != null) {
                    this.f1437c.setTextColor(colorStateList);
                }
            }
            if (!o(this.f1437c)) {
                b(this.f1437c, true);
            }
        } else {
            C0224b0 c0224b02 = this.f1437c;
            if (c0224b02 != null && o(c0224b02)) {
                removeView(this.f1437c);
                this.f1423E.remove(this.f1437c);
            }
        }
        C0224b0 c0224b03 = this.f1437c;
        if (c0224b03 != null) {
            c0224b03.setText(charSequence);
        }
        this.f1456y = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f1419A = colorStateList;
        C0224b0 c0224b0 = this.f1437c;
        if (c0224b0 != null) {
            c0224b0.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1436b == null) {
                Context context = getContext();
                C0224b0 c0224b0 = new C0224b0(context, null);
                this.f1436b = c0224b0;
                c0224b0.setSingleLine();
                this.f1436b.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1443l;
                if (i != 0) {
                    this.f1436b.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1457z;
                if (colorStateList != null) {
                    this.f1436b.setTextColor(colorStateList);
                }
            }
            if (!o(this.f1436b)) {
                b(this.f1436b, true);
            }
        } else {
            C0224b0 c0224b02 = this.f1436b;
            if (c0224b02 != null && o(c0224b02)) {
                removeView(this.f1436b);
                this.f1423E.remove(this.f1436b);
            }
        }
        C0224b0 c0224b03 = this.f1436b;
        if (c0224b03 != null) {
            c0224b03.setText(charSequence);
        }
        this.f1455x = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f1457z = colorStateList;
        C0224b0 c0224b0 = this.f1436b;
        if (c0224b0 != null) {
            c0224b0.setTextColor(colorStateList);
        }
    }
}
