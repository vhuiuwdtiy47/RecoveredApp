package I;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f implements K.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f266a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f267b;

    public /* synthetic */ f(int i, Object obj) {
        this.f266a = i;
        this.f267b = obj;
    }

    @Override // K.a
    public final void a(Object obj) {
        switch (this.f266a) {
            case 0:
                g gVar = (g) obj;
                if (gVar == null) {
                    gVar = new g(-3);
                }
                ((C.j) this.f267b).D(gVar);
                return;
            default:
                g gVar2 = (g) obj;
                synchronized (h.f272c) {
                    try {
                        o.j jVar = h.d;
                        ArrayList arrayList = (ArrayList) jVar.get((String) this.f267b);
                        if (arrayList == null) {
                            return;
                        }
                        jVar.remove((String) this.f267b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((K.a) arrayList.get(i)).a(gVar2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
