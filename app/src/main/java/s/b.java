package S;

import D0.g;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class b implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public final Parcelable f628a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f627b = new b();
    public static final Parcelable.Creator<b> CREATOR = new g(5);

    public b() {
        this.f628a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f628a, i);
    }

    public b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f628a = parcelable == f627b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f628a = readParcelable == null ? f627b : readParcelable;
    }
}
