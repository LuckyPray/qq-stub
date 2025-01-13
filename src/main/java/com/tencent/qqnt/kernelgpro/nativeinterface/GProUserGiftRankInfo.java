package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProUserGiftRankInfo.class */
public final class GProUserGiftRankInfo implements Serializable {
    static IPatchRedirector $redirector_;
    public long channelId;
    public long guildId;
    public String jumpUrl;
    public String rankInfo;
    long serialVersionUID;
    public int topNum;
    public GProUser userInfo;

    public GProUserGiftRankInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.userInfo = new GProUser();
        this.rankInfo = "";
        this.jumpUrl = "";
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public String getJumpUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.jumpUrl : (String) iPatchRedirector.redirect((short) 8, this);
    }

    public String getRankInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.rankInfo : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public int getTopNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.topNum : ((Integer) iPatchRedirector.redirect((short) 7, this)).intValue();
    }

    public GProUser getUserInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.userInfo : (GProUser) iPatchRedirector.redirect((short) 5, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
            return (String) iPatchRedirector.redirect((short) 9, this);
        }
        return "GProUserGiftRankInfo{guildId=" + this.guildId + ",channelId=" + this.channelId + ",userInfo=" + this.userInfo + ",rankInfo=" + this.rankInfo + ",topNum=" + this.topNum + ",jumpUrl=" + this.jumpUrl + ",}";
    }

    public GProUserGiftRankInfo(long j, long j2, GProUser gProUser, String str, int i, String str2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, Long.valueOf(j), Long.valueOf(j2), gProUser, str, Integer.valueOf(i), str2);
            return;
        }
        this.serialVersionUID = 1L;
        this.userInfo = new GProUser();
        this.rankInfo = "";
        this.jumpUrl = "";
        this.guildId = j;
        this.channelId = j2;
        this.userInfo = gProUser;
        this.rankInfo = str;
        this.topNum = i;
        this.jumpUrl = str2;
    }
}
