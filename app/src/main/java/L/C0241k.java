package l;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: l.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0241k implements Parcelable {
    public static final Parcelable.Creator<C0241k> CREATOR = new G0.b(13);

    /* renamed from: a, reason: collision with root package name */
    public int f3084a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3084a);
    }
}
