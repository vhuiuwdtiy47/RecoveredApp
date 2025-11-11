package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0092o {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0092o f1590a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC0092o f1591b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0092o f1592c;
    public static final EnumC0092o d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0092o f1593e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC0092o[] f1594f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.lifecycle.o] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.lifecycle.o] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.lifecycle.o] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, androidx.lifecycle.o] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, androidx.lifecycle.o] */
    static {
        ?? r0 = new Enum("DESTROYED", 0);
        f1590a = r0;
        ?? r12 = new Enum("INITIALIZED", 1);
        f1591b = r12;
        ?? r2 = new Enum("CREATED", 2);
        f1592c = r2;
        ?? r3 = new Enum("STARTED", 3);
        d = r3;
        ?? r4 = new Enum("RESUMED", 4);
        f1593e = r4;
        f1594f = new EnumC0092o[]{r0, r12, r2, r3, r4};
    }

    public static EnumC0092o valueOf(String str) {
        return (EnumC0092o) Enum.valueOf(EnumC0092o.class, str);
    }

    public static EnumC0092o[] values() {
        return (EnumC0092o[]) f1594f.clone();
    }
}
