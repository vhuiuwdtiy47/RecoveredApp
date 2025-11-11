package t1;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import q1.d;

/* loaded from: classes.dex */
public final class a extends s1.a {
    @Override // s1.a
    public final Random a() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        d.d(current, "current(...)");
        return current;
    }
}
