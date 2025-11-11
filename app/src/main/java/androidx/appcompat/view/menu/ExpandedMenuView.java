package androidx.appcompat.view.menu;

import L.C0016l;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import k.InterfaceC0164A;
import k.l;
import k.m;
import k.o;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements l, InterfaceC0164A, AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f1328b = {R.attr.background, R.attr.divider};

    /* renamed from: a, reason: collision with root package name */
    public m f1329a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0016l s2 = C0016l.s(context, attributeSet, f1328b, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) s2.f362c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(s2.h(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(s2.h(1));
        }
        s2.u();
    }

    @Override // k.l
    public final boolean b(o oVar) {
        return this.f1329a.q(oVar, null, 0);
    }

    @Override // k.InterfaceC0164A
    public final void c(m mVar) {
        this.f1329a = mVar;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        b((o) getAdapter().getItem(i));
    }
}
