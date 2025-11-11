package h0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import f0.v;

/* loaded from: classes.dex */
public final class k extends v {

    /* renamed from: g, reason: collision with root package name */
    public String f2596g;

    @Override // f0.v
    public final void e(Context context, AttributeSet attributeSet) {
        super.e(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, n.f2601b);
        q1.d.d(obtainAttributes, "obtainAttributes(...)");
        String string = obtainAttributes.getString(0);
        if (string != null) {
            this.f2596g = string;
        }
        obtainAttributes.recycle();
    }

    @Override // f0.v
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof k) && super.equals(obj) && q1.d.a(this.f2596g, ((k) obj).f2596g);
    }

    @Override // f0.v
    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.f2596g;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // f0.v
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" class=");
        String str = this.f2596g;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        String sb2 = sb.toString();
        q1.d.d(sb2, "toString(...)");
        return sb2;
    }
}
