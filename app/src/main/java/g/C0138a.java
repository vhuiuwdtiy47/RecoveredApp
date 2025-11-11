package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: g.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0138a implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0142e f2500a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0139b f2501b;

    public C0138a(C0139b c0139b, C0142e c0142e) {
        this.f2501b = c0139b;
        this.f2500a = c0142e;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        C0139b c0139b = this.f2501b;
        DialogInterface.OnClickListener onClickListener = c0139b.h;
        C0142e c0142e = this.f2500a;
        onClickListener.onClick(c0142e.f2511b, i);
        if (c0139b.i) {
            return;
        }
        c0142e.f2511b.dismiss();
    }
}
