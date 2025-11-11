package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class S extends T0.e {

    /* renamed from: e, reason: collision with root package name */
    public static S f1571e;

    /* renamed from: f, reason: collision with root package name */
    public static final T0.e f1572f = new T0.e(10);
    public final Application d;

    public S(Application application) {
        super(11);
        this.d = application;
    }

    public final Q d(Class cls, Application application) {
        if (!AbstractC0078a.class.isAssignableFrom(cls)) {
            return U.t.p(cls);
        }
        try {
            Q q2 = (Q) cls.getConstructor(Application.class).newInstance(application);
            q1.d.b(q2);
            return q2;
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Cannot create an instance of " + cls, e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("Cannot create an instance of " + cls, e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("Cannot create an instance of " + cls, e4);
        } catch (InvocationTargetException e5) {
            throw new RuntimeException("Cannot create an instance of " + cls, e5);
        }
    }

    @Override // T0.e, androidx.lifecycle.T
    public final Q e(Class cls) {
        Application application = this.d;
        if (application != null) {
            return d(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // T0.e, androidx.lifecycle.T
    public final Q r(Class cls, c0.e eVar) {
        if (this.d != null) {
            return e(cls);
        }
        Application application = (Application) eVar.f1741a.get(f1572f);
        if (application != null) {
            return d(cls, application);
        }
        if (AbstractC0078a.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return U.t.p(cls);
    }
}
