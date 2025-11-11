package androidx.versionedparcelable;

import G0.b;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import u0.C0360b;
import u0.InterfaceC0361c;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new b(18);

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0361c f1722a;

    public ParcelImpl(Parcel parcel) {
        this.f1722a = new C0360b(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new C0360b(parcel).i(this.f1722a);
    }
}
