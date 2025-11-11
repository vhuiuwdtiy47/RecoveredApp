package U;

import L.C0016l;
import android.os.Build;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d extends Z0.i {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f751f;

    public d(e eVar) {
        this.f751f = eVar;
    }

    @Override // Z0.i
    public final void Q(Throwable th) {
        this.f751f.f752a.d(th);
    }

    @Override // Z0.i
    public final void T(v vVar) {
        e eVar = this.f751f;
        eVar.f754c = vVar;
        v vVar2 = eVar.f754c;
        i iVar = eVar.f752a;
        eVar.f753b = new C0016l(vVar2, iVar.f765g, iVar.i, Build.VERSION.SDK_INT >= 34 ? o.a() : Z0.i.C());
        i iVar2 = eVar.f752a;
        iVar2.getClass();
        ArrayList arrayList = new ArrayList();
        iVar2.f760a.writeLock().lock();
        try {
            iVar2.f762c = 1;
            arrayList.addAll(iVar2.f761b);
            iVar2.f761b.clear();
            iVar2.f760a.writeLock().unlock();
            iVar2.d.post(new I.a(arrayList, iVar2.f762c, (Throwable) null));
        } catch (Throwable th) {
            iVar2.f760a.writeLock().unlock();
            throw th;
        }
    }
}
