package n0;

/* loaded from: classes.dex */
public final class T {

    /* renamed from: a, reason: collision with root package name */
    public int f3279a;

    /* renamed from: b, reason: collision with root package name */
    public int f3280b;

    /* renamed from: c, reason: collision with root package name */
    public int f3281c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f3282e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3283f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3284g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3285j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3286k;

    /* renamed from: l, reason: collision with root package name */
    public int f3287l;

    /* renamed from: m, reason: collision with root package name */
    public long f3288m;

    /* renamed from: n, reason: collision with root package name */
    public int f3289n;

    public final void a(int i) {
        if ((this.d & i) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        return this.f3284g ? this.f3280b - this.f3281c : this.f3282e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f3279a + ", mData=null, mItemCount=" + this.f3282e + ", mIsMeasuring=" + this.i + ", mPreviousLayoutItemCount=" + this.f3280b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f3281c + ", mStructureChanged=" + this.f3283f + ", mInPreLayout=" + this.f3284g + ", mRunSimpleAnimations=" + this.f3285j + ", mRunPredictiveAnimations=" + this.f3286k + '}';
    }
}
