package w1;

import java.util.Iterator;
import p1.l;

/* loaded from: classes.dex */
public final class h implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4182a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4183b;

    /* renamed from: c, reason: collision with root package name */
    public final l f4184c;

    public /* synthetic */ h(Object obj, l lVar, int i) {
        this.f4182a = i;
        this.f4183b = obj;
        this.f4184c = lVar;
    }

    @Override // w1.e
    public final Iterator iterator() {
        switch (this.f4182a) {
            case 0:
                return new c(this);
            case 1:
                return new i(this);
            default:
                return new d(this);
        }
    }
}
