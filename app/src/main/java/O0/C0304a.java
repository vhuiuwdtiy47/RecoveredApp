package o0;

import C.j;
import D.f;
import Y.AbstractComponentCallbacksC0056x;
import Y.DialogInterfaceOnCancelListenerC0049p;
import a.AbstractActivityC0068j;
import a.AbstractC0065g;
import a.v;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0091n;
import androidx.lifecycle.InterfaceC0096t;
import androidx.lifecycle.L;
import androidx.lifecycle.Q;
import androidx.lifecycle.V;
import androidx.lifecycle.W;
import androidx.lifecycle.r;
import f0.C0133i;
import h0.AbstractC0153c;
import h0.C0154d;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;

/* renamed from: o0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0304a implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3504a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3505b;

    public /* synthetic */ C0304a(int i, Object obj) {
        this.f3504a = i;
        this.f3505b = obj;
    }

    @Override // androidx.lifecycle.r
    public final void a(InterfaceC0096t interfaceC0096t, EnumC0091n enumC0091n) {
        View view;
        int i;
        switch (this.f3504a) {
            case 0:
                if (enumC0091n != EnumC0091n.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                interfaceC0096t.d().f(this);
                InterfaceC0307d interfaceC0307d = (InterfaceC0307d) this.f3505b;
                Bundle b2 = interfaceC0307d.b().b("androidx.savedstate.Restarter");
                if (b2 == null) {
                    return;
                }
                ArrayList<String> stringArrayList = b2.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> asSubclass = Class.forName(str, false, C0304a.class.getClassLoader()).asSubclass(InterfaceC0305b.class);
                        q1.d.b(asSubclass);
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(new Object[0]);
                                q1.d.b(newInstance);
                                if (!(interfaceC0307d instanceof W)) {
                                    throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + interfaceC0307d).toString());
                                }
                                V c2 = ((W) interfaceC0307d).c();
                                j b3 = interfaceC0307d.b();
                                c2.getClass();
                                LinkedHashMap linkedHashMap = c2.f1575a;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    String str2 = (String) it.next();
                                    q1.d.e(str2, "key");
                                    Q q2 = (Q) linkedHashMap.get(str2);
                                    if (q2 != null) {
                                        L.a(q2, b3, interfaceC0307d.d());
                                    }
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    b3.L();
                                }
                            } catch (Exception e2) {
                                throw new RuntimeException("Failed to instantiate " + str, e2);
                            }
                        } catch (NoSuchMethodException e3) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e3);
                        }
                    } catch (ClassNotFoundException e4) {
                        throw new RuntimeException(f.d("Class ", str, " wasn't found"), e4);
                    }
                }
                return;
            case 1:
                if (enumC0091n != EnumC0091n.ON_STOP || (view = ((AbstractComponentCallbacksC0056x) this.f3505b).f1167F) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
                return;
            case 2:
                if (enumC0091n != EnumC0091n.ON_CREATE || Build.VERSION.SDK_INT < 33) {
                    return;
                }
                v vVar = ((AbstractActivityC0068j) this.f3505b).f1272g;
                OnBackInvokedDispatcher a2 = AbstractC0065g.a((AbstractActivityC0068j) interfaceC0096t);
                vVar.getClass();
                q1.d.e(a2, "invoker");
                vVar.f1310e = a2;
                vVar.b(vVar.f1312g);
                return;
            default:
                int i2 = AbstractC0153c.f2574a[enumC0091n.ordinal()];
                C0154d c0154d = (C0154d) this.f3505b;
                if (i2 == 1) {
                    DialogInterfaceOnCancelListenerC0049p dialogInterfaceOnCancelListenerC0049p = (DialogInterfaceOnCancelListenerC0049p) interfaceC0096t;
                    Iterable iterable = (Iterable) ((y1.c) ((y1.a) c0154d.b().f2322e.f33b)).a();
                    if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                        Iterator it2 = iterable.iterator();
                        while (it2.hasNext()) {
                            if (q1.d.a(((C0133i) it2.next()).f2309f, dialogInterfaceOnCancelListenerC0049p.f1203y)) {
                                return;
                            }
                        }
                    }
                    dialogInterfaceOnCancelListenerC0049p.L(false, false);
                    return;
                }
                Object obj = null;
                if (i2 == 2) {
                    DialogInterfaceOnCancelListenerC0049p dialogInterfaceOnCancelListenerC0049p2 = (DialogInterfaceOnCancelListenerC0049p) interfaceC0096t;
                    for (Object obj2 : (Iterable) ((y1.c) ((y1.a) c0154d.b().f2323f.f33b)).a()) {
                        if (q1.d.a(((C0133i) obj2).f2309f, dialogInterfaceOnCancelListenerC0049p2.f1203y)) {
                            obj = obj2;
                        }
                    }
                    C0133i c0133i = (C0133i) obj;
                    if (c0133i != null) {
                        c0154d.b().c(c0133i);
                        return;
                    }
                    return;
                }
                if (i2 != 3) {
                    if (i2 != 4) {
                        return;
                    }
                    DialogInterfaceOnCancelListenerC0049p dialogInterfaceOnCancelListenerC0049p3 = (DialogInterfaceOnCancelListenerC0049p) interfaceC0096t;
                    for (Object obj3 : (Iterable) ((y1.c) ((y1.a) c0154d.b().f2323f.f33b)).a()) {
                        if (q1.d.a(((C0133i) obj3).f2309f, dialogInterfaceOnCancelListenerC0049p3.f1203y)) {
                            obj = obj3;
                        }
                    }
                    C0133i c0133i2 = (C0133i) obj;
                    if (c0133i2 != null) {
                        c0154d.b().c(c0133i2);
                    }
                    dialogInterfaceOnCancelListenerC0049p3.f1174N.f(this);
                    return;
                }
                DialogInterfaceOnCancelListenerC0049p dialogInterfaceOnCancelListenerC0049p4 = (DialogInterfaceOnCancelListenerC0049p) interfaceC0096t;
                if (dialogInterfaceOnCancelListenerC0049p4.N().isShowing()) {
                    return;
                }
                List list = (List) ((y1.c) ((y1.a) c0154d.b().f2322e.f33b)).a();
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        i = -1;
                    } else if (q1.d.a(((C0133i) listIterator.previous()).f2309f, dialogInterfaceOnCancelListenerC0049p4.f1203y)) {
                        i = listIterator.nextIndex();
                    }
                }
                C0133i c0133i3 = (C0133i) j1.j.q0(list, i);
                if (!q1.d.a(j1.j.s0(list), c0133i3)) {
                    Log.i("DialogFragmentNavigator", "Dialog " + dialogInterfaceOnCancelListenerC0049p4 + " was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog");
                }
                if (c0133i3 != null) {
                    c0154d.l(i, c0133i3, false);
                    return;
                }
                return;
        }
    }
}
