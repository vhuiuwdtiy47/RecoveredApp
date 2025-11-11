package androidx.lifecycle;

import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import com.tencent.wechat.Platform;
import java.util.HashMap;
import java.util.List;

/* renamed from: androidx.lifecycle.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0084g implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1586a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1587b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1588c;

    public C0084g(U.j jVar, r rVar) {
        q1.d.e(jVar, "defaultLifecycleObserver");
        this.f1587b = jVar;
        this.f1588c = rVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.lang.Runnable] */
    @Override // androidx.lifecycle.r
    public final void a(InterfaceC0096t interfaceC0096t, EnumC0091n enumC0091n) {
        switch (this.f1586a) {
            case 0:
                int i = AbstractC0083f.f1585a[enumC0091n.ordinal()];
                U.j jVar = (U.j) this.f1587b;
                switch (i) {
                    case 1:
                        jVar.getClass();
                        break;
                    case 2:
                        jVar.getClass();
                        break;
                    case 3:
                        EmojiCompatInitializer emojiCompatInitializer = jVar.f767b;
                        U.b.a(Looper.getMainLooper()).postDelayed(new Object(), 500L);
                        jVar.f766a.f(jVar);
                        break;
                    case Platform.INFO /* 4 */:
                        jVar.getClass();
                        break;
                    case Platform.WARN /* 5 */:
                        jVar.getClass();
                        break;
                    case 6:
                        jVar.getClass();
                        break;
                    case 7:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                    default:
                        throw new RuntimeException();
                }
                r rVar = (r) this.f1588c;
                if (rVar != null) {
                    rVar.a(interfaceC0096t, enumC0091n);
                    return;
                }
                return;
            case 1:
                if (enumC0091n == EnumC0091n.ON_START) {
                    ((C0098v) this.f1587b).f(this);
                    ((C.j) this.f1588c).L();
                    return;
                }
                return;
            default:
                HashMap hashMap = ((C0079b) this.f1588c).f1576a;
                List list = (List) hashMap.get(enumC0091n);
                InterfaceC0095s interfaceC0095s = (InterfaceC0095s) this.f1587b;
                C0079b.a(list, interfaceC0096t, enumC0091n, interfaceC0095s);
                C0079b.a((List) hashMap.get(EnumC0091n.ON_ANY), interfaceC0096t, enumC0091n, interfaceC0095s);
                return;
        }
    }

    public C0084g(InterfaceC0095s interfaceC0095s) {
        this.f1587b = interfaceC0095s;
        C0081d c0081d = C0081d.f1580c;
        Class<?> cls = interfaceC0095s.getClass();
        C0079b c0079b = (C0079b) c0081d.f1581a.get(cls);
        this.f1588c = c0079b == null ? c0081d.a(cls, null) : c0079b;
    }

    public C0084g(C.j jVar, C0098v c0098v) {
        this.f1587b = c0098v;
        this.f1588c = jVar;
    }
}
