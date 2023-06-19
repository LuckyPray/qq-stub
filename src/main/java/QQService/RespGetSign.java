package QQService;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

/* compiled from: P */
/* loaded from: classes.dex */
public final class RespGetSign extends JceStruct {
    static byte[] cache_vKey;
    static byte[] cache_vSign;
    public int iReplyCode;
    public long lUIN;
    public byte[] vKey;
    public byte[] vSign;

    public RespGetSign() {
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

    public RespGetSign(long j2, int i2, byte[] bArr, byte[] bArr2) {
        throw new RuntimeException("stub");
    }
}
