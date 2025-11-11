package p0;

import T0.e;
import a.C0062d;
import android.os.Bundle;
import androidx.lifecycle.EnumC0092o;
import h0.C0155e;
import java.util.LinkedHashMap;
import o0.InterfaceC0307d;

/* renamed from: p0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0309a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0307d f3508a;

    /* renamed from: b, reason: collision with root package name */
    public final C0062d f3509b;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3511e;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f3512f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3513g;

    /* renamed from: c, reason: collision with root package name */
    public final e f3510c = new e(18);
    public final LinkedHashMap d = new LinkedHashMap();
    public boolean h = true;

    public C0309a(InterfaceC0307d interfaceC0307d, C0062d c0062d) {
        this.f3508a = interfaceC0307d;
        this.f3509b = c0062d;
    }

    public final void a() {
        InterfaceC0307d interfaceC0307d = this.f3508a;
        if (interfaceC0307d.d().f1600c != EnumC0092o.f1591b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.f3511e) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        this.f3509b.a();
        interfaceC0307d.d().a(new C0155e(2, this));
        this.f3511e = true;
    }
}
