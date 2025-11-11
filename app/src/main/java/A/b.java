package A;

import android.app.Activity;

/* loaded from: classes.dex */
public abstract class b {
    public static <T> T a(Activity activity, int i) {
        return (T) activity.requireViewById(i);
    }
}
