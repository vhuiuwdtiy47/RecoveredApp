package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class P {

    /* renamed from: a, reason: collision with root package name */
    public static final List f1568a;

    /* renamed from: b, reason: collision with root package name */
    public static final List f1569b;

    static {
        List asList = Arrays.asList(Application.class, I.class);
        q1.d.d(asList, "asList(...)");
        f1568a = asList;
        f1569b = U.t.M(I.class);
    }

    public static final Constructor a(Class cls, List list) {
        q1.d.e(list, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        q1.d.e(constructors, "array");
        int i = 0;
        while (true) {
            if (!(i < constructors.length)) {
                return null;
            }
            int i2 = i + 1;
            try {
                Constructor<?> constructor = constructors[i];
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                q1.d.d(parameterTypes, "getParameterTypes(...)");
                List l02 = j1.i.l0(parameterTypes);
                if (list.equals(l02)) {
                    return constructor;
                }
                if (list.size() == l02.size() && l02.containsAll(list)) {
                    throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
                }
                i = i2;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new NoSuchElementException(e2.getMessage());
            }
        }
    }

    public static final Q b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (Q) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Failed to access " + cls, e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e4.getCause());
        }
    }
}
