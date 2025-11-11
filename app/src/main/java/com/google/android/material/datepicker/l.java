package com.google.android.material.datepicker;

import L.G;
import L.S;
import L.a0;
import L.v0;
import L.w0;
import W0.ViewOnClickListenerC0031a;
import Y.DialogInterfaceOnCancelListenerC0049p;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsetsController;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.music.R;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import w0.AbstractC0373a;

/* loaded from: classes.dex */
public final class l<S> extends DialogInterfaceOnCancelListenerC0049p {

    /* renamed from: A0, reason: collision with root package name */
    public int f1911A0;

    /* renamed from: B0, reason: collision with root package name */
    public CharSequence f1912B0;

    /* renamed from: C0, reason: collision with root package name */
    public int f1913C0;

    /* renamed from: D0, reason: collision with root package name */
    public CharSequence f1914D0;

    /* renamed from: E0, reason: collision with root package name */
    public TextView f1915E0;

    /* renamed from: F0, reason: collision with root package name */
    public CheckableImageButton f1916F0;

    /* renamed from: G0, reason: collision with root package name */
    public T0.g f1917G0;

    /* renamed from: H0, reason: collision with root package name */
    public boolean f1918H0;
    public CharSequence I0;

    /* renamed from: J0, reason: collision with root package name */
    public CharSequence f1919J0;

    /* renamed from: m0, reason: collision with root package name */
    public final LinkedHashSet f1920m0;

    /* renamed from: n0, reason: collision with root package name */
    public final LinkedHashSet f1921n0;

    /* renamed from: o0, reason: collision with root package name */
    public int f1922o0;

    /* renamed from: p0, reason: collision with root package name */
    public s f1923p0;

    /* renamed from: q0, reason: collision with root package name */
    public b f1924q0;
    public j r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f1925s0;

    /* renamed from: t0, reason: collision with root package name */
    public CharSequence f1926t0;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f1927u0;
    public int v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f1928w0;

    /* renamed from: x0, reason: collision with root package name */
    public CharSequence f1929x0;

    /* renamed from: y0, reason: collision with root package name */
    public int f1930y0;

    /* renamed from: z0, reason: collision with root package name */
    public CharSequence f1931z0;

