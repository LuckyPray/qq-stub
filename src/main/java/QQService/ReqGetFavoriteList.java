package QQService;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

/* compiled from: P */
/* loaded from: classes.dex */
public final class ReqGetFavoriteList extends JceStruct {
    static ReqHead cache_stHeader;
    static UserCntlData cache_stUserData;
    public int iPageSize;
    public ReqHead stHeader;
    public UserCntlData stUserData;

    public ReqGetFavoriteList() {
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

    public ReqGetFavoriteList(ReqHead reqHead, UserCntlData userCntlData, int i2) {
        throw new RuntimeException("stub");
    }
}
