package Z0;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Toast;

/* loaded from: classes.dex */
public final class e {
    public static final Handler h = new Handler(Looper.getMainLooper());

    /* renamed from: a, reason: collision with root package name */
    public final b f1228a;

    /* renamed from: b, reason: collision with root package name */
    public j f1229b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1230c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1231e;

    /* renamed from: f, reason: collision with root package name */
    public final d f1232f = new d(this, 0);

    /* renamed from: g, reason: collision with root package name */
    public final d f1233g = new d(this, 1);

    public e(ContextWrapper contextWrapper, b bVar) {
        this.f1228a = bVar;
        this.f1230c = contextWrapper.getPackageName();
    }

    public static void a(e eVar, View view) {
        AccessibilityEvent obtain;
        eVar.getClass();
        Context context = view.getContext();
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            if (Build.VERSION.SDK_INT >= 30) {
                obtain = M.c.a();
                obtain.setEventType(64);
            } else {
                obtain = AccessibilityEvent.obtain(64);
            }
            obtain.setClassName(Toast.class.getName());
            obtain.setPackageName(context.getPackageName());
            view.dispatchPopulateAccessibilityEvent(obtain);
            accessibilityManager.sendAccessibilityEvent(obtain);
        }
    }

    public final void b() {
        if (this.d) {
            Handler handler = h;
            handler.removeCallbacks(this.f1232f);
            boolean z2 = Looper.myLooper() == Looper.getMainLooper();
            d dVar = this.f1233g;
            if (z2) {
                dVar.run();
            } else {
                handler.removeCallbacks(dVar);
                handler.post(dVar);
            }
        }
    }
}
