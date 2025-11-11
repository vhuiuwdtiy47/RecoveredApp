package i1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f2668a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ c[] f2669b;

    /* JADX INFO: Fake field, exist only in values array */
    c EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, i1.c] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, i1.c] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, i1.c] */
    static {
        ?? r0 = new Enum("SYNCHRONIZED", 0);
        ?? r12 = new Enum("PUBLICATION", 1);
        ?? r2 = new Enum("NONE", 2);
        f2668a = r2;
        f2669b = new c[]{r0, r12, r2};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f2669b.clone();
    }
}
