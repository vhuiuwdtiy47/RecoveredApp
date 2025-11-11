package W0;

import L.S;
import L.X;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.android.music.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import x0.AbstractC0375a;

/* loaded from: classes.dex */
public final class k extends q {

    /* renamed from: e, reason: collision with root package name */
    public final int f859e;

    /* renamed from: f, reason: collision with root package name */
    public final int f860f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f861g;
    public AutoCompleteTextView h;
    public final ViewOnClickListenerC0031a i;

    /* renamed from: j, reason: collision with root package name */
    public final ViewOnFocusChangeListenerC0032b f862j;

    /* renamed from: k, reason: collision with root package name */
    public final Q.b f863k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f864l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f865m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f866n;

    /* renamed from: o, reason: collision with root package name */
    public long f867o;

    /* renamed from: p, reason: collision with root package name */
    public AccessibilityManager f868p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f869q;

    /* renamed from: r, reason: collision with root package name */
    public ValueAnimator f870r;

    public k(p pVar) {
        super(pVar);
        this.i = new ViewOnClickListenerC0031a(1, this);
        this.f862j = new ViewOnFocusChangeListenerC0032b(this, 1);
        this.f863k = new Q.b(this);
        this.f867o = Long.MAX_VALUE;
        this.f860f = Z0.i.b0(pVar.getContext(), R.attr.motionDurationShort3, 67);
        this.f859e = Z0.i.b0(pVar.getContext(), R.attr.motionDurationShort3, 50);
        this.f861g = Z0.i.c0(pVar.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0375a.f4189a);
    }

    @Override // W0.q
    public final void a() {
        if (this.f868p.isTouchExplorationEnabled() && U.t.H(this.h) && !this.d.hasFocus()) {
            this.h.dismissDropDown();
        }
        this.h.post(new F0.b(5, this));
    }

    @Override // W0.q
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // W0.q
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // W0.q
    public final View.OnFocusChangeListener e() {
        return this.f862j;
    }

    @Override // W0.q
    public final View.OnClickListener f() {
        return this.i;
    }

    @Override // W0.q
    public final Q.b h() {
        return this.f863k;
    }

    @Override // W0.q
    public final boolean i(int i) {
        return i != 0;
    }

    @Override // W0.q
    public final boolean j() {
        return this.f864l;
    }

    @Override // W0.q
    public final boolean l() {
        return this.f866n;
    }

    @Override // W0.q
    public final void m(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: W0.i
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                k kVar = k.this;
                kVar.getClass();
                if (motionEvent.getAction() == 1) {
                    long currentTimeMillis = System.currentTimeMillis() - kVar.f867o;
                    if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                        kVar.f865m = false;
                    }
                    kVar.u();
                    kVar.f865m = true;
                    kVar.f867o = System.currentTimeMillis();
                }
                return false;
            }
        });
        this.h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: W0.j
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                k kVar = k.this;
                kVar.f865m = true;
                kVar.f867o = System.currentTimeMillis();
                kVar.t(false);
            }
        });
        this.h.setThreshold(0);
        TextInputLayout textInputLayout = this.f897a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (!U.t.H(editText) && this.f868p.isTouchExplorationEnabled()) {
            WeakHashMap weakHashMap = S.f311a;
            this.d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // W0.q
    public final void n(M.k kVar) {
        boolean H2 = U.t.H(this.h);
        AccessibilityNodeInfo accessibilityNodeInfo = kVar.f417a;
        if (!H2) {
            accessibilityNodeInfo.setClassName(Spinner.class.getName());
        }
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText(null);
        }
    }

    @Override // W0.q
    public final void o(AccessibilityEvent accessibilityEvent) {
        if (!this.f868p.isEnabled() || U.t.H(this.h)) {
            return;
        }
        boolean z2 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f866n && !this.h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z2) {
            u();
            this.f865m = true;
            this.f867o = System.currentTimeMillis();
        }
    }

    @Override // W0.q
    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f861g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f860f);
        ofFloat.addUpdateListener(new X(this));
        this.f870r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.f859e);
        ofFloat2.addUpdateListener(new X(this));
        this.f869q = ofFloat2;
        ofFloat2.addListener(new A0.a(2, this));
        this.f868p = (AccessibilityManager) this.f899c.getSystemService("accessibility");
    }

    @Override // W0.q
    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.h.setOnDismissListener(null);
        }
    }

    public final void t(boolean z2) {
        if (this.f866n != z2) {
            this.f866n = z2;
            this.f870r.cancel();
            this.f869q.start();
        }
    }

    public final void u() {
        if (this.h == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f867o;
        if (currentTimeMillis < 0 || currentTimeMillis > 300) {
            this.f865m = false;
        }
        if (this.f865m) {
            this.f865m = false;
            return;
        }
        t(!this.f866n);
        if (!this.f866n) {
            this.h.dismissDropDown();
        } else {
            this.h.requestFocus();
            this.h.showDropDown();
        }
    }
}
