package com.google.android.material.datepicker;

import L.u0;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k implements L.r {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1908a;

    /* renamed from: b, reason: collision with root package name */
    public int f1909b;

    /* renamed from: c, reason: collision with root package name */
    public int f1910c;

    public k(View view) {
        this.f1908a = view;
    }

    @Override // L.r
    public u0 v(View view, u0 u0Var) {
        int i = u0Var.f389a.f(7).f93b;
        View view2 = (View) this.f1908a;
        int i2 = this.f1909b;
        if (i2 >= 0) {
            view2.getLayoutParams().height = i2 + i;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f1910c + i, view2.getPaddingRight(), view2.getPaddingBottom());
        return u0Var;
    }

    public k(Context context, XmlResourceParser xmlResourceParser) {
        this.f1908a = new ArrayList();
        this.f1910c = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), w.r.h);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f1909b = obtainStyledAttributes.getResourceId(index, this.f1909b);
            } else if (index == 1) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f1910c);
                this.f1910c = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new w.n().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        obtainStyledAttributes.recycle();
    }

    public k(View view, int i, int i2) {
        this.f1909b = i;
        this.f1908a = view;
        this.f1910c = i2;
    }
}
