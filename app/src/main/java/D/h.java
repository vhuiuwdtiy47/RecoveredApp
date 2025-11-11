package D;

import I.i;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import n0.e0;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final T0.e f98a = new T0.e();

    /* renamed from: b, reason: collision with root package name */
    public static final e0 f99b = new e0(16);

    public static Typeface a(Context context, i[] iVarArr, int i) {
        int i2;
        ParcelFileDescriptor openFileDescriptor;
        f98a.getClass();
        ContentResolver contentResolver = context.getContentResolver();
        try {
            int length = iVarArr.length;
            FontFamily.Builder builder = null;
            while (i2 < length) {
                i iVar = iVarArr[i2];
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(iVar.f273a, "r", null);
                } catch (IOException unused) {
                }
                if (openFileDescriptor != null) {
                    try {
                        Font build = new Font.Builder(openFileDescriptor).setWeight(iVar.f275c).setSlant(iVar.d ? 1 : 0).setTtcIndex(iVar.f274b).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                    } catch (Throwable th) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                        break;
                    }
                } else {
                    i2 = openFileDescriptor == null ? i2 + 1 : 0;
                }
                openFileDescriptor.close();
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(T0.e.a(build2, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        if (r1.equals(r2) == false) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface b(android.content.Context r12, C.f r13, android.content.res.Resources r14, int r15, java.lang.String r16, int r17, int r18, C.b r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D.h.b(android.content.Context, C.f, android.content.res.Resources, int, java.lang.String, int, int, C.b, boolean):android.graphics.Typeface");
    }

    public static Typeface c(Resources resources, int i, String str, int i2, int i3) {
        Typeface typeface;
        f98a.getClass();
        try {
            Font build = new Font.Builder(resources, i).build();
            typeface = new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            typeface = null;
        }
        if (typeface != null) {
            f99b.j(d(resources, i, str, i2, i3), typeface);
        }
        return typeface;
    }

    public static String d(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}
