package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.HashMap;
import t.C0326d;
import t.g;
import t.i;
import w.r;
import w.t;

/* loaded from: classes.dex */
public class Flow extends t {

    /* renamed from: j, reason: collision with root package name */
    public final g f1461j;

    /* JADX WARN: Type inference failed for: r1v0, types: [u.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [t.g, t.i] */
    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3953a = new int[32];
        this.f3958g = new HashMap();
        this.f3955c = context;
        super.g(attributeSet);
        ?? iVar = new i();
        iVar.f3811s0 = 0;
        iVar.f3812t0 = 0;
        iVar.f3813u0 = 0;
        iVar.v0 = 0;
        iVar.f3814w0 = 0;
        iVar.f3815x0 = 0;
        iVar.f3816y0 = false;
        iVar.f3817z0 = 0;
        iVar.f3786A0 = 0;
        iVar.f3787B0 = new Object();
        iVar.f3788C0 = null;
        iVar.f3789D0 = -1;
        iVar.f3790E0 = -1;
        iVar.f3791F0 = -1;
        iVar.f3792G0 = -1;
        iVar.f3793H0 = -1;
        iVar.I0 = -1;
        iVar.f3794J0 = 0.5f;
        iVar.f3795K0 = 0.5f;
        iVar.f3796L0 = 0.5f;
        iVar.f3797M0 = 0.5f;
        iVar.N0 = 0.5f;
        iVar.f3798O0 = 0.5f;
        iVar.f3799P0 = 0;
        iVar.f3800Q0 = 0;
        iVar.f3801R0 = 2;
        iVar.f3802S0 = 2;
        iVar.f3803T0 = 0;
        iVar.f3804U0 = -1;
        iVar.f3805V0 = 0;
        iVar.f3806W0 = new ArrayList();
        iVar.f3807X0 = null;
        iVar.f3808Y0 = null;
        iVar.f3809Z0 = null;
        iVar.b1 = 0;
        this.f1461j = iVar;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f4138b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f1461j.f3805V0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    g gVar = this.f1461j;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar.f3811s0 = dimensionPixelSize;
                    gVar.f3812t0 = dimensionPixelSize;
                    gVar.f3813u0 = dimensionPixelSize;
                    gVar.v0 = dimensionPixelSize;
                } else if (index == 18) {
                    g gVar2 = this.f1461j;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar2.f3813u0 = dimensionPixelSize2;
                    gVar2.f3814w0 = dimensionPixelSize2;
                    gVar2.f3815x0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.f1461j.v0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f1461j.f3814w0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f1461j.f3811s0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f1461j.f3815x0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f1461j.f3812t0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.f1461j.f3803T0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.f1461j.f3789D0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.f1461j.f3790E0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.f1461j.f3791F0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.f1461j.f3793H0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.f1461j.f3792G0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.f1461j.I0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.f1461j.f3794J0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.f1461j.f3796L0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.f1461j.N0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.f1461j.f3797M0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.f1461j.f3798O0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.f1461j.f3795K0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.f1461j.f3801R0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.f1461j.f3802S0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.f1461j.f3799P0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.f1461j.f3800Q0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.f1461j.f3804U0 = obtainStyledAttributes.getInt(index, -1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.d = this.f1461j;
        i();
    }

    @Override // w.AbstractC0365c
    public final void h(C0326d c0326d, boolean z2) {
        g gVar = this.f1461j;
        int i = gVar.f3813u0;
        if (i > 0 || gVar.v0 > 0) {
            if (z2) {
                gVar.f3814w0 = gVar.v0;
                gVar.f3815x0 = i;
            } else {
                gVar.f3814w0 = i;
                gVar.f3815x0 = gVar.v0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:85:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x06f4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0713  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0716  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x06f7  */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r28v2 */
    @Override // w.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(t.g r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 1834
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.Flow.j(t.g, int, int):void");
    }

    @Override // w.AbstractC0365c, android.view.View
    public final void onMeasure(int i, int i2) {
        j(this.f1461j, i, i2);
    }

    public void setFirstHorizontalBias(float f2) {
        this.f1461j.f3796L0 = f2;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.f1461j.f3791F0 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f2) {
        this.f1461j.f3797M0 = f2;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.f1461j.f3792G0 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.f1461j.f3801R0 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f2) {
        this.f1461j.f3794J0 = f2;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.f1461j.f3799P0 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.f1461j.f3789D0 = i;
        requestLayout();
    }

    public void setLastHorizontalBias(float f2) {
        this.f1461j.N0 = f2;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.f1461j.f3793H0 = i;
        requestLayout();
    }

    public void setLastVerticalBias(float f2) {
        this.f1461j.f3798O0 = f2;
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.f1461j.I0 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.f1461j.f3804U0 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.f1461j.f3805V0 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        g gVar = this.f1461j;
        gVar.f3811s0 = i;
        gVar.f3812t0 = i;
        gVar.f3813u0 = i;
        gVar.v0 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.f1461j.f3812t0 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.f1461j.f3814w0 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.f1461j.f3815x0 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.f1461j.f3811s0 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.f1461j.f3802S0 = i;
        requestLayout();
    }

    public void setVerticalBias(float f2) {
        this.f1461j.f3795K0 = f2;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.f1461j.f3800Q0 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.f1461j.f3790E0 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.f1461j.f3803T0 = i;
        requestLayout();
    }
}
