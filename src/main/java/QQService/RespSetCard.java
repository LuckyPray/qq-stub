package QQService;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

/* compiled from: P */
/* loaded from: classes.dex */
public final class RespSetCard extends JceStruct {
    static int cache_eSubCmd;
    static RespHead cache_stHeader;
    static byte[] cache_vRespSetTemplate;
    public int eSubCmd;
    public RespHead stHeader;
    public byte[] vRespSetTemplate;

    public RespSetCard() {
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

    public RespSetCard(RespHead respHead, int i2, byte[] bArr) {
        throw new RuntimeException("stub");
    }
}
