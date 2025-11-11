package com.google.android.material.theme;

import G0.d;
import M0.m;
import R.b;
import W0.w;
import Y0.a;
import Z0.i;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.android.music.R;
import com.google.android.material.button.MaterialButton;
import g.E;
import l.C0183F;
import l.C0224b0;
import l.C0251p;
import l.C0253q;
import l.C0255r;
import w0.AbstractC0373a;

/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends E {
    @Override // g.E
    public final C0251p a(Context context, AttributeSet attributeSet) {
        return new w(context, attributeSet);
    }

    @Override // g.E
    public final C0253q b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // g.E
    public final C0255r c(Context context, AttributeSet attributeSet) {
        return new d(context, attributeSet);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [l.F, android.widget.CompoundButton, P0.a, android.view.View] */
    @Override // g.E
    public final C0183F d(Context context, AttributeSet attributeSet) {
        ?? c0183f = new C0183F(a.a(context, attributeSet, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = c0183f.getContext();
        TypedArray g2 = m.g(context2, attributeSet, AbstractC0373a.f4163q, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (g2.hasValue(0)) {
            b.c(c0183f, i.x(context2, g2, 0));
        }
        c0183f.f582f = g2.getBoolean(1, false);
        g2.recycle();
        return c0183f;
    }

    @Override // g.E
    public final C0224b0 e(Context context, AttributeSet attributeSet) {
        C0224b0 c0224b0 = new C0224b0(a.a(context, attributeSet, android.R.attr.textViewStyle, 0), attributeSet, android.R.attr.textViewStyle);
        Context context2 = c0224b0.getContext();
        if (i.a0(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = AbstractC0373a.f4166t;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
            int h = X0.a.h(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (h == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, AbstractC0373a.f4165s);
                    int h2 = X0.a.h(c0224b0.getContext(), obtainStyledAttributes3, 1, 2);
                    obtainStyledAttributes3.recycle();
                    if (h2 >= 0) {
                        c0224b0.setLineHeight(h2);
                    }
                }
            }
        }
        return c0224b0;
    }
}
