package T0;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final c f664a;

    /* renamed from: b, reason: collision with root package name */
    public final float f665b;

    public b(float f2, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f664a;
            f2 += ((b) cVar).f665b;
        }
        this.f664a = cVar;
        this.f665b = f2;
    }

    @Override // T0.c
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f664a.a(rectF) + this.f665b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f664a.equals(bVar.f664a) && this.f665b == bVar.f665b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f664a, Float.valueOf(this.f665b)});
    }
}
