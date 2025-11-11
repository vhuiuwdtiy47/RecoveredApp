package Y;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;

/* loaded from: classes.dex */
public final class E implements LayoutInflater.Factory2 {

    /* renamed from: a, reason: collision with root package name */
    public final S f967a;

    public E(S s2) {
        this.f967a = s2;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z2;
        Y f2;
        boolean equals = FragmentContainerView.class.getName().equals(str);
        S s2 = this.f967a;
        if (equals) {
            return new FragmentContainerView(context, attributeSet, s2);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, X.a.f954a);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    z2 = AbstractComponentCallbacksC0056x.class.isAssignableFrom(K.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    z2 = false;
                }
                if (z2) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    AbstractComponentCallbacksC0056x B2 = resourceId != -1 ? s2.B(resourceId) : null;
                    if (B2 == null && string != null) {
                        B2 = s2.C(string);
                    }
                    if (B2 == null && id != -1) {
                        B2 = s2.B(id);
                    }
                    if (B2 == null) {
                        K E2 = s2.E();
                        context.getClassLoader();
                        B2 = E2.a(attributeValue);
                        B2.f1192n = true;
                        B2.f1201w = resourceId != 0 ? resourceId : id;
                        B2.f1202x = id;
                        B2.f1203y = string;
                        B2.f1193o = true;
                        B2.f1197s = s2;
                        B b2 = s2.f1021u;
                        B2.f1198t = b2;
                        B2.y(b2.f959f, attributeSet, B2.f1183b);
                        f2 = s2.a(B2);
                        if (S.H(2)) {
                            Log.v("FragmentManager", "Fragment " + B2 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else if (!B2.f1193o) {
                        B2.f1193o = true;
                        B2.f1197s = s2;
                        B b3 = s2.f1021u;
                        B2.f1198t = b3;
                        B2.y(b3.f959f, attributeSet, B2.f1183b);
                        f2 = s2.f(B2);
                        if (S.H(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + B2 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    Z.c cVar = Z.d.f1217a;
                    Z.d.b(new Z.a(B2, "Attempting to use <fragment> tag to add fragment " + B2 + " to container " + viewGroup));
                    Z.d.a(B2).getClass();
                    B2.f1166E = viewGroup;
                    f2.k();
                    f2.j();
                    View view2 = B2.f1167F;
                    if (view2 != null) {
                        if (resourceId != 0) {
                            view2.setId(resourceId);
                        }
                        if (B2.f1167F.getTag() == null) {
                            B2.f1167F.setTag(string);
                        }
                        B2.f1167F.addOnAttachStateChangeListener(new D(this, f2));
                        return B2.f1167F;
                    }
                    throw new IllegalStateException(D.f.d("Fragment ", attributeValue, " did not create a view."));
                }
            }
        }
        return null;
    }
}
