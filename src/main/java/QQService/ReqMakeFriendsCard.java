package QQService;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

/* compiled from: P */
/* loaded from: classes.dex */
public final class ReqMakeFriendsCard extends JceStruct {
    static ReqHead cache_stHeader;
    public byte bReqType;
    public ReqHead stHeader;
    public int uFaceTimeStamp;

    public ReqMakeFriendsCard() {
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

    public ReqMakeFriendsCard(ReqHead reqHead, byte b2, int i2) {
        throw new RuntimeException("stub");
    }
}
