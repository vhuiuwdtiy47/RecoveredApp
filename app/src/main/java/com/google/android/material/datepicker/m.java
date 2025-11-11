package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class m<S> extends s {

    /* renamed from: X, reason: collision with root package name */
    public int f1932X;

    /* renamed from: Y, reason: collision with root package name */
    public b f1933Y;

    @Override // Y.AbstractComponentCallbacksC0056x
    public final void t(Bundle bundle) {
        super.t(bundle);
        if (bundle == null) {
            bundle = this.f1186f;
        }
        this.f1932X = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f1933Y = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // Y.AbstractComponentCallbacksC0056x
    public final View u(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(h(), this.f1932X));
        throw null;
    }

    @Override // Y.AbstractComponentCallbacksC0056x
    public final void z(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f1932X);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f1933Y);
    }
}
