package j;

import L.Y;
import android.view.View;
import android.view.animation.BaseInterpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    public BaseInterpolator f2736c;
    public Z0.i d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2737e;

    /* renamed from: b, reason: collision with root package name */
    public long f2735b = -1;

    /* renamed from: f, reason: collision with root package name */
    public final i f2738f = new i(this);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2734a = new ArrayList();

    public final void a() {
        if (this.f2737e) {
            Iterator it = this.f2734a.iterator();
            while (it.hasNext()) {
                ((Y) it.next()).b();
            }
            this.f2737e = false;
        }
    }

    public final void b() {
        View view;
        if (this.f2737e) {
            return;
        }
        Iterator it = this.f2734a.iterator();
        while (it.hasNext()) {
            Y y2 = (Y) it.next();
            long j2 = this.f2735b;
            if (j2 >= 0) {
                y2.c(j2);
            }
            BaseInterpolator baseInterpolator = this.f2736c;
            if (baseInterpolator != null && (view = (View) y2.f316a.get()) != null) {
                view.animate().setInterpolator(baseInterpolator);
            }
            if (this.d != null) {
                y2.d(this.f2738f);
            }
            View view2 = (View) y2.f316a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f2737e = true;
    }
}
