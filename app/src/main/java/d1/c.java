package d1;

import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import com.xiaomi.vlive.FloatService;

/* loaded from: classes.dex */
public final class c implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2174a;

    /* renamed from: b, reason: collision with root package name */
    public int f2175b;

    /* renamed from: c, reason: collision with root package name */
    public int f2176c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f2177e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2178f = false;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2179g;

    public /* synthetic */ c(int i, Object obj) {
        this.f2174a = i;
        this.f2179g = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f2174a) {
            case 0:
                int rawX = (int) motionEvent.getRawX();
                int rawY = (int) motionEvent.getRawY();
                int action = motionEvent.getAction();
                FloatService floatService = (FloatService) this.f2179g;
                if (action == 0) {
                    this.f2178f = false;
                    this.f2175b = rawX;
                    this.f2176c = rawY;
                    WindowManager.LayoutParams layoutParams = floatService.f2131c;
                    this.d = layoutParams.x;
                    this.f2177e = layoutParams.y;
                    return false;
                }
                if (action == 1) {
                    return this.f2178f;
                }
                if (action != 2) {
                    return false;
                }
                int i = rawX - this.f2175b;
                int i2 = rawY - this.f2176c;
                if (Math.abs(i) > 5 || Math.abs(i2) > 5) {
                    this.f2178f = true;
                    WindowManager.LayoutParams layoutParams2 = floatService.f2131c;
                    layoutParams2.x = this.d + i;
                    layoutParams2.y = this.f2177e + i2;
                    floatService.f2129a.updateViewLayout(floatService.f2130b, layoutParams2);
                }
                return true;
            default:
                int rawX2 = (int) motionEvent.getRawX();
                int rawY2 = (int) motionEvent.getRawY();
                int action2 = motionEvent.getAction();
                e eVar = (e) this.f2179g;
                if (action2 == 0) {
                    this.f2178f = false;
                    this.f2175b = rawX2;
                    this.f2176c = rawY2;
                    WindowManager.LayoutParams layoutParams3 = eVar.f2184c;
                    this.d = layoutParams3.x;
                    this.f2177e = layoutParams3.y;
                    return false;
                }
                if (action2 == 1) {
                    return this.f2178f;
                }
                if (action2 != 2) {
                    return false;
                }
                int i3 = rawX2 - this.f2175b;
                int i4 = rawY2 - this.f2176c;
                if (Math.abs(i3) > 5 || Math.abs(i4) > 5) {
                    this.f2178f = true;
                    WindowManager.LayoutParams layoutParams4 = eVar.f2184c;
                    layoutParams4.x = this.d + i3;
                    layoutParams4.y = this.f2177e + i4;
                    eVar.f2182a.updateViewLayout(eVar.f2183b, layoutParams4);
                }
                return true;
        }
    }
}
