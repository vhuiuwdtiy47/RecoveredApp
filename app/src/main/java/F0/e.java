package F0;

import com.google.android.material.carousel.CarouselLayoutManager;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f153a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f154b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f155c;

    public e(int i) {
        this.f153a = i;
    }

    public final int a() {
        switch (this.f154b) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f155c;
                if (carouselLayoutManager.B0()) {
                    return carouselLayoutManager.f3256n;
                }
                return 0;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(CarouselLayoutManager carouselLayoutManager, int i) {
        this(1);
        this.f154b = i;
        switch (i) {
            case 1:
                this.f155c = carouselLayoutManager;
                this(0);
                return;
            default:
                this.f155c = carouselLayoutManager;
                return;
        }
    }
}
