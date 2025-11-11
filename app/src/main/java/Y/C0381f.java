package y;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* renamed from: y.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0381f extends S.b {
    public static final Parcelable.Creator<C0381f> CREATOR = new D0.g(10);

    /* renamed from: c, reason: collision with root package name */
    public SparseArray f4217c;

    public C0381f(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        this.f4217c = new SparseArray(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f4217c.append(iArr[i], readParcelableArray[i]);
        }
    }

    @Override // S.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        SparseArray sparseArray = this.f4217c;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = this.f4217c.keyAt(i2);
            parcelableArr[i2] = (Parcelable) this.f4217c.valueAt(i2);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}
