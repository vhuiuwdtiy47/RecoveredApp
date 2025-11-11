package androidx.core.graphics.drawable;

import E.c;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.tencent.wechat.Platform;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f1501k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public Object f1503b;

    /* renamed from: j, reason: collision with root package name */
    public String f1508j;

    /* renamed from: a, reason: collision with root package name */
    public int f1502a = -1;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f1504c = null;
    public Parcelable d = null;

    /* renamed from: e, reason: collision with root package name */
    public int f1505e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f1506f = 0;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f1507g = null;
    public PorterDuff.Mode h = f1501k;
    public String i = null;

    public final String toString() {
        String str;
        int i;
        if (this.f1502a == -1) {
            return String.valueOf(this.f1503b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f1502a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case Platform.INFO /* 4 */:
                str = "URI";
                break;
            case Platform.WARN /* 5 */:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f1502a) {
            case 1:
            case Platform.WARN /* 5 */:
                sb.append(" size=");
                sb.append(((Bitmap) this.f1503b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f1503b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f1508j);
                sb.append(" id=");
                int i2 = this.f1502a;
                if (i2 == -1) {
                    i = c.a(this.f1503b);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("called getResId() on " + this);
                    }
                    i = this.f1505e;
                }
                sb.append(String.format("0x%08x", Integer.valueOf(i)));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f1505e);
                if (this.f1506f != 0) {
                    sb.append(" off=");
                    sb.append(this.f1506f);
                    break;
                }
                break;
            case Platform.INFO /* 4 */:
            case 6:
                sb.append(" uri=");
                sb.append(this.f1503b);
                break;
        }
        if (this.f1507g != null) {
            sb.append(" tint=");
            sb.append(this.f1507g);
        }
        if (this.h != f1501k) {
            sb.append(" mode=");
            sb.append(this.h);
        }
        sb.append(")");
        return sb.toString();
    }
}
