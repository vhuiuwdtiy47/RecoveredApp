package h0;

import Y.AbstractComponentCallbacksC0056x;
import android.util.Log;
import androidx.lifecycle.EnumC0091n;
import androidx.lifecycle.EnumC0092o;
import androidx.lifecycle.InterfaceC0096t;
import androidx.lifecycle.r;
import f0.C0133i;
import java.util.Iterator;
import p0.C0309a;

/* renamed from: h0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0155e implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2579a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2580b;

    public /* synthetic */ C0155e(int i, Object obj) {
        this.f2579a = i;
        this.f2580b = obj;
    }

    @Override // androidx.lifecycle.r
    public final void a(InterfaceC0096t interfaceC0096t, EnumC0091n enumC0091n) {
        switch (this.f2579a) {
            case 0:
                if (enumC0091n == EnumC0091n.ON_DESTROY) {
                    AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x = (AbstractComponentCallbacksC0056x) interfaceC0096t;
                    j jVar = (j) this.f2580b;
                    Object obj = null;
                    for (Object obj2 : (Iterable) ((y1.c) ((y1.a) jVar.b().f2323f.f33b)).a()) {
                        if (q1.d.a(((C0133i) obj2).f2309f, abstractComponentCallbacksC0056x.f1203y)) {
                            obj = obj2;
                        }
                    }
                    C0133i c0133i = (C0133i) obj;
                    if (c0133i != null) {
                        if (j.n()) {
                            Log.v("FragmentNavigator", "Marking transition complete for entry " + c0133i + " due to fragment " + interfaceC0096t + " lifecycle reaching DESTROYED");
                        }
                        jVar.b().c(c0133i);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                EnumC0092o a2 = enumC0091n.a();
                i0.j jVar2 = (i0.j) this.f2580b;
                jVar2.f2648p = a2;
                if (jVar2.f2638c != null) {
                    Iterator it = j1.j.z0(jVar2.f2640f).iterator();
                    while (it.hasNext()) {
                        C0133i c0133i2 = (C0133i) it.next();
                        c0133i2.getClass();
                        i0.d dVar = c0133i2.h;
                        dVar.getClass();
                        dVar.d = enumC0091n.a();
                        dVar.b();
                    }
                    return;
                }
                return;
            default:
                EnumC0091n enumC0091n2 = EnumC0091n.ON_START;
                C0309a c0309a = (C0309a) this.f2580b;
                if (enumC0091n == enumC0091n2) {
                    c0309a.h = true;
                    return;
                } else {
                    if (enumC0091n == EnumC0091n.ON_STOP) {
                        c0309a.h = false;
                        return;
                    }
                    return;
                }
        }
    }
}
