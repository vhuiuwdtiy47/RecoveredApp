package f0;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import c0.AbstractC0112c;
import com.android.music.R;
import com.tencent.wechat.Platform;
import h0.j;
import java.lang.ref.WeakReference;

/* renamed from: f0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0125a implements p1.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2294a;

    public /* synthetic */ C0125a(int i) {
        this.f2294a = i;
    }

    @Override // p1.l
    public final Object c(Object obj) {
        switch (this.f2294a) {
            case 0:
                Context context = (Context) obj;
                q1.d.e(context, "it");
                if (context instanceof ContextWrapper) {
                    return ((ContextWrapper) context).getBaseContext();
                }
                return null;
            case 1:
                Context context2 = (Context) obj;
                q1.d.e(context2, "it");
                if (context2 instanceof ContextWrapper) {
                    return ((ContextWrapper) context2).getBaseContext();
                }
                return null;
            case 2:
                q1.d.e((AbstractC0112c) obj, "$this$initializer");
                return new o();
            case 3:
                v vVar = (v) obj;
                q1.d.e(vVar, "it");
                return vVar.f2360c;
            case Platform.INFO /* 4 */:
                v vVar2 = (v) obj;
                q1.d.e(vVar2, "it");
                if (!(vVar2 instanceof w)) {
                    return null;
                }
                w wVar = (w) vVar2;
                return wVar.g(wVar.f2362g.f2620a);
            case Platform.WARN /* 5 */:
                View view = (View) obj;
                q1.d.e(view, "it");
                Object parent = view.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            case 6:
                View view2 = (View) obj;
                q1.d.e(view2, "it");
                Object tag = view2.getTag(R.id.nav_controller_view_tag);
                if (tag instanceof WeakReference) {
                    return (y) ((WeakReference) tag).get();
                }
                if (tag instanceof y) {
                    return (y) tag;
                }
                return null;
            case 7:
                q1.d.e((AbstractC0112c) obj, "$this$initializer");
                return new j.a();
            case 8:
                AbstractC0112c abstractC0112c = (AbstractC0112c) obj;
                q1.d.e(abstractC0112c, "$this$initializer");
                return new i0.c(androidx.lifecycle.L.c(abstractC0112c));
            case 9:
                v vVar3 = (v) obj;
                q1.d.e(vVar3, "destination");
                w wVar2 = vVar3.f2360c;
                if (wVar2 == null || wVar2.f2362g.f2620a != vVar3.f2359b.f2660a) {
                    return null;
                }
                return wVar2;
            case 10:
                v vVar4 = (v) obj;
                q1.d.e(vVar4, "destination");
                w wVar3 = vVar4.f2360c;
                if (wVar3 == null || wVar3.f2362g.f2620a != vVar4.f2359b.f2660a) {
                    return null;
                }
                return wVar3;
            default:
                v vVar5 = (v) obj;
                q1.d.e(vVar5, "it");
                return Integer.valueOf(vVar5.f2359b.f2660a);
        }
    }
}
