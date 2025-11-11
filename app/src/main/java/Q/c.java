package Q;

import L.C0008d;
import L.InterfaceC0007c;
import L.S;
import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import l.C0267x;

/* loaded from: classes.dex */
public final class c extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f584a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InputConnection inputConnection, b bVar) {
        super(inputConnection, false);
        this.f584a = bVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        Bundle bundle2;
        InterfaceC0007c interfaceC0007c;
        A0.c cVar = inputContentInfo == null ? null : new A0.c(8, new A0.c(7, inputContentInfo));
        b bVar = this.f584a;
        if ((i & 1) != 0) {
            try {
                ((InputContentInfo) ((A0.c) cVar.f33b).f33b).requestPermission();
                InputContentInfo inputContentInfo2 = (InputContentInfo) ((A0.c) cVar.f33b).f33b;
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception e2) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e2);
            }
        } else {
            bundle2 = bundle;
        }
        ClipDescription description = ((InputContentInfo) ((A0.c) cVar.f33b).f33b).getDescription();
        A0.c cVar2 = (A0.c) cVar.f33b;
        ClipData clipData = new ClipData(description, new ClipData.Item(((InputContentInfo) cVar2.f33b).getContentUri()));
        if (Build.VERSION.SDK_INT >= 31) {
            interfaceC0007c = new A0.c(clipData, 2);
        } else {
            C0008d c0008d = new C0008d();
            c0008d.f329b = clipData;
            c0008d.f330c = 2;
            interfaceC0007c = c0008d;
        }
        interfaceC0007c.c(((InputContentInfo) cVar2.f33b).getLinkUri());
        interfaceC0007c.a(bundle2);
        if (S.e((C0267x) bVar.f583a, interfaceC0007c.k()) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
