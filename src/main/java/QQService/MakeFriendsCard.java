package QQService;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: P */
/* loaded from: classes.dex */
public final class MakeFriendsCard extends JceStruct {
    static int cache_eUserIdentityType;
    static Intro cache_stIntro;
    static byte[] cache_vBackground;
    static byte[] cache_vQQFaceID;
    static ArrayList<TagInfo> cache_vTags;
    public byte bSingle;
    public int eUserIdentityType;
    public int iFaceNum;
    public int iQQLevel;
    public long lFavoriteCount;
    public long lVisitCount;
    public long lVoteCount;
    public int nFaceID;
    public short shAge;
    public short shGender;
    public Intro stIntro;
    public String strCertificationInfo;
    public String strNick;
    public int uFaceTimeStamp;
    public byte[] vBackground;
    public byte[] vQQFaceID;
    public ArrayList<TagInfo> vTags;

    public MakeFriendsCard() {
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

    public MakeFriendsCard(String str, short s, short s2, int i2, String str2, Intro intro, int i3, byte[] bArr, byte b2, long j2, long j3, ArrayList<TagInfo> arrayList, int i4, byte[] bArr2, int i5, long j4, int i6) {
        throw new RuntimeException("stub");
    }
}
