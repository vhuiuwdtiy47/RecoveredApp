package x1;

import L.C0016l;
import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class c implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Pattern f4201a;

    public c(String str) {
        q1.d.e(str, "pattern");
        Pattern compile = Pattern.compile(str);
        q1.d.d(compile, "compile(...)");
        this.f4201a = compile;
    }

    public static C0016l a(c cVar, String str) {
        cVar.getClass();
        q1.d.e(str, "input");
        Matcher matcher = cVar.f4201a.matcher(str);
        q1.d.d(matcher, "matcher(...)");
        if (matcher.find(0)) {
            return new C0016l(matcher, str);
        }
        return null;
    }

    public final C0016l b(String str) {
        q1.d.e(str, "input");
        Matcher matcher = this.f4201a.matcher(str);
        q1.d.d(matcher, "matcher(...)");
        if (matcher.matches()) {
            return new C0016l(matcher, str);
        }
        return null;
    }

    public final boolean c(CharSequence charSequence) {
        q1.d.e(charSequence, "input");
        return this.f4201a.matcher(charSequence).matches();
    }

    public final String toString() {
        String pattern = this.f4201a.toString();
        q1.d.d(pattern, "toString(...)");
        return pattern;
    }

    public c(String str, int i) {
        q1.d.e(str, "pattern");
        Pattern compile = Pattern.compile(str, 66);
        q1.d.d(compile, "compile(...)");
        this.f4201a = compile;
    }
}
