package QQService;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

/* loaded from: classes.dex */
public final class UserProfile extends JceStruct {
    static int cache_eUserIdentityType;
    static VipBaseInfo cache_stVipInfo = new VipBaseInfo();
    static byte[] cache_vC2CSign;
    static byte[] cache_vFaceID;
    static byte[] cache_vIntroContent;
    static byte[] cache_vRichSign;
    public byte bAge;
    public short bAvailableCnt;
    public short bCloseNeighborVote;
    public byte bConstellation;
    public byte bFavorited;
    public byte bFavoritedMe;
    public short bIsLastVoteCharged;
    public short bMutualFriends;
    public byte bSex;
    public byte bSingle;
    public short bTodayVotedCnt;
    public short bTollVoteCnt;
    public byte bVote;
    public short bVoteCnt;
    public long dwLikeCustomId;
    public int eUserIdentityType;
    public long lEctID;
    public int lTime;
    public int nFaceNum;
    public short shIntroType;
    public VipBaseInfo stVipInfo;
    public String strNick;
    public long uSource;
    public byte[] vC2CSign;
    public byte[] vFaceID;
    public byte[] vIntroContent;
    public byte[] vRichSign;
    public short wFace;

    public UserProfile() {
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

    public UserProfile(long j2, int i2, short s, byte b2, byte b3, String str, int i3, int i4, short s2, byte[] bArr, byte[] bArr2, byte b4, byte b5, byte b6, byte b7, byte[] bArr3, byte b8, VipBaseInfo vipBaseInfo, byte[] bArr4, short s3, long j3, short s4, short s5, short s6, long j4, short s7, short s8, short s9) {
        throw new RuntimeException("stub");
    }
}
