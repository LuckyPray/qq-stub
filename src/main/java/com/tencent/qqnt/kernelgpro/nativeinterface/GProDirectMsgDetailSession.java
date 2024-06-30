package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProDirectMsgDetailSession.class */
public final class GProDirectMsgDetailSession {
    static IPatchRedirector $redirector_;
    public long channelId;
    public long createTime;
    public long guildId;
    public long lastCntSeq;
    public long lastCntTime;
    public long lastMsgSeq;
    public long lastMsgTime;
    public long msgEventTime;
    public int msgNotifyType;
    public long myReadCntSeq;
    public long myReadCntTime;
    public long myReadMsgSeq;
    public long myReadMsgTime;
    public long srcGuildId;
    public String srcGuildName;
    public String srcMemberName;
    public int srcMemberType;
    public String srcNickName;
    public long srcTinyId;

    public GProDirectMsgDetailSession() {
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
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public long getCreateTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 20)) ? this.createTime : ((Long) iPatchRedirector.redirect((short) 20, this)).longValue();
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 2, this)).longValue();
    }

    public long getLastCntSeq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.lastCntSeq : ((Long) iPatchRedirector.redirect((short) 11, this)).longValue();
    }

    public long getLastCntTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.lastCntTime : ((Long) iPatchRedirector.redirect((short) 12, this)).longValue();
    }

    public long getLastMsgSeq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.lastMsgSeq : ((Long) iPatchRedirector.redirect((short) 9, this)).longValue();
    }

    public long getLastMsgTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.lastMsgTime : ((Long) iPatchRedirector.redirect((short) 10, this)).longValue();
    }

    public long getMsgEventTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 19)) ? this.msgEventTime : ((Long) iPatchRedirector.redirect((short) 19, this)).longValue();
    }

    public int getMsgNotifyType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.msgNotifyType : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public long getMyReadCntSeq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.myReadCntSeq : ((Long) iPatchRedirector.redirect((short) 7, this)).longValue();
    }

    public long getMyReadCntTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.myReadCntTime : ((Long) iPatchRedirector.redirect((short) 8, this)).longValue();
    }

    public long getMyReadMsgSeq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.myReadMsgSeq : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public long getMyReadMsgTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.myReadMsgTime : ((Long) iPatchRedirector.redirect((short) 6, this)).longValue();
    }

    public long getSrcGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) ? this.srcGuildId : ((Long) iPatchRedirector.redirect((short) 14, this)).longValue();
    }

    public String getSrcGuildName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) ? this.srcGuildName : (String) iPatchRedirector.redirect((short) 15, this);
    }

    public String getSrcMemberName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 16)) ? this.srcMemberName : (String) iPatchRedirector.redirect((short) 16, this);
    }

    public int getSrcMemberType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 18)) ? this.srcMemberType : ((Integer) iPatchRedirector.redirect((short) 18, this)).intValue();
    }

    public String getSrcNickName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 17)) ? this.srcNickName : (String) iPatchRedirector.redirect((short) 17, this);
    }

    public long getSrcTinyId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.srcTinyId : ((Long) iPatchRedirector.redirect((short) 13, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 21)) {
            return (String) iPatchRedirector.redirect((short) 21, this);
        }
        return "GProDirectMsgDetailSession{guildId=" + this.guildId + ",channelId=" + this.channelId + ",msgNotifyType=" + this.msgNotifyType + ",myReadMsgSeq=" + this.myReadMsgSeq + ",myReadMsgTime=" + this.myReadMsgTime + ",myReadCntSeq=" + this.myReadCntSeq + ",myReadCntTime=" + this.myReadCntTime + ",lastMsgSeq=" + this.lastMsgSeq + ",lastMsgTime=" + this.lastMsgTime + ",lastCntSeq=" + this.lastCntSeq + ",lastCntTime=" + this.lastCntTime + ",srcTinyId=" + this.srcTinyId + ",srcGuildId=" + this.srcGuildId + ",srcGuildName=" + this.srcGuildName + ",srcMemberName=" + this.srcMemberName + ",srcNickName=" + this.srcNickName + ",srcMemberType=" + this.srcMemberType + ",msgEventTime=" + this.msgEventTime + ",createTime=" + this.createTime + ",}";
    }
}
