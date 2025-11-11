package A0;

import C.j;
import L.C0010f;
import L.InterfaceC0007c;
import L.InterfaceC0009e;
import L.S;
import L.r;
import L.s0;
import L.u0;
import M.l;
import M.t;
import U.p;
import U.y;
import Y.B;
import Y.J;
import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.Q;
import androidx.lifecycle.T;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.tencent.wechat.Platform;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import k.E;
import k.RunnableC0171e;
import k.f;
import k.g;
import k.k;
import k.m;
import k.o;
import k.x;
import l.C0213U0;
import l.C0243l;
import l.InterfaceC0182E0;
import l.InterfaceC0249o;
import l0.e;
import q1.i;
import y.C0379d;

/* loaded from: classes.dex */
public class c implements t, E0.a, InterfaceC0007c, InterfaceC0009e, p, T, InterfaceC0182E0, x, k, e, r {

    /* renamed from: c, reason: collision with root package name */
    public static c f31c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32a;

    /* renamed from: b, reason: collision with root package name */
    public Object f33b;

    public /* synthetic */ c(int i, Object obj) {
        this.f32a = i;
        this.f33b = obj;
    }

    public boolean A(int i, int i2, Bundle bundle) {
        return false;
    }

    @Override // L.InterfaceC0007c
    public void a(Bundle bundle) {
        ((ContentInfo.Builder) this.f33b).setExtras(bundle);
    }

    @Override // k.x
    public void b(m mVar, boolean z2) {
        if (mVar instanceof E) {
            ((E) mVar).f2779z.k().c(false);
        }
        x xVar = ((C0243l) this.f33b).f3090e;
        if (xVar != null) {
            xVar.b(mVar, z2);
        }
    }

    @Override // L.InterfaceC0007c
    public void c(Uri uri) {
        ((ContentInfo.Builder) this.f33b).setLinkUri(uri);
    }

    @Override // L.InterfaceC0009e
    public int d() {
        int source;
        source = ((ContentInfo) this.f33b).getSource();
        return source;
    }

    @Override // l.InterfaceC0182E0
    public void f(m mVar, o oVar) {
        g gVar = (g) this.f33b;
        gVar.f2806f.removeCallbacksAndMessages(null);
        ArrayList arrayList = gVar.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (mVar == ((f) arrayList.get(i)).f2801b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        gVar.f2806f.postAtTime(new RunnableC0171e(this, i2 < arrayList.size() ? (f) arrayList.get(i2) : null, oVar, mVar), mVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // k.x
    public boolean g(m mVar) {
        C0243l c0243l = (C0243l) this.f33b;
        if (mVar == c0243l.f3089c) {
            return false;
        }
        c0243l.f3108y = ((E) mVar).f2778A.f2865a;
        x xVar = c0243l.f3090e;
        if (xVar != null) {
            return xVar.g(mVar);
        }
        return false;
    }

    @Override // U.p
    public Object h() {
        return this;
    }

    @Override // L.InterfaceC0009e
    public ClipData i() {
        ClipData clip;
        clip = ((ContentInfo) this.f33b).getClip();
        return clip;
    }

    @Override // M.t
    public boolean j(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f33b;
        if (!swipeDismissBehavior.r(view)) {
            return false;
        }
        WeakHashMap weakHashMap = S.f311a;
        boolean z2 = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.d;
        view.offsetLeftAndRight((!(i == 0 && z2) && (i != 1 || z2)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        return true;
    }

    @Override // L.InterfaceC0007c
    public C0010f k() {
        ContentInfo build;
        build = ((ContentInfo.Builder) this.f33b).build();
        return new C0010f(new c(build));
    }

    @Override // l0.e
    public void l(int i, Serializable serializable) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case Platform.INFO /* 4 */:
                str = "RESULT_NOT_WRITABLE";
                break;
            case Platform.WARN /* 5 */:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f33b).setResultCode(i);
    }

    @Override // L.InterfaceC0009e
    public int n() {
        int flags;
        flags = ((ContentInfo) this.f33b).getFlags();
        return flags;
    }

    @Override // l0.e
    public void o() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // k.k
    public void p(m mVar) {
        C0213U0 c0213u0 = ((ActionMenuView) this.f33b).f1400u;
        if (c0213u0 != null) {
            c0213u0.p(mVar);
        }
    }

    @Override // k.k
    public boolean q(m mVar, MenuItem menuItem) {
        InterfaceC0249o interfaceC0249o = ((ActionMenuView) this.f33b).f1405z;
        if (interfaceC0249o == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((C0213U0) interfaceC0249o).f3026a.G.f362c).iterator();
        while (it.hasNext()) {
            if (((J) it.next()).f978a.o()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.lifecycle.T
    public Q r(Class cls, c0.e eVar) {
        c0.f fVar;
        q1.b a2 = i.a(cls);
        c0.f[] fVarArr = (c0.f[]) this.f33b;
        c0.f[] fVarArr2 = (c0.f[]) Arrays.copyOf(fVarArr, fVarArr.length);
        q1.d.e(fVarArr2, "initializers");
        int length = fVarArr2.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                fVar = null;
                break;
            }
            fVar = fVarArr2[i];
            if (fVar.f1743a.equals(a2)) {
                break;
            }
            i++;
        }
        Q q2 = fVar != null ? (Q) fVar.f1744b.c(eVar) : null;
        if (q2 != null) {
            return q2;
        }
        throw new IllegalArgumentException(("No initializer set for given class " + U.t.s(a2)).toString());
    }

    @Override // U.p
    public boolean s(CharSequence charSequence, int i, int i2, y yVar) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), (String) this.f33b)) {
            return true;
        }
        yVar.f799c = (yVar.f799c & 3) | 4;
        return false;
    }

