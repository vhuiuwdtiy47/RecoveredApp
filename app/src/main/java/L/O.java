package L;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class O {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static C0010f b(View view, C0010f c0010f) {
        ContentInfo t2 = c0010f.f338a.t();
        Objects.requireNonNull(t2);
        ContentInfo g2 = D0.a.g(t2);
        ContentInfo performReceiveContent = view.performReceiveContent(g2);
        if (performReceiveContent == null) {
            return null;
        }
        return performReceiveContent == g2 ? c0010f : new C0010f(new A0.c(performReceiveContent));
    }

    public static void c(View view, String[] strArr, InterfaceC0022s interfaceC0022s) {
        if (interfaceC0022s == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new P(interfaceC0022s));
        }
    }
}
