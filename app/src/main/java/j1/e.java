package j1;

import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class e extends f implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final f f2744a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2745b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2746c;

    public e(f fVar, int i, int i2) {
        this.f2744a = fVar;
        this.f2745b = i;
        U.t.m(i, i2, fVar.a());
        this.f2746c = i2 - i;
    }

    @Override // j1.b
    public final int a() {
        return this.f2746c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f2746c;
        if (i >= 0 && i < i2) {
            return this.f2744a.get(this.f2745b + i);
        }
        throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
    }
}