    @Override // L.InterfaceC0009e
    public ContentInfo t() {
        return (ContentInfo) this.f33b;
    }

    public String toString() {
        switch (this.f32a) {
            case Platform.INFO /* 4 */:
                return "ContentInfoCompat{" + ((ContentInfo) this.f33b) + "}";
            default:
                return super.toString();
        }
    }

    @Override // l.InterfaceC0182E0
    public void u(m mVar, o oVar) {
        ((g) this.f33b).f2806f.removeCallbacksAndMessages(mVar);
    }

    @Override // L.r
    public u0 v(View view, u0 u0Var) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f33b;
        if (!Objects.equals(coordinatorLayout.f1490n, u0Var)) {
            coordinatorLayout.f1490n = u0Var;
            boolean z2 = u0Var.d() > 0;
            coordinatorLayout.f1491o = z2;
            coordinatorLayout.setWillNotDraw(!z2 && coordinatorLayout.getBackground() == null);
            s0 s0Var = u0Var.f389a;
            if (!s0Var.m()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    WeakHashMap weakHashMap = S.f311a;
                    if (childAt.getFitsSystemWindows() && ((C0379d) childAt.getLayoutParams()).f4204a != null && s0Var.m()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return u0Var;
    }

    @Override // L.InterfaceC0007c
    public void w(int i) {
        ((ContentInfo.Builder) this.f33b).setFlags(i);
    }

    public M.k x(int i) {
        return null;
    }

    public M.k y(int i) {
        return null;
    }

    public void z() {
        ((B) this.f33b).h.O();
    }

    public c(c0.f[] fVarArr) {
        this.f32a = 17;
        q1.d.e(fVarArr, "initializers");
        this.f33b = fVarArr;
    }

    public c(int i) {
        this.f32a = i;
        switch (i) {
            case Platform.WARN /* 5 */:
                this.f33b = new l(this);
                return;
            case 12:
                this.f33b = new Object();
                new Handler(Looper.getMainLooper(), new V0.e(this));
                return;
            default:
                return;
        }
    }

    public c(TextView textView) {
        this.f32a = 14;
        this.f33b = new W.g(textView);
    }

    public c(EditText editText) {
        this.f32a = 13;
        this.f33b = new j(editText);
    }

    public c(ContentInfo contentInfo) {
        this.f32a = 4;
        contentInfo.getClass();
        this.f33b = D0.a.g(contentInfo);
    }

    public c(ClipData clipData, int i) {
        this.f32a = 3;
        this.f33b = D0.a.e(clipData, i);
    }
}
