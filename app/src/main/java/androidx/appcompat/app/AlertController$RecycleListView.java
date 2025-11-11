package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import f.AbstractC0117a;

/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* renamed from: a, reason: collision with root package name */
    public final int f1317a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1318b;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0117a.f2251t);
        this.f1318b = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f1317a = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
