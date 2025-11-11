package T0;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public float f740a;

    /* renamed from: b, reason: collision with root package name */
    public float f741b;

    /* renamed from: c, reason: collision with root package name */
    public float f742c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f743e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f744f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f745g = new ArrayList();

    public t() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f2) {
        float f3 = this.d;
        if (f3 == f2) {
            return;
        }
        float f4 = ((f2 - f3) + 360.0f) % 360.0f;
        if (f4 > 180.0f) {
            return;
        }
        float f5 = this.f741b;
        float f6 = this.f742c;
        p pVar = new p(f5, f6, f5, f6);
        pVar.f735f = this.d;
        pVar.f736g = f4;
        this.f745g.add(new n(pVar));
        this.d = f2;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f744f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((r) arrayList.get(i)).a(matrix, path);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T0.r, T0.q, java.lang.Object] */
    public final void c(float f2, float f3) {
        ?? rVar = new r();
        rVar.f737b = f2;
        rVar.f738c = f3;
        this.f744f.add(rVar);
        o oVar = new o(rVar, this.f741b, this.f742c);
        float a2 = oVar.a() + 270.0f;
        float a3 = oVar.a() + 270.0f;
        a(a2);
        this.f745g.add(oVar);
        this.d = a3;
        this.f741b = f2;
        this.f742c = f3;
    }

    public final void d(float f2, float f3, float f4) {
        this.f740a = f2;
        this.f741b = 0.0f;
        this.f742c = f2;
        this.d = f3;
        this.f743e = (f3 + f4) % 360.0f;
        this.f744f.clear();
        this.f745g.clear();
    }
}
