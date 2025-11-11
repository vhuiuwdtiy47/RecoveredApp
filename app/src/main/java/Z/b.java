package Z;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f1212a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f1213b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f1214c;
    public static final b d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ b[] f1215e;

    /* JADX INFO: Fake field, exist only in values array */
    b EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, Z.b] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, Z.b] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, Z.b] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, Z.b] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, Z.b] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, Z.b] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, Z.b] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Enum, Z.b] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Enum, Z.b] */
    static {
        ?? r0 = new Enum("PENALTY_LOG", 0);
        ?? r12 = new Enum("PENALTY_DEATH", 1);
        ?? r2 = new Enum("DETECT_FRAGMENT_REUSE", 2);
        f1212a = r2;
        ?? r3 = new Enum("DETECT_FRAGMENT_TAG_USAGE", 3);
        f1213b = r3;
        ?? r4 = new Enum("DETECT_WRONG_NESTED_HIERARCHY", 4);
        f1214c = r4;
        ?? r5 = new Enum("DETECT_RETAIN_INSTANCE_USAGE", 5);
        ?? r6 = new Enum("DETECT_SET_USER_VISIBLE_HINT", 6);
        ?? r7 = new Enum("DETECT_TARGET_FRAGMENT_USAGE", 7);
        ?? r8 = new Enum("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
        d = r8;
        f1215e = new b[]{r0, r12, r2, r3, r4, r5, r6, r7, r8};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f1215e.clone();
    }
}
