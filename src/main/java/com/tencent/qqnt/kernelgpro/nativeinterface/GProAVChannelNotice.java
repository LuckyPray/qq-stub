package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProAVChannelNotice.class */
public final class GProAVChannelNotice {
    static IPatchRedirector $redirector_;
    public long appId;
    public long channelId;
    public long guildId;
    public long noticeId;
    public GProAVChannelNoticeMemberInfo notifyMemberInfo;
    public byte[] resultItem;
    public long roomId;
    public long timeStamp;
    public byte[] voiceChannelInfo;

    public GProAVChannelNotice() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.voiceChannelInfo = new byte[0];
        this.resultItem = new byte[0];
        this.notifyMemberInfo = new GProAVChannelNoticeMemberInfo();
    }

    public long getAppId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.appId : ((Long) iPatchRedirector.redirect((short) 6, this)).longValue();
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public long getNoticeId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.noticeId : ((Long) iPatchRedirector.redirect((short) 2, this)).longValue();
    }

    public GProAVChannelNoticeMemberInfo getNotifyMemberInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.notifyMemberInfo : (GProAVChannelNoticeMemberInfo) iPatchRedirector.redirect((short) 10, this);
    }

    public byte[] getResultItem() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.resultItem : (byte[]) iPatchRedirector.redirect((short) 9, this);
    }

    public long getRoomId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.roomId : ((Long) iPatchRedirector.redirect((short) 7, this)).longValue();
    }

    public long getTimeStamp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.timeStamp : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public byte[] getVoiceChannelInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.voiceChannelInfo : (byte[]) iPatchRedirector.redirect((short) 8, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 11)) {
            return (String) iPatchRedirector.redirect((short) 11, this);
        }
        return "GProAVChannelNotice{noticeId=" + this.noticeId + ",timeStamp=" + this.timeStamp + ",guildId=" + this.guildId + ",channelId=" + this.channelId + ",appId=" + this.appId + ",roomId=" + this.roomId + ",voiceChannelInfo=" + this.voiceChannelInfo + ",resultItem=" + this.resultItem + ",notifyMemberInfo=" + this.notifyMemberInfo + ",}";
    }
}
