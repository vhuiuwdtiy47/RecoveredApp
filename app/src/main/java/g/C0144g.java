package g;

import android.os.Bundle;
import com.xiaomi.vlive.MainActivity;
import java.util.Arrays;
import java.util.LinkedHashSet;
import l.AbstractC0271z;
import o0.InterfaceC0306c;

/* renamed from: g.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0144g implements InterfaceC0306c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2532a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2533b;

    public C0144g(C.j jVar) {
        q1.d.e(jVar, "registry");
        this.f2533b = new LinkedHashSet();
        jVar.I("androidx.savedstate.Restarter", this);
    }

    @Override // o0.InterfaceC0306c
    public final Bundle a() {
        switch (this.f2532a) {
            case 0:
                Bundle bundle = new Bundle();
                ((MainActivity) this.f2533b).l().getClass();
                return bundle;
            default:
                Bundle f2 = Z0.i.f((i1.d[]) Arrays.copyOf(new i1.d[0], 0));
                AbstractC0271z.u(f2, "classes_to_restore", j1.j.y0((LinkedHashSet) this.f2533b));
                return f2;
        }
    }

    public C0144g(MainActivity mainActivity) {
        this.f2533b = mainActivity;
    }
}
