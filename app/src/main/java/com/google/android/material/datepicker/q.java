package com.google.android.material.datepicker;

import L.B;
import L.S;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.music.R;
import java.util.WeakHashMap;
import n0.W;

/* loaded from: classes.dex */
public final class q extends W {

    /* renamed from: t, reason: collision with root package name */
    public final TextView f1946t;

    /* renamed from: u, reason: collision with root package name */
    public final MaterialCalendarGridView f1947u;

    public q(LinearLayout linearLayout, boolean z2) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f1946t = textView;
        WeakHashMap weakHashMap = S.f311a;
        new B(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 1).f(textView, Boolean.TRUE);
        this.f1947u = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z2) {
            return;
        }
        textView.setVisibility(8);
    }
}
