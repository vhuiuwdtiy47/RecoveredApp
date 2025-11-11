package com.google.android.material.bottomnavigation;

import C0.b;
import C0.c;
import C0.d;
import L.C0016l;
import O0.m;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.android.music.R;
import w0.AbstractC0373a;

/* loaded from: classes.dex */
public class BottomNavigationView extends m {
    /* JADX WARN: Type inference failed for: r7v2, types: [M0.p, java.lang.Object] */
    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0016l h = M0.m.h(getContext(), attributeSet, AbstractC0373a.f4151b, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView, new int[0]);
        TypedArray typedArray = (TypedArray) h.f362c;
        setItemHorizontalTranslationEnabled(typedArray.getBoolean(2, true));
        if (typedArray.hasValue(0)) {
            setMinimumHeight(typedArray.getDimensionPixelSize(0, 0));
        }
        typedArray.getBoolean(1, true);
        h.u();
        M0.m.d(this, new Object());
    }

    @Override // O0.m
    public int getMaxItemCount() {
        return 5;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i2) != 1073741824 && suggestedMinimumHeight > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), getPaddingBottom() + getPaddingTop() + suggestedMinimumHeight), 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public void setItemHorizontalTranslationEnabled(boolean z2) {
        b bVar = (b) getMenuView();
        if (bVar.f88L != z2) {
            bVar.setItemHorizontalTranslationEnabled(z2);
            getPresenter().l(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(c cVar) {
        setOnItemReselectedListener(cVar);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(d dVar) {
        setOnItemSelectedListener(dVar);
    }
}
