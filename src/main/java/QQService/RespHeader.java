package QQService;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

/* compiled from: P */
/* loaded from: classes.dex */
public final class RespHeader extends JceStruct {
    public int iReplyCode;
    public int iSeq;
    public long lMID;
    public short shVersion;
    public String strResult;

    public RespHeader() {
        throw new RuntimeException("stub");
    }

    @Override // com.qq.taf.jce.JceStruct
    public void readFrom(JceInputStream jceInputStream) {
        throw new RuntimeException("stub");
    }

    @Override // com.qq.taf.jce.JceStruct
    public void writeTo(JceOutputStream jceOutputStream) {
        throw new RuntimeException("stub");
    }

    public RespHeader(short s, int i2, long j2, int i3, String str) {
        throw new RuntimeException("stub");
    }
}
