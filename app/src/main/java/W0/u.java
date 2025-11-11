package W0;

import android.view.View;
import android.widget.AdapterView;
import l.C0180D0;
import l.C0203P;
import l.C0210T;

/* loaded from: classes.dex */
public final class u implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f930a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f931b;

    public /* synthetic */ u(int i, Object obj) {
        this.f930a = i;
        this.f931b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        Object item;
        switch (this.f930a) {
            case 0:
                w wVar = (w) this.f931b;
                if (i < 0) {
                    C0180D0 c0180d0 = wVar.f935e;
                    item = !c0180d0.f2960z.isShowing() ? null : c0180d0.f2940c.getSelectedItem();
                } else {
                    item = wVar.getAdapter().getItem(i);
                }
                w.a(wVar, item);
                AdapterView.OnItemClickListener onItemClickListener = wVar.getOnItemClickListener();
                C0180D0 c0180d02 = wVar.f935e;
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = c0180d02.f2960z.isShowing() ? c0180d02.f2940c.getSelectedView() : null;
                        i = !c0180d02.f2960z.isShowing() ? -1 : c0180d02.f2940c.getSelectedItemPosition();
                        j2 = !c0180d02.f2960z.isShowing() ? Long.MIN_VALUE : c0180d02.f2940c.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(c0180d02.f2940c, view, i, j2);
                }
                c0180d02.dismiss();
                return;
            default:
                C0203P c0203p = (C0203P) this.f931b;
                c0203p.f3003E.setSelection(i);
                C0210T c0210t = c0203p.f3003E;
                if (c0210t.getOnItemClickListener() != null) {
                    c0210t.performItemClick(view, i, c0203p.f3000B.getItemId(i));
                }
                c0203p.dismiss();
                return;
        }
    }
}
