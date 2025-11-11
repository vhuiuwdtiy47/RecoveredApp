package androidx.lifecycle;

import l.AbstractC0271z;

/* loaded from: classes.dex */
public interface T {
    default Q e(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default Q m(q1.b bVar, c0.e eVar) {
        return r(AbstractC0271z.k(bVar), eVar);
    }

    default Q r(Class cls, c0.e eVar) {
        return e(cls);
    }
}
