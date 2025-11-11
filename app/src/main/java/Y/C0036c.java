package Y;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: Y.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0036c implements Parcelable {
    public static final Parcelable.Creator<C0036c> CREATOR = new G0.b(4);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1094a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1095b;

    public C0036c(ArrayList arrayList, ArrayList arrayList2) {
        this.f1094a = arrayList;
        this.f1095b = arrayList2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f1094a);
        parcel.writeTypedList(this.f1095b);
    }

    public C0036c(Parcel parcel) {
        this.f1094a = parcel.createStringArrayList();
        this.f1095b = parcel.createTypedArrayList(C0035b.CREATOR);
    }
}
