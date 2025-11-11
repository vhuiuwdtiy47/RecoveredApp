package T0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class p extends r {
    public static final RectF h = new RectF();

    /* renamed from: b, reason: collision with root package name */
    public final float f732b;

    /* renamed from: c, reason: collision with root package name */
    public final float f733c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final float f734e;

    /* renamed from: f, reason: collision with root package name */
    public float f735f;

    /* renamed from: g, reason: collision with root package name */
    public float f736g;

    public p(float f2, float f3, float f4, float f5) {
        this.f732b = f2;
        this.f733c = f3;
        this.d = f4;
        this.f734e = f5;
    }

    @Override // T0.r
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f739a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = h;
        rectF.set(this.f732b, this.f733c, this.d, this.f734e);
        path.arcTo(rectF, this.f735f, this.f736g, false);
        path.transform(matrix);
    }
}
