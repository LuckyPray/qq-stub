package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProAudioBotStatusInfo.class */
public final class GProAudioBotStatusInfo {
    static IPatchRedirector $redirector_;
    public long botId;
    public long botTrtcId;
    public long botUin;
    public long channelId;
    public int detailType;
    public String detailUrl;
    public String statusText;
    public int statusType;

    public GProAudioBotStatusInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.statusText = "";
            this.detailUrl = "";
        }
    }

    public long getBotId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.botId : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public long getBotTrtcId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.botTrtcId : ((Long) iPatchRedirector.redirect((short) 10, this)).longValue();
    }

    public long getBotUin() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.botUin : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public int getDetailType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.detailType : ((Integer) iPatchRedirector.redirect((short) 9, this)).intValue();
    }

    public String getDetailUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.detailUrl : (String) iPatchRedirector.redirect((short) 8, this);
    }

    public String getStatusText() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.statusText : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public int getStatusType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.statusType : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 11)) {
            return (String) iPatchRedirector.redirect((short) 11, this);
        }
        return "GProAudioBotStatusInfo{channelId=" + this.channelId + ",botId=" + this.botId + ",botUin=" + this.botUin + ",statusType=" + this.statusType + ",statusText=" + this.statusText + ",detailUrl=" + this.detailUrl + ",detailType=" + this.detailType + ",botTrtcId=" + this.botTrtcId + ",}";
    }

    public GProAudioBotStatusInfo(long j, long j2, long j3, int i, String str, String str2, int i2, long j4) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Integer.valueOf(i), str, str2, Integer.valueOf(i2), Long.valueOf(j4)});
            return;
        }
        this.statusText = "";
        this.detailUrl = "";
        this.channelId = j;
        this.botId = j2;
        this.botUin = j3;
        this.statusType = i;
        this.statusText = str;
        this.detailUrl = str2;
        this.detailType = i2;
        this.botTrtcId = j4;
    }
}
