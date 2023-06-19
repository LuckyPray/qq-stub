package QQService;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

/* compiled from: P */
/* loaded from: classes.dex */
public final class RespSetCardSwitch extends JceStruct {
    static RespHead cache_stHeader;
    public RespHead stHeader;
    public long uCloseNeighborVote;
    public long uCloseTimeGateVote;

    public RespSetCardSwitch() {
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

    public RespSetCardSwitch(RespHead respHead, long j2, long j3) {
        throw new RuntimeException("stub");
    }
}
