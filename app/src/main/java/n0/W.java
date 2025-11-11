package n0;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class W {

    /* renamed from: s, reason: collision with root package name */
    public static final List f3296s = Collections.EMPTY_LIST;

    /* renamed from: a, reason: collision with root package name */
    public final View f3297a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f3298b;

    /* renamed from: j, reason: collision with root package name */
    public int f3303j;

    /* renamed from: r, reason: collision with root package name */
    public RecyclerView f3311r;

    /* renamed from: c, reason: collision with root package name */
    public int f3299c = -1;
    public int d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f3300e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f3301f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f3302g = -1;
    public W h = null;
    public W i = null;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f3304k = null;

    /* renamed from: l, reason: collision with root package name */
    public final List f3305l = null;

    /* renamed from: m, reason: collision with root package name */
    public int f3306m = 0;

    /* renamed from: n, reason: collision with root package name */
    public N f3307n = null;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3308o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f3309p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f3310q = -1;

    public W(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f3297a = view;
    }

    public final void a(int i) {
        this.f3303j = i | this.f3303j;
    }

    public final int b() {
        int i = this.f3302g;
        return i == -1 ? this.f3299c : i;
    }

    public final List c() {
        ArrayList arrayList;
        return ((this.f3303j & 1024) != 0 || (arrayList = this.f3304k) == null || arrayList.size() == 0) ? f3296s : this.f3305l;
    }

    public final boolean d() {
        View view = this.f3297a;
        return (view.getParent() == null || view.getParent() == this.f3311r) ? false : true;
    }

    public final boolean e() {
        return (this.f3303j & 1) != 0;
    }

    public final boolean f() {
        return (this.f3303j & 4) != 0;
    }

    public final boolean g() {
        if ((this.f3303j & 16) != 0) {
            return false;
        }
        WeakHashMap weakHashMap = L.S.f311a;
        return !this.f3297a.hasTransientState();
    }

    public final boolean h() {
        return (this.f3303j & 8) != 0;
    }

    public final boolean i() {
        return this.f3307n != null;
    }

    public final boolean j() {
        return (this.f3303j & 256) != 0;
    }

    public final boolean k() {
        return (this.f3303j & 2) != 0;
    }

    public final void l(int i, boolean z2) {
        if (this.d == -1) {
            this.d = this.f3299c;
        }
        if (this.f3302g == -1) {
            this.f3302g = this.f3299c;
        }
        if (z2) {
            this.f3302g += i;
        }
        this.f3299c += i;
        View view = this.f3297a;
        if (view.getLayoutParams() != null) {
            ((I) view.getLayoutParams()).f3260c = true;
        }
    }

    public final void m() {
        this.f3303j = 0;
        this.f3299c = -1;
        this.d = -1;
        this.f3300e = -1L;
        this.f3302g = -1;
        this.f3306m = 0;
        this.h = null;
        this.i = null;
        ArrayList arrayList = this.f3304k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f3303j &= -1025;
        this.f3309p = 0;
        this.f3310q = -1;
        RecyclerView.j(this);
    }

    public final void n(boolean z2) {
        int i = this.f3306m;
        int i2 = z2 ? i - 1 : i + 1;
        this.f3306m = i2;
        if (i2 < 0) {
            this.f3306m = 0;
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            return;
        }
        if (!z2 && i2 == 1) {
            this.f3303j |= 16;
        } else if (z2 && i2 == 0) {
            this.f3303j &= -17;
        }
    }

    public final boolean o() {
        return (this.f3303j & 128) != 0;
    }

    public final boolean p() {
        return (this.f3303j & 32) != 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f3299c + " id=" + this.f3300e + ", oldPos=" + this.d + ", pLpos:" + this.f3302g);
        if (i()) {
            sb.append(" scrap ");
            sb.append(this.f3308o ? "[changeScrap]" : "[attachedScrap]");
        }
        if (f()) {
            sb.append(" invalid");
        }
        if (!e()) {
            sb.append(" unbound");
        }
        if ((this.f3303j & 2) != 0) {
            sb.append(" update");
        }
        if (h()) {
            sb.append(" removed");
        }
        if (o()) {
            sb.append(" ignored");
        }
        if (j()) {
            sb.append(" tmpDetached");
        }
        if (!g()) {
            sb.append(" not recyclable(" + this.f3306m + ")");
        }
        if ((this.f3303j & 512) != 0 || f()) {
            sb.append(" undefined adapter position");
        }
        if (this.f3297a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
