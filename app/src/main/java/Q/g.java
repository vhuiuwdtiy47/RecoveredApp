package q;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import l.AbstractC0271z;

/* loaded from: classes.dex */
public abstract class g implements Future {
    public static final boolean d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f3526e = Logger.getLogger(g.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC0271z f3527f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f3528g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f3529a;

    /* renamed from: b, reason: collision with root package name */
    public volatile C0312c f3530b;

    /* renamed from: c, reason: collision with root package name */
    public volatile f f3531c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [l.z] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    static {
        ?? r5;
        try {
            th = null;
            r5 = new d(AtomicReferenceFieldUpdater.newUpdater(f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(f.class, f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, f.class, "c"), AtomicReferenceFieldUpdater.newUpdater(g.class, C0312c.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "a"));
        } catch (Throwable th) {
            th = th;
            r5 = new Object();
        }
        f3527f = r5;
        if (th != null) {
            f3526e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f3528g = new Object();
    }

    public static void b(g gVar) {
        f fVar;
        C0312c c0312c;
        do {
            fVar = gVar.f3531c;
        } while (!f3527f.c(gVar, fVar, f.f3523c));
        while (fVar != null) {
            Thread thread = fVar.f3524a;
            if (thread != null) {
                fVar.f3524a = null;
                LockSupport.unpark(thread);
            }
            fVar = fVar.f3525b;
        }
        do {
            c0312c = gVar.f3530b;
        } while (!f3527f.a(gVar, c0312c));
        C0312c c0312c2 = null;
        while (c0312c != null) {
            C0312c c0312c3 = c0312c.f3518a;
            c0312c.f3518a = c0312c2;
            c0312c2 = c0312c;
            c0312c = c0312c3;
        }
        while (c0312c2 != null) {
            c0312c2 = c0312c2.f3518a;
            try {
                throw null;
                break;
            } catch (RuntimeException e2) {
                f3526e.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e2);
            }
        }
    }

    public static Object c(Object obj) {
        if (obj instanceof C0310a) {
            CancellationException cancellationException = ((C0310a) obj).f3516a;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof AbstractC0311b) {
            ((AbstractC0311b) obj).getClass();
            throw new ExecutionException((Throwable) null);
        }
        if (obj == f3528g) {
            return null;
        }
        return obj;
    }

    public static Object d(g gVar) {
        Object obj;
        boolean z2 = false;
        while (true) {
            try {
                obj = gVar.get();
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        try {
            Object d2 = d(this);
            sb.append("SUCCESS, result=[");
            sb.append(d2 == this ? "this future" : String.valueOf(d2));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        Object obj = this.f3529a;
        if (obj != null) {
            return false;
        }
        if (!f3527f.b(this, obj, d ? new C0310a(z2, new CancellationException("Future.cancel() was called.")) : z2 ? C0310a.f3514b : C0310a.f3515c)) {
            return false;
        }
        b(this);
        return true;
    }

    public final void e(f fVar) {
        fVar.f3524a = null;
        while (true) {
            f fVar2 = this.f3531c;
            if (fVar2 == f.f3523c) {
                return;
            }
            f fVar3 = null;
            while (fVar2 != null) {
                f fVar4 = fVar2.f3525b;
                if (fVar2.f3524a != null) {
                    fVar3 = fVar2;
                } else if (fVar3 != null) {
                    fVar3.f3525b = fVar4;
                    if (fVar3.f3524a == null) {
                        break;
                    }
                } else if (!f3527f.c(this, fVar2, fVar4)) {
                    break;
                }
                fVar2 = fVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.f3529a;
            if (obj != null) {
                return c(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                f fVar = this.f3531c;
                f fVar2 = f.f3523c;
                if (fVar != fVar2) {
                    f fVar3 = new f();
                    do {
                        AbstractC0271z abstractC0271z = f3527f;
                        abstractC0271z.r(fVar3, fVar);
                        if (abstractC0271z.c(this, fVar, fVar3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f3529a;
                                    if (obj2 != null) {
                                        return c(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    e(fVar3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            e(fVar3);
                        } else {
                            fVar = this.f3531c;
                        }
                    } while (fVar != fVar2);
                }
                return c(this.f3529a);
            }
            while (nanos > 0) {
                Object obj3 = this.f3529a;
                if (obj3 != null) {
                    return c(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String gVar = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String c2 = D.f.c(str, " (plus ");
                long j3 = -nanos;
                long convert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit.toNanos(convert);
                boolean z2 = convert == 0 || nanos2 > 1000;
                if (convert > 0) {
                    String str2 = c2 + convert + " " + lowerCase;
                    if (z2) {
                        str2 = D.f.c(str2, ",");
                    }
                    c2 = D.f.c(str2, " ");
                }
                if (z2) {
                    c2 = c2 + nanos2 + " nanoseconds ";
                }
                str = D.f.c(c2, "delay)");
            }
            if (isDone()) {
                throw new TimeoutException(D.f.c(str, " but future completed as timeout expired"));
            }
            throw new TimeoutException(str + " for " + gVar);
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f3529a instanceof C0310a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f3529a != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f3529a instanceof C0310a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e2) {
                str = "Exception thrown from implementation: " + e2.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f3529a;
            if (obj2 != null) {
                return c(obj2);
            }
            f fVar = this.f3531c;
            f fVar2 = f.f3523c;
            if (fVar != fVar2) {
                f fVar3 = new f();
                do {
                    AbstractC0271z abstractC0271z = f3527f;
                    abstractC0271z.r(fVar3, fVar);
                    if (abstractC0271z.c(this, fVar, fVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f3529a;
                            } else {
                                e(fVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return c(obj);
                    }
                    fVar = this.f3531c;
                } while (fVar != fVar2);
            }
            return c(this.f3529a);
        }
        throw new InterruptedException();
    }
}
