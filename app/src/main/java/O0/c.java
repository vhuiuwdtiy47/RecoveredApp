package O0;

import L.AbstractC0025v;
import L.I;
import L.S;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.util.Log;
import android.util.StateSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.WeakHashMap;
import k.o;
import k.z;
import l.c1;
import x0.AbstractC0375a;
import z0.C0385a;
import z0.C0386b;

/* loaded from: classes.dex */
public abstract class c extends FrameLayout implements z {
    public static final int[] G = {R.attr.state_checked};

    /* renamed from: H, reason: collision with root package name */
    public static final Z0.f f505H = new Object();

    /* renamed from: I, reason: collision with root package name */
    public static final b f506I = new Object();

    /* renamed from: A, reason: collision with root package name */
    public boolean f507A;

    /* renamed from: B, reason: collision with root package name */
    public int f508B;

    /* renamed from: C, reason: collision with root package name */
    public int f509C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f510D;

    /* renamed from: E, reason: collision with root package name */
    public int f511E;

    /* renamed from: F, reason: collision with root package name */
    public C0385a f512F;

    /* renamed from: a, reason: collision with root package name */
    public boolean f513a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f514b;

    /* renamed from: c, reason: collision with root package name */
    public Drawable f515c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f516e;

    /* renamed from: f, reason: collision with root package name */
    public int f517f;

    /* renamed from: g, reason: collision with root package name */
    public float f518g;
    public float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public int f519j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f520k;

    /* renamed from: l, reason: collision with root package name */
    public final FrameLayout f521l;

    /* renamed from: m, reason: collision with root package name */
    public final View f522m;

    /* renamed from: n, reason: collision with root package name */
    public final ImageView f523n;

    /* renamed from: o, reason: collision with root package name */
    public final ViewGroup f524o;

    /* renamed from: p, reason: collision with root package name */
    public final TextView f525p;

    /* renamed from: q, reason: collision with root package name */
    public final TextView f526q;

    /* renamed from: r, reason: collision with root package name */
    public int f527r;

    /* renamed from: s, reason: collision with root package name */
    public int f528s;

    /* renamed from: t, reason: collision with root package name */
    public o f529t;

    /* renamed from: u, reason: collision with root package name */
    public ColorStateList f530u;

    /* renamed from: v, reason: collision with root package name */
    public Drawable f531v;

    /* renamed from: w, reason: collision with root package name */
    public Drawable f532w;

    /* renamed from: x, reason: collision with root package name */
    public ValueAnimator f533x;

    /* renamed from: y, reason: collision with root package name */
    public Z0.f f534y;

    /* renamed from: z, reason: collision with root package name */
    public float f535z;

