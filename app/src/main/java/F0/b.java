package F0;

import C.p;
import D.h;
import D0.j;
import I.i;
import U.r;
import U.t;
import U.v;
import W0.k;
import Y.AbstractComponentCallbacksC0056x;
import a.DialogC0069k;
import a.ExecutorC0067i;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.os.Trace;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.C0098v;
import androidx.lifecycle.E;
import androidx.lifecycle.EnumC0091n;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import com.tencent.wechat.Platform;
import com.xiaomi.vlive.App;
import com.xiaomi.vlive.ui.controller.ControllerFragment;
import g.AbstractActivityC0146i;
import java.nio.MappedByteBuffer;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f147a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f148b;

    public /* synthetic */ b(int i, Object obj) {
        this.f147a = i;
        this.f148b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f147a) {
            case 0:
                ((CarouselLayoutManager) this.f148b).l0();
                return;
            case 1:
                View view = (View) this.f148b;
                ((InputMethodManager) B.b.b(view.getContext(), InputMethodManager.class)).showSoftInput(view, 1);
                return;
            case 2:
                r rVar = (r) this.f148b;
                synchronized (rVar.d) {
                    try {
                        if (rVar.h == null) {
                            return;
                        }
                        try {
                            i c2 = rVar.c();
                            int i = c2.f276e;
                            if (i == 2) {
                                synchronized (rVar.d) {
                                }
                            }
                            if (i != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i + ")");
                            }
                            try {
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                Z0.f fVar = rVar.f781c;
                                Context context = rVar.f779a;
                                fVar.getClass();
                                Typeface a2 = h.a(context, new i[]{c2}, 0);
                                MappedByteBuffer P2 = Z0.i.P(rVar.f779a, c2.f273a);
                                if (P2 == null || a2 == null) {
                                    throw new RuntimeException("Unable to open file.");
                                }
                                try {
                                    Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                    v vVar = new v(a2, t.U(P2));
                                    Trace.endSection();
                                    synchronized (rVar.d) {
                                        try {
                                            Z0.i iVar = rVar.h;
                                            if (iVar != null) {
                                                iVar.T(vVar);
                                            }
                                        } finally {
                                        }
                                    }
                                    rVar.b();
                                    return;
                                } finally {
                                    Trace.endSection();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        } catch (Throwable th2) {
                            synchronized (rVar.d) {
                                try {
                                    Z0.i iVar2 = rVar.h;
                                    if (iVar2 != null) {
                                        iVar2.Q(th2);
                                    }
                                    rVar.b();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case 3:
                j jVar = (j) this.f148b;
                jVar.f120c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) jVar.f121e;
                T.e eVar = sideSheetBehavior.i;
                if (eVar != null && eVar.f()) {
                    jVar.a(jVar.f119b);
                    return;
                } else {
                    if (sideSheetBehavior.h == 2) {
                        sideSheetBehavior.r(jVar.f119b);
                        return;
                    }
                    return;
                }
            case Platform.INFO /* 4 */:
                ((W0.e) this.f148b).t(true);
                return;
            case Platform.WARN /* 5 */:
                k kVar = (k) this.f148b;
                boolean isPopupShowing = kVar.h.isPopupShowing();
                kVar.t(isPopupShowing);
                kVar.f865m = isPopupShowing;
                return;
            case 6:
                ((TextInputLayout) this.f148b).d.requestLayout();
                return;
            case 7:
                AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x = (AbstractComponentCallbacksC0056x) this.f148b;
                abstractComponentCallbacksC0056x.f1175O.f1080e.F(abstractComponentCallbacksC0056x.d);
                abstractComponentCallbacksC0056x.d = null;
                return;
            case 8:
                ((Z0.d) this.f148b).f1227b.b();
                return;
            case 9:
                ((AbstractActivityC0146i) this.f148b).invalidateOptionsMenu();
                return;
            case 10:
                ExecutorC0067i executorC0067i = (ExecutorC0067i) this.f148b;
                Runnable runnable = executorC0067i.f1265b;
                if (runnable != null) {
                    runnable.run();
                    executorC0067i.f1265b = null;
                    return;
                }
                return;
            case 11:
                DialogC0069k.a((DialogC0069k) this.f148b);
                return;
            case 12:
                E e2 = (E) this.f148b;
                int i2 = e2.f1547b;
                C0098v c0098v = e2.f1550f;
                if (i2 == 0) {
                    e2.f1548c = true;
                    c0098v.d(EnumC0091n.ON_PAUSE);
                }
                if (e2.f1546a == 0 && e2.f1548c) {
                    c0098v.d(EnumC0091n.ON_STOP);
                    e2.d = true;
                    return;
                }
                return;
            case 13:
                ((com.google.android.material.timepicker.e) this.f148b).m();
                return;
            default:
                ControllerFragment controllerFragment = (ControllerFragment) this.f148b;
                int i3 = 0;
                try {
                    d1.h E2 = t.E();
                    App app = App.f2119k;
                    i3 = ((d1.f) E2).j(app.f2121a.getInt("PlayFileType", 1) == 1 ? app.f2121a.getString("PlayFileMp4", "") : app.f2121a.getString("PlayRtmpUrl", "rtmp://ns8.indexforce.com/home/mystream"), App.f2119k.f2121a.getBoolean("PlayAutoRotate", false), App.f2119k.c());
                } catch (RemoteException | Exception unused) {
                }
                new Handler(Looper.getMainLooper()).post(new p(controllerFragment, i3, 2));
                return;
        }
    }
}
