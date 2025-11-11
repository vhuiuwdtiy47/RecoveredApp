package D0;

import L.S;
import U.t;
import Y.AbstractComponentCallbacksC0056x;
import Y.DialogInterfaceOnCancelListenerC0049p;
import a.AbstractActivityC0068j;
import android.animation.ValueAnimator;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.ListView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.tencent.wechat.Platform;
import com.xiaomi.vlive.App;
import com.xiaomi.vlive.ui.controller.ControllerFragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import l.C0243l;
import l.C0254q0;
import n0.C0281d;
import n0.C0284g;
import n0.C0285h;
import n0.C0286i;
import n0.C0289l;
import n0.D;
import n0.RunnableC0280c;
import n0.W;

/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f116a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f117b;

    public /* synthetic */ i(int i, Object obj) {
        this.f116a = i;
        this.f117b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0243l c0243l;
        int i;
        int[] iArr = null;
        Object obj = this.f117b;
        switch (this.f116a) {
            case 0:
                j jVar = (j) obj;
                jVar.f120c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) jVar.f121e;
                T.e eVar = bottomSheetBehavior.f1791M;
                if (eVar != null && eVar.f()) {
                    jVar.a(jVar.f119b);
                    return;
                } else {
                    if (bottomSheetBehavior.f1790L == 2) {
                        bottomSheetBehavior.C(jVar.f119b);
                        return;
                    }
                    return;
                }
            case 1:
                R.g gVar = (R.g) obj;
                if (gVar.f620o) {
                    boolean z2 = gVar.f618m;
                    R.a aVar = gVar.f609a;
                    if (z2) {
                        gVar.f618m = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f605e = currentAnimationTimeMillis;
                        aVar.f607g = -1L;
                        aVar.f606f = currentAnimationTimeMillis;
                        aVar.h = 0.5f;
                    }
                    if ((aVar.f607g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f607g + aVar.i) || !gVar.e()) {
                        gVar.f620o = false;
                        return;
                    }
                    boolean z3 = gVar.f619n;
                    ListView listView = gVar.f611c;
                    if (z3) {
                        gVar.f619n = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        listView.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar.f606f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a2 = aVar.a(currentAnimationTimeMillis2);
                    long j2 = currentAnimationTimeMillis2 - aVar.f606f;
                    aVar.f606f = currentAnimationTimeMillis2;
                    gVar.f622q.scrollListBy((int) (((float) j2) * ((a2 * 4.0f) + ((-4.0f) * a2 * a2)) * aVar.d));
                    WeakHashMap weakHashMap = S.f311a;
                    listView.postOnAnimation(this);
                    return;
                }
                return;
            case 2:
                ((T.e) obj).n(0);
                return;
            case 3:
                CheckableImageButton checkableImageButton = ((TextInputLayout) obj).f2022c.f883g;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case Platform.INFO /* 4 */:
                DialogInterfaceOnCancelListenerC0049p dialogInterfaceOnCancelListenerC0049p = (DialogInterfaceOnCancelListenerC0049p) obj;
                dialogInterfaceOnCancelListenerC0049p.f1134Z.onDismiss(dialogInterfaceOnCancelListenerC0049p.f1141h0);
                return;
            case Platform.WARN /* 5 */:
                AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x = (AbstractComponentCallbacksC0056x) obj;
                if (abstractComponentCallbacksC0056x.f1169I != null) {
                    abstractComponentCallbacksC0056x.f().getClass();
                    return;
                }
                return;
            case 6:
                ((Y.S) obj).y(true);
                return;
            case 7:
                WeakReference weakReference = ((Z0.h) obj).f1240b;
                a1.a aVar2 = weakReference != null ? (a1.a) weakReference.get() : null;
                if (aVar2 == null) {
                    return;
                }
                aVar2.cancel();
                return;
            case 8:
                try {
                    AbstractActivityC0068j.e((AbstractActivityC0068j) obj);
                    return;
                } catch (IllegalStateException e2) {
                    if (!TextUtils.equals(e2.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e2;
                    }
                    return;
                } catch (NullPointerException e3) {
                    if (!TextUtils.equals(e3.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e3;
                    }
                    return;
                }
            case 9:
                try {
                    iArr = ((d1.f) t.E()).c();
                } catch (RemoteException | Exception unused) {
                }
                App app = (App) obj;
                if (iArr != null) {
                    app.f2124e.post(new A0.d(this, iArr, 4, false));
                }
                app.d.postDelayed(this, 1000L);
                return;
            case 10:
                int[] iArr2 = {-65536, -16711936, -23296, -16776961, -256, -16711681, -1};
                ControllerFragment controllerFragment = (ControllerFragment) obj;
                int i2 = controllerFragment.f2157u0 + 1;
                controllerFragment.f2157u0 = i2;
                if (i2 > 6) {
                    controllerFragment.f2157u0 = 0;
                }
                controllerFragment.f2135W.f2201l.setBackgroundColor(iArr2[controllerFragment.f2157u0]);
                controllerFragment.v0.postDelayed(this, 1000L);
                return;
            case 11:
                C0254q0 c0254q0 = (C0254q0) obj;
                c0254q0.f3134l = null;
                c0254q0.drawableStateChanged();
                return;
            case 12:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) obj;
                if (searchView$SearchAutoComplete.f1417f) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f1417f = false;
                    return;
                }
                return;
            case 13:
                ActionMenuView actionMenuView = ((Toolbar) obj).f1435a;
                if (actionMenuView == null || (c0243l = actionMenuView.f1399t) == null) {
                    return;
                }
                c0243l.o();
                return;
            case 14:
                C0289l c0289l = (C0289l) obj;
                int i3 = c0289l.f3392A;
                ValueAnimator valueAnimator = c0289l.f3416z;
                if (i3 != 1) {
                    i = 2;
                    if (i3 != 2) {
                        return;
                    }
                } else {
                    i = 2;
                    valueAnimator.cancel();
                }
                c0289l.f3392A = 3;
                float[] fArr = new float[i];
                fArr[0] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fArr[1] = 0.0f;
                valueAnimator.setFloatValues(fArr);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 15:
                RecyclerView recyclerView = (RecyclerView) obj;
                D d = recyclerView.f1646H;
                if (d != null) {
                    C0286i c0286i = (C0286i) d;
                    ArrayList arrayList = c0286i.h;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c0286i.f3378j;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c0286i.f3379k;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c0286i.i;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            long j3 = c0286i.d;
                            if (hasNext) {
                                W w2 = (W) it.next();
                                View view = w2.f3297a;
                                ViewPropertyAnimator animate = view.animate();
                                c0286i.f3385q.add(w2);
                                animate.setDuration(j3).alpha(0.0f).setListener(new C0281d(c0286i, w2, animate, view)).start();
                            } else {
                                arrayList.clear();
                                if (!isEmpty2) {
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.addAll(arrayList2);
                                    c0286i.f3381m.add(arrayList5);
                                    arrayList2.clear();
                                    RunnableC0280c runnableC0280c = new RunnableC0280c(c0286i, arrayList5, 0);
                                    if (isEmpty) {
                                        runnableC0280c.run();
                                    } else {
                                        View view2 = ((C0285h) arrayList5.get(0)).f3372a.f3297a;
                                        WeakHashMap weakHashMap2 = S.f311a;
                                        view2.postOnAnimationDelayed(runnableC0280c, j3);
                                    }
                                }
                                if (!isEmpty3) {
                                    ArrayList arrayList6 = new ArrayList();
                                    arrayList6.addAll(arrayList3);
                                    c0286i.f3382n.add(arrayList6);
                                    arrayList3.clear();
                                    RunnableC0280c runnableC0280c2 = new RunnableC0280c(c0286i, arrayList6, 1);
                                    if (isEmpty) {
                                        runnableC0280c2.run();
                                    } else {
                                        View view3 = ((C0284g) arrayList6.get(0)).f3364a.f3297a;
                                        WeakHashMap weakHashMap3 = S.f311a;
                                        view3.postOnAnimationDelayed(runnableC0280c2, j3);
                                    }
                                }
                                if (!isEmpty4) {
                                    ArrayList arrayList7 = new ArrayList();
                                    arrayList7.addAll(arrayList4);
                                    c0286i.f3380l.add(arrayList7);
                                    arrayList4.clear();
                                    RunnableC0280c runnableC0280c3 = new RunnableC0280c(c0286i, arrayList7, 2);
                                    if (isEmpty && isEmpty2 && isEmpty3) {
                                        runnableC0280c3.run();
                                    } else {
                                        if (isEmpty) {
                                            j3 = 0;
                                        }
                                        long max = Math.max(!isEmpty2 ? c0286i.f3239e : 0L, !isEmpty3 ? c0286i.f3240f : 0L) + j3;
                                        View view4 = ((W) arrayList7.get(0)).f3297a;
                                        WeakHashMap weakHashMap4 = S.f311a;
                                        view4.postOnAnimationDelayed(runnableC0280c3, max);
                                    }
                                }
                            }
                        }
                    }
                }
                recyclerView.f1675i0 = false;
                return;
            default:
                ((StaggeredGridLayoutManager) obj).A0();
                return;
        }
    }
}
