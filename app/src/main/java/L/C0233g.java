package l;

import android.content.Context;
import android.view.View;
import com.android.music.R;

/* renamed from: l.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0233g extends k.w {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f3076l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0243l f3077m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0233g(C0243l c0243l, Context context, k.m mVar, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, mVar, true);
        this.f3077m = c0243l;
        this.f2903f = 8388613;
        A0.c cVar = c0243l.f3107x;
        this.h = cVar;
        k.u uVar = this.i;
        if (uVar != null) {
            uVar.g(cVar);
        }
    }

    @Override // k.w
    public final void c() {
        switch (this.f3076l) {
            case 0:
                C0243l c0243l = this.f3077m;
                c0243l.f3104u = null;
                c0243l.f3108y = 0;
                super.c();
                return;
            default:
                C0243l c0243l2 = this.f3077m;
                k.m mVar = c0243l2.f3089c;
                if (mVar != null) {
                    mVar.c(true);
                }
                c0243l2.f3103t = null;
                super.c();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0233g(C0243l c0243l, Context context, k.E e2, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, e2, false);
        this.f3077m = c0243l;
        if ((e2.f2778A.f2885x & 32) != 32) {
            View view2 = c0243l.f3093j;
            this.f2902e = view2 == null ? (View) c0243l.h : view2;
        }
        A0.c cVar = c0243l.f3107x;
        this.h = cVar;
        k.u uVar = this.i;
        if (uVar != null) {
            uVar.g(cVar);
        }
    }
}
