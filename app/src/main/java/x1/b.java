package x1;

import L.C0016l;
import j1.q;
import java.util.Iterator;
import java.util.regex.Matcher;
import l.AbstractC0271z;

/* loaded from: classes.dex */
public final class b extends j1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0016l f4200a;

    public b(C0016l c0016l) {
        this.f4200a = c0016l;
    }

    @Override // j1.b
    public final int a() {
        return ((Matcher) this.f4200a.f361b).groupCount() + 1;
    }

    public final a b(int i) {
        C0016l c0016l = this.f4200a;
        Matcher matcher = (Matcher) c0016l.f361b;
        u1.c w2 = AbstractC0271z.w(matcher.start(i), matcher.end(i));
        if (w2.f3939a < 0) {
            return null;
        }
        String group = ((Matcher) c0016l.f361b).group(i);
        q1.d.d(group, "group(...)");
        return new a(group, w2);
    }

    @Override // j1.b, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof a) {
            return super.contains((a) obj);
        }
        return false;
    }

    @Override // j1.b, java.util.Collection
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new w1.i(new w1.h(new q(0, new u1.a(0, a() - 1, 1)), new j1.a(this, 1), 1));
    }
}
