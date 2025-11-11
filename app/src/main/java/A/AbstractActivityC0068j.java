package a;

import L.C0016l;
import L.InterfaceC0015k;
import Y.A;
import Y.C0057y;
import Y.J;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.C0098v;
import androidx.lifecycle.EnumC0092o;
import androidx.lifecycle.F;
import androidx.lifecycle.H;
import androidx.lifecycle.InterfaceC0087j;
import androidx.lifecycle.InterfaceC0096t;
import androidx.lifecycle.L;
import androidx.lifecycle.S;
import androidx.lifecycle.V;
import androidx.lifecycle.W;
import b.C0100a;
import b.InterfaceC0101b;
import com.android.music.R;
import g.AbstractActivityC0146i;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import l.AbstractC0271z;
import o0.C0304a;
import o0.InterfaceC0307d;
import p0.C0309a;

/* renamed from: a.j */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0068j extends Activity implements W, InterfaceC0087j, InterfaceC0307d, InterfaceC0096t, InterfaceC0015k {

    /* renamed from: a */
    public final C0098v f1267a = new C0098v(this);

    /* renamed from: b */
    public final C0100a f1268b = new C0100a();

    /* renamed from: c */
    public final C0016l f1269c;
    public final C0098v d;

    /* renamed from: e */
    public final C.j f1270e;

    /* renamed from: f */
    public V f1271f;

    /* renamed from: g */
    public v f1272g;
    public final ExecutorC0067i h;
    public final C0070l i;

    /* renamed from: j */
    public final C0063e f1273j;

    /* renamed from: k */
    public final CopyOnWriteArrayList f1274k;

    /* renamed from: l */
    public final CopyOnWriteArrayList f1275l;

    /* renamed from: m */
    public final CopyOnWriteArrayList f1276m;

    /* renamed from: n */
    public final CopyOnWriteArrayList f1277n;

    /* renamed from: o */
    public final CopyOnWriteArrayList f1278o;

    /* renamed from: p */
    public boolean f1279p;

    /* renamed from: q */
    public boolean f1280q;

    public AbstractActivityC0068j() {
        AbstractActivityC0146i abstractActivityC0146i = (AbstractActivityC0146i) this;
        this.f1269c = new C0016l(new F0.b(9, abstractActivityC0146i));
        C0098v c0098v = new C0098v(this);
        this.d = c0098v;
        C0309a c0309a = new C0309a(this, new C0062d(4, this));
        C.j jVar = new C.j(c0309a, 15);
        this.f1270e = jVar;
        this.f1272g = null;
        ExecutorC0067i executorC0067i = new ExecutorC0067i(abstractActivityC0146i);
        this.h = executorC0067i;
        this.i = new C0070l(executorC0067i, new C0062d(0, abstractActivityC0146i));
        new AtomicInteger();
        this.f1273j = new C0063e(abstractActivityC0146i);
        this.f1274k = new CopyOnWriteArrayList();
        this.f1275l = new CopyOnWriteArrayList();
        this.f1276m = new CopyOnWriteArrayList();
        this.f1277n = new CopyOnWriteArrayList();
        this.f1278o = new CopyOnWriteArrayList();
        this.f1279p = false;
        this.f1280q = false;
        c0098v.a(new C0064f(abstractActivityC0146i, 0));
        c0098v.a(new C0064f(abstractActivityC0146i, 1));
        c0098v.a(new C0064f(abstractActivityC0146i, 2));
        c0309a.a();
        L.d(this);
        ((C.j) jVar.f61c).I("android:support:activity-result", new C0057y(abstractActivityC0146i, 1));
        g(new A(abstractActivityC0146i, 1));
    }

    @Override // androidx.lifecycle.InterfaceC0087j
    public final c0.e a() {
        c0.e eVar = new c0.e(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = eVar.f1741a;
        if (application != null) {
            linkedHashMap.put(S.f1572f, getApplication());
        }
        linkedHashMap.put(L.f1557a, this);
        linkedHashMap.put(L.f1558b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            linkedHashMap.put(L.f1559c, getIntent().getExtras());
        }
        return eVar;
    }

    @Override // o0.InterfaceC0307d
    public final C.j b() {
        return (C.j) this.f1270e.f61c;
    }

    @Override // androidx.lifecycle.W
    public final V c() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f1271f == null) {
            C0066h c0066h = (C0066h) getLastNonConfigurationInstance();
            if (c0066h != null) {
                this.f1271f = c0066h.f1263a;
            }
            if (this.f1271f == null) {
                this.f1271f = new V();
            }
        }
        return this.f1271f;
    }

    @Override // androidx.lifecycle.InterfaceC0096t
    public final C0098v d() {
        return this.d;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        q1.d.e(keyEvent, "event");
        q1.d.d(getWindow().getDecorView(), "window.decorView");
        WeakHashMap weakHashMap = L.S.f311a;
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        q1.d.e(keyEvent, "event");
        q1.d.d(getWindow().getDecorView(), "window.decorView");
        WeakHashMap weakHashMap = L.S.f311a;
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    public final void f(K.a aVar) {
        this.f1274k.add(aVar);
    }

    public final void g(InterfaceC0101b interfaceC0101b) {
        C0100a c0100a = this.f1268b;
        c0100a.getClass();
        if (c0100a.f1724b != null) {
            interfaceC0101b.a();
        }
        c0100a.f1723a.add(interfaceC0101b);
    }

    public final v h() {
        if (this.f1272g == null) {
            this.f1272g = new v(new D0.i(8, this));
            this.d.a(new C0304a(2, this));
        }
        return this.f1272g;
    }

    public final void i() {
        View decorView = getWindow().getDecorView();
        q1.d.e(decorView, "<this>");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        q1.d.e(decorView2, "<this>");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        q1.d.e(decorView3, "<this>");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        q1.d.e(decorView4, "<this>");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        q1.d.e(decorView5, "<this>");
        decorView5.setTag(R.id.report_drawn, this);
    }

    public final void j(Bundle bundle) {
        super.onCreate(bundle);
        int i = H.f1552a;
        F.b(this);
    }

    public final void k(Bundle bundle) {
        q1.d.e(bundle, "outState");
        this.f1267a.g(EnumC0092o.f1592c);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.f1273j.a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        h().a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.f1274k.iterator();
        while (it.hasNext()) {
            ((K.a) it.next()).a(configuration);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f1270e.F(bundle);
        C0100a c0100a = this.f1268b;
        c0100a.getClass();
        c0100a.f1724b = this;
        Iterator it = c0100a.f1723a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0101b) it.next()).a();
        }
        j(bundle);
        int i = H.f1552a;
        F.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f1269c.f362c).iterator();
        while (it.hasNext()) {
            ((J) it.next()).f978a.j();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            Iterator it = ((CopyOnWriteArrayList) this.f1269c.f362c).iterator();
            while (it.hasNext()) {
                if (((J) it.next()).f978a.o()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z2) {
        if (this.f1279p) {
            return;
        }
        Iterator it = this.f1277n.iterator();
        while (it.hasNext()) {
            ((K.a) it.next()).a(new A.f(z2));
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.f1276m.iterator();
        while (it.hasNext()) {
            ((K.a) it.next()).a(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.f1269c.f362c).iterator();
        while (it.hasNext()) {
            ((J) it.next()).f978a.p();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z2) {
        if (this.f1280q) {
            return;
        }
        Iterator it = this.f1278o.iterator();
        while (it.hasNext()) {
            ((K.a) it.next()).a(new A.p(z2));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f1269c.f362c).iterator();
        while (it.hasNext()) {
            ((J) it.next()).f978a.s();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (this.f1273j.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, a.h] */
    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C0066h c0066h;
        V v2 = this.f1271f;
        if (v2 == null && (c0066h = (C0066h) getLastNonConfigurationInstance()) != null) {
            v2 = c0066h.f1263a;
        }
        if (v2 == null) {
            return null;
        }
        ?? obj = new Object();
        obj.f1263a = v2;
        return obj;
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        C0098v c0098v = this.d;
        if (c0098v != null) {
            c0098v.g(EnumC0092o.f1592c);
        }
        k(bundle);
        this.f1270e.G(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.f1275l.iterator();
        while (it.hasNext()) {
            ((K.a) it.next()).a(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (AbstractC0271z.n()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            C0070l c0070l = this.i;
            synchronized (c0070l.f1284a) {
                try {
                    c0070l.f1285b = true;
                    Iterator it = c0070l.f1286c.iterator();
                    while (it.hasNext()) {
                        ((p1.a) it.next()).a();
                    }
                    c0070l.f1286c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        i();
        View decorView = getWindow().getDecorView();
        ExecutorC0067i executorC0067i = this.h;
        if (!executorC0067i.f1266c) {
            executorC0067i.f1266c = true;
            decorView.getViewTreeObserver().addOnDrawListener(executorC0067i);
        }
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z2, Configuration configuration) {
        this.f1279p = true;
        try {
            super.onMultiWindowModeChanged(z2, configuration);
            this.f1279p = false;
            Iterator it = this.f1277n.iterator();
            while (it.hasNext()) {
                K.a aVar = (K.a) it.next();
                q1.d.e(configuration, "newConfig");
                aVar.a(new A.f(z2));
            }
        } catch (Throwable th) {
            this.f1279p = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z2, Configuration configuration) {
        this.f1280q = true;
        try {
            super.onPictureInPictureModeChanged(z2, configuration);
            this.f1280q = false;
            Iterator it = this.f1278o.iterator();
            while (it.hasNext()) {
                K.a aVar = (K.a) it.next();
                q1.d.e(configuration, "newConfig");
                aVar.a(new A.p(z2));
            }
        } catch (Throwable th) {
            this.f1280q = false;
            throw th;
        }
    }
}
