package U;

import Y.C0039f;
import Y.C0044k;
import Y.d0;
import android.view.View;
import java.util.ArrayList;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f768a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f769b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f770c;
    public final /* synthetic */ Object d;

    public /* synthetic */ k(Object obj, Object obj2, Object obj3, int i) {
        this.f768a = i;
        this.f769b = obj;
        this.f770c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f768a) {
            case 0:
                m mVar = (m) this.f769b;
                Z0.i iVar = (Z0.i) this.f770c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.d;
                mVar.getClass();
                try {
                    s p2 = Z0.i.p(mVar.f773a);
                    if (p2 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    r rVar = (r) ((h) p2.f756b);
                    synchronized (rVar.d) {
                        rVar.f783f = threadPoolExecutor;
                    }
                    ((h) p2.f756b).a(new l(iVar, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    iVar.Q(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 1:
                ArrayList arrayList = (ArrayList) this.f769b;
                d0 d0Var = (d0) this.f770c;
                q1.d.e((C0044k) this.d, "this$0");
                if (arrayList.contains(d0Var)) {
                    arrayList.remove(d0Var);
                    View view = d0Var.f1103c.f1167F;
                    int i = d0Var.f1101a;
                    q1.d.d(view, "view");
                    D.f.a(view, i);
                    return;
                }
                return;
            default:
                C0044k c0044k = (C0044k) this.f769b;
                q1.d.e(c0044k, "this$0");
                C0039f c0039f = (C0039f) this.d;
                q1.d.e(c0039f, "$animationInfo");
                c0044k.f1122a.endViewTransition((View) this.f770c);
                c0039f.d();
                return;
        }
    }
}
