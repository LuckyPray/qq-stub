package QQService;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: P */
/* loaded from: classes.dex */
public final class RespCommonCard extends JceStruct {
    static CommonCard cache_stCommonCard;
    static RespHead cache_stHeader;
    static ArrayList<FaceInfo> cache_vFaceInfo;
    static byte[] cache_vQQFaceID;
    static ArrayList<Visitor> cache_vVisitors;
    static ArrayList<Visitor> cache_vVoter;
    public byte bShareLBS;
    public byte cSqqLevel;
    public int iVoteIncrement;
    public int lListVoterTime;
    public CommonCard stCommonCard;
    public RespHead stHeader;
    public ArrayList<FaceInfo> vFaceInfo;
    public byte[] vQQFaceID;
    public ArrayList<Visitor> vVisitors;
    public ArrayList<Visitor> vVoter;

    public RespCommonCard() {
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

    public RespCommonCard(RespHead respHead, CommonCard commonCard, byte[] bArr, ArrayList<FaceInfo> arrayList, int i2, ArrayList<Visitor> arrayList2, ArrayList<Visitor> arrayList3, int i3, byte b2, byte b3) {
        throw new RuntimeException("stub");
    }
}
