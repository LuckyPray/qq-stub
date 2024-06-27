package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProYLGameTeamInfo.class */
public final class GProYLGameTeamInfo {
    static IPatchRedirector $redirector_;
    public long channelId;
    public int curMemmberNum;
    public String gameAppid;
    public String gameEnvVersion;
    public String gameExtraData;
    public int gameId;
    public String gamePath;
    public long guildId;
    public String icon;
    public boolean isPk;
    public int modeId;
    public long readyExpireTime;
    public long teamId;
    public int teamStatus;
    public int totalMemberNum;

    public GProYLGameTeamInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.icon = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.gameAppid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.gamePath = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.gameExtraData = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.gameEnvVersion = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public int getCurMemmberNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.curMemmberNum : ((Integer) iPatchRedirector.redirect((short) 10, this)).intValue();
    }

    public String getGameAppid() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.gameAppid : (String) iPatchRedirector.redirect((short) 12, this);
    }

    public String getGameEnvVersion() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) ? this.gameEnvVersion : (String) iPatchRedirector.redirect((short) 15, this);
    }

    public String getGameExtraData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) ? this.gameExtraData : (String) iPatchRedirector.redirect((short) 14, this);
    }

    public int getGameId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.gameId : ((Integer) iPatchRedirector.redirect((short) 11, this)).intValue();
    }

    public String getGamePath() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.gamePath : (String) iPatchRedirector.redirect((short) 13, this);
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public String getIcon() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.icon : (String) iPatchRedirector.redirect((short) 8, this);
    }

    public boolean getIsPk() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 17)) ? this.isPk : ((Boolean) iPatchRedirector.redirect((short) 17, this)).booleanValue();
    }

    public int getModeId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 16)) ? this.modeId : ((Integer) iPatchRedirector.redirect((short) 16, this)).intValue();
    }

    public long getReadyExpireTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.readyExpireTime : ((Long) iPatchRedirector.redirect((short) 7, this)).longValue();
    }

    public long getTeamId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.teamId : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public int getTeamStatus() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.teamStatus : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public int getTotalMemberNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.totalMemberNum : ((Integer) iPatchRedirector.redirect((short) 9, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 18)) {
            return (String) iPatchRedirector.redirect((short) 18, this);
        }
        return "GProYLGameTeamInfo{guildId=" + this.guildId + ",channelId=" + this.channelId + ",teamId=" + this.teamId + ",teamStatus=" + this.teamStatus + ",readyExpireTime=" + this.readyExpireTime + ",icon=" + this.icon + ",totalMemberNum=" + this.totalMemberNum + ",curMemmberNum=" + this.curMemmberNum + ",gameId=" + this.gameId + ",gameAppid=" + this.gameAppid + ",gamePath=" + this.gamePath + ",gameExtraData=" + this.gameExtraData + ",gameEnvVersion=" + this.gameEnvVersion + ",modeId=" + this.modeId + ",isPk=" + this.isPk + ",}";
    }

    public GProYLGameTeamInfo(long j, long j2, long j3, int i, long j4, String str, int i2, int i3, int i4, String str2, String str3, String str4, String str5, int i5, boolean z) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Integer.valueOf(i), Long.valueOf(j4), str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str2, str3, str4, str5, Integer.valueOf(i5), Boolean.valueOf(z)});
            return;
        }
        this.icon = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.gameAppid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.gamePath = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.gameExtraData = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.gameEnvVersion = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.guildId = j;
        this.channelId = j2;
        this.teamId = j3;
        this.teamStatus = i;
        this.readyExpireTime = j4;
        this.icon = str;
        this.totalMemberNum = i2;
        this.curMemmberNum = i3;
        this.gameId = i4;
        this.gameAppid = str2;
        this.gamePath = str3;
        this.gameExtraData = str4;
        this.gameEnvVersion = str5;
        this.modeId = i5;
        this.isPk = z;
    }
}
