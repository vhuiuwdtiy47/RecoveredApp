package androidx.lifecycle;

import com.tencent.wechat.Platform;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0091n {
    private static final /* synthetic */ m1.a $ENTRIES;
    private static final /* synthetic */ EnumC0091n[] $VALUES;
    public static final C0089l Companion;
    public static final EnumC0091n ON_ANY;
    public static final EnumC0091n ON_CREATE;
    public static final EnumC0091n ON_DESTROY;
    public static final EnumC0091n ON_PAUSE;
    public static final EnumC0091n ON_RESUME;
    public static final EnumC0091n ON_START;
    public static final EnumC0091n ON_STOP;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.lifecycle.n] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, androidx.lifecycle.l] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.lifecycle.n] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.lifecycle.n] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, androidx.lifecycle.n] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, androidx.lifecycle.n] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, androidx.lifecycle.n] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, androidx.lifecycle.n] */
    static {
        ?? r0 = new Enum("ON_CREATE", 0);
        ON_CREATE = r0;
        ?? r12 = new Enum("ON_START", 1);
        ON_START = r12;
        ?? r2 = new Enum("ON_RESUME", 2);
        ON_RESUME = r2;
        ?? r3 = new Enum("ON_PAUSE", 3);
        ON_PAUSE = r3;
        ?? r4 = new Enum("ON_STOP", 4);
        ON_STOP = r4;
        ?? r5 = new Enum("ON_DESTROY", 5);
        ON_DESTROY = r5;
        ?? r6 = new Enum("ON_ANY", 6);
        ON_ANY = r6;
        EnumC0091n[] enumC0091nArr = {r0, r12, r2, r3, r4, r5, r6};
        $VALUES = enumC0091nArr;
        $ENTRIES = new m1.b(enumC0091nArr);
        Companion = new Object();
    }

    public static EnumC0091n valueOf(String str) {
        return (EnumC0091n) Enum.valueOf(EnumC0091n.class, str);
    }

    public static EnumC0091n[] values() {
        return (EnumC0091n[]) $VALUES.clone();
    }

    public final EnumC0092o a() {
        switch (AbstractC0090m.f1589a[ordinal()]) {
            case 1:
            case 2:
                return EnumC0092o.f1592c;
            case 3:
            case Platform.INFO /* 4 */:
                return EnumC0092o.d;
            case Platform.WARN /* 5 */:
                return EnumC0092o.f1593e;
            case 6:
                return EnumC0092o.f1590a;
            case 7:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                throw new RuntimeException();
        }
    }
}