    public c(Context context) {
        super(context);
        this.f513a = false;
        this.f527r = -1;
        this.f528s = 0;
        this.f534y = f505H;
        this.f535z = 0.0f;
        this.f507A = false;
        this.f508B = 0;
        this.f509C = 0;
        this.f510D = false;
        this.f511E = 0;
        int i = 1;
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.f521l = (FrameLayout) findViewById(com.android.music.R.id.navigation_bar_item_icon_container);
        this.f522m = findViewById(com.android.music.R.id.navigation_bar_item_active_indicator_view);
        ImageView imageView = (ImageView) findViewById(com.android.music.R.id.navigation_bar_item_icon_view);
        this.f523n = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(com.android.music.R.id.navigation_bar_item_labels_group);
        this.f524o = viewGroup;
        TextView textView = (TextView) findViewById(com.android.music.R.id.navigation_bar_item_small_label_view);
        this.f525p = textView;
        TextView textView2 = (TextView) findViewById(com.android.music.R.id.navigation_bar_item_large_label_view);
        this.f526q = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.d = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.f516e = viewGroup.getPaddingBottom();
        this.f517f = getResources().getDimensionPixelSize(com.android.music.R.dimen.m3_navigation_item_active_indicator_label_padding);
        WeakHashMap weakHashMap = S.f311a;
        textView.setImportantForAccessibility(2);
        textView2.setImportantForAccessibility(2);
        setFocusable(true);
        b(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new B0.a(i, (C0.a) this));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void f(android.widget.TextView r4, int r5) {
        /*
            r4.setTextAppearance(r5)
            android.content.Context r0 = r4.getContext()
            r1 = 0
            if (r5 != 0) goto Lb
            goto L1f
        Lb:
            int[] r2 = w0.AbstractC0373a.f4146C
            android.content.res.TypedArray r5 = r0.obtainStyledAttributes(r5, r2)
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            boolean r3 = r5.getValue(r1, r2)
            r5.recycle()
            if (r3 != 0) goto L21
        L1f:
            r5 = r1
            goto L4c
        L21:
            int r5 = r2.getComplexUnit()
            r3 = 2
            if (r5 != r3) goto L3e
            int r5 = r2.data
            float r5 = android.util.TypedValue.complexToFloat(r5)
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r5 = r5 * r0
            int r5 = java.lang.Math.round(r5)
            goto L4c
        L3e:
            int r5 = r2.data
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r5 = android.util.TypedValue.complexToDimensionPixelSize(r5, r0)
        L4c:
            if (r5 == 0) goto L52
            float r5 = (float) r5
            r4.setTextSize(r1, r5)
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.c.f(android.widget.TextView, int):void");
    }

    public static void g(View view, float f2, float f3, int i) {
        view.setScaleX(f2);
        view.setScaleY(f3);
        view.setVisibility(i);
    }

    private View getIconOrContainer() {
        FrameLayout frameLayout = this.f521l;
        return frameLayout != null ? frameLayout : this.f523n;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        int i = 0;
        for (int i2 = 0; i2 < indexOfChild; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof c) && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    private int getSuggestedIconHeight() {
        return getIconOrContainer().getMeasuredHeight() + ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin;
    }

    private int getSuggestedIconWidth() {
        C0385a c0385a = this.f512F;
        int minimumWidth = c0385a == null ? 0 : c0385a.getMinimumWidth() - this.f512F.f4232e.f4267b.f4262w.intValue();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        return Math.max(minimumWidth, layoutParams.rightMargin) + this.f523n.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.leftMargin);
    }

    public static void h(View view, int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i;
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
    }

    public static void k(View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    @Override // k.z
    public final void a(o oVar) {
        this.f529t = oVar;
        setCheckable(oVar.isCheckable());
        setChecked(oVar.isChecked());
        setEnabled(oVar.isEnabled());
        setIcon(oVar.getIcon());
        setTitle(oVar.f2868e);
        setId(oVar.f2865a);
        if (!TextUtils.isEmpty(oVar.f2878q)) {
            setContentDescription(oVar.f2878q);
        }
        c1.a(this, !TextUtils.isEmpty(oVar.f2879r) ? oVar.f2879r : oVar.f2868e);
        setVisibility(oVar.isVisible() ? 0 : 8);
        this.f513a = true;
    }

    public final void b(float f2, float f3) {
        this.f518g = f2 - f3;
        this.h = (f3 * 1.0f) / f2;
        this.i = (f2 * 1.0f) / f3;
    }

    public final void c() {
        o oVar = this.f529t;
        if (oVar != null) {
            setChecked(oVar.isChecked());
        }
    }

    public final void d() {
        Drawable drawable = this.f515c;
        ColorStateList colorStateList = this.f514b;
        FrameLayout frameLayout = this.f521l;
        RippleDrawable rippleDrawable = null;
        boolean z2 = true;
        if (colorStateList != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.f507A && getActiveIndicatorDrawable() != null && frameLayout != null && activeIndicatorDrawable != null) {
                rippleDrawable = new RippleDrawable(R0.a.b(this.f514b), null, activeIndicatorDrawable);
                z2 = false;
            } else if (drawable == null) {
                ColorStateList colorStateList2 = this.f514b;
                int[] iArr = R0.a.d;
                int a2 = R0.a.a(colorStateList2, R0.a.f626c);
                int[] iArr2 = R0.a.f625b;
                drawable = new RippleDrawable(new ColorStateList(new int[][]{iArr, iArr2, StateSet.NOTHING}, new int[]{a2, R0.a.a(colorStateList2, iArr2), R0.a.a(colorStateList2, R0.a.f624a)}), null, null);
            }
        }
        if (frameLayout != null) {
            frameLayout.setPadding(0, 0, 0, 0);
            frameLayout.setForeground(rippleDrawable);
        }
        WeakHashMap weakHashMap = S.f311a;
        setBackground(drawable);
        setDefaultFocusHighlightEnabled(z2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout = this.f521l;
        if (frameLayout != null && this.f507A) {
            frameLayout.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(float f2, float f3) {
        View view = this.f522m;
        if (view != null) {
            Z0.f fVar = this.f534y;
            fVar.getClass();
            view.setScaleX(AbstractC0375a.a(0.4f, 1.0f, f2));
            view.setScaleY(fVar.c(f2, f3));
            view.setAlpha(AbstractC0375a.b(0.0f, 1.0f, f3 == 0.0f ? 0.8f : 0.0f, f3 == 0.0f ? 1.0f : 0.2f, f2));
        }
        this.f535z = f2;
    }

    public Drawable getActiveIndicatorDrawable() {
        View view = this.f522m;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    public C0385a getBadge() {
        return this.f512F;
    }

    public int getItemBackgroundResId() {
        return com.android.music.R.drawable.mtrl_navigation_bar_item_background;
    }

    @Override // k.z
    public o getItemData() {
        return this.f529t;
    }

    public int getItemDefaultMarginResId() {
        return com.android.music.R.dimen.mtrl_navigation_bar_item_default_margin;
    }

    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.f527r;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        ViewGroup viewGroup = this.f524o;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        return viewGroup.getMeasuredHeight() + getSuggestedIconHeight() + (viewGroup.getVisibility() == 0 ? this.f517f : 0) + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        ViewGroup viewGroup = this.f524o;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), viewGroup.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
    }

    public final void i(View view) {
        if (this.f512F != null) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                C0385a c0385a = this.f512F;
                if (c0385a != null) {
                    if (c0385a.c() != null) {
                        c0385a.c().setForeground(null);
                    } else {
                        view.getOverlay().remove(c0385a);
                    }
                }
            }
            this.f512F = null;
        }
    }

    public final void j(int i) {
        View view = this.f522m;
        if (view == null || i <= 0) {
            return;
        }
        int min = Math.min(this.f508B, i - (this.f511E * 2));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.height = (this.f510D && this.f519j == 2) ? min : this.f509C;
        layoutParams.width = min;
        view.setLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        o oVar = this.f529t;
        if (oVar != null && oVar.isCheckable() && this.f529t.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, G);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        Context context;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C0385a c0385a = this.f512F;
        if (c0385a != null && c0385a.isVisible()) {
            o oVar = this.f529t;
            CharSequence charSequence = oVar.f2868e;
            if (!TextUtils.isEmpty(oVar.f2878q)) {
                charSequence = this.f529t.f2878q;
            }
            StringBuilder sb = new StringBuilder();
            sb.append((Object) charSequence);
            sb.append(", ");
            C0385a c0385a2 = this.f512F;
            Object obj = null;
            if (c0385a2.isVisible()) {
                C0386b c0386b = c0385a2.f4232e.f4267b;
                String str = c0386b.f4249j;
                if (str != null) {
                    obj = c0386b.f4254o;
                    if (obj == null) {
                        obj = str;
                    }
                } else if (!c0385a2.f()) {
                    obj = c0386b.f4255p;
                } else if (c0386b.f4256q != 0 && (context = (Context) c0385a2.f4229a.get()) != null) {
                    if (c0385a2.h != -2) {
                        int d = c0385a2.d();
                        int i = c0385a2.h;
                        if (d > i) {
                            obj = context.getString(c0386b.f4257r, Integer.valueOf(i));
                        }
                    }
                    obj = context.getResources().getQuantityString(c0386b.f4256q, c0385a2.d(), Integer.valueOf(c0385a2.d()));
                }
            }
            sb.append(obj);
            accessibilityNodeInfo.setContentDescription(sb.toString());
        }
        accessibilityNodeInfo.setCollectionItemInfo(M.j.a(isSelected(), 0, 1, getItemVisiblePosition(), 1).f416a);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) M.f.f407e.f413a);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(com.android.music.R.string.item_view_role_description));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        post(new I.a(this, i, 1));
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        View view = this.f522m;
        if (view == null) {
            return;
        }
        view.setBackgroundDrawable(drawable);
        d();
    }

    public void setActiveIndicatorEnabled(boolean z2) {
        this.f507A = z2;
        d();
        View view = this.f522m;
        if (view != null) {
            view.setVisibility(z2 ? 0 : 8);
            requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int i) {
        this.f509C = i;
        j(getWidth());
    }

    public void setActiveIndicatorLabelPadding(int i) {
        if (this.f517f != i) {
            this.f517f = i;
            c();
        }
    }

    public void setActiveIndicatorMarginHorizontal(int i) {
        this.f511E = i;
        j(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z2) {
        this.f510D = z2;
    }

    public void setActiveIndicatorWidth(int i) {
        this.f508B = i;
        j(getWidth());
    }

    public void setBadge(C0385a c0385a) {
        C0385a c0385a2 = this.f512F;
        if (c0385a2 == c0385a) {
            return;
        }
        boolean z2 = c0385a2 != null;
        ImageView imageView = this.f523n;
        if (z2 && imageView != null) {
            Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
            i(imageView);
        }
        this.f512F = c0385a;
        if (imageView == null || c0385a == null) {
            return;
        }
        setClipChildren(false);
        setClipToPadding(false);
        C0385a c0385a3 = this.f512F;
        Rect rect = new Rect();
        imageView.getDrawingRect(rect);
        c0385a3.setBounds(rect);
        c0385a3.h(imageView, null);
        if (c0385a3.c() != null) {
            c0385a3.c().setForeground(c0385a3);
        } else {
            imageView.getOverlay().add(c0385a3);
        }
    }

    public void setCheckable(boolean z2) {
        refreshDrawableState();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setChecked(boolean r13) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.c.setChecked(boolean):void");
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        this.f525p.setEnabled(z2);
        this.f526q.setEnabled(z2);
        this.f523n.setEnabled(z2);
        if (z2) {
            I.d(this, AbstractC0025v.b(getContext(), 1002));
        } else {
            WeakHashMap weakHashMap = S.f311a;
            I.d(this, null);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.f531v) {
            return;
        }
        this.f531v = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = drawable.mutate();
            this.f532w = drawable;
            ColorStateList colorStateList = this.f530u;
            if (colorStateList != null) {
                E.a.h(drawable, colorStateList);
            }
        }
        this.f523n.setImageDrawable(drawable);
    }

    public void setIconSize(int i) {
        ImageView imageView = this.f523n;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        imageView.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.f530u = colorStateList;
        if (this.f529t == null || (drawable = this.f532w) == null) {
            return;
        }
        E.a.h(drawable, colorStateList);
        this.f532w.invalidateSelf();
    }

    public void setItemBackground(int i) {
        setItemBackground(i == 0 ? null : B.a.b(getContext(), i));
    }

    public void setItemPaddingBottom(int i) {
        if (this.f516e != i) {
            this.f516e = i;
            c();
        }
    }

    public void setItemPaddingTop(int i) {
        if (this.d != i) {
            this.d = i;
            c();
        }
    }

    public void setItemPosition(int i) {
        this.f527r = i;
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f514b = colorStateList;
        d();
    }

    public void setLabelVisibilityMode(int i) {
        if (this.f519j != i) {
            this.f519j = i;
            if (this.f510D && i == 2) {
                this.f534y = f506I;
            } else {
                this.f534y = f505H;
            }
            j(getWidth());
            c();
        }
    }

    public void setShifting(boolean z2) {
        if (this.f520k != z2) {
            this.f520k = z2;
            c();
        }
    }

    public void setTextAppearanceActive(int i) {
        this.f528s = i;
        TextView textView = this.f526q;
        f(textView, i);
        b(this.f525p.getTextSize(), textView.getTextSize());
    }

    public void setTextAppearanceActiveBoldEnabled(boolean z2) {
        setTextAppearanceActive(this.f528s);
        TextView textView = this.f526q;
        textView.setTypeface(textView.getTypeface(), z2 ? 1 : 0);
    }

    public void setTextAppearanceInactive(int i) {
        TextView textView = this.f525p;
        f(textView, i);
        b(textView.getTextSize(), this.f526q.getTextSize());
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f525p.setTextColor(colorStateList);
            this.f526q.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.f525p.setText(charSequence);
        this.f526q.setText(charSequence);
        o oVar = this.f529t;
        if (oVar == null || TextUtils.isEmpty(oVar.f2878q)) {
            setContentDescription(charSequence);
        }
        o oVar2 = this.f529t;
        if (oVar2 != null && !TextUtils.isEmpty(oVar2.f2879r)) {
            charSequence = this.f529t.f2879r;
        }
        c1.a(this, charSequence);
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.f515c = drawable;
        d();
    }
}
