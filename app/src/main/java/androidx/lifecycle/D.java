package androidx.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;

/* loaded from: classes.dex */
public final class D extends AbstractC0085h {
    final /* synthetic */ E this$0;

    /* loaded from: classes.dex */
    public static final class a extends AbstractC0085h {
        final /* synthetic */ E this$0;

        public a(E e2) {
            this.this$0 = e2;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            q1.d.e(activity, "activity");
            E e2 = this.this$0;
            int i = e2.f1547b + 1;
            e2.f1547b = i;
            if (i == 1) {
                if (e2.f1548c) {
                    e2.f1550f.d(EnumC0091n.ON_RESUME);
                    e2.f1548c = false;
                } else {
                    Handler handler = e2.f1549e;
                    q1.d.b(handler);
                    handler.removeCallbacks(e2.f1551g);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            q1.d.e(activity, "activity");
            E e2 = this.this$0;
            int i = e2.f1546a + 1;
            e2.f1546a = i;
            if (i == 1 && e2.d) {
                e2.f1550f.d(EnumC0091n.ON_START);
                e2.d = false;
            }
        }
    }

    public D(E e2) {
        this.this$0 = e2;
    }

    @Override // androidx.lifecycle.AbstractC0085h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        q1.d.e(activity, "activity");
    }

    @Override // androidx.lifecycle.AbstractC0085h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        q1.d.e(activity, "activity");
        E e2 = this.this$0;
        int i = e2.f1547b - 1;
        e2.f1547b = i;
        if (i == 0) {
            Handler handler = e2.f1549e;
            q1.d.b(handler);
            handler.postDelayed(e2.f1551g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        q1.d.e(activity, "activity");
        activity.registerActivityLifecycleCallbacks(new a(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC0085h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        q1.d.e(activity, "activity");
        E e2 = this.this$0;
        int i = e2.f1546a - 1;
        e2.f1546a = i;
        if (i == 0 && e2.f1548c) {
            e2.f1550f.d(EnumC0091n.ON_STOP);
            e2.d = true;
        }
    }
}
