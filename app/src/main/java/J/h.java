package j;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import f.AbstractC0117a;
import java.io.IOException;
import k.p;
import l.AbstractC0242k0;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class h extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f2727e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f2728f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f2729a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f2730b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f2731c;
    public Object d;

    static {
        Class[] clsArr = {Context.class};
        f2727e = clsArr;
        f2728f = clsArr;
    }

    public h(Context context) {
        super(context);
        this.f2731c = context;
        Object[] objArr = {context};
        this.f2729a = objArr;
        this.f2730b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v60 */
    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) {
        ?? r4;
        int i;
        XmlResourceParser xmlResourceParser2;
        boolean z2;
        ColorStateList colorStateList;
        int resourceId;
        C0162g c0162g = new C0162g(this, menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            r4 = 1;
            i = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlResourceParser.next();
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z3 = false;
        boolean z4 = false;
        String str = null;
        while (!z3) {
            if (eventType == r4) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i) {
                if (eventType == 3) {
                    String name2 = xmlResourceParser.getName();
                    if (z4 && name2.equals(str)) {
                        xmlResourceParser2 = xmlResourceParser;
                        z2 = r4;
                        z4 = false;
                        str = null;
                        eventType = xmlResourceParser2.next();
                        r4 = z2;
                        i = 2;
                        z4 = z4;
                    } else if (name2.equals("group")) {
                        c0162g.f2705b = 0;
                        c0162g.f2706c = 0;
                        c0162g.d = 0;
                        c0162g.f2707e = 0;
                        c0162g.f2708f = r4;
                        c0162g.f2709g = r4;
                    } else if (name2.equals("item")) {
                        if (!c0162g.h) {
                            p pVar = c0162g.f2726z;
                            if (pVar == null || !pVar.f2889b.hasSubMenu()) {
                                c0162g.h = r4;
                                c0162g.b(c0162g.f2704a.add(c0162g.f2705b, c0162g.i, c0162g.f2710j, c0162g.f2711k));
                            } else {
                                c0162g.h = r4;
                                c0162g.b(c0162g.f2704a.addSubMenu(c0162g.f2705b, c0162g.i, c0162g.f2710j, c0162g.f2711k).getItem());
                            }
                        }
                    } else if (name2.equals("menu")) {
                        xmlResourceParser2 = xmlResourceParser;
                        z2 = r4;
                        z3 = z2;
                    }
                }
                xmlResourceParser2 = xmlResourceParser;
                z2 = r4;
            } else {
                if (!z4) {
                    String name3 = xmlResourceParser.getName();
                    boolean equals = name3.equals("group");
                    h hVar = c0162g.f2703E;
                    if (equals) {
                        TypedArray obtainStyledAttributes = hVar.f2731c.obtainStyledAttributes(attributeSet, AbstractC0117a.f2247p);
                        c0162g.f2705b = obtainStyledAttributes.getResourceId(r4, 0);
                        c0162g.f2706c = obtainStyledAttributes.getInt(3, 0);
                        c0162g.d = obtainStyledAttributes.getInt(4, 0);
                        c0162g.f2707e = obtainStyledAttributes.getInt(5, 0);
                        c0162g.f2708f = obtainStyledAttributes.getBoolean(2, r4);
                        c0162g.f2709g = obtainStyledAttributes.getBoolean(0, r4);
                        obtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            Context context = hVar.f2731c;
                            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0117a.f2248q);
                            c0162g.i = obtainStyledAttributes2.getResourceId(2, 0);
                            c0162g.f2710j = (obtainStyledAttributes2.getInt(5, c0162g.f2706c) & (-65536)) | (obtainStyledAttributes2.getInt(6, c0162g.d) & 65535);
                            c0162g.f2711k = obtainStyledAttributes2.getText(7);
                            c0162g.f2712l = obtainStyledAttributes2.getText(8);
                            c0162g.f2713m = obtainStyledAttributes2.getResourceId(0, 0);
                            String string = obtainStyledAttributes2.getString(9);
                            c0162g.f2714n = string == null ? (char) 0 : string.charAt(0);
                            c0162g.f2715o = obtainStyledAttributes2.getInt(16, 4096);
                            String string2 = obtainStyledAttributes2.getString(10);
                            c0162g.f2716p = string2 == null ? (char) 0 : string2.charAt(0);
                            c0162g.f2717q = obtainStyledAttributes2.getInt(20, 4096);
                            if (obtainStyledAttributes2.hasValue(11)) {
                                c0162g.f2718r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                c0162g.f2718r = c0162g.f2707e;
                            }
                            c0162g.f2719s = obtainStyledAttributes2.getBoolean(3, false);
                            c0162g.f2720t = obtainStyledAttributes2.getBoolean(4, c0162g.f2708f);
                            c0162g.f2721u = obtainStyledAttributes2.getBoolean(1, c0162g.f2709g);
                            c0162g.f2722v = obtainStyledAttributes2.getInt(21, -1);
                            c0162g.f2725y = obtainStyledAttributes2.getString(12);
                            c0162g.f2723w = obtainStyledAttributes2.getResourceId(13, 0);
                            c0162g.f2724x = obtainStyledAttributes2.getString(15);
                            String string3 = obtainStyledAttributes2.getString(14);
                            boolean z5 = string3 != null;
                            if (z5 && c0162g.f2723w == 0 && c0162g.f2724x == null) {
                                c0162g.f2726z = (p) c0162g.a(string3, f2728f, hVar.f2730b);
                            } else {
                                if (z5) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                c0162g.f2726z = null;
                            }
                            c0162g.f2699A = obtainStyledAttributes2.getText(17);
                            c0162g.f2700B = obtainStyledAttributes2.getText(22);
                            if (obtainStyledAttributes2.hasValue(19)) {
                                c0162g.f2702D = AbstractC0242k0.b(obtainStyledAttributes2.getInt(19, -1), c0162g.f2702D);
                            } else {
                                c0162g.f2702D = null;
                            }
                            if (obtainStyledAttributes2.hasValue(18)) {
                                if (!obtainStyledAttributes2.hasValue(18) || (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = Z0.i.v(context, resourceId)) == null) {
                                    colorStateList = obtainStyledAttributes2.getColorStateList(18);
                                }
                                c0162g.f2701C = colorStateList;
                            } else {
                                c0162g.f2701C = null;
                            }
                            obtainStyledAttributes2.recycle();
                            c0162g.h = false;
                            xmlResourceParser2 = xmlResourceParser;
                            z2 = true;
                        } else if (name3.equals("menu")) {
                            z2 = true;
                            c0162g.h = true;
                            SubMenu addSubMenu = c0162g.f2704a.addSubMenu(c0162g.f2705b, c0162g.i, c0162g.f2710j, c0162g.f2711k);
                            c0162g.b(addSubMenu.getItem());
                            xmlResourceParser2 = xmlResourceParser;
                            b(xmlResourceParser2, attributeSet, addSubMenu);
                        } else {
                            xmlResourceParser2 = xmlResourceParser;
                            z2 = true;
                            str = name3;
                            z4 = true;
                        }
                        eventType = xmlResourceParser2.next();
                        r4 = z2;
                        i = 2;
                        z4 = z4;
                    }
                }
                xmlResourceParser2 = xmlResourceParser;
                z2 = r4;
            }
            eventType = xmlResourceParser2.next();
            r4 = z2;
            i = 2;
            z4 = z4;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof k.m)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z2 = false;
        try {
            try {
                xmlResourceParser = this.f2731c.getResources().getLayout(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                if (menu instanceof k.m) {
                    k.m mVar = (k.m) menu;
                    if (!mVar.f2850p) {
                        mVar.w();
                        z2 = true;
                    }
                }
                b(xmlResourceParser, asAttributeSet, menu);
                if (z2) {
                    ((k.m) menu).v();
                }
                xmlResourceParser.close();
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (z2) {
                ((k.m) menu).v();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
