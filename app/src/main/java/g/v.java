package g;

import a.C0073o;
import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class v {
    public static OnBackInvokedDispatcher a(Activity activity) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        return onBackInvokedDispatcher;
    }

    public static OnBackInvokedCallback b(Object obj, B b2) {
        Objects.requireNonNull(b2);
        C0073o c0073o = new C0073o(1, b2);
        M.e.e(obj).registerOnBackInvokedCallback(1000000, c0073o);
        return c0073o;
    }

    public static void c(Object obj, Object obj2) {
        M.e.e(obj).unregisterOnBackInvokedCallback(M.e.b(obj2));
    }
}
