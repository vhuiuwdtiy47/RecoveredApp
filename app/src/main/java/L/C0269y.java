package l;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import f.AbstractC0117a;

/* renamed from: l.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0269y {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f3180a;

    /* renamed from: b, reason: collision with root package name */
    public final A0.c f3181b;

    public C0269y(TextView textView) {
        this.f3180a = textView;
        this.f3181b = new A0.c(textView);
    }

    public final void a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f3180a.getContext().obtainStyledAttributes(attributeSet, AbstractC0117a.i, i, 0);
        try {
            boolean z2 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            c(z2);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void b(boolean z2) {
        ((U.t) this.f3181b.f33b).X(z2);
    }

    public final void c(boolean z2) {
        ((U.t) this.f3181b.f33b).Z(z2);
    }
}
