package q;

import l.AbstractC0271z;

/* loaded from: classes.dex */
public final class e extends AbstractC0271z {
    @Override // l.AbstractC0271z
    public final boolean a(g gVar, C0312c c0312c) {
        C0312c c0312c2 = C0312c.f3517b;
        synchronized (gVar) {
            try {
                if (gVar.f3530b != c0312c) {
                    return false;
                }
                gVar.f3530b = c0312c2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // l.AbstractC0271z
    public final boolean b(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f3529a != obj) {
                    return false;
                }
                gVar.f3529a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // l.AbstractC0271z
    public final boolean c(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f3531c != fVar) {
                    return false;
                }
                gVar.f3531c = fVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // l.AbstractC0271z
    public final void r(f fVar, f fVar2) {
        fVar.f3525b = fVar2;
    }

    @Override // l.AbstractC0271z
    public final void v(f fVar, Thread thread) {
        fVar.f3524a = thread;
    }
}
