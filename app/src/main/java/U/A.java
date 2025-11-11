package U;

import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* loaded from: classes.dex */
public final class A implements Spannable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f746a = false;

    /* renamed from: b, reason: collision with root package name */
    public Spannable f747b;

    public A(Spannable spannable) {
        this.f747b = spannable;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f747b.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f747b.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f747b.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f747b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f747b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f747b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.f747b.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f747b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.f747b.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        Spannable spannable = this.f747b;
        if (!this.f746a && (spannable instanceof PrecomputedText)) {
            this.f747b = new SpannableString(spannable);
        }
        this.f746a = true;
        this.f747b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        Spannable spannable = this.f747b;
        if (!this.f746a && (spannable instanceof PrecomputedText)) {
            this.f747b = new SpannableString(spannable);
        }
        this.f746a = true;
        this.f747b.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.f747b.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f747b.toString();
    }
}
