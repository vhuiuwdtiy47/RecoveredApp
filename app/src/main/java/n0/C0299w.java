package n0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: n0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0299w extends U.f {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0299w(H h, int i) {
        super(h);
        this.d = i;
    }

    @Override // U.f
    public final int b(View view) {
        switch (this.d) {
            case 0:
                I i = (I) view.getLayoutParams();
                ((H) this.f756b).getClass();
                return view.getRight() + ((I) view.getLayoutParams()).f3259b.right + ((ViewGroup.MarginLayoutParams) i).rightMargin;
            default:
                I i2 = (I) view.getLayoutParams();
                ((H) this.f756b).getClass();
                return view.getBottom() + ((I) view.getLayoutParams()).f3259b.bottom + ((ViewGroup.MarginLayoutParams) i2).bottomMargin;
        }
    }

    @Override // U.f
    public final int c(View view) {
        switch (this.d) {
            case 0:
                I i = (I) view.getLayoutParams();
                ((H) this.f756b).getClass();
                return H.A(view) + ((ViewGroup.MarginLayoutParams) i).leftMargin + ((ViewGroup.MarginLayoutParams) i).rightMargin;
            default:
                I i2 = (I) view.getLayoutParams();
                ((H) this.f756b).getClass();
                return H.z(view) + ((ViewGroup.MarginLayoutParams) i2).topMargin + ((ViewGroup.MarginLayoutParams) i2).bottomMargin;
        }
    }

    @Override // U.f
    public final int d(View view) {
        switch (this.d) {
            case 0:
                I i = (I) view.getLayoutParams();
                ((H) this.f756b).getClass();
                return H.z(view) + ((ViewGroup.MarginLayoutParams) i).topMargin + ((ViewGroup.MarginLayoutParams) i).bottomMargin;
            default:
                I i2 = (I) view.getLayoutParams();
                ((H) this.f756b).getClass();
                return H.A(view) + ((ViewGroup.MarginLayoutParams) i2).leftMargin + ((ViewGroup.MarginLayoutParams) i2).rightMargin;
        }
    }

    @Override // U.f
    public final int e(View view) {
        switch (this.d) {
            case 0:
                I i = (I) view.getLayoutParams();
                ((H) this.f756b).getClass();
                return (view.getLeft() - ((I) view.getLayoutParams()).f3259b.left) - ((ViewGroup.MarginLayoutParams) i).leftMargin;
            default:
                I i2 = (I) view.getLayoutParams();
                ((H) this.f756b).getClass();
                return (view.getTop() - ((I) view.getLayoutParams()).f3259b.top) - ((ViewGroup.MarginLayoutParams) i2).topMargin;
        }
    }

    @Override // U.f
    public final int f() {
        switch (this.d) {
            case 0:
                return ((H) this.f756b).f3256n;
            default:
                return ((H) this.f756b).f3257o;
        }
    }

    @Override // U.f
    public final int g() {
        switch (this.d) {
            case 0:
                H h = (H) this.f756b;
                return h.f3256n - h.F();
            default:
                H h2 = (H) this.f756b;
                return h2.f3257o - h2.D();
        }
    }

    @Override // U.f
    public final int h() {
        switch (this.d) {
            case 0:
                return ((H) this.f756b).F();
            default:
                return ((H) this.f756b).D();
        }
    }

    @Override // U.f
    public final int i() {
        switch (this.d) {
            case 0:
                return ((H) this.f756b).f3254l;
            default:
                return ((H) this.f756b).f3255m;
        }
    }

    @Override // U.f
    public final int j() {
        switch (this.d) {
            case 0:
                return ((H) this.f756b).f3255m;
            default:
                return ((H) this.f756b).f3254l;
        }
    }

    @Override // U.f
    public final int k() {
        switch (this.d) {
            case 0:
                return ((H) this.f756b).E();
            default:
                return ((H) this.f756b).G();
        }
    }

    @Override // U.f
    public final int l() {
        switch (this.d) {
            case 0:
                H h = (H) this.f756b;
                return (h.f3256n - h.E()) - h.F();
            default:
                H h2 = (H) this.f756b;
                return (h2.f3257o - h2.G()) - h2.D();
        }
    }

    @Override // U.f
    public final int m(View view) {
        switch (this.d) {
            case 0:
                H h = (H) this.f756b;
                Rect rect = (Rect) this.f757c;
                h.K(view, rect);
                return rect.right;
            default:
                H h2 = (H) this.f756b;
                Rect rect2 = (Rect) this.f757c;
                h2.K(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // U.f
    public final int n(View view) {
        switch (this.d) {
            case 0:
                H h = (H) this.f756b;
                Rect rect = (Rect) this.f757c;
                h.K(view, rect);
                return rect.left;
            default:
                H h2 = (H) this.f756b;
                Rect rect2 = (Rect) this.f757c;
                h2.K(view, rect2);
                return rect2.top;
        }
    }

    @Override // U.f
    public final void o(int i) {
        switch (this.d) {
            case 0:
                ((H) this.f756b).O(i);
                return;
            default:
                ((H) this.f756b).P(i);
                return;
        }
    }
}
