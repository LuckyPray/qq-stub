package QQService;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import java.util.HashMap;
import java.util.Map;

/* compiled from: P */
/* loaded from: classes.dex */
public final class DiscussMemberInfo extends JceStruct {
    static Map<Integer, MemberAttrInfo> cache_Attr;
    static InteRemarkInfo cache_StInteRemark;
    public Map<Integer, MemberAttrInfo> Attr;
    public byte Flag;
    public InteRemarkInfo StInteRemark;
    public long Uin;

    public DiscussMemberInfo() {
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

    public DiscussMemberInfo(long j2, byte b2, Map<Integer, MemberAttrInfo> map, InteRemarkInfo inteRemarkInfo) {
        throw new RuntimeException("stub");
    }
}
