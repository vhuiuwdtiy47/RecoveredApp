package W;

import android.text.InputFilter;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class d implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f824a;

    /* renamed from: b, reason: collision with root package name */
    public c f825b;

    public d(TextView textView) {
        this.f824a = textView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r1 != 3) goto L27;
     */
    @Override // android.text.InputFilter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence filter(java.lang.CharSequence r4, int r5, int r6, android.text.Spanned r7, int r8, int r9) {
        /*
            r3 = this;
            android.widget.TextView r0 = r3.f824a
            boolean r1 = r0.isInEditMode()
            if (r1 == 0) goto L9
            goto L48
        L9:
            U.i r1 = U.i.a()
            int r1 = r1.b()
            if (r1 == 0) goto L49
            r2 = 1
            if (r1 == r2) goto L1a
            r5 = 3
            if (r1 == r5) goto L49
            goto L48
        L1a:
            if (r9 != 0) goto L2b
            if (r8 != 0) goto L2b
            int r3 = r7.length()
            if (r3 != 0) goto L2b
            java.lang.CharSequence r3 = r0.getText()
            if (r4 != r3) goto L2b
            goto L48
        L2b:
            if (r4 == 0) goto L48
            if (r5 != 0) goto L36
            int r3 = r4.length()
            if (r6 != r3) goto L36
            goto L3a
        L36:
            java.lang.CharSequence r4 = r4.subSequence(r5, r6)
        L3a:
            U.i r3 = U.i.a()
            int r5 = r4.length()
            r6 = 0
            java.lang.CharSequence r3 = r3.e(r4, r6, r5)
            return r3
        L48:
            return r4
        L49:
            U.i r5 = U.i.a()
            W.c r6 = r3.f825b
            if (r6 != 0) goto L58
            W.c r6 = new W.c
            r6.<init>(r0, r3)
            r3.f825b = r6
        L58:
            W.c r3 = r3.f825b
            r5.f(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: W.d.filter(java.lang.CharSequence, int, int, android.text.Spanned, int, int):java.lang.CharSequence");
    }
}
