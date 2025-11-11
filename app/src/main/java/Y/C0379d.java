package y;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import x.AbstractC0374a;

/* renamed from: y.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0379d extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0376a f4204a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4205b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4206c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4207e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4208f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4209g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f4210j;

    /* renamed from: k, reason: collision with root package name */
    public View f4211k;

    /* renamed from: l, reason: collision with root package name */
    public View f4212l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4213m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4214n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f4215o;

    public C0379d() {
        super(-2, -2);
        this.f4205b = false;
        this.f4206c = 0;
        this.d = 0;
        this.f4207e = -1;
        this.f4208f = -1;
        this.f4209g = 0;
        this.h = 0;
        this.f4215o = new Rect();
    }

    public final boolean a(int i) {
        if (i == 0) {
            return this.f4213m;
        }
        if (i != 1) {
            return false;
        }
        return this.f4214n;
    }

    public C0379d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC0376a abstractC0376a;
        this.f4205b = false;
        this.f4206c = 0;
        this.d = 0;
        this.f4207e = -1;
        this.f4208f = -1;
        this.f4209g = 0;
        this.h = 0;
        this.f4215o = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0374a.f4188b);
        this.f4206c = obtainStyledAttributes.getInteger(0, 0);
        this.f4208f = obtainStyledAttributes.getResourceId(1, -1);
        this.d = obtainStyledAttributes.getInteger(2, 0);
        this.f4207e = obtainStyledAttributes.getInteger(6, -1);
        this.f4209g = obtainStyledAttributes.getInt(5, 0);
        this.h = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.f4205b = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f1475t;
            if (TextUtils.isEmpty(string)) {
                abstractC0376a = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f1475t;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f1477v;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f1476u);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    abstractC0376a = (AbstractC0376a) constructor.newInstance(context, attributeSet);
                } catch (Exception e2) {
                    throw new RuntimeException("Could not inflate Behavior subclass " + string, e2);
                }
            }
            this.f4204a = abstractC0376a;
        }
        obtainStyledAttributes.recycle();
        AbstractC0376a abstractC0376a2 = this.f4204a;
        if (abstractC0376a2 != null) {
            abstractC0376a2.c(this);
        }
    }

    public C0379d(C0379d c0379d) {
        super((ViewGroup.MarginLayoutParams) c0379d);
        this.f4205b = false;
        this.f4206c = 0;
        this.d = 0;
        this.f4207e = -1;
        this.f4208f = -1;
        this.f4209g = 0;
        this.h = 0;
        this.f4215o = new Rect();
    }

    public C0379d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f4205b = false;
        this.f4206c = 0;
        this.d = 0;
        this.f4207e = -1;
        this.f4208f = -1;
        this.f4209g = 0;
        this.h = 0;
        this.f4215o = new Rect();
    }

    public C0379d(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f4205b = false;
        this.f4206c = 0;
        this.d = 0;
        this.f4207e = -1;
        this.f4208f = -1;
        this.f4209g = 0;
        this.h = 0;
        this.f4215o = new Rect();
    }
}
