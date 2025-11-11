package Q0;

import Z0.i;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* loaded from: classes.dex */
public final class c extends i {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Context f589f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ TextPaint f590g;
    public final /* synthetic */ i h;
    public final /* synthetic */ d i;

    public c(d dVar, Context context, TextPaint textPaint, i iVar) {
        this.i = dVar;
        this.f589f = context;
        this.f590g = textPaint;
        this.h = iVar;
    }

    @Override // Z0.i
    public final void R(int i) {
        this.h.R(i);
    }

    @Override // Z0.i
    public final void S(Typeface typeface, boolean z2) {
        this.i.g(this.f589f, this.f590g, typeface);
        this.h.S(typeface, z2);
    }
}
