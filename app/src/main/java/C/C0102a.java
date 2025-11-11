package c;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: c.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0102a implements Parcelable {
    public static final Parcelable.Creator<C0102a> CREATOR = new G0.b(8);

    /* renamed from: a, reason: collision with root package name */
    public final int f1725a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f1726b;

    public C0102a(int i, Intent intent) {
        this.f1725a = i;
        this.f1726b = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i = this.f1725a;
        sb.append(i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f1726b);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1725a);
        Intent intent = this.f1726b;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }

    public C0102a(Parcel parcel) {
        this.f1725a = parcel.readInt();
        this.f1726b = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
