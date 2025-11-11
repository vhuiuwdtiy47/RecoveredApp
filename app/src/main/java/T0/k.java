package T0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import w0.AbstractC0373a;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public Z0.i f710a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public Z0.i f711b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public Z0.i f712c = new Object();
    public Z0.i d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public c f713e = new a(0.0f);

    /* renamed from: f, reason: collision with root package name */
    public c f714f = new a(0.0f);

    /* renamed from: g, reason: collision with root package name */
    public c f715g = new a(0.0f);
    public c h = new a(0.0f);
    public e i = new e(0);

    /* renamed from: j, reason: collision with root package name */
    public e f716j = new e(0);

    /* renamed from: k, reason: collision with root package name */
    public e f717k = new e(0);

    /* renamed from: l, reason: collision with root package name */
    public e f718l = new e(0);

    public static j a(Context context, int i, int i2, a aVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(AbstractC0373a.f4172z);
        try {
            int i3 = obtainStyledAttributes.getInt(0, 0);
            int i4 = obtainStyledAttributes.getInt(3, i3);
            int i5 = obtainStyledAttributes.getInt(4, i3);
            int i6 = obtainStyledAttributes.getInt(2, i3);
            int i7 = obtainStyledAttributes.getInt(1, i3);
            c c2 = c(obtainStyledAttributes, 5, aVar);
            c c3 = c(obtainStyledAttributes, 8, c2);
            c c4 = c(obtainStyledAttributes, 9, c2);
            c c5 = c(obtainStyledAttributes, 7, c2);
            c c6 = c(obtainStyledAttributes, 6, c2);
            j jVar = new j();
            Z0.i q2 = Z0.i.q(i4);
            jVar.f701a = q2;
            j.b(q2);
            jVar.f704e = c3;
            Z0.i q3 = Z0.i.q(i5);
            jVar.f702b = q3;
            j.b(q3);
            jVar.f705f = c4;
            Z0.i q4 = Z0.i.q(i6);
            jVar.f703c = q4;
            j.b(q4);
            jVar.f706g = c5;
            Z0.i q5 = Z0.i.q(i7);
            jVar.d = q5;
            j.b(q5);
            jVar.h = c6;
            return jVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static j b(Context context, AttributeSet attributeSet, int i, int i2) {
        a aVar = new a(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0373a.f4164r, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, aVar);
    }

    public static c c(TypedArray typedArray, int i, c cVar) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue != null) {
            int i2 = peekValue.type;
            if (i2 == 5) {
                return new a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new h(peekValue.getFraction(1.0f, 1.0f));
            }
        }
        return cVar;
    }

    public final boolean d(RectF rectF) {
        boolean z2 = this.f718l.getClass().equals(e.class) && this.f716j.getClass().equals(e.class) && this.i.getClass().equals(e.class) && this.f717k.getClass().equals(e.class);
        float a2 = this.f713e.a(rectF);
        return z2 && ((this.f714f.a(rectF) > a2 ? 1 : (this.f714f.a(rectF) == a2 ? 0 : -1)) == 0 && (this.h.a(rectF) > a2 ? 1 : (this.h.a(rectF) == a2 ? 0 : -1)) == 0 && (this.f715g.a(rectF) > a2 ? 1 : (this.f715g.a(rectF) == a2 ? 0 : -1)) == 0) && ((this.f711b instanceof i) && (this.f710a instanceof i) && (this.f712c instanceof i) && (this.d instanceof i));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, T0.j] */
    public final j e() {
        ?? obj = new Object();
        obj.f701a = this.f710a;
        obj.f702b = this.f711b;
        obj.f703c = this.f712c;
        obj.d = this.d;
        obj.f704e = this.f713e;
        obj.f705f = this.f714f;
        obj.f706g = this.f715g;
        obj.h = this.h;
        obj.i = this.i;
        obj.f707j = this.f716j;
        obj.f708k = this.f717k;
        obj.f709l = this.f718l;
        return obj;
    }
}
