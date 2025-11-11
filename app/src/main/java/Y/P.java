package Y;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class P implements O {

    /* renamed from: a, reason: collision with root package name */
    public final String f985a;

    /* renamed from: b, reason: collision with root package name */
    public final int f986b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ S f987c;

    public P(S s2, String str, int i) {
        this.f987c = s2;
        this.f985a = str;
        this.f986b = i;
    }

    @Override // Y.O
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x = this.f987c.f1024x;
        if (abstractComponentCallbacksC0056x == null || this.f986b >= 0 || this.f985a != null || !abstractComponentCallbacksC0056x.g().Q(-1, 0)) {
            return this.f987c.R(arrayList, arrayList2, this.f985a, this.f986b, 1);
        }
        return false;
    }
}
