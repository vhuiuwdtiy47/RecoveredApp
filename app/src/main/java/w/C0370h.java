package w;

import java.util.Arrays;

/* renamed from: w.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0370h {

    /* renamed from: a, reason: collision with root package name */
    public int[] f4033a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f4034b;

    /* renamed from: c, reason: collision with root package name */
    public int f4035c;
    public int[] d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f4036e;

    /* renamed from: f, reason: collision with root package name */
    public int f4037f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f4038g;
    public String[] h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f4039j;

    /* renamed from: k, reason: collision with root package name */
    public boolean[] f4040k;

    /* renamed from: l, reason: collision with root package name */
    public int f4041l;

    public final void a(int i, float f2) {
        int i2 = this.f4037f;
        int[] iArr = this.d;
        if (i2 >= iArr.length) {
            this.d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f4036e;
            this.f4036e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.d;
        int i3 = this.f4037f;
        iArr2[i3] = i;
        float[] fArr2 = this.f4036e;
        this.f4037f = i3 + 1;
        fArr2[i3] = f2;
    }

    public final void b(int i, int i2) {
        int i3 = this.f4035c;
        int[] iArr = this.f4033a;
        if (i3 >= iArr.length) {
            this.f4033a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f4034b;
            this.f4034b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f4033a;
        int i4 = this.f4035c;
        iArr3[i4] = i;
        int[] iArr4 = this.f4034b;
        this.f4035c = i4 + 1;
        iArr4[i4] = i2;
    }

    public final void c(int i, boolean z2) {
        int i2 = this.f4041l;
        int[] iArr = this.f4039j;
        if (i2 >= iArr.length) {
            this.f4039j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f4040k;
            this.f4040k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f4039j;
        int i3 = this.f4041l;
        iArr2[i3] = i;
        boolean[] zArr2 = this.f4040k;
        this.f4041l = i3 + 1;
        zArr2[i3] = z2;
    }

    public final void d(String str, int i) {
        int i2 = this.i;
        int[] iArr = this.f4038g;
        if (i2 >= iArr.length) {
            this.f4038g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.h;
            this.h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f4038g;
        int i3 = this.i;
        iArr2[i3] = i;
        String[] strArr2 = this.h;
        this.i = i3 + 1;
        strArr2[i3] = str;
    }
}
