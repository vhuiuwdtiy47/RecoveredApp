package w;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: w.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0369g {

    /* renamed from: a, reason: collision with root package name */
    public final float f4029a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4030b;

    /* renamed from: c, reason: collision with root package name */
    public final float f4031c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4032e;

    public C0369g(Context context, XmlResourceParser xmlResourceParser) {
        this.f4029a = Float.NaN;
        this.f4030b = Float.NaN;
        this.f4031c = Float.NaN;
        this.d = Float.NaN;
        this.f4032e = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.f4143j);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f4032e);
                this.f4032e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new n().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.d = obtainStyledAttributes.getDimension(index, this.d);
            } else if (index == 2) {
                this.f4030b = obtainStyledAttributes.getDimension(index, this.f4030b);
            } else if (index == 3) {
                this.f4031c = obtainStyledAttributes.getDimension(index, this.f4031c);
            } else if (index == 4) {
                this.f4029a = obtainStyledAttributes.getDimension(index, this.f4029a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        obtainStyledAttributes.recycle();
    }
}
