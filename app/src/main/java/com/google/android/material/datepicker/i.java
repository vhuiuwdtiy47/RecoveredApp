package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import n0.H;
import n0.K;

/* loaded from: classes.dex */
public final class i extends K {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f1895a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialButton f1896b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f1897c;

    public i(j jVar, r rVar, MaterialButton materialButton) {
        this.f1897c = jVar;
        this.f1895a = rVar;
        this.f1896b = materialButton;
    }

    @Override // n0.K
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.f1896b.getText());
        }
    }

    @Override // n0.K
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int K02;
        j jVar = this.f1897c;
        if (i < 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) jVar.f1903d0.getLayoutManager();
            View M02 = linearLayoutManager.M0(0, linearLayoutManager.v(), false);
            K02 = M02 == null ? -1 : H.H(M02);
        } else {
            K02 = ((LinearLayoutManager) jVar.f1903d0.getLayoutManager()).K0();
        }
        b bVar = this.f1895a.f1948c;
        Calendar a2 = v.a(bVar.f1877a.f1934a);
        a2.add(2, K02);
        jVar.f1900Z = new n(a2);
        Calendar a3 = v.a(bVar.f1877a.f1934a);
        a3.add(2, K02);
        a3.set(5, 1);
        Calendar a4 = v.a(a3);
        a4.get(2);
        a4.get(1);
        a4.getMaximum(7);
        a4.getActualMaximum(5);
        a4.getTimeInMillis();
        long timeInMillis = a4.getTimeInMillis();
        Locale locale = Locale.getDefault();
        AtomicReference atomicReference = v.f1951a;
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        this.f1896b.setText(instanceForSkeleton.format(new Date(timeInMillis)));
    }
}
