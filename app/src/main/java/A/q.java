package A;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class q implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f25a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final Context f26b;

    public q(Context context) {
        this.f26b = context;
    }

    public final void a(ComponentName componentName) {
        Context context = this.f26b;
        ArrayList arrayList = this.f25a;
        int size = arrayList.size();
        try {
            for (Intent a2 = c.a(context, componentName); a2 != null; a2 = c.a(context, a2.getComponent())) {
                arrayList.add(size, a2);
            }
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e2);
        }
    }

    public final void b() {
        ArrayList arrayList = this.f25a;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        this.f26b.startActivities(intentArr, null);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f25a.iterator();
    }
}
