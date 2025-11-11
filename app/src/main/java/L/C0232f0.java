package l;

import android.content.Context;
import android.graphics.RectF;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: l.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0232f0 {

    /* renamed from: a, reason: collision with root package name */
    public int f3070a = 0;

    /* renamed from: b, reason: collision with root package name */
    public float f3071b = -1.0f;

    /* renamed from: c, reason: collision with root package name */
    public float f3072c = -1.0f;
    public float d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public int[] f3073e = new int[0];

    /* renamed from: f, reason: collision with root package name */
    public boolean f3074f = false;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f3075g;
    public final Context h;

    static {
        new RectF();
        new ConcurrentHashMap();
    }

    public C0232f0(TextView textView) {
        this.f3075g = textView;
        this.h = textView.getContext();
        new C0228d0();
    }

    public static int[] a(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i : iArr) {
                if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i2 = 0; i2 < size; i2++) {
                    iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public final boolean b() {
        return !(this.f3075g instanceof C0267x);
    }
}
