package L;

import c.InterfaceC0103b;
import com.tencent.wechat.Platform;

/* renamed from: L.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0011g implements W0.B, InterfaceC0103b, s0.k {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f342f;

    public /* synthetic */ C0011g(int i) {
        this.f342f = i;
    }

    @Override // s0.k
    public void a(s0.j jVar, s0.l lVar) {
        switch (this.f342f) {
            case Platform.INFO /* 4 */:
                jVar.e(lVar);
                return;
            case Platform.WARN /* 5 */:
                jVar.c(lVar);
                return;
            case 6:
                jVar.b(lVar);
                return;
            case 7:
                jVar.a();
                return;
            default:
                jVar.d();
                return;
        }
    }

    @Override // c.InterfaceC0103b
    public void b(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            U.t.g("已获取权限");
        } else {
            U.t.g("权限被拒绝");
        }
    }
}
