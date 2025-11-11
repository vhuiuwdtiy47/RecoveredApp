package n0;

import android.view.View;
import java.util.List;

/* renamed from: n0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0296t {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3444a;

    /* renamed from: b, reason: collision with root package name */
    public int f3445b;

    /* renamed from: c, reason: collision with root package name */
    public int f3446c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f3447e;

    /* renamed from: f, reason: collision with root package name */
    public int f3448f;

    /* renamed from: g, reason: collision with root package name */
    public int f3449g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f3450j;

    /* renamed from: k, reason: collision with root package name */
    public List f3451k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3452l;

    public final void a(View view) {
        int b2;
        int size = this.f3451k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((W) this.f3451k.get(i2)).f3297a;
            I i3 = (I) view3.getLayoutParams();
            if (view3 != view && !i3.f3258a.h() && (b2 = (i3.f3258a.b() - this.d) * this.f3447e) >= 0 && b2 < i) {
                view2 = view3;
                if (b2 == 0) {
                    break;
                } else {
                    i = b2;
                }
            }
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((I) view2.getLayoutParams()).f3258a.b();
        }
    }

    public final View b(N n2) {
        List list = this.f3451k;
        if (list == null) {
            View view = n2.i(this.d, Long.MAX_VALUE).f3297a;
            this.d += this.f3447e;
            return view;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view2 = ((W) this.f3451k.get(i)).f3297a;
            I i2 = (I) view2.getLayoutParams();
            if (!i2.f3258a.h() && this.d == i2.f3258a.b()) {
                a(view2);
                return view2;
            }
        }
        return null;
    }
}
