package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import k.InterfaceC0164A;
import k.m;

/* loaded from: classes.dex */
public class NavigationMenuView extends RecyclerView implements InterfaceC0164A {
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setLayoutManager(new LinearLayoutManager(1));
    }

    @Override // k.InterfaceC0164A
    public final void c(m mVar) {
    }

    public int getWindowAnimations() {
        return 0;
    }
}
