package k;

import L.U;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class m implements Menu {

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f2837y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final Context f2838a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f2839b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2840c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public k f2841e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f2842f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f2843g;
    public boolean h;
    public final ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f2844j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2845k;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f2847m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f2848n;

    /* renamed from: o, reason: collision with root package name */
    public View f2849o;

    /* renamed from: v, reason: collision with root package name */
    public o f2856v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2858x;

    /* renamed from: l, reason: collision with root package name */
    public int f2846l = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2850p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2851q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2852r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2853s = false;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f2854t = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public final CopyOnWriteArrayList f2855u = new CopyOnWriteArrayList();

    /* renamed from: w, reason: collision with root package name */
    public boolean f2857w = false;

    public m(Context context) {
        boolean z2 = false;
        this.f2838a = context;
        Resources resources = context.getResources();
        this.f2839b = resources;
        this.f2842f = new ArrayList();
        this.f2843g = new ArrayList();
        this.h = true;
        this.i = new ArrayList();
        this.f2844j = new ArrayList();
        this.f2845k = true;
        if (resources.getConfiguration().keyboard != 1 && U.b(ViewConfiguration.get(context))) {
            z2 = true;
        }
        this.d = z2;
    }

    public o a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 < 0 || i5 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i6 = (f2837y[i5] << 16) | (65535 & i3);
        o oVar = new o(this, i, i2, i3, i6, charSequence, this.f2846l);
        ArrayList arrayList = this.f2842f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i4 = 0;
                break;
            }
            if (((o) arrayList.get(size)).d <= i6) {
                i4 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i4, oVar);
        p(true);
        return oVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f2838a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            o a2 = a(i, i2, i3, resolveInfo.loadLabel(packageManager));
            a2.setIcon(resolveInfo.loadIcon(packageManager));
            a2.f2870g = intent2;
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = a2;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(y yVar, Context context) {
        this.f2855u.add(new WeakReference(yVar));
        yVar.i(context, this);
        this.f2845k = true;
    }

    public final void c(boolean z2) {
        if (this.f2853s) {
            return;
        }
        this.f2853s = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2855u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            y yVar = (y) weakReference.get();
            if (yVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                yVar.b(this, z2);
            }
        }
        this.f2853s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        o oVar = this.f2856v;
        if (oVar != null) {
            d(oVar);
        }
        this.f2842f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f2848n = null;
        this.f2847m = null;
        this.f2849o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(o oVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2855u;
        boolean z2 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f2856v == oVar) {
            w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                y yVar = (y) weakReference.get();
                if (yVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z2 = yVar.h(oVar);
                    if (z2) {
                        break;
                    }
                }
            }
            v();
            if (z2) {
                this.f2856v = null;
            }
        }
        return z2;
    }

    public boolean e(m mVar, MenuItem menuItem) {
        k kVar = this.f2841e;
        return kVar != null && kVar.q(mVar, menuItem);
    }

    public boolean f(o oVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2855u;
        boolean z2 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            y yVar = (y) weakReference.get();
            if (yVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z2 = yVar.d(oVar);
                if (z2) {
                    break;
                }
            }
        }
        v();
        if (z2) {
            this.f2856v = oVar;
        }
        return z2;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem findItem;
        ArrayList arrayList = this.f2842f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            o oVar = (o) arrayList.get(i2);
            if (oVar.f2865a == i) {
                return oVar;
            }
            if (oVar.hasSubMenu() && (findItem = oVar.f2876o.findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final o g(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.f2854t;
        arrayList.clear();
        h(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (o) arrayList.get(0);
        }
        boolean n2 = n();
        for (int i2 = 0; i2 < size; i2++) {
            o oVar = (o) arrayList.get(i2);
            char c2 = n2 ? oVar.f2871j : oVar.h;
            char[] cArr = keyData.meta;
            if ((c2 == cArr[0] && (metaState & 2) == 0) || ((c2 == cArr[2] && (metaState & 2) != 0) || (n2 && c2 == '\b' && i == 67))) {
                return oVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f2842f.get(i);
    }

    public final void h(ArrayList arrayList, int i, KeyEvent keyEvent) {
        boolean n2 = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList2 = this.f2842f;
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                o oVar = (o) arrayList2.get(i2);
                if (oVar.hasSubMenu()) {
                    oVar.f2876o.h(arrayList, i, keyEvent);
                }
                char c2 = n2 ? oVar.f2871j : oVar.h;
                if ((modifiers & 69647) == ((n2 ? oVar.f2872k : oVar.i) & 69647) && c2 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c2 == cArr[0] || c2 == cArr[2] || (n2 && c2 == '\b' && i == 67)) && oVar.isEnabled()) {
                        arrayList.add(oVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f2858x) {
            return true;
        }
        ArrayList arrayList = this.f2842f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((o) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList l2 = l();
        if (this.f2845k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f2855u;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                y yVar = (y) weakReference.get();
                if (yVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z2 |= yVar.j();
                }
            }
            ArrayList arrayList = this.i;
            ArrayList arrayList2 = this.f2844j;
            if (z2) {
                arrayList.clear();
                arrayList2.clear();
                int size = l2.size();
                for (int i = 0; i < size; i++) {
                    o oVar = (o) l2.get(i);
                    if ((oVar.f2885x & 32) == 32) {
                        arrayList.add(oVar);
                    } else {
                        arrayList2.add(oVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.f2845k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return g(i, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public m k() {
        return this;
    }

    public final ArrayList l() {
        boolean z2 = this.h;
        ArrayList arrayList = this.f2843g;
        if (!z2) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f2842f;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            o oVar = (o) arrayList2.get(i);
            if (oVar.isVisible()) {
                arrayList.add(oVar);
            }
        }
        this.h = false;
        this.f2845k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f2857w;
    }

    public boolean n() {
        return this.f2840c;
    }

    public boolean o() {
        return this.d;
    }

    public final void p(boolean z2) {
        if (this.f2850p) {
            this.f2851q = true;
            if (z2) {
                this.f2852r = true;
                return;
            }
            return;
        }
        if (z2) {
            this.h = true;
            this.f2845k = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2855u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            y yVar = (y) weakReference.get();
            if (yVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                yVar.l(z2);
            }
        }
        v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return q(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        o g2 = g(i, keyEvent);
        boolean q2 = g2 != null ? q(g2, null, i2) : false;
        if ((i2 & 2) != 0) {
            c(true);
        }
        return q2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(android.view.MenuItem r7, k.y r8, int r9) {
        /*
            r6 = this;
            k.o r7 = (k.o) r7
            r0 = 0
            if (r7 == 0) goto Ld4
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Ld
            goto Ld4
        Ld:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.f2877p
            r2 = 1
            if (r1 == 0) goto L1a
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L1a
        L18:
            r1 = r2
            goto L43
        L1a:
            k.m r1 = r7.f2875n
            boolean r3 = r1.e(r1, r7)
            if (r3 == 0) goto L23
            goto L18
        L23:
            android.content.Intent r3 = r7.f2870g
            if (r3 == 0) goto L35
            android.content.Context r1 = r1.f2838a     // Catch: android.content.ActivityNotFoundException -> L2d
            r1.startActivity(r3)     // Catch: android.content.ActivityNotFoundException -> L2d
            goto L18
        L2d:
            r1 = move-exception
            java.lang.String r3 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r3, r4, r1)
        L35:
            k.p r1 = r7.f2862A
            if (r1 == 0) goto L42
            android.view.ActionProvider r1 = r1.f2889b
            boolean r1 = r1.onPerformDefaultAction()
            if (r1 == 0) goto L42
            goto L18
        L42:
            r1 = r0
        L43:
            k.p r3 = r7.f2862A
            if (r3 == 0) goto L51
            android.view.ActionProvider r4 = r3.f2889b
            boolean r4 = r4.hasSubMenu()
            if (r4 == 0) goto L51
            r4 = r2
            goto L52
        L51:
            r4 = r0
        L52:
            boolean r5 = r7.e()
            if (r5 == 0) goto L64
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto Ld3
            r6.c(r2)
            goto Ld3
        L64:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L75
            if (r4 == 0) goto L6d
            goto L75
        L6d:
            r7 = r9 & 1
            if (r7 != 0) goto Ld3
            r6.c(r2)
            goto Ld3
        L75:
            r9 = r9 & 4
            if (r9 != 0) goto L7c
            r6.c(r0)
        L7c:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L90
            k.E r9 = new k.E
            android.content.Context r5 = r6.f2838a
            r9.<init>(r5, r6, r7)
            r7.f2876o = r9
            java.lang.CharSequence r5 = r7.f2868e
            r9.setHeaderTitle(r5)
        L90:
            k.E r7 = r7.f2876o
            if (r4 == 0) goto L9b
            k.t r9 = r3.f2890c
            android.view.ActionProvider r9 = r3.f2889b
            r9.onPrepareSubMenu(r7)
        L9b:
            java.util.concurrent.CopyOnWriteArrayList r9 = r6.f2855u
            boolean r3 = r9.isEmpty()
            if (r3 == 0) goto La4
            goto Lcd
        La4:
            if (r8 == 0) goto Laa
            boolean r0 = r8.f(r7)
        Laa:
            java.util.Iterator r8 = r9.iterator()
        Lae:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto Lcd
            java.lang.Object r3 = r8.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r4 = r3.get()
            k.y r4 = (k.y) r4
            if (r4 != 0) goto Lc6
            r9.remove(r3)
            goto Lae
        Lc6:
            if (r0 != 0) goto Lae
            boolean r0 = r4.f(r7)
            goto Lae
        Lcd:
            r1 = r1 | r0
            if (r1 != 0) goto Ld3
            r6.c(r2)
        Ld3:
            return r1
        Ld4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k.m.q(android.view.MenuItem, k.y, int):boolean");
    }

    public final void r(y yVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2855u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            y yVar2 = (y) weakReference.get();
            if (yVar2 == null || yVar2 == yVar) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f2842f;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((o) arrayList.get(i3)).f2866b == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((o) arrayList.get(i3)).f2866b != i) {
                    break;
                }
                if (i3 >= 0) {
                    ArrayList arrayList2 = this.f2842f;
                    if (i3 < arrayList2.size()) {
                        arrayList2.remove(i3);
                    }
                }
                i2 = i4;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.f2842f;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((o) arrayList.get(i2)).f2865a == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            ArrayList arrayList2 = this.f2842f;
            if (i2 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i2);
            p(true);
        }
    }

    public final void s(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f2842f.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((E) item.getSubMenu()).s(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (findItem = findItem(i2)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z2, boolean z3) {
        ArrayList arrayList = this.f2842f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            o oVar = (o) arrayList.get(i2);
            if (oVar.f2866b == i) {
                oVar.f(z3);
                oVar.setCheckable(z2);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z2) {
        this.f2857w = z2;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z2) {
        ArrayList arrayList = this.f2842f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            o oVar = (o) arrayList.get(i2);
            if (oVar.f2866b == i) {
                oVar.setEnabled(z2);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z2) {
        ArrayList arrayList = this.f2842f;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            o oVar = (o) arrayList.get(i2);
            if (oVar.f2866b == i) {
                int i3 = oVar.f2885x;
                int i4 = (i3 & (-9)) | (z2 ? 0 : 8);
                oVar.f2885x = i4;
                if (i3 != i4) {
                    z3 = true;
                }
            }
        }
        if (z3) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z2) {
        this.f2840c = z2;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f2842f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f2842f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((E) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.f2849o = view;
            this.f2847m = null;
            this.f2848n = null;
        } else {
            if (i > 0) {
                this.f2847m = this.f2839b.getText(i);
            } else if (charSequence != null) {
                this.f2847m = charSequence;
            }
            if (i2 > 0) {
                this.f2848n = B.a.b(this.f2838a, i2);
            } else if (drawable != null) {
                this.f2848n = drawable;
            }
            this.f2849o = null;
        }
        p(false);
    }

    public final void v() {
        this.f2850p = false;
        if (this.f2851q) {
            this.f2851q = false;
            p(this.f2852r);
        }
    }

    public final void w() {
        if (this.f2850p) {
            return;
        }
        this.f2850p = true;
        this.f2851q = false;
        this.f2852r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return a(0, 0, 0, this.f2839b.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f2839b.getString(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        o a2 = a(i, i2, i3, charSequence);
        E e2 = new E(this.f2838a, this, a2);
        a2.f2876o = e2;
        e2.setHeaderTitle(a2.f2868e);
        return e2;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return a(i, i2, i3, this.f2839b.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f2839b.getString(i4));
    }
}
