package t0;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* renamed from: t0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0337j extends AbstractC0338k {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f3848a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3849b;

    /* renamed from: c, reason: collision with root package name */
    public float f3850c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f3851e;

    /* renamed from: f, reason: collision with root package name */
    public float f3852f;

    /* renamed from: g, reason: collision with root package name */
    public float f3853g;
    public float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public final Matrix f3854j;

    /* renamed from: k, reason: collision with root package name */
    public String f3855k;

    public C0337j() {
        this.f3848a = new Matrix();
        this.f3849b = new ArrayList();
        this.f3850c = 0.0f;
        this.d = 0.0f;
        this.f3851e = 0.0f;
        this.f3852f = 1.0f;
        this.f3853g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.f3854j = new Matrix();
        this.f3855k = null;
    }

    @Override // t0.AbstractC0338k
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3849b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((AbstractC0338k) arrayList.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    @Override // t0.AbstractC0338k
    public final boolean b(int[] iArr) {
        int i = 0;
        boolean z2 = false;
        while (true) {
            ArrayList arrayList = this.f3849b;
            if (i >= arrayList.size()) {
                return z2;
            }
            z2 |= ((AbstractC0338k) arrayList.get(i)).b(iArr);
            i++;
        }
    }

    public final void c() {
        Matrix matrix = this.f3854j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.f3851e);
        matrix.postScale(this.f3852f, this.f3853g);
        matrix.postRotate(this.f3850c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.i + this.f3851e);
    }

    public String getGroupName() {
        return this.f3855k;
    }

    public Matrix getLocalMatrix() {
        return this.f3854j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.f3851e;
    }

    public float getRotation() {
        return this.f3850c;
    }

    public float getScaleX() {
        return this.f3852f;
    }

    public float getScaleY() {
        return this.f3853g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f2) {
        if (f2 != this.d) {
            this.d = f2;
            c();
        }
    }

    public void setPivotY(float f2) {
        if (f2 != this.f3851e) {
            this.f3851e = f2;
            c();
        }
    }

    public void setRotation(float f2) {
        if (f2 != this.f3850c) {
            this.f3850c = f2;
            c();
        }
    }

    public void setScaleX(float f2) {
        if (f2 != this.f3852f) {
            this.f3852f = f2;
            c();
        }
    }

    public void setScaleY(float f2) {
        if (f2 != this.f3853g) {
            this.f3853g = f2;
            c();
        }
    }

    public void setTranslateX(float f2) {
        if (f2 != this.h) {
            this.h = f2;
            c();
        }
    }

    public void setTranslateY(float f2) {
        if (f2 != this.i) {
            this.i = f2;
            c();
        }
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [t0.i, t0.l] */
    public C0337j(C0337j c0337j, o.f fVar) {
        AbstractC0339l abstractC0339l;
        this.f3848a = new Matrix();
        this.f3849b = new ArrayList();
        this.f3850c = 0.0f;
        this.d = 0.0f;
        this.f3851e = 0.0f;
        this.f3852f = 1.0f;
        this.f3853g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.f3854j = matrix;
        this.f3855k = null;
        this.f3850c = c0337j.f3850c;
        this.d = c0337j.d;
        this.f3851e = c0337j.f3851e;
        this.f3852f = c0337j.f3852f;
        this.f3853g = c0337j.f3853g;
        this.h = c0337j.h;
        this.i = c0337j.i;
        String str = c0337j.f3855k;
        this.f3855k = str;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(c0337j.f3854j);
        ArrayList arrayList = c0337j.f3849b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof C0337j) {
                this.f3849b.add(new C0337j((C0337j) obj, fVar));
            } else {
                if (obj instanceof C0336i) {
                    C0336i c0336i = (C0336i) obj;
                    ?? abstractC0339l2 = new AbstractC0339l(c0336i);
                    abstractC0339l2.f3840e = 0.0f;
                    abstractC0339l2.f3842g = 1.0f;
                    abstractC0339l2.h = 1.0f;
                    abstractC0339l2.i = 0.0f;
                    abstractC0339l2.f3843j = 1.0f;
                    abstractC0339l2.f3844k = 0.0f;
                    abstractC0339l2.f3845l = Paint.Cap.BUTT;
                    abstractC0339l2.f3846m = Paint.Join.MITER;
                    abstractC0339l2.f3847n = 4.0f;
                    abstractC0339l2.d = c0336i.d;
                    abstractC0339l2.f3840e = c0336i.f3840e;
                    abstractC0339l2.f3842g = c0336i.f3842g;
                    abstractC0339l2.f3841f = c0336i.f3841f;
                    abstractC0339l2.f3858c = c0336i.f3858c;
                    abstractC0339l2.h = c0336i.h;
                    abstractC0339l2.i = c0336i.i;
                    abstractC0339l2.f3843j = c0336i.f3843j;
                    abstractC0339l2.f3844k = c0336i.f3844k;
                    abstractC0339l2.f3845l = c0336i.f3845l;
                    abstractC0339l2.f3846m = c0336i.f3846m;
                    abstractC0339l2.f3847n = c0336i.f3847n;
                    abstractC0339l = abstractC0339l2;
                } else if (obj instanceof C0335h) {
                    abstractC0339l = new AbstractC0339l((C0335h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f3849b.add(abstractC0339l);
                Object obj2 = abstractC0339l.f3857b;
                if (obj2 != null) {
                    fVar.put(obj2, abstractC0339l);
                }
            }
        }
    }
}
