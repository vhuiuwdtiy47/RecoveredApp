package com.google.android.material.datepicker;

import L.S;
import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import n0.C0300x;
import n0.Z;

/* loaded from: classes.dex */
public final class j<S> extends s {

    /* renamed from: X, reason: collision with root package name */
    public int f1898X;

    /* renamed from: Y, reason: collision with root package name */
    public b f1899Y;

    /* renamed from: Z, reason: collision with root package name */
    public n f1900Z;

    /* renamed from: a0, reason: collision with root package name */
    public int f1901a0;
    public c b0;

    /* renamed from: c0, reason: collision with root package name */
    public RecyclerView f1902c0;

    /* renamed from: d0, reason: collision with root package name */
    public RecyclerView f1903d0;

    /* renamed from: e0, reason: collision with root package name */
    public View f1904e0;

    /* renamed from: f0, reason: collision with root package name */
    public View f1905f0;

    /* renamed from: g0, reason: collision with root package name */
    public View f1906g0;

    /* renamed from: h0, reason: collision with root package name */
    public View f1907h0;

    public final void L(n nVar) {
        r rVar = (r) this.f1903d0.getAdapter();
        int d = rVar.f1948c.f1877a.d(nVar);
        int d2 = d - rVar.f1948c.f1877a.d(this.f1900Z);
        boolean z2 = Math.abs(d2) > 3;
        boolean z3 = d2 > 0;
        this.f1900Z = nVar;
        if (z2 && z3) {
            this.f1903d0.Y(d - 3);
            this.f1903d0.post(new I.a(this, d, 3));
        } else if (!z2) {
            this.f1903d0.post(new I.a(this, d, 3));
        } else {
            this.f1903d0.Y(d + 3);
            this.f1903d0.post(new I.a(this, d, 3));
        }
    }

    public final void M(int i) {
        this.f1901a0 = i;
        if (i == 2) {
            this.f1902c0.getLayoutManager().n0(this.f1900Z.f1936c - ((x) this.f1902c0.getAdapter()).f1953c.f1899Y.f1877a.f1936c);
            this.f1906g0.setVisibility(0);
            this.f1907h0.setVisibility(8);
            this.f1904e0.setVisibility(8);
            this.f1905f0.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.f1906g0.setVisibility(8);
            this.f1907h0.setVisibility(0);
            this.f1904e0.setVisibility(0);
            this.f1905f0.setVisibility(0);
            L(this.f1900Z);
        }
    }

    @Override // Y.AbstractComponentCallbacksC0056x
    public final void t(Bundle bundle) {
        super.t(bundle);
        if (bundle == null) {
            bundle = this.f1186f;
        }
        this.f1898X = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f1899Y = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f1900Z = (n) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // Y.AbstractComponentCallbacksC0056x
    public final View u(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        int i2;
        C0300x c0300x;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(h(), this.f1898X);
        this.b0 = new c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        n nVar = this.f1899Y.f1877a;
        if (l.Q(contextThemeWrapper, R.attr.windowFullscreen)) {
            i = com.android.music.R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = com.android.music.R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View inflate = cloneInContext.inflate(i, viewGroup, false);
        Resources resources = H().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.android.music.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(com.android.music.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(com.android.music.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(com.android.music.R.dimen.mtrl_calendar_days_of_week_height);
        int i3 = o.d;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(com.android.music.R.dimen.mtrl_calendar_month_vertical_padding) * (i3 - 1)) + (resources.getDimensionPixelSize(com.android.music.R.dimen.mtrl_calendar_day_height) * i3) + resources.getDimensionPixelOffset(com.android.music.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(com.android.music.R.id.mtrl_calendar_days_of_week);
        S.h(gridView, new R.h(1));
        int i4 = this.f1899Y.f1880e;
        gridView.setAdapter((ListAdapter) (i4 > 0 ? new e(i4) : new e()));
        gridView.setNumColumns(nVar.d);
        gridView.setEnabled(false);
        this.f1903d0 = (RecyclerView) inflate.findViewById(com.android.music.R.id.mtrl_calendar_months);
        this.f1903d0.setLayoutManager(new g(this, i2, i2));
        this.f1903d0.setTag("MONTHS_VIEW_GROUP_TAG");
        r rVar = new r(contextThemeWrapper, this.f1899Y, new A0.c(18, this));
        this.f1903d0.setAdapter(rVar);
        int integer = contextThemeWrapper.getResources().getInteger(com.android.music.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView3 = (RecyclerView) inflate.findViewById(com.android.music.R.id.mtrl_calendar_year_selector_frame);
        this.f1902c0 = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.f1902c0.setLayoutManager(new GridLayoutManager(integer));
            this.f1902c0.setAdapter(new x(this));
            this.f1902c0.g(new h(this));
        }
        if (inflate.findViewById(com.android.music.R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(com.android.music.R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            S.h(materialButton, new E0.e(3, this));
            View findViewById = inflate.findViewById(com.android.music.R.id.month_navigation_previous);
            this.f1904e0 = findViewById;
            findViewById.setTag("NAVIGATION_PREV_TAG");
            View findViewById2 = inflate.findViewById(com.android.music.R.id.month_navigation_next);
            this.f1905f0 = findViewById2;
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.f1906g0 = inflate.findViewById(com.android.music.R.id.mtrl_calendar_year_selector_frame);
            this.f1907h0 = inflate.findViewById(com.android.music.R.id.mtrl_calendar_day_selector_frame);
            M(1);
            materialButton.setText(this.f1900Z.c());
            this.f1903d0.h(new i(this, rVar, materialButton));
            int i5 = 1;
            materialButton.setOnClickListener(new O0.e(i5, this));
            this.f1905f0.setOnClickListener(new f(this, rVar, i5));
            this.f1904e0.setOnClickListener(new f(this, rVar, 0));
        }
        if (!l.Q(contextThemeWrapper, R.attr.windowFullscreen) && (recyclerView2 = (c0300x = new C0300x()).f3469a) != (recyclerView = this.f1903d0)) {
            Z z2 = c0300x.f3470b;
            if (recyclerView2 != null) {
                ArrayList arrayList = recyclerView2.f1669e0;
                if (arrayList != null) {
                    arrayList.remove(z2);
                }
                c0300x.f3469a.setOnFlingListener(null);
            }
            c0300x.f3469a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() != null) {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
                c0300x.f3469a.h(z2);
                c0300x.f3469a.setOnFlingListener(c0300x);
                new Scroller(c0300x.f3469a.getContext(), new DecelerateInterpolator());
                c0300x.f();
            }
        }
        this.f1903d0.Y(rVar.f1948c.f1877a.d(this.f1900Z));
        S.h(this.f1903d0, new R.h(2));
        return inflate;
    }

    @Override // Y.AbstractComponentCallbacksC0056x
    public final void z(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f1898X);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f1899Y);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f1900Z);
    }
}
