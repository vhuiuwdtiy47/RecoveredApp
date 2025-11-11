package G0;

import M0.f;
import O0.g;
import R.k;
import Y.C0035b;
import Y.C0036c;
import Y.N;
import Y.T;
import Y.X;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.versionedparcelable.ParcelImpl;
import c.C0102a;
import c.C0109h;
import com.google.android.material.datepicker.n;
import com.tencent.wechat.Platform;
import java.util.ArrayList;
import java.util.Locale;
import l.C0205Q;
import l.C0241k;
import n0.C0297u;
import n0.c0;
import n0.d0;
import z0.C0386b;

/* loaded from: classes.dex */
public final class b implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f160a;

    /* JADX WARN: Type inference failed for: r7v2, types: [android.view.View$BaseSavedState, java.lang.Object, G0.c] */
    /* JADX WARN: Type inference failed for: r7v22, types: [l.k, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v23, types: [android.view.View$BaseSavedState, java.lang.Object, l.Q] */
    /* JADX WARN: Type inference failed for: r7v24, types: [java.lang.Object, n0.u] */
    /* JADX WARN: Type inference failed for: r7v25, types: [java.lang.Object, n0.c0] */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.lang.Object, n0.d0] */
    /* JADX WARN: Type inference failed for: r7v28, types: [z0.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, O0.g] */
    /* JADX WARN: Type inference failed for: r7v4, types: [android.view.View$BaseSavedState, java.lang.Object, R.k] */
    /* JADX WARN: Type inference failed for: r7v7, types: [Y.N, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object, Y.T] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f160a) {
            case 0:
                ?? baseSavedState = new View.BaseSavedState(parcel);
                baseSavedState.f161a = ((Integer) parcel.readValue(c.class.getClassLoader())).intValue();
                return baseSavedState;
            case 1:
                ?? obj = new Object();
                obj.f569a = parcel.readInt();
                obj.f570b = (f) parcel.readParcelable(g.class.getClassLoader());
                return obj;
            case 2:
                ?? baseSavedState2 = new View.BaseSavedState(parcel);
                baseSavedState2.f623a = parcel.readInt();
                return baseSavedState2;
            case 3:
                return new C0035b(parcel);
            case Platform.INFO /* 4 */:
                return new C0036c(parcel);
            case Platform.WARN /* 5 */:
                ?? obj2 = new Object();
                obj2.f983a = parcel.readString();
                obj2.f984b = parcel.readInt();
                return obj2;
            case 6:
                ?? obj3 = new Object();
                obj3.f1030e = null;
                obj3.f1031f = new ArrayList();
                obj3.f1032g = new ArrayList();
                obj3.f1027a = parcel.createStringArrayList();
                obj3.f1028b = parcel.createStringArrayList();
                obj3.f1029c = (C0035b[]) parcel.createTypedArray(C0035b.CREATOR);
                obj3.d = parcel.readInt();
                obj3.f1030e = parcel.readString();
                obj3.f1031f = parcel.createStringArrayList();
                obj3.f1032g = parcel.createTypedArrayList(C0036c.CREATOR);
                obj3.h = parcel.createTypedArrayList(N.CREATOR);
                return obj3;
            case 7:
                return new X(parcel);
            case 8:
                return new C0102a(parcel);
            case 9:
                q1.d.e(parcel, "inParcel");
                Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                q1.d.b(readParcelable);
                return new C0109h((IntentSender) readParcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 10:
                return new com.google.android.material.datepicker.b((n) parcel.readParcelable(n.class.getClassLoader()), (n) parcel.readParcelable(n.class.getClassLoader()), (com.google.android.material.datepicker.d) parcel.readParcelable(com.google.android.material.datepicker.d.class.getClassLoader()), (n) parcel.readParcelable(n.class.getClassLoader()), parcel.readInt());
            case 11:
                return new com.google.android.material.datepicker.d(parcel.readLong());
            case 12:
                return n.a(parcel.readInt(), parcel.readInt());
            case 13:
                ?? obj4 = new Object();
                obj4.f3084a = parcel.readInt();
                return obj4;
            case 14:
                ?? baseSavedState3 = new View.BaseSavedState(parcel);
                baseSavedState3.f3010a = parcel.readByte() != 0;
                return baseSavedState3;
            case 15:
                ?? obj5 = new Object();
                obj5.f3453a = parcel.readInt();
                obj5.f3454b = parcel.readInt();
                obj5.f3455c = parcel.readInt() == 1;
                return obj5;
            case 16:
                ?? obj6 = new Object();
                obj6.f3331a = parcel.readInt();
                obj6.f3332b = parcel.readInt();
                obj6.d = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    obj6.f3333c = iArr;
                    parcel.readIntArray(iArr);
                }
                return obj6;
            case 17:
                ?? obj7 = new Object();
                obj7.f3338a = parcel.readInt();
                obj7.f3339b = parcel.readInt();
                int readInt2 = parcel.readInt();
                obj7.f3340c = readInt2;
                if (readInt2 > 0) {
                    int[] iArr2 = new int[readInt2];
                    obj7.d = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt3 = parcel.readInt();
                obj7.f3341e = readInt3;
                if (readInt3 > 0) {
                    int[] iArr3 = new int[readInt3];
                    obj7.f3342f = iArr3;
                    parcel.readIntArray(iArr3);
                }
                obj7.h = parcel.readInt() == 1;
                obj7.i = parcel.readInt() == 1;
                obj7.f3344j = parcel.readInt() == 1;
                obj7.f3343g = parcel.readArrayList(c0.class.getClassLoader());
                return obj7;
            case 18:
                return new ParcelImpl(parcel);
            default:
                ?? obj8 = new Object();
                obj8.i = 255;
                obj8.f4250k = -2;
                obj8.f4251l = -2;
                obj8.f4252m = -2;
                obj8.f4259t = Boolean.TRUE;
                obj8.f4243a = parcel.readInt();
                obj8.f4244b = (Integer) parcel.readSerializable();
                obj8.f4245c = (Integer) parcel.readSerializable();
                obj8.d = (Integer) parcel.readSerializable();
                obj8.f4246e = (Integer) parcel.readSerializable();
                obj8.f4247f = (Integer) parcel.readSerializable();
                obj8.f4248g = (Integer) parcel.readSerializable();
                obj8.h = (Integer) parcel.readSerializable();
                obj8.i = parcel.readInt();
                obj8.f4249j = parcel.readString();
                obj8.f4250k = parcel.readInt();
                obj8.f4251l = parcel.readInt();
                obj8.f4252m = parcel.readInt();
                obj8.f4254o = parcel.readString();
                obj8.f4255p = parcel.readString();
                obj8.f4256q = parcel.readInt();
                obj8.f4258s = (Integer) parcel.readSerializable();
                obj8.f4260u = (Integer) parcel.readSerializable();
                obj8.f4261v = (Integer) parcel.readSerializable();
                obj8.f4262w = (Integer) parcel.readSerializable();
                obj8.f4263x = (Integer) parcel.readSerializable();
                obj8.f4264y = (Integer) parcel.readSerializable();
                obj8.f4265z = (Integer) parcel.readSerializable();
                obj8.f4241C = (Integer) parcel.readSerializable();
                obj8.f4239A = (Integer) parcel.readSerializable();
                obj8.f4240B = (Integer) parcel.readSerializable();
                obj8.f4259t = (Boolean) parcel.readSerializable();
                obj8.f4253n = (Locale) parcel.readSerializable();
                obj8.f4242D = (Boolean) parcel.readSerializable();
                return obj8;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f160a) {
            case 0:
                return new c[i];
            case 1:
                return new g[i];
            case 2:
                return new k[i];
            case 3:
                return new C0035b[i];
            case Platform.INFO /* 4 */:
                return new C0036c[i];
            case Platform.WARN /* 5 */:
                return new N[i];
            case 6:
                return new T[i];
            case 7:
                return new X[i];
            case 8:
                return new C0102a[i];
            case 9:
                return new C0109h[i];
            case 10:
                return new com.google.android.material.datepicker.b[i];
            case 11:
                return new com.google.android.material.datepicker.d[i];
            case 12:
                return new n[i];
            case 13:
                return new C0241k[i];
            case 14:
                return new C0205Q[i];
            case 15:
                return new C0297u[i];
            case 16:
                return new c0[i];
            case 17:
                return new d0[i];
            case 18:
                return new ParcelImpl[i];
            default:
                return new C0386b[i];
        }
    }
}
