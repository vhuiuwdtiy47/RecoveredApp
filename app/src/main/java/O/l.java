package o;

import j1.v;

/* loaded from: classes.dex */
public final class l extends v {

    /* renamed from: a, reason: collision with root package name */
    public int f3502a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f3503b;

    public l(k kVar) {
        this.f3503b = kVar;
    }

    @Override // j1.v
    public final int a() {
        int i = this.f3502a;
        this.f3502a = i + 1;
        return this.f3503b.c(i);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3502a < this.f3503b.e();
    }
}
