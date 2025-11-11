package f0;

import android.os.Bundle;

/* renamed from: f0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0134j {

    /* renamed from: a, reason: collision with root package name */
    public final i0.e f2311a;

    public C0134j(C0133i c0133i) {
        q1.d.e(c0133i, "entry");
        this.f2311a = new i0.e(c0133i, c0133i.f2306b.f2359b.f2660a);
    }

    public C0134j(Bundle bundle) {
        q1.d.e(bundle, "state");
        bundle.setClassLoader(C0134j.class.getClassLoader());
        this.f2311a = new i0.e(bundle);
    }
}
