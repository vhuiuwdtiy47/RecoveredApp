package z0;

import M0.m;
import Z0.i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import com.android.music.R;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;
import w0.AbstractC0373a;

/* renamed from: z0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0387c {

    /* renamed from: a, reason: collision with root package name */
    public final C0386b f4266a;

    /* renamed from: b, reason: collision with root package name */
    public final C0386b f4267b;

    /* renamed from: c, reason: collision with root package name */
    public final float f4268c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final float f4269e;

    /* renamed from: f, reason: collision with root package name */
    public final float f4270f;

    /* renamed from: g, reason: collision with root package name */
    public final float f4271g;
    public final float h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f4272j;

    /* renamed from: k, reason: collision with root package name */
    public final int f4273k;

    /* JADX WARN: Type inference failed for: r1v0, types: [z0.b, java.lang.Object] */
    public C0387c(Context context, C0386b c0386b) {
        AttributeSet attributeSet;
        int i;
        int next;
        ?? obj = new Object();
        obj.i = 255;
        obj.f4250k = -2;
        obj.f4251l = -2;
        obj.f4252m = -2;
        obj.f4259t = Boolean.TRUE;
        this.f4267b = obj;
        int i2 = c0386b.f4243a;
        if (i2 != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i2);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (!TextUtils.equals(xml.getName(), "badge")) {
                    throw new XmlPullParserException("Must have a <" + ((Object) "badge") + "> start tag");
                }
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                attributeSet = asAttributeSet;
                i = asAttributeSet.getStyleAttribute();
            } catch (IOException | XmlPullParserException e2) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i2));
                notFoundException.initCause(e2);
                throw notFoundException;
            }
        } else {
            attributeSet = null;
            i = 0;
        }
        TypedArray g2 = m.g(context, attributeSet, AbstractC0373a.f4150a, R.attr.badgeStyle, i == 0 ? R.style.Widget_MaterialComponents_Badge : i, new int[0]);
        Resources resources = context.getResources();
        this.f4268c = g2.getDimensionPixelSize(4, -1);
        this.i = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
        this.f4272j = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.d = g2.getDimensionPixelSize(14, -1);
        this.f4269e = g2.getDimension(12, resources.getDimension(R.dimen.m3_badge_size));
        this.f4271g = g2.getDimension(17, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f4270f = g2.getDimension(3, resources.getDimension(R.dimen.m3_badge_size));
        this.h = g2.getDimension(13, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f4273k = g2.getInt(24, 1);
        C0386b c0386b2 = this.f4267b;
        int i3 = c0386b.i;
        c0386b2.i = i3 == -2 ? 255 : i3;
        int i4 = c0386b.f4250k;
        if (i4 != -2) {
            c0386b2.f4250k = i4;
        } else if (g2.hasValue(23)) {
            this.f4267b.f4250k = g2.getInt(23, 0);
        } else {
            this.f4267b.f4250k = -1;
        }
        String str = c0386b.f4249j;
        if (str != null) {
            this.f4267b.f4249j = str;
        } else if (g2.hasValue(7)) {
            this.f4267b.f4249j = g2.getString(7);
        }
        C0386b c0386b3 = this.f4267b;
        c0386b3.f4254o = c0386b.f4254o;
        CharSequence charSequence = c0386b.f4255p;
        c0386b3.f4255p = charSequence == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : charSequence;
        C0386b c0386b4 = this.f4267b;
        int i5 = c0386b.f4256q;
        c0386b4.f4256q = i5 == 0 ? R.plurals.mtrl_badge_content_description : i5;
        int i6 = c0386b.f4257r;
        c0386b4.f4257r = i6 == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : i6;
        Boolean bool = c0386b.f4259t;
        c0386b4.f4259t = Boolean.valueOf(bool == null || bool.booleanValue());
        C0386b c0386b5 = this.f4267b;
        int i7 = c0386b.f4251l;
        c0386b5.f4251l = i7 == -2 ? g2.getInt(21, -2) : i7;
        C0386b c0386b6 = this.f4267b;
        int i8 = c0386b.f4252m;
        c0386b6.f4252m = i8 == -2 ? g2.getInt(22, -2) : i8;
        C0386b c0386b7 = this.f4267b;
        Integer num = c0386b.f4246e;
        c0386b7.f4246e = Integer.valueOf(num == null ? g2.getResourceId(5, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num.intValue());
        C0386b c0386b8 = this.f4267b;
        Integer num2 = c0386b.f4247f;
        c0386b8.f4247f = Integer.valueOf(num2 == null ? g2.getResourceId(6, 0) : num2.intValue());
        C0386b c0386b9 = this.f4267b;
        Integer num3 = c0386b.f4248g;
        c0386b9.f4248g = Integer.valueOf(num3 == null ? g2.getResourceId(15, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num3.intValue());
        C0386b c0386b10 = this.f4267b;
        Integer num4 = c0386b.h;
        c0386b10.h = Integer.valueOf(num4 == null ? g2.getResourceId(16, 0) : num4.intValue());
        C0386b c0386b11 = this.f4267b;
        Integer num5 = c0386b.f4244b;
        c0386b11.f4244b = Integer.valueOf(num5 == null ? i.x(context, g2, 1).getDefaultColor() : num5.intValue());
        C0386b c0386b12 = this.f4267b;
        Integer num6 = c0386b.d;
        c0386b12.d = Integer.valueOf(num6 == null ? g2.getResourceId(8, R.style.TextAppearance_MaterialComponents_Badge) : num6.intValue());
        Integer num7 = c0386b.f4245c;
        if (num7 != null) {
            this.f4267b.f4245c = num7;
        } else if (g2.hasValue(9)) {
            this.f4267b.f4245c = Integer.valueOf(i.x(context, g2, 9).getDefaultColor());
        } else {
            int intValue = this.f4267b.d.intValue();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(intValue, AbstractC0373a.f4146C);
            obtainStyledAttributes.getDimension(0, 0.0f);
            ColorStateList x2 = i.x(context, obtainStyledAttributes, 3);
            i.x(context, obtainStyledAttributes, 4);
            i.x(context, obtainStyledAttributes, 5);
            obtainStyledAttributes.getInt(2, 0);
            obtainStyledAttributes.getInt(1, 1);
            int i9 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
            obtainStyledAttributes.getResourceId(i9, 0);
            obtainStyledAttributes.getString(i9);
            obtainStyledAttributes.getBoolean(14, false);
            i.x(context, obtainStyledAttributes, 6);
            obtainStyledAttributes.getFloat(7, 0.0f);
            obtainStyledAttributes.getFloat(8, 0.0f);
            obtainStyledAttributes.getFloat(9, 0.0f);
            obtainStyledAttributes.recycle();
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(intValue, AbstractC0373a.f4165s);
            obtainStyledAttributes2.hasValue(0);
            obtainStyledAttributes2.getFloat(0, 0.0f);
            obtainStyledAttributes2.recycle();
            this.f4267b.f4245c = Integer.valueOf(x2.getDefaultColor());
        }
        C0386b c0386b13 = this.f4267b;
        Integer num8 = c0386b.f4258s;
        c0386b13.f4258s = Integer.valueOf(num8 == null ? g2.getInt(2, 8388661) : num8.intValue());
        C0386b c0386b14 = this.f4267b;
        Integer num9 = c0386b.f4260u;
        c0386b14.f4260u = Integer.valueOf(num9 == null ? g2.getDimensionPixelSize(11, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding)) : num9.intValue());
        C0386b c0386b15 = this.f4267b;
        Integer num10 = c0386b.f4261v;
        c0386b15.f4261v = Integer.valueOf(num10 == null ? g2.getDimensionPixelSize(10, resources.getDimensionPixelSize(R.dimen.m3_badge_with_text_vertical_padding)) : num10.intValue());
        C0386b c0386b16 = this.f4267b;
        Integer num11 = c0386b.f4262w;
        c0386b16.f4262w = Integer.valueOf(num11 == null ? g2.getDimensionPixelOffset(18, 0) : num11.intValue());
        C0386b c0386b17 = this.f4267b;
        Integer num12 = c0386b.f4263x;
        c0386b17.f4263x = Integer.valueOf(num12 == null ? g2.getDimensionPixelOffset(25, 0) : num12.intValue());
        C0386b c0386b18 = this.f4267b;
        Integer num13 = c0386b.f4264y;
        c0386b18.f4264y = Integer.valueOf(num13 == null ? g2.getDimensionPixelOffset(19, c0386b18.f4262w.intValue()) : num13.intValue());
        C0386b c0386b19 = this.f4267b;
        Integer num14 = c0386b.f4265z;
        c0386b19.f4265z = Integer.valueOf(num14 == null ? g2.getDimensionPixelOffset(26, c0386b19.f4263x.intValue()) : num14.intValue());
        C0386b c0386b20 = this.f4267b;
        Integer num15 = c0386b.f4241C;
        c0386b20.f4241C = Integer.valueOf(num15 == null ? g2.getDimensionPixelOffset(20, 0) : num15.intValue());
        C0386b c0386b21 = this.f4267b;
        Integer num16 = c0386b.f4239A;
        c0386b21.f4239A = Integer.valueOf(num16 == null ? 0 : num16.intValue());
        C0386b c0386b22 = this.f4267b;
        Integer num17 = c0386b.f4240B;
        c0386b22.f4240B = Integer.valueOf(num17 == null ? 0 : num17.intValue());
        C0386b c0386b23 = this.f4267b;
        Boolean bool2 = c0386b.f4242D;
        c0386b23.f4242D = Boolean.valueOf(bool2 == null ? g2.getBoolean(0, false) : bool2.booleanValue());
        g2.recycle();
        Locale locale = c0386b.f4253n;
        if (locale == null) {
            this.f4267b.f4253n = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            this.f4267b.f4253n = locale;
        }
        this.f4266a = c0386b;
    }
}
