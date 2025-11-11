package w;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import com.tencent.wechat.Platform;
import s.AbstractC0321a;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: j, reason: collision with root package name */
    public static final SparseIntArray f4110j;

    /* renamed from: a, reason: collision with root package name */
    public int f4111a;

    /* renamed from: b, reason: collision with root package name */
    public int f4112b;

    /* renamed from: c, reason: collision with root package name */
    public int f4113c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f4114e;

    /* renamed from: f, reason: collision with root package name */
    public float f4115f;

    /* renamed from: g, reason: collision with root package name */
    public int f4116g;
    public String h;
    public int i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4110j = sparseIntArray;
        sparseIntArray.append(3, 1);
        sparseIntArray.append(5, 2);
        sparseIntArray.append(9, 3);
        sparseIntArray.append(2, 4);
        sparseIntArray.append(1, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(4, 7);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(7, 9);
        sparseIntArray.append(6, 10);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f4141f);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (f4110j.get(index)) {
                case 1:
                    this.f4114e = obtainStyledAttributes.getFloat(index, this.f4114e);
                    break;
                case 2:
                    this.f4113c = obtainStyledAttributes.getInt(index, this.f4113c);
                    break;
                case 3:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        String str = AbstractC0321a.f3581a[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case Platform.INFO /* 4 */:
                    obtainStyledAttributes.getInt(index, 0);
                    break;
                case Platform.WARN /* 5 */:
                    this.f4111a = n.f(obtainStyledAttributes, index, this.f4111a);
                    break;
                case 6:
                    this.f4112b = obtainStyledAttributes.getInteger(index, this.f4112b);
                    break;
                case 7:
                    this.d = obtainStyledAttributes.getFloat(index, this.d);
                    break;
                case 8:
                    this.f4116g = obtainStyledAttributes.getInteger(index, this.f4116g);
                    break;
                case 9:
                    this.f4115f = obtainStyledAttributes.getFloat(index, this.f4115f);
                    break;
                case 10:
                    int i2 = obtainStyledAttributes.peekValue(index).type;
                    if (i2 == 1) {
                        this.i = obtainStyledAttributes.getResourceId(index, -1);
                        break;
                    } else if (i2 == 3) {
                        String string = obtainStyledAttributes.getString(index);
                        this.h = string;
                        if (string.indexOf("/") > 0) {
                            this.i = obtainStyledAttributes.getResourceId(index, -1);
                            break;
                        } else {
                            break;
                        }
                    } else {
                        obtainStyledAttributes.getInteger(index, this.i);
                        break;
                    }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
