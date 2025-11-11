package L;

import android.view.View;
import com.android.music.R;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class L {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View$OnUnhandledKeyEventListener, java.lang.Object] */
    public static void a(View view, Q q2) {
        o.j jVar = (o.j) view.getTag(R.id.tag_unhandled_key_listeners);
        o.j jVar2 = jVar;
        if (jVar == null) {
            o.j jVar3 = new o.j(0);
            view.setTag(R.id.tag_unhandled_key_listeners, jVar3);
            jVar2 = jVar3;
        }
        Objects.requireNonNull(q2);
        ?? obj = new Object();
        jVar2.put(q2, obj);
        view.addOnUnhandledKeyEventListener(obj);
    }

    public static CharSequence b(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean c(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean d(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void e(View view, Q q2) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        o.j jVar = (o.j) view.getTag(R.id.tag_unhandled_key_listeners);
        if (jVar == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) jVar.get(q2)) == null) {
            return;
        }
        view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    public static <T> T f(View view, int i) {
        return (T) view.requireViewById(i);
    }

    public static void g(View view, boolean z2) {
        view.setAccessibilityHeading(z2);
    }

    public static void h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void i(View view, O.a aVar) {
        view.setAutofillId(null);
    }

    public static void j(View view, boolean z2) {
        view.setScreenReaderFocusable(z2);
    }
}
