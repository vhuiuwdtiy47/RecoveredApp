package o;

import java.util.AbstractSet;
import java.util.Iterator;

/* renamed from: o.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0303a extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f3476a;

    public C0303a(f fVar) {
        this.f3476a = fVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new d(this.f3476a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f3476a.f3498c;
    }
}
