package T0;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public class f extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public k f669a;

    /* renamed from: b, reason: collision with root package name */
    public L0.a f670b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f671c;
    public ColorStateList d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f672e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f673f;

    /* renamed from: g, reason: collision with root package name */
    public Rect f674g;
    public final float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f675j;

    /* renamed from: k, reason: collision with root package name */
    public int f676k;

    /* renamed from: l, reason: collision with root package name */
    public float f677l;

    /* renamed from: m, reason: collision with root package name */
    public float f678m;

    /* renamed from: n, reason: collision with root package name */
    public int f679n;

    /* renamed from: o, reason: collision with root package name */
    public int f680o;

    /* renamed from: p, reason: collision with root package name */
    public final Paint.Style f681p;

    public f(k kVar) {
        this.f671c = null;
        this.d = null;
        this.f672e = null;
        this.f673f = PorterDuff.Mode.SRC_IN;
        this.f674g = null;
        this.h = 1.0f;
        this.i = 1.0f;
        this.f676k = 255;
        this.f677l = 0.0f;
        this.f678m = 0.0f;
        this.f679n = 0;
        this.f680o = 0;
        this.f681p = Paint.Style.FILL_AND_STROKE;
        this.f669a = kVar;
        this.f670b = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        g gVar = new g(this);
        gVar.f686e = true;
        return gVar;
    }

    public f(f fVar) {
        this.f671c = null;
        this.d = null;
        this.f672e = null;
        this.f673f = PorterDuff.Mode.SRC_IN;
        this.f674g = null;
        this.h = 1.0f;
        this.i = 1.0f;
        this.f676k = 255;
        this.f677l = 0.0f;
        this.f678m = 0.0f;
        this.f679n = 0;
        this.f680o = 0;
        this.f681p = Paint.Style.FILL_AND_STROKE;
        this.f669a = fVar.f669a;
        this.f670b = fVar.f670b;
        this.f675j = fVar.f675j;
        this.f671c = fVar.f671c;
        this.d = fVar.d;
        this.f673f = fVar.f673f;
        this.f672e = fVar.f672e;
        this.f676k = fVar.f676k;
        this.h = fVar.h;
        this.f680o = fVar.f680o;
        this.i = fVar.i;
        this.f677l = fVar.f677l;
        this.f678m = fVar.f678m;
        this.f679n = fVar.f679n;
        this.f681p = fVar.f681p;
        if (fVar.f674g != null) {
            this.f674g = new Rect(fVar.f674g);
        }
    }
}
