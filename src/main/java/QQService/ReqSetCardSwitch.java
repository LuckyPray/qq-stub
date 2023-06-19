package QQService;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

/* compiled from: P */
/* loaded from: classes.dex */
public final class ReqSetCardSwitch extends JceStruct {
    static ReqHead cache_stHeader;
    public ReqHead stHeader;
    public long uCloseNeighborVote;
    public long uCloseTimeGateVote;

    public ReqSetCardSwitch() {
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

    public ReqSetCardSwitch(ReqHead reqHead, long j2, long j3) {
        throw new RuntimeException("stub");
    }
}
