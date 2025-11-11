package s0;

import android.view.ViewGroup;
import com.android.music.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final C0322a f3641a = new C0322a();

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f3642b = new ThreadLocal();

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f3643c = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object, android.view.View$OnAttachStateChangeListener, s0.o] */
    public static void a(ViewGroup viewGroup, l lVar) {
        ArrayList arrayList = f3643c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (lVar == null) {
            lVar = f3641a;
        }
        l clone = lVar.clone();
        ArrayList arrayList2 = (ArrayList) b().get(viewGroup);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((l) it.next()).w(viewGroup);
            }
        }
        clone.h(viewGroup, true);
        if (viewGroup.getTag(R.id.transition_current_scene) != null) {
            throw new ClassCastException();
        }
        viewGroup.setTag(R.id.transition_current_scene, null);
        ?? obj = new Object();
        obj.f3639a = clone;
        obj.f3640b = viewGroup;
        viewGroup.addOnAttachStateChangeListener(obj);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(obj);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [o.f, o.j, java.lang.Object] */
    public static o.f b() {
        o.f fVar;
        ThreadLocal threadLocal = f3642b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (fVar = (o.f) weakReference.get()) != null) {
            return fVar;
        }
        ?? jVar = new o.j(0);
        threadLocal.set(new WeakReference(jVar));
        return jVar;
    }
}
