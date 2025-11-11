package C;

import android.graphics.Color;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f39a;

    /* renamed from: b, reason: collision with root package name */
    public final float f40b;

    /* renamed from: c, reason: collision with root package name */
    public final float f41c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final float f42e;

    /* renamed from: f, reason: collision with root package name */
    public final float f43f;

    public a(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.f39a = f2;
        this.f40b = f3;
        this.f41c = f4;
        this.d = f5;
        this.f42e = f6;
        this.f43f = f7;
    }

    public static a a(int i) {
        s sVar = s.f76k;
        float e2 = b.e(Color.red(i));
        float e3 = b.e(Color.green(i));
        float e4 = b.e(Color.blue(i));
        float[][] fArr = b.d;
        float[] fArr2 = fArr[0];
        float f2 = (fArr2[2] * e4) + (fArr2[1] * e3) + (fArr2[0] * e2);
        float[] fArr3 = fArr[1];
        float f3 = (fArr3[2] * e4) + (fArr3[1] * e3) + (fArr3[0] * e2);
        float[] fArr4 = fArr[2];
        float f4 = (e4 * fArr4[2]) + (e3 * fArr4[1]) + (e2 * fArr4[0]);
        float[][] fArr5 = b.f44a;
        float[] fArr6 = fArr5[0];
        float f5 = (fArr6[2] * f4) + (fArr6[1] * f3) + (fArr6[0] * f2);
        float[] fArr7 = fArr5[1];
        float f6 = (fArr7[2] * f4) + (fArr7[1] * f3) + (fArr7[0] * f2);
        float[] fArr8 = fArr5[2];
        float f7 = (f4 * fArr8[2]) + (f3 * fArr8[1]) + (f2 * fArr8[0]);
        float[] fArr9 = sVar.f82g;
        float f8 = fArr9[0] * f5;
        float f9 = fArr9[1] * f6;
        float f10 = fArr9[2] * f7;
        float abs = Math.abs(f8);
        float f11 = sVar.h;
        float pow = (float) Math.pow((abs * f11) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((Math.abs(f9) * f11) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f10) * f11) / 100.0d, 0.42d);
        float signum = ((Math.signum(f8) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f9) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f10) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d = signum3;
        float f12 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d)) / 11.0f;
        float f13 = ((float) ((signum + signum2) - (d * 2.0d))) / 9.0f;
        float f14 = signum2 * 20.0f;
        float f15 = ((21.0f * signum3) + ((signum * 20.0f) + f14)) / 20.0f;
        float f16 = (((signum * 40.0f) + f14) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f13, f12)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f17 = atan2;
        float f18 = (3.1415927f * f17) / 180.0f;
        float f19 = f16 * sVar.f78b;
        float f20 = sVar.f77a;
        float f21 = sVar.d;
        float pow4 = ((float) Math.pow(f19 / f20, sVar.f83j * f21)) * 100.0f;
        Math.sqrt(pow4 / 100.0f);
        float f22 = f20 + 4.0f;
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, sVar.f81f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) f17) < 20.14d ? f17 + 360.0f : f17) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * sVar.f80e) * sVar.f79c) * ((float) Math.sqrt((f13 * f13) + (f12 * f12)))) / (f15 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow4 / 100.0d));
        float f23 = sVar.i * pow5;
        Math.sqrt((r3 * f21) / f22);
        float f24 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((f23 * 0.0228f) + 1.0f)) * 43.85965f;
        double d2 = f18;
        return new a(f17, pow5, pow4, f24, log * ((float) Math.cos(d2)), log * ((float) Math.sin(d2)));
    }

    public static a b(float f2, float f3, float f4) {
        s sVar = s.f76k;
        float f5 = sVar.d;
        Math.sqrt(f2 / 100.0d);
        float f6 = sVar.f77a + 4.0f;
        float f7 = sVar.i * f3;
        Math.sqrt(((f3 / ((float) Math.sqrt(r1))) * sVar.d) / f6);
        float f8 = (1.7f * f2) / ((0.007f * f2) + 1.0f);
        float log = ((float) Math.log((f7 * 0.0228d) + 1.0d)) * 43.85965f;
        double d = (3.1415927f * f4) / 180.0f;
        return new a(f4, f3, f2, f8, log * ((float) Math.cos(d)), log * ((float) Math.sin(d)));
    }

    public final int c(s sVar) {
        float f2;
        float f3 = this.f40b;
        double d = f3;
        float f4 = this.f41c;
        if (d != 0.0d) {
            double d2 = f4;
            if (d2 != 0.0d) {
                f2 = f3 / ((float) Math.sqrt(d2 / 100.0d));
                float pow = (float) Math.pow(f2 / Math.pow(1.64d - Math.pow(0.29d, sVar.f81f), 0.73d), 1.1111111111111112d);
                double d3 = (this.f39a * 3.1415927f) / 180.0f;
                float cos = ((float) (Math.cos(2.0d + d3) + 3.8d)) * 0.25f;
                float pow2 = sVar.f77a * ((float) Math.pow(f4 / 100.0d, (1.0d / sVar.d) / sVar.f83j));
                float f5 = cos * 3846.1538f * sVar.f80e * sVar.f79c;
                float f6 = pow2 / sVar.f78b;
                float sin = (float) Math.sin(d3);
                float cos2 = (float) Math.cos(d3);
                float f7 = (((0.305f + f6) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (((11.0f * pow) * cos2) + (f5 * 23.0f)));
                float f8 = cos2 * f7;
                float f9 = f7 * sin;
                float f10 = f6 * 460.0f;
                float f11 = ((288.0f * f9) + ((451.0f * f8) + f10)) / 1403.0f;
                float f12 = ((f10 - (891.0f * f8)) - (261.0f * f9)) / 1403.0f;
                float f13 = ((f10 - (f8 * 220.0f)) - (f9 * 6300.0f)) / 1403.0f;
                float max = (float) Math.max(0.0d, (Math.abs(f11) * 27.13d) / (400.0d - Math.abs(f11)));
                float signum = Math.signum(f11);
                float f14 = 100.0f / sVar.h;
                float pow3 = signum * f14 * ((float) Math.pow(max, 2.380952380952381d));
                float signum2 = Math.signum(f12) * f14 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f12) * 27.13d) / (400.0d - Math.abs(f12))), 2.380952380952381d));
                float signum3 = Math.signum(f13) * f14 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f13) * 27.13d) / (400.0d - Math.abs(f13))), 2.380952380952381d));
                float[] fArr = sVar.f82g;
                float f15 = pow3 / fArr[0];
                float f16 = signum2 / fArr[1];
                float f17 = signum3 / fArr[2];
                float[][] fArr2 = b.f45b;
                float[] fArr3 = fArr2[0];
                float f18 = (fArr3[2] * f17) + (fArr3[1] * f16) + (fArr3[0] * f15);
                float[] fArr4 = fArr2[1];
                float f19 = (fArr4[2] * f17) + (fArr4[1] * f16) + (fArr4[0] * f15);
                float[] fArr5 = fArr2[2];
                return D.a.a(f18, f19, (f17 * fArr5[2]) + (f16 * fArr5[1]) + (f15 * fArr5[0]));
            }
        }
        f2 = 0.0f;
        float pow4 = (float) Math.pow(f2 / Math.pow(1.64d - Math.pow(0.29d, sVar.f81f), 0.73d), 1.1111111111111112d);
        double d32 = (this.f39a * 3.1415927f) / 180.0f;
        float cos3 = ((float) (Math.cos(2.0d + d32) + 3.8d)) * 0.25f;
        float pow22 = sVar.f77a * ((float) Math.pow(f4 / 100.0d, (1.0d / sVar.d) / sVar.f83j));
        float f52 = cos3 * 3846.1538f * sVar.f80e * sVar.f79c;
        float f62 = pow22 / sVar.f78b;
        float sin2 = (float) Math.sin(d32);
        float cos22 = (float) Math.cos(d32);
        float f72 = (((0.305f + f62) * 23.0f) * pow4) / (((pow4 * 108.0f) * sin2) + (((11.0f * pow4) * cos22) + (f52 * 23.0f)));
        float f82 = cos22 * f72;
        float f92 = f72 * sin2;
        float f102 = f62 * 460.0f;
        float f112 = ((288.0f * f92) + ((451.0f * f82) + f102)) / 1403.0f;
        float f122 = ((f102 - (891.0f * f82)) - (261.0f * f92)) / 1403.0f;
        float f132 = ((f102 - (f82 * 220.0f)) - (f92 * 6300.0f)) / 1403.0f;
        float max2 = (float) Math.max(0.0d, (Math.abs(f112) * 27.13d) / (400.0d - Math.abs(f112)));
        float signum4 = Math.signum(f112);
        float f142 = 100.0f / sVar.h;
        float pow32 = signum4 * f142 * ((float) Math.pow(max2, 2.380952380952381d));
        float signum22 = Math.signum(f122) * f142 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f122) * 27.13d) / (400.0d - Math.abs(f122))), 2.380952380952381d));
        float signum32 = Math.signum(f132) * f142 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f132) * 27.13d) / (400.0d - Math.abs(f132))), 2.380952380952381d));
        float[] fArr6 = sVar.f82g;
        float f152 = pow32 / fArr6[0];
        float f162 = signum22 / fArr6[1];
        float f172 = signum32 / fArr6[2];
        float[][] fArr22 = b.f45b;
        float[] fArr32 = fArr22[0];
        float f182 = (fArr32[2] * f172) + (fArr32[1] * f162) + (fArr32[0] * f152);
        float[] fArr42 = fArr22[1];
        float f192 = (fArr42[2] * f172) + (fArr42[1] * f162) + (fArr42[0] * f152);
        float[] fArr52 = fArr22[2];
        return D.a.a(f182, f192, (f172 * fArr52[2]) + (f162 * fArr52[1]) + (f152 * fArr52[0]));
    }
}
