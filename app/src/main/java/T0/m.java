package T0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final t[] f720a = new t[4];

    /* renamed from: b, reason: collision with root package name */
    public final Matrix[] f721b = new Matrix[4];

    /* renamed from: c, reason: collision with root package name */
    public final Matrix[] f722c = new Matrix[4];
    public final PointF d = new PointF();

    /* renamed from: e, reason: collision with root package name */
    public final Path f723e = new Path();

    /* renamed from: f, reason: collision with root package name */
    public final Path f724f = new Path();

    /* renamed from: g, reason: collision with root package name */
    public final t f725g = new t();
    public final float[] h = new float[2];
    public final float[] i = new float[2];

    /* renamed from: j, reason: collision with root package name */
    public final Path f726j = new Path();

    /* renamed from: k, reason: collision with root package name */
    public final Path f727k = new Path();

    /* renamed from: l, reason: collision with root package name */
    public final boolean f728l = true;

    public m() {
        for (int i = 0; i < 4; i++) {
            this.f720a[i] = new t();
            this.f721b[i] = new Matrix();
            this.f722c[i] = new Matrix();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v6 */
    public final void a(k kVar, float f2, RectF rectF, A0.c cVar, Path path) {
        Matrix[] matrixArr;
        Matrix[] matrixArr2;
        t[] tVarArr;
        int i;
        boolean z2;
        float[] fArr;
        float f3;
        boolean z3;
        int i2;
        m mVar = this;
        path.rewind();
        Path path2 = mVar.f723e;
        path2.rewind();
        Path path3 = mVar.f724f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i3 = 0;
        while (true) {
            matrixArr = mVar.f722c;
            matrixArr2 = mVar.f721b;
            tVarArr = mVar.f720a;
            i = 4;
            z2 = 0;
            fArr = mVar.h;
            if (i3 >= 4) {
                break;
            }
            c cVar2 = i3 != 1 ? i3 != 2 ? i3 != 3 ? kVar.f714f : kVar.f713e : kVar.h : kVar.f715g;
            Z0.i iVar = i3 != 1 ? i3 != 2 ? i3 != 3 ? kVar.f711b : kVar.f710a : kVar.d : kVar.f712c;
            t tVar = tVarArr[i3];
            iVar.getClass();
            iVar.z(tVar, f2, cVar2.a(rectF));
            int i4 = i3 + 1;
            float f4 = (i4 % 4) * 90;
            matrixArr2[i3].reset();
            PointF pointF = mVar.d;
            if (i3 == 1) {
                i2 = i3;
                pointF.set(rectF.right, rectF.bottom);
            } else if (i3 == 2) {
                i2 = i3;
                pointF.set(rectF.left, rectF.bottom);
            } else if (i3 != 3) {
                i2 = i3;
                pointF.set(rectF.right, rectF.top);
            } else {
                i2 = i3;
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i2].setTranslate(pointF.x, pointF.y);
            matrixArr2[i2].preRotate(f4);
            t tVar2 = tVarArr[i2];
            fArr[0] = tVar2.f741b;
            fArr[1] = tVar2.f742c;
            matrixArr2[i2].mapPoints(fArr);
            matrixArr[i2].reset();
            matrixArr[i2].setTranslate(fArr[0], fArr[1]);
            matrixArr[i2].preRotate(f4);
            i3 = i4;
        }
        int i5 = 0;
        while (i5 < i) {
            t tVar3 = tVarArr[i5];
            tVar3.getClass();
            fArr[z2] = 0.0f;
            fArr[1] = tVar3.f740a;
            matrixArr2[i5].mapPoints(fArr);
            if (i5 == 0) {
                path.moveTo(fArr[z2], fArr[1]);
            } else {
                path.lineTo(fArr[z2], fArr[1]);
            }
            tVarArr[i5].b(matrixArr2[i5], path);
            if (cVar != null) {
                t tVar4 = tVarArr[i5];
                Matrix matrix = matrixArr2[i5];
                g gVar = (g) cVar.f33b;
                BitSet bitSet = gVar.d;
                tVar4.getClass();
                f3 = 0.0f;
                bitSet.set(i5, z2);
                tVar4.a(tVar4.f743e);
                gVar.f684b[i5] = new n(new ArrayList(tVar4.f745g), new Matrix(matrix));
            } else {
                f3 = 0.0f;
            }
            int i6 = i5 + 1;
            int i7 = i6 % 4;
            t tVar5 = tVarArr[i5];
            fArr[0] = tVar5.f741b;
            fArr[1] = tVar5.f742c;
            matrixArr2[i5].mapPoints(fArr);
            t tVar6 = tVarArr[i7];
            tVar6.getClass();
            float[] fArr2 = mVar.i;
            fArr2[0] = f3;
            fArr2[1] = tVar6.f740a;
            matrixArr2[i7].mapPoints(fArr2);
            Matrix[] matrixArr3 = matrixArr2;
            t[] tVarArr2 = tVarArr;
            float max = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, f3);
            t tVar7 = tVarArr2[i5];
            fArr[0] = tVar7.f741b;
            fArr[1] = tVar7.f742c;
            matrixArr3[i5].mapPoints(fArr);
            if (i5 == 1 || i5 == 3) {
                Math.abs(rectF.centerX() - fArr[0]);
            } else {
                Math.abs(rectF.centerY() - fArr[1]);
            }
            t tVar8 = mVar.f725g;
            tVar8.d(0.0f, 270.0f, 0.0f);
            (i5 != 1 ? i5 != 2 ? i5 != 3 ? kVar.f716j : kVar.i : kVar.f718l : kVar.f717k).getClass();
            tVar8.c(max, 0.0f);
            Path path4 = mVar.f726j;
            path4.reset();
            tVar8.b(matrixArr[i5], path4);
            if (mVar.f728l && (mVar.b(path4, i5) || mVar.b(path4, i7))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr[0] = 0.0f;
                fArr[1] = tVar8.f740a;
                matrixArr[i5].mapPoints(fArr);
                path2.moveTo(fArr[0], fArr[1]);
                tVar8.b(matrixArr[i5], path2);
            } else {
                tVar8.b(matrixArr[i5], path);
            }
            if (cVar != null) {
                Matrix matrix2 = matrixArr[i5];
                g gVar2 = (g) cVar.f33b;
                z3 = false;
                gVar2.d.set(i5 + 4, false);
                tVar8.a(tVar8.f743e);
                gVar2.f685c[i5] = new n(new ArrayList(tVar8.f745g), new Matrix(matrix2));
            } else {
                z3 = false;
            }
            z2 = z3;
            i5 = i6;
            tVarArr = tVarArr2;
            matrixArr2 = matrixArr3;
            i = 4;
            mVar = this;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    public final boolean b(Path path, int i) {
        Path path2 = this.f727k;
        path2.reset();
        this.f720a[i].b(this.f721b[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }
}
