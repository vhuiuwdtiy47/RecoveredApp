package q0;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.android.music.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import l.AbstractC0271z;

/* renamed from: q0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0313a {
    public static volatile C0313a d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f3532e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f3535c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f3534b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3533a = new HashMap();

    public C0313a(Context context) {
        this.f3535c = context.getApplicationContext();
    }

    public static C0313a c(Context context) {
        if (d == null) {
            synchronized (f3532e) {
                try {
                    if (d == null) {
                        d = new C0313a(context);
                    }
                } finally {
                }
            }
        }
        return d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f3535c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f3534b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (InterfaceC0314b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object obj;
        if (AbstractC0271z.n()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } finally {
                Trace.endSection();
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        HashMap hashMap = this.f3533a;
        if (hashMap.containsKey(cls)) {
            obj = hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                InterfaceC0314b interfaceC0314b = (InterfaceC0314b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class> a2 = interfaceC0314b.a();
                if (!a2.isEmpty()) {
                    for (Class cls2 : a2) {
                        if (!hashMap.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                obj = interfaceC0314b.b(this.f3535c);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
        return obj;
    }
}
