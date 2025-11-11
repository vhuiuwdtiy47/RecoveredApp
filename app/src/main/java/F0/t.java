package f0;

import L.C0016l;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.wechat.Platform;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: q, reason: collision with root package name */
    public static final x1.c f2333q = new x1.c("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: r, reason: collision with root package name */
    public static final x1.c f2334r = new x1.c("\\{(.+?)\\}");

    /* renamed from: s, reason: collision with root package name */
    public static final x1.c f2335s = new x1.c("http[s]?://");

    /* renamed from: t, reason: collision with root package name */
    public static final x1.c f2336t = new x1.c(".*");

    /* renamed from: u, reason: collision with root package name */
    public static final x1.c f2337u = new x1.c("([^/]*?|)");

    /* renamed from: v, reason: collision with root package name */
    public static final x1.c f2338v = new x1.c("^[^?#]+\\?([^#]*).*");

    /* renamed from: a, reason: collision with root package name */
    public final String f2339a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2340b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2341c;
    public final ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2342e;

    /* renamed from: f, reason: collision with root package name */
    public final i1.f f2343f;

    /* renamed from: g, reason: collision with root package name */
    public final i1.f f2344g;
    public final Object h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f2345j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f2346k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f2347l;

    /* renamed from: m, reason: collision with root package name */
    public final i1.f f2348m;

    /* renamed from: n, reason: collision with root package name */
    public final String f2349n;

    /* renamed from: o, reason: collision with root package name */
    public final i1.f f2350o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f2351p;

    public t(String str, String str2, String str3) {
        List list;
        boolean z2;
        this.f2339a = str;
        this.f2340b = str2;
        this.f2341c = str3;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        final int i = 0;
        this.f2343f = new i1.f(new p1.a(this) { // from class: f0.q

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f2328b;

            {
                this.f2328b = this;
            }

            /* JADX WARN: Type inference failed for: r15v20, types: [java.lang.Object, i1.b] */
            /* JADX WARN: Type inference failed for: r15v27, types: [java.lang.Object, i1.b] */
            /* JADX WARN: Type inference failed for: r15v34, types: [java.lang.Object, i1.b] */
            @Override // p1.a
            public final Object a() {
                List list2;
                switch (i) {
                    case 0:
                        String str4 = this.f2328b.f2342e;
                        if (str4 != null) {
                            return new x1.c(str4, 0);
                        }
                        return null;
                    case 1:
                        String str5 = this.f2328b.f2339a;
                        return Boolean.valueOf(str5 != null && t.f2338v.c(str5));
                    case 2:
                        t tVar = this.f2328b;
                        tVar.getClass();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (tVar.e()) {
                            String str6 = tVar.f2339a;
                            q1.d.b(str6);
                            Uri parse = Uri.parse(str6);
                            q1.d.d(parse, "parse(...)");
                            for (String str7 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str7);
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(("Query parameter " + str7 + " must only be present once in " + str6 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str8 = (String) j1.j.p0(queryParameters);
                                if (str8 == null) {
                                    tVar.i = true;
                                    str8 = str7;
                                }
                                s sVar = new s();
                                int i2 = 0;
                                for (C0016l a2 = x1.c.a(t.f2334r, str8); a2 != null; a2 = a2.r()) {
                                    x1.a b2 = ((x1.b) a2.d).b(1);
                                    q1.d.b(b2);
                                    sVar.f2332b.add(b2.f4198a);
                                    if (a2.l().f3939a > i2) {
                                        String substring = str8.substring(i2, a2.l().f3939a);
                                        q1.d.d(substring, "substring(...)");
                                        String quote = Pattern.quote(substring);
                                        q1.d.d(quote, "quote(...)");
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i2 = a2.l().f3940b + 1;
                                }
                                if (i2 < str8.length()) {
                                    String substring2 = str8.substring(i2);
                                    q1.d.d(substring2, "substring(...)");
                                    String quote2 = Pattern.quote(substring2);
                                    q1.d.d(quote2, "quote(...)");
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                String sb2 = sb.toString();
                                q1.d.d(sb2, "toString(...)");
                                sVar.f2331a = t.g(sb2);
                                linkedHashMap.put(str7, sVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str9 = this.f2328b.f2339a;
                        if (str9 != null) {
                            Uri parse2 = Uri.parse(str9);
                            q1.d.d(parse2, "parse(...)");
                            if (parse2.getFragment() != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Uri parse3 = Uri.parse(str9);
                                q1.d.d(parse3, "parse(...)");
                                String fragment = parse3.getFragment();
                                StringBuilder sb3 = new StringBuilder();
                                q1.d.b(fragment);
                                t.a(fragment, arrayList2, sb3);
                                return new i1.d(arrayList2, sb3.toString());
                            }
                        }
                        return null;
                    case Platform.INFO /* 4 */:
                        i1.d dVar = (i1.d) this.f2328b.f2345j.getValue();
                        return (dVar == null || (list2 = (List) dVar.f2670a) == null) ? new ArrayList() : list2;
                    case Platform.WARN /* 5 */:
                        i1.d dVar2 = (i1.d) this.f2328b.f2345j.getValue();
                        if (dVar2 != null) {
                            return (String) dVar2.f2671b;
                        }
                        return null;
                    case 6:
                        String str10 = (String) this.f2328b.f2347l.getValue();
                        if (str10 != null) {
                            return new x1.c(str10, 0);
                        }
                        return null;
                    default:
                        String str11 = this.f2328b.f2349n;
                        if (str11 != null) {
                            return new x1.c(str11);
                        }
                        return null;
                }
            }
        });
        final int i2 = 1;
        this.f2344g = new i1.f(new p1.a(this) { // from class: f0.q

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f2328b;

            {
                this.f2328b = this;
            }

            /* JADX WARN: Type inference failed for: r15v20, types: [java.lang.Object, i1.b] */
            /* JADX WARN: Type inference failed for: r15v27, types: [java.lang.Object, i1.b] */
            /* JADX WARN: Type inference failed for: r15v34, types: [java.lang.Object, i1.b] */
            @Override // p1.a
            public final Object a() {
                List list2;
                switch (i2) {
                    case 0:
                        String str4 = this.f2328b.f2342e;
                        if (str4 != null) {
                            return new x1.c(str4, 0);
                        }
                        return null;
                    case 1:
                        String str5 = this.f2328b.f2339a;
                        return Boolean.valueOf(str5 != null && t.f2338v.c(str5));
                    case 2:
                        t tVar = this.f2328b;
                        tVar.getClass();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (tVar.e()) {
                            String str6 = tVar.f2339a;
                            q1.d.b(str6);
                            Uri parse = Uri.parse(str6);
                            q1.d.d(parse, "parse(...)");
                            for (String str7 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str7);
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(("Query parameter " + str7 + " must only be present once in " + str6 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str8 = (String) j1.j.p0(queryParameters);
                                if (str8 == null) {
                                    tVar.i = true;
                                    str8 = str7;
                                }
                                s sVar = new s();
                                int i22 = 0;
                                for (C0016l a2 = x1.c.a(t.f2334r, str8); a2 != null; a2 = a2.r()) {
                                    x1.a b2 = ((x1.b) a2.d).b(1);
                                    q1.d.b(b2);
                                    sVar.f2332b.add(b2.f4198a);
                                    if (a2.l().f3939a > i22) {
                                        String substring = str8.substring(i22, a2.l().f3939a);
                                        q1.d.d(substring, "substring(...)");
                                        String quote = Pattern.quote(substring);
                                        q1.d.d(quote, "quote(...)");
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i22 = a2.l().f3940b + 1;
                                }
                                if (i22 < str8.length()) {
                                    String substring2 = str8.substring(i22);
                                    q1.d.d(substring2, "substring(...)");
                                    String quote2 = Pattern.quote(substring2);
                                    q1.d.d(quote2, "quote(...)");
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                String sb2 = sb.toString();
                                q1.d.d(sb2, "toString(...)");
                                sVar.f2331a = t.g(sb2);
                                linkedHashMap.put(str7, sVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str9 = this.f2328b.f2339a;
                        if (str9 != null) {
                            Uri parse2 = Uri.parse(str9);
                            q1.d.d(parse2, "parse(...)");
                            if (parse2.getFragment() != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Uri parse3 = Uri.parse(str9);
                                q1.d.d(parse3, "parse(...)");
                                String fragment = parse3.getFragment();
                                StringBuilder sb3 = new StringBuilder();
                                q1.d.b(fragment);
                                t.a(fragment, arrayList2, sb3);
                                return new i1.d(arrayList2, sb3.toString());
                            }
                        }
                        return null;
                    case Platform.INFO /* 4 */:
                        i1.d dVar = (i1.d) this.f2328b.f2345j.getValue();
                        return (dVar == null || (list2 = (List) dVar.f2670a) == null) ? new ArrayList() : list2;
                    case Platform.WARN /* 5 */:
                        i1.d dVar2 = (i1.d) this.f2328b.f2345j.getValue();
                        if (dVar2 != null) {
                            return (String) dVar2.f2671b;
                        }
                        return null;
                    case 6:
                        String str10 = (String) this.f2328b.f2347l.getValue();
                        if (str10 != null) {
                            return new x1.c(str10, 0);
                        }
                        return null;
                    default:
                        String str11 = this.f2328b.f2349n;
                        if (str11 != null) {
                            return new x1.c(str11);
                        }
                        return null;
                }
            }
        });
        i1.c cVar = i1.c.f2668a;
        final int i3 = 2;
        this.h = U.t.L(cVar, new p1.a(this) { // from class: f0.q

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f2328b;

            {
                this.f2328b = this;
            }

            /* JADX WARN: Type inference failed for: r15v20, types: [java.lang.Object, i1.b] */
            /* JADX WARN: Type inference failed for: r15v27, types: [java.lang.Object, i1.b] */
            /* JADX WARN: Type inference failed for: r15v34, types: [java.lang.Object, i1.b] */
            @Override // p1.a
            public final Object a() {
                List list2;
                switch (i3) {
                    case 0:
                        String str4 = this.f2328b.f2342e;
                        if (str4 != null) {
                            return new x1.c(str4, 0);
                        }
                        return null;
                    case 1:
                        String str5 = this.f2328b.f2339a;
                        return Boolean.valueOf(str5 != null && t.f2338v.c(str5));
                    case 2:
                        t tVar = this.f2328b;
                        tVar.getClass();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (tVar.e()) {
                            String str6 = tVar.f2339a;
                            q1.d.b(str6);
                            Uri parse = Uri.parse(str6);
                            q1.d.d(parse, "parse(...)");
                            for (String str7 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str7);
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(("Query parameter " + str7 + " must only be present once in " + str6 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str8 = (String) j1.j.p0(queryParameters);
                                if (str8 == null) {
                                    tVar.i = true;
                                    str8 = str7;
                                }
                                s sVar = new s();
                                int i22 = 0;
                                for (C0016l a2 = x1.c.a(t.f2334r, str8); a2 != null; a2 = a2.r()) {
                                    x1.a b2 = ((x1.b) a2.d).b(1);
                                    q1.d.b(b2);
                                    sVar.f2332b.add(b2.f4198a);
                                    if (a2.l().f3939a > i22) {
                                        String substring = str8.substring(i22, a2.l().f3939a);
                                        q1.d.d(substring, "substring(...)");
                                        String quote = Pattern.quote(substring);
                                        q1.d.d(quote, "quote(...)");
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i22 = a2.l().f3940b + 1;
                                }
                                if (i22 < str8.length()) {
                                    String substring2 = str8.substring(i22);
                                    q1.d.d(substring2, "substring(...)");
                                    String quote2 = Pattern.quote(substring2);
                                    q1.d.d(quote2, "quote(...)");
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                String sb2 = sb.toString();
                                q1.d.d(sb2, "toString(...)");
                                sVar.f2331a = t.g(sb2);
                                linkedHashMap.put(str7, sVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str9 = this.f2328b.f2339a;
                        if (str9 != null) {
                            Uri parse2 = Uri.parse(str9);
                            q1.d.d(parse2, "parse(...)");
                            if (parse2.getFragment() != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Uri parse3 = Uri.parse(str9);
                                q1.d.d(parse3, "parse(...)");
                                String fragment = parse3.getFragment();
                                StringBuilder sb3 = new StringBuilder();
                                q1.d.b(fragment);
                                t.a(fragment, arrayList2, sb3);
                                return new i1.d(arrayList2, sb3.toString());
                            }
                        }
                        return null;
                    case Platform.INFO /* 4 */:
                        i1.d dVar = (i1.d) this.f2328b.f2345j.getValue();
                        return (dVar == null || (list2 = (List) dVar.f2670a) == null) ? new ArrayList() : list2;
                    case Platform.WARN /* 5 */:
                        i1.d dVar2 = (i1.d) this.f2328b.f2345j.getValue();
                        if (dVar2 != null) {
                            return (String) dVar2.f2671b;
                        }
                        return null;
                    case 6:
                        String str10 = (String) this.f2328b.f2347l.getValue();
                        if (str10 != null) {
                            return new x1.c(str10, 0);
                        }
                        return null;
                    default:
                        String str11 = this.f2328b.f2349n;
                        if (str11 != null) {
                            return new x1.c(str11);
                        }
                        return null;
                }
            }
        });
        final int i4 = 3;
        this.f2345j = U.t.L(cVar, new p1.a(this) { // from class: f0.q

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f2328b;

            {
                this.f2328b = this;
            }

            /* JADX WARN: Type inference failed for: r15v20, types: [java.lang.Object, i1.b] */
            /* JADX WARN: Type inference failed for: r15v27, types: [java.lang.Object, i1.b] */
            /* JADX WARN: Type inference failed for: r15v34, types: [java.lang.Object, i1.b] */
            @Override // p1.a
            public final Object a() {
                List list2;
                switch (i4) {
                    case 0:
                        String str4 = this.f2328b.f2342e;
                        if (str4 != null) {
                            return new x1.c(str4, 0);
                        }
                        return null;
                    case 1:
                        String str5 = this.f2328b.f2339a;
                        return Boolean.valueOf(str5 != null && t.f2338v.c(str5));
                    case 2:
                        t tVar = this.f2328b;
                        tVar.getClass();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (tVar.e()) {
                            String str6 = tVar.f2339a;
                            q1.d.b(str6);
                            Uri parse = Uri.parse(str6);
                            q1.d.d(parse, "parse(...)");
                            for (String str7 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str7);
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(("Query parameter " + str7 + " must only be present once in " + str6 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str8 = (String) j1.j.p0(queryParameters);
                                if (str8 == null) {
                                    tVar.i = true;
                                    str8 = str7;
                                }
                                s sVar = new s();
                                int i22 = 0;
                                for (C0016l a2 = x1.c.a(t.f2334r, str8); a2 != null; a2 = a2.r()) {
                                    x1.a b2 = ((x1.b) a2.d).b(1);
                                    q1.d.b(b2);
                                    sVar.f2332b.add(b2.f4198a);
                                    if (a2.l().f3939a > i22) {
                                        String substring = str8.substring(i22, a2.l().f3939a);
                                        q1.d.d(substring, "substring(...)");
                                        String quote = Pattern.quote(substring);
                                        q1.d.d(quote, "quote(...)");
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i22 = a2.l().f3940b + 1;
                                }
                                if (i22 < str8.length()) {
                                    String substring2 = str8.substring(i22);
                                    q1.d.d(substring2, "substring(...)");
                                    String quote2 = Pattern.quote(substring2);
                                    q1.d.d(quote2, "quote(...)");
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                String sb2 = sb.toString();
                                q1.d.d(sb2, "toString(...)");
                                sVar.f2331a = t.g(sb2);
                                linkedHashMap.put(str7, sVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str9 = this.f2328b.f2339a;
                        if (str9 != null) {
                            Uri parse2 = Uri.parse(str9);
                            q1.d.d(parse2, "parse(...)");
                            if (parse2.getFragment() != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Uri parse3 = Uri.parse(str9);
                                q1.d.d(parse3, "parse(...)");
                                String fragment = parse3.getFragment();
                                StringBuilder sb3 = new StringBuilder();
                                q1.d.b(fragment);
                                t.a(fragment, arrayList2, sb3);
                                return new i1.d(arrayList2, sb3.toString());
                            }
                        }
                        return null;
                    case Platform.INFO /* 4 */:
                        i1.d dVar = (i1.d) this.f2328b.f2345j.getValue();
                        return (dVar == null || (list2 = (List) dVar.f2670a) == null) ? new ArrayList() : list2;
                    case Platform.WARN /* 5 */:
                        i1.d dVar2 = (i1.d) this.f2328b.f2345j.getValue();
                        if (dVar2 != null) {
                            return (String) dVar2.f2671b;
                        }
                        return null;
                    case 6:
                        String str10 = (String) this.f2328b.f2347l.getValue();
                        if (str10 != null) {
                            return new x1.c(str10, 0);
                        }
                        return null;
                    default:
                        String str11 = this.f2328b.f2349n;
                        if (str11 != null) {
                            return new x1.c(str11);
                        }
                        return null;
                }
            }
        });
        final int i5 = 4;
        this.f2346k = U.t.L(cVar, new p1.a(this) { // from class: f0.q

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f2328b;

            {
                this.f2328b = this;
            }

            /* JADX WARN: Type inference failed for: r15v20, types: [java.lang.Object, i1.b] */
            /* JADX WARN: Type inference failed for: r15v27, types: [java.lang.Object, i1.b] */
            /* JADX WARN: Type inference failed for: r15v34, types: [java.lang.Object, i1.b] */
            @Override // p1.a
            public final Object a() {
                List list2;
                switch (i5) {
                    case 0:
                        String str4 = this.f2328b.f2342e;
                        if (str4 != null) {
                            return new x1.c(str4, 0);
                        }
                        return null;
                    case 1:
                        String str5 = this.f2328b.f2339a;
                        return Boolean.valueOf(str5 != null && t.f2338v.c(str5));
                    case 2:
                        t tVar = this.f2328b;
                        tVar.getClass();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (tVar.e()) {
                            String str6 = tVar.f2339a;
                            q1.d.b(str6);
                            Uri parse = Uri.parse(str6);
                            q1.d.d(parse, "parse(...)");
                            for (String str7 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str7);
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(("Query parameter " + str7 + " must only be present once in " + str6 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str8 = (String) j1.j.p0(queryParameters);
                                if (str8 == null) {
                                    tVar.i = true;
                                    str8 = str7;
                                }
                                s sVar = new s();
                                int i22 = 0;
                                for (C0016l a2 = x1.c.a(t.f2334r, str8); a2 != null; a2 = a2.r()) {
                                    x1.a b2 = ((x1.b) a2.d).b(1);
                                    q1.d.b(b2);
                                    sVar.f2332b.add(b2.f4198a);
                                    if (a2.l().f3939a > i22) {
                                        String substring = str8.substring(i22, a2.l().f3939a);
                                        q1.d.d(substring, "substring(...)");
                                        String quote = Pattern.quote(substring);
                                        q1.d.d(quote, "quote(...)");
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i22 = a2.l().f3940b + 1;
                                }
                                if (i22 < str8.length()) {
                                    String substring2 = str8.substring(i22);
                                    q1.d.d(substring2, "substring(...)");
                                    String quote2 = Pattern.quote(substring2);
                                    q1.d.d(quote2, "quote(...)");
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                String sb2 = sb.toString();
                                q1.d.d(sb2, "toString(...)");
                                sVar.f2331a = t.g(sb2);
                                linkedHashMap.put(str7, sVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str9 = this.f2328b.f2339a;
                        if (str9 != null) {
                            Uri parse2 = Uri.parse(str9);
                            q1.d.d(parse2, "parse(...)");
                            if (parse2.getFragment() != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Uri parse3 = Uri.parse(str9);
                                q1.d.d(parse3, "parse(...)");
                                String fragment = parse3.getFragment();
                                StringBuilder sb3 = new StringBuilder();
                                q1.d.b(fragment);
                                t.a(fragment, arrayList2, sb3);
                                return new i1.d(arrayList2, sb3.toString());
                            }
                        }
                        return null;
                    case Platform.INFO /* 4 */:
                        i1.d dVar = (i1.d) this.f2328b.f2345j.getValue();
                        return (dVar == null || (list2 = (List) dVar.f2670a) == null) ? new ArrayList() : list2;
                    case Platform.WARN /* 5 */:
                        i1.d dVar2 = (i1.d) this.f2328b.f2345j.getValue();
                        if (dVar2 != null) {
                            return (String) dVar2.f2671b;
                        }
                        return null;
                    case 6:
                        String str10 = (String) this.f2328b.f2347l.getValue();
                        if (str10 != null) {
                            return new x1.c(str10, 0);
                        }
                        return null;
                    default:
                        String str11 = this.f2328b.f2349n;
                        if (str11 != null) {
                            return new x1.c(str11);
                        }
                        return null;
                }
            }
        });
        final int i6 = 5;
        this.f2347l = U.t.L(cVar, new p1.a(this) { // from class: f0.q

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f2328b;

            {
                this.f2328b = this;
            }

            /* JADX WARN: Type inference failed for: r15v20, types: [java.lang.Object, i1.b] */
            /* JADX WARN: Type inference failed for: r15v27, types: [java.lang.Object, i1.b] */
            /* JADX WARN: Type inference failed for: r15v34, types: [java.lang.Object, i1.b] */
            @Override // p1.a
            public final Object a() {
                List list2;
                switch (i6) {
                    case 0:
                        String str4 = this.f2328b.f2342e;
                        if (str4 != null) {
                            return new x1.c(str4, 0);
                        }
                        return null;
                    case 1:
                        String str5 = this.f2328b.f2339a;
                        return Boolean.valueOf(str5 != null && t.f2338v.c(str5));
                    case 2:
                        t tVar = this.f2328b;
                        tVar.getClass();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (tVar.e()) {
                            String str6 = tVar.f2339a;
                            q1.d.b(str6);
                            Uri parse = Uri.parse(str6);
                            q1.d.d(parse, "parse(...)");
                            for (String str7 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str7);
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(("Query parameter " + str7 + " must only be present once in " + str6 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str8 = (String) j1.j.p0(queryParameters);
                                if (str8 == null) {
                                    tVar.i = true;
                                    str8 = str7;
                                }
                                s sVar = new s();
                                int i22 = 0;
                                for (C0016l a2 = x1.c.a(t.f2334r, str8); a2 != null; a2 = a2.r()) {
                                    x1.a b2 = ((x1.b) a2.d).b(1);
                                    q1.d.b(b2);
                                    sVar.f2332b.add(b2.f4198a);
                                    if (a2.l().f3939a > i22) {
                                        String substring = str8.substring(i22, a2.l().f3939a);
                                        q1.d.d(substring, "substring(...)");
                                        String quote = Pattern.quote(substring);
                                        q1.d.d(quote, "quote(...)");
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i22 = a2.l().f3940b + 1;
                                }
                                if (i22 < str8.length()) {
                                    String substring2 = str8.substring(i22);
                                    q1.d.d(substring2, "substring(...)");
                                    String quote2 = Pattern.quote(substring2);
                                    q1.d.d(quote2, "quote(...)");
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                String sb2 = sb.toString();
                                q1.d.d(sb2, "toString(...)");
                                sVar.f2331a = t.g(sb2);
                                linkedHashMap.put(str7, sVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str9 = this.f2328b.f2339a;
                        if (str9 != null) {
                            Uri parse2 = Uri.parse(str9);
                            q1.d.d(parse2, "parse(...)");
                            if (parse2.getFragment() != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Uri parse3 = Uri.parse(str9);
                                q1.d.d(parse3, "parse(...)");
                                String fragment = parse3.getFragment();
                                StringBuilder sb3 = new StringBuilder();
                                q1.d.b(fragment);
                                t.a(fragment, arrayList2, sb3);
                                return new i1.d(arrayList2, sb3.toString());
                            }
                        }
                        return null;
                    case Platform.INFO /* 4 */:
                        i1.d dVar = (i1.d) this.f2328b.f2345j.getValue();
                        return (dVar == null || (list2 = (List) dVar.f2670a) == null) ? new ArrayList() : list2;
                    case Platform.WARN /* 5 */:
                        i1.d dVar2 = (i1.d) this.f2328b.f2345j.getValue();
                        if (dVar2 != null) {
                            return (String) dVar2.f2671b;
                        }
                        return null;
                    case 6:
                        String str10 = (String) this.f2328b.f2347l.getValue();
                        if (str10 != null) {
                            return new x1.c(str10, 0);
                        }
                        return null;
                    default:
                        String str11 = this.f2328b.f2349n;
                        if (str11 != null) {
                            return new x1.c(str11);
                        }
                        return null;
                }
            }
        });
        final int i7 = 6;
        this.f2348m = new i1.f(new p1.a(this) { // from class: f0.q

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f2328b;

            {
                this.f2328b = this;
            }

            /* JADX WARN: Type inference failed for: r15v20, types: [java.lang.Object, i1.b] */
            /* JADX WARN: Type inference failed for: r15v27, types: [java.lang.Object, i1.b] */
            /* JADX WARN: Type inference failed for: r15v34, types: [java.lang.Object, i1.b] */
            @Override // p1.a
            public final Object a() {
                List list2;
                switch (i7) {
                    case 0:
                        String str4 = this.f2328b.f2342e;
                        if (str4 != null) {
                            return new x1.c(str4, 0);
                        }
                        return null;
                    case 1:
                        String str5 = this.f2328b.f2339a;
                        return Boolean.valueOf(str5 != null && t.f2338v.c(str5));
                    case 2:
                        t tVar = this.f2328b;
                        tVar.getClass();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (tVar.e()) {
                            String str6 = tVar.f2339a;
                            q1.d.b(str6);
                            Uri parse = Uri.parse(str6);
                            q1.d.d(parse, "parse(...)");
                            for (String str7 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str7);
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(("Query parameter " + str7 + " must only be present once in " + str6 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str8 = (String) j1.j.p0(queryParameters);
                                if (str8 == null) {
                                    tVar.i = true;
                                    str8 = str7;
                                }
                                s sVar = new s();
                                int i22 = 0;
                                for (C0016l a2 = x1.c.a(t.f2334r, str8); a2 != null; a2 = a2.r()) {
                                    x1.a b2 = ((x1.b) a2.d).b(1);
                                    q1.d.b(b2);
                                    sVar.f2332b.add(b2.f4198a);
                                    if (a2.l().f3939a > i22) {
                                        String substring = str8.substring(i22, a2.l().f3939a);
                                        q1.d.d(substring, "substring(...)");
                                        String quote = Pattern.quote(substring);
                                        q1.d.d(quote, "quote(...)");
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i22 = a2.l().f3940b + 1;
                                }
                                if (i22 < str8.length()) {
                                    String substring2 = str8.substring(i22);
                                    q1.d.d(substring2, "substring(...)");
                                    String quote2 = Pattern.quote(substring2);
                                    q1.d.d(quote2, "quote(...)");
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                String sb2 = sb.toString();
                                q1.d.d(sb2, "toString(...)");
                                sVar.f2331a = t.g(sb2);
                                linkedHashMap.put(str7, sVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str9 = this.f2328b.f2339a;
                        if (str9 != null) {
                            Uri parse2 = Uri.parse(str9);
                            q1.d.d(parse2, "parse(...)");
                            if (parse2.getFragment() != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Uri parse3 = Uri.parse(str9);
                                q1.d.d(parse3, "parse(...)");
                                String fragment = parse3.getFragment();
                                StringBuilder sb3 = new StringBuilder();
                                q1.d.b(fragment);
                                t.a(fragment, arrayList2, sb3);
                                return new i1.d(arrayList2, sb3.toString());
                            }
                        }
                        return null;
                    case Platform.INFO /* 4 */:
                        i1.d dVar = (i1.d) this.f2328b.f2345j.getValue();
                        return (dVar == null || (list2 = (List) dVar.f2670a) == null) ? new ArrayList() : list2;
                    case Platform.WARN /* 5 */:
                        i1.d dVar2 = (i1.d) this.f2328b.f2345j.getValue();
                        if (dVar2 != null) {
                            return (String) dVar2.f2671b;
                        }
                        return null;
                    case 6:
                        String str10 = (String) this.f2328b.f2347l.getValue();
                        if (str10 != null) {
                            return new x1.c(str10, 0);
                        }
                        return null;
                    default:
                        String str11 = this.f2328b.f2349n;
                        if (str11 != null) {
                            return new x1.c(str11);
                        }
                        return null;
                }
            }
        });
        final int i8 = 7;
        this.f2350o = new i1.f(new p1.a(this) { // from class: f0.q

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f2328b;

            {
                this.f2328b = this;
            }

            /* JADX WARN: Type inference failed for: r15v20, types: [java.lang.Object, i1.b] */
            /* JADX WARN: Type inference failed for: r15v27, types: [java.lang.Object, i1.b] */
            /* JADX WARN: Type inference failed for: r15v34, types: [java.lang.Object, i1.b] */
            @Override // p1.a
            public final Object a() {
                List list2;
                switch (i8) {
                    case 0:
                        String str4 = this.f2328b.f2342e;
                        if (str4 != null) {
                            return new x1.c(str4, 0);
                        }
                        return null;
                    case 1:
                        String str5 = this.f2328b.f2339a;
                        return Boolean.valueOf(str5 != null && t.f2338v.c(str5));
                    case 2:
                        t tVar = this.f2328b;
                        tVar.getClass();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (tVar.e()) {
                            String str6 = tVar.f2339a;
                            q1.d.b(str6);
                            Uri parse = Uri.parse(str6);
                            q1.d.d(parse, "parse(...)");
                            for (String str7 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str7);
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(("Query parameter " + str7 + " must only be present once in " + str6 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str8 = (String) j1.j.p0(queryParameters);
                                if (str8 == null) {
                                    tVar.i = true;
                                    str8 = str7;
                                }
                                s sVar = new s();
                                int i22 = 0;
                                for (C0016l a2 = x1.c.a(t.f2334r, str8); a2 != null; a2 = a2.r()) {
                                    x1.a b2 = ((x1.b) a2.d).b(1);
                                    q1.d.b(b2);
                                    sVar.f2332b.add(b2.f4198a);
                                    if (a2.l().f3939a > i22) {
                                        String substring = str8.substring(i22, a2.l().f3939a);
                                        q1.d.d(substring, "substring(...)");
                                        String quote = Pattern.quote(substring);
                                        q1.d.d(quote, "quote(...)");
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i22 = a2.l().f3940b + 1;
                                }
                                if (i22 < str8.length()) {
                                    String substring2 = str8.substring(i22);
                                    q1.d.d(substring2, "substring(...)");
                                    String quote2 = Pattern.quote(substring2);
                                    q1.d.d(quote2, "quote(...)");
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                String sb2 = sb.toString();
                                q1.d.d(sb2, "toString(...)");
                                sVar.f2331a = t.g(sb2);
                                linkedHashMap.put(str7, sVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str9 = this.f2328b.f2339a;
                        if (str9 != null) {
                            Uri parse2 = Uri.parse(str9);
                            q1.d.d(parse2, "parse(...)");
                            if (parse2.getFragment() != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Uri parse3 = Uri.parse(str9);
                                q1.d.d(parse3, "parse(...)");
                                String fragment = parse3.getFragment();
                                StringBuilder sb3 = new StringBuilder();
                                q1.d.b(fragment);
                                t.a(fragment, arrayList2, sb3);
                                return new i1.d(arrayList2, sb3.toString());
                            }
                        }
                        return null;
                    case Platform.INFO /* 4 */:
                        i1.d dVar = (i1.d) this.f2328b.f2345j.getValue();
                        return (dVar == null || (list2 = (List) dVar.f2670a) == null) ? new ArrayList() : list2;
                    case Platform.WARN /* 5 */:
                        i1.d dVar2 = (i1.d) this.f2328b.f2345j.getValue();
                        if (dVar2 != null) {
                            return (String) dVar2.f2671b;
                        }
                        return null;
                    case 6:
                        String str10 = (String) this.f2328b.f2347l.getValue();
                        if (str10 != null) {
                            return new x1.c(str10, 0);
                        }
                        return null;
                    default:
                        String str11 = this.f2328b.f2349n;
                        if (str11 != null) {
                            return new x1.c(str11);
                        }
                        return null;
                }
            }
        });
        if (str != null) {
            StringBuilder sb = new StringBuilder("^");
            x1.c cVar2 = f2333q;
            cVar2.getClass();
            if (!cVar2.f4201a.matcher(str).find()) {
                String pattern = f2335s.f4201a.pattern();
                q1.d.d(pattern, "pattern(...)");
                sb.append(pattern);
            }
            C0016l a2 = x1.c.a(new x1.c("(\\?|#|$)"), str);
            if (a2 != null) {
                String substring = str.substring(0, a2.l().f3939a);
                q1.d.d(substring, "substring(...)");
                a(substring, arrayList, sb);
                x1.c cVar3 = f2336t;
                cVar3.getClass();
                if (!cVar3.f4201a.matcher(sb).find()) {
                    x1.c cVar4 = f2337u;
                    cVar4.getClass();
                    if (!cVar4.f4201a.matcher(sb).find()) {
                        z2 = true;
                        this.f2351p = z2;
                        sb.append("($|(\\?(.)*)|(#(.)*))");
                    }
                }
                z2 = false;
                this.f2351p = z2;
                sb.append("($|(\\?(.)*)|(#(.)*))");
            }
            String sb2 = sb.toString();
            q1.d.d(sb2, "toString(...)");
            this.f2342e = g(sb2);
        }
        if (str3 == null) {
            return;
        }
        Pattern compile = Pattern.compile("^[\\s\\S]+/[\\s\\S]+$");
        q1.d.d(compile, "compile(...)");
        if (!compile.matcher(str3).matches()) {
            throw new IllegalArgumentException(D.f.d("The given mimeType ", str3, " does not match to required \"type/subtype\" format").toString());
        }
        Pattern compile2 = Pattern.compile("/");
        q1.d.d(compile2, "compile(...)");
        Matcher matcher = compile2.matcher(str3);
        if (matcher.find()) {
            ArrayList arrayList2 = new ArrayList(10);
            int i9 = 0;
            do {
                arrayList2.add(str3.subSequence(i9, matcher.start()).toString());
                i9 = matcher.end();
            } while (matcher.find());
            arrayList2.add(str3.subSequence(i9, str3.length()).toString());
            list = arrayList2;
        } else {
            list = U.t.M(str3.toString());
        }
        boolean isEmpty = list.isEmpty();
        List list2 = j1.s.f2755a;
        if (!isEmpty) {
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    break;
                }
                if (((String) listIterator.previous()).length() != 0) {
                    int nextIndex = listIterator.nextIndex() + 1;
                    if (nextIndex < 0) {
                        throw new IllegalArgumentException(("Requested element count " + nextIndex + " is less than zero.").toString());
                    }
                    if (nextIndex != 0) {
                        if (nextIndex >= list.size()) {
                            list2 = j1.j.y0(list);
                        } else if (nextIndex == 1) {
                            list2 = U.t.M(j1.j.o0(list));
                        } else {
                            ArrayList arrayList3 = new ArrayList(nextIndex);
                            Iterator it = list.iterator();
                            int i10 = 0;
                            while (it.hasNext()) {
                                arrayList3.add(it.next());
                                i10++;
                                if (i10 == nextIndex) {
                                    break;
                                }
                            }
                            list2 = j1.k.i0(arrayList3);
                        }
                    }
                }
            }
        }
        this.f2349n = x1.k.A("^(" + ((String) list2.get(0)) + "|[*]+)/(" + ((String) list2.get(1)) + "|[*]+)$", "*|[*]", "[\\s\\S]");
    }

    public static void a(String str, ArrayList arrayList, StringBuilder sb) {
        int i = 0;
        for (C0016l a2 = x1.c.a(f2334r, str); a2 != null; a2 = a2.r()) {
            x1.a b2 = ((x1.b) a2.d).b(1);
            q1.d.b(b2);
            arrayList.add(b2.f4198a);
            if (a2.l().f3939a > i) {
                String substring = str.substring(i, a2.l().f3939a);
                q1.d.d(substring, "substring(...)");
                String quote = Pattern.quote(substring);
                q1.d.d(quote, "quote(...)");
                sb.append(quote);
            }
            String pattern = f2337u.f4201a.pattern();
            q1.d.d(pattern, "pattern(...)");
            sb.append(pattern);
            i = a2.l().f3940b + 1;
        }
        if (i < str.length()) {
            String substring2 = str.substring(i);
            q1.d.d(substring2, "substring(...)");
            String quote2 = Pattern.quote(substring2);
            q1.d.d(quote2, "quote(...)");
            sb.append(quote2);
        }
    }

    public static void f(Bundle bundle, String str, String str2, C0132h c0132h) {
        if (c0132h == null) {
            q1.d.e(str, "key");
            bundle.putString(str, str2);
        } else {
            H h = c0132h.f2302a;
            q1.d.e(str, "key");
            h.e(bundle, str, h.d(str2));
        }
    }

    public static String g(String str) {
        return (x1.k.x(str, "\\Q") && x1.k.x(str, "\\E")) ? x1.k.A(str, ".*", "\\E.*\\Q") : x1.k.x(str, "\\.\\*") ? x1.k.A(str, "\\.\\*", ".*") : str;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, i1.b] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, i1.b] */
    public final ArrayList b() {
        ArrayList arrayList = this.d;
        Collection values = ((Map) this.h.getValue()).values();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            j1.p.l0(((s) it.next()).f2332b, arrayList2);
        }
        return j1.j.u0(j1.j.u0(arrayList, arrayList2), (List) this.f2346k.getValue());
    }

    public final boolean c(C0016l c0016l, Bundle bundle, LinkedHashMap linkedHashMap) {
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = new ArrayList(j1.l.k0(arrayList, 10));
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            String str = null;
            if (i < 0) {
                j1.k.j0();
                throw null;
            }
            String str2 = (String) next;
            x1.a b2 = ((x1.b) c0016l.d).b(i2);
            if (b2 != null) {
                str = Uri.decode(b2.f4198a);
                q1.d.d(str, "decode(...)");
            }
            if (str == null) {
                str = "";
            }
            try {
                f(bundle, str2, str, (C0132h) linkedHashMap.get(str2));
                arrayList2.add(i1.g.f2679c);
                i = i2;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [int] */
    /* JADX WARN: Type inference failed for: r22v0, types: [java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, i1.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(android.net.Uri r20, android.os.Bundle r21, java.util.LinkedHashMap r22) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.t.d(android.net.Uri, android.os.Bundle, java.util.LinkedHashMap):boolean");
    }

    public final boolean e() {
        return ((Boolean) this.f2344g.getValue()).booleanValue();
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof t)) {
            t tVar = (t) obj;
            if (q1.d.a(this.f2339a, tVar.f2339a) && q1.d.a(this.f2340b, tVar.f2340b) && q1.d.a(this.f2341c, tVar.f2341c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f2339a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f2340b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f2341c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
