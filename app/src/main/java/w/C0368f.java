package w;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: w.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0368f {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f4023a;

    /* renamed from: b, reason: collision with root package name */
    public int f4024b;

    /* renamed from: c, reason: collision with root package name */
    public int f4025c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f4026e;

    /* renamed from: f, reason: collision with root package name */
    public int f4027f;

    /* renamed from: g, reason: collision with root package name */
    public int f4028g;
    public final /* synthetic */ ConstraintLayout h;

    public C0368f(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.h = constraintLayout;
        this.f4023a = constraintLayout2;
    }

    public static boolean a(int i, int i2, int i3) {
        if (i == i2) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01cb A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(t.C0326d r18, u.C0345b r19) {
        /*
            Method dump skipped, instructions count: 700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w.C0368f.b(t.d, u.b):void");
    }
}
