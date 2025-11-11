package C;

import U.t;
import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.xiaomi.vlive.ui.controller.ControllerFragment;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f70a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f71b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f72c;

    public /* synthetic */ p(Object obj, int i, int i2) {
        this.f70a = i2;
        this.f72c = obj;
        this.f71b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f70a) {
            case 0:
                ((b) this.f72c).g(this.f71b);
                return;
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f72c;
                View view = (View) sideSheetBehavior.f1982p.get();
                if (view != null) {
                    sideSheetBehavior.t(view, this.f71b, false);
                    return;
                }
                return;
            default:
                ControllerFragment controllerFragment = (ControllerFragment) this.f72c;
                if (this.f71b == 0) {
                    controllerFragment.getClass();
                    t.g("替换失败");
                }
                controllerFragment.f2135W.f2211v.c();
                controllerFragment.f2135W.f2211v.setEnabled(true);
                return;
        }
    }
}
