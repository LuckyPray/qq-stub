package QQService;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import java.util.HashMap;
import java.util.Map;

/* compiled from: P */
/* loaded from: classes.dex */
public final class RespGetDiscussInteRemark extends JceStruct {
    static Map<Long, InteRemarkInfo> cache_InteRemarks;
    public String DiscussName;
    public long DiscussUin;
    public Map<Long, InteRemarkInfo> InteRemarks;

    public RespGetDiscussInteRemark() {
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

    public RespGetDiscussInteRemark(long j2, Map<Long, InteRemarkInfo> map, String str) {
        throw new RuntimeException("stub");
    }
}
