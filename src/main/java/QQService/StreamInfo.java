package QQService;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

/* compiled from: P */
/* loaded from: classes.dex */
public final class StreamInfo extends JceStruct {
    static int cache_type;
    static byte[] cache_vPbData;
    public String fileKey;
    public int iMsgId;
    public int iSendTime;
    public long lFromUIN;
    public long lToUIN;
    public int msgSeq;
    public long msgTime;
    public long netType;
    public short oprType;
    public long pttFormat;
    public long pttTime;
    public byte pttTransFlag;
    public long random;
    public short shFlowLayer;
    public short shPackNum;
    public long subBubbleId;
    public int type;
    public byte[] vPbData;

    public StreamInfo() {
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

    public StreamInfo(long j2, long j3, int i2, int i3, int i4, short s, short s2, short s3, byte b2, String str, long j4, int i5, long j5, long j6, long j7, long j8, long j9, byte[] bArr) {
        throw new RuntimeException("stub");
    }
}
