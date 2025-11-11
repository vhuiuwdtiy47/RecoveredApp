package Y;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.EnumC0092o;
import java.util.ArrayList;

/* renamed from: Y.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0035b implements Parcelable {
    public static final Parcelable.Creator<C0035b> CREATOR = new G0.b(3);

    /* renamed from: a, reason: collision with root package name */
    public final int[] f1081a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1082b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f1083c;
    public final int[] d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1084e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1085f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1086g;
    public final int h;
    public final CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public final int f1087j;

    /* renamed from: k, reason: collision with root package name */
    public final CharSequence f1088k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f1089l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f1090m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f1091n;

    public C0035b(C0034a c0034a) {
        int size = c0034a.f1060a.size();
        this.f1081a = new int[size * 6];
        if (c0034a.f1065g) {
            this.f1082b = new ArrayList(size);
            this.f1083c = new int[size];
            this.d = new int[size];
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                Z z2 = (Z) c0034a.f1060a.get(i2);
                int i3 = i + 1;
                this.f1081a[i] = z2.f1054a;
                ArrayList arrayList = this.f1082b;
                AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x = z2.f1055b;
                arrayList.add(abstractComponentCallbacksC0056x != null ? abstractComponentCallbacksC0056x.f1185e : null);
                int[] iArr = this.f1081a;
                iArr[i3] = z2.f1056c ? 1 : 0;
                iArr[i + 2] = z2.d;
                iArr[i + 3] = z2.f1057e;
                int i4 = i + 5;
                iArr[i + 4] = z2.f1058f;
                i += 6;
                iArr[i4] = z2.f1059g;
                this.f1083c[i2] = z2.h.ordinal();
                this.d[i2] = z2.i.ordinal();
            }
            this.f1084e = c0034a.f1064f;
            this.f1085f = c0034a.i;
            this.f1086g = c0034a.f1075s;
            this.h = c0034a.f1066j;
            this.i = c0034a.f1067k;
            this.f1087j = c0034a.f1068l;
            this.f1088k = c0034a.f1069m;
            this.f1089l = c0034a.f1070n;
            this.f1090m = c0034a.f1071o;
            this.f1091n = c0034a.f1072p;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [Y.Z, java.lang.Object] */
    public final void a(C0034a c0034a) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.f1081a;
            boolean z2 = true;
            if (i >= iArr.length) {
                c0034a.f1064f = this.f1084e;
                c0034a.i = this.f1085f;
                c0034a.f1065g = true;
                c0034a.f1066j = this.h;
                c0034a.f1067k = this.i;
                c0034a.f1068l = this.f1087j;
                c0034a.f1069m = this.f1088k;
                c0034a.f1070n = this.f1089l;
                c0034a.f1071o = this.f1090m;
                c0034a.f1072p = this.f1091n;
                return;
            }
            ?? obj = new Object();
            int i3 = i + 1;
            obj.f1054a = iArr[i];
            if (S.H(2)) {
                Log.v("FragmentManager", "Instantiate " + c0034a + " op #" + i2 + " base fragment #" + iArr[i3]);
            }
            obj.h = EnumC0092o.values()[this.f1083c[i2]];
            obj.i = EnumC0092o.values()[this.d[i2]];
            int i4 = i + 2;
            if (iArr[i3] == 0) {
                z2 = false;
            }
            obj.f1056c = z2;
            int i5 = iArr[i4];
            obj.d = i5;
            int i6 = iArr[i + 3];
            obj.f1057e = i6;
            int i7 = i + 5;
            int i8 = iArr[i + 4];
            obj.f1058f = i8;
            i += 6;
            int i9 = iArr[i7];
            obj.f1059g = i9;
            c0034a.f1061b = i5;
            c0034a.f1062c = i6;
            c0034a.d = i8;
            c0034a.f1063e = i9;
            c0034a.b(obj);
            i2++;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f1081a);
        parcel.writeStringList(this.f1082b);
        parcel.writeIntArray(this.f1083c);
        parcel.writeIntArray(this.d);
        parcel.writeInt(this.f1084e);
        parcel.writeString(this.f1085f);
        parcel.writeInt(this.f1086g);
        parcel.writeInt(this.h);
        TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeInt(this.f1087j);
        TextUtils.writeToParcel(this.f1088k, parcel, 0);
        parcel.writeStringList(this.f1089l);
        parcel.writeStringList(this.f1090m);
        parcel.writeInt(this.f1091n ? 1 : 0);
    }

    public C0035b(Parcel parcel) {
        this.f1081a = parcel.createIntArray();
        this.f1082b = parcel.createStringArrayList();
        this.f1083c = parcel.createIntArray();
        this.d = parcel.createIntArray();
        this.f1084e = parcel.readInt();
        this.f1085f = parcel.readString();
        this.f1086g = parcel.readInt();
        this.h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.i = (CharSequence) creator.createFromParcel(parcel);
        this.f1087j = parcel.readInt();
        this.f1088k = (CharSequence) creator.createFromParcel(parcel);
        this.f1089l = parcel.createStringArrayList();
        this.f1090m = parcel.createStringArrayList();
        this.f1091n = parcel.readInt() != 0;
    }
}
