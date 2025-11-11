package T;

import L.S;
import M.k;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class a extends A0.c {
    public final /* synthetic */ b d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(5);
        this.d = bVar;
    }

    @Override // A0.c
    public final boolean A(int i, int i2, Bundle bundle) {
        int i3;
        b bVar = this.d;
        Chip chip = bVar.i;
        if (i == -1) {
            WeakHashMap weakHashMap = S.f311a;
            return chip.performAccessibilityAction(i2, bundle);
        }
        if (i2 == 1) {
            return bVar.p(i);
        }
        if (i2 == 2) {
            return bVar.j(i);
        }
        boolean z2 = false;
        if (i2 == 64) {
            AccessibilityManager accessibilityManager = bVar.h;
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i3 = bVar.f637k) == i) {
                return false;
            }
            if (i3 != Integer.MIN_VALUE) {
                bVar.f637k = Integer.MIN_VALUE;
                bVar.i.invalidate();
                bVar.q(i3, 65536);
            }
            bVar.f637k = i;
            chip.invalidate();
            bVar.q(i, 32768);
            return true;
        }
        if (i2 == 128) {
            if (bVar.f637k != i) {
                return false;
            }
            bVar.f637k = Integer.MIN_VALUE;
            chip.invalidate();
            bVar.q(i, 65536);
            return true;
        }
        H0.c cVar = (H0.c) bVar;
        if (i2 == 16) {
            Chip chip2 = cVar.f194q;
            if (i == 0) {
                return chip2.performClick();
            }
            if (i == 1) {
                chip2.playSoundEffect(0);
                View.OnClickListener onClickListener = chip2.h;
                if (onClickListener != null) {
                    onClickListener.onClick(chip2);
                    z2 = true;
                }
                if (chip2.f1870s) {
                    chip2.f1869r.q(1, 1);
                }
            }
        }
        return z2;
    }

    @Override // A0.c
    public final k x(int i) {
        return new k(AccessibilityNodeInfo.obtain(this.d.n(i).f417a));
    }

    @Override // A0.c
    public final k y(int i) {
        b bVar = this.d;
        int i2 = i == 2 ? bVar.f637k : bVar.f638l;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return x(i2);
    }
}
