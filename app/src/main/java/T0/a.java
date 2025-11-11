package T0;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f663a;

    public a(float f2) {
        this.f663a = f2;
    }

    @Override // T0.c
    public final float a(RectF rectF) {
        return this.f663a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f663a == ((a) obj).f663a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f663a)});
    }
}
