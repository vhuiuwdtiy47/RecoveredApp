package Y;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: b, reason: collision with root package name */
    public static final o.j f979b = new o.j(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ S f980a;

    public K(S s2) {
        this.f980a = s2;
    }

    public static Class b(ClassLoader classLoader, String str) {
        o.j jVar = f979b;
        o.j jVar2 = (o.j) jVar.get(classLoader);
        if (jVar2 == null) {
            jVar2 = new o.j(0);
            jVar.put(classLoader, jVar2);
        }
        Class cls = (Class) jVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        jVar2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e2) {
            throw new RuntimeException(D.f.d("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e2);
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException(D.f.d("Unable to instantiate fragment ", str, ": make sure class name exists"), e3);
        }
    }

    public final AbstractComponentCallbacksC0056x a(String str) {
        try {
            return (AbstractComponentCallbacksC0056x) c(this.f980a.f1021u.f959f.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(D.f.d("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException(D.f.d("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException(D.f.d("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e4);
        } catch (InvocationTargetException e5) {
            throw new RuntimeException(D.f.d("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e5);
        }
    }
}
