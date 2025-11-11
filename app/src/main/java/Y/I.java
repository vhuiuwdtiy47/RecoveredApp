package Y;

import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    public boolean f974a = false;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f975b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public a.u f976c;
    public final /* synthetic */ int d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f977e;

    public I(int i, Object obj) {
        this.d = i;
        this.f977e = obj;
    }

    public final void a(boolean z2) {
        this.f974a = z2;
        a.u uVar = this.f976c;
        if (uVar != null) {
            uVar.a();
        }
    }
}
