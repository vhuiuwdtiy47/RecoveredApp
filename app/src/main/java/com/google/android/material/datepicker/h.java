package com.google.android.material.datepicker;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import n0.E;

/* loaded from: classes.dex */
public final class h extends E {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f1894a;

    public h(j jVar) {
        this.f1894a = jVar;
        v.c(null);
        v.c(null);
    }

    @Override // n0.E
    public final void a(RecyclerView recyclerView) {
        if ((recyclerView.getAdapter() instanceof x) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            this.f1894a.getClass();
            throw null;
        }
    }
}
