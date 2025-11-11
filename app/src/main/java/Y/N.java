package Y;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class N implements Parcelable {
    public static final Parcelable.Creator<N> CREATOR = new G0.b(5);

    /* renamed from: a, reason: collision with root package name */
    public String f983a;

    /* renamed from: b, reason: collision with root package name */
    public int f984b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f983a);
        parcel.writeInt(this.f984b);
    }
}
