package QQService;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

/* compiled from: P */
/* loaded from: classes.dex */
public final class ReqFavorite extends JceStruct {
    public int cOpType;
    public int emSource;
    public int iCount;
    public int iHasZplanAvatar;
    public long lMID;
    public ReqHead stHeader;
    static ReqHead cache_stHeader = new ReqHead();
    static int cache_cOpType = 0;
    static int cache_emSource = 0;

    public ReqFavorite() {
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

    public ReqFavorite(ReqHead reqHead, long j2, int i2, int i3, int i4, int i5) {
        throw new RuntimeException("stub");
    }
}
