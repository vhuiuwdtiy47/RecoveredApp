package com;

import com.tencent.wechat.HttpDate;
import com.tencent.wechat.PublicSuffixDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class Cookie {
    private final String domain;
    private final long expiresAt;
    private final boolean hostOnly;
    private final boolean httpOnly;
    private final String name;
    private final String path;
    private final boolean persistent;
    private final boolean secure;
    private final String value;
    private static final Pattern YEAR_PATTERN = Pattern.compile("(\\d{2,4})[^\\d]*");
    private static final Pattern MONTH_PATTERN = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    private static final Pattern DAY_OF_MONTH_PATTERN = Pattern.compile("(\\d{1,2})[^\\d]*");
    private static final Pattern TIME_PATTERN = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* loaded from: classes.dex */
    public static final class Builder {
        String domain;
        boolean hostOnly;
        boolean httpOnly;
        String name;
        boolean persistent;
        boolean secure;
        String value;
        long expiresAt = HttpDate.MAX_DATE;
        String path = "/";

        private Builder domain(String str, boolean z2) {
            if (str == null) {
                throw new NullPointerException("domain == null");
            }
            String domainToAscii = com.tencent.Util.domainToAscii(str);
            if (domainToAscii == null) {
                throw new IllegalArgumentException("unexpected domain: " + str);
            }
            this.domain = domainToAscii;
            this.hostOnly = z2;
            return this;
        }

        public Cookie build() {
            return new Cookie(this);
        }

        public Builder domain(String str) {
            return domain(str, false);
        }

        public Builder expiresAt(long j2) {
            long j3 = HttpDate.MAX_DATE;
            long j4 = j2 <= 0 ? Long.MIN_VALUE : j2;
            if (j4 <= HttpDate.MAX_DATE) {
                j3 = j4;
            }
            this.expiresAt = j3;
            this.persistent = true;
            return this;
        }

        public Builder hostOnlyDomain(String str) {
            return domain(str, true);
        }

        public Builder httpOnly() {
            this.httpOnly = true;
            return this;
        }

        public Builder name(String str) {
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            if (!str.trim().equals(str)) {
                throw new IllegalArgumentException("name is not trimmed");
            }
            this.name = str;
            return this;
        }

        public Builder path(String str) {
            if (!str.startsWith("/")) {
                throw new IllegalArgumentException("path must start with '/'");
            }
            this.path = str;
            return this;
        }

        public Builder secure() {
            this.secure = true;
            return this;
        }

        public Builder value(String str) {
            if (str == null) {
                throw new NullPointerException("value == null");
            }
            if (!str.trim().equals(str)) {
                throw new IllegalArgumentException("value is not trimmed");
            }
            this.value = str;
            return this;
        }
    }

    Cookie(Builder builder) {
        if (builder.name == null) {
            throw new NullPointerException("builder.name == null");
        }
        if (builder.value == null) {
            throw new NullPointerException("builder.value == null");
        }
        if (builder.domain == null) {
            throw new NullPointerException("builder.domain == null");
        }
        this.name = builder.name;
        this.value = builder.value;
        this.expiresAt = builder.expiresAt;
        this.domain = builder.domain;
        this.path = builder.path;
        this.secure = builder.secure;
        this.httpOnly = builder.httpOnly;
        this.persistent = builder.persistent;
        this.hostOnly = builder.hostOnly;
    }

    private Cookie(String str, String str2, long j2, String str3, String str4, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.name = str;
        this.value = str2;
        this.expiresAt = j2;
        this.domain = str3;
        this.path = str4;
        this.secure = z2;
        this.httpOnly = z3;
        this.hostOnly = z4;
        this.persistent = z5;
    }

    private static int dateCharacterOffset(String str, int i, int i2, boolean z2) {
        for (int i3 = i; i3 < i2; i3++) {
            char charAt = str.charAt(i3);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || (charAt >= '0' && charAt <= '9') || ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || charAt == ':'))) == (!z2)) {
                return i3;
            }
        }
        return i2;
    }

    private static boolean domainMatch(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        return str.endsWith(str2) && str.charAt((str.length() - str2.length()) + (-1)) == '.' && !com.tencent.Util.verifyAsIpAddress(str);
    }

    static Cookie parse(long j2, HttpUrl httpUrl, String str) {
        long j3;
        String substring;
        String str2;
        long j4;
        long j5;
        int length = str.length();
        int delimiterOffset = com.tencent.Util.delimiterOffset(str, 0, length, ';');
        int delimiterOffset2 = com.tencent.Util.delimiterOffset(str, 0, delimiterOffset, '=');
        if (delimiterOffset2 == delimiterOffset) {
            return null;
        }
        String trimSubstring = com.tencent.Util.trimSubstring(str, 0, delimiterOffset2);
        if (trimSubstring.isEmpty() || com.tencent.Util.indexOfControlOrNonAscii(trimSubstring) != -1) {
            return null;
        }
        String trimSubstring2 = com.tencent.Util.trimSubstring(str, delimiterOffset2 + 1, delimiterOffset);
        if (com.tencent.Util.indexOfControlOrNonAscii(trimSubstring2) != -1) {
            return null;
        }
        long j6 = HttpDate.MAX_DATE;
        long j7 = -1;
        String str3 = null;
        String str4 = null;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = true;
        boolean z5 = false;
        int i = delimiterOffset + 1;
        while (i < length) {
            int delimiterOffset3 = com.tencent.Util.delimiterOffset(str, i, length, ';');
            int delimiterOffset4 = com.tencent.Util.delimiterOffset(str, i, delimiterOffset3, '=');
            String trimSubstring3 = com.tencent.Util.trimSubstring(str, i, delimiterOffset4);
            String trimSubstring4 = delimiterOffset4 < delimiterOffset3 ? com.tencent.Util.trimSubstring(str, delimiterOffset4 + 1, delimiterOffset3) : "";
            if (trimSubstring3.equalsIgnoreCase("expires")) {
                try {
                    z5 = true;
                    long j8 = j7;
                    j5 = parseExpires(trimSubstring4, 0, trimSubstring4.length());
                    str2 = str3;
                    j4 = j8;
                } catch (IllegalArgumentException e2) {
                    str2 = str3;
                    j4 = j7;
                    j5 = j6;
                }
            } else if (trimSubstring3.equalsIgnoreCase("max-age")) {
                try {
                    long parseMaxAge = parseMaxAge(trimSubstring4);
                    z5 = true;
                    j5 = j6;
                    str2 = str3;
                    j4 = parseMaxAge;
                } catch (NumberFormatException e3) {
                    str2 = str3;
                    j4 = j7;
                    j5 = j6;
                }
            } else if (trimSubstring3.equalsIgnoreCase("domain")) {
                try {
                    str2 = parseDomain(trimSubstring4);
                    z4 = false;
                    j4 = j7;
                    j5 = j6;
                } catch (IllegalArgumentException e4) {
                    str2 = str3;
                    j4 = j7;
                    j5 = j6;
                }
            } else if (trimSubstring3.equalsIgnoreCase("path")) {
                str4 = trimSubstring4;
                str2 = str3;
                j4 = j7;
                j5 = j6;
            } else if (trimSubstring3.equalsIgnoreCase("secure")) {
                z2 = true;
                str2 = str3;
                j4 = j7;
                j5 = j6;
            } else if (trimSubstring3.equalsIgnoreCase("httponly")) {
                z3 = true;
                str2 = str3;
                j4 = j7;
                j5 = j6;
            } else {
                str2 = str3;
                j4 = j7;
                j5 = j6;
            }
            j6 = j5;
            j7 = j4;
            str3 = str2;
            i = delimiterOffset3 + 1;
        }
        if (j7 == Long.MIN_VALUE) {
            j3 = Long.MIN_VALUE;
        } else if (j7 != -1) {
            j3 = (j7 <= 9223372036854775L ? 1000 * j7 : Long.MAX_VALUE) + j2;
            if (j3 < j2 || j3 > HttpDate.MAX_DATE) {
                j3 = HttpDate.MAX_DATE;
            }
        } else {
            j3 = j6;
        }
        String host = httpUrl.host();
        if (str3 == null) {
            str3 = host;
        } else if (!domainMatch(host, str3)) {
            return null;
        }
        if (host.length() != str3.length() && PublicSuffixDatabase.get().getEffectiveTldPlusOne(str3) == null) {
            return null;
        }
        if (str4 == null || !str4.startsWith("/")) {
            String encodedPath = httpUrl.encodedPath();
            int lastIndexOf = encodedPath.lastIndexOf(47);
            substring = lastIndexOf != 0 ? encodedPath.substring(0, lastIndexOf) : "/";
        } else {
            substring = str4;
        }
        return new Cookie(trimSubstring, trimSubstring2, j3, str3, substring, z2, z3, z4, z5);
    }

    public static Cookie parse(HttpUrl httpUrl, String str) {
        return parse(System.currentTimeMillis(), httpUrl, str);
    }

    public static List<Cookie> parseAll(HttpUrl httpUrl, Headers headers) {
        List<String> values = headers.values("Set-Cookie");
        ArrayList arrayList = null;
        int size = values.size();
        for (int i = 0; i < size; i++) {
            Cookie parse = parse(httpUrl, values.get(i));
            if (parse != null) {
                ArrayList arrayList2 = arrayList == null ? new ArrayList() : arrayList;
                arrayList2.add(parse);
                arrayList = arrayList2;
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.emptyList();
    }

    private static String parseDomain(String str) {
        if (str.endsWith(".")) {
            throw new IllegalArgumentException();
        }
        if (str.startsWith(".")) {
            str = str.substring(1);
        }
        String domainToAscii = com.tencent.Util.domainToAscii(str);
        if (domainToAscii == null) {
            throw new IllegalArgumentException();
        }
        return domainToAscii;
    }

    private static long parseExpires(String str, int i, int i2) {
        int dateCharacterOffset = dateCharacterOffset(str, i, i2, false);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        Matcher matcher = TIME_PATTERN.matcher(str);
        while (dateCharacterOffset < i2) {
            int dateCharacterOffset2 = dateCharacterOffset(str, dateCharacterOffset + 1, i2, true);
            matcher.region(dateCharacterOffset, dateCharacterOffset2);
            if (i3 == -1 && matcher.usePattern(TIME_PATTERN).matches()) {
                i3 = Integer.parseInt(matcher.group(1));
                i4 = Integer.parseInt(matcher.group(2));
                i5 = Integer.parseInt(matcher.group(3));
            } else if (i6 == -1 && matcher.usePattern(DAY_OF_MONTH_PATTERN).matches()) {
                i6 = Integer.parseInt(matcher.group(1));
            } else if (i7 == -1 && matcher.usePattern(MONTH_PATTERN).matches()) {
                i7 = MONTH_PATTERN.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
            } else if (i8 == -1 && matcher.usePattern(YEAR_PATTERN).matches()) {
                i8 = Integer.parseInt(matcher.group(1));
            }
            dateCharacterOffset = dateCharacterOffset(str, dateCharacterOffset2 + 1, i2, false);
        }
        if (i8 >= 70 && i8 <= 99) {
            i8 += 1900;
        }
        if (i8 >= 0 && i8 <= 69) {
            i8 += 2000;
        }
        if (i8 < 1601) {
            throw new IllegalArgumentException();
        }
        if (i7 == -1) {
            throw new IllegalArgumentException();
        }
        if (i6 < 1 || i6 > 31) {
            throw new IllegalArgumentException();
        }
        if (i3 < 0 || i3 > 23) {
            throw new IllegalArgumentException();
        }
        if (i4 < 0 || i4 > 59) {
            throw new IllegalArgumentException();
        }
        if (i5 < 0 || i5 > 59) {
            throw new IllegalArgumentException();
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(com.tencent.Util.UTC);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i8);
        gregorianCalendar.set(2, i7 - 1);
        gregorianCalendar.set(5, i6);
        gregorianCalendar.set(11, i3);
        gregorianCalendar.set(12, i4);
        gregorianCalendar.set(13, i5);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    private static long parseMaxAge(String str) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong <= 0) {
                return Long.MIN_VALUE;
            }
            return parseLong;
        } catch (NumberFormatException e2) {
            if (str.matches("-?\\d+")) {
                return !str.startsWith("-") ? Long.MAX_VALUE : Long.MIN_VALUE;
            }
            throw e2;
        }
    }

    private static boolean pathMatch(HttpUrl httpUrl, String str) {
        String encodedPath = httpUrl.encodedPath();
        if (encodedPath.equals(str)) {
            return true;
        }
        return encodedPath.startsWith(str) && (str.endsWith("/") || encodedPath.charAt(str.length()) == '/');
    }

    public String domain() {
        return this.domain;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Cookie)) {
            return false;
        }
        Cookie cookie = (Cookie) obj;
        return cookie.name.equals(this.name) && cookie.value.equals(this.value) && cookie.domain.equals(this.domain) && cookie.path.equals(this.path) && cookie.expiresAt == this.expiresAt && cookie.secure == this.secure && cookie.httpOnly == this.httpOnly && cookie.persistent == this.persistent && cookie.hostOnly == this.hostOnly;
    }

    public long expiresAt() {
        return this.expiresAt;
    }

    public int hashCode() {
        return (((this.persistent ? 0 : 1) + (((this.httpOnly ? 0 : 1) + (((this.secure ? 0 : 1) + ((((((((((this.name.hashCode() + 527) * 31) + this.value.hashCode()) * 31) + this.domain.hashCode()) * 31) + this.path.hashCode()) * 31) + ((int) (this.expiresAt ^ (this.expiresAt >>> 32)))) * 31)) * 31)) * 31)) * 31) + (this.hostOnly ? 0 : 1);
    }

    public boolean hostOnly() {
        return this.hostOnly;
    }

    public boolean httpOnly() {
        return this.httpOnly;
    }

    public boolean matches(HttpUrl httpUrl) {
        if ((this.hostOnly ? httpUrl.host().equals(this.domain) : domainMatch(httpUrl.host(), this.domain)) && pathMatch(httpUrl, this.path)) {
            return !this.secure || httpUrl.isHttps();
        }
        return false;
    }

    public String name() {
        return this.name;
    }

    public String path() {
        return this.path;
    }

    public boolean persistent() {
        return this.persistent;
    }

    public boolean secure() {
        return this.secure;
    }

    public String toString() {
        return toString(false);
    }

    String toString(boolean z2) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name);
        sb.append('=');
        sb.append(this.value);
        if (this.persistent) {
            if (this.expiresAt == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=").append(HttpDate.format(new Date(this.expiresAt)));
            }
        }
        if (!this.hostOnly) {
            sb.append("; domain=");
            if (z2) {
                sb.append(".");
            }
            sb.append(this.domain);
        }
        sb.append("; path=").append(this.path);
        if (this.secure) {
            sb.append("; secure");
        }
        if (this.httpOnly) {
            sb.append("; httponly");
        }
        return sb.toString();
    }

    public String value() {
        return this.value;
    }
}
