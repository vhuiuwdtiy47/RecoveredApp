package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.android.music.R;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes.dex */
public final class e extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final Calendar f1886a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1887b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1888c;

    public e() {
        Calendar c2 = v.c(null);
        this.f1886a = c2;
        this.f1887b = c2.getMaximum(7);
        this.f1888c = c2.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f1887b;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        int i2 = this.f1887b;
        if (i >= i2) {
            return null;
        }
        int i3 = i + this.f1888c;
        if (i3 > i2) {
            i3 -= i2;
        }
        return Integer.valueOf(i3);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i2 = i + this.f1888c;
        int i3 = this.f1887b;
        if (i2 > i3) {
            i2 -= i3;
        }
        Calendar calendar = this.f1886a;
        calendar.set(7, i2);
        textView.setText(calendar.getDisplayName(7, 4, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public e(int i) {
        Calendar c2 = v.c(null);
        this.f1886a = c2;
        this.f1887b = c2.getMaximum(7);
        this.f1888c = i;
    }
}
