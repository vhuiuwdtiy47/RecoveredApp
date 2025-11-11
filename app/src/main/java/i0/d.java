package i0;

import a.C0062d;
import android.os.Bundle;
import androidx.lifecycle.C0098v;
import androidx.lifecycle.EnumC0092o;
import androidx.lifecycle.L;
import androidx.lifecycle.O;
import c0.C0113d;
import f0.C0125a;
import f0.C0133i;
import f0.o;
import f0.v;
import java.util.Arrays;
import p0.C0309a;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final C0133i f2612a;

    /* renamed from: b, reason: collision with root package name */
    public final v f2613b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f2614c;
    public EnumC0092o d;

    /* renamed from: e, reason: collision with root package name */
    public final o f2615e;

    /* renamed from: f, reason: collision with root package name */
    public final String f2616f;

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f2617g;
    public final C.j h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final C0098v f2618j;

    /* renamed from: k, reason: collision with root package name */
    public EnumC0092o f2619k;

    public d(C0133i c0133i) {
        this.f2612a = c0133i;
        this.f2613b = c0133i.f2306b;
        this.f2614c = c0133i.f2307c;
        this.d = c0133i.d;
        this.f2615e = c0133i.f2308e;
        this.f2616f = c0133i.f2309f;
        this.f2617g = c0133i.f2310g;
        this.h = new C.j(new C0309a(c0133i, new C0062d(4, c0133i)), 15);
        final int i = 0;
        i1.f fVar = new i1.f(new p1.a() { // from class: i0.b
            @Override // p1.a
            public final Object a() {
                switch (i) {
                    case 0:
                        return new O();
                    default:
                        C0113d c0113d = new C0113d(0);
                        c0113d.a(q1.i.a(c.class), new C0125a(8));
                        return c0113d.b();
                }
            }
        });
        this.f2618j = new C0098v(c0133i);
        this.f2619k = EnumC0092o.f1591b;
        final int i2 = 1;
        new i1.f(new p1.a() { // from class: i0.b
            @Override // p1.a
            public final Object a() {
                switch (i2) {
                    case 0:
                        return new O();
                    default:
                        C0113d c0113d = new C0113d(0);
                        c0113d.a(q1.i.a(c.class), new C0125a(8));
                        return c0113d.b();
                }
            }
        });
    }

    public final Bundle a() {
        Bundle bundle = this.f2614c;
        if (bundle == null) {
            return null;
        }
        Bundle f2 = Z0.i.f((i1.d[]) Arrays.copyOf(new i1.d[0], 0));
        f2.putAll(bundle);
        return f2;
    }

    public final void b() {
        if (!this.i) {
            C.j jVar = this.h;
            ((C0309a) jVar.f60b).a();
            this.i = true;
            if (this.f2615e != null) {
                L.d(this.f2612a);
            }
            jVar.F(this.f2617g);
        }
        int ordinal = this.d.ordinal();
        int ordinal2 = this.f2619k.ordinal();
        C0098v c0098v = this.f2618j;
        if (ordinal < ordinal2) {
            c0098v.g(this.d);
        } else {
            c0098v.g(this.f2619k);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(q1.i.a(C0133i.class).b());
        sb.append("(" + this.f2616f + ')');
        sb.append(" destination=");
        sb.append(this.f2613b);
        String sb2 = sb.toString();
        q1.d.d(sb2, "toString(...)");
        return sb2;
    }
}
