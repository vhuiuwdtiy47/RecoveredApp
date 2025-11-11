package n0;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: n0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0297u implements Parcelable {
    public static final Parcelable.Creator<C0297u> CREATOR = new G0.b(15);

    /* renamed from: a, reason: collision with root package name */
    public int f3453a;

    /* renamed from: b, reason: collision with root package name */
    public int f3454b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3455c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3453a);
        parcel.writeInt(this.f3454b);
        parcel.writeInt(this.f3455c ? 1 : 0);
    }
}
