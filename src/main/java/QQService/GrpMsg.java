package QQService;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

/* compiled from: P */
/* loaded from: classes.dex */
public final class GrpMsg extends JceStruct {
    static byte[] cache_strMsg;
    public long GrpMsgID;
    public int iMsgTime;
    public long lFromMID;
    public long lGrpId;
    public short shMsgType;
    public byte[] strMsg;

    public GrpMsg() {
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

    public GrpMsg(short s, long j2, long j3, long j4, int i2, byte[] bArr) {
        throw new RuntimeException("stub");
    }
}
