package c;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: c.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0109h implements Parcelable {
    public static final Parcelable.Creator<C0109h> CREATOR = new G0.b(9);

    /* renamed from: a, reason: collision with root package name */
    public final IntentSender f1737a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f1738b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1739c;
    public final int d;

    public C0109h(IntentSender intentSender, Intent intent, int i, int i2) {
        this.f1737a = intentSender;
        this.f1738b = intent;
        this.f1739c = i;
        this.d = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        q1.d.e(parcel, "dest");
        parcel.writeParcelable(this.f1737a, i);
        parcel.writeParcelable(this.f1738b, i);
        parcel.writeInt(this.f1739c);
        parcel.writeInt(this.d);
    }
}
