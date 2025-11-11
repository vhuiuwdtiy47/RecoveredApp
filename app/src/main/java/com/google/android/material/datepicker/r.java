package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.android.music.R;
import java.util.Calendar;
import n0.AbstractC0302z;
import n0.I;
import n0.W;

/* loaded from: classes.dex */
public final class r extends AbstractC0302z {

    /* renamed from: c, reason: collision with root package name */
    public final b f1948c;
    public final A0.c d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1949e;

    public r(ContextThemeWrapper contextThemeWrapper, b bVar, A0.c cVar) {
        n nVar = bVar.f1877a;
        n nVar2 = bVar.d;
        if (nVar.f1934a.compareTo(nVar2.f1934a) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (nVar2.f1934a.compareTo(bVar.f1878b.f1934a) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f1949e = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * o.d) + (l.Q(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.f1948c = bVar;
        this.d = cVar;
        if (this.f3473a.a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f3474b = true;
    }

    @Override // n0.AbstractC0302z
    public final int a() {
        return this.f1948c.f1882g;
    }

    @Override // n0.AbstractC0302z
    public final long b(int i) {
        Calendar a2 = v.a(this.f1948c.f1877a.f1934a);
        a2.add(2, i);
        a2.set(5, 1);
        Calendar a3 = v.a(a2);
        a3.get(2);
        a3.get(1);
        a3.getMaximum(7);
        a3.getActualMaximum(5);
        a3.getTimeInMillis();
        return a3.getTimeInMillis();
    }

    @Override // n0.AbstractC0302z
    public final void c(W w2, int i) {
        q qVar = (q) w2;
        b bVar = this.f1948c;
        Calendar a2 = v.a(bVar.f1877a.f1934a);
        a2.add(2, i);
        n nVar = new n(a2);
        qVar.f1946t.setText(nVar.c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) qVar.f1947u.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() == null || !nVar.equals(materialCalendarGridView.a().f1941a)) {
            new o(nVar, bVar);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.a().getClass();
        throw null;
    }

    @Override // n0.AbstractC0302z
    public final W d(ViewGroup viewGroup) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!l.Q(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new q(linearLayout, false);
        }
        linearLayout.setLayoutParams(new I(-1, this.f1949e));
        return new q(linearLayout, true);
    }
}
