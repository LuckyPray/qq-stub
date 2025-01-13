package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProQRCodeShareInfo.class */
public final class GProQRCodeShareInfo implements Serializable {
    static IPatchRedirector $redirector_;
    public String OnlineMembersCount;
    public long avTime;
    public String channelCopyWriter;
    public String feedLabel;
    public long feedNum;
    public long gameNum;
    public String guildLabel;
    public long liveNum;
    public String membersCount;
    long serialVersionUID;
    public String streamLabel;
    public String teamLabel;
    public String voiceLabel;

    public GProQRCodeShareInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.OnlineMembersCount = "";
        this.membersCount = "";
        this.guildLabel = "";
        this.channelCopyWriter = "";
        this.feedLabel = "";
        this.streamLabel = "";
        this.voiceLabel = "";
        this.teamLabel = "";
    }

    public long getAvTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.avTime : ((Long) iPatchRedirector.redirect((short) 8, this)).longValue();
    }

    public String getChannelCopyWriter() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.channelCopyWriter : (String) iPatchRedirector.redirect((short) 10, this);
    }

    public String getFeedLabel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.feedLabel : (String) iPatchRedirector.redirect((short) 11, this);
    }

    public long getFeedNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.feedNum : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public long getGameNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.gameNum : ((Long) iPatchRedirector.redirect((short) 6, this)).longValue();
    }

    public String getGuildLabel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.guildLabel : (String) iPatchRedirector.redirect((short) 9, this);
    }

    public long getLiveNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.liveNum : ((Long) iPatchRedirector.redirect((short) 7, this)).longValue();
    }

    public String getMembersCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.membersCount : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String getOnlineMembersCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.OnlineMembersCount : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String getStreamLabel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.streamLabel : (String) iPatchRedirector.redirect((short) 12, this);
    }

    public String getTeamLabel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) ? this.teamLabel : (String) iPatchRedirector.redirect((short) 14, this);
    }

    public String getVoiceLabel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.voiceLabel : (String) iPatchRedirector.redirect((short) 13, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 15)) {
            return (String) iPatchRedirector.redirect((short) 15, this);
        }
        return "GProQRCodeShareInfo{OnlineMembersCount=" + this.OnlineMembersCount + ",membersCount=" + this.membersCount + ",feedNum=" + this.feedNum + ",gameNum=" + this.gameNum + ",liveNum=" + this.liveNum + ",avTime=" + this.avTime + ",guildLabel=" + this.guildLabel + ",channelCopyWriter=" + this.channelCopyWriter + ",feedLabel=" + this.feedLabel + ",streamLabel=" + this.streamLabel + ",voiceLabel=" + this.voiceLabel + ",teamLabel=" + this.teamLabel + ",}";
    }

    public GProQRCodeShareInfo(String str, String str2, long j, long j2, long j3, long j4, String str3, String str4, String str5, String str6, String str7, String str8) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, str, str2, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), str3, str4, str5, str6, str7, str8);
            return;
        }
        this.serialVersionUID = 1L;
        this.OnlineMembersCount = "";
        this.membersCount = "";
        this.guildLabel = "";
        this.channelCopyWriter = "";
        this.feedLabel = "";
        this.streamLabel = "";
        this.voiceLabel = "";
        this.teamLabel = "";
        this.OnlineMembersCount = str;
        this.membersCount = str2;
        this.feedNum = j;
        this.gameNum = j2;
        this.liveNum = j3;
        this.avTime = j4;
        this.guildLabel = str3;
        this.channelCopyWriter = str4;
        this.feedLabel = str5;
        this.streamLabel = str6;
        this.voiceLabel = str7;
        this.teamLabel = str8;
    }
}
