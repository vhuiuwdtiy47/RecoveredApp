package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0079b {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1576a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1577b;

    public C0079b(HashMap hashMap) {
        this.f1577b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            EnumC0091n enumC0091n = (EnumC0091n) entry.getValue();
            List list = (List) this.f1576a.get(enumC0091n);
            if (list == null) {
                list = new ArrayList();
                this.f1576a.put(enumC0091n, list);
            }
            list.add((C0080c) entry.getKey());
        }
    }

    public static void a(List list, InterfaceC0096t interfaceC0096t, EnumC0091n enumC0091n, InterfaceC0095s interfaceC0095s) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0080c c0080c = (C0080c) list.get(size);
                c0080c.getClass();
                try {
                    int i = c0080c.f1578a;
                    Method method = c0080c.f1579b;
                    if (i == 0) {
                        method.invoke(interfaceC0095s, new Object[0]);
                    } else if (i == 1) {
                        method.invoke(interfaceC0095s, interfaceC0096t);
                    } else if (i == 2) {
                        method.invoke(interfaceC0095s, interfaceC0096t, enumC0091n);
                    }
                } catch (IllegalAccessException e2) {
                    throw new RuntimeException(e2);
                } catch (InvocationTargetException e3) {
                    throw new RuntimeException("Failed to call observer method", e3.getCause());
                }
            }
        }
    }
}
