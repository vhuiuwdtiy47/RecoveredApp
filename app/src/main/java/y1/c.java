package y1;

import T0.e;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import q1.d;

/* loaded from: classes.dex */
public final class c extends z1.a implements a {
    public static final AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_state");
    private volatile Object _state;

    /* renamed from: c, reason: collision with root package name */
    public int f4224c;

    public c(Object obj) {
        this._state = obj;
    }

    public final Object a() {
        e eVar = z1.a.f4275b;
        Object obj = d.get(this);
        if (obj == eVar) {
            return null;
        }
        return obj;
    }

    public final void b(Object obj) {
        int i;
        if (obj == null) {
            obj = z1.a.f4275b;
        }
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
            if (d.a(atomicReferenceFieldUpdater.get(this), obj)) {
                return;
            }
            atomicReferenceFieldUpdater.set(this, obj);
            int i2 = this.f4224c;
            if ((i2 & 1) != 0) {
                this.f4224c = i2 + 2;
                return;
            }
            int i3 = i2 + 1;
            this.f4224c = i3;
            while (true) {
                synchronized (this) {
                    i = this.f4224c;
                    if (i == i3) {
                        this.f4224c = i3 + 1;
                        return;
                    }
                }
                i3 = i;
            }
        }
    }
}
