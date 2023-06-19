package QQService;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

/* compiled from: P */
/* loaded from: classes.dex */
public final class SvcReqGet extends JceStruct {
    static byte[] cache_vecGuid;
    public byte bIsShowOnline;
    public byte bOnlinePush;
    public byte cConnType;
    public int iClientId;
    public int iClientIp;
    public int iClientPort;
    public int iSSOIp;
    public int iSSOPort;
    public int iStatus;
    public long lBid;
    public long lUin;
    public String sOther;
    public byte[] vecGuid;

    public SvcReqGet() {
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

    public SvcReqGet(long j2, long j3, String str, int i2, byte b2, byte b3, byte b4, int i3, int i4, int i5, int i6, int i7, byte[] bArr) {
        throw new RuntimeException("stub");
    }
}
