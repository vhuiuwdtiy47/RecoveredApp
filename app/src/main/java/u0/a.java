package U0;

import U.t;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes.dex */
public final class a extends t {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f804e;

    /* renamed from: f, reason: collision with root package name */
    public final SideSheetBehavior f805f;

    public /* synthetic */ a(SideSheetBehavior sideSheetBehavior, int i) {
        this.f804e = i;
        this.f805f = sideSheetBehavior;
    }

    @Override // U.t
    public final int A() {
        switch (this.f804e) {
            case 0:
                return -this.f805f.f1978l;
            default:
                return v();
        }
    }

    @Override // U.t
    public final int C(View view) {
        switch (this.f804e) {
            case 0:
                return view.getRight() + this.f805f.f1981o;
            default:
                return view.getLeft() - this.f805f.f1981o;
        }
    }

    @Override // U.t
    public final int D(CoordinatorLayout coordinatorLayout) {
        switch (this.f804e) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // U.t
    public final int F() {
        switch (this.f804e) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // U.t
    public final boolean I(float f2) {
        switch (this.f804e) {
            case 0:
                return f2 > 0.0f;
            default:
                return f2 < 0.0f;
        }
    }

    @Override // U.t
    public final boolean J(View view) {
        switch (this.f804e) {
            case 0:
                return view.getRight() < (v() - x()) / 2;
            default:
                return view.getLeft() > (v() + this.f805f.f1979m) / 2;
        }
    }

    @Override // U.t
    public final boolean K(float f2, float f3) {
        switch (this.f804e) {
            case 0:
                if (Math.abs(f2) > Math.abs(f3)) {
                    float abs = Math.abs(f2);
                    this.f805f.getClass();
                    if (abs > 500) {
                        return true;
                    }
                }
                return false;
            default:
                if (Math.abs(f2) > Math.abs(f3)) {
                    float abs2 = Math.abs(f2);
                    this.f805f.getClass();
                    if (abs2 > 500) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // U.t
    public final boolean e0(View view, float f2) {
        switch (this.f804e) {
            case 0:
                float left = view.getLeft();
                SideSheetBehavior sideSheetBehavior = this.f805f;
                float abs = Math.abs((f2 * sideSheetBehavior.f1977k) + left);
                sideSheetBehavior.getClass();
                return abs > 0.5f;
            default:
                float right = view.getRight();
                SideSheetBehavior sideSheetBehavior2 = this.f805f;
                float abs2 = Math.abs((f2 * sideSheetBehavior2.f1977k) + right);
                sideSheetBehavior2.getClass();
                return abs2 > 0.5f;
        }
    }

    @Override // U.t
    public final void g0(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        switch (this.f804e) {
            case 0:
                if (i <= this.f805f.f1979m) {
                    marginLayoutParams.leftMargin = i2;
                    return;
                }
                return;
            default:
                int i3 = this.f805f.f1979m;
                if (i <= i3) {
                    marginLayoutParams.rightMargin = i3 - i;
                    return;
                }
                return;
        }
    }

    @Override // U.t
    public final int j(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f804e) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // U.t
    public final float k(int i) {
        switch (this.f804e) {
            case 0:
                float x2 = x();
                return (i - x2) / (v() - x2);
            default:
                float f2 = this.f805f.f1979m;
                return (f2 - i) / (f2 - v());
        }
    }

    @Override // U.t
    public final int v() {
        switch (this.f804e) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f805f;
                return Math.max(0, sideSheetBehavior.f1980n + sideSheetBehavior.f1981o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f805f;
                return Math.max(0, (sideSheetBehavior2.f1979m - sideSheetBehavior2.f1978l) - sideSheetBehavior2.f1981o);
        }
    }

    @Override // U.t
    public final int x() {
        switch (this.f804e) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f805f;
                return (-sideSheetBehavior.f1978l) - sideSheetBehavior.f1981o;
            default:
                return this.f805f.f1979m;
        }
    }

    @Override // U.t
    public final int z() {
        switch (this.f804e) {
            case 0:
                return this.f805f.f1981o;
            default:
                return this.f805f.f1979m;
        }
    }
}
