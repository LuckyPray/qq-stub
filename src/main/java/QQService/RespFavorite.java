package QQService;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

/* compiled from: P */
/* loaded from: classes.dex */
public final class RespFavorite extends JceStruct {
    static RespHead cache_stHeader;
    static byte[] cache_vNotice;
    public byte cOpType;
    public int iKoiLikeCount;
    public long lMID;
    public RespHead stHeader;
    public byte[] vNotice;

    public RespFavorite() {
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

    public RespFavorite(RespHead respHead, long j2, byte b2, byte[] bArr, int i2) {
        throw new RuntimeException("stub");
    }
}
