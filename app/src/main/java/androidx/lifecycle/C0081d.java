package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0081d {

    /* renamed from: c, reason: collision with root package name */
    public static final C0081d f1580c = new C0081d();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1581a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1582b = new HashMap();

    public static void b(HashMap hashMap, C0080c c0080c, EnumC0091n enumC0091n, Class cls) {
        EnumC0091n enumC0091n2 = (EnumC0091n) hashMap.get(c0080c);
        if (enumC0091n2 == null || enumC0091n == enumC0091n2) {
            if (enumC0091n2 == null) {
                hashMap.put(c0080c, enumC0091n);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0080c.f1579b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0091n2 + ", new value " + enumC0091n);
    }

    public final C0079b a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.f1581a;
        if (superclass != null) {
            C0079b c0079b = (C0079b) hashMap2.get(superclass);
            if (c0079b == null) {
                c0079b = a(superclass, null);
            }
            hashMap.putAll(c0079b.f1577b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0079b c0079b2 = (C0079b) hashMap2.get(cls2);
            if (c0079b2 == null) {
                c0079b2 = a(cls2, null);
            }
            for (Map.Entry entry : c0079b2.f1577b.entrySet()) {
                b(hashMap, (C0080c) entry.getKey(), (EnumC0091n) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e2) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
            }
        }
        boolean z2 = false;
        for (Method method : methodArr) {
            C c2 = (C) method.getAnnotation(C.class);
            if (c2 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!InterfaceC0096t.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                EnumC0091n value = c2.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC0091n.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != EnumC0091n.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(hashMap, new C0080c(i, method), value, cls);
                z2 = true;
            }
        }
        C0079b c0079b3 = new C0079b(hashMap);
        hashMap2.put(cls, c0079b3);
        this.f1582b.put(cls, Boolean.valueOf(z2));
        return c0079b3;
    }
}
