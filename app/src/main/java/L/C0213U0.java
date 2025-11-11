package l;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: l.U0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0213U0 implements InterfaceC0249o, k.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Toolbar f3026a;

    public /* synthetic */ C0213U0(Toolbar toolbar) {
        this.f3026a = toolbar;
    }

    @Override // k.k
    public void p(k.m mVar) {
        Toolbar toolbar = this.f3026a;
        C0243l c0243l = toolbar.f1435a.f1399t;
        if (c0243l == null || !c0243l.n()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.G.f362c).iterator();
            while (it.hasNext()) {
                ((Y.J) it.next()).f978a.s();
            }
        }
    }

    @Override // k.k
    public boolean q(k.m mVar, MenuItem menuItem) {
        this.f3026a.getClass();
        return false;
    }
}
