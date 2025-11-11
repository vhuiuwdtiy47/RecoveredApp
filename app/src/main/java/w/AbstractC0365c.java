package w;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import t.C0326d;

/* renamed from: w.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0365c extends View {

    /* renamed from: a, reason: collision with root package name */
    public int[] f3953a;

    /* renamed from: b, reason: collision with root package name */
    public int f3954b;

    /* renamed from: c, reason: collision with root package name */
    public Context f3955c;
    public t.i d;

    /* renamed from: e, reason: collision with root package name */
    public String f3956e;

    /* renamed from: f, reason: collision with root package name */
    public String f3957f;

    /* renamed from: g, reason: collision with root package name */
    public HashMap f3958g;

    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L98
            int r0 = r6.length()
            if (r0 != 0) goto La
            goto L98
        La:
            android.content.Context r0 = r5.f3955c
            if (r0 != 0) goto L10
            goto L98
        L10:
            java.lang.String r6 = r6.trim()
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            r2 = 0
            if (r1 == 0) goto L24
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            goto L25
        L24:
            r1 = r2
        L25:
            boolean r3 = r5.isInEditMode()
            if (r3 == 0) goto L4c
            if (r1 == 0) goto L4c
            if (r6 == 0) goto L40
            java.util.HashMap r3 = r1.f1472m
            if (r3 == 0) goto L40
            boolean r3 = r3.containsKey(r6)
            if (r3 == 0) goto L40
            java.util.HashMap r3 = r1.f1472m
            java.lang.Object r3 = r3.get(r6)
            goto L41
        L40:
            r3 = r2
        L41:
            boolean r4 = r3 instanceof java.lang.Integer
            if (r4 == 0) goto L4c
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L4d
        L4c:
            r3 = 0
        L4d:
            if (r3 != 0) goto L55
            if (r1 == 0) goto L55
            int r3 = r5.f(r1, r6)
        L55:
            if (r3 != 0) goto L61
            java.lang.Class<w.q> r1 = w.q.class
            java.lang.reflect.Field r1 = r1.getField(r6)     // Catch: java.lang.Exception -> L61
            int r3 = r1.getInt(r2)     // Catch: java.lang.Exception -> L61
        L61:
            if (r3 != 0) goto L71
            android.content.res.Resources r1 = r0.getResources()
            java.lang.String r2 = "id"
            java.lang.String r0 = r0.getPackageName()
            int r3 = r1.getIdentifier(r6, r2, r0)
        L71:
            if (r3 == 0) goto L80
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.util.HashMap r1 = r5.f3958g
            r1.put(r0, r6)
            r5.b(r3)
            goto L98
        L80:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Could not find id of \""
            r5.<init>(r0)
            r5.append(r6)
            java.lang.String r6 = "\""
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "ConstraintHelper"
            android.util.Log.w(r6, r5)
        L98:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w.AbstractC0365c.a(java.lang.String):void");
    }

    public final void b(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.f3954b + 1;
        int[] iArr = this.f3953a;
        if (i2 > iArr.length) {
            this.f3953a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f3953a;
        int i3 = this.f3954b;
        iArr2[i3] = i;
        this.f3954b = i3 + 1;
    }

    public final void c(String str) {
        if (str == null || str.length() == 0 || this.f3955c == null) {
            return;
        }
        String trim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof C0367e) && trim.equals(((C0367e) layoutParams).f3983Y)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    b(childAt.getId());
                }
            }
        }
    }

    public final void d(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.f3954b; i++) {
            View view = (View) constraintLayout.f1463a.get(this.f3953a[i]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > 0.0f) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    public void e(ConstraintLayout constraintLayout) {
    }

    public final int f(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str != null && (resources = this.f3955c.getResources()) != null) {
            int childCount = constraintLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = constraintLayout.getChildAt(i);
                if (childAt.getId() != -1) {
                    try {
                        str2 = resources.getResourceEntryName(childAt.getId());
                    } catch (Resources.NotFoundException unused) {
                        str2 = null;
                    }
                    if (str.equals(str2)) {
                        return childAt.getId();
                    }
                }
            }
        }
        return 0;
    }

    public void g(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f4138b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 35) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f3956e = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f3957f = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f3953a, this.f3954b);
    }

    public abstract void h(C0326d c0326d, boolean z2);

    public final void i() {
        if (this.d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof C0367e) {
            ((C0367e) layoutParams).f4012p0 = this.d;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f3956e;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f3957f;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f3956e = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f3954b = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                a(str.substring(i));
                return;
            } else {
                a(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f3957f = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f3954b = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                c(str.substring(i));
                return;
            } else {
                c(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f3956e = null;
        this.f3954b = 0;
        for (int i : iArr) {
            b(i);
        }
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f3956e == null) {
            b(i);
        }
    }
}
