package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import u0.AbstractC0359a;
import u0.C0360b;
import u0.InterfaceC0361c;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC0359a abstractC0359a) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        InterfaceC0361c interfaceC0361c = remoteActionCompat.f1496a;
        boolean z2 = true;
        if (abstractC0359a.e(1)) {
            interfaceC0361c = abstractC0359a.g();
        }
        remoteActionCompat.f1496a = (IconCompat) interfaceC0361c;
        CharSequence charSequence = remoteActionCompat.f1497b;
        if (abstractC0359a.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C0360b) abstractC0359a).f3934e);
        }
        remoteActionCompat.f1497b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f1498c;
        if (abstractC0359a.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C0360b) abstractC0359a).f3934e);
        }
        remoteActionCompat.f1498c = charSequence2;
        remoteActionCompat.d = (PendingIntent) abstractC0359a.f(remoteActionCompat.d, 4);
        boolean z3 = remoteActionCompat.f1499e;
        if (abstractC0359a.e(5)) {
            z3 = ((C0360b) abstractC0359a).f3934e.readInt() != 0;
        }
        remoteActionCompat.f1499e = z3;
        boolean z4 = remoteActionCompat.f1500f;
        if (!abstractC0359a.e(6)) {
            z2 = z4;
        } else if (((C0360b) abstractC0359a).f3934e.readInt() == 0) {
            z2 = false;
        }
        remoteActionCompat.f1500f = z2;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC0359a abstractC0359a) {
        abstractC0359a.getClass();
        IconCompat iconCompat = remoteActionCompat.f1496a;
        abstractC0359a.h(1);
        abstractC0359a.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f1497b;
        abstractC0359a.h(2);
        Parcel parcel = ((C0360b) abstractC0359a).f3934e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f1498c;
        abstractC0359a.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.d;
        abstractC0359a.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z2 = remoteActionCompat.f1499e;
        abstractC0359a.h(5);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = remoteActionCompat.f1500f;
        abstractC0359a.h(6);
        parcel.writeInt(z3 ? 1 : 0);
    }
}
