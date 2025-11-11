package androidx.emoji2.text;

import U.f;
import U.i;
import U.j;
import U.m;
import android.content.Context;
import androidx.lifecycle.C0098v;
import androidx.lifecycle.InterfaceC0096t;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import q0.C0313a;
import q0.InterfaceC0314b;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC0314b {
    @Override // q0.InterfaceC0314b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [U.s, U.f] */
    @Override // q0.InterfaceC0314b
    public final Object b(Context context) {
        Object obj;
        ?? fVar = new f(new m(context, 0));
        fVar.f755a = 1;
        if (i.f759k == null) {
            synchronized (i.f758j) {
                try {
                    if (i.f759k == null) {
                        i.f759k = new i(fVar);
                    }
                } finally {
                }
            }
        }
        C0313a c2 = C0313a.c(context);
        c2.getClass();
        synchronized (C0313a.f3532e) {
            try {
                obj = c2.f3533a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = c2.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        C0098v d = ((InterfaceC0096t) obj).d();
        d.a(new j(this, d));
        return Boolean.TRUE;
    }
}
