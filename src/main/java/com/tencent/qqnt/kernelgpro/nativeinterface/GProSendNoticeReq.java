package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProSendNoticeReq.class */
public final class GProSendNoticeReq {
    static IPatchRedirector $redirector_;
    public long appId;
    public String authMeta;
    public long channelId;
    public long guildId;
    public GProAVChannelNoticeMemberInfo notifyMemberInfo;
    public long roomId;

    public GProSendNoticeReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.authMeta = "";
            this.notifyMemberInfo = new GProAVChannelNoticeMemberInfo();
        }
    }

    public long getAppId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.appId : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public String getAuthMeta() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.authMeta : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 2, this)).longValue();
    }

    public GProAVChannelNoticeMemberInfo getNotifyMemberInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.notifyMemberInfo : (GProAVChannelNoticeMemberInfo) iPatchRedirector.redirect((short) 7, this);
    }

    public long getRoomId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.roomId : ((Long) iPatchRedirector.redirect((short) 6, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 8)) {
            return (String) iPatchRedirector.redirect((short) 8, this);
        }
        return "GProSendNoticeReq{guildId=" + this.guildId + ",channelId=" + this.channelId + ",authMeta=" + this.authMeta + ",appId=" + this.appId + ",roomId=" + this.roomId + ",notifyMemberInfo=" + this.notifyMemberInfo + ",}";
    }
}
