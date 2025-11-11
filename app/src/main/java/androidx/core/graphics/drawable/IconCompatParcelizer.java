package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.wechat.Platform;
import java.nio.charset.Charset;
import u0.AbstractC0359a;
import u0.C0360b;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(AbstractC0359a abstractC0359a) {
        IconCompat iconCompat = new IconCompat();
        int i = iconCompat.f1502a;
        if (abstractC0359a.e(1)) {
            i = ((C0360b) abstractC0359a).f3934e.readInt();
        }
        iconCompat.f1502a = i;
        byte[] bArr = iconCompat.f1504c;
        if (abstractC0359a.e(2)) {
            Parcel parcel = ((C0360b) abstractC0359a).f3934e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f1504c = bArr;
        iconCompat.d = abstractC0359a.f(iconCompat.d, 3);
        int i2 = iconCompat.f1505e;
        if (abstractC0359a.e(4)) {
            i2 = ((C0360b) abstractC0359a).f3934e.readInt();
        }
        iconCompat.f1505e = i2;
        int i3 = iconCompat.f1506f;
        if (abstractC0359a.e(5)) {
            i3 = ((C0360b) abstractC0359a).f3934e.readInt();
        }
        iconCompat.f1506f = i3;
        iconCompat.f1507g = (ColorStateList) abstractC0359a.f(iconCompat.f1507g, 6);
        String str = iconCompat.i;
        if (abstractC0359a.e(7)) {
            str = ((C0360b) abstractC0359a).f3934e.readString();
        }
        iconCompat.i = str;
        String str2 = iconCompat.f1508j;
        if (abstractC0359a.e(8)) {
            str2 = ((C0360b) abstractC0359a).f3934e.readString();
        }
        iconCompat.f1508j = str2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.f1502a) {
            case -1:
                Parcelable parcelable = iconCompat.d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f1503b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case Platform.WARN /* 5 */:
                Parcelable parcelable2 = iconCompat.d;
                if (parcelable2 != null) {
                    iconCompat.f1503b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f1504c;
                iconCompat.f1503b = bArr3;
                iconCompat.f1502a = 3;
                iconCompat.f1505e = 0;
                iconCompat.f1506f = bArr3.length;
                return iconCompat;
            case 2:
            case Platform.INFO /* 4 */:
            case 6:
                String str3 = new String(iconCompat.f1504c, Charset.forName("UTF-16"));
                iconCompat.f1503b = str3;
                if (iconCompat.f1502a == 2 && iconCompat.f1508j == null) {
                    iconCompat.f1508j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f1503b = iconCompat.f1504c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, AbstractC0359a abstractC0359a) {
        abstractC0359a.getClass();
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.f1502a) {
            case -1:
                iconCompat.d = (Parcelable) iconCompat.f1503b;
                break;
            case 1:
            case Platform.WARN /* 5 */:
                iconCompat.d = (Parcelable) iconCompat.f1503b;
                break;
            case 2:
                iconCompat.f1504c = ((String) iconCompat.f1503b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f1504c = (byte[]) iconCompat.f1503b;
                break;
            case Platform.INFO /* 4 */:
            case 6:
                iconCompat.f1504c = iconCompat.f1503b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f1502a;
        if (-1 != i) {
            abstractC0359a.h(1);
            ((C0360b) abstractC0359a).f3934e.writeInt(i);
        }
        byte[] bArr = iconCompat.f1504c;
        if (bArr != null) {
            abstractC0359a.h(2);
            int length = bArr.length;
            Parcel parcel = ((C0360b) abstractC0359a).f3934e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            abstractC0359a.h(3);
            ((C0360b) abstractC0359a).f3934e.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.f1505e;
        if (i2 != 0) {
            abstractC0359a.h(4);
            ((C0360b) abstractC0359a).f3934e.writeInt(i2);
        }
        int i3 = iconCompat.f1506f;
        if (i3 != 0) {
            abstractC0359a.h(5);
            ((C0360b) abstractC0359a).f3934e.writeInt(i3);
        }
        ColorStateList colorStateList = iconCompat.f1507g;
        if (colorStateList != null) {
            abstractC0359a.h(6);
            ((C0360b) abstractC0359a).f3934e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.i;
        if (str != null) {
            abstractC0359a.h(7);
            ((C0360b) abstractC0359a).f3934e.writeString(str);
        }
        String str2 = iconCompat.f1508j;
        if (str2 != null) {
            abstractC0359a.h(8);
            ((C0360b) abstractC0359a).f3934e.writeString(str2);
        }
    }
}
