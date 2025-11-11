package w;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import com.tencent.wechat.Platform;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: n, reason: collision with root package name */
    public static final SparseIntArray f4120n;

    /* renamed from: a, reason: collision with root package name */
    public float f4121a;

    /* renamed from: b, reason: collision with root package name */
    public float f4122b;

    /* renamed from: c, reason: collision with root package name */
    public float f4123c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f4124e;

    /* renamed from: f, reason: collision with root package name */
    public float f4125f;

    /* renamed from: g, reason: collision with root package name */
    public float f4126g;
    public int h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f4127j;

    /* renamed from: k, reason: collision with root package name */
    public float f4128k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4129l;

    /* renamed from: m, reason: collision with root package name */
    public float f4130m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4120n = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
        sparseIntArray.append(11, 12);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.i);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (f4120n.get(index)) {
                case 1:
                    this.f4121a = obtainStyledAttributes.getFloat(index, this.f4121a);
                    break;
                case 2:
                    this.f4122b = obtainStyledAttributes.getFloat(index, this.f4122b);
                    break;
                case 3:
                    this.f4123c = obtainStyledAttributes.getFloat(index, this.f4123c);
                    break;
                case Platform.INFO /* 4 */:
                    this.d = obtainStyledAttributes.getFloat(index, this.d);
                    break;
                case Platform.WARN /* 5 */:
                    this.f4124e = obtainStyledAttributes.getFloat(index, this.f4124e);
                    break;
                case 6:
                    this.f4125f = obtainStyledAttributes.getDimension(index, this.f4125f);
                    break;
                case 7:
                    this.f4126g = obtainStyledAttributes.getDimension(index, this.f4126g);
                    break;
                case 8:
                    this.i = obtainStyledAttributes.getDimension(index, this.i);
                    break;
                case 9:
                    this.f4127j = obtainStyledAttributes.getDimension(index, this.f4127j);
                    break;
                case 10:
                    this.f4128k = obtainStyledAttributes.getDimension(index, this.f4128k);
                    break;
                case 11:
                    this.f4129l = true;
                    this.f4130m = obtainStyledAttributes.getDimension(index, this.f4130m);
                    break;
                case 12:
                    this.h = n.f(obtainStyledAttributes, index, this.h);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
