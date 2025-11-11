package com;

import com.tencent.wechat.HttpHeaders;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class CacheControl {
    String headerValue;
    private final boolean isPrivate;
    private final boolean isPublic;
    private final int maxAgeSeconds;
    private final int maxStaleSeconds;
    private final int minFreshSeconds;
    private final boolean mustRevalidate;
    private final boolean noCache;
    private final boolean noStore;
    private final boolean noTransform;
    private final boolean onlyIfCached;
    private final int sMaxAgeSeconds;
    public static final CacheControl FORCE_NETWORK = new Builder().noCache().build();
    public static final CacheControl FORCE_CACHE = new Builder().onlyIfCached().maxStale(Integer.MAX_VALUE, TimeUnit.SECONDS).build();

    /* loaded from: classes.dex */
    public static final class Builder {
        int maxAgeSeconds = -1;
        int maxStaleSeconds = -1;
        int minFreshSeconds = -1;
        boolean noCache;
        boolean noStore;
        boolean noTransform;
        boolean onlyIfCached;

        public CacheControl build() {
            return new CacheControl(this);
        }

        public Builder maxAge(int i, TimeUnit timeUnit) {
            if (i < 0) {
                throw new IllegalArgumentException("maxAge < 0: " + i);
            }
            long seconds = timeUnit.toSeconds(i);
            this.maxAgeSeconds = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
            return this;
        }

        public Builder maxStale(int i, TimeUnit timeUnit) {
            if (i < 0) {
                throw new IllegalArgumentException("maxStale < 0: " + i);
            }
            long seconds = timeUnit.toSeconds(i);
            this.maxStaleSeconds = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
            return this;
        }

        public Builder minFresh(int i, TimeUnit timeUnit) {
            if (i < 0) {
                throw new IllegalArgumentException("minFresh < 0: " + i);
            }
            long seconds = timeUnit.toSeconds(i);
            this.minFreshSeconds = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
            return this;
        }

        public Builder noCache() {
            this.noCache = true;
            return this;
        }

        public Builder noStore() {
            this.noStore = true;
            return this;
        }

        public Builder noTransform() {
            this.noTransform = true;
            return this;
        }

        public Builder onlyIfCached() {
            this.onlyIfCached = true;
            return this;
        }
    }

    CacheControl(Builder builder) {
        this.noCache = builder.noCache;
        this.noStore = builder.noStore;
        this.maxAgeSeconds = builder.maxAgeSeconds;
        this.sMaxAgeSeconds = -1;
        this.isPrivate = false;
        this.isPublic = false;
        this.mustRevalidate = false;
        this.maxStaleSeconds = builder.maxStaleSeconds;
        this.minFreshSeconds = builder.minFreshSeconds;
        this.onlyIfCached = builder.onlyIfCached;
        this.noTransform = builder.noTransform;
    }

    private CacheControl(boolean z2, boolean z3, int i, int i2, boolean z4, boolean z5, boolean z6, int i3, int i4, boolean z7, boolean z8, String str) {
        this.noCache = z2;
        this.noStore = z3;
        this.maxAgeSeconds = i;
        this.sMaxAgeSeconds = i2;
        this.isPrivate = z4;
        this.isPublic = z5;
        this.mustRevalidate = z6;
        this.maxStaleSeconds = i3;
        this.minFreshSeconds = i4;
        this.onlyIfCached = z7;
        this.noTransform = z8;
        this.headerValue = str;
    }

    private String headerValue() {
        StringBuilder sb = new StringBuilder();
        if (this.noCache) {
            sb.append("no-cache, ");
        }
        if (this.noStore) {
            sb.append("no-store, ");
        }
        if (this.maxAgeSeconds != -1) {
            sb.append("max-age=").append(this.maxAgeSeconds).append(", ");
        }
        if (this.sMaxAgeSeconds != -1) {
            sb.append("s-maxage=").append(this.sMaxAgeSeconds).append(", ");
        }
        if (this.isPrivate) {
            sb.append("private, ");
        }
        if (this.isPublic) {
            sb.append("public, ");
        }
        if (this.mustRevalidate) {
            sb.append("must-revalidate, ");
        }
        if (this.maxStaleSeconds != -1) {
            sb.append("max-stale=").append(this.maxStaleSeconds).append(", ");
        }
        if (this.minFreshSeconds != -1) {
            sb.append("min-fresh=").append(this.minFreshSeconds).append(", ");
        }
        if (this.onlyIfCached) {
            sb.append("only-if-cached, ");
        }
        if (this.noTransform) {
            sb.append("no-transform, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }

    public static CacheControl parse(Headers headers) {
        boolean z2;
        String str;
        boolean z3 = false;
        boolean z4 = false;
        int i = -1;
        int i2 = -1;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        int i3 = -1;
        int i4 = -1;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = true;
        int size = headers.size();
        int i5 = 0;
        String str2 = null;
        while (true) {
            z2 = z3;
            if (i5 >= size) {
                break;
            }
            String name = headers.name(i5);
            String value = headers.value(i5);
            if (name.equalsIgnoreCase("Cache-Control")) {
                if (str2 != null) {
                    z10 = false;
                } else {
                    str2 = value;
                }
            } else if (name.equalsIgnoreCase("Pragma")) {
                z10 = false;
            } else {
                z3 = z2;
                i5++;
            }
            z3 = z2;
            int i6 = 0;
            while (i6 < value.length()) {
                int skipUntil = HttpHeaders.skipUntil(value, i6, "=,;");
                String trim = value.substring(i6, skipUntil).trim();
                if (skipUntil == value.length() || value.charAt(skipUntil) == ',' || value.charAt(skipUntil) == ';') {
                    i6 = skipUntil + 1;
                    str = null;
                } else {
                    int skipWhitespace = HttpHeaders.skipWhitespace(value, skipUntil + 1);
                    if (skipWhitespace >= value.length() || value.charAt(skipWhitespace) != '\"') {
                        int skipUntil2 = HttpHeaders.skipUntil(value, skipWhitespace, ",;");
                        String trim2 = value.substring(skipWhitespace, skipUntil2).trim();
                        i6 = skipUntil2;
                        str = trim2;
                    } else {
                        int i7 = skipWhitespace + 1;
                        int skipUntil3 = HttpHeaders.skipUntil(value, i7, "\"");
                        String substring = value.substring(i7, skipUntil3);
                        i6 = skipUntil3 + 1;
                        str = substring;
                    }
                }
                if ("no-cache".equalsIgnoreCase(trim)) {
                    z3 = true;
                } else if ("no-store".equalsIgnoreCase(trim)) {
                    z4 = true;
                } else if ("max-age".equalsIgnoreCase(trim)) {
                    i = HttpHeaders.parseSeconds(str, -1);
                } else if ("s-maxage".equalsIgnoreCase(trim)) {
                    i2 = HttpHeaders.parseSeconds(str, -1);
                } else if ("private".equalsIgnoreCase(trim)) {
                    z5 = true;
                } else if ("public".equalsIgnoreCase(trim)) {
                    z6 = true;
                } else if ("must-revalidate".equalsIgnoreCase(trim)) {
                    z7 = true;
                } else if ("max-stale".equalsIgnoreCase(trim)) {
                    i3 = HttpHeaders.parseSeconds(str, Integer.MAX_VALUE);
                } else if ("min-fresh".equalsIgnoreCase(trim)) {
                    i4 = HttpHeaders.parseSeconds(str, -1);
                } else if ("only-if-cached".equalsIgnoreCase(trim)) {
                    z8 = true;
                } else if ("no-transform".equalsIgnoreCase(trim)) {
                    z9 = true;
                }
            }
            i5++;
        }
        return new CacheControl(z2, z4, i, i2, z5, z6, z7, i3, i4, z8, z9, !z10 ? null : str2);
    }

    public boolean isPrivate() {
        return this.isPrivate;
    }

    public boolean isPublic() {
        return this.isPublic;
    }

    public int maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    public int maxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    public int minFreshSeconds() {
        return this.minFreshSeconds;
    }

    public boolean mustRevalidate() {
        return this.mustRevalidate;
    }

    public boolean noCache() {
        return this.noCache;
    }

    public boolean noStore() {
        return this.noStore;
    }

    public boolean noTransform() {
        return this.noTransform;
    }

    public boolean onlyIfCached() {
        return this.onlyIfCached;
    }

    public int sMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    public String toString() {
        String str = this.headerValue;
        if (str != null) {
            return str;
        }
        String headerValue = headerValue();
        this.headerValue = headerValue;
        return headerValue;
    }
}
