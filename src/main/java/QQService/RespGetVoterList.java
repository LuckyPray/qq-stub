package QQService;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: P */
/* loaded from: classes.dex */
public final class RespGetVoterList extends JceStruct {
    static UserCntlData cache_stUserData;
    static ArrayList<UserProfile> cache_vTodayFavoriteInfos;
    public long RespTime;
    public int iMaxFriendFavoriteCount;
    public int iMaxStrangerFavoriteCount;
    public int iTodayVoteCount;
    public int iTodayVoteRank;
    public int iTotalVoteCount;
    public RespHead stHeader;
    public UserCntlData stUserData;
    public ArrayList<UserProfile> vTodayFavoriteInfos;
    public ArrayList<UserProfile> vVoterInfos;
    static RespHead cache_stHeader = new RespHead();
    static ArrayList<UserProfile> cache_vVoterInfos = new ArrayList<>();

    static {
        cache_vVoterInfos.add(new UserProfile());
        cache_stUserData = new UserCntlData();
        cache_vTodayFavoriteInfos = new ArrayList<>();
        cache_vTodayFavoriteInfos.add(new UserProfile());
    }

    public RespGetVoterList() {
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

    public RespGetVoterList(RespHead respHead, long j2, ArrayList<UserProfile> arrayList, UserCntlData userCntlData, ArrayList<UserProfile> arrayList2, int i2, int i3, int i4, int i5, int i6) {
        throw new RuntimeException("stub");
    }
}
