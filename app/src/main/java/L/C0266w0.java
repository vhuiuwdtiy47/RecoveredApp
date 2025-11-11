package l;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: l.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0266w0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0180D0 f3175a;

    public C0266w0(C0180D0 c0180d0) {
        this.f3175a = c0180d0;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j2) {
        C0254q0 c0254q0;
        if (i == -1 || (c0254q0 = this.f3175a.f2940c) == null) {
            return;
        }
        c0254q0.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
