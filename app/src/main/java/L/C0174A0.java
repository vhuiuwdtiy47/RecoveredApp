package l;

import android.database.DataSetObserver;

/* renamed from: l.A0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0174A0 extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0180D0 f2929a;

    public C0174A0(C0180D0 c0180d0) {
        this.f2929a = c0180d0;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        C0180D0 c0180d0 = this.f2929a;
        if (c0180d0.f2960z.isShowing()) {
            c0180d0.show();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f2929a.dismiss();
    }
}
