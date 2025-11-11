package g;

import L.S;
import a.DialogC0069k;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.android.music.R;
import java.util.WeakHashMap;

/* renamed from: g.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceC0143f extends DialogC0069k implements DialogInterface, InterfaceC0147j {
    public B d;

    /* renamed from: e, reason: collision with root package name */
    public final C f2530e;

    /* renamed from: f, reason: collision with root package name */
    public final C0142e f2531f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DialogInterfaceC0143f(android.view.ContextThemeWrapper r5, int r6) {
        /*
            r4 = this;
            int r6 = g(r5, r6)
            r0 = 1
            r1 = 2130903428(0x7f030184, float:1.7413674E38)
            if (r6 != 0) goto L19
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r3 = r5.getTheme()
            r3.resolveAttribute(r1, r2, r0)
            int r2 = r2.resourceId
            goto L1a
        L19:
            r2 = r6
        L1a:
            r4.<init>(r5, r2)
            g.C r2 = new g.C
            r2.<init>(r4)
            r4.f2530e = r2
            g.p r2 = r4.e()
            if (r6 != 0) goto L38
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            r5.resolveAttribute(r1, r6, r0)
            int r6 = r6.resourceId
        L38:
            r5 = r2
            g.B r5 = (g.B) r5
            r5.f2426T = r6
            r2.c()
            g.e r5 = new g.e
            android.content.Context r6 = r4.getContext()
            android.view.Window r0 = r4.getWindow()
            r5.<init>(r6, r4, r0)
            r4.f2531f = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.DialogInterfaceC0143f.<init>(android.view.ContextThemeWrapper, int):void");
    }

    public static int g(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // a.DialogC0069k, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        B b2 = (B) e();
        b2.v();
        ((ViewGroup) b2.f2408A.findViewById(android.R.id.content)).addView(view, layoutParams);
        b2.f2442m.a(b2.f2441l.getCallback());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        e().d();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        getWindow().getDecorView();
        C c2 = this.f2530e;
        if (c2 == null) {
            return false;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final p e() {
        if (this.d == null) {
            n nVar = p.f2546a;
            this.d = new B(getContext(), getWindow(), this, this);
        }
        return this.d;
    }

    public final void f(Bundle bundle) {
        e().a();
        super.onCreate(bundle);
        e().c();
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        B b2 = (B) e();
        b2.v();
        return b2.f2441l.findViewById(i);
    }

    public final void h(CharSequence charSequence) {
        super.setTitle(charSequence);
        e().j(charSequence);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        B b2 = (B) e();
        if (b2.f2444o != null) {
            b2.z();
            b2.f2444o.getClass();
            b2.A(0);
        }
    }

    @Override // a.DialogC0069k, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View findViewById;
        f(bundle);
        C0142e c0142e = this.f2531f;
        c0142e.f2511b.setContentView(c0142e.f2523q);
        Window window = c0142e.f2512c;
        View findViewById2 = window.findViewById(R.id.parentPanel);
        View findViewById3 = findViewById2.findViewById(R.id.topPanel);
        View findViewById4 = findViewById2.findViewById(R.id.contentPanel);
        View findViewById5 = findViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(R.id.customPanel);
        window.setFlags(131072, 131072);
        viewGroup.setVisibility(8);
        View findViewById6 = viewGroup.findViewById(R.id.topPanel);
        View findViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup a2 = C0142e.a(findViewById6, findViewById3);
        ViewGroup a3 = C0142e.a(findViewById7, findViewById4);
        ViewGroup a4 = C0142e.a(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        c0142e.i = nestedScrollView;
        nestedScrollView.setFocusable(false);
        c0142e.i.setNestedScrollingEnabled(false);
        TextView textView = (TextView) a3.findViewById(android.R.id.message);
        c0142e.f2519m = textView;
        if (textView != null) {
            textView.setVisibility(8);
            c0142e.i.removeView(c0142e.f2519m);
            if (c0142e.f2513e != null) {
                ViewGroup viewGroup2 = (ViewGroup) c0142e.i.getParent();
                int indexOfChild = viewGroup2.indexOfChild(c0142e.i);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(c0142e.f2513e, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                a3.setVisibility(8);
            }
        }
        Button button = (Button) a4.findViewById(android.R.id.button1);
        c0142e.f2514f = button;
        O0.e eVar = c0142e.f2529w;
        button.setOnClickListener(eVar);
        if (TextUtils.isEmpty(null)) {
            c0142e.f2514f.setVisibility(8);
            i = 0;
        } else {
            c0142e.f2514f.setText((CharSequence) null);
            c0142e.f2514f.setVisibility(0);
            i = 1;
        }
        Button button2 = (Button) a4.findViewById(android.R.id.button2);
        c0142e.f2515g = button2;
        button2.setOnClickListener(eVar);
        if (TextUtils.isEmpty(null)) {
            c0142e.f2515g.setVisibility(8);
        } else {
            c0142e.f2515g.setText((CharSequence) null);
            c0142e.f2515g.setVisibility(0);
            i |= 2;
        }
        Button button3 = (Button) a4.findViewById(android.R.id.button3);
        c0142e.h = button3;
        button3.setOnClickListener(eVar);
        if (TextUtils.isEmpty(null)) {
            c0142e.h.setVisibility(8);
        } else {
            c0142e.h.setText((CharSequence) null);
            c0142e.h.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        c0142e.f2510a.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button4 = c0142e.f2514f;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button5 = c0142e.f2515g;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button6 = c0142e.h;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            a4.setVisibility(8);
        }
        if (c0142e.f2520n != null) {
            a2.addView(c0142e.f2520n, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            c0142e.f2517k = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(c0142e.d) || !c0142e.f2527u) {
                window.findViewById(R.id.title_template).setVisibility(8);
                c0142e.f2517k.setVisibility(8);
                a2.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                c0142e.f2518l = textView2;
                textView2.setText(c0142e.d);
                Drawable drawable = c0142e.f2516j;
                if (drawable != null) {
                    c0142e.f2517k.setImageDrawable(drawable);
                } else {
                    c0142e.f2518l.setPadding(c0142e.f2517k.getPaddingLeft(), c0142e.f2517k.getPaddingTop(), c0142e.f2517k.getPaddingRight(), c0142e.f2517k.getPaddingBottom());
                    c0142e.f2517k.setVisibility(8);
                }
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        int i2 = (a2 == null || a2.getVisibility() == 8) ? 0 : 1;
        boolean z3 = a4.getVisibility() != 8;
        if (!z3 && (findViewById = a3.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (i2 != 0) {
            NestedScrollView nestedScrollView2 = c0142e.i;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View findViewById9 = c0142e.f2513e != null ? a2.findViewById(R.id.titleDividerNoCustom) : null;
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        } else {
            View findViewById10 = a3.findViewById(R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = c0142e.f2513e;
        if (alertController$RecycleListView != null) {
            alertController$RecycleListView.getClass();
            if (!z3 || i2 == 0) {
                alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i2 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f1317a, alertController$RecycleListView.getPaddingRight(), z3 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f1318b);
            }
        }
        if (!z2) {
            View view = c0142e.f2513e;
            if (view == null) {
                view = c0142e.i;
            }
            if (view != null) {
                int i3 = (z3 ? 2 : 0) | i2;
                View findViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View findViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = S.f311a;
                L.H.d(view, i3, 3);
                if (findViewById11 != null) {
                    a3.removeView(findViewById11);
                }
                if (findViewById12 != null) {
                    a3.removeView(findViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = c0142e.f2513e;
        if (alertController$RecycleListView2 == null || (listAdapter = c0142e.f2521o) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i4 = c0142e.f2522p;
        if (i4 > -1) {
            alertController$RecycleListView2.setItemChecked(i4, true);
            alertController$RecycleListView2.setSelection(i4);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f2531f.i;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f2531f.i;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // a.DialogC0069k, android.app.Dialog
    public final void onStop() {
        super.onStop();
        B b2 = (B) e();
        b2.z();
        L l2 = b2.f2444o;
        if (l2 != null) {
            l2.f2497x = false;
            j.j jVar = l2.f2496w;
            if (jVar != null) {
                jVar.a();
            }
        }
    }

    @Override // a.DialogC0069k, android.app.Dialog
    public final void setContentView(int i) {
        c();
        e().g(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        e().j(getContext().getString(i));
    }

    @Override // a.DialogC0069k, android.app.Dialog
    public final void setContentView(View view) {
        c();
        e().h(view);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        h(charSequence);
        C0142e c0142e = this.f2531f;
        c0142e.d = charSequence;
        TextView textView = c0142e.f2518l;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // a.DialogC0069k, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        e().i(view, layoutParams);
    }
}
