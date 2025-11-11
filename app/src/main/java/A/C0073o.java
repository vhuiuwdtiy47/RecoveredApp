package a;

import android.window.OnBackInvokedCallback;
import g.B;

/* renamed from: a.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0073o implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1291a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1292b;

    public /* synthetic */ C0073o(int i, Object obj) {
        this.f1291a = i;
        this.f1292b = obj;
    }

    public final void onBackInvoked() {
        int i = this.f1291a;
        Object obj = this.f1292b;
        switch (i) {
            case 0:
                ((p1.a) obj).a();
                return;
            case 1:
                ((B) obj).C();
                return;
            default:
                ((Runnable) obj).run();
                return;
        }
    }
}
