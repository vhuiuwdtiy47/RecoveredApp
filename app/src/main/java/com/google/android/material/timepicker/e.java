package com.google.android.material.timepicker;

import L.S;
import T0.j;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.android.music.R;
import java.util.WeakHashMap;
import w0.AbstractC0373a;

/* loaded from: classes.dex */
public abstract class e extends ConstraintLayout {

    /* renamed from: q, reason: collision with root package name */
    public final F0.b f2095q;

    /* renamed from: r, reason: collision with root package name */
    public int f2096r;

    /* renamed from: s, reason: collision with root package name */
    public final T0.g f2097s;

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        T0.g gVar = new T0.g();
        this.f2097s = gVar;
        T0.h hVar = new T0.h(0.5f);
        j e2 = gVar.f683a.f669a.e();
        e2.f704e = hVar;
        e2.f705f = hVar;
        e2.f706g = hVar;
        e2.h = hVar;
        gVar.setShapeAppearanceModel(e2.a());
        this.f2097s.j(ColorStateList.valueOf(-1));
        T0.g gVar2 = this.f2097s;
        WeakHashMap weakHashMap = S.f311a;
        setBackground(gVar2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0373a.f4170x, R.attr.materialClockStyle, 0);
        this.f2096r = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f2095q = new F0.b(13, this);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = S.f311a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            F0.b bVar = this.f2095q;
            handler.removeCallbacks(bVar);
            handler.post(bVar);
        }
    }

    public abstract void m();

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        m();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            F0.b bVar = this.f2095q;
            handler.removeCallbacks(bVar);
            handler.post(bVar);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.f2097s.j(ColorStateList.valueOf(i));
    }
}
