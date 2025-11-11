package g;

import android.content.res.Configuration;
import android.os.LocaleList;

/* loaded from: classes.dex */
public abstract class u {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static H.g b(Configuration configuration) {
        return H.g.a(configuration.getLocales().toLanguageTags());
    }

    public static void c(H.g gVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(gVar.f189a.f190a.toLanguageTags()));
    }

    public static void d(Configuration configuration, H.g gVar) {
        configuration.setLocales(LocaleList.forLanguageTags(gVar.f189a.f190a.toLanguageTags()));
    }
}
