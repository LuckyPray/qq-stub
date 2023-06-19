package QQService;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

/* compiled from: P */
/* loaded from: classes.dex */
public final class ReqGetSign extends JceStruct {
    static byte[] cache_vA2;
    static byte[] cache_vCiphertext;
    public byte cA2Type;
    public long lUIN;
    public long uAppID;
    public long uSSOVer;
    public byte[] vA2;
    public byte[] vCiphertext;

    public ReqGetSign() {
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

    public ReqGetSign(long j2, long j3, long j4, byte b2, byte[] bArr, byte[] bArr2) {
        throw new RuntimeException("stub");
    }
}
