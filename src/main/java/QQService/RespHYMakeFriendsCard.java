package QQService;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: P */
/* loaded from: classes.dex */
public final class RespHYMakeFriendsCard extends JceStruct {
    static RespHead cache_stHeader;
    static MakeFriendsCard cache_stMakeFriendsCard;
    static ArrayList<FaceInfo> cache_vFaceInfo;
    public byte bFavorited;
    public byte bQzoneInfo;
    public byte bShareLBS;
    public byte bVoted;
    public byte bWeiboInfo;
    public byte cSqqLevel;
    public int iLat;
    public int iLon;
    public int nSameFriendsNum;
    public RespHead stHeader;
    public MakeFriendsCard stMakeFriendsCard;
    public String strAddress;
    public String strCompany;
    public String strCustomTelNumber;
    public String strSchool;
    public ArrayList<FaceInfo> vFaceInfo;

    public RespHYMakeFriendsCard() {
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

    public RespHYMakeFriendsCard(RespHead respHead, MakeFriendsCard makeFriendsCard, byte b2, byte b3, int i2, String str, String str2, int i3, int i4, String str3, String str4, ArrayList<FaceInfo> arrayList, byte b4, byte b5, byte b6, byte b7) {
        throw new RuntimeException("stub");
    }
}
