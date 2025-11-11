package com.tencent.wechat;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
class OptionalMethod<T> {
    private final String methodName;
    private final Class[] methodParams;
    private final Class<?> returnType;

    public OptionalMethod(Class<?> cls, String str, Class... clsArr) {
        this.returnType = cls;
        this.methodName = str;
        this.methodParams = clsArr;
    }

    private Method getMethod(Class<?> cls) {
        if (this.methodName == null) {
            return null;
        }
        Method publicMethod = getPublicMethod(cls, this.methodName, this.methodParams);
        if (publicMethod == null || this.returnType == null || this.returnType.isAssignableFrom(publicMethod.getReturnType())) {
            return publicMethod;
        }
        return null;
    }

    private static Method getPublicMethod(Class<?> cls, String str, Class[] clsArr) {
        try {
            Method method = cls.getMethod(str, clsArr);
            try {
                if ((method.getModifiers() & 1) == 0) {
                    return null;
                }
                return method;
            } catch (NoSuchMethodException e2) {
                return method;
            }
        } catch (NoSuchMethodException e3) {
            return null;
        }
    }

    public Object invoke(T t2, Object... objArr) throws InvocationTargetException {
        Method method = getMethod(t2.getClass());
        if (method == null) {
            throw new AssertionError("Method " + this.methodName + " not supported for object " + t2);
        }
        try {
            return method.invoke(t2, objArr);
        } catch (IllegalAccessException e2) {
            AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + method);
            assertionError.initCause(e2);
            throw assertionError;
        }
    }

    public Object invokeOptional(T t2, Object... objArr) throws InvocationTargetException {
        Method method = getMethod(t2.getClass());
        if (method == null) {
            return null;
        }
        try {
            return method.invoke(t2, objArr);
        } catch (IllegalAccessException e2) {
            return null;
        }
    }

    public Object invokeOptionalWithoutCheckedException(T t2, Object... objArr) {
        try {
            return invokeOptional(t2, objArr);
        } catch (InvocationTargetException e2) {
            Throwable targetException = e2.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public Object invokeWithoutCheckedException(T t2, Object... objArr) {
        try {
            return invoke(t2, objArr);
        } catch (InvocationTargetException e2) {
            Throwable targetException = e2.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public boolean isSupported(T t2) {
        return getMethod(t2.getClass()) != null;
    }
}
