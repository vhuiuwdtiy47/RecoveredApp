package O0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new G0.b(1);

    /* renamed from: a, reason: collision with root package name */
    public int f569a;

    /* renamed from: b, reason: collision with root package name */
    public M0.f f570b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f569a);
        parcel.writeParcelable(this.f570b, 0);
    }
}
