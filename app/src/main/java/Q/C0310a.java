package q;

import java.util.concurrent.CancellationException;

/* renamed from: q.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0310a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0310a f3514b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0310a f3515c;

    /* renamed from: a, reason: collision with root package name */
    public final CancellationException f3516a;

    static {
        if (g.d) {
            f3515c = null;
            f3514b = null;
        } else {
            f3515c = new C0310a(false, null);
            f3514b = new C0310a(true, null);
        }
    }

    public C0310a(boolean z2, CancellationException cancellationException) {
        this.f3516a = cancellationException;
    }
}
