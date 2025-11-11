package j1;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class q implements w1.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2752a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2753b;

    public /* synthetic */ q(int i, Object obj) {
        this.f2752a = i;
        this.f2753b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Iterator, java.lang.Object] */
    private final Iterator a() {
        return this.f2753b;
    }

    @Override // w1.e
    public final Iterator iterator() {
        switch (this.f2752a) {
            case 0:
                return ((Iterable) this.f2753b).iterator();
            case 1:
                return new w1.c(this);
            default:
                return a();
        }
    }
}
