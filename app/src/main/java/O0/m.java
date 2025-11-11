package O0;

import L.C0016l;
import L.S;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.FrameLayout;
import com.android.music.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import k.InterfaceC0164A;
import k.y;
import w0.AbstractC0373a;

/* loaded from: classes.dex */
public abstract class m extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final d f576a;

    /* renamed from: b, reason: collision with root package name */
    public final C0.b f577b;

    /* renamed from: c, reason: collision with root package name */
    public final h f578c;
    public j.h d;

    /* renamed from: e, reason: collision with root package name */
    public k f579e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [k.y, java.lang.Object, O0.h] */
    public m(Context context, AttributeSet attributeSet) {
        super(Y0.a.a(context, attributeSet, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView), attributeSet, R.attr.bottomNavigationStyle);
        ?? obj = new Object();
        obj.f572b = false;
        this.f578c = obj;
        Context context2 = getContext();
        C0016l h = M0.m.h(context2, attributeSet, AbstractC0373a.f4169w, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView, 12, 10);
        d dVar = new d(context2, getClass(), getMaxItemCount());
        this.f576a = dVar;
        C0.b bVar = new C0.b(context2);
        this.f577b = bVar;
        obj.f571a = bVar;
        obj.f573c = 1;
        bVar.setPresenter(obj);
        dVar.b(obj, dVar.f2838a);
        getContext();
        obj.f571a.f545E = dVar;
        TypedArray typedArray = (TypedArray) h.f362c;
        if (typedArray.hasValue(6)) {
            bVar.setIconTintList(h.g(6));
        } else {
            bVar.setIconTintList(bVar.b());
        }
        setItemIconSize(typedArray.getDimensionPixelSize(5, getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_bar_item_default_icon_size)));
        if (typedArray.hasValue(12)) {
            setItemTextAppearanceInactive(typedArray.getResourceId(12, 0));
        }
        if (typedArray.hasValue(10)) {
            setItemTextAppearanceActive(typedArray.getResourceId(10, 0));
        }
        setItemTextAppearanceActiveBoldEnabled(typedArray.getBoolean(11, true));
        if (typedArray.hasValue(13)) {
            setItemTextColor(h.g(13));
        }
        Drawable background = getBackground();
        ColorStateList y2 = Z0.i.y(background);
        if (background == null || y2 != null) {
            T0.g gVar = new T0.g(T0.k.b(context2, attributeSet, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView).a());
            if (y2 != null) {
                gVar.j(y2);
            }
            gVar.h(context2);
            WeakHashMap weakHashMap = S.f311a;
            setBackground(gVar);
        }
        if (typedArray.hasValue(8)) {
            setItemPaddingTop(typedArray.getDimensionPixelSize(8, 0));
        }
        if (typedArray.hasValue(7)) {
            setItemPaddingBottom(typedArray.getDimensionPixelSize(7, 0));
        }
        if (typedArray.hasValue(0)) {
            setActiveIndicatorLabelPadding(typedArray.getDimensionPixelSize(0, 0));
        }
        if (typedArray.hasValue(2)) {
            setElevation(typedArray.getDimensionPixelSize(2, 0));
        }
        E.a.h(getBackground().mutate(), Z0.i.w(context2, h, 1));
        setLabelVisibilityMode(typedArray.getInteger(14, -1));
        int resourceId = typedArray.getResourceId(4, 0);
        if (resourceId != 0) {
            bVar.setItemBackgroundRes(resourceId);
        } else {
            setItemRippleColor(Z0.i.w(context2, h, 9));
        }
        int resourceId2 = typedArray.getResourceId(3, 0);
        if (resourceId2 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(resourceId2, AbstractC0373a.f4168v);
            setItemActiveIndicatorWidth(obtainStyledAttributes.getDimensionPixelSize(1, 0));
            setItemActiveIndicatorHeight(obtainStyledAttributes.getDimensionPixelSize(0, 0));
            setItemActiveIndicatorMarginHorizontal(obtainStyledAttributes.getDimensionPixelOffset(3, 0));
            setItemActiveIndicatorColor(Z0.i.x(context2, obtainStyledAttributes, 2));
            setItemActiveIndicatorShapeAppearance(T0.k.a(context2, obtainStyledAttributes.getResourceId(4, 0), 0, new T0.a(0)).a());
            obtainStyledAttributes.recycle();
        }
        if (typedArray.hasValue(15)) {
            int resourceId3 = typedArray.getResourceId(15, 0);
            obj.f572b = true;
            getMenuInflater().inflate(resourceId3, dVar);
            obj.f572b = false;
            obj.l(true);
        }
        h.u();
        addView(bVar);
        dVar.f2841e = new i((BottomNavigationView) this);
    }

    private MenuInflater getMenuInflater() {
        if (this.d == null) {
            this.d = new j.h(getContext());
        }
        return this.d;
    }

    public int getActiveIndicatorLabelPadding() {
        return this.f577b.getActiveIndicatorLabelPadding();
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f577b.getItemActiveIndicatorColor();
    }

    public int getItemActiveIndicatorHeight() {
        return this.f577b.getItemActiveIndicatorHeight();
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f577b.getItemActiveIndicatorMarginHorizontal();
    }

    public T0.k getItemActiveIndicatorShapeAppearance() {
        return this.f577b.getItemActiveIndicatorShapeAppearance();
    }

    public int getItemActiveIndicatorWidth() {
        return this.f577b.getItemActiveIndicatorWidth();
    }

    public Drawable getItemBackground() {
        return this.f577b.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.f577b.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.f577b.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f577b.getIconTintList();
    }

    public int getItemPaddingBottom() {
        return this.f577b.getItemPaddingBottom();
    }

    public int getItemPaddingTop() {
        return this.f577b.getItemPaddingTop();
    }

    public ColorStateList getItemRippleColor() {
        return this.f577b.getItemRippleColor();
    }

    public int getItemTextAppearanceActive() {
        return this.f577b.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f577b.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f577b.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f577b.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    public Menu getMenu() {
        return this.f576a;
    }

    public InterfaceC0164A getMenuView() {
        return this.f577b;
    }

    public h getPresenter() {
        return this.f578c;
    }

    public int getSelectedItemId() {
        return this.f577b.getSelectedItemId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof T0.g) {
            Z0.i.h0(this, (T0.g) background);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof l)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        l lVar = (l) parcelable;
        super.onRestoreInstanceState(lVar.f628a);
        Bundle bundle = lVar.f575c;
        d dVar = this.f576a;
        dVar.getClass();
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = dVar.f2855u;
            if (copyOnWriteArrayList.isEmpty()) {
                return;
            }
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                y yVar = (y) weakReference.get();
                if (yVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    int c2 = yVar.c();
                    if (c2 > 0 && (parcelable2 = (Parcelable) sparseParcelableArray.get(c2)) != null) {
                        yVar.m(parcelable2);
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, S.b, O0.l] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable k2;
        ?? bVar = new S.b(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        bVar.f575c = bundle;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f576a.f2855u;
        if (copyOnWriteArrayList.isEmpty()) {
            return bVar;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            y yVar = (y) weakReference.get();
            if (yVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                int c2 = yVar.c();
                if (c2 > 0 && (k2 = yVar.k()) != null) {
                    sparseArray.put(c2, k2);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        return bVar;
    }

    public void setActiveIndicatorLabelPadding(int i) {
        this.f577b.setActiveIndicatorLabelPadding(i);
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        Drawable background = getBackground();
        if (background instanceof T0.g) {
            ((T0.g) background).i(f2);
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f577b.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z2) {
        this.f577b.setItemActiveIndicatorEnabled(z2);
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.f577b.setItemActiveIndicatorHeight(i);
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.f577b.setItemActiveIndicatorMarginHorizontal(i);
    }

    public void setItemActiveIndicatorShapeAppearance(T0.k kVar) {
        this.f577b.setItemActiveIndicatorShapeAppearance(kVar);
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.f577b.setItemActiveIndicatorWidth(i);
    }

    public void setItemBackground(Drawable drawable) {
        this.f577b.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i) {
        this.f577b.setItemBackgroundRes(i);
    }

    public void setItemIconSize(int i) {
        this.f577b.setItemIconSize(i);
    }

    public void setItemIconSizeRes(int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f577b.setIconTintList(colorStateList);
    }

    public void setItemPaddingBottom(int i) {
        this.f577b.setItemPaddingBottom(i);
    }

    public void setItemPaddingTop(int i) {
        this.f577b.setItemPaddingTop(i);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f577b.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(int i) {
        this.f577b.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z2) {
        this.f577b.setItemTextAppearanceActiveBoldEnabled(z2);
    }

    public void setItemTextAppearanceInactive(int i) {
        this.f577b.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f577b.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i) {
        C0.b bVar = this.f577b;
        if (bVar.getLabelVisibilityMode() != i) {
            bVar.setLabelVisibilityMode(i);
            this.f578c.l(false);
        }
    }

    public void setOnItemReselectedListener(j jVar) {
    }

    public void setOnItemSelectedListener(k kVar) {
        this.f579e = kVar;
    }

    public void setSelectedItemId(int i) {
        d dVar = this.f576a;
        MenuItem findItem = dVar.findItem(i);
        if (findItem == null || dVar.q(findItem, this.f578c, 0)) {
            return;
        }
        findItem.setChecked(true);
    }
}
