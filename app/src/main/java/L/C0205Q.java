package l;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: l.Q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0205Q extends View.BaseSavedState {
    public static final Parcelable.Creator<C0205Q> CREATOR = new G0.b(14);

    /* renamed from: a, reason: collision with root package name */
    public boolean f3010a;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f3010a ? (byte) 1 : (byte) 0);
    }
}
