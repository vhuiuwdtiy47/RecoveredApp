package s1;

import java.util.Random;

/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: b, reason: collision with root package name */
    public final b f3664b = new ThreadLocal();

    @Override // s1.a
    public final Random a() {
        Object obj = this.f3664b.get();
        q1.d.d(obj, "get(...)");
        return (Random) obj;
    }
}
