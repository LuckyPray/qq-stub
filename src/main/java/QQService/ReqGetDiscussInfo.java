package QQService;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import java.util.HashMap;
import java.util.Map;

/* compiled from: P */
/* loaded from: classes.dex */
public final class ReqGetDiscussInfo extends JceStruct {
    static Map<Long, Integer> cache_UinList;
    public long DiscussUin;
    public long InfoSeq;
    public long InteRemarkTimeStamp;
    public String Signature;
    public Map<Long, Integer> UinList;

    public ReqGetDiscussInfo() {
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

    public ReqGetDiscussInfo(long j2, long j3, Map<Long, Integer> map, long j4, String str) {
        throw new RuntimeException("stub");
    }
}
