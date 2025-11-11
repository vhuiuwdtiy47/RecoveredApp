package Y;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.android.music.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: Y.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0044k {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f1122a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1123b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1124c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1125e;

    public C0044k(ViewGroup viewGroup) {
        q1.d.e(viewGroup, "container");
        this.f1122a = viewGroup;
        this.f1123b = new ArrayList();
        this.f1124c = new ArrayList();
    }

    public static final C0044k f(ViewGroup viewGroup, S s2) {
        q1.d.e(viewGroup, "container");
        q1.d.e(s2, "fragmentManager");
        q1.d.d(s2.F(), "fragmentManager.specialEffectsControllerFactory");
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof C0044k) {
            return (C0044k) tag;
        }
        C0044k c0044k = new C0044k(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, c0044k);
        return c0044k;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, H.d] */
    public final void a(int i, int i2, Y y2) {
        synchronized (this.f1123b) {
            ?? obj = new Object();
            AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x = y2.f1052c;
            q1.d.d(abstractComponentCallbacksC0056x, "fragmentStateManager.fragment");
            d0 d = d(abstractComponentCallbacksC0056x);
            if (d != null) {
                d.c(i, i2);
                return;
            }
            final d0 d0Var = new d0(i, i2, y2, obj);
            this.f1123b.add(d0Var);
            final int i3 = 0;
            d0Var.d.add(new Runnable(this) { // from class: Y.c0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C0044k f1097b;

                {
                    this.f1097b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i3) {
                        case 0:
                            C0044k c0044k = this.f1097b;
                            q1.d.e(c0044k, "this$0");
                            d0 d0Var2 = d0Var;
                            if (c0044k.f1123b.contains(d0Var2)) {
                                int i4 = d0Var2.f1101a;
                                View view = d0Var2.f1103c.f1167F;
                                q1.d.d(view, "operation.fragment.mView");
                                D.f.a(view, i4);
                                return;
                            }
                            return;
                        default:
                            C0044k c0044k2 = this.f1097b;
                            q1.d.e(c0044k2, "this$0");
                            d0 d0Var3 = d0Var;
                            c0044k2.f1123b.remove(d0Var3);
                            c0044k2.f1124c.remove(d0Var3);
                            return;
                    }
                }
            });
            final int i4 = 1;
            d0Var.d.add(new Runnable(this) { // from class: Y.c0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C0044k f1097b;

                {
                    this.f1097b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i4) {
                        case 0:
                            C0044k c0044k = this.f1097b;
                            q1.d.e(c0044k, "this$0");
                            d0 d0Var2 = d0Var;
                            if (c0044k.f1123b.contains(d0Var2)) {
                                int i42 = d0Var2.f1101a;
                                View view = d0Var2.f1103c.f1167F;
                                q1.d.d(view, "operation.fragment.mView");
                                D.f.a(view, i42);
                                return;
                            }
                            return;
                        default:
                            C0044k c0044k2 = this.f1097b;
                            q1.d.e(c0044k2, "this$0");
                            d0 d0Var3 = d0Var;
                            c0044k2.f1123b.remove(d0Var3);
                            c0044k2.f1124c.remove(d0Var3);
                            return;
                    }
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x022a, code lost:
    
        if (r6 != null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0230, code lost:
    
        r12 = (Y.d0) r4.f1113a;
        r23 = r0;
        r0 = q1.d.a(r13.get(r12), java.lang.Boolean.TRUE);
        r1 = r12.f1103c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0242, code lost:
    
        if (r0 == false) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x026d, code lost:
    
        if (r12.f1101a != 3) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x026f, code lost:
    
        r0 = r3;
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0274, code lost:
    
        if (r3 == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0276, code lost:
    
        r10.remove(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0279, code lost:
    
        r2 = r1.f1167F;
        r15.startViewTransition(r2);
        r1 = r0;
        r20 = r10;
        r1 = r21;
        r6.addListener(new Y.C0042i(r1, r2, r3, r12, r4));
        r6.setTarget(r2);
        r6.start();
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x029c, code lost:
    
        if (Y.S.H(r17) == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x029e, code lost:
    
        android.util.Log.v("FragmentManager", "Animator from operation " + r12 + " has started.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02b2, code lost:
    
        ((H.d) r4.f1114b).a(new Y.C0037d(r6, r12));
        r0 = r23;
        r6 = r17;
        r3 = r1;
        r10 = r20;
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0272, code lost:
    
        r0 = r3;
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0248, code lost:
    
        if (Y.S.H(r17) == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x024a, code lost:
    
        android.util.Log.v("FragmentManager", "Ignoring Animator set on " + r1 + " as this Fragment was involved in a Transition.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0260, code lost:
    
        r4.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0263, code lost:
    
        r1 = r21;
        r0 = r23;
        r6 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x022c, code lost:
    
        r3.add(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0216, code lost:
    
        r23 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0222, code lost:
    
        r4.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0213, code lost:
    
        r4.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02c8, code lost:
    
        r12 = r0;
        r20 = r10;
        r0 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02d6, code lost:
    
        if (r0.hasNext() == false) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02d8, code lost:
    
        r3 = (Y.C0039f) r0.next();
        r4 = (Y.d0) r3.f1113a;
        r5 = r4.f1103c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02e6, code lost:
    
        if (r14 == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0306, code lost:
    
        if (r2 == false) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0326, code lost:
    
        r5 = r5.f1167F;
        q1.d.d(r12, "context");
        r13 = r3.k(r12);
        r22 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0333, code lost:
    
        if (r13 == null) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0335, code lost:
    
        r13 = (android.view.animation.Animation) r13.f60b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0339, code lost:
    
        if (r13 == null) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x033b, code lost:
    
        r23 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0340, code lost:
    
        if (r4.f1101a == 1) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0342, code lost:
    
        r5.startAnimation(r13);
        r3.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0376, code lost:
    
        ((H.d) r3.f1114b).a(new Y.C0038e(r3, r1, r4, r5));
        r0 = r22;
        r2 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0349, code lost:
    
        r15.startViewTransition(r5);
        r0 = new Y.C(r13, r15, r5);
        r0.setAnimationListener(new Y.AnimationAnimationListenerC0043j(r3, r1, r4, r5));
        r5.startAnimation(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0360, code lost:
    
        if (Y.S.H(r17) == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0362, code lost:
    
        android.util.Log.v("FragmentManager", "Animation from operation " + r4 + " has started.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x038d, code lost:
    
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0393, code lost:
    
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        r11 = (Y.d0) r3;
        r2 = r22.listIterator(r22.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x030c, code lost:
    
        if (Y.S.H(r17) == false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x030e, code lost:
    
        android.util.Log.v("FragmentManager", "Ignoring Animation set on " + r5 + " as Animations cannot run alongside Animators.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0322, code lost:
    
        r3.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x02ec, code lost:
    
        if (Y.S.H(r17) == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x02ee, code lost:
    
        android.util.Log.v("FragmentManager", "Ignoring Animation set on " + r5 + " as Animations cannot run alongside Transitions.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0302, code lost:
    
        r3.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0394, code lost:
    
        r0 = r20.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x039c, code lost:
    
        if (r0.hasNext() == false) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x039e, code lost:
    
        r1 = (Y.d0) r0.next();
        r2 = r1.f1103c.f1167F;
        r1 = r1.f1101a;
        q1.d.d(r2, "view");
        D.f.a(r2, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x03b3, code lost:
    
        r20.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x03ba, code lost:
    
        if (Y.S.H(r17) == false) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x03bc, code lost:
    
        android.util.Log.v("FragmentManager", "Completed executing operations from " + r11 + " to " + r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
    
        if (r2.hasPrevious() == false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x03d3, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0080, code lost:
    
        r14 = r14.getVisibility();
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0084, code lost:
    
        if (r14 == 0) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0086, code lost:
    
        if (r14 == 4) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0088, code lost:
    
        if (r14 != 8) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        r12 = r2.previous();
        r13 = (Y.d0) r12;
        r14 = r13.f1103c.f1167F;
        q1.d.d(r14, "operation.fragment.mView");
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0094, code lost:
    
        throw new java.lang.IllegalArgumentException(D.f.b("Unknown visibility ", r14));
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0077, code lost:
    
        if (r14.getAlpha() != 0.0f) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007d, code lost:
    
        if (r14.getVisibility() != 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0097, code lost:
    
        if (r13.f1101a != 2) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0099, code lost:
    
        r4 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009a, code lost:
    
        r7 = (Y.d0) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a5, code lost:
    
        if (Y.S.H(2) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a7, code lost:
    
        android.util.Log.v("FragmentManager", "Executing operations from " + r11 + " to " + r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00be, code lost:
    
        r2 = new java.util.ArrayList();
        r4 = new java.util.ArrayList();
        r10 = j1.j.z0(r22);
        r5 = ((Y.d0) j1.j.r0(r22)).f1103c;
        r12 = r22.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00dc, code lost:
    
        if (r12.hasNext() == false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00de, code lost:
    
        r13 = ((Y.d0) r12.next()).f1103c.f1169I;
        r14 = r5.f1169I;
        r13.f1154b = r14.f1154b;
        r13.f1155c = r14.f1155c;
        r13.d = r14.d;
        r13.f1156e = r14.f1156e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00fb, code lost:
    
        r3 = r22.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0103, code lost:
    
        if (r3.hasNext() == false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0105, code lost:
    
        r5 = (Y.d0) r3.next();
        r14 = new java.lang.Object();
        r5.d();
        r15 = r5.f1104e;
        r15.add(r14);
        r2.add(new Y.C0039f(r5, r14, r23));
        r13 = new java.lang.Object();
        r5.d();
        r15.add(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x012d, code lost:
    
        if (r23 == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x012f, code lost:
    
        if (r5 != r11) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0131, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0138, code lost:
    
        r14 = new Y.AbstractC0040g(r5, r13);
        r13 = r5.f1101a;
        r15 = r5.f1103c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x013f, code lost:
    
        if (r13 != 2) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0141, code lost:
    
        if (r23 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0143, code lost:
    
        r13 = r15.f1169I;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0154, code lost:
    
        if (r5.f1101a != 2) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0156, code lost:
    
        if (r23 == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0158, code lost:
    
        r13 = r15.f1169I;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x015b, code lost:
    
        r13 = r15.f1169I;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x015d, code lost:
    
        if (r12 == false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x015f, code lost:
    
        if (r23 == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0161, code lost:
    
        r12 = r15.f1169I;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0167, code lost:
    
        r4.add(r14);
        r5.d.add(new U.k(r10, r5, r1, 1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0164, code lost:
    
        r15.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0146, code lost:
    
        r15.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x014a, code lost:
    
        if (r23 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x014c, code lost:
    
        r13 = r15.f1169I;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x014f, code lost:
    
        r15.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0133, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0135, code lost:
    
        if (r5 != r7) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0176, code lost:
    
        r13 = new java.util.LinkedHashMap();
        r0 = new java.util.ArrayList();
        r3 = r4.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0188, code lost:
    
        if (r3.hasNext() == false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x018a, code lost:
    
        r5 = r3.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0195, code lost:
    
        if (((Y.C0041h) r5).h() != false) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0197, code lost:
    
        r0.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x019b, code lost:
    
        r3 = new java.util.ArrayList();
        r0 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01a8, code lost:
    
        if (r0.hasNext() == false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01aa, code lost:
    
        ((Y.C0041h) r0.next()).getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b4, code lost:
    
        r0 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01bc, code lost:
    
        if (r0.hasNext() == false) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01be, code lost:
    
        ((Y.C0041h) r0.next()).getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c8, code lost:
    
        r0 = r4.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01d0, code lost:
    
        if (r0.hasNext() == false) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01d2, code lost:
    
        r3 = (Y.C0041h) r0.next();
        r13.put((Y.d0) r3.f1113a, java.lang.Boolean.FALSE);
        r3.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01e5, code lost:
    
        r14 = r13.containsValue(java.lang.Boolean.TRUE);
        r15 = r1.f1122a;
        r0 = r15.getContext();
        r3 = new java.util.ArrayList();
        r16 = r2.iterator();
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01fb, code lost:
    
        r17 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0205, code lost:
    
        if (r16.hasNext() == false) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0207, code lost:
    
        r4 = (Y.C0039f) r16.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0211, code lost:
    
        if (r4.h() == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0219, code lost:
    
        q1.d.d(r0, "context");
        r6 = r4.k(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0220, code lost:
    
        if (r6 != null) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0226, code lost:
    
        r6 = (android.animation.Animator) r6.f61c;
     */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.Object, H.d] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object, H.d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.util.ArrayList r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 980
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.C0044k.b(java.util.ArrayList, boolean):void");
    }

    public final void c() {
        if (this.f1125e) {
            return;
        }
        ViewGroup viewGroup = this.f1122a;
        WeakHashMap weakHashMap = L.S.f311a;
        if (!viewGroup.isAttachedToWindow()) {
            e();
            this.d = false;
            return;
        }
        synchronized (this.f1123b) {
            try {
                if (!this.f1123b.isEmpty()) {
                    ArrayList z02 = j1.j.z0(this.f1124c);
                    this.f1124c.clear();
                    Iterator it = z02.iterator();
                    while (it.hasNext()) {
                        d0 d0Var = (d0) it.next();
                        if (S.H(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + d0Var);
                        }
                        d0Var.a();
                        if (!d0Var.f1106g) {
                            this.f1124c.add(d0Var);
                        }
                    }
                    g();
                    ArrayList z03 = j1.j.z0(this.f1123b);
                    this.f1123b.clear();
                    this.f1124c.addAll(z03);
                    if (S.H(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    Iterator it2 = z03.iterator();
                    while (it2.hasNext()) {
                        ((d0) it2.next()).d();
                    }
                    b(z03, this.d);
                    this.d = false;
                    if (S.H(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final d0 d(AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x) {
        Object obj;
        Iterator it = this.f1123b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            d0 d0Var = (d0) obj;
            if (q1.d.a(d0Var.f1103c, abstractComponentCallbacksC0056x) && !d0Var.f1105f) {
                break;
            }
        }
        return (d0) obj;
    }

    public final void e() {
        String str;
        String str2;
        if (S.H(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.f1122a;
        WeakHashMap weakHashMap = L.S.f311a;
        boolean isAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.f1123b) {
            try {
                g();
                Iterator it = this.f1123b.iterator();
                while (it.hasNext()) {
                    ((d0) it.next()).d();
                }
                Iterator it2 = j1.j.z0(this.f1124c).iterator();
                while (it2.hasNext()) {
                    d0 d0Var = (d0) it2.next();
                    if (S.H(2)) {
                        if (isAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f1122a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + d0Var);
                    }
                    d0Var.a();
                }
                Iterator it3 = j1.j.z0(this.f1123b).iterator();
                while (it3.hasNext()) {
                    d0 d0Var2 = (d0) it3.next();
                    if (S.H(2)) {
                        if (isAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.f1122a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + d0Var2);
                    }
                    d0Var2.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        Iterator it = this.f1123b.iterator();
        while (it.hasNext()) {
            d0 d0Var = (d0) it.next();
            int i = 2;
            if (d0Var.f1102b == 2) {
                int visibility = d0Var.f1103c.I().getVisibility();
                if (visibility != 0) {
                    i = 4;
                    if (visibility != 4) {
                        if (visibility != 8) {
                            throw new IllegalArgumentException(D.f.b("Unknown visibility ", visibility));
                        }
                        i = 3;
                    }
                }
                d0Var.c(i, 1);
            }
        }
    }
}
