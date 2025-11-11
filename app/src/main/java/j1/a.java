package j1;

/* loaded from: classes.dex */
public final class a extends q1.e implements p1.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2739b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f2740c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, int i) {
        super(1);
        this.f2739b = i;
        this.f2740c = bVar;
    }

    @Override // p1.l
    public final Object c(Object obj) {
        switch (this.f2739b) {
            case 0:
                return obj == this.f2740c ? "(this Collection)" : String.valueOf(obj);
            default:
                return ((x1.b) this.f2740c).b(((Number) obj).intValue());
        }
    }
}
