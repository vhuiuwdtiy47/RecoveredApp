package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;
import n0.H;

/* loaded from: classes.dex */
public final class f implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1889a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f1890b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f1891c;

    public /* synthetic */ f(j jVar, r rVar, int i) {
        this.f1889a = i;
        this.f1891c = jVar;
        this.f1890b = rVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1889a) {
            case 0:
                j jVar = this.f1891c;
                int K02 = ((LinearLayoutManager) jVar.f1903d0.getLayoutManager()).K0() - 1;
                if (K02 >= 0) {
                    Calendar a2 = v.a(this.f1890b.f1948c.f1877a.f1934a);
                    a2.add(2, K02);
                    jVar.L(new n(a2));
                    return;
                }
                return;
            default:
                j jVar2 = this.f1891c;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) jVar2.f1903d0.getLayoutManager();
                View M02 = linearLayoutManager.M0(0, linearLayoutManager.v(), false);
                int H2 = (M02 == null ? -1 : H.H(M02)) + 1;
                if (H2 < jVar2.f1903d0.getAdapter().a()) {
                    Calendar a3 = v.a(this.f1890b.f1948c.f1877a.f1934a);
                    a3.add(2, H2);
                    jVar2.L(new n(a3));
                    return;
                }
                return;
        }
    }
}
