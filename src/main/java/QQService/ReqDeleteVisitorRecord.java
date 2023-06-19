package QQService;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

/* compiled from: P */
/* loaded from: classes.dex */
public final class ReqDeleteVisitorRecord extends JceStruct {
    public int cRecordType;
    public long lTargetUin;
    public ReqHead stHeader;
    static ReqHead cache_stHeader = new ReqHead();
    static int cache_cRecordType = 0;

    public ReqDeleteVisitorRecord() {
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

    public ReqDeleteVisitorRecord(ReqHead reqHead, long j2, int i2) {
        throw new RuntimeException("stub");
    }
}
