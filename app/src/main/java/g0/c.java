package G0;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes.dex */
public final class c extends View.BaseSavedState {
    public static final Parcelable.Creator<c> CREATOR = new b(0);

    /* renamed from: a, reason: collision with root package name */
    public int f161a;

    public final String toString() {
        StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" CheckedState=");
        int i = this.f161a;
        sb.append(i != 1 ? i != 2 ? "unchecked" : "indeterminate" : "checked");
        sb.append("}");
        return sb.toString();
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Integer.valueOf(this.f161a));
    }
}
