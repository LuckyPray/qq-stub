package QQService;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: P */
/* loaded from: classes.dex */
public final class CommonCard extends JceStruct {
    static int cache_eUserIdentityType;
    static byte[] cache_vBackground;
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
    public String strCompany;
    public String strNick;
    public String strSchool;
    public String strSign;
    public int uFaceTimeStamp;
    public byte[] vBackground;
    public ArrayList<TagInfo> vTags;

    public CommonCard() {
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

    public CommonCard(String str, short s, short s2, int i2, String str2, String str3, String str4, int i3, byte b2, long j2, long j3, ArrayList<TagInfo> arrayList, int i4, byte[] bArr, int i5, long j4, int i6) {
        throw new RuntimeException("stub");
    }
}
