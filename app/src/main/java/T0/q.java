package T0;

import android.graphics.Matrix;
import android.graphics.Path;

/* loaded from: classes.dex */
public final class q extends r {

    /* renamed from: b, reason: collision with root package name */
    public float f737b;

    /* renamed from: c, reason: collision with root package name */
    public float f738c;

    @Override // T0.r
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f739a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f737b, this.f738c);
        path.transform(matrix);
    }
}
