package QQService;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

/* loaded from: classes.dex */
public final class CSRespPushStreamMsg extends JceStruct {
    static StreamInfo cache_stStreamInfo;
    public int iSeq;
    public long lKey;
    public short shResetSeq;
    public short shVersion;
    public StreamInfo stStreamInfo;

    public CSRespPushStreamMsg() {
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

    public CSRespPushStreamMsg(short s, int i2, StreamInfo streamInfo, short s2, long j2) {
        throw new RuntimeException("stub");
    }
}
