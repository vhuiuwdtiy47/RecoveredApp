package w;

import t.C0323a;
import t.C0326d;

/* renamed from: w.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0363a extends AbstractC0365c {
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public C0323a f3946j;

    public boolean getAllowsGoneWidget() {
        return this.f3946j.f3667t0;
    }

    public int getMargin() {
        return this.f3946j.f3668u0;
    }

    public int getType() {
        return this.h;
    }

    @Override // w.AbstractC0365c
    public final void h(C0326d c0326d, boolean z2) {
        int i = this.h;
        this.i = i;
        if (z2) {
            if (i == 5) {
                this.i = 1;
            } else if (i == 6) {
                this.i = 0;
            }
        } else if (i == 5) {
            this.i = 0;
        } else if (i == 6) {
            this.i = 1;
        }
        if (c0326d instanceof C0323a) {
            ((C0323a) c0326d).f3666s0 = this.i;
        }
    }

    public void setAllowsGoneWidget(boolean z2) {
        this.f3946j.f3667t0 = z2;
    }

    public void setDpMargin(int i) {
        this.f3946j.f3668u0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.f3946j.f3668u0 = i;
    }

    public void setType(int i) {
        this.h = i;
    }
}
