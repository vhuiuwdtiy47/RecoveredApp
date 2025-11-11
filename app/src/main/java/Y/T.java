package Y;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class T implements Parcelable {
    public static final Parcelable.Creator<T> CREATOR = new G0.b(6);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f1027a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f1028b;

    /* renamed from: c, reason: collision with root package name */
    public C0035b[] f1029c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public String f1030e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f1031f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f1032g;
    public ArrayList h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f1027a);
        parcel.writeStringList(this.f1028b);
        parcel.writeTypedArray(this.f1029c, i);
        parcel.writeInt(this.d);
        parcel.writeString(this.f1030e);
        parcel.writeStringList(this.f1031f);
        parcel.writeTypedList(this.f1032g);
        parcel.writeTypedList(this.h);
    }
}
