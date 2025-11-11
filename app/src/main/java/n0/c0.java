package n0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c0 implements Parcelable {
    public static final Parcelable.Creator<c0> CREATOR = new G0.b(16);

    /* renamed from: a, reason: collision with root package name */
    public int f3331a;

    /* renamed from: b, reason: collision with root package name */
    public int f3332b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f3333c;
    public boolean d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f3331a + ", mGapDir=" + this.f3332b + ", mHasUnwantedGapAfter=" + this.d + ", mGapPerSpan=" + Arrays.toString(this.f3333c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3331a);
        parcel.writeInt(this.f3332b);
        parcel.writeInt(this.d ? 1 : 0);
        int[] iArr = this.f3333c;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f3333c);
        }
    }
}
