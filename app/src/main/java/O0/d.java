package O0;

import android.content.Context;
import android.view.SubMenu;
import k.o;

/* loaded from: classes.dex */
public final class d extends k.m {

    /* renamed from: A, reason: collision with root package name */
    public final int f536A;

    /* renamed from: z, reason: collision with root package name */
    public final Class f537z;

    public d(Context context, Class cls, int i) {
        super(context);
        this.f537z = cls;
        this.f536A = i;
    }

    @Override // k.m
    public final o a(int i, int i2, int i3, CharSequence charSequence) {
        int size = this.f2842f.size() + 1;
        int i4 = this.f536A;
        if (size <= i4) {
            w();
            o a2 = super.a(i, i2, i3, charSequence);
            a2.f(true);
            v();
            return a2;
        }
        String simpleName = this.f537z.getSimpleName();
        throw new IllegalArgumentException("Maximum number of items supported by " + simpleName + " is " + i4 + ". Limit can be checked with " + simpleName + "#getMaxItemCount()");
    }

    @Override // k.m, android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        throw new UnsupportedOperationException(this.f537z.getSimpleName().concat(" does not support submenus"));
    }
}
