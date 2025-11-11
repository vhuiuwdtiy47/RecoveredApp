package M;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f403a;

    /* renamed from: b, reason: collision with root package name */
    public final k f404b;

    /* renamed from: c, reason: collision with root package name */
    public final int f405c;

    public a(int i, k kVar, int i2) {
        this.f403a = i;
        this.f404b = kVar;
        this.f405c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f403a);
        this.f404b.f417a.performAction(this.f405c, bundle);
    }
}
