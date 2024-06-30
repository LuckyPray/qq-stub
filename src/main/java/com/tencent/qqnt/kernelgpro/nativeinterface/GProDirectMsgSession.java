package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProDirectMsgSession.class */
public final class GProDirectMsgSession {
    static IPatchRedirector $redirector_;
    public long channelId;
    public int channelType;
    public long guildId;
    public int msgNotifyType;
    public long msgTime;
    public int peerMemberType;
    public long srcGuildId;
    public String srcGuildName;
    public String srcMemberName;
    public String srcNickName;
    public long srcTinyId;

    public GProDirectMsgSession() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.srcGuildName = "";
        this.srcMemberName = "";
        this.srcNickName = "";
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public int getChannelType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.channelType : ((Integer) iPatchRedirector.redirect((short) 8, this)).intValue();
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public int getMsgNotifyType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.msgNotifyType : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public long getMsgTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.msgTime : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public int getPeerMemberType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.peerMemberType : ((Integer) iPatchRedirector.redirect((short) 7, this)).intValue();
    }

    public long getSrcGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.srcGuildId : ((Long) iPatchRedirector.redirect((short) 10, this)).longValue();
    }

    public String getSrcGuildName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.srcGuildName : (String) iPatchRedirector.redirect((short) 11, this);
    }

    public String getSrcMemberName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.srcMemberName : (String) iPatchRedirector.redirect((short) 12, this);
    }

    public String getSrcNickName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.srcNickName : (String) iPatchRedirector.redirect((short) 13, this);
    }

    public long getSrcTinyId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.srcTinyId : ((Long) iPatchRedirector.redirect((short) 9, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 14)) {
            return (String) iPatchRedirector.redirect((short) 14, this);
        }
        return "GProDirectMsgSession{guildId=" + this.guildId + ",channelId=" + this.channelId + ",msgTime=" + this.msgTime + ",msgNotifyType=" + this.msgNotifyType + ",peerMemberType=" + this.peerMemberType + ",channelType=" + this.channelType + ",srcTinyId=" + this.srcTinyId + ",srcGuildId=" + this.srcGuildId + ",srcGuildName=" + this.srcGuildName + ",srcMemberName=" + this.srcMemberName + ",srcNickName=" + this.srcNickName + ",}";
    }

    public GProDirectMsgSession(long j, long j2, long j3, int i, int i2, int i3, long j4, long j5, String str, String str2, String str3) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Long.valueOf(j4), Long.valueOf(j5), str, str2, str3});
            return;
        }
        this.srcGuildName = "";
        this.srcMemberName = "";
        this.srcNickName = "";
        this.guildId = j;
        this.channelId = j2;
        this.msgTime = j3;
        this.msgNotifyType = i;
        this.peerMemberType = i2;
        this.channelType = i3;
        this.srcTinyId = j4;
        this.srcGuildId = j5;
        this.srcGuildName = str;
        this.srcMemberName = str2;
        this.srcNickName = str3;
    }
}
