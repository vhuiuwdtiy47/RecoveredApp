package x1;

/* loaded from: classes.dex */
public abstract class k extends j {
    public static String A(String str, String str2, String str3) {
        q1.d.e(str, "<this>");
        int y2 = y(str, str2, 0, false);
        if (y2 < 0) {
            return str;
        }
        int length = str2.length();
        int i = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i2 = 0;
        do {
            sb.append((CharSequence) str, i2, y2);
            sb.append(str3);
            i2 = y2 + length;
            if (y2 >= str.length()) {
                break;
            }
            y2 = y(str, str2, y2 + i, false);
        } while (y2 > 0);
        sb.append((CharSequence) str, i2, str.length());
        String sb2 = sb.toString();
        q1.d.d(sb2, "toString(...)");
        return sb2;
    }

    public static String B(String str, String str2) {
        q1.d.e(str2, "delimiter");
        int y2 = y(str, str2, 0, false);
        if (y2 == -1) {
            return str;
        }
        String substring = str.substring(str2.length() + y2, str.length());
        q1.d.d(substring, "substring(...)");
        return substring;
    }

    public static String C(String str) {
        q1.d.e(str, "<this>");
        q1.d.e(str, "missingDelimiterValue");
        int lastIndexOf = str.lastIndexOf(46, str.length() - 1);
        if (lastIndexOf == -1) {
            return str;
        }
        String substring = str.substring(lastIndexOf + 1, str.length());
        q1.d.d(substring, "substring(...)");
        return substring;
    }

    public static boolean x(String str, String str2) {
        return y(str, str2, 0, false) >= 0;
    }

    public static final int y(String str, String str2, int i, boolean z2) {
        int i2;
        char upperCase;
        char upperCase2;
        String str3;
        String str4;
        boolean z3;
        boolean regionMatches;
        q1.d.e(str, "<this>");
        q1.d.e(str2, "string");
        if (!z2) {
            return str.indexOf(str2, i);
        }
        int length = str.length();
        if (i < 0) {
            i = 0;
        }
        int length2 = str.length();
        if (length > length2) {
            length = length2;
        }
        int i3 = new u1.a(i, length, 1).f3940b;
        if (str == null || str2 == null) {
            if (i <= i3) {
                while (true) {
                    int length3 = str2.length();
                    q1.d.e(str, "other");
                    if (i >= 0 && str2.length() - length3 >= 0 && i <= str.length() - length3) {
                        for (0; i2 < length3; i2 + 1) {
                            char charAt = str2.charAt(i2);
                            char charAt2 = str.charAt(i + i2);
                            i2 = (charAt == charAt2 || (z2 && ((upperCase = Character.toUpperCase(charAt)) == (upperCase2 = Character.toUpperCase(charAt2)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)))) ? i2 + 1 : 0;
                        }
                        return i;
                    }
                    if (i == i3) {
                        break;
                    }
                    i++;
                }
            }
        } else if (i <= i3) {
            int i4 = i;
            while (true) {
                int length4 = str2.length();
                q1.d.e(str2, "<this>");
                q1.d.e(str, "other");
                if (z2) {
                    str3 = str;
                    str4 = str2;
                    z3 = z2;
                    regionMatches = str4.regionMatches(z3, 0, str3, i4, length4);
                } else {
                    regionMatches = str2.regionMatches(0, str, i4, length4);
                    str3 = str;
                    str4 = str2;
                    z3 = z2;
                }
                if (regionMatches) {
                    return i4;
                }
                if (i4 == i3) {
                    break;
                }
                i4++;
                str2 = str4;
                z2 = z3;
                str = str3;
            }
        }
        return -1;
    }

    public static boolean z(CharSequence charSequence) {
        q1.d.e(charSequence, "<this>");
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                return false;
            }
        }
        return true;
    }
}
