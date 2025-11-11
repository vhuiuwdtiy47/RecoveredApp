package C;

import U.t;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import com.xiaomi.vlive.ui.controller.ControllerFragment;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f67a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f68b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f69c;

    public /* synthetic */ o(Object obj, int i, Object obj2) {
        this.f67a = i;
        this.f68b = obj;
        this.f69c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f67a) {
            case 0:
                ((b) this.f68b).h((Typeface) this.f69c);
                return;
            case 1:
                final ControllerFragment controllerFragment = (ControllerFragment) this.f68b;
                final boolean booleanValue = t.a0((String) this.f69c, 2).booleanValue();
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: f1.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        ControllerFragment controllerFragment2 = ControllerFragment.this;
                        controllerFragment2.getClass();
                        if (booleanValue) {
                            t.g("保存成功");
                        } else {
                            t.g("切换视频源失败");
                        }
                        controllerFragment2.f2135W.f2207r.c();
                        controllerFragment2.f2135W.f2207r.setEnabled(true);
                    }
                });
                return;
            default:
                Runnable runnable = (Runnable) this.f69c;
                g.n nVar = (g.n) this.f68b;
                nVar.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    nVar.a();
                }
        }
    }
}
