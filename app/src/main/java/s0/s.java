package s0;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: b, reason: collision with root package name */
    public final View f3647b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3646a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3648c = new ArrayList();

    public s(View view) {
        this.f3647b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f3647b == sVar.f3647b && this.f3646a.equals(sVar.f3646a);
    }

    public final int hashCode() {
        return this.f3646a.hashCode() + (this.f3647b.hashCode() * 31);
    }

    public final String toString() {
        String c2 = D.f.c(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f3647b + "\n", "    values:");
        HashMap hashMap = this.f3646a;
        for (String str : hashMap.keySet()) {
            c2 = c2 + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return c2;
    }
}
