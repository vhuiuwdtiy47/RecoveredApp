package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.music.R;
import java.util.Locale;
import n0.AbstractC0302z;
import n0.W;

/* loaded from: classes.dex */
public final class x extends AbstractC0302z {

    /* renamed from: c, reason: collision with root package name */
    public final j f1953c;

    public x(j jVar) {
        this.f1953c = jVar;
    }

    @Override // n0.AbstractC0302z
    public final int a() {
        return this.f1953c.f1899Y.f1881f;
    }

    @Override // n0.AbstractC0302z
    public final void c(W w2, int i) {
        j jVar = this.f1953c;
        int i2 = jVar.f1899Y.f1877a.f1936c + i;
        String format = String.format(Locale.getDefault(), "%d", Integer.valueOf(i2));
        TextView textView = ((w) w2).f1952t;
        textView.setText(format);
        Context context = textView.getContext();
        textView.setContentDescription(v.b().get(1) == i2 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2)));
        c cVar = jVar.b0;
        if (v.b().get(1) == i2) {
            Z0.f fVar = cVar.f1884b;
        } else {
            Z0.f fVar2 = cVar.f1883a;
        }
        throw null;
    }

    @Override // n0.AbstractC0302z
    public final W d(ViewGroup viewGroup) {
        return new w((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
