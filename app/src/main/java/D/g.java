package D;

import Z0.i;
import android.graphics.Path;
import android.util.Log;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public char f96a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f97b;

    public g(char c2, float[] fArr) {
        this.f96a = c2;
        this.f97b = fArr;
    }

    public static void a(Path path, float f2, float f3, float f4, float f5, float f6, float f7, float f8, boolean z2, boolean z3) {
        double d;
        double d2;
        double radians = Math.toRadians(f8);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d3 = f2;
        double d4 = f3;
        double d5 = f6;
        double d6 = ((d4 * sin) + (d3 * cos)) / d5;
        double d7 = f7;
        double d8 = ((d4 * cos) + ((-f2) * sin)) / d7;
        double d9 = f5;
        double d10 = ((d9 * sin) + (f4 * cos)) / d5;
        double d11 = ((d9 * cos) + ((-f4) * sin)) / d7;
        double d12 = d6 - d10;
        double d13 = d8 - d11;
        double d14 = (d6 + d10) / 2.0d;
        double d15 = (d8 + d11) / 2.0d;
        double d16 = (d13 * d13) + (d12 * d12);
        if (d16 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d17 = (1.0d / d16) - 0.25d;
        if (d17 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d16);
            float sqrt = (float) (Math.sqrt(d16) / 1.99999d);
            a(path, f2, f3, f4, f5, f6 * sqrt, sqrt * f7, f8, z2, z3);
            return;
        }
        double sqrt2 = Math.sqrt(d17);
        double d18 = sqrt2 * d12;
        double d19 = sqrt2 * d13;
        if (z2 == z3) {
            d = d14 - d19;
            d2 = d15 + d18;
        } else {
            d = d14 + d19;
            d2 = d15 - d18;
        }
        double atan2 = Math.atan2(d8 - d2, d6 - d);
        double atan22 = Math.atan2(d11 - d2, d10 - d) - atan2;
        if (z3 != (atan22 >= 0.0d)) {
            atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d20 = d * d5;
        double d21 = d2 * d7;
        double d22 = (d20 * cos) - (d21 * sin);
        double d23 = (d21 * cos) + (d20 * sin);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(radians);
        double sin2 = Math.sin(radians);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d24 = -d5;
        double d25 = d24 * cos2;
        double d26 = d7 * sin2;
        double d27 = (d25 * sin3) - (d26 * cos3);
        double d28 = d24 * sin2;
        double d29 = d7 * cos2;
        double d30 = atan22 / ceil;
        double d31 = (cos3 * d29) + (sin3 * d28);
        double d32 = d3;
        double d33 = d4;
        int i = 0;
        double d34 = atan2;
        while (i < ceil) {
            double d35 = d34 + d30;
            double sin4 = Math.sin(d35);
            double cos4 = Math.cos(d35);
            int i2 = ceil;
            double d36 = (((d5 * cos2) * cos4) + d22) - (d26 * sin4);
            double d37 = (d29 * sin4) + (d5 * sin2 * cos4) + d23;
            double d38 = (d25 * sin4) - (d26 * cos4);
            double d39 = (cos4 * d29) + (sin4 * d28);
            double d40 = d35 - d34;
            double tan = Math.tan(d40 / 2.0d);
            double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d40)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d27 * sqrt3) + d32), (float) ((d31 * sqrt3) + d33), (float) (d36 - (sqrt3 * d38)), (float) (d37 - (sqrt3 * d39)), (float) d36, (float) d37);
            i++;
            d33 = d37;
            cos2 = cos2;
            d28 = d28;
            d34 = d35;
            d31 = d39;
            d32 = d36;
            ceil = i2;
            d27 = d38;
            d30 = d30;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(g[] gVarArr, Path path) {
        int i;
        int i2;
        g gVar;
        int i3;
        char c2;
        float f2;
        float f3;
        float f4;
        float f5;
        g gVar2;
        boolean z2;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        Path path2 = path;
        float[] fArr = new float[6];
        int length = gVarArr.length;
        char c3 = 'm';
        int i4 = 0;
        char c4 = 'm';
        int i5 = 0;
        while (i5 < length) {
            g gVar3 = gVarArr[i5];
            char c5 = gVar3.f96a;
            float f14 = fArr[i4];
            float f15 = fArr[1];
            float f16 = fArr[2];
            float f17 = fArr[3];
            float f18 = fArr[4];
            float f19 = fArr[5];
            switch (c5) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path2.close();
                    path2.moveTo(f18, f19);
                    f14 = f18;
                    f16 = f14;
                    f15 = f19;
                    f17 = f15;
                    break;
            }
            i = 2;
            float f20 = f15;
            float f21 = f18;
            float f22 = f19;
            float f23 = f14;
            int i6 = i4;
            while (true) {
                float[] fArr2 = gVar3.f97b;
                if (i6 < fArr2.length) {
                    int i7 = i4;
                    if (c5 == 'A') {
                        i2 = i6;
                        gVar = gVar3;
                        float f24 = f23;
                        float f25 = f20;
                        i3 = i5;
                        c2 = c5;
                        int i8 = i2 + 5;
                        int i9 = i2 + 6;
                        a(path, f24, f25, fArr2[i8], fArr2[i9], fArr2[i2], fArr2[i2 + 1], fArr2[i2 + 2], fArr2[i2 + 3] != 0.0f ? 1 : i7, fArr2[i2 + 4] != 0.0f ? 1 : i7);
                        f16 = fArr2[i8];
                        f2 = fArr2[i9];
                        f17 = f2;
                        f3 = f16;
                    } else if (c5 == 'C') {
                        i2 = i6;
                        i3 = i5;
                        gVar = gVar3;
                        c2 = c5;
                        int i10 = i2 + 2;
                        int i11 = i2 + 3;
                        int i12 = i2 + 4;
                        int i13 = i2 + 5;
                        path2.cubicTo(fArr2[i2], fArr2[i2 + 1], fArr2[i10], fArr2[i11], fArr2[i12], fArr2[i13]);
                        float f26 = fArr2[i12];
                        float f27 = fArr2[i13];
                        f16 = fArr2[i10];
                        f17 = fArr2[i11];
                        f2 = f27;
                        f3 = f26;
                    } else if (c5 != 'H') {
                        if (c5 == 'Q') {
                            i2 = i6;
                            i3 = i5;
                            gVar = gVar3;
                            c2 = c5;
                            int i14 = i2 + 1;
                            int i15 = i2 + 2;
                            int i16 = i2 + 3;
                            path2.quadTo(fArr2[i2], fArr2[i14], fArr2[i15], fArr2[i16]);
                            f4 = fArr2[i2];
                            float f28 = fArr2[i14];
                            f5 = fArr2[i15];
                            f17 = f28;
                            f2 = fArr2[i16];
                        } else if (c5 == 'V') {
                            i2 = i6;
                            i3 = i5;
                            gVar = gVar3;
                            f3 = f23;
                            c2 = c5;
                            path2.lineTo(f3, fArr2[i2]);
                            f2 = fArr2[i2];
                        } else if (c5 != 'a') {
                            if (c5 == 'c') {
                                i2 = i6;
                                int i17 = i2 + 2;
                                int i18 = i2 + 3;
                                int i19 = i2 + 4;
                                int i20 = i2 + 5;
                                path2.rCubicTo(fArr2[i2], fArr2[i2 + 1], fArr2[i17], fArr2[i18], fArr2[i19], fArr2[i20]);
                                float f29 = fArr2[i17] + f23;
                                float f30 = f20 + fArr2[i18];
                                f23 += fArr2[i19];
                                f20 += fArr2[i20];
                                f16 = f29;
                                f17 = f30;
                            } else if (c5 != 'h') {
                                if (c5 != 'q') {
                                    if (c5 != 'v') {
                                        if (c5 == 'L') {
                                            i2 = i6;
                                            int i21 = i2 + 1;
                                            path2.lineTo(fArr2[i2], fArr2[i21]);
                                            f3 = fArr2[i2];
                                            f2 = fArr2[i21];
                                        } else if (c5 == 'M') {
                                            i2 = i6;
                                            f3 = fArr2[i2];
                                            f2 = fArr2[i2 + 1];
                                            if (i2 > 0) {
                                                path2.lineTo(f3, f2);
                                            } else {
                                                path2.moveTo(f3, f2);
                                                f21 = f3;
                                                f22 = f2;
                                            }
                                        } else if (c5 == 'S') {
                                            i2 = i6;
                                            if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                                                f23 = (f23 * 2.0f) - f16;
                                                f20 = (f20 * 2.0f) - f17;
                                            }
                                            float f31 = f23;
                                            float f32 = f20;
                                            int i22 = i2 + 1;
                                            int i23 = i2 + 2;
                                            int i24 = i2 + 3;
                                            path2.cubicTo(f31, f32, fArr2[i2], fArr2[i22], fArr2[i23], fArr2[i24]);
                                            f4 = fArr2[i2];
                                            float f33 = fArr2[i22];
                                            f5 = fArr2[i23];
                                            f17 = f33;
                                            f2 = fArr2[i24];
                                            i3 = i5;
                                            gVar = gVar3;
                                            c2 = c5;
                                        } else if (c5 == 'T') {
                                            i2 = i6;
                                            if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                                                f23 = (f23 * 2.0f) - f16;
                                                f20 = (f20 * 2.0f) - f17;
                                            }
                                            float f34 = f20;
                                            float f35 = fArr2[i2];
                                            int i25 = i2 + 1;
                                            path2.quadTo(f23, f34, f35, fArr2[i25]);
                                            f17 = f34;
                                            f3 = fArr2[i2];
                                            f2 = fArr2[i25];
                                            i3 = i5;
                                            gVar = gVar3;
                                            f16 = f23;
                                            c2 = c5;
                                        } else if (c5 == 'l') {
                                            i2 = i6;
                                            int i26 = i2 + 1;
                                            path2.rLineTo(fArr2[i2], fArr2[i26]);
                                            f23 += fArr2[i2];
                                            f9 = fArr2[i26];
                                        } else if (c5 == c3) {
                                            i2 = i6;
                                            float f36 = fArr2[i2];
                                            f23 += f36;
                                            float f37 = fArr2[i2 + 1];
                                            f20 += f37;
                                            if (i2 > 0) {
                                                path2.rLineTo(f36, f37);
                                            } else {
                                                path2.rMoveTo(f36, f37);
                                                gVar = gVar3;
                                                f3 = f23;
                                                f21 = f3;
                                                f2 = f20;
                                                f22 = f2;
                                                i3 = i5;
                                                c2 = c5;
                                            }
                                        } else if (c5 == 's') {
                                            if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                                                f10 = f20 - f17;
                                                f11 = f23 - f16;
                                            } else {
                                                f11 = 0.0f;
                                                f10 = 0.0f;
                                            }
                                            int i27 = i6 + 1;
                                            int i28 = i6 + 2;
                                            int i29 = i6 + 3;
                                            i2 = i6;
                                            path2.rCubicTo(f11, f10, fArr2[i6], fArr2[i27], fArr2[i28], fArr2[i29]);
                                            f6 = fArr2[i2] + f23;
                                            f7 = f20 + fArr2[i27];
                                            f23 += fArr2[i28];
                                            f8 = fArr2[i29];
                                        } else if (c5 != 't') {
                                            i2 = i6;
                                        } else {
                                            if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                                                f12 = f23 - f16;
                                                f13 = f20 - f17;
                                            } else {
                                                f13 = 0.0f;
                                                f12 = 0.0f;
                                            }
                                            int i30 = i6 + 1;
                                            path2.rQuadTo(f12, f13, fArr2[i6], fArr2[i30]);
                                            float f38 = f12 + f23;
                                            float f39 = f20 + f13;
                                            float f40 = f23 + fArr2[i6];
                                            f20 += fArr2[i30];
                                            f17 = f39;
                                            i2 = i6;
                                            gVar = gVar3;
                                            f3 = f40;
                                            f16 = f38;
                                            f2 = f20;
                                            i3 = i5;
                                            c2 = c5;
                                        }
                                        i3 = i5;
                                        gVar = gVar3;
                                        c2 = c5;
                                    } else {
                                        i2 = i6;
                                        path2.rLineTo(0.0f, fArr2[i2]);
                                        f9 = fArr2[i2];
                                    }
                                    f20 += f9;
                                } else {
                                    i2 = i6;
                                    int i31 = i2 + 1;
                                    int i32 = i2 + 2;
                                    int i33 = i2 + 3;
                                    path2.rQuadTo(fArr2[i2], fArr2[i31], fArr2[i32], fArr2[i33]);
                                    f6 = fArr2[i2] + f23;
                                    f7 = f20 + fArr2[i31];
                                    f23 += fArr2[i32];
                                    f8 = fArr2[i33];
                                }
                                f20 += f8;
                                f16 = f6;
                                f17 = f7;
                            } else {
                                i2 = i6;
                                path2.rLineTo(fArr2[i2], 0.0f);
                                f23 += fArr2[i2];
                            }
                            gVar = gVar3;
                            f3 = f23;
                            f2 = f20;
                            i3 = i5;
                            c2 = c5;
                        } else {
                            i2 = i6;
                            int i34 = i2 + 5;
                            float f41 = fArr2[i34] + f23;
                            int i35 = i2 + 6;
                            float f42 = fArr2[i35] + f20;
                            float f43 = fArr2[i2];
                            float f44 = fArr2[i2 + 1];
                            float f45 = fArr2[i2 + 2];
                            if (fArr2[i2 + 3] != 0.0f) {
                                gVar2 = gVar3;
                                z2 = 1;
                            } else {
                                gVar2 = gVar3;
                                z2 = i7;
                            }
                            gVar = gVar2;
                            float f46 = f23;
                            c2 = c5;
                            float f47 = f20;
                            i3 = i5;
                            a(path, f46, f47, f41, f42, f43, f44, f45, z2, fArr2[i2 + 4] != 0.0f ? 1 : i7);
                            f3 = f46 + fArr2[i34];
                            f2 = f47 + fArr2[i35];
                            f16 = f3;
                            f17 = f2;
                        }
                        f16 = f4;
                        f3 = f5;
                    } else {
                        i2 = i6;
                        gVar = gVar3;
                        c2 = c5;
                        f2 = f20;
                        i3 = i5;
                        path2.lineTo(fArr2[i2], f2);
                        f3 = fArr2[i2];
                    }
                    c5 = c2;
                    gVar3 = gVar;
                    i5 = i3;
                    i4 = i7;
                    c3 = 'm';
                    f23 = f3;
                    f20 = f2;
                    c4 = c5;
                    i6 = i2 + i;
                    path2 = path;
                }
            }
            int i36 = i4;
            fArr[i36] = f23;
            fArr[1] = f20;
            fArr[2] = f16;
            fArr[3] = f17;
            fArr[4] = f21;
            fArr[5] = f22;
            c4 = gVar3.f96a;
            i5++;
            path2 = path;
            i4 = i36;
            c3 = 'm';
        }
    }

    public g(g gVar) {
        this.f96a = gVar.f96a;
        float[] fArr = gVar.f97b;
        this.f97b = i.o(fArr, fArr.length);
    }
}
