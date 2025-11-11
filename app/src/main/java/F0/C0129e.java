package f0;

import android.net.Uri;
import android.os.Bundle;
import com.tencent.wechat.Platform;
import l.AbstractC0271z;

/* renamed from: f0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0129e extends H {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2298r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0129e(int i, boolean z2) {
        super(z2);
        this.f2298r = i;
    }

    @Override // f0.H
    public final Object a(Bundle bundle, String str) {
        switch (this.f2298r) {
            case 0:
                q1.d.e(bundle, "bundle");
                if (!bundle.containsKey(str) || AbstractC0271z.o(bundle, str)) {
                    return null;
                }
                boolean z2 = bundle.getBoolean(str, false);
                if (z2 || !bundle.getBoolean(str, true)) {
                    return Boolean.valueOf(z2);
                }
                AbstractC0271z.p(str);
                throw null;
            case 1:
                q1.d.e(bundle, "bundle");
                float f2 = bundle.getFloat(str, Float.MIN_VALUE);
                if (f2 != Float.MIN_VALUE || bundle.getFloat(str, Float.MAX_VALUE) != Float.MAX_VALUE) {
                    return Float.valueOf(f2);
                }
                AbstractC0271z.p(str);
                throw null;
            case 2:
                q1.d.e(bundle, "bundle");
                return Integer.valueOf(AbstractC0271z.j(bundle, str));
            case 3:
                q1.d.e(bundle, "bundle");
                long j2 = bundle.getLong(str, Long.MIN_VALUE);
                if (j2 != Long.MIN_VALUE || bundle.getLong(str, Long.MAX_VALUE) != Long.MAX_VALUE) {
                    return Long.valueOf(j2);
                }
                AbstractC0271z.p(str);
                throw null;
            case Platform.INFO /* 4 */:
                q1.d.e(bundle, "bundle");
                return Integer.valueOf(AbstractC0271z.j(bundle, str));
            default:
                q1.d.e(bundle, "bundle");
                if (!bundle.containsKey(str) || AbstractC0271z.o(bundle, str)) {
                    return null;
                }
                String string = bundle.getString(str);
                if (string != null) {
                    return string;
                }
                AbstractC0271z.p(str);
                throw null;
        }
    }

    @Override // f0.H
    public final String b() {
        switch (this.f2298r) {
            case 0:
                return "boolean";
            case 1:
                return "float";
            case 2:
                return "integer";
            case 3:
                return "long";
            case Platform.INFO /* 4 */:
                return "reference";
            default:
                return "string";
        }
    }

    @Override // f0.H
    public final Object d(String str) {
        boolean z2;
        int parseInt;
        String str2;
        long parseLong;
        int parseInt2;
        switch (this.f2298r) {
            case 0:
                q1.d.e(str, "value");
                if (str.equals("true")) {
                    z2 = true;
                } else {
                    if (!str.equals("false")) {
                        throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
                    }
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            case 1:
                q1.d.e(str, "value");
                return Float.valueOf(Float.parseFloat(str));
            case 2:
                q1.d.e(str, "value");
                if (str.startsWith("0x")) {
                    String substring = str.substring(2);
                    q1.d.d(substring, "substring(...)");
                    parseInt = Integer.parseInt(substring, 16);
                } else {
                    parseInt = Integer.parseInt(str);
                }
                return Integer.valueOf(parseInt);
            case 3:
                q1.d.e(str, "value");
                if (str.endsWith("L")) {
                    str2 = str.substring(0, str.length() - 1);
                    q1.d.d(str2, "substring(...)");
                } else {
                    str2 = str;
                }
                if (str.startsWith("0x")) {
                    String substring2 = str2.substring(2);
                    q1.d.d(substring2, "substring(...)");
                    parseLong = Long.parseLong(substring2, 16);
                } else {
                    parseLong = Long.parseLong(str2);
                }
                return Long.valueOf(parseLong);
            case Platform.INFO /* 4 */:
                q1.d.e(str, "value");
                if (str.startsWith("0x")) {
                    String substring3 = str.substring(2);
                    q1.d.d(substring3, "substring(...)");
                    parseInt2 = Integer.parseInt(substring3, 16);
                } else {
                    parseInt2 = Integer.parseInt(str);
                }
                return Integer.valueOf(parseInt2);
            default:
                q1.d.e(str, "value");
                if (str.equals("null")) {
                    return null;
                }
                return str;
        }
    }

    @Override // f0.H
    public final void e(Bundle bundle, String str, Object obj) {
        switch (this.f2298r) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                q1.d.e(str, "key");
                bundle.putBoolean(str, booleanValue);
                return;
            case 1:
                float floatValue = ((Number) obj).floatValue();
                q1.d.e(str, "key");
                bundle.putFloat(str, floatValue);
                return;
            case 2:
                int intValue = ((Number) obj).intValue();
                q1.d.e(str, "key");
                bundle.putInt(str, intValue);
                return;
            case 3:
                long longValue = ((Number) obj).longValue();
                q1.d.e(str, "key");
                bundle.putLong(str, longValue);
                return;
            case Platform.INFO /* 4 */:
                int intValue2 = ((Number) obj).intValue();
                q1.d.e(str, "key");
                bundle.putInt(str, intValue2);
                return;
            default:
                String str2 = (String) obj;
                q1.d.e(str, "key");
                if (str2 != null) {
                    bundle.putString(str, str2);
                    return;
                } else {
                    AbstractC0271z.s(bundle, str);
                    return;
                }
        }
    }

    @Override // f0.H
    public String f(Object obj) {
        switch (this.f2298r) {
            case Platform.WARN /* 5 */:
                String str = (String) obj;
                if (str == null) {
                    return "null";
                }
                q1.d.e(str, "s");
                String encode = Uri.encode(str, null);
                q1.d.d(encode, "encode(...)");
                return encode;
            default:
                return super.f(obj);
        }
    }
}
