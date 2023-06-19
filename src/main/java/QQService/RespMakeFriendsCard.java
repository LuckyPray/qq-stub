package QQService;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: P */
/* loaded from: classes.dex */
public final class RespMakeFriendsCard extends JceStruct {
    static RespHead cache_stHeader;
    static MakeFriendsCard cache_stMakeFriendsCard;
    static ArrayList<FaceInfo> cache_vFaceInfo;
    static ArrayList<Visitor> cache_vVisitors;
    static ArrayList<Visitor> cache_vVoter;
    public byte bShareLBS;
    public byte cSqqLevel;
    public int iVoteIncrement;
    public long lCardShowNum;
    public int lListVoterTime;
    public RespHead stHeader;
    public MakeFriendsCard stMakeFriendsCard;
    public ArrayList<FaceInfo> vFaceInfo;
    public ArrayList<Visitor> vVisitors;
    public ArrayList<Visitor> vVoter;

    public RespMakeFriendsCard() {
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

    public RespMakeFriendsCard(RespHead respHead, MakeFriendsCard makeFriendsCard, long j2, ArrayList<FaceInfo> arrayList, int i2, ArrayList<Visitor> arrayList2, ArrayList<Visitor> arrayList3, int i3, byte b2, byte b3) {
        throw new RuntimeException("stub");
    }
}
