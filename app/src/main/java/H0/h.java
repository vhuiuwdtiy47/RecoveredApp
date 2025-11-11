package h0;

import Y.AbstractComponentCallbacksC0056x;
import androidx.lifecycle.C0098v;
import androidx.lifecycle.EnumC0092o;
import androidx.lifecycle.InterfaceC0095s;
import androidx.lifecycle.InterfaceC0096t;
import f0.C0133i;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements p1.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f2585a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC0056x f2586b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0133i f2587c;

    public /* synthetic */ h(j jVar, AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x, C0133i c0133i) {
        this.f2585a = jVar;
        this.f2586b = abstractComponentCallbacksC0056x;
        this.f2587c = c0133i;
    }

    @Override // p1.l
    public final Object c(Object obj) {
        InterfaceC0096t interfaceC0096t = (InterfaceC0096t) obj;
        j jVar = this.f2585a;
        ArrayList arrayList = jVar.f2594g;
        AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x = this.f2586b;
        boolean z2 = false;
        if (arrayList == null || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (q1.d.a(((i1.d) it.next()).f2670a, abstractComponentCallbacksC0056x.f1203y)) {
                    z2 = true;
                    break;
                }
            }
        }
        if (interfaceC0096t != null && !z2) {
            C0098v d = abstractComponentCallbacksC0056x.l().d();
            if (d.f1600c.compareTo(EnumC0092o.f1592c) >= 0) {
                d.a((InterfaceC0095s) jVar.i.c(this.f2587c));
            }
        }
        return i1.g.f2679c;
    }
}
