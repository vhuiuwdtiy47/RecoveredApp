package M0;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f482a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f483b;

    /* renamed from: c, reason: collision with root package name */
    public final int f484c;
    public int d;

    /* renamed from: j, reason: collision with root package name */
    public boolean f488j;

    /* renamed from: e, reason: collision with root package name */
    public Layout.Alignment f485e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f, reason: collision with root package name */
    public int f486f = Integer.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public float f487g = 1.0f;
    public int h = 1;
    public boolean i = true;

    /* renamed from: k, reason: collision with root package name */
    public TextUtils.TruncateAt f489k = null;

    public h(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f482a = charSequence;
        this.f483b = textPaint;
        this.f484c = i;
        this.d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.f482a == null) {
            this.f482a = "";
        }
        int max = Math.max(0, this.f484c);
        CharSequence charSequence = this.f482a;
        int i = this.f486f;
        TextPaint textPaint = this.f483b;
        if (i == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.f489k);
        }
        int min = Math.min(charSequence.length(), this.d);
        this.d = min;
        if (this.f488j && this.f486f == 1) {
            this.f485e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.f485e);
        obtain.setIncludePad(this.i);
        obtain.setTextDirection(this.f488j ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f489k;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f486f);
        float f2 = this.f487g;
        if (f2 != 1.0f) {
            obtain.setLineSpacing(0.0f, f2);
        }
        if (this.f486f > 1) {
            obtain.setHyphenationFrequency(this.h);
        }
        return obtain.build();
    }
}
