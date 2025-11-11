package Y;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.C0098v;
import androidx.lifecycle.InterfaceC0096t;
import g.AbstractActivityC0146i;
import o0.InterfaceC0307d;

/* loaded from: classes.dex */
public final class B extends U.t implements androidx.lifecycle.W, InterfaceC0096t, InterfaceC0307d, W {

    /* renamed from: e, reason: collision with root package name */
    public final AbstractActivityC0146i f958e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractActivityC0146i f959f;

    /* renamed from: g, reason: collision with root package name */
    public final Handler f960g;
    public final S h;
    public final /* synthetic */ AbstractActivityC0146i i;

    public B(AbstractActivityC0146i abstractActivityC0146i) {
        this.i = abstractActivityC0146i;
        Handler handler = new Handler();
        this.h = new S();
        this.f958e = abstractActivityC0146i;
        this.f959f = abstractActivityC0146i;
        this.f960g = handler;
    }

    @Override // U.t
    public final View P(int i) {
        return this.i.findViewById(i);
    }

    @Override // U.t
    public final boolean Q() {
        Window window = this.i.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // Y.W
    public final void a(S s2, AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x) {
    }

    @Override // o0.InterfaceC0307d
    public final C.j b() {
        return (C.j) this.i.f1270e.f61c;
    }

    @Override // androidx.lifecycle.W
    public final androidx.lifecycle.V c() {
        return this.i.c();
    }

    @Override // androidx.lifecycle.InterfaceC0096t
    public final C0098v d() {
        return this.i.f2536s;
    }
}
