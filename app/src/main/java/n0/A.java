package n0;

import android.database.Observable;

/* loaded from: classes.dex */
public final class A extends Observable {
    public final boolean a() {
        return !((Observable) this).mObservers.isEmpty();
    }
}