    public l() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f1920m0 = new LinkedHashSet();
        this.f1921n0 = new LinkedHashSet();
    }

    public static int P(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar b2 = v.b();
        b2.set(5, 1);
        Calendar a2 = v.a(b2);
        a2.get(2);
        a2.get(1);
        int maximum = a2.getMaximum(7);
        a2.getActualMaximum(5);
        a2.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean Q(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Z0.i.d0(R.attr.materialCalendarStyle, context, j.class.getCanonicalName()).data, new int[]{i});
        boolean z2 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y.DialogInterfaceOnCancelListenerC0049p, Y.AbstractComponentCallbacksC0056x
    public final void A() {
        v0 v0Var;
        v0 v0Var2;
        WindowInsetsController insetsController;
        WindowInsetsController insetsController2;
        super.A();
        Window window = N().getWindow();
        if (this.f1927u0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f1917G0);
            if (!this.f1918H0) {
                View findViewById = I().findViewById(R.id.fullscreen_header);
                ColorStateList y2 = Z0.i.y(findViewById.getBackground());
                Integer valueOf = y2 != null ? Integer.valueOf(y2.getDefaultColor()) : null;
                int i = Build.VERSION.SDK_INT;
                boolean z2 = valueOf == null || valueOf.intValue() == 0;
                int t2 = Z0.i.t(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z2) {
                    valueOf = Integer.valueOf(t2);
                }
                if (i >= 30) {
                    a0.a(window, false);
                } else {
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1792);
                }
                window.getContext();
                window.getContext();
                window.setStatusBarColor(0);
                window.setNavigationBarColor(0);
                boolean z3 = Z0.i.I(0) || Z0.i.I(valueOf.intValue());
                T0.e eVar = new T0.e(window.getDecorView());
                if (Build.VERSION.SDK_INT >= 30) {
                    insetsController2 = window.getInsetsController();
                    w0 w0Var = new w0(insetsController2, eVar);
                    w0Var.f392g = window;
                    v0Var = w0Var;
                } else {
                    v0Var = new v0(window, eVar);
                }
                v0Var.f0(z3);
                boolean z4 = Z0.i.I(0) || Z0.i.I(t2);
                T0.e eVar2 = new T0.e(window.getDecorView());
                if (Build.VERSION.SDK_INT >= 30) {
                    insetsController = window.getInsetsController();
                    w0 w0Var2 = new w0(insetsController, eVar2);
                    w0Var2.f392g = window;
                    v0Var2 = w0Var2;
                } else {
                    v0Var2 = new v0(window, eVar2);
                }
                v0Var2.e0(z4);
                k kVar = new k(findViewById, findViewById.getLayoutParams().height, findViewById.getPaddingTop());
                WeakHashMap weakHashMap = S.f311a;
                G.u(findViewById, kVar);
                this.f1918H0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = H().getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f1917G0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new J0.a(N(), rect));
        }
        H();
        int i2 = this.f1922o0;
        if (i2 == 0) {
            O();
            throw null;
        }
        O();
        b bVar = this.f1924q0;
        j jVar = new j();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i2);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", bVar.d);
        jVar.K(bundle);
        this.r0 = jVar;
        s sVar = jVar;
        if (this.v0 == 1) {
            O();
            b bVar2 = this.f1924q0;
            s mVar = new m();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i2);
            bundle2.putParcelable("DATE_SELECTOR_KEY", null);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar2);
            mVar.K(bundle2);
            sVar = mVar;
        }
        this.f1923p0 = sVar;
        this.f1915E0.setText((this.v0 == 1 && H().getResources().getConfiguration().orientation == 2) ? this.f1919J0 : this.I0);
        O();
        throw null;
    }

    @Override // Y.DialogInterfaceOnCancelListenerC0049p, Y.AbstractComponentCallbacksC0056x
    public final void B() {
        this.f1923p0.f1950W.clear();
        super.B();
    }

    @Override // Y.DialogInterfaceOnCancelListenerC0049p
    public final Dialog M() {
        Context H2 = H();
        H();
        int i = this.f1922o0;
        if (i == 0) {
            O();
            throw null;
        }
        Dialog dialog = new Dialog(H2, i);
        Context context = dialog.getContext();
        this.f1927u0 = Q(context, android.R.attr.windowFullscreen);
        this.f1917G0 = new T0.g(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0373a.f4160n, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = obtainStyledAttributes.getColor(1, 0);
        obtainStyledAttributes.recycle();
        this.f1917G0.h(context);
        this.f1917G0.j(ColorStateList.valueOf(color));
        T0.g gVar = this.f1917G0;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap weakHashMap = S.f311a;
        gVar.i(G.i(decorView));
        return dialog;
    }

    public final void O() {
        if (this.f1186f.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
    }

    @Override // Y.DialogInterfaceOnCancelListenerC0049p, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f1920m0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // Y.DialogInterfaceOnCancelListenerC0049p, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f1921n0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.f1167F;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // Y.DialogInterfaceOnCancelListenerC0049p, Y.AbstractComponentCallbacksC0056x
    public final void t(Bundle bundle) {
        super.t(bundle);
        if (bundle == null) {
            bundle = this.f1186f;
        }
        this.f1922o0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f1924q0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f1925s0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f1926t0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.v0 = bundle.getInt("INPUT_MODE_KEY");
        this.f1928w0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f1929x0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f1930y0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f1931z0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f1911A0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f1912B0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f1913C0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f1914D0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence charSequence = this.f1926t0;
        if (charSequence == null) {
            charSequence = H().getResources().getText(this.f1925s0);
        }
        this.I0 = charSequence;
        if (charSequence != null) {
            CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
            if (split.length > 1) {
                charSequence = split[0];
            }
        } else {
            charSequence = null;
        }
        this.f1919J0 = charSequence;
    }

    @Override // Y.AbstractComponentCallbacksC0056x
    public final View u(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(this.f1927u0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.f1927u0) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(P(context), -2));
        } else {
            inflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(P(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text);
        WeakHashMap weakHashMap = S.f311a;
        textView.setAccessibilityLiveRegion(1);
        this.f1916F0 = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.f1915E0 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        this.f1916F0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f1916F0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, U.t.u(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], U.t.u(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f1916F0.setChecked(this.v0 != 0);
        S.h(this.f1916F0, null);
        CheckableImageButton checkableImageButton2 = this.f1916F0;
        this.f1916F0.setContentDescription(this.v0 == 1 ? checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
        this.f1916F0.setOnClickListener(new ViewOnClickListenerC0031a(3, this));
        O();
        throw null;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, com.google.android.material.datepicker.a] */
    @Override // Y.DialogInterfaceOnCancelListenerC0049p, Y.AbstractComponentCallbacksC0056x
    public final void z(Bundle bundle) {
        super.z(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f1922o0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        b bVar = this.f1924q0;
        ?? obj = new Object();
        int i = a.f1875b;
        int i2 = a.f1875b;
        long j2 = bVar.f1877a.f1938f;
        long j3 = bVar.f1878b.f1938f;
        obj.f1876a = Long.valueOf(bVar.d.f1938f);
        j jVar = this.r0;
        n nVar = jVar == null ? null : jVar.f1900Z;
        if (nVar != null) {
            obj.f1876a = Long.valueOf(nVar.f1938f);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", bVar.f1879c);
        n b2 = n.b(j2);
        n b3 = n.b(j3);
        d dVar = (d) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l2 = obj.f1876a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new b(b2, b3, dVar, l2 == null ? null : n.b(l2.longValue()), bVar.f1880e));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f1925s0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f1926t0);
        bundle.putInt("INPUT_MODE_KEY", this.v0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f1928w0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f1929x0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f1930y0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f1931z0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f1911A0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f1912B0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f1913C0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f1914D0);
    }
}
