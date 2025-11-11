package W0;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.android.music.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.List;
import java.util.Locale;
import l.C0180D0;
import l.C0251p;
import w0.AbstractC0373a;

/* loaded from: classes.dex */
public final class w extends C0251p {

    /* renamed from: e, reason: collision with root package name */
    public final C0180D0 f935e;

    /* renamed from: f, reason: collision with root package name */
    public final AccessibilityManager f936f;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f937g;
    public final int h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f938j;

    /* renamed from: k, reason: collision with root package name */
    public int f939k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f940l;

    public w(Context context, AttributeSet attributeSet) {
        super(Y0.a.a(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet);
        this.f937g = new Rect();
        Context context2 = getContext();
        TypedArray g2 = M0.m.g(context2, attributeSet, AbstractC0373a.f4157k, R.attr.autoCompleteTextViewStyle, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (g2.hasValue(0) && g2.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.h = g2.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        this.i = g2.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (g2.hasValue(2)) {
            this.f938j = ColorStateList.valueOf(g2.getColor(2, 0));
        }
        this.f939k = g2.getColor(4, 0);
        this.f940l = Z0.i.x(context2, g2, 5);
        this.f936f = (AccessibilityManager) context2.getSystemService("accessibility");
        C0180D0 c0180d0 = new C0180D0(context2, null, R.attr.listPopupWindowStyle);
        this.f935e = c0180d0;
        c0180d0.f2959y = true;
        c0180d0.f2960z.setFocusable(true);
        c0180d0.f2949o = this;
        c0180d0.f2960z.setInputMethodMode(2);
        c0180d0.m(getAdapter());
        c0180d0.f2950p = new u(0, this);
        if (g2.hasValue(6)) {
            setSimpleItems(g2.getResourceId(6, 0));
        }
        g2.recycle();
    }

    public static void a(w wVar, Object obj) {
        wVar.setText(wVar.convertSelectionToString(obj), false);
    }

    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final boolean c() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f936f;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            return true;
        }
        if (accessibilityManager == null || !accessibilityManager.isEnabled() || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) == null) {
            return false;
        }
        for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
            if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        if (c()) {
            this.f935e.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f938j;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout b2 = b();
        return (b2 == null || !b2.f2001E) ? super.getHint() : b2.getHint();
    }

    public float getPopupElevation() {
        return this.i;
    }

    public int getSimpleItemSelectedColor() {
        return this.f939k;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f940l;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout b2 = b();
        if (b2 != null && b2.f2001E && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f935e.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b2 = b();
            int i3 = 0;
            if (adapter != null && b2 != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                C0180D0 c0180d0 = this.f935e;
                int min = Math.min(adapter.getCount(), Math.max(0, !c0180d0.f2960z.isShowing() ? -1 : c0180d0.f2940c.getSelectedItemPosition()) + 15);
                View view = null;
                int i4 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i3) {
                        view = null;
                        i3 = itemViewType;
                    }
                    view = adapter.getView(max, view, b2);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i4 = Math.max(i4, view.getMeasuredWidth());
                }
                Drawable background = c0180d0.f2960z.getBackground();
                if (background != null) {
                    Rect rect = this.f937g;
                    background.getPadding(rect);
                    i4 += rect.left + rect.right;
                }
                i3 = b2.getEndIconView().getMeasuredWidth() + i4;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i3), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z2) {
        if (c()) {
            return;
        }
        super.onWindowFocusChanged(z2);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t2) {
        super.setAdapter(t2);
        this.f935e.m(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        C0180D0 c0180d0 = this.f935e;
        if (c0180d0 != null) {
            c0180d0.j(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f938j = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof T0.g) {
            ((T0.g) dropDownBackground).j(this.f938j);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f935e.f2951q = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
        super.setRawInputType(i);
        TextInputLayout b2 = b();
        if (b2 != null) {
            b2.s();
        }
    }

    public void setSimpleItemSelectedColor(int i) {
        this.f939k = i;
        if (getAdapter() instanceof v) {
            ((v) getAdapter()).a();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f940l = colorStateList;
        if (getAdapter() instanceof v) {
            ((v) getAdapter()).a();
        }
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (c()) {
            this.f935e.show();
        } else {
            super.showDropDown();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new v(this, getContext(), this.h, strArr));
    }
}
