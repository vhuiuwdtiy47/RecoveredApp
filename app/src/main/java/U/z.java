package U;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class z extends ReplacementSpan {

    /* renamed from: b, reason: collision with root package name */
    public final y f801b;

    /* renamed from: e, reason: collision with root package name */
    public TextPaint f803e;

    /* renamed from: a, reason: collision with root package name */
    public final Paint.FontMetricsInt f800a = new Paint.FontMetricsInt();

    /* renamed from: c, reason: collision with root package name */
    public short f802c = -1;
    public float d = 1.0f;

    public z(y yVar) {
        Z0.i.i(yVar, "rasterizer cannot be null");
        this.f801b = yVar;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f2, int i3, int i4, int i5, Paint paint) {
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i2, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.f803e;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.f803e = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        characterStyle.updateDrawState(textPaint);
                    }
                }
            }
            if (paint instanceof TextPaint) {
                textPaint = (TextPaint) paint;
            }
        } else if (paint instanceof TextPaint) {
            textPaint = (TextPaint) paint;
        }
        TextPaint textPaint3 = textPaint;
        if (textPaint3 != null && textPaint3.bgColor != 0) {
            int color = textPaint3.getColor();
            Paint.Style style = textPaint3.getStyle();
            textPaint3.setColor(textPaint3.bgColor);
            textPaint3.setStyle(Paint.Style.FILL);
            canvas.drawRect(f2, i3, f2 + this.f802c, i5, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        i.a().getClass();
        float f3 = i4;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        y yVar = this.f801b;
        v vVar = yVar.f798b;
        Typeface typeface = (Typeface) vVar.d;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) vVar.f791b, yVar.f797a * 2, 2, f2, f3, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f800a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        y yVar = this.f801b;
        this.d = abs / (yVar.b().a(14) != 0 ? ((ByteBuffer) r8.d).getShort(r1 + r8.f304a) : (short) 0);
        V.a b2 = yVar.b();
        int a2 = b2.a(14);
        if (a2 != 0) {
            ((ByteBuffer) b2.d).getShort(a2 + b2.f304a);
        }
        short s2 = (short) ((yVar.b().a(12) != 0 ? ((ByteBuffer) r5.d).getShort(r7 + r5.f304a) : (short) 0) * this.d);
        this.f802c = s2;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s2;
    }
}
