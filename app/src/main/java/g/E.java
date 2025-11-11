package g;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import l.C0183F;
import l.C0224b0;
import l.C0251p;
import l.C0253q;
import l.C0255r;

/* loaded from: classes.dex */
public class E {

    /* renamed from: b, reason: collision with root package name */
    public static final Class[] f2460b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f2461c = {R.attr.onClick};
    public static final String[] d = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: e, reason: collision with root package name */
    public static final o.j f2462e = new o.j(0);

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f2463a = new Object[2];

    public C0251p a(Context context, AttributeSet attributeSet) {
        return new C0251p(context, attributeSet);
    }

    public C0253q b(Context context, AttributeSet attributeSet) {
        return new C0253q(context, attributeSet);
    }

    public C0255r c(Context context, AttributeSet attributeSet) {
        return new C0255r(context, attributeSet, com.android.music.R.attr.checkboxStyle);
    }

    public C0183F d(Context context, AttributeSet attributeSet) {
        return new C0183F(context, attributeSet);
    }

    public C0224b0 e(Context context, AttributeSet attributeSet) {
        return new C0224b0(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String concat;
        o.j jVar = f2462e;
        Constructor constructor = (Constructor) jVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    concat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                concat = str;
            }
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f2460b);
            jVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f2463a);
    }
}
