package com;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class FormBody extends RequestBody {
    private static final MediaType CONTENT_TYPE = MediaType.parse("application/x-www-form-urlencoded");
    private final List<String> encodedNames;
    private final List<String> encodedValues;

    /* loaded from: classes.dex */
    public static final class Builder {
        private final List<String> names = new ArrayList();
        private final List<String> values = new ArrayList();

        public Builder add(String str, String str2) {
            this.names.add(HttpUrl.canonicalize(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true));
            this.values.add(HttpUrl.canonicalize(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true));
            return this;
        }

        public Builder addEncoded(String str, String str2) {
            this.names.add(HttpUrl.canonicalize(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true));
            this.values.add(HttpUrl.canonicalize(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true));
            return this;
        }

        public FormBody build() {
            return new FormBody(this.names, this.values);
        }
    }

    FormBody(List<String> list, List<String> list2) {
        this.encodedNames = com.tencent.Util.immutableList(list);
        this.encodedValues = com.tencent.Util.immutableList(list2);
    }

    private long writeOrCountBytes(BufferedSink bufferedSink, boolean z2) {
        long j2 = 0;
        Buffer buffer = z2 ? new Buffer() : bufferedSink.buffer();
        int size = this.encodedNames.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                buffer.writeByte(38);
            }
            buffer.writeUtf8(this.encodedNames.get(i));
            buffer.writeByte(61);
            buffer.writeUtf8(this.encodedValues.get(i));
        }
        if (z2) {
            j2 = buffer.size();
            buffer.clear();
        }
        return j2;
    }

    @Override // com.RequestBody
    public long contentLength() {
        return writeOrCountBytes(null, true);
    }

    @Override // com.RequestBody
    public MediaType contentType() {
        return CONTENT_TYPE;
    }

    public String encodedName(int i) {
        return this.encodedNames.get(i);
    }

    public String encodedValue(int i) {
        return this.encodedValues.get(i);
    }

    public String name(int i) {
        return HttpUrl.percentDecode(encodedName(i), true);
    }

    public int size() {
        return this.encodedNames.size();
    }

    public String value(int i) {
        return HttpUrl.percentDecode(encodedValue(i), true);
    }

    @Override // com.RequestBody
    public void writeTo(BufferedSink bufferedSink) throws IOException {
        writeOrCountBytes(bufferedSink, false);
    }
}
