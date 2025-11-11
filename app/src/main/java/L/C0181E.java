package l;

import L.C0016l;
import android.R;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import f.AbstractC0117a;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: l.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0181E implements InterfaceC0220Z {
    public static final int[] d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2961a;

    /* renamed from: b, reason: collision with root package name */
    public final View f2962b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2963c;

    public C0181E(AbsSeekBar absSeekBar) {
        this.f2961a = 0;
        this.f2962b = absSeekBar;
    }

    @Override // l.InterfaceC0220Z
    public void a(int i) {
        C0224b0.d((C0224b0) this.f2963c, i);
    }

    @Override // l.InterfaceC0220Z
    public void b(int i, float f2) {
    }

    @Override // l.InterfaceC0220Z
    public void c(int i) {
        C0224b0.e((C0224b0) this.f2963c, i);
    }

    public KeyListener d(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((C.j) ((A0.c) this.f2963c).f33b).getClass();
        if (keyListener instanceof W.e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new W.e(keyListener);
    }

    public void e(AttributeSet attributeSet, int i) {
        switch (this.f2961a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f2962b;
                C0016l s2 = C0016l.s(absSeekBar.getContext(), attributeSet, d, i);
                Drawable i2 = s2.i(0);
                if (i2 != null) {
                    if (i2 instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) i2;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i3 = 0; i3 < numberOfFrames; i3++) {
                            Drawable h = h(animationDrawable.getFrame(i3), true);
                            h.setLevel(10000);
                            animationDrawable2.addFrame(h, animationDrawable.getDuration(i3));
                        }
                        animationDrawable2.setLevel(10000);
                        i2 = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(i2);
                }
                Drawable i4 = s2.i(1);
                if (i4 != null) {
                    absSeekBar.setProgressDrawable(h(i4, false));
                }
                s2.u();
                return;
            default:
                TypedArray obtainStyledAttributes = ((EditText) this.f2962b).getContext().obtainStyledAttributes(attributeSet, AbstractC0117a.i, i, 0);
                try {
                    boolean z2 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
                    obtainStyledAttributes.recycle();
                    g(z2);
                    return;
                } catch (Throwable th) {
                    obtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public W.b f(InputConnection inputConnection, EditorInfo editorInfo) {
        A0.c cVar = (A0.c) this.f2963c;
        if (inputConnection == null) {
            cVar.getClass();
            inputConnection = null;
        } else {
            C.j jVar = (C.j) cVar.f33b;
            jVar.getClass();
            if (!(inputConnection instanceof W.b)) {
                inputConnection = new W.b((EditText) jVar.f60b, inputConnection, editorInfo);
            }
        }
        return (W.b) inputConnection;
    }

    public void g(boolean z2) {
        W.i iVar = (W.i) ((C.j) ((A0.c) this.f2963c).f33b).f61c;
        if (iVar.f835c != z2) {
            if (iVar.f834b != null) {
                U.i a2 = U.i.a();
                W.h hVar = iVar.f834b;
                a2.getClass();
                Z0.i.i(hVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a2.f760a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a2.f761b.remove(hVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            iVar.f835c = z2;
            if (z2) {
                W.i.a(iVar.f833a, U.i.a().b());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable h(Drawable drawable, boolean z2) {
        if (drawable instanceof E.d) {
            ((E.e) ((E.d) drawable)).getClass();
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i = 0; i < numberOfLayers; i++) {
                    int id = layerDrawable.getId(i);
                    drawableArr[i] = h(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i2 = 0; i2 < numberOfLayers; i2++) {
                    layerDrawable2.setId(i2, layerDrawable.getId(i2));
                    layerDrawable2.setLayerGravity(i2, layerDrawable.getLayerGravity(i2));
                    layerDrawable2.setLayerWidth(i2, layerDrawable.getLayerWidth(i2));
                    layerDrawable2.setLayerHeight(i2, layerDrawable.getLayerHeight(i2));
                    layerDrawable2.setLayerInsetLeft(i2, layerDrawable.getLayerInsetLeft(i2));
                    layerDrawable2.setLayerInsetRight(i2, layerDrawable.getLayerInsetRight(i2));
                    layerDrawable2.setLayerInsetTop(i2, layerDrawable.getLayerInsetTop(i2));
                    layerDrawable2.setLayerInsetBottom(i2, layerDrawable.getLayerInsetBottom(i2));
                    layerDrawable2.setLayerInsetStart(i2, layerDrawable.getLayerInsetStart(i2));
                    layerDrawable2.setLayerInsetEnd(i2, layerDrawable.getLayerInsetEnd(i2));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (((Bitmap) this.f2963c) == null) {
                    this.f2963c = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z2 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    public C0181E(EditText editText) {
        this.f2961a = 1;
        this.f2962b = editText;
        this.f2963c = new A0.c(editText);
    }

    public C0181E(C0224b0 c0224b0) {
        this.f2961a = 2;
        this.f2963c = c0224b0;
        this.f2961a = 2;
        this.f2962b = c0224b0;
    }
}
