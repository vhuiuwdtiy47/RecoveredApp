package l0;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f3210a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3211b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3212c;
    public final long d;

    public i(int i, int i2, long j2, long j3) {
        this.f3210a = i;
        this.f3211b = i2;
        this.f3212c = j2;
        this.d = j3;
    }

    public static i a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            i iVar = new i(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return iVar;
        } finally {
        }
    }

    public final void b(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f3210a);
            dataOutputStream.writeInt(this.f3211b);
            dataOutputStream.writeLong(this.f3212c);
            dataOutputStream.writeLong(this.d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof i)) {
            i iVar = (i) obj;
            if (this.f3211b == iVar.f3211b && this.f3212c == iVar.f3212c && this.f3210a == iVar.f3210a && this.d == iVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f3211b), Long.valueOf(this.f3212c), Integer.valueOf(this.f3210a), Long.valueOf(this.d));
    }
}
