package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProDirectMsgCreateInfo.class */
public final class GProDirectMsgCreateInfo {
    static IPatchRedirector $redirector_;
    public int channelType;
    public int msgNotifyType;
    public long msgTime;
    public long srcGuildId;
    public String srcGuildName;
    public String srcMemberName;
    public String srcNickName;
    public long srcTinyId;

    public GProDirectMsgCreateInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.srcGuildName = "";
        this.srcMemberName = "";
        this.srcNickName = "";
    }

    public int getChannelType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.channelType : ((Integer) iPatchRedirector.redirect((short) 10, this)).intValue();
    }

    public int getMsgNotifyType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.msgNotifyType : ((Integer) iPatchRedirector.redirect((short) 9, this)).intValue();
    }

    public long getMsgTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.msgTime : ((Long) iPatchRedirector.redirect((short) 8, this)).longValue();
    }

    public long getSrcGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.srcGuildId : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public String getSrcGuildName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.srcGuildName : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String getSrcMemberName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.srcMemberName : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public String getSrcNickName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.srcNickName : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public long getSrcTinyId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.srcTinyId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 11)) {
            return (String) iPatchRedirector.redirect((short) 11, this);
        }
        return "GProDirectMsgCreateInfo{srcTinyId=" + this.srcTinyId + ",srcGuildId=" + this.srcGuildId + ",srcGuildName=" + this.srcGuildName + ",srcMemberName=" + this.srcMemberName + ",srcNickName=" + this.srcNickName + ",msgTime=" + this.msgTime + ",msgNotifyType=" + this.msgNotifyType + ",channelType=" + this.channelType + ",}";
    }

    public GProDirectMsgCreateInfo(long j, long j2, String str, String str2, String str3, long j3, int i, int i2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, Long.valueOf(j), Long.valueOf(j2), str, str2, str3, Long.valueOf(j3), Integer.valueOf(i), Integer.valueOf(i2));
            return;
        }
        this.srcGuildName = "";
        this.srcMemberName = "";
        this.srcNickName = "";
        this.srcTinyId = j;
        this.srcGuildId = j2;
        this.srcGuildName = str;
        this.srcMemberName = str2;
        this.srcNickName = str3;
        this.msgTime = j3;
        this.msgNotifyType = i;
        this.channelType = i2;
    }
}
