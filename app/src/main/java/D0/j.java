package D0;

import L.S;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import y.AbstractC0376a;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f118a;

    /* renamed from: b, reason: collision with root package name */
    public int f119b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f120c;
    public final Runnable d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC0376a f121e;

    public j(SideSheetBehavior sideSheetBehavior) {
        this.f118a = 1;
        this.f121e = sideSheetBehavior;
        this.d = new F0.b(3, this);
    }

    public final void a(int i) {
        Runnable runnable = this.d;
        AbstractC0376a abstractC0376a = this.f121e;
        switch (this.f118a) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) abstractC0376a;
                WeakReference weakReference = bottomSheetBehavior.f1799U;
                if (weakReference == null || weakReference.get() == null) {
                    return;
                }
                this.f119b = i;
                if (this.f120c) {
                    return;
                }
                WeakHashMap weakHashMap = S.f311a;
                ((View) bottomSheetBehavior.f1799U.get()).postOnAnimation((i) runnable);
                this.f120c = true;
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) abstractC0376a;
                WeakReference weakReference2 = sideSheetBehavior.f1982p;
                if (weakReference2 == null || weakReference2.get() == null) {
                    return;
                }
                this.f119b = i;
                if (this.f120c) {
                    return;
                }
                WeakHashMap weakHashMap2 = S.f311a;
                ((View) sideSheetBehavior.f1982p.get()).postOnAnimation((F0.b) runnable);
                this.f120c = true;
                return;
        }
    }

    public j(BottomSheetBehavior bottomSheetBehavior) {
        this.f118a = 0;
        this.f121e = bottomSheetBehavior;
        this.d = new i(0, this);
    }
}
