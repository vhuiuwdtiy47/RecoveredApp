package k;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o implements F.a {

    /* renamed from: A, reason: collision with root package name */
    public p f2862A;

    /* renamed from: B, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f2863B;

    /* renamed from: a, reason: collision with root package name */
    public final int f2865a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2866b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2867c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f2868e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f2869f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f2870g;
    public char h;

    /* renamed from: j, reason: collision with root package name */
    public char f2871j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f2873l;

    /* renamed from: n, reason: collision with root package name */
    public final m f2875n;

    /* renamed from: o, reason: collision with root package name */
    public E f2876o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f2877p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f2878q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f2879r;

    /* renamed from: y, reason: collision with root package name */
    public int f2886y;

    /* renamed from: z, reason: collision with root package name */
    public View f2887z;
    public int i = 4096;

    /* renamed from: k, reason: collision with root package name */
    public int f2872k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f2874m = 0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f2880s = null;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f2881t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2882u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2883v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2884w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f2885x = 16;

    /* renamed from: C, reason: collision with root package name */
    public boolean f2864C = false;

    public o(m mVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f2875n = mVar;
        this.f2865a = i2;
        this.f2866b = i;
        this.f2867c = i3;
        this.d = i4;
        this.f2868e = charSequence;
        this.f2886y = i5;
    }

    public static void c(int i, int i2, String str, StringBuilder sb) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // F.a
    public final p a() {
        return this.f2862A;
    }

    @Override // F.a
    public final F.a b(p pVar) {
        this.f2887z = null;
        this.f2862A = pVar;
        this.f2875n.p(true);
        p pVar2 = this.f2862A;
        if (pVar2 != null) {
            pVar2.f2888a = new A0.c(22, this);
            pVar2.f2889b.setVisibilityListener(pVar2);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f2886y & 8) == 0) {
            return false;
        }
        if (this.f2887z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f2863B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f2875n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f2884w && (this.f2882u || this.f2883v)) {
            drawable = drawable.mutate();
            if (this.f2882u) {
                E.a.h(drawable, this.f2880s);
            }
            if (this.f2883v) {
                E.a.i(drawable, this.f2881t);
            }
            this.f2884w = false;
        }
        return drawable;
    }

    public final boolean e() {
        p pVar;
        if ((this.f2886y & 8) != 0) {
            if (this.f2887z == null && (pVar = this.f2862A) != null) {
                this.f2887z = pVar.f2889b.onCreateActionView(this);
            }
            if (this.f2887z != null) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f2863B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f2875n.f(this);
        }
        return false;
    }

    public final void f(boolean z2) {
        this.f2885x = (z2 ? 4 : 0) | (this.f2885x & (-5));
    }

    public final void g(boolean z2) {
        if (z2) {
            this.f2885x |= 32;
        } else {
            this.f2885x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f2887z;
        if (view != null) {
            return view;
        }
        p pVar = this.f2862A;
        if (pVar == null) {
            return null;
        }
        View onCreateActionView = pVar.f2889b.onCreateActionView(this);
        this.f2887z = onCreateActionView;
        return onCreateActionView;
    }

    @Override // F.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f2872k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f2871j;
    }

    @Override // F.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f2878q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f2866b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f2873l;
        if (drawable != null) {
            return d(drawable);
        }
        int i = this.f2874m;
        if (i == 0) {
            return null;
        }
        Drawable u2 = U.t.u(this.f2875n.f2838a, i);
        this.f2874m = 0;
        this.f2873l = u2;
        return d(u2);
    }

    @Override // F.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f2880s;
    }

    @Override // F.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f2881t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f2870g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f2865a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // F.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f2867c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f2876o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f2868e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f2869f;
        return charSequence != null ? charSequence : this.f2868e;
    }

    @Override // F.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f2879r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f2876o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f2864C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f2885x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f2885x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f2885x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        p pVar = this.f2862A;
        return (pVar == null || !pVar.f2889b.overridesItemVisibility()) ? (this.f2885x & 8) == 0 : (this.f2885x & 8) == 0 && this.f2862A.f2889b.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f2887z = view;
        this.f2862A = null;
        if (view != null && view.getId() == -1 && (i = this.f2865a) > 0) {
            view.setId(i);
        }
        m mVar = this.f2875n;
        mVar.f2845k = true;
        mVar.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2) {
        if (this.f2871j == c2) {
            return this;
        }
        this.f2871j = Character.toLowerCase(c2);
        this.f2875n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        int i = this.f2885x;
        int i2 = (z2 ? 1 : 0) | (i & (-2));
        this.f2885x = i2;
        if (i != i2) {
            this.f2875n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        int i = this.f2885x;
        if ((i & 4) == 0) {
            int i2 = (i & (-3)) | (z2 ? 2 : 0);
            this.f2885x = i2;
            if (i != i2) {
                this.f2875n.p(false);
            }
            return this;
        }
        m mVar = this.f2875n;
        mVar.getClass();
        ArrayList arrayList = mVar.f2842f;
        int size = arrayList.size();
        mVar.w();
        for (int i3 = 0; i3 < size; i3++) {
            o oVar = (o) arrayList.get(i3);
            if (oVar.f2866b == this.f2866b && (oVar.f2885x & 4) != 0 && oVar.isCheckable()) {
                boolean z3 = oVar == this;
                int i4 = oVar.f2885x;
                int i5 = (z3 ? 2 : 0) | (i4 & (-3));
                oVar.f2885x = i5;
                if (i4 != i5) {
                    oVar.f2875n.p(false);
                }
            }
        }
        mVar.v();
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z2) {
        if (z2) {
            this.f2885x |= 16;
        } else {
            this.f2885x &= -17;
        }
        this.f2875n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f2874m = 0;
        this.f2873l = drawable;
        this.f2884w = true;
        this.f2875n.p(false);
        return this;
    }

    @Override // F.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2880s = colorStateList;
        this.f2882u = true;
        this.f2884w = true;
        this.f2875n.p(false);
        return this;
    }

    @Override // F.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f2881t = mode;
        this.f2883v = true;
        this.f2884w = true;
        this.f2875n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f2870g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2) {
        if (this.h == c2) {
            return this;
        }
        this.h = c2;
        this.f2875n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f2863B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2877p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3) {
        this.h = c2;
        this.f2871j = Character.toLowerCase(c3);
        this.f2875n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f2886y = i;
        m mVar = this.f2875n;
        mVar.f2845k = true;
        mVar.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f2868e = charSequence;
        this.f2875n.p(false);
        E e2 = this.f2876o;
        if (e2 != null) {
            e2.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2869f = charSequence;
        this.f2875n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        int i = this.f2885x;
        int i2 = (z2 ? 0 : 8) | (i & (-9));
        this.f2885x = i2;
        if (i != i2) {
            m mVar = this.f2875n;
            mVar.h = true;
            mVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f2868e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // F.a, android.view.MenuItem
    public final F.a setContentDescription(CharSequence charSequence) {
        this.f2878q = charSequence;
        this.f2875n.p(false);
        return this;
    }

    @Override // F.a, android.view.MenuItem
    public final F.a setTooltipText(CharSequence charSequence) {
        this.f2879r = charSequence;
        this.f2875n.p(false);
        return this;
    }

    @Override // F.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2, int i) {
        if (this.f2871j == c2 && this.f2872k == i) {
            return this;
        }
        this.f2871j = Character.toLowerCase(c2);
        this.f2872k = KeyEvent.normalizeMetaState(i);
        this.f2875n.p(false);
        return this;
    }

    @Override // F.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2, int i) {
        if (this.h == c2 && this.i == i) {
            return this;
        }
        this.h = c2;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f2875n.p(false);
        return this;
    }

    @Override // F.a, android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.h = c2;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f2871j = Character.toLowerCase(c3);
        this.f2872k = KeyEvent.normalizeMetaState(i2);
        this.f2875n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f2873l = null;
        this.f2874m = i;
        this.f2884w = true;
        this.f2875n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f2875n.f2838a.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i2;
        Context context = this.f2875n.f2838a;
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f2887z = inflate;
        this.f2862A = null;
        if (inflate != null && inflate.getId() == -1 && (i2 = this.f2865a) > 0) {
            inflate.setId(i2);
        }
        m mVar = this.f2875n;
        mVar.f2845k = true;
        mVar.p(true);
        return this;
    }
}
