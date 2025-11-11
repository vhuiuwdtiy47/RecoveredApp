package androidx.appcompat.widget;

import A0.c;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import k.InterfaceC0164A;
import k.l;
import k.m;
import k.o;
import l.AbstractC0264v0;
import l.C0213U0;
import l.C0233g;
import l.C0239j;
import l.C0243l;
import l.C0247n;
import l.C0262u0;
import l.InterfaceC0245m;
import l.InterfaceC0249o;

/* loaded from: classes.dex */
public class ActionMenuView extends AbstractC0264v0 implements l, InterfaceC0164A {

    /* renamed from: p, reason: collision with root package name */
    public m f1395p;

    /* renamed from: q, reason: collision with root package name */
    public Context f1396q;

    /* renamed from: r, reason: collision with root package name */
    public int f1397r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1398s;

    /* renamed from: t, reason: collision with root package name */
    public C0243l f1399t;

    /* renamed from: u, reason: collision with root package name */
    public C0213U0 f1400u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1401v;

    /* renamed from: w, reason: collision with root package name */
    public int f1402w;

    /* renamed from: x, reason: collision with root package name */
    public final int f1403x;

    /* renamed from: y, reason: collision with root package name */
    public final int f1404y;

    /* renamed from: z, reason: collision with root package name */
    public InterfaceC0249o f1405z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f1403x = (int) (56.0f * f2);
        this.f1404y = (int) (f2 * 4.0f);
        this.f1396q = context;
        this.f1397r = 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.LinearLayout$LayoutParams, l.n] */
    public static C0247n j() {
        ?? layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.f3112a = false;
        ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
        return layoutParams;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.LinearLayout$LayoutParams, l.n] */
    public static C0247n k(ViewGroup.LayoutParams layoutParams) {
        C0247n c0247n;
        if (layoutParams == null) {
            return j();
        }
        if (layoutParams instanceof C0247n) {
            C0247n c0247n2 = (C0247n) layoutParams;
            ?? layoutParams2 = new LinearLayout.LayoutParams((ViewGroup.LayoutParams) c0247n2);
            layoutParams2.f3112a = c0247n2.f3112a;
            c0247n = layoutParams2;
        } else {
            c0247n = new LinearLayout.LayoutParams(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c0247n).gravity <= 0) {
            ((LinearLayout.LayoutParams) c0247n).gravity = 16;
        }
        return c0247n;
    }

    @Override // k.l
    public final boolean b(o oVar) {
        return this.f1395p.q(oVar, null, 0);
    }

    @Override // k.InterfaceC0164A
    public final void c(m mVar) {
        this.f1395p = mVar;
    }

    @Override // l.AbstractC0264v0, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0247n;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // l.AbstractC0264v0
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C0262u0 generateDefaultLayoutParams() {
        return j();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.LinearLayout$LayoutParams, l.u0] */
    @Override // l.AbstractC0264v0
    /* renamed from: g */
    public final C0262u0 generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    @Override // l.AbstractC0264v0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return j();
    }

    @Override // l.AbstractC0264v0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [k.x, java.lang.Object] */
    public Menu getMenu() {
        if (this.f1395p == null) {
            Context context = getContext();
            m mVar = new m(context);
            this.f1395p = mVar;
            mVar.f2841e = new c(24, this);
            C0243l c0243l = new C0243l(context);
            this.f1399t = c0243l;
            c0243l.f3096m = true;
            c0243l.f3097n = true;
            c0243l.f3090e = new Object();
            this.f1395p.b(c0243l, this.f1396q);
            C0243l c0243l2 = this.f1399t;
            c0243l2.h = this;
            this.f1395p = c0243l2.f3089c;
        }
        return this.f1395p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C0243l c0243l = this.f1399t;
        C0239j c0239j = c0243l.f3093j;
        if (c0239j != null) {
            return c0239j.getDrawable();
        }
        if (c0243l.f3095l) {
            return c0243l.f3094k;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f1397r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // l.AbstractC0264v0
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C0262u0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public final boolean l(int i) {
        boolean z2 = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC0245m)) {
            z2 = ((InterfaceC0245m) childAt).c();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC0245m)) ? z2 : ((InterfaceC0245m) childAt2).b() | z2;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0243l c0243l = this.f1399t;
        if (c0243l != null) {
            c0243l.l(false);
            if (this.f1399t.n()) {
                this.f1399t.e();
                this.f1399t.o();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0243l c0243l = this.f1399t;
        if (c0243l != null) {
            c0243l.e();
            C0233g c0233g = c0243l.f3104u;
            if (c0233g == null || !c0233g.b()) {
                return;
            }
            c0233g.i.dismiss();
        }
    }

    @Override // l.AbstractC0264v0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int width;
        int i5;
        if (!this.f1401v) {
            super.onLayout(z2, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i6 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i7 = i3 - i;
        int paddingRight = (i7 - getPaddingRight()) - getPaddingLeft();
        boolean z3 = getLayoutDirection() == 1;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C0247n c0247n = (C0247n) childAt.getLayoutParams();
                if (c0247n.f3112a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i10)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z3) {
                        i5 = getPaddingLeft() + ((LinearLayout.LayoutParams) c0247n).leftMargin;
                        width = i5 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c0247n).rightMargin;
                        i5 = width - measuredWidth;
                    }
                    int i11 = i6 - (measuredHeight / 2);
                    childAt.layout(i5, i11, width, measuredHeight + i11);
                    paddingRight -= measuredWidth;
                    i8 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0247n).leftMargin) + ((LinearLayout.LayoutParams) c0247n).rightMargin;
                    l(i10);
                    i9++;
                }
            }
        }
        if (childCount == 1 && i8 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i12 = (i7 / 2) - (measuredWidth2 / 2);
            int i13 = i6 - (measuredHeight2 / 2);
            childAt2.layout(i12, i13, measuredWidth2 + i12, measuredHeight2 + i13);
            return;
        }
        int i14 = i9 - (i8 ^ 1);
        int max = Math.max(0, i14 > 0 ? paddingRight / i14 : 0);
        if (z3) {
            int width2 = getWidth() - getPaddingRight();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt3 = getChildAt(i15);
                C0247n c0247n2 = (C0247n) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0247n2.f3112a) {
                    int i16 = width2 - ((LinearLayout.LayoutParams) c0247n2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i17 = i6 - (measuredHeight3 / 2);
                    childAt3.layout(i16 - measuredWidth3, i17, i16, measuredHeight3 + i17);
                    width2 = i16 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c0247n2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt4 = getChildAt(i18);
            C0247n c0247n3 = (C0247n) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0247n3.f3112a) {
                int i19 = paddingLeft + ((LinearLayout.LayoutParams) c0247n3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i6 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) c0247n3).rightMargin + max + i19;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v40 */
    @Override // l.AbstractC0264v0, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        ?? r11;
        int i5;
        int i6;
        m mVar;
        boolean z2 = this.f1401v;
        boolean z3 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f1401v = z3;
        if (z2 != z3) {
            this.f1402w = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f1401v && (mVar = this.f1395p) != null && size != this.f1402w) {
            this.f1402w = size;
            mVar.p(true);
        }
        int childCount = getChildCount();
        if (!this.f1401v || childCount <= 0) {
            for (int i7 = 0; i7 < childCount; i7++) {
                C0247n c0247n = (C0247n) getChildAt(i7).getLayoutParams();
                ((LinearLayout.LayoutParams) c0247n).rightMargin = 0;
                ((LinearLayout.LayoutParams) c0247n).leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i8 = size2 - paddingRight;
        int i9 = this.f1403x;
        int i10 = i8 / i9;
        int i11 = i8 % i9;
        if (i10 == 0) {
            setMeasuredDimension(i8, 0);
            return;
        }
        int i12 = (i11 / i10) + i9;
        int childCount2 = getChildCount();
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        boolean z4 = false;
        int i17 = 0;
        long j2 = 0;
        while (true) {
            i3 = this.f1404y;
            if (i16 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i16);
            int i18 = size3;
            int i19 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i5 = i12;
            } else {
                boolean z5 = childAt instanceof ActionMenuItemView;
                i14++;
                if (z5) {
                    childAt.setPadding(i3, 0, i3, 0);
                }
                C0247n c0247n2 = (C0247n) childAt.getLayoutParams();
                c0247n2.f3116f = false;
                c0247n2.f3114c = 0;
                c0247n2.f3113b = 0;
                c0247n2.d = false;
                ((LinearLayout.LayoutParams) c0247n2).leftMargin = 0;
                ((LinearLayout.LayoutParams) c0247n2).rightMargin = 0;
                c0247n2.f3115e = z5 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i20 = c0247n2.f3112a ? 1 : i10;
                C0247n c0247n3 = (C0247n) childAt.getLayoutParams();
                int i21 = i10;
                i5 = i12;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i19, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z5 ? (ActionMenuItemView) childAt : null;
                boolean z6 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z7 = z6;
                if (i20 <= 0 || (z6 && i20 < 2)) {
                    i6 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i5 * i20, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i6 = measuredWidth / i5;
                    if (measuredWidth % i5 != 0) {
                        i6++;
                    }
                    if (z7 && i6 < 2) {
                        i6 = 2;
                    }
                }
                c0247n3.d = !c0247n3.f3112a && z7;
                c0247n3.f3113b = i6;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i6 * i5, 1073741824), makeMeasureSpec);
                i15 = Math.max(i15, i6);
                if (c0247n2.d) {
                    i17++;
                }
                if (c0247n2.f3112a) {
                    z4 = true;
                }
                i10 = i21 - i6;
                i13 = Math.max(i13, childAt.getMeasuredHeight());
                if (i6 == 1) {
                    j2 |= 1 << i16;
                }
            }
            i16++;
            size3 = i18;
            paddingBottom = i19;
            i12 = i5;
        }
        int i22 = size3;
        int i23 = i10;
        int i24 = i12;
        boolean z8 = z4 && i14 == 2;
        int i25 = i23;
        boolean z9 = false;
        while (i17 > 0 && i25 > 0) {
            int i26 = Integer.MAX_VALUE;
            long j3 = 0;
            int i27 = 0;
            int i28 = 0;
            while (i28 < childCount2) {
                boolean z10 = z8;
                C0247n c0247n4 = (C0247n) getChildAt(i28).getLayoutParams();
                int i29 = i13;
                if (c0247n4.d) {
                    int i30 = c0247n4.f3113b;
                    if (i30 < i26) {
                        j3 = 1 << i28;
                        i26 = i30;
                        i27 = 1;
                    } else if (i30 == i26) {
                        j3 |= 1 << i28;
                        i27++;
                    }
                }
                i28++;
                i13 = i29;
                z8 = z10;
            }
            boolean z11 = z8;
            i4 = i13;
            j2 |= j3;
            if (i27 > i25) {
                break;
            }
            int i31 = i26 + 1;
            int i32 = 0;
            while (i32 < childCount2) {
                View childAt2 = getChildAt(i32);
                C0247n c0247n5 = (C0247n) childAt2.getLayoutParams();
                boolean z12 = z4;
                long j4 = 1 << i32;
                if ((j3 & j4) != 0) {
                    if (z11 && c0247n5.f3115e) {
                        r11 = 1;
                        r11 = 1;
                        if (i25 == 1) {
                            childAt2.setPadding(i3 + i24, 0, i3, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    c0247n5.f3113b += r11;
                    c0247n5.f3116f = r11;
                    i25--;
                } else if (c0247n5.f3113b == i31) {
                    j2 |= j4;
                }
                i32++;
                z4 = z12;
            }
            i13 = i4;
            z8 = z11;
            z9 = true;
        }
        i4 = i13;
        boolean z13 = !z4 && i14 == 1;
        if (i25 > 0 && j2 != 0 && (i25 < i14 - 1 || z13 || i15 > 1)) {
            float bitCount = Long.bitCount(j2);
            if (!z13) {
                if ((j2 & 1) != 0 && !((C0247n) getChildAt(0).getLayoutParams()).f3115e) {
                    bitCount -= 0.5f;
                }
                int i33 = childCount2 - 1;
                if ((j2 & (1 << i33)) != 0 && !((C0247n) getChildAt(i33).getLayoutParams()).f3115e) {
                    bitCount -= 0.5f;
                }
            }
            int i34 = bitCount > 0.0f ? (int) ((i25 * i24) / bitCount) : 0;
            boolean z14 = z9;
            for (int i35 = 0; i35 < childCount2; i35++) {
                if ((j2 & (1 << i35)) != 0) {
                    View childAt3 = getChildAt(i35);
                    C0247n c0247n6 = (C0247n) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c0247n6.f3114c = i34;
                        c0247n6.f3116f = true;
                        if (i35 == 0 && !c0247n6.f3115e) {
                            ((LinearLayout.LayoutParams) c0247n6).leftMargin = (-i34) / 2;
                        }
                        z14 = true;
                    } else if (c0247n6.f3112a) {
                        c0247n6.f3114c = i34;
                        c0247n6.f3116f = true;
                        ((LinearLayout.LayoutParams) c0247n6).rightMargin = (-i34) / 2;
                        z14 = true;
                    } else {
                        if (i35 != 0) {
                            ((LinearLayout.LayoutParams) c0247n6).leftMargin = i34 / 2;
                        }
                        if (i35 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) c0247n6).rightMargin = i34 / 2;
                        }
                    }
                }
            }
            z9 = z14;
        }
        if (z9) {
            for (int i36 = 0; i36 < childCount2; i36++) {
                View childAt4 = getChildAt(i36);
                C0247n c0247n7 = (C0247n) childAt4.getLayoutParams();
                if (c0247n7.f3116f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c0247n7.f3113b * i24) + c0247n7.f3114c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i8, mode != 1073741824 ? i4 : i22);
    }

    public void setExpandedActionViewsExclusive(boolean z2) {
        this.f1399t.f3101r = z2;
    }

    public void setOnMenuItemClickListener(InterfaceC0249o interfaceC0249o) {
        this.f1405z = interfaceC0249o;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C0243l c0243l = this.f1399t;
        C0239j c0239j = c0243l.f3093j;
        if (c0239j != null) {
            c0239j.setImageDrawable(drawable);
        } else {
            c0243l.f3095l = true;
            c0243l.f3094k = drawable;
        }
    }

    public void setOverflowReserved(boolean z2) {
        this.f1398s = z2;
    }

    public void setPopupTheme(int i) {
        if (this.f1397r != i) {
            this.f1397r = i;
            if (i == 0) {
                this.f1396q = getContext();
            } else {
                this.f1396q = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C0243l c0243l) {
        this.f1399t = c0243l;
        c0243l.h = this;
        this.f1395p = c0243l.f3089c;
    }

    @Override // l.AbstractC0264v0, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }
}
