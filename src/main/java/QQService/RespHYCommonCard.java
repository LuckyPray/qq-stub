package QQService;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: P */
/* loaded from: classes.dex */
public final class RespHYCommonCard extends JceStruct {
    static CommonCard cache_stCommonCard;
    static RespHead cache_stHeader;
    static ArrayList<FaceInfo> cache_vFaceInfo;
    static byte[] cache_vQQFaceID;
    public byte bFavorited;
    public byte bQzoneInfo;
    public byte bShareLBS;
    public byte bVoted;
    public byte bWeiboInfo;
    public byte cSqqLevel;
    public CommonCard stCommonCard;
    public RespHead stHeader;
    public String strReMark;
    public ArrayList<FaceInfo> vFaceInfo;
    public byte[] vQQFaceID;

    public RespHYCommonCard() {
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

    public RespHYCommonCard(RespHead respHead, CommonCard commonCard, String str, byte b2, byte b3, ArrayList<FaceInfo> arrayList, byte b4, byte b5, byte b6, byte[] bArr, byte b7) {
        throw new RuntimeException("stub");
    }
}
