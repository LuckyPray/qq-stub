package QQService;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

/* compiled from: P */
/* loaded from: classes.dex */
public final class CSUploadStreamMsg extends JceStruct {
    static StreamData cache_stStreamData;
    static StreamInfo cache_stStreamInfo;
    public int iSeq;
    public int shMsgSeq;
    public short shVersion;
    public StreamData stStreamData;
    public StreamInfo stStreamInfo;

    public CSUploadStreamMsg() {
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

    public CSUploadStreamMsg(short s, int i2, StreamInfo streamInfo, StreamData streamData, int i3) {
        throw new RuntimeException("stub");
    }
}
