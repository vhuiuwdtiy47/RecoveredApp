package w;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tencent.wechat.Platform;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import r.AbstractC0319e;
import s.AbstractC0321a;
import v.AbstractC0362a;

/* loaded from: classes.dex */
public final class n {
    public static final int[] d = {0, 4, 8};

    /* renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f4131e;

    /* renamed from: f, reason: collision with root package name */
    public static final SparseIntArray f4132f;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f4133a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4134b = true;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f4135c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4131e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f4132f = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    public static int[] c(C0363a c0363a, String str) {
        int i;
        String[] split = str.split(",");
        Context context = c0363a.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            Object obj = null;
            try {
                i = q.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && c0363a.isInEditMode() && (c0363a.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) c0363a.getParent();
                if (trim != null) {
                    HashMap hashMap = constraintLayout.f1472m;
                    if (hashMap != null && hashMap.containsKey(trim)) {
                        obj = constraintLayout.f1472m.get(trim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    i = ((Integer) obj).intValue();
                }
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        return i3 != split.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0088. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:129:0x05fc. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r3v133, types: [w.h, java.lang.Object] */
    public static C0371i d(Context context, AttributeSet attributeSet, boolean z2) {
        int i;
        String str;
        String str2;
        int i2;
        int i3;
        C0371i c0371i = new C0371i();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z2 ? r.f4139c : r.f4137a);
        int[] iArr = d;
        String[] strArr = AbstractC0321a.f3581a;
        SparseIntArray sparseIntArray = f4131e;
        l lVar = c0371i.f4043b;
        m mVar = c0371i.f4045e;
        k kVar = c0371i.f4044c;
        C0372j c0372j = c0371i.d;
        String str3 = "ConstraintSet";
        if (z2) {
            ?? obj = new Object();
            obj.f4033a = new int[10];
            obj.f4034b = new int[10];
            obj.f4035c = 0;
            obj.d = new int[10];
            obj.f4036e = new float[10];
            obj.f4037f = 0;
            obj.f4038g = new int[5];
            obj.h = new String[5];
            obj.i = 0;
            obj.f4039j = new int[4];
            obj.f4040k = new boolean[4];
            obj.f4041l = 0;
            kVar.getClass();
            c0372j.getClass();
            mVar.getClass();
            int i4 = 0;
            for (int indexCount = obtainStyledAttributes.getIndexCount(); i4 < indexCount; indexCount = i3) {
                int index = obtainStyledAttributes.getIndex(i4);
                int i5 = i4;
                switch (f4132f.get(index)) {
                    case 2:
                        i3 = indexCount;
                        obj.b(2, obtainStyledAttributes.getDimensionPixelSize(index, c0372j.f4055I));
                        break;
                    case 3:
                    case Platform.INFO /* 4 */:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        StringBuilder sb = new StringBuilder("Unknown attribute 0x");
                        i3 = indexCount;
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        break;
                    case Platform.WARN /* 5 */:
                        i3 = indexCount;
                        obj.d(obtainStyledAttributes.getString(index), 5);
                        break;
                    case 6:
                        i3 = indexCount;
                        obj.b(6, obtainStyledAttributes.getDimensionPixelOffset(index, c0372j.f4050C));
                        break;
                    case 7:
                        i3 = indexCount;
                        obj.b(7, obtainStyledAttributes.getDimensionPixelOffset(index, c0372j.f4051D));
                        break;
                    case 8:
                        i3 = indexCount;
                        obj.b(8, obtainStyledAttributes.getDimensionPixelSize(index, c0372j.f4056J));
                        break;
                    case 11:
                        i3 = indexCount;
                        obj.b(11, obtainStyledAttributes.getDimensionPixelSize(index, c0372j.f4062P));
                        break;
                    case 12:
                        i3 = indexCount;
                        obj.b(12, obtainStyledAttributes.getDimensionPixelSize(index, c0372j.f4063Q));
                        break;
                    case 13:
                        i3 = indexCount;
                        obj.b(13, obtainStyledAttributes.getDimensionPixelSize(index, c0372j.f4059M));
                        break;
                    case 14:
                        i3 = indexCount;
                        obj.b(14, obtainStyledAttributes.getDimensionPixelSize(index, c0372j.f4061O));
                        break;
                    case 15:
                        i3 = indexCount;
                        obj.b(15, obtainStyledAttributes.getDimensionPixelSize(index, c0372j.f4064R));
                        break;
                    case 16:
                        i3 = indexCount;
                        obj.b(16, obtainStyledAttributes.getDimensionPixelSize(index, c0372j.f4060N));
                        break;
                    case 17:
                        i3 = indexCount;
                        obj.b(17, obtainStyledAttributes.getDimensionPixelOffset(index, c0372j.d));
                        break;
                    case 18:
                        i3 = indexCount;
                        obj.b(18, obtainStyledAttributes.getDimensionPixelOffset(index, c0372j.f4079e));
                        break;
                    case 19:
                        i3 = indexCount;
                        obj.a(19, obtainStyledAttributes.getFloat(index, c0372j.f4081f));
                        break;
                    case 20:
                        i3 = indexCount;
                        obj.a(20, obtainStyledAttributes.getFloat(index, c0372j.f4106w));
                        break;
                    case 21:
                        i3 = indexCount;
                        obj.b(21, obtainStyledAttributes.getLayoutDimension(index, c0372j.f4076c));
                        break;
                    case 22:
                        i3 = indexCount;
                        obj.b(22, iArr[obtainStyledAttributes.getInt(index, lVar.f4117a)]);
                        break;
                    case 23:
                        i3 = indexCount;
                        obj.b(23, obtainStyledAttributes.getLayoutDimension(index, c0372j.f4075b));
                        break;
                    case 24:
                        i3 = indexCount;
                        obj.b(24, obtainStyledAttributes.getDimensionPixelSize(index, c0372j.f4053F));
                        break;
                    case 27:
                        i3 = indexCount;
                        obj.b(27, obtainStyledAttributes.getInt(index, c0372j.f4052E));
                        break;
                    case 28:
                        i3 = indexCount;
                        obj.b(28, obtainStyledAttributes.getDimensionPixelSize(index, c0372j.G));
                        break;
                    case 31:
                        i3 = indexCount;
                        obj.b(31, obtainStyledAttributes.getDimensionPixelSize(index, c0372j.f4057K));
                        break;
                    case 34:
                        i3 = indexCount;
                        obj.b(34, obtainStyledAttributes.getDimensionPixelSize(index, c0372j.f4054H));
                        break;
                    case 37:
                        i3 = indexCount;
                        obj.a(37, obtainStyledAttributes.getFloat(index, c0372j.f4107x));
                        break;
                    case 38:
                        i3 = indexCount;
                        int resourceId = obtainStyledAttributes.getResourceId(index, c0371i.f4042a);
                        c0371i.f4042a = resourceId;
                        obj.b(38, resourceId);
                        break;
                    case 39:
                        i3 = indexCount;
                        obj.a(39, obtainStyledAttributes.getFloat(index, c0372j.f4067U));
                        break;
                    case 40:
                        i3 = indexCount;
                        obj.a(40, obtainStyledAttributes.getFloat(index, c0372j.f4066T));
                        break;
                    case 41:
                        i3 = indexCount;
                        obj.b(41, obtainStyledAttributes.getInt(index, c0372j.f4068V));
                        break;
                    case 42:
                        i3 = indexCount;
                        obj.b(42, obtainStyledAttributes.getInt(index, c0372j.f4069W));
                        break;
                    case 43:
                        i3 = indexCount;
                        obj.a(43, obtainStyledAttributes.getFloat(index, lVar.f4119c));
                        break;
                    case 44:
                        i3 = indexCount;
                        obj.c(44, true);
                        obj.a(44, obtainStyledAttributes.getDimension(index, mVar.f4130m));
                        break;
                    case 45:
                        i3 = indexCount;
                        obj.a(45, obtainStyledAttributes.getFloat(index, mVar.f4122b));
                        break;
                    case 46:
                        i3 = indexCount;
                        obj.a(46, obtainStyledAttributes.getFloat(index, mVar.f4123c));
                        break;
                    case 47:
                        i3 = indexCount;
                        obj.a(47, obtainStyledAttributes.getFloat(index, mVar.d));
                        break;
                    case 48:
                        i3 = indexCount;
                        obj.a(48, obtainStyledAttributes.getFloat(index, mVar.f4124e));
                        break;
                    case 49:
                        i3 = indexCount;
                        obj.a(49, obtainStyledAttributes.getDimension(index, mVar.f4125f));
                        break;
                    case 50:
                        i3 = indexCount;
                        obj.a(50, obtainStyledAttributes.getDimension(index, mVar.f4126g));
                        break;
                    case 51:
                        i3 = indexCount;
                        obj.a(51, obtainStyledAttributes.getDimension(index, mVar.i));
                        break;
                    case 52:
                        i3 = indexCount;
                        obj.a(52, obtainStyledAttributes.getDimension(index, mVar.f4127j));
                        break;
                    case 53:
                        i3 = indexCount;
                        obj.a(53, obtainStyledAttributes.getDimension(index, mVar.f4128k));
                        break;
                    case 54:
                        i3 = indexCount;
                        obj.b(54, obtainStyledAttributes.getInt(index, c0372j.f4070X));
                        break;
                    case 55:
                        i3 = indexCount;
                        obj.b(55, obtainStyledAttributes.getInt(index, c0372j.f4071Y));
                        break;
                    case 56:
                        i3 = indexCount;
                        obj.b(56, obtainStyledAttributes.getDimensionPixelSize(index, c0372j.f4072Z));
                        break;
                    case 57:
                        i3 = indexCount;
                        obj.b(57, obtainStyledAttributes.getDimensionPixelSize(index, c0372j.f4074a0));
                        break;
                    case 58:
                        i3 = indexCount;
                        obj.b(58, obtainStyledAttributes.getDimensionPixelSize(index, c0372j.b0));
                        break;
                    case 59:
                        i3 = indexCount;
                        obj.b(59, obtainStyledAttributes.getDimensionPixelSize(index, c0372j.f4077c0));
                        break;
                    case 60:
                        i3 = indexCount;
                        obj.a(60, obtainStyledAttributes.getFloat(index, mVar.f4121a));
                        break;
                    case 62:
                        i3 = indexCount;
                        obj.b(62, obtainStyledAttributes.getDimensionPixelSize(index, c0372j.f4048A));
                        break;
                    case 63:
                        i3 = indexCount;
                        obj.a(63, obtainStyledAttributes.getFloat(index, c0372j.f4049B));
                        break;
                    case 64:
                        i3 = indexCount;
                        obj.b(64, f(obtainStyledAttributes, index, kVar.f4111a));
                        break;
                    case 65:
                        i3 = indexCount;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obj.d(obtainStyledAttributes.getString(index), 65);
                        } else {
                            obj.d(strArr[obtainStyledAttributes.getInteger(index, 0)], 65);
                        }
                        break;
                    case 66:
                        i3 = indexCount;
                        obj.b(66, obtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        i3 = indexCount;
                        obj.a(67, obtainStyledAttributes.getFloat(index, kVar.f4114e));
                        break;
                    case 68:
                        i3 = indexCount;
                        obj.a(68, obtainStyledAttributes.getFloat(index, lVar.d));
                        break;
                    case 69:
                        i3 = indexCount;
                        obj.a(69, obtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 70:
                        i3 = indexCount;
                        obj.a(70, obtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 71:
                        i3 = indexCount;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i3 = indexCount;
                        obj.b(72, obtainStyledAttributes.getInt(index, c0372j.f4082f0));
                        break;
                    case 73:
                        i3 = indexCount;
                        obj.b(73, obtainStyledAttributes.getDimensionPixelSize(index, c0372j.f4084g0));
                        break;
                    case 74:
                        i3 = indexCount;
                        obj.d(obtainStyledAttributes.getString(index), 74);
                        break;
                    case 75:
                        i3 = indexCount;
                        obj.c(75, obtainStyledAttributes.getBoolean(index, c0372j.f4096n0));
                        break;
                    case 76:
                        i3 = indexCount;
                        obj.b(76, obtainStyledAttributes.getInt(index, kVar.f4113c));
                        break;
                    case 77:
                        i3 = indexCount;
                        obj.d(obtainStyledAttributes.getString(index), 77);
                        break;
                    case 78:
                        i3 = indexCount;
                        obj.b(78, obtainStyledAttributes.getInt(index, lVar.f4118b));
                        break;
                    case 79:
                        i3 = indexCount;
                        obj.a(79, obtainStyledAttributes.getFloat(index, kVar.d));
                        break;
                    case 80:
                        i3 = indexCount;
                        obj.c(80, obtainStyledAttributes.getBoolean(index, c0372j.f4092l0));
                        break;
                    case 81:
                        i3 = indexCount;
                        obj.c(81, obtainStyledAttributes.getBoolean(index, c0372j.f4094m0));
                        break;
                    case 82:
                        i3 = indexCount;
                        obj.b(82, obtainStyledAttributes.getInteger(index, kVar.f4112b));
                        break;
                    case 83:
                        i3 = indexCount;
                        obj.b(83, f(obtainStyledAttributes, index, mVar.h));
                        break;
                    case 84:
                        i3 = indexCount;
                        obj.b(84, obtainStyledAttributes.getInteger(index, kVar.f4116g));
                        break;
                    case 85:
                        i3 = indexCount;
                        obj.a(85, obtainStyledAttributes.getFloat(index, kVar.f4115f));
                        break;
                    case 86:
                        i3 = indexCount;
                        int i6 = obtainStyledAttributes.peekValue(index).type;
                        if (i6 == 1) {
                            int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                            kVar.i = resourceId2;
                            obj.b(89, resourceId2);
                            if (kVar.i != -1) {
                                obj.b(88, -2);
                            }
                        } else if (i6 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            kVar.h = string;
                            obj.d(string, 90);
                            if (kVar.h.indexOf("/") > 0) {
                                int resourceId3 = obtainStyledAttributes.getResourceId(index, -1);
                                kVar.i = resourceId3;
                                obj.b(89, resourceId3);
                                obj.b(88, -2);
                            } else {
                                obj.b(88, -1);
                            }
                        } else {
                            obj.b(88, obtainStyledAttributes.getInteger(index, kVar.i));
                        }
                        break;
                    case 87:
                        i3 = indexCount;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 93:
                        i3 = indexCount;
                        obj.b(93, obtainStyledAttributes.getDimensionPixelSize(index, c0372j.f4058L));
                        break;
                    case 94:
                        i3 = indexCount;
                        obj.b(94, obtainStyledAttributes.getDimensionPixelSize(index, c0372j.f4065S));
                        break;
                    case 95:
                        i3 = indexCount;
                        g(obj, obtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        i3 = indexCount;
                        g(obj, obtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        i3 = indexCount;
                        obj.b(97, obtainStyledAttributes.getInt(index, c0372j.f4098o0));
                        break;
                    case 98:
                        i3 = indexCount;
                        int i7 = AbstractC0362a.f3945q;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obtainStyledAttributes.getString(index);
                        } else {
                            c0371i.f4042a = obtainStyledAttributes.getResourceId(index, c0371i.f4042a);
                        }
                        break;
                    case 99:
                        i3 = indexCount;
                        obj.c(99, obtainStyledAttributes.getBoolean(index, c0372j.f4083g));
                        break;
                }
                i4 = i5 + 1;
            }
        } else {
            String str4 = "CURRENTLY UNSUPPORTED";
            int i8 = 1;
            int i9 = 0;
            for (int indexCount2 = obtainStyledAttributes.getIndexCount(); i9 < indexCount2; indexCount2 = i) {
                int index2 = obtainStyledAttributes.getIndex(i9);
                if (index2 != i8 && 23 != index2) {
                    if (24 != index2) {
                        kVar.getClass();
                        c0372j.getClass();
                        mVar.getClass();
                    }
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        c0372j.f4099p = f(obtainStyledAttributes, index2, c0372j.f4099p);
                        i2 = 1;
                        break;
                    case 2:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        c0372j.f4055I = obtainStyledAttributes.getDimensionPixelSize(index2, c0372j.f4055I);
                        i2 = 1;
                        break;
                    case 3:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        c0372j.f4097o = f(obtainStyledAttributes, index2, c0372j.f4097o);
                        i2 = 1;
                        break;
                    case Platform.INFO /* 4 */:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        c0372j.f4095n = f(obtainStyledAttributes, index2, c0372j.f4095n);
                        i2 = 1;
                        break;
                    case Platform.WARN /* 5 */:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        c0372j.f4108y = obtainStyledAttributes.getString(index2);
                        i2 = 1;
                        break;
                    case 6:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        c0372j.f4050C = obtainStyledAttributes.getDimensionPixelOffset(index2, c0372j.f4050C);
                        i2 = 1;
                        break;
                    case 7:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        c0372j.f4051D = obtainStyledAttributes.getDimensionPixelOffset(index2, c0372j.f4051D);
                        i2 = 1;
                        break;
                    case 8:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        c0372j.f4056J = obtainStyledAttributes.getDimensionPixelSize(index2, c0372j.f4056J);
                        i2 = 1;
                        break;
                    case 9:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        c0372j.f4105v = f(obtainStyledAttributes, index2, c0372j.f4105v);
                        i2 = 1;
                        break;
                    case 10:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        c0372j.f4104u = f(obtainStyledAttributes, index2, c0372j.f4104u);
                        i2 = 1;
                        break;
                    case 11:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        c0372j.f4062P = obtainStyledAttributes.getDimensionPixelSize(index2, c0372j.f4062P);
                        i2 = 1;
                        break;
                    case 12:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        c0372j.f4063Q = obtainStyledAttributes.getDimensionPixelSize(index2, c0372j.f4063Q);
                        i2 = 1;
                        break;
                    case 13:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        c0372j.f4059M = obtainStyledAttributes.getDimensionPixelSize(index2, c0372j.f4059M);
                        i2 = 1;
                        break;
                    case 14:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        c0372j.f4061O = obtainStyledAttributes.getDimensionPixelSize(index2, c0372j.f4061O);
                        i2 = 1;
                        break;
                    case 15:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        c0372j.f4064R = obtainStyledAttributes.getDimensionPixelSize(index2, c0372j.f4064R);
                        i2 = 1;
                        break;
                    case 16:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        c0372j.f4060N = obtainStyledAttributes.getDimensionPixelSize(index2, c0372j.f4060N);
                        i2 = 1;
                        break;
                    case 17:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        c0372j.d = obtainStyledAttributes.getDimensionPixelOffset(index2, c0372j.d);
                        i2 = 1;
                        break;
                    case 18:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        c0372j.f4079e = obtainStyledAttributes.getDimensionPixelOffset(index2, c0372j.f4079e);
                        i2 = 1;
                        break;
                    case 19:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        c0372j.f4081f = obtainStyledAttributes.getFloat(index2, c0372j.f4081f);
                        i2 = 1;
                        break;
                    case 20:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        c0372j.f4106w = obtainStyledAttributes.getFloat(index2, c0372j.f4106w);
                        i2 = 1;
                        break;
                    case 21:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        c0372j.f4076c = obtainStyledAttributes.getLayoutDimension(index2, c0372j.f4076c);
                        i2 = 1;
                        break;
                    case 22:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        int i10 = obtainStyledAttributes.getInt(index2, lVar.f4117a);
                        lVar.f4117a = i10;
                        lVar.f4117a = iArr[i10];
                        i2 = 1;
                        break;
                    case 23:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        c0372j.f4075b = obtainStyledAttributes.getLayoutDimension(index2, c0372j.f4075b);
                        i2 = 1;
                        break;
                    case 24:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        c0372j.f4053F = obtainStyledAttributes.getDimensionPixelSize(index2, c0372j.f4053F);
                        i2 = 1;
                        break;
                    case 25:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        c0372j.h = f(obtainStyledAttributes, index2, c0372j.h);
                        i2 = 1;
                        break;
                    case 26:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        c0372j.i = f(obtainStyledAttributes, index2, c0372j.i);
                        i2 = 1;
                        break;
                    case 27:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        c0372j.f4052E = obtainStyledAttributes.getInt(index2, c0372j.f4052E);
                        i2 = 1;
                        break;
                    case 28:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        c0372j.G = obtainStyledAttributes.getDimensionPixelSize(index2, c0372j.G);
                        i2 = 1;
                        break;
                    case 29:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        c0372j.f4087j = f(obtainStyledAttributes, index2, c0372j.f4087j);
                        i2 = 1;
                        break;
                    case 30:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        c0372j.f4089k = f(obtainStyledAttributes, index2, c0372j.f4089k);
                        i2 = 1;
                        break;
                    case 31:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        c0372j.f4057K = obtainStyledAttributes.getDimensionPixelSize(index2, c0372j.f4057K);
                        i2 = 1;
                        break;
                    case 32:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        c0372j.f4102s = f(obtainStyledAttributes, index2, c0372j.f4102s);
                        i2 = 1;
                        break;
                    case 33:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        c0372j.f4103t = f(obtainStyledAttributes, index2, c0372j.f4103t);
                        i2 = 1;
                        break;
                    case 34:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        c0372j.f4054H = obtainStyledAttributes.getDimensionPixelSize(index2, c0372j.f4054H);
                        i2 = 1;
                        break;
                    case 35:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        c0372j.f4093m = f(obtainStyledAttributes, index2, c0372j.f4093m);
                        i2 = 1;
                        break;
                    case 36:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        c0372j.f4091l = f(obtainStyledAttributes, index2, c0372j.f4091l);
                        i2 = 1;
                        break;
                    case 37:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        c0372j.f4107x = obtainStyledAttributes.getFloat(index2, c0372j.f4107x);
                        i2 = 1;
                        break;
                    case 38:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        c0371i.f4042a = obtainStyledAttributes.getResourceId(index2, c0371i.f4042a);
                        i2 = 1;
                        break;
                    case 39:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        c0372j.f4067U = obtainStyledAttributes.getFloat(index2, c0372j.f4067U);
                        i2 = 1;
                        break;
                    case 40:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        c0372j.f4066T = obtainStyledAttributes.getFloat(index2, c0372j.f4066T);
                        i2 = 1;
                        break;
                    case 41:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        c0372j.f4068V = obtainStyledAttributes.getInt(index2, c0372j.f4068V);
                        i2 = 1;
                        break;
                    case 42:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        c0372j.f4069W = obtainStyledAttributes.getInt(index2, c0372j.f4069W);
                        i2 = 1;
                        break;
                    case 43:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        lVar.f4119c = obtainStyledAttributes.getFloat(index2, lVar.f4119c);
                        i2 = 1;
                        break;
                    case 44:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        mVar.f4129l = true;
                        mVar.f4130m = obtainStyledAttributes.getDimension(index2, mVar.f4130m);
                        i2 = 1;
                        break;
                    case 45:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        mVar.f4122b = obtainStyledAttributes.getFloat(index2, mVar.f4122b);
                        i2 = 1;
                        break;
                    case 46:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        mVar.f4123c = obtainStyledAttributes.getFloat(index2, mVar.f4123c);
                        i2 = 1;
                        break;
                    case 47:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        mVar.d = obtainStyledAttributes.getFloat(index2, mVar.d);
                        i2 = 1;
                        break;
                    case 48:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        mVar.f4124e = obtainStyledAttributes.getFloat(index2, mVar.f4124e);
                        i2 = 1;
                        break;
                    case 49:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        mVar.f4125f = obtainStyledAttributes.getDimension(index2, mVar.f4125f);
                        i2 = 1;
                        break;
                    case 50:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        mVar.f4126g = obtainStyledAttributes.getDimension(index2, mVar.f4126g);
                        i2 = 1;
                        break;
                    case 51:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        mVar.i = obtainStyledAttributes.getDimension(index2, mVar.i);
                        i2 = 1;
                        break;
                    case 52:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        mVar.f4127j = obtainStyledAttributes.getDimension(index2, mVar.f4127j);
                        i2 = 1;
                        break;
                    case 53:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        mVar.f4128k = obtainStyledAttributes.getDimension(index2, mVar.f4128k);
                        i2 = 1;
                        break;
                    case 54:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        c0372j.f4070X = obtainStyledAttributes.getInt(index2, c0372j.f4070X);
                        i2 = 1;
                        break;
                    case 55:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        c0372j.f4071Y = obtainStyledAttributes.getInt(index2, c0372j.f4071Y);
                        i2 = 1;
                        break;
                    case 56:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        c0372j.f4072Z = obtainStyledAttributes.getDimensionPixelSize(index2, c0372j.f4072Z);
                        i2 = 1;
                        break;
                    case 57:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        c0372j.f4074a0 = obtainStyledAttributes.getDimensionPixelSize(index2, c0372j.f4074a0);
                        i2 = 1;
                        break;
                    case 58:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        c0372j.b0 = obtainStyledAttributes.getDimensionPixelSize(index2, c0372j.b0);
                        i2 = 1;
                        break;
                    case 59:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        c0372j.f4077c0 = obtainStyledAttributes.getDimensionPixelSize(index2, c0372j.f4077c0);
                        i2 = 1;
                        break;
                    case 60:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        mVar.f4121a = obtainStyledAttributes.getFloat(index2, mVar.f4121a);
                        i2 = 1;
                        break;
                    case 61:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        c0372j.f4109z = f(obtainStyledAttributes, index2, c0372j.f4109z);
                        i2 = 1;
                        break;
                    case 62:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        c0372j.f4048A = obtainStyledAttributes.getDimensionPixelSize(index2, c0372j.f4048A);
                        i2 = 1;
                        break;
                    case 63:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        c0372j.f4049B = obtainStyledAttributes.getFloat(index2, c0372j.f4049B);
                        i2 = 1;
                        break;
                    case 64:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        kVar.f4111a = f(obtainStyledAttributes, index2, kVar.f4111a);
                        i2 = 1;
                        break;
                    case 65:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        if (obtainStyledAttributes.peekValue(index2).type == 3) {
                            obtainStyledAttributes.getString(index2);
                            kVar.getClass();
                            i2 = 1;
                            break;
                        } else {
                            String str5 = strArr[obtainStyledAttributes.getInteger(index2, 0)];
                            kVar.getClass();
                            i2 = 1;
                        }
                    case 66:
                        i = indexCount2;
                        str = str4;
                        obtainStyledAttributes.getInt(index2, 0);
                        kVar.getClass();
                        str2 = str3;
                        i2 = 1;
                        break;
                    case 67:
                        i = indexCount2;
                        str = str4;
                        kVar.f4114e = obtainStyledAttributes.getFloat(index2, kVar.f4114e);
                        str2 = str3;
                        i2 = 1;
                        break;
                    case 68:
                        i = indexCount2;
                        str = str4;
                        lVar.d = obtainStyledAttributes.getFloat(index2, lVar.d);
                        str2 = str3;
                        i2 = 1;
                        break;
                    case 69:
                        i = indexCount2;
                        str = str4;
                        c0372j.f4078d0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        str2 = str3;
                        i2 = 1;
                        break;
                    case 70:
                        i = indexCount2;
                        str = str4;
                        c0372j.f4080e0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        str2 = str3;
                        i2 = 1;
                        break;
                    case 71:
                        i = indexCount2;
                        str = str4;
                        Log.e(str3, str);
                        str2 = str3;
                        i2 = 1;
                        break;
                    case 72:
                        i = indexCount2;
                        c0372j.f4082f0 = obtainStyledAttributes.getInt(index2, c0372j.f4082f0);
                        str = str4;
                        i2 = 1;
                        str2 = str3;
                        break;
                    case 73:
                        i = indexCount2;
                        c0372j.f4084g0 = obtainStyledAttributes.getDimensionPixelSize(index2, c0372j.f4084g0);
                        str = str4;
                        i2 = 1;
                        str2 = str3;
                        break;
                    case 74:
                        i = indexCount2;
                        c0372j.f4088j0 = obtainStyledAttributes.getString(index2);
                        str = str4;
                        i2 = 1;
                        str2 = str3;
                        break;
                    case 75:
                        i = indexCount2;
                        c0372j.f4096n0 = obtainStyledAttributes.getBoolean(index2, c0372j.f4096n0);
                        str = str4;
                        i2 = 1;
                        str2 = str3;
                        break;
                    case 76:
                        i = indexCount2;
                        kVar.f4113c = obtainStyledAttributes.getInt(index2, kVar.f4113c);
                        str = str4;
                        i2 = 1;
                        str2 = str3;
                        break;
                    case 77:
                        i = indexCount2;
                        c0372j.f4090k0 = obtainStyledAttributes.getString(index2);
                        str = str4;
                        i2 = 1;
                        str2 = str3;
                        break;
                    case 78:
                        i = indexCount2;
                        lVar.f4118b = obtainStyledAttributes.getInt(index2, lVar.f4118b);
                        str = str4;
                        i2 = 1;
                        str2 = str3;
                        break;
                    case 79:
                        i = indexCount2;
                        kVar.d = obtainStyledAttributes.getFloat(index2, kVar.d);
                        str = str4;
                        i2 = 1;
                        str2 = str3;
                        break;
                    case 80:
                        i = indexCount2;
                        c0372j.f4092l0 = obtainStyledAttributes.getBoolean(index2, c0372j.f4092l0);
                        str = str4;
                        i2 = 1;
                        str2 = str3;
                        break;
                    case 81:
                        i = indexCount2;
                        c0372j.f4094m0 = obtainStyledAttributes.getBoolean(index2, c0372j.f4094m0);
                        str = str4;
                        i2 = 1;
                        str2 = str3;
                        break;
                    case 82:
                        i = indexCount2;
                        kVar.f4112b = obtainStyledAttributes.getInteger(index2, kVar.f4112b);
                        str = str4;
                        i2 = 1;
                        str2 = str3;
                        break;
                    case 83:
                        i = indexCount2;
                        mVar.h = f(obtainStyledAttributes, index2, mVar.h);
                        str = str4;
                        i2 = 1;
                        str2 = str3;
                        break;
                    case 84:
                        i = indexCount2;
                        kVar.f4116g = obtainStyledAttributes.getInteger(index2, kVar.f4116g);
                        str = str4;
                        i2 = 1;
                        str2 = str3;
                        break;
                    case 85:
                        i = indexCount2;
                        kVar.f4115f = obtainStyledAttributes.getFloat(index2, kVar.f4115f);
                        str = str4;
                        i2 = 1;
                        str2 = str3;
                        break;
                    case 86:
                        i = indexCount2;
                        int i11 = obtainStyledAttributes.peekValue(index2).type;
                        if (i11 == 1) {
                            kVar.i = obtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i11 == 3) {
                            String string2 = obtainStyledAttributes.getString(index2);
                            kVar.h = string2;
                            if (string2.indexOf("/") > 0) {
                                kVar.i = obtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            obtainStyledAttributes.getInteger(index2, kVar.i);
                        }
                        str = str4;
                        i2 = 1;
                        str2 = str3;
                        break;
                    case 87:
                        i = indexCount2;
                        Log.w(str3, "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        str = str4;
                        i2 = 1;
                        str2 = str3;
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        StringBuilder sb2 = new StringBuilder("Unknown attribute 0x");
                        i = indexCount2;
                        sb2.append(Integer.toHexString(index2));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index2));
                        Log.w(str3, sb2.toString());
                        str = str4;
                        i2 = 1;
                        str2 = str3;
                        break;
                    case 91:
                        i = indexCount2;
                        c0372j.f4100q = f(obtainStyledAttributes, index2, c0372j.f4100q);
                        str = str4;
                        i2 = 1;
                        str2 = str3;
                        break;
                    case 92:
                        i = indexCount2;
                        c0372j.f4101r = f(obtainStyledAttributes, index2, c0372j.f4101r);
                        str = str4;
                        i2 = 1;
                        str2 = str3;
                        break;
                    case 93:
                        i = indexCount2;
                        c0372j.f4058L = obtainStyledAttributes.getDimensionPixelSize(index2, c0372j.f4058L);
                        str = str4;
                        i2 = 1;
                        str2 = str3;
                        break;
                    case 94:
                        i = indexCount2;
                        c0372j.f4065S = obtainStyledAttributes.getDimensionPixelSize(index2, c0372j.f4065S);
                        str = str4;
                        i2 = 1;
                        str2 = str3;
                        break;
                    case 95:
                        i = indexCount2;
                        g(c0372j, obtainStyledAttributes, index2, 0);
                        str = str4;
                        i2 = 1;
                        str2 = str3;
                        break;
                    case 96:
                        i = indexCount2;
                        g(c0372j, obtainStyledAttributes, index2, 1);
                        i2 = 1;
                        str = str4;
                        str2 = str3;
                        break;
                    case 97:
                        i = indexCount2;
                        c0372j.f4098o0 = obtainStyledAttributes.getInt(index2, c0372j.f4098o0);
                        str = str4;
                        i2 = 1;
                        str2 = str3;
                        break;
                }
                i9++;
                i8 = i2;
                str3 = str2;
                str4 = str;
            }
            if (c0372j.f4088j0 != null) {
                c0372j.f4086i0 = null;
            }
        }
        obtainStyledAttributes.recycle();
        return c0371i;
    }

    public static int f(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void g(java.lang.Object r7, android.content.res.TypedArray r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w.n.g(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void h(C0367e c0367e, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            char c2 = 65535;
            int i = 0;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase("W")) {
                    c2 = 0;
                } else if (substring.equalsIgnoreCase("H")) {
                    c2 = 1;
                }
                i = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 < 0 || indexOf2 >= length - 1) {
                    String substring2 = str.substring(i);
                    if (substring2.length() > 0) {
                        Float.parseFloat(substring2);
                    }
                } else {
                    String substring3 = str.substring(i, indexOf2);
                    String substring4 = str.substring(indexOf2 + 1);
                    if (substring3.length() > 0 && substring4.length() > 0) {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            if (c2 == 1) {
                                Math.abs(parseFloat2 / parseFloat);
                            } else {
                                Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        c0367e.G = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:44:0x010e. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [android.view.View, w.a, w.c] */
    /* JADX WARN: Type inference failed for: r9v1, types: [t.a, t.i] */
    public final void a(ConstraintLayout constraintLayout) {
        HashSet hashSet;
        int i;
        HashSet hashSet2;
        String str;
        int i2;
        String str2;
        n nVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = nVar.f4135c;
        HashSet hashSet3 = new HashSet(hashMap.keySet());
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = constraintLayout.getChildAt(i3);
            int id = childAt.getId();
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder("id unknown ");
                try {
                    str2 = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    str2 = "UNKNOWN";
                }
                sb.append(str2);
                Log.w("ConstraintSet", sb.toString());
            } else {
                if (nVar.f4134b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (hashMap.containsKey(Integer.valueOf(id))) {
                        hashSet3.remove(Integer.valueOf(id));
                        C0371i c0371i = (C0371i) hashMap.get(Integer.valueOf(id));
                        if (c0371i != null) {
                            if (childAt instanceof C0363a) {
                                C0372j c0372j = c0371i.d;
                                c0372j.f4085h0 = 1;
                                C0363a c0363a = (C0363a) childAt;
                                c0363a.setId(id);
                                c0363a.setType(c0372j.f4082f0);
                                c0363a.setMargin(c0372j.f4084g0);
                                c0363a.setAllowsGoneWidget(c0372j.f4096n0);
                                int[] iArr = c0372j.f4086i0;
                                if (iArr != null) {
                                    c0363a.setReferencedIds(iArr);
                                } else {
                                    String str3 = c0372j.f4088j0;
                                    if (str3 != null) {
                                        int[] c2 = c(c0363a, str3);
                                        c0372j.f4086i0 = c2;
                                        c0363a.setReferencedIds(c2);
                                    }
                                }
                            }
                            C0367e c0367e = (C0367e) childAt.getLayoutParams();
                            c0367e.a();
                            c0371i.a(c0367e);
                            HashMap hashMap2 = c0371i.f4046f;
                            Class<?> cls = childAt.getClass();
                            for (String str4 : hashMap2.keySet()) {
                                C0364b c0364b = (C0364b) hashMap2.get(str4);
                                if (c0364b.f3947a) {
                                    hashSet2 = hashSet3;
                                    str = str4;
                                } else {
                                    hashSet2 = hashSet3;
                                    str = "set" + str4;
                                }
                                try {
                                    int a2 = AbstractC0319e.a(c0364b.f3948b);
                                    Class cls2 = Float.TYPE;
                                    Class cls3 = Integer.TYPE;
                                    switch (a2) {
                                        case 0:
                                            i2 = i3;
                                            cls.getMethod(str, cls3).invoke(childAt, Integer.valueOf(c0364b.f3949c));
                                            break;
                                        case 1:
                                            i2 = i3;
                                            cls.getMethod(str, cls2).invoke(childAt, Float.valueOf(c0364b.d));
                                            break;
                                        case 2:
                                            i2 = i3;
                                            cls.getMethod(str, cls3).invoke(childAt, Integer.valueOf(c0364b.f3952g));
                                            break;
                                        case 3:
                                            Method method = cls.getMethod(str, Drawable.class);
                                            i2 = i3;
                                            try {
                                                ColorDrawable colorDrawable = new ColorDrawable();
                                                colorDrawable.setColor(c0364b.f3952g);
                                                method.invoke(childAt, colorDrawable);
                                            } catch (IllegalAccessException e2) {
                                                e = e2;
                                                StringBuilder e3 = D.f.e(" Custom Attribute \"", str4, "\" not found on ");
                                                e3.append(cls.getName());
                                                Log.e("TransitionLayout", e3.toString(), e);
                                                hashSet3 = hashSet2;
                                                i3 = i2;
                                            } catch (NoSuchMethodException e4) {
                                                e = e4;
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e);
                                                hashSet3 = hashSet2;
                                                i3 = i2;
                                            } catch (InvocationTargetException e5) {
                                                e = e5;
                                                StringBuilder e6 = D.f.e(" Custom Attribute \"", str4, "\" not found on ");
                                                e6.append(cls.getName());
                                                Log.e("TransitionLayout", e6.toString(), e);
                                                hashSet3 = hashSet2;
                                                i3 = i2;
                                            }
                                        case Platform.INFO /* 4 */:
                                            cls.getMethod(str, CharSequence.class).invoke(childAt, c0364b.f3950e);
                                            i2 = i3;
                                            break;
                                        case Platform.WARN /* 5 */:
                                            cls.getMethod(str, Boolean.TYPE).invoke(childAt, Boolean.valueOf(c0364b.f3951f));
                                            i2 = i3;
                                            break;
                                        case 6:
                                            cls.getMethod(str, cls2).invoke(childAt, Float.valueOf(c0364b.d));
                                            i2 = i3;
                                            break;
                                        case 7:
                                            cls.getMethod(str, cls3).invoke(childAt, Integer.valueOf(c0364b.f3949c));
                                            i2 = i3;
                                            break;
                                        default:
                                            i2 = i3;
                                            break;
                                    }
                                } catch (IllegalAccessException e7) {
                                    e = e7;
                                    i2 = i3;
                                } catch (NoSuchMethodException e8) {
                                    e = e8;
                                    i2 = i3;
                                } catch (InvocationTargetException e9) {
                                    e = e9;
                                    i2 = i3;
                                }
                                hashSet3 = hashSet2;
                                i3 = i2;
                            }
                            hashSet = hashSet3;
                            i = i3;
                            childAt.setLayoutParams(c0367e);
                            l lVar = c0371i.f4043b;
                            if (lVar.f4118b == 0) {
                                childAt.setVisibility(lVar.f4117a);
                            }
                            childAt.setAlpha(lVar.f4119c);
                            m mVar = c0371i.f4045e;
                            childAt.setRotation(mVar.f4121a);
                            childAt.setRotationX(mVar.f4122b);
                            childAt.setRotationY(mVar.f4123c);
                            childAt.setScaleX(mVar.d);
                            childAt.setScaleY(mVar.f4124e);
                            if (mVar.h != -1) {
                                if (((View) childAt.getParent()).findViewById(mVar.h) != null) {
                                    float bottom = (r1.getBottom() + r1.getTop()) / 2.0f;
                                    float right = (r1.getRight() + r1.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(mVar.f4125f)) {
                                    childAt.setPivotX(mVar.f4125f);
                                }
                                if (!Float.isNaN(mVar.f4126g)) {
                                    childAt.setPivotY(mVar.f4126g);
                                }
                            }
                            childAt.setTranslationX(mVar.i);
                            childAt.setTranslationY(mVar.f4127j);
                            childAt.setTranslationZ(mVar.f4128k);
                            if (mVar.f4129l) {
                                childAt.setElevation(mVar.f4130m);
                            }
                        }
                    } else {
                        hashSet = hashSet3;
                        i = i3;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                    i3 = i + 1;
                    nVar = this;
                    hashSet3 = hashSet;
                }
            }
            hashSet = hashSet3;
            i = i3;
            i3 = i + 1;
            nVar = this;
            hashSet3 = hashSet;
        }
        Iterator it = hashSet3.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C0371i c0371i2 = (C0371i) hashMap.get(num);
            if (c0371i2 != null) {
                C0372j c0372j2 = c0371i2.d;
                if (c0372j2.f4085h0 == 1) {
                    Context context = constraintLayout.getContext();
                    ?? view = new View(context);
                    view.f3953a = new int[32];
                    view.f3958g = new HashMap();
                    view.f3955c = context;
                    ?? iVar = new t.i();
                    iVar.f3666s0 = 0;
                    iVar.f3667t0 = true;
                    iVar.f3668u0 = 0;
                    iVar.v0 = false;
                    view.f3946j = iVar;
                    view.d = iVar;
                    view.i();
                    view.setVisibility(8);
                    view.setId(num.intValue());
                    int[] iArr2 = c0372j2.f4086i0;
                    if (iArr2 != null) {
                        view.setReferencedIds(iArr2);
                    } else {
                        String str5 = c0372j2.f4088j0;
                        if (str5 != null) {
                            int[] c3 = c(view, str5);
                            c0372j2.f4086i0 = c3;
                            view.setReferencedIds(c3);
                        }
                    }
                    view.setType(c0372j2.f4082f0);
                    view.setMargin(c0372j2.f4084g0);
                    C0367e g2 = ConstraintLayout.g();
                    view.i();
                    c0371i2.a(g2);
                    constraintLayout.addView((View) view, g2);
                }
                if (c0372j2.f4073a) {
                    p pVar = new p(constraintLayout.getContext());
                    pVar.setId(num.intValue());
                    C0367e g3 = ConstraintLayout.g();
                    c0371i2.a(g3);
                    constraintLayout.addView(pVar, g3);
                }
            }
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = constraintLayout.getChildAt(i4);
            if (childAt2 instanceof AbstractC0365c) {
                ((AbstractC0365c) childAt2).e(constraintLayout);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        int i;
        HashMap hashMap;
        int i2;
        HashMap hashMap2;
        int i3;
        n nVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap3 = nVar.f4135c;
        hashMap3.clear();
        int i4 = 0;
        while (i4 < childCount) {
            View childAt = constraintLayout.getChildAt(i4);
            C0367e c0367e = (C0367e) childAt.getLayoutParams();
            int id = childAt.getId();
            if (nVar.f4134b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap3.containsKey(Integer.valueOf(id))) {
                hashMap3.put(Integer.valueOf(id), new C0371i());
            }
            C0371i c0371i = (C0371i) hashMap3.get(Integer.valueOf(id));
            if (c0371i == null) {
                i = childCount;
                hashMap = hashMap3;
                i2 = i4;
            } else {
                HashMap hashMap4 = nVar.f4133a;
                HashMap hashMap5 = new HashMap();
                Class<?> cls = childAt.getClass();
                for (String str : hashMap4.keySet()) {
                    C0364b c0364b = (C0364b) hashMap4.get(str);
                    int i5 = childCount;
                    try {
                        if (str.equals("BackgroundColor")) {
                            hashMap2 = hashMap3;
                            try {
                                hashMap5.put(str, new C0364b(c0364b, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                                i3 = i4;
                            } catch (IllegalAccessException e2) {
                                e = e2;
                                i3 = i4;
                                StringBuilder e3 = D.f.e(" Custom Attribute \"", str, "\" not found on ");
                                e3.append(cls.getName());
                                Log.e("TransitionLayout", e3.toString(), e);
                                i4 = i3;
                                childCount = i5;
                                hashMap3 = hashMap2;
                            } catch (NoSuchMethodException e4) {
                                e = e4;
                                i3 = i4;
                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e);
                                i4 = i3;
                                childCount = i5;
                                hashMap3 = hashMap2;
                            } catch (InvocationTargetException e5) {
                                e = e5;
                                i3 = i4;
                                StringBuilder e6 = D.f.e(" Custom Attribute \"", str, "\" not found on ");
                                e6.append(cls.getName());
                                Log.e("TransitionLayout", e6.toString(), e);
                                i4 = i3;
                                childCount = i5;
                                hashMap3 = hashMap2;
                            }
                        } else {
                            hashMap2 = hashMap3;
                            i3 = i4;
                            try {
                                hashMap5.put(str, new C0364b(c0364b, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0])));
                            } catch (IllegalAccessException e7) {
                                e = e7;
                                StringBuilder e32 = D.f.e(" Custom Attribute \"", str, "\" not found on ");
                                e32.append(cls.getName());
                                Log.e("TransitionLayout", e32.toString(), e);
                                i4 = i3;
                                childCount = i5;
                                hashMap3 = hashMap2;
                            } catch (NoSuchMethodException e8) {
                                e = e8;
                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e);
                                i4 = i3;
                                childCount = i5;
                                hashMap3 = hashMap2;
                            } catch (InvocationTargetException e9) {
                                e = e9;
                                StringBuilder e62 = D.f.e(" Custom Attribute \"", str, "\" not found on ");
                                e62.append(cls.getName());
                                Log.e("TransitionLayout", e62.toString(), e);
                                i4 = i3;
                                childCount = i5;
                                hashMap3 = hashMap2;
                            }
                        }
                    } catch (IllegalAccessException e10) {
                        e = e10;
                        hashMap2 = hashMap3;
                    } catch (NoSuchMethodException e11) {
                        e = e11;
                        hashMap2 = hashMap3;
                    } catch (InvocationTargetException e12) {
                        e = e12;
                        hashMap2 = hashMap3;
                    }
                    i4 = i3;
                    childCount = i5;
                    hashMap3 = hashMap2;
                }
                i = childCount;
                hashMap = hashMap3;
                i2 = i4;
                c0371i.f4046f = hashMap5;
                c0371i.f4042a = id;
                int i6 = c0367e.f3991e;
                C0372j c0372j = c0371i.d;
                c0372j.h = i6;
                c0372j.i = c0367e.f3993f;
                c0372j.f4087j = c0367e.f3995g;
                c0372j.f4089k = c0367e.h;
                c0372j.f4091l = c0367e.i;
                c0372j.f4093m = c0367e.f3999j;
                c0372j.f4095n = c0367e.f4001k;
                c0372j.f4097o = c0367e.f4003l;
                c0372j.f4099p = c0367e.f4005m;
                c0372j.f4100q = c0367e.f4007n;
                c0372j.f4101r = c0367e.f4009o;
                c0372j.f4102s = c0367e.f4015s;
                c0372j.f4103t = c0367e.f4016t;
                c0372j.f4104u = c0367e.f4017u;
                c0372j.f4105v = c0367e.f4018v;
                c0372j.f4106w = c0367e.f3964E;
                c0372j.f4107x = c0367e.f3965F;
                c0372j.f4108y = c0367e.G;
                c0372j.f4109z = c0367e.f4011p;
                c0372j.f4048A = c0367e.f4013q;
                c0372j.f4049B = c0367e.f4014r;
                c0372j.f4050C = c0367e.f3978T;
                c0372j.f4051D = c0367e.f3979U;
                c0372j.f4052E = c0367e.f3980V;
                c0372j.f4081f = c0367e.f3988c;
                c0372j.d = c0367e.f3985a;
                c0372j.f4079e = c0367e.f3987b;
                c0372j.f4075b = ((ViewGroup.MarginLayoutParams) c0367e).width;
                c0372j.f4076c = ((ViewGroup.MarginLayoutParams) c0367e).height;
                c0372j.f4053F = ((ViewGroup.MarginLayoutParams) c0367e).leftMargin;
                c0372j.G = ((ViewGroup.MarginLayoutParams) c0367e).rightMargin;
                c0372j.f4054H = ((ViewGroup.MarginLayoutParams) c0367e).topMargin;
                c0372j.f4055I = ((ViewGroup.MarginLayoutParams) c0367e).bottomMargin;
                c0372j.f4058L = c0367e.f3963D;
                c0372j.f4066T = c0367e.f3967I;
                c0372j.f4067U = c0367e.f3966H;
                c0372j.f4069W = c0367e.f3969K;
                c0372j.f4068V = c0367e.f3968J;
                c0372j.f4092l0 = c0367e.f3981W;
                c0372j.f4094m0 = c0367e.f3982X;
                c0372j.f4070X = c0367e.f3970L;
                c0372j.f4071Y = c0367e.f3971M;
                c0372j.f4072Z = c0367e.f3974P;
                c0372j.f4074a0 = c0367e.f3975Q;
                c0372j.b0 = c0367e.f3972N;
                c0372j.f4077c0 = c0367e.f3973O;
                c0372j.f4078d0 = c0367e.f3976R;
                c0372j.f4080e0 = c0367e.f3977S;
                c0372j.f4090k0 = c0367e.f3983Y;
                c0372j.f4060N = c0367e.f4020x;
                c0372j.f4062P = c0367e.f4022z;
                c0372j.f4059M = c0367e.f4019w;
                c0372j.f4061O = c0367e.f4021y;
                c0372j.f4064R = c0367e.f3960A;
                c0372j.f4063Q = c0367e.f3961B;
                c0372j.f4065S = c0367e.f3962C;
                c0372j.f4098o0 = c0367e.f3984Z;
                c0372j.f4056J = c0367e.getMarginEnd();
                c0372j.f4057K = c0367e.getMarginStart();
                int visibility = childAt.getVisibility();
                l lVar = c0371i.f4043b;
                lVar.f4117a = visibility;
                lVar.f4119c = childAt.getAlpha();
                float rotation = childAt.getRotation();
                m mVar = c0371i.f4045e;
                mVar.f4121a = rotation;
                mVar.f4122b = childAt.getRotationX();
                mVar.f4123c = childAt.getRotationY();
                mVar.d = childAt.getScaleX();
                mVar.f4124e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    mVar.f4125f = pivotX;
                    mVar.f4126g = pivotY;
                }
                mVar.i = childAt.getTranslationX();
                mVar.f4127j = childAt.getTranslationY();
                mVar.f4128k = childAt.getTranslationZ();
                if (mVar.f4129l) {
                    mVar.f4130m = childAt.getElevation();
                }
                if (childAt instanceof C0363a) {
                    C0363a c0363a = (C0363a) childAt;
                    c0372j.f4096n0 = c0363a.getAllowsGoneWidget();
                    c0372j.f4086i0 = c0363a.getReferencedIds();
                    c0372j.f4082f0 = c0363a.getType();
                    c0372j.f4084g0 = c0363a.getMargin();
                }
            }
            i4 = i2 + 1;
            nVar = this;
            childCount = i;
            hashMap3 = hashMap;
        }
    }

    public final void e(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    C0371i d2 = d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        d2.d.f4073a = true;
                    }
                    this.f4135c.put(Integer.valueOf(d2.f4042a), d2);
                }
            }
        } catch (IOException e2) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e2);
        } catch (XmlPullParserException e3) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e3);
        }
    }
}
