package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProQQMsgListChannel.class */
public final class GProQQMsgListChannel {
    static IPatchRedirector $redirector_;
    public long appid;
    public long avatarSeq;
    public long channelId;
    public String channelName;
    public int channelType;
    public long guildId;
    public String guildName;
    public long topTimestamp;

    public GProQQMsgListChannel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.guildName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
            this.channelName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        }
    }

    public long getAppid() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.appid : ((Long) iPatchRedirector.redirect((short) 10, this)).longValue();
    }

    public long getAvatarSeq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.avatarSeq : ((Long) iPatchRedirector.redirect((short) 8, this)).longValue();
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public String getChannelName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.channelName : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public int getChannelType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.channelType : ((Integer) iPatchRedirector.redirect((short) 9, this)).intValue();
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public String getGuildName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.guildName : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public long getTopTimestamp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.topTimestamp : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 11)) {
            return (String) iPatchRedirector.redirect((short) 11, this);
        }
        return "GProQQMsgListChannel{guildId=" + this.guildId + ",channelId=" + this.channelId + ",topTimestamp=" + this.topTimestamp + ",guildName=" + this.guildName + ",channelName=" + this.channelName + ",avatarSeq=" + this.avatarSeq + ",channelType=" + this.channelType + ",appid=" + this.appid + ",}";
    }

    public GProQQMsgListChannel(long j, long j2, long j3, String str, String str2, long j4, int i, long j5) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), str, str2, Long.valueOf(j4), Integer.valueOf(i), Long.valueOf(j5)});
            return;
        }
        this.guildName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.channelName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.guildId = j;
        this.channelId = j2;
        this.topTimestamp = j3;
        this.guildName = str;
        this.channelName = str2;
        this.avatarSeq = j4;
        this.channelType = i;
        this.appid = j5;
    }
}
