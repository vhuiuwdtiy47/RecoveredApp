package O0;

import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import g.C0142e;
import j.AbstractC0156a;
import k.o;
import l.C0217W0;

/* loaded from: classes.dex */
public final class e implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f538a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f539b;

    public /* synthetic */ e(int i, Object obj) {
        this.f538a = i;
        this.f539b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f538a) {
            case 0:
                o itemData = ((c) view).getItemData();
                C0.b bVar = (C0.b) this.f539b;
                if (bVar.f545E.q(itemData, bVar.f544D, 0)) {
                    return;
                }
                itemData.setChecked(true);
                return;
            case 1:
                com.google.android.material.datepicker.j jVar = (com.google.android.material.datepicker.j) this.f539b;
                int i = jVar.f1901a0;
                if (i == 2) {
                    jVar.M(1);
                    return;
                } else {
                    if (i == 1) {
                        jVar.M(2);
                        return;
                    }
                    return;
                }
            case 2:
                C0142e c0142e = (C0142e) this.f539b;
                Button button = c0142e.f2514f;
                c0142e.f2528v.obtainMessage(1, c0142e.f2511b).sendToTarget();
                return;
            case 3:
                ((AbstractC0156a) this.f539b).a();
                return;
            default:
                C0217W0 c0217w0 = ((Toolbar) this.f539b).f1429L;
                o oVar = c0217w0 == null ? null : c0217w0.f3028b;
                if (oVar != null) {
                    oVar.collapseActionView();
                    return;
                }
                return;
        }
    }
}
