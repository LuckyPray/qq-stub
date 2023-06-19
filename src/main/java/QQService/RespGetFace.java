package QQService;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: P */
/* loaded from: classes.dex */
public final class RespGetFace extends JceStruct {
    static RespHead cache_stHeader;
    static UserCntlData cache_stUserData;
    static ArrayList<FaceInfo> cache_vFaceInfo;
    public RespHead stHeader;
    public UserCntlData stUserData;
    public ArrayList<FaceInfo> vFaceInfo;

    public RespGetFace() {
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

    public RespGetFace(RespHead respHead, UserCntlData userCntlData, ArrayList<FaceInfo> arrayList) {
        throw new RuntimeException("stub");
    }
}
