package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.NoSuchElementException;

/* renamed from: androidx.lifecycle.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0099w {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f1604a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f1605b = new HashMap();

    public static void a(Constructor constructor, InterfaceC0095s interfaceC0095s) {
        try {
            q1.d.b(constructor.newInstance(interfaceC0095s));
            throw new ClassCastException();
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    public static int b(Class cls) {
        Constructor<?> constructor;
        boolean z2;
        HashMap hashMap = f1604a;
        Integer num = (Integer) hashMap.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r3 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r3 != null ? r3.getName() : "";
                q1.d.b(name);
                if (name.length() != 0) {
                    q1.d.b(canonicalName);
                    canonicalName = canonicalName.substring(name.length() + 1);
                    q1.d.d(canonicalName, "substring(...)");
                }
                q1.d.b(canonicalName);
                String concat = x1.k.A(canonicalName, ".", "_").concat("_LifecycleAdapter");
                if (name.length() != 0) {
                    concat = name + '.' + concat;
                }
                constructor = Class.forName(concat).getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e2) {
                throw new RuntimeException(e2);
            }
            HashMap hashMap2 = f1605b;
            if (constructor != null) {
                hashMap2.put(cls, U.t.M(constructor));
            } else {
                C0081d c0081d = C0081d.f1580c;
                HashMap hashMap3 = c0081d.f1582b;
                Boolean bool = (Boolean) hashMap3.get(cls);
                if (bool != null) {
                    z2 = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                hashMap3.put(cls, Boolean.FALSE);
                                z2 = false;
                                break;
                            }
                            if (((C) declaredMethods[i2].getAnnotation(C.class)) != null) {
                                c0081d.a(cls, declaredMethods);
                                z2 = true;
                                break;
                            }
                            i2++;
                        }
                    } catch (NoClassDefFoundError e3) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e3);
                    }
                }
                if (!z2) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && InterfaceC0095s.class.isAssignableFrom(superclass)) {
                        q1.d.b(superclass);
                        if (b(superclass) != 1) {
                            Object obj = hashMap2.get(superclass);
                            q1.d.b(obj);
                            arrayList = new ArrayList((Collection) obj);
                        }
                    }
                    Class<?>[] interfaces = cls.getInterfaces();
                    q1.d.e(interfaces, "array");
                    int i3 = 0;
                    while (true) {
                        if (i3 < interfaces.length) {
                            int i4 = i3 + 1;
                            try {
                                Class<?> cls2 = interfaces[i3];
                                if (cls2 != null && InterfaceC0095s.class.isAssignableFrom(cls2)) {
                                    q1.d.b(cls2);
                                    if (b(cls2) == 1) {
                                        break;
                                    }
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    Object obj2 = hashMap2.get(cls2);
                                    q1.d.b(obj2);
                                    arrayList.addAll((Collection) obj2);
                                }
                                i3 = i4;
                            } catch (ArrayIndexOutOfBoundsException e4) {
                                throw new NoSuchElementException(e4.getMessage());
                            }
                        } else if (arrayList != null) {
                            hashMap2.put(cls, arrayList);
                        }
                    }
                }
            }
            i = 2;
        }
        hashMap.put(cls, Integer.valueOf(i));
        return i;
    }
}
