package g;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class D implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final View f2457a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2458b;

    /* renamed from: c, reason: collision with root package name */
    public Method f2459c;
    public Context d;

    public D(View view, String str) {
        this.f2457a = view;
        this.f2458b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f2459c == null) {
            View view2 = this.f2457a;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f2458b;
                if (context == null) {
                    int id = view2.getId();
                    if (id == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                    }
                    StringBuilder e2 = D.f.e("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    e2.append(view2.getClass());
                    e2.append(str);
                    throw new IllegalStateException(e2.toString());
                }
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                        this.f2459c = method;
                        this.d = context;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
        }
        try {
            this.f2459c.invoke(this.d, view);
        } catch (IllegalAccessException e3) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e3);
        } catch (InvocationTargetException e4) {
            throw new IllegalStateException("Could not execute method for android:onClick", e4);
        }
    }
}
