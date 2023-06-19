package QQService;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

/* loaded from: classes.dex */
public final class SCPushStreamMsg extends JceStruct {
    static StreamData cache_stStreamData;
    static StreamInfo cache_stStreamInfo;
    public long bubbleID;
    public long diyAddonId;
    public int iSeq;
    public long lKey;
    public short shVersion;
    public StreamData stStreamData;
    public StreamInfo stStreamInfo;
    public long subBubbleId;
    public long uPcQQStatus;

    public SCPushStreamMsg() {
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

    public SCPushStreamMsg(short s, int i2, StreamInfo streamInfo, StreamData streamData, long j2, long j3, long j4, long j5, long j6) {
        throw new RuntimeException("stub");
    }
}
