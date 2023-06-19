package QQService;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

/* compiled from: P */
/* loaded from: classes.dex */
public final class SCRespUploadStreamMsg extends JceStruct {
    static StreamInfo cache_stStreamInfo;
    public int iSeq;
    public int result;
    public int shMsgSeq;
    public short shResetSeq;
    public short shVersion;
    public StreamInfo stStreamInfo;
    public long uDateTime;

    public SCRespUploadStreamMsg() {
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

    public SCRespUploadStreamMsg(short s, int i2, StreamInfo streamInfo, short s2, int i3, long j2, int i4) {
        throw new RuntimeException("stub");
    }
}
