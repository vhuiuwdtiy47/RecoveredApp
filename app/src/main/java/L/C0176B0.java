package l;

import android.os.Handler;
import android.widget.AbsListView;

/* renamed from: l.B0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0176B0 implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0180D0 f2933a;

    public C0176B0(C0180D0 c0180d0) {
        this.f2933a = c0180d0;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1) {
            C0180D0 c0180d0 = this.f2933a;
            if (c0180d0.f2960z.getInputMethodMode() == 2 || c0180d0.f2960z.getContentView() == null) {
                return;
            }
            Handler handler = c0180d0.f2956v;
            RunnableC0272z0 runnableC0272z0 = c0180d0.f2952r;
            handler.removeCallbacks(runnableC0272z0);
            runnableC0272z0.run();
        }
    }
}
