package U0;

import D0.g;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes.dex */
public final class c extends S.b {
    public static final Parcelable.Creator<c> CREATOR = new g(6);

    /* renamed from: c, reason: collision with root package name */
    public final int f808c;

    public c(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f808c = parcel.readInt();
    }

    @Override // S.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f808c);
    }

    public c(SideSheetBehavior sideSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f808c = sideSheetBehavior.h;
    }
}
