package com;

/* loaded from: classes.dex */
public final class Challenge {
    private final String realm;
    private final String scheme;

    public Challenge(String str, String str2) {
        this.scheme = str;
        this.realm = str2;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Challenge) && com.tencent.Util.equal(this.scheme, ((Challenge) obj).scheme) && com.tencent.Util.equal(this.realm, ((Challenge) obj).realm);
    }

    public int hashCode() {
        return (((this.realm != null ? this.realm.hashCode() : 0) + 899) * 31) + (this.scheme != null ? this.scheme.hashCode() : 0);
    }

    public String realm() {
        return this.realm;
    }

    public String scheme() {
        return this.scheme;
    }

    public String toString() {
        return this.scheme + " realm=\"" + this.realm + "\"";
    }
}
