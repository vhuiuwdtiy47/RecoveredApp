package L;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public final class P implements OnReceiveContentListener {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0022s f310a;

    public P(InterfaceC0022s interfaceC0022s) {
        this.f310a = interfaceC0022s;
    }

    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        C0010f c0010f = new C0010f(new A0.c(contentInfo));
        C0010f a2 = ((R.p) this.f310a).a(view, c0010f);
        if (a2 == null) {
            return null;
        }
        if (a2 == c0010f) {
            return contentInfo;
        }
        ContentInfo t2 = a2.f338a.t();
        Objects.requireNonNull(t2);
        return D0.a.g(t2);
    }
}
