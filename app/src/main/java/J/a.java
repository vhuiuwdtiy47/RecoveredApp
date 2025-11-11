package J;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f281e = new byte[1792];

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f282a;

    /* renamed from: b, reason: collision with root package name */
    public final int f283b;

    /* renamed from: c, reason: collision with root package name */
    public int f284c;
    public char d;

    static {
        for (int i = 0; i < 1792; i++) {
            f281e[i] = Character.getDirectionality(i);
        }
    }

    public a(CharSequence charSequence) {
        this.f282a = charSequence;
        this.f283b = charSequence.length();
    }

    public final byte a() {
        int i = this.f284c - 1;
        CharSequence charSequence = this.f282a;
        char charAt = charSequence.charAt(i);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f284c);
            this.f284c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f284c--;
        char c2 = this.d;
        return c2 < 1792 ? f281e[c2] : Character.getDirectionality(c2);
    }
}
