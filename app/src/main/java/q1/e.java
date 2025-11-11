package q1;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class e implements c, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final int f3540a;

    public e(int i) {
        this.f3540a = i;
    }

    @Override // q1.c
    public final int b() {
        return this.f3540a;
    }

    public final String toString() {
        i.f3543a.getClass();
        String obj = getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            obj = obj.substring(21);
        }
        d.d(obj, "renderLambdaToString(...)");
        return obj;
    }
}
