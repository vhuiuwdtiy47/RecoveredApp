package h0;

import androidx.lifecycle.EnumC0091n;

/* renamed from: h0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0153c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f2574a;

    static {
        int[] iArr = new int[EnumC0091n.values().length];
        try {
            iArr[EnumC0091n.ON_CREATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC0091n.ON_RESUME.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC0091n.ON_STOP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EnumC0091n.ON_DESTROY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f2574a = iArr;
    }
}
