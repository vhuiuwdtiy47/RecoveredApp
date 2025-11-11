package t0;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* renamed from: t0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0340m {

    /* renamed from: p, reason: collision with root package name */
    public static final Matrix f3859p = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    public final Path f3860a;

    /* renamed from: b, reason: collision with root package name */
    public final Path f3861b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f3862c;
    public Paint d;

    /* renamed from: e, reason: collision with root package name */
    public Paint f3863e;

    /* renamed from: f, reason: collision with root package name */
    public PathMeasure f3864f;

    /* renamed from: g, reason: collision with root package name */
    public final C0337j f3865g;
    public float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f3866j;

    /* renamed from: k, reason: collision with root package name */
    public float f3867k;

    /* renamed from: l, reason: collision with root package name */
    public int f3868l;

    /* renamed from: m, reason: collision with root package name */
    public String f3869m;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f3870n;

    /* renamed from: o, reason: collision with root package name */
    public final o.f f3871o;

    /* JADX WARN: Type inference failed for: r0v4, types: [o.f, o.j] */
    public C0340m() {
        this.f3862c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.f3866j = 0.0f;
        this.f3867k = 0.0f;
        this.f3868l = 255;
        this.f3869m = null;
        this.f3870n = null;
        this.f3871o = new o.j(0);
        this.f3865g = new C0337j();
        this.f3860a = new Path();
        this.f3861b = new Path();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(C0337j c0337j, Matrix matrix, Canvas canvas, int i, int i2) {
        char c2;
        float f2;
        float f3;
        int i3;
        C0337j c0337j2 = c0337j;
        char c3 = 1;
        c0337j2.f3848a.set(matrix);
        Matrix matrix2 = c0337j2.f3848a;
        matrix2.preConcat(c0337j2.f3854j);
        canvas.save();
        char c4 = 0;
        int i4 = 0;
        while (true) {
            ArrayList arrayList = c0337j2.f3849b;
            if (i4 >= arrayList.size()) {
                canvas.restore();
                return;
            }
            AbstractC0338k abstractC0338k = (AbstractC0338k) arrayList.get(i4);
            if (abstractC0338k instanceof C0337j) {
                a((C0337j) abstractC0338k, matrix2, canvas, i, i2);
            } else if (abstractC0338k instanceof AbstractC0339l) {
                AbstractC0339l abstractC0339l = (AbstractC0339l) abstractC0338k;
                float f4 = i / this.f3866j;
                float f5 = i2 / this.f3867k;
                float min = Math.min(f4, f5);
                Matrix matrix3 = this.f3862c;
                matrix3.set(matrix2);
                matrix3.postScale(f4, f5);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix2.mapVectors(fArr);
                float hypot = (float) Math.hypot(fArr[c4], fArr[c3]);
                boolean z2 = c3;
                boolean z3 = c4;
                float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f6 = (fArr[z3 ? 1 : 0] * fArr[3]) - (fArr[z2 ? 1 : 0] * fArr[2]);
                float max = Math.max(hypot, hypot2);
                float abs = max > 0.0f ? Math.abs(f6) / max : 0.0f;
                if (abs != 0.0f) {
                    abstractC0339l.getClass();
                    Path path = this.f3860a;
                    path.reset();
                    D.g[] gVarArr = abstractC0339l.f3856a;
                    if (gVarArr != null) {
                        D.g.b(gVarArr, path);
                    }
                    Path path2 = this.f3861b;
                    path2.reset();
                    if (abstractC0339l instanceof C0335h) {
                        path2.setFillType(abstractC0339l.f3858c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix3);
                        canvas.clipPath(path2);
                    } else {
                        C0336i c0336i = (C0336i) abstractC0339l;
                        float f7 = c0336i.i;
                        if (f7 != 0.0f || c0336i.f3843j != 1.0f) {
                            float f8 = c0336i.f3844k;
                            float f9 = (f7 + f8) % 1.0f;
                            float f10 = (c0336i.f3843j + f8) % 1.0f;
                            if (this.f3864f == null) {
                                this.f3864f = new PathMeasure();
                            }
                            this.f3864f.setPath(path, z3);
                            float length = this.f3864f.getLength();
                            float f11 = f9 * length;
                            float f12 = f10 * length;
                            path.reset();
                            if (f11 > f12) {
                                this.f3864f.getSegment(f11, length, path, z2);
                                f2 = 0.0f;
                                this.f3864f.getSegment(0.0f, f12, path, z2);
                            } else {
                                f2 = 0.0f;
                                this.f3864f.getSegment(f11, f12, path, z2);
                            }
                            path.rLineTo(f2, f2);
                        }
                        path2.addPath(path, matrix3);
                        C.d dVar = c0336i.f3841f;
                        if ((((Shader) dVar.f49b) == null && dVar.f48a == 0) ? false : true) {
                            if (this.f3863e == null) {
                                i3 = 16777215;
                                Paint paint = new Paint(1);
                                this.f3863e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i3 = 16777215;
                            }
                            Paint paint2 = this.f3863e;
                            Shader shader = (Shader) dVar.f49b;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix3);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(c0336i.h * 255.0f));
                                f3 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i5 = dVar.f48a;
                                float f13 = c0336i.h;
                                PorterDuff.Mode mode = C0343p.f3882j;
                                f3 = 255.0f;
                                paint2.setColor((i5 & i3) | (((int) (Color.alpha(i5) * f13)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(c0336i.f3858c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        } else {
                            f3 = 255.0f;
                            i3 = 16777215;
                        }
                        C.d dVar2 = c0336i.d;
                        if (((Shader) dVar2.f49b) != null || dVar2.f48a != 0) {
                            if (this.d == null) {
                                Paint paint3 = new Paint(1);
                                this.d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.d;
                            Paint.Join join = c0336i.f3846m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = c0336i.f3845l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(c0336i.f3847n);
                            Shader shader2 = (Shader) dVar2.f49b;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix3);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(c0336i.f3842g * f3));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i6 = dVar2.f48a;
                                float f14 = c0336i.f3842g;
                                PorterDuff.Mode mode2 = C0343p.f3882j;
                                paint4.setColor((i6 & i3) | (((int) (Color.alpha(i6) * f14)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(c0336i.f3840e * min * abs);
                            canvas.drawPath(path2, paint4);
                        }
                    }
                }
                c2 = 1;
                i4++;
                c0337j2 = c0337j;
                c3 = c2;
                c4 = 0;
            }
            c2 = c3;
            i4++;
            c0337j2 = c0337j;
            c3 = c2;
            c4 = 0;
        }
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f3868l;
    }

    public void setAlpha(float f2) {
        setRootAlpha((int) (f2 * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.f3868l = i;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [o.f, o.j] */
    public C0340m(C0340m c0340m) {
        this.f3862c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.f3866j = 0.0f;
        this.f3867k = 0.0f;
        this.f3868l = 255;
        this.f3869m = null;
        this.f3870n = null;
        ?? jVar = new o.j(0);
        this.f3871o = jVar;
        this.f3865g = new C0337j(c0340m.f3865g, jVar);
        this.f3860a = new Path(c0340m.f3860a);
        this.f3861b = new Path(c0340m.f3861b);
        this.h = c0340m.h;
        this.i = c0340m.i;
        this.f3866j = c0340m.f3866j;
        this.f3867k = c0340m.f3867k;
        this.f3868l = c0340m.f3868l;
        this.f3869m = c0340m.f3869m;
        String str = c0340m.f3869m;
        if (str != null) {
            jVar.put(str, this);
        }
        this.f3870n = c0340m.f3870n;
    }
}
