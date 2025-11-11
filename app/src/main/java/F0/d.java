package F0;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.android.music.R;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import n0.E;

/* loaded from: classes.dex */
public final class d extends E {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f151a;

    /* renamed from: b, reason: collision with root package name */
    public final List f152b;

    public d() {
        Paint paint = new Paint();
        this.f151a = paint;
        this.f152b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // n0.E
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2;
        int E2;
        int F2;
        int i;
        int i2;
        Paint paint = this.f151a;
        paint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
        Iterator it = this.f152b.iterator();
        while (it.hasNext()) {
            ((f) it.next()).getClass();
            ThreadLocal threadLocal = D.a.f90a;
            float f2 = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * f2)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * f2)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * f2)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * f2))));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).A0()) {
                e eVar = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1853q;
                switch (eVar.f154b) {
                    case 0:
                        i = 0;
                        break;
                    default:
                        i = eVar.f155c.G();
                        break;
                }
                float f3 = i;
                e eVar2 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1853q;
                switch (eVar2.f154b) {
                    case 0:
                        i2 = eVar2.f155c.f3257o;
                        break;
                    default:
                        CarouselLayoutManager carouselLayoutManager = eVar2.f155c;
                        i2 = carouselLayoutManager.f3257o - carouselLayoutManager.D();
                        break;
                }
                canvas2 = canvas;
                canvas2.drawLine(0.0f, f3, 0.0f, i2, paint);
            } else {
                canvas2 = canvas;
                e eVar3 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1853q;
                switch (eVar3.f154b) {
                    case 0:
                        E2 = eVar3.f155c.E();
                        break;
                    default:
                        E2 = 0;
                        break;
                }
                float f4 = E2;
                e eVar4 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1853q;
                switch (eVar4.f154b) {
                    case 0:
                        CarouselLayoutManager carouselLayoutManager2 = eVar4.f155c;
                        F2 = carouselLayoutManager2.f3256n - carouselLayoutManager2.F();
                        break;
                    default:
                        F2 = eVar4.f155c.f3256n;
                        break;
                }
                canvas2.drawLine(f4, 0.0f, F2, 0.0f, paint);
            }
            canvas = canvas2;
        }
    }
}
