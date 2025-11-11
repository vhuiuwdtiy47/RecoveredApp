package k;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import l.AbstractViewOnTouchListenerC0260t0;
import l.C0233g;
import l.C0235h;
import l.C0239j;
import l.C0243l;

/* renamed from: k.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0168b extends AbstractViewOnTouchListenerC0260t0 {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f2793j = 0;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ View f2794k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0168b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f2794k = actionMenuItemView;
    }

    @Override // l.AbstractViewOnTouchListenerC0260t0
    public final InterfaceC0166C b() {
        C0233g c0233g;
        switch (this.f2793j) {
            case 0:
                AbstractC0169c abstractC0169c = ((ActionMenuItemView) this.f2794k).f1322l;
                if (abstractC0169c == null || (c0233g = ((C0235h) abstractC0169c).f3081a.f3104u) == null) {
                    return null;
                }
                return c0233g.a();
            default:
                C0233g c0233g2 = ((C0239j) this.f2794k).d.f3103t;
                if (c0233g2 == null) {
                    return null;
                }
                return c0233g2.a();
        }
    }

    @Override // l.AbstractViewOnTouchListenerC0260t0
    public final boolean c() {
        InterfaceC0166C b2;
        switch (this.f2793j) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f2794k;
                l lVar = actionMenuItemView.f1320j;
                return lVar != null && lVar.b(actionMenuItemView.f1319g) && (b2 = b()) != null && b2.a();
            default:
                ((C0239j) this.f2794k).d.o();
                return true;
        }
    }

    @Override // l.AbstractViewOnTouchListenerC0260t0
    public boolean d() {
        switch (this.f2793j) {
            case 1:
                C0243l c0243l = ((C0239j) this.f2794k).d;
                if (c0243l.f3105v != null) {
                    return false;
                }
                c0243l.e();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0168b(C0239j c0239j, C0239j c0239j2) {
        super(c0239j2);
        this.f2794k = c0239j;
    }
}
